object CaseClasses {
  class Person(name: String, age: Int)
  
  val h1 = new Person("Hans", 42)                 //> h1  : CaseClasses.Person = CaseClasses$Person@beae719
  val h2 = new Person("Hans", 42)                 //> h2  : CaseClasses.Person = CaseClasses$Person@2dbae104
  
  h1 == h2                                        //> res0: Boolean = false
  
  h1.hashCode() == h2.hashCode()                  //> res1: Boolean = false
}