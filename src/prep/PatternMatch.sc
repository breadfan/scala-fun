package prep

object PatternMatch {

  case class Address(street: String)
	case class Customer(name: String, billingAdress: Address, shippingAddress: Option[Address])
	
	val brad = Customer("brad", Address("Maximilianstr"), Some(Address("Goetherstr")))
                                                  //> brad  : prep.PatternMatch.Customer = Customer(brad,Address(Maximilianstr),So
                                                  //| me(Address(Goetherstr)))
                                                  
	val angelina = Customer("angelina", Address("Maximilianstr"), None)
                                                  //> angelina  : prep.PatternMatch.Customer = Customer(angelina,Address(Maximilia
                                                  //| nstr),None)
                                                  
	val customers = Set(brad, angelina)       //> customers  : scala.collection.immutable.Set[prep.PatternMatch.Customer] = Se
                                                  //| t(Customer(brad,Address(Maximilianstr),Some(Address(Goetherstr))), Customer(
                                                  //| angelina,Address(Maximilianstr),None))
	       
	customers.foreach {
	  customer =>
			customer match {
		  	case Customer(n, _, Some(ship)) if ship.street.startsWith("k") =>
		  		println(s"Ship address gefunden: $ship")
		  	case other => println(s"Kunde ohne Shipaddress: $other")
			}
		}                                 //> Kunde ohne Shipaddress: Customer(brad,Address(Maximilianstr),Some(Address(Go
                                                  //| etherstr)))
                                                  //| Kunde ohne Shipaddress: Customer(angelina,Address(Maximilianstr),None)
}