package prep

object regEx {
  val date = """(\d\d).(\d\d).(\d\d\d\d)""".r     //> date  : scala.util.matching.Regex = (\d\d).(\d\d).(\d\d\d\d)
  val date(day, month, year) = "12.02.2014"       //> day  : String = 12
                                                  //| month  : String = 02
                                                  //| year  : String = 2014
	def foo(i: Int, j: Int): Tuple2[Int, Int] = (i, j)
                                                  //> foo: (i: Int, j: Int)(Int, Int)
	
	
	val (_, y) = foo(1,2)                     //> y  : Int = 2
}