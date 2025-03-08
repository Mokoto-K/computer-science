@main def main() = {
  pascal(5)   
}
  /**
    * Let's do one using Lists
    *
    * Pascal's triangle goes
    *     1
    *    1 1
    *   1 2 1
    *  1 3 3 1
    * 1 4 6 4 1
    *
    * To calculate the next line, take
    * left = 0 +: pascal(n-1)     // +: is append
    * right = pascal(n=1) :+ 0    // :+ is append at the other end
    *
    * That gives the list twice, offset by one.
    * Now add them up element by element to get pascal(n)
    */
def pascal(n:Int):List[Int] = {

  // You'll need a function that can sum tuples in a list
  // Let's define that recursively for you
  def sumPairs(l:List[(Int, Int)]):List[Int] = {
    l match {
      case (a,b) :: t => (a + b) :: sumPairs(t)
      case Nil => Nil
    }
  }

  // Now write the body of pascal(n)
  
  pascal(n-1)

}
