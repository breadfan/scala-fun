object ex {
  val f: (Int => Int) = (x:Int) => throw new Exception
                                                  //> f  : Int => Int = <function1>
  
  f(1)                                            //> java.lang.Exception
                                                  //| 	at ex$$anonfun$main$1$$anonfun$1.apply(ex.scala:2)
                                                  //| 	at ex$$anonfun$main$1$$anonfun$1.apply(ex.scala:2)
                                                  //| 	at scala.Function1$class.apply$mcII$sp(Function1.scala:39)
                                                  //| 	at scala.runtime.AbstractFunction1.apply$mcII$sp(AbstractFunction1.scala
                                                  //| :12)
                                                  //| 	at ex$$anonfun$main$1.apply$mcV$sp(ex.scala:4)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at ex$.main(ex.scala:1)
                                                  //| 	at ex.main(ex.scala)
}