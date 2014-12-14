package prep2

object caseclasses_10 {
  class Person(name: String, age: Int)

  val h1 = new Person("Hans", 42)
  val h2 = new Person("Hans", 42)

  h1 == h2

  h1.hashCode() == h2.hashCode()

}