package prep2

object curry_17 {
  def *(m: Int)(n: Int): Int = m * n              //> * : (m: Int)(n: Int)Int
  
  val multByFive = *(5)(_)                        //> multByFive  : Int => Int = <function1>
  
  List(1,2,3,4,5) map multByFive                  //> res0: List[Int] = List(5, 10, 15, 20, 25)
}