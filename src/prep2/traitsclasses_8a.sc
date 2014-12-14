package prep2

object traitsclasses_8a {

  class Car(personCount: Int, val name: String) {
      println(s"person count $personCount")
  }
  
  val b = new Car(4, "beetle")
  
  // personCount is not a member of the class
  b.name
}