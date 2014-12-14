object Lazy {
  val y = { println("I'm evaluated"); 1}          //> I'm evaluated
                                                  //| y  : Int = 1
}