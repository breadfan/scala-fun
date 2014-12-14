package prep2

import scala.annotation.tailrec
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Await
import scala.concurrent.duration._

object futures_15 {
  def remoteCall(i: Int): Int = {
    println(s"Got called with $i, compute result")
    Thread.sleep(1000)
    println("Got response")
    i * 2

  }

  def async(i: Int): Future[Int] = Future(remoteCall(i))

  val r = for {
    a1 <- async(2)
    a2 <- async(a1)
  } yield a2

  r.map(res => println(s"Got the final result: $res")) // inline to yield?

  println("Work to do")

  // Await.result(r, 10.seconds) // only in tests and demos! blocks!

  Thread.sleep(10000)
}