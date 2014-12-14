package prep2

object traitsclasses_8b {
  trait Vehicle { // i call this an interface trait
    def name: String
    def personCount: Int
  }

  class Car(val personCount: Int) extends Vehicle { // Uniform Access Principle: val implements a def
    def name = "Car"
  }

  val car1 = new Car(4)
  println(car1.personCount)

  trait Support { // mixin
    self: Vehicle =>
    def nameUpper = self.name.toUpperCase()
  }

  class Beetle(personCount: Int) extends Car(personCount) with Support

  new Beetle(4).nameUpper
}