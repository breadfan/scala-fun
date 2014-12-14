package prep2

object lazyval_4 {
	val x = { println("I'm evaluated"); 1}
	println("Let's go")
	x
	x
	
	lazy val y = { println("I'm evaluated"); 1}
	println("I'm lazy")
	y
	y
	
	def z = { println("I'm evaluated"); 1}
	println("I'm always recalculated")
	z
	z

}