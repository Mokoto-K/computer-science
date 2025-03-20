sealed trait Symbol

enum Nationality extends Symbol:
  case Englishman, Swede, Dane, German, Norwegian

enum Drink extends Symbol:
  case Tea, Water, Coffee, Milk, Beer

enum Colour extends Symbol:
  case Red, Blue, White, Green, Yellow

enum Smoke extends Symbol:
  case Dunhill, Pallmall, Blend, Bluemasters, Prince

enum Pet extends Symbol:
  case Bird, Cat, Dog, Horse, Fish 

val allSymbols: Seq[Symbol] = (Nationality.values ++ 
                               Drink.values ++ 
                               Colour.values ++ 
                               Smoke.values ++ 
                               Pet.values
                               ).toSeq

type Cell = Seq[Symbol]

case class House(cells: Seq[Cell]):
  def withJust(row: Int, symbol: Symbol): House = 
    House(cells = cells.update(row, Seq(symbol)))

  def eliminate(row: Int, symbol: Symbol): House =
    House(cells =cells.updated(row, cells(row).filterNot(_ == symbol)))

object House:
  def unknown: House = House(Seq(
    Nationality.values.toSeq,
    Drink.values.toSeq,
    Colour.values.toSeq,
    Smoke.values.toSeq,
    Pet.values.toSeq 
))

case class Street(houses: Seq[House] = Seq.fill(5)(House.unknown))
  
  def applyMove(m: Move): Street = 
    val (h, r, symbol) = m 
    Street(
      for 
        (house, num) <- houses.zipWithIndex
      yield
        if num == h then house.withJust(r, symbol) else house.eliminate(r, symbol)

type Move = (Int, Int, Symbol)


@main
def main(): Unit = {

  for s <- allSymbols yield li(s.toString())

}
