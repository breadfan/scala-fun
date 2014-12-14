package prep2

object structuraltyping_14 {

  def foo(x: { def bar(i: Int): String }) = {
    println(x.bar(1))
  }

  class AddOne {
    def bar(i: Int) = (i + 1).toString
  }

  class AddTwo {
    def bar(i: Int) = (i + 2).toString
  }

  foo(new AddOne)
  foo(new AddTwo)
}