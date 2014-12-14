object CaseClasses {

	sealed trait List {
		def next: List
	}
  
  case class Cons(value: String, next: List) extends List
  
  case object Nil extends List {
  	def next = Nil
  }
  
  val l: List = Cons("1", Cons("2", Nil))         //> l  : CaseClasses.List = Cons(1,Cons(2,Nil))
  
  l match {
  	case Cons(value, next) => println(value)
  	case Nil => println("Nil")
  }                                               //> 1
 	l match {
 		case Cons(v1, Cons("2", v2)) => println(v1 + " " + v2)
 	}                                         //> 1 Nil
}