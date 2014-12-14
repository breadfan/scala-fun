object PimpTimes {
  5 times println("Hallo")                        //> Hallo
                                                  //| Hallo
                                                  //| Hallo
                                                  //| Hallo
                                                  //| Hallo
  
  implicit class RichInt(i: Int) {
  	def times(f: => Unit) = (1 to i).foreach(_ => f)
  }
}