package prep2

object regex_18 {
	val date = """(\d\d).(\d\d).(\d\d\d\d)""".r
	val date(day, month, year) = "11.02.2014"

                                                  
	val dates = "Important dates in history: 20.01.2004, 05.09.1958, 06.10.2010"
                                                  
	val firstDate = date findFirstIn dates getOrElse "No date found."
	val firstYear = for (m <- date findFirstMatchIn dates) yield m group 3
}