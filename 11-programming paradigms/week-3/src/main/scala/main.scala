@main
def run() = {

  //Lecutre three 
  val num1: Int = 1 + 8
  val bool1: Boolean = true 
  
  val a = if "February".contains('r') then
    "Yes it does"
  else 
    "No it doesnt"

  val b = if ("February".contains('r'))
    "Yes it does"
  else
    "No it doesnt"

  val pi: Double = 3.1415
  val pi2: Double = Math.PI 

  var radius = 10 
  var radius1: Int = 10
  radius1 = radius1 + 2 

  def circumference(r: Double): Double = 
    2 * Math.PI * r
      
  println(circumference(3.5))

  def sayHello(person: String): Unit = 
    println("Hello " + person)

  def notVeryUseful: Unit = ()

  def sayHello1() = println("Hello there")

  sayHello1()

  def myComplexFuntion(s: String, i: Int): List[Int] = ???

  def saySomething(what: String, to: String)(exclamationMakr: Boolean) = ???

  def sayHello3(name: String = "default") = println(s"Hello $name")

  var i = 0
  while (i < 100) {
    if (i % 15 == 0)
      println("Fizzbuzz")
    else if (i % 5) 
      println("Fizz")
    else
      println("Buzz")
  }

  //Arrays, List, sets, seq, collections 
  imperative programming in scaloo 22:54



}
