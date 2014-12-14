object StructuralTyping {
  def foo(x: { def bar(i: Int): String}) = {
  	println(x.bar(1))
  }                                               //> foo: (x: AnyRef{def bar(i: Int): String})Unit
  
  class AddOne {
  	def bar(i: Int) = (i + 1).toString
  }
  
  class AddTwo {
  	def bar(i: Int) = (i + 2).toString
  }
  
  foo(new AddOne)                                 //> 2
  foo(new AddTwo)                                 //> 3
}