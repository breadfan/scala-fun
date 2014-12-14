import scala.concurrent.duration.Duration
import java.util.concurrent.TimeUnit

object pimp {
  val time = 2 seconds                            //> time  : scala.concurrent.duration.FiniteDuration = 2 seconds
  
  println(time toMillis)                          //> 2000
  
  implicit class RichInt(i: Int) {
  	def seconds() = Duration(i, TimeUnit.SECONDS)
  }
  
}