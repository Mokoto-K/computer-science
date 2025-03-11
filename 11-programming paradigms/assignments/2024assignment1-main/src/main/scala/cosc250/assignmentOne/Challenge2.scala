package cosc250.assignmentOne

/**
 * In Challenge 2, the functions you will implement will produce a Scrabble scorer. 
 * It should take into account the letters in the word *and* the squares the word sits on.
 * 
 * Again, where you see ??? you need to write the implementation of the function.
 */
object Challenge2 {

  /**
    *
    * I've created a sealed trait to model the different kinds of square. A "sealed trait" means that every class or
    * object that implements that trait is defined in the same program file. Knowing that there aren't any other
    * potential Squares out there (eg, being added later by other programmers) means the compiler can do cleverer
    * exhaustiveness-checking for us.
    *
    */
  sealed trait Square
  case object OrdinarySquare extends Square
  case object DoubleLetterScore extends Square
  case object TripleLetterScore extends Square
  case object DoubleWordScore extends Square
  case object TripleWordScore extends Square

  /**
  * (You may assume all letters are uppercase)
  *
  * 1: A, E, I, O, U, L, N, S, T, R.
  * 2: D, G.
  * 3: B, C, M, P.
  * 4: F, H, V, W, Y.
  * 5: K
  * 8: J, X.
  * 10: Q, Z.
  *
  * You might find using "mystring".contains(char) useful to keep it short
  */
  def letterScore(char:Char):Int = { charercom09jkjkjkjkjkjkjkjmatch
    case "AEIOULNSTR" => 1
    case char.contain("DG") => 2 
    case char.contain("BCMP") => 3
    case char.contain("FHVWY") => 4
    case char.contain("K") => 5
    case char.contain("JX") => 8
    case char.contain("QZ") => 10
  }

  /**
    * This should work out what this letter scores, given the square it's on.
    * Don't forget - DoubleWordScores etc affect the word as a whole, not individual letters
    */
  def letterAndSquareScore(char:Char, sq:Square):Int = {
    ???
  }

  /** 
   This should work out the total score for each letter, given the square it's on.
    At this stage, DoubleWordScores etc should not be taken into account. Only Double and TripleLetterScores.

    Hint: you can "zip" a word with a Seq to produce a Seq of (char, Square) tuples.
    eg, "ABC".zip(Seq(1, 2, 3)) produces Seq(('A', 1), ('B', 2), ('C', 3))

    Hint: If you produce a Seq[Int] you can call seq.sum on it.
    */
  def totalLetterScore(word:String, squares:Seq[Square]):Int = {
    ???
  }

  /**
    Calculate the scrabble score for a word on a set of squares.
    Now we have to take DoubleWordScore and TripleWordScore squares into account.
    They combine multiplicatively. So, if there are two TripleWordScores and a DoubleWordScore
    squares, the multiplier will be 3 * 3 * 2 = 18
    */
  def scrabbleScore(word:String, squares:Seq[Square]):Int = {
    ???
  }

}
