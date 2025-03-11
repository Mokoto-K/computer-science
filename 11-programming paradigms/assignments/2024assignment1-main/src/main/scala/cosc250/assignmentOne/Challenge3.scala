package cosc250.assignmentOne

/**
  Challenge 3 is the "8 queens problem" -- how to put eight queens on a chessboard without any of them attacking
  each other. In chess, queens can move and attack horizontally, vertically, and diagonally
  and can move (and attack) an unlimited number of squares away.
  */
object Challenge3 {

  /** 
   First, let me define "type alias". A Position is a tuple of two integers, eg (1, 2)
    This makes the word "Position" a synonym for the type (Int, Int)
    The rows and columns of a board will be numbered 0 to 7. 
    Column number first, ie (x, y). So, in a game of chess, white's king would start at (4, 0)
    */
  type Position = (Int, Int)

  /*
    A Candidate solution is a sequence of positions. Again, this just creates a synonym
    for us, not a new class.
    */
  type Candidate = Seq[Position]

  /** Are two positions in the same row? */
  def sameRow(p1:Position, p2:Position):Boolean = ???

  /** Are two positions in the same column? */
  def sameCol(p1:Position, p2:Position):Boolean = ???

  /** 
   Are two positions on the same diagonal? 
    Remember, there are two diagonals to worry about. 

    Hint: Think about the difference in their coordinates.
  */
  def sameDiagonal(p1:Position, p2:Position):Boolean = {
    ???
  }

  /**
   Now let's define a function to test whether queens in two positions are attacking each other.
    Don't forget a queen cannot attack itself. ie, (4,4) is not attacking (4,4)
  */
  def attackingEachOther(p1:Position, p2:Position):Boolean = {
    ???
  }

  /**
   Using your attackingEachOther method, write a function that looks through a sequence of positions and finds if
    there are any queens attacking each other
    */
  def seqContainsAttack(queens:Seq[Position]):Boolean = {
    ???
  }

  /**
   A solution is valid if it does not contain an attack and has eight queens.
    Write a function to check if a solution is valid
    */
  def isValid(queens:Seq[Position]):Boolean = {
    ???
  }

  /**
    To solve eight queens, all of the queens must be in different columns (and there must be one in each column)
    So, rather input the full positions for each queen, we can just take (in order) the row number for each column.
    ie, Seq(1, 8, 2, 7) would mean there's a queen at (1,1) another at (2, 7), another at (3, 2), another at (4, 7).
    
    Write a function that takes a sequence of row numbers, eg, Seq(1, 8, 2, 7), and produces a sequence of
    positions, eg Seq((0, 1), (1, 8), (2, 2), (3, 7))
    */
  def expandShortHand(queens:Seq[Int]):Seq[Position] = {
    ???
  }

  /**
   Write a function that takes in a Seq of candidate solutions, and returns a Seq
    containing only those solutions that turn out to be valid.
    Reminder: Seq[Candidate] is an alias for Seq[Seq[(Int,Int)]]
    */
  def filterCandidates(candidates:Seq[Candidate]):Seq[Candidate] = {
    ???
  }

  /**
    * Now we're going to use another trick to make the whole computation very small. As well as the queens all being
    * in different columns, they're also all in different rows. So every solution is going to be a permutation of
    * Seq(1, 2, 3, 4, 5, 6, 7, 8). But we're going to need to filter the permutations to only the ones that work.
    *
    * If your previous functions work, this should work.
    */
  def eightQueens:Seq[Candidate] = {
    val perms = Seq(0, 1, 2, 3, 4, 5, 6, 7).permutations.toSeq
    val candidates = perms.map(expandShortHand)
    filterCandidates(candidates)
  }


}
