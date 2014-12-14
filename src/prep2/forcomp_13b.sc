package prep2

object forcomp_13b {
  
  // For comprehension with Option
  val customerIdOpt = Some(4711)
  def findCustomerName(id: Int): Option[String] = Some(s"Name of $id")

  for {
    id <- customerIdOpt
    name <- findCustomerName(id)
  } yield name
}