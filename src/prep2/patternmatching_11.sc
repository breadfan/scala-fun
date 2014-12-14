package prep2

object patternmatching_11 {

  case class Address(street: String)
  case class Customer(name: String, billingAdress: Address, shippingAddress: Option[Address])

  val brad = Customer("brad", Address("Maximilianstr"), Some(Address("Goetherstr")))

  val angelina = Customer("angelina", Address("Maximilianstr"), None)

  val customers = Set(brad, angelina)

  customers.foreach {
    customer =>
      customer match {
        case Customer(n, _, Some(ship)) => println(s"Ship address gefunden: $ship") // show guards here
        case other => println(s"Kunde ohne Shipaddress: $other")
      }
  }
}