package prep2

object methods_2 {
	def inc(x: Int): Int = x + 1              //> inc: (x: Int)Int
	
	// no checked exception concept
	def foo(x: Int): Int = throw new Exception//> foo: (x: Int)Int

  // why does the above and this compile
	def bar = throw new Exception             //> bar: => Nothing
}