package prep

object functions {

	val sqr = (x: Int) => x * x               //> sqr  : Int => Int = <function1>
	
	def sqrAsMethod(x: Int) = x * x           //> sqrAsMethod: (x: Int)Int
	
	def apply(f: Int => Int, x: Int) = f(x)   //> apply: (f: Int => Int, x: Int)Int
	
	apply(sqr,  2)                            //> res0: Int = 4
	
	val add = (x: Int, y: Int) => x + x       //> add  : (Int, Int) => Int = <function2>
}