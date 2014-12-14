package prep2

object patternmatching_tuple_11b {
	
	case class Customer(id: Int)
	case class Address(street: String)

	def customerWithAddress(id: Int): (Customer, Address) = (Customer(id), Address("Dingolfingerstr. 7"))
	
	customerWithAddress(15) match {
		case (c, a) => println(s"Customer ${c.id} lives at ${a.street}")
	}
}