package prep2

object functions_6 {

  val sqr = (x: Int) => x * x
  val add = (x: Int, y: Int) => x + x
  val triple = (x: Int, y: Int, z: Int) => ???
  
  def sqrAsMethod(x: Int) = x * x

  // High Order Function
  def foo(f: Int => Int, i: Int) = f(i)
  foo(sqr, 3)
}