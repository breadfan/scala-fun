package prep2

object cake_16 {
  case class User(id: Int, name: String)

  trait UserRepository {
    def loadUser(id: Int): User
  }

  trait UserService {
    def loadAndValidateUser(id: Int): User
  }

  trait UserRepositoryComponent {
    def userRepository: UserRepository

    class MysqlUserRepository extends UserRepository {
      override def loadUser(id: Int): User = {
        // load user from mysql
        User(id, "User from Mysql")
      }
    }
  }

  trait UserServiceComponent {
    self: UserRepositoryComponent =>

    def userService: UserService

    class RealUserService extends UserService {
      override def loadAndValidateUser(id: Int): User = {
        val user = userRepository.loadUser(id)
        // validate it...
        user
      }
    }
  }

  // production wiring
  class ComponentRegistry extends UserServiceComponent with UserRepositoryComponent {
    def userService = new RealUserService
    def userRepository = new MysqlUserRepository
  }

  val app = new ComponentRegistry
  app.userService.loadAndValidateUser(1)

  // for testing the user service
  class UserServiceComponentTest extends UserServiceComponent with UserRepositoryComponent {
    override val userRepository = new UserRepository {
      def loadUser(id: Int) = User(id, "User from Mock")
    }

    override val userService = new RealUserService
  }

  val test = new UserServiceComponentTest
  test.userService.loadAndValidateUser(1)
}