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
  
  val names = new Array[String](3)
  
  names(0) = "Fred"

  names.apply(0, "Fred")

  names.update(0, "Fred")

  val arrayOfAnything = new Array[Any](13)

  val names = List("Fiona", "Euan", "rebevves", "Hamish")

  val myList: List[Int] = 4 :: 3 :: 4 :: 3 :: 4 :: 3 :: 4 :: 3 :: 2 :: 1 :: Nil 
  
  val extendedNames: List[String] = "grace" :: names

  val names: Seq[Int] = List(1,2,3,4)

  import scala.collection.mutable
  val myMutSeq = mutable.Seq(1,2,3) 

  val mySet = Set(1,2,3,4,4)

  myset == Set(1,1,1,1,1,2,2,2,3,4,4,4) // true 

  val tuple: (Int, String) = (1, "a")
  tuple  = (2, "b") 

  val tup = (1, "a", 2, "b")
  Seq((1, "a"), (2, "b"))
  Seq(1 -> "a", 2 -> "b") 
  (1, "a") :: (2 -> "b") :: Nil 
  val a = 1 *: 2 *: 3*: Tuple()

  val myTuple = (1 -> "a")
  val (number, letter) = myTuple

  val names = Array("a", "b", "c", "d")
  val Array(a,b,c,d) = names 

  // Lecture 4 

  val dogNames = List("Rosie", "Buster", "thirdog")

  class Dog(name: String) {
    
    private var age: Int = 0

    def age: Int = age 

    def this(i: Int) = this(dogNames(i))

    def sit(): Unit = println(s"$name sits")

    def listen(word: String): Unit = 
      if (word == name) 
        println(s"$name looks at you")
      else
        println(s"$name doesnt give a fuck about you")
  }

  val rosie = Dog("Rosie")
  rosie.sit()
  
  val dog2 = Dog(2)


  trait HasLocation {
    def x: Double
    def y: Double 

    def distanceToOrigin: Double = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))
  }

  class Circle(val x: Double, val y: Double, val radius: Double) extends HasLocation

  val c = Circle(100, 200, 5)


  sealed trait Planet:
    def ordinal: Int

  object Planet:
    object Mercury extends Planet:
      def ordinal = 0 

  // Lecture 6

  @tailrec
  final def triangular(accum: Int, n: Int) =
    if n <= 0 then
      accum
    else
      triangular(accum + n, n - 1)

  triangular(0, 3)

  // 07 Pattern matching and case classes

  def describe(n: Int): String = 
    n match
      case 0 => "zero"
      case 1 => "one"
      case x if x > 0 && x % 2 == 0 => "something positive and even"
      case _ => "something else"


  def describePostion(pos:(Int, Int)): String = 
    pos match
      case (x, y) if x > 0 && y > 0 => "Top right"
      case (x, y) if x < 0 && y > 0 => "Top left"
      case (x, y) if x > 0 && y < 0 => "Bottom right"
      case (x, y) if x < 0 && y < 0 => "Bottom left"
      case _ => "You're on the axis"

//--------------------------------------------------
  enum Suit:
    case Clubs, Diamonds, Hearts, Spades

  import Suit.*

  def colour(s: Suit): String = s match
    case Clubs | Spades => "Black"
    case Diamonds | Hearts => "Red"

  case class Card(value: Int, suit: String)

  def describe(card: Card): String = 
    card match
      case Card(1, Spade) => "Old booty"
      case Card(1, _) => "ace"
      case Card(11, Spades) => "One eyed jack"
      case Card(x, _) if x > 10 => "Picture card"
      case Card(x, y) => s"$x, $y"

  val aceOfSpades = Card(1, Spades)
  aceOfSpades.value 
  aceOfSpades.suit 

  val map = Map[Card, String](Card(1, Spades) -> "Old frizzle")

  val Card(x, s) = aceOfSpades // x = 1, s = Spades 
  
  describe(Card(11, Clubs))





























}
