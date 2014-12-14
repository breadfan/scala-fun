object Tr {
 	
 	trait Vehicle {
 	 def name: String
 	 def personCount: Int
 	}
 	
 	class Car(val personCount:Int) extends Vehicle {
 		def name = "Car"
 	}
 	
 	val car1 = new Car(4)                     //> car1  : Tr.Car = Tr$Car@637dffde
 	println(car1.personCount)                 //> 4
 	
 	
 	trait Support {
 		self: Vehicle =>
 		def nameUpper = self.name.toUpperCase()
 	}
 	
 	
 	class Beetle(personCount: Int) extends Car(personCount) with Support
 	
 	new Beetle(4).nameUpper                   //> res0: String = CAR
}