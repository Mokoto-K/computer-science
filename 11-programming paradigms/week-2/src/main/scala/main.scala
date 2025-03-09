def repeat[T](list:List[T]):List[T] = 
  list match
    case Nil => Nil 
    case h :: tail => h :: h :: repeat(tail)

def alternate[T](list:List[T]):List[T] = 
  list match 
    case Nil => Nil
    case h :: Nil => Nil 
    case a :: b :: tail => b :: alternate(tail)

@main
def main() = {

  println(repeat(List(1, 2, 3)))
  println(alternate(List(1,2,3,4,5,6)))
}

// import scala.annotation.tailrec
//
// sealed trait IntList:
//   def head:Int
//   def tail:IntList
//
//   final def length:Int = this match 
//     case Empty => 0
//     case Cons(_, tail) => 1 + tail.length
//
//   @tailrec
//   final def apply(index:Int):Int = this match 
//     case Empty => throw new IndexOutOfBoundsException()
//     case Cons(h, tail) =>
//       if index == 0 then h else tail.apply(index - 1)
//
// case object Empty extends IntList: 
//   def head:Int = throw new NoSuchElementException()
//   def tail:IntList = throw new NoSuchElementException()
//
// case class Cons(head:Int, tail:IntList) extends IntList
//
// val myList:IntList = Cons(1, Cons(2, Cons(3, Empty)))
//
//
// @main
// def main() = {
//
//   val myList = Cons(1, Cons(2, Cons(3, Empty)))
//
//   myList(2)
//   myList.length
// }

// def describe(card:Card):String = card match 
//   case Card(1, Spade) => "Old Frizzle"
//   case Card(1, _) => "An ace"
//   case Card(11, Spade) | Card(11, Hearts) => "A one-eyed Jack"
//   case Card(x, _) if x > 10 => "A picture card"
//   case Card(x, y) => s"Just a boring old $x of $y"
//
//
// def describePosition(pos:(Int, Int)):String = 
//   pos match
//     case (x,y) if x > 0 && y > 0 => "top right"
//     case (x,y) if x < 0 && y > 0 => "top left"
//     case (x,y) if x > 0 && y < 0 => "bottom right"
//     case (x,y) if x < 0 && y < 0 => "bottom left"
//     case _ => "Youre on an axis"    
//
// //---------------------------------------------------
// enum Suit:
//     case Clubs, Diamonds, Hearts, Spades
//
// import Suit.*
//
// def colour(s:Suit):String = s match 
//   case Clubs | Spaces => "black"
//   case Diamonds | Hearts => "red"
//
//
// case class Card(value:Int, suit:Suit)
//
// def playOrPass(opt:Option[Card]):String = opt match
//   case Some(card) => S"Your played the  ${card.value} of ${card.suit}"
//   case None => "You passed"
//
// @main
// def run() = {
//
//   val aceOfSpades = Card(1, Spades)
//   val Card(value, suit) = aceOfSpades //deconstructing assignment 
//
//
//   val map = Map[Card, String](Card(1, Spades) -> "Old Frizzle")
//
//   describe(Card(11, Clubs))
// }
//
