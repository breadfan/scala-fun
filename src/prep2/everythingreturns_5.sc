package prep2

object everythingreturns_5 {
  val b = true
  
	val r = if(b) 7 else 5
	
	// In java:
	// int r = null; // no final possible :-(
	// if(b) r = 7 else r = 5
	
	lazy val x = throw new Exception
  
}