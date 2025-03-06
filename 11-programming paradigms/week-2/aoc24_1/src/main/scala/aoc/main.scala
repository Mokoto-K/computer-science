package aoc

import scala.io.* 

@main def main() = {
  val input = Source.fromFile("sample.txt").getLines();

  val tuples = (for case s"$x   $y" <- input yield (x, y)).toSeq

  val left = tuples.map((left, right) => left).sorted
  val right = tuples.map((left, right) => right).sorted
  println(left)
  println(right)

}
