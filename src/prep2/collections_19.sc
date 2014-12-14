package prep2

object collections_19 {
  val list = 3 :: 1 :: 2 :: Nil
  
  list match {
  	case first :: tail => println(s"$first, $tail")
  }
  
  list.sorted
  
  list.sortBy(-_)
  
  list.sortWith( (a,b) => b < a)
  
  list :+ 4
  
  val newList = 0 +: list
  
  val evenUnevenMap = newList groupBy (_ % 2 == 0)
  
 
 	val nameToPhone = Map("Brad" -> 100, "Angelina" -> 200, "Scarlet" -> 300)
 	
  nameToPhone filter { case (name, phone) => phone < 300}
}