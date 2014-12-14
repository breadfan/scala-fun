package prep2

object companion_9 {
 	class Car(val personCount: Int)
 	
 	object Car {
 		// I am a factory method
 		def fromString(s: String) = new Car(s.toInt)
 	}
 	
 	val c = Car.fromString("1")
 	c.personCount
}