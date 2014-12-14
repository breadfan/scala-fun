package prep2

object typeinf_1 {
	// Java: val = final
  val i = 1
  val listOfInts = List(1,2,3)
  
  val listOfAny = List(1, "2")
  
  // Sometimes the inferer choose not exactly what we may desire:
  val listOfAnyRef = List("2", List(1))

	// vars are Variables
  var ugly = 2
  ugly = 3
}