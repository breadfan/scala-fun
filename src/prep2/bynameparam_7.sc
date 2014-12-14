package prep2

object bynameparam_7 {
  def sqr(x: Int) = { println("in sqr");x * x }

  def foo(v: => Int): Unit = {
      println("Now i'm here")
      println(v)
  }
 
  val x = foo(sqr(2))
}