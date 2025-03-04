val dogNames = List("Rosie", "Buster", "poop")

class Dog(val name: String) {
  private var _age:Int = 0

  def this(i:Int) = this(dogNames(i))

  def sit():Unit = 
    println(name + " is sitting")

  def listen(word:String):Unit = 
    if (word == name)
      println(s"$name looks at you")

  def age:Int = _age

  def setAge(newAge:Int):Unit = _age = newAge
}

val rose = Dog(1)

@main def main():Unit = 

  rose.sit()
  rose.listen("Buster")
  println(rose.age)
  rose.setAge(1)
  println(rose.age)
  
// Traits are like interfaces

trait HasLocation:
  def x:Double
  def y:Double

class Circle(val x:Double, val y:Double, val radius:Double) extends HasLocation

val c = Circle(100, 200, 5)
