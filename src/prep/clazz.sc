object clazz {
  class Car(var personCount: Int) {
  	println(s"person count $personCount")
  }
  
  val c = new Car(4)                              //> person count 4
                                                  //| c  : clazz.Car = clazz$Car@3d73d62d
  c.personCount = 2
  println(c.personCount)                          //> 2
  
}
  