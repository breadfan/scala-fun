package prep2

object pimpmylib_12 {
 5 times println("Hallo")
 
  implicit class RichInt(i: Int) {
      def times(f: => Unit) = (1 to i).foreach(_ => f)
  }

}