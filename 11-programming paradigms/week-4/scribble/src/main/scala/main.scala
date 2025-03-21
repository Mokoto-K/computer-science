// calculates powers of two using recursion
def powersOfTwo(num: Int): BigInt = 
  if (num == 0) 
    1 
  else 
    powersOfTwo(num - 1) * 2


// Extends the string class to show even letters in the char set 
extension (s: String)
  def evenLetters = s.count(c => c.charValue % 2 == 0)


@main
def main(): Unit = {

  // calculates a given number of powers of two
  (0 to 8).map(x => println(s"$x bit number max val: ${powersOfTwo(x)}"))

  // prints the number of even letters in the given string
  println("hello".evenLetters)

}
