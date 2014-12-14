package prep

object functions {
  val sqr = (x: Int) => { println("in sqr");x * x }
                                                  //> sqr  : Int => Int = <function1>
  
  def foo(v: => Int): Unit = {
  	println("Now i'm here")
  	println(v)
  }                                               //> foo: (v: => Int)Unit
  
  val x = foo(sqr(2))                             //> Now i'm here
                                                  //| in sqr
                                                  //| 4
                                                  //| x  : Unit = ()
}