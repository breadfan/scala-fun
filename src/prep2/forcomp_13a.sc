package prep2

object forcomp_13a {
  // For comprehension with Lists
  val numbers = List(1, 2, 3)
  val colors = List("green", "blue", "red")

  for {
    elem <- numbers
    color <- colors
  } yield (elem, color)
}