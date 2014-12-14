import scala.annotation.tailrec
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Await
import scala.concurrent.duration._

object sheet1 {
	
 def remoteCall(i: Int): Int = {
 		println(s"Start calling with $i")
 		Thread.sleep(1000)
 		println("Got response")
 		i * 2
 		
 }                                                //> remoteCall: (i: Int)Int
 
 def async(i: Int): Future[Int] = Future(remoteCall(i))
                                                  //> async: (i: Int)scala.concurrent.Future[Int]
 
 val r = for {
 	a1 <- async(1)
	a2 <- async(a1)
	} yield a2                                //> r  : scala.concurrent.Future[Int] = scala.concurrent.impl.Promise$DefaultPro
                                                  //| mise@6581305e
	
 println("Work to do")                            //> Work to do
 Await.result(r, 10.seconds)                      //> Start calling with 1
                                                  //| Got response
                                                  //| Start calling with 2
                                                  //| Got response
                                                  //| res0: Int = 4
                      
}