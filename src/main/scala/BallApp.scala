import scala.collection.mutable.ListBuffer

val task = """
Создать класс Мяч. Создать класс Корзина.
Наполнить корзину мячиками.
Определить вес мячиков в корзине и количество мячиков заданного цвета.

Сортировка.
"""


class Ball(
  var name: String,
  var weight: Double,
  var color: String
){
  def getColor: String =
    this.color

  def getWeight: Double =
    this.weight
}


class Basket(
  list: ListBuffer[Ball]
){
  private var balls = list

  def getBalls: ListBuffer[Ball] =
    balls

  def getTotalWeight: Double =
    var basketWeight: Double = 0
    for (i <- balls.indices) {
      basketWeight += balls(i).getWeight
    }
    basketWeight

  def getBallsNumberByColor(color: String): Int =
    var counter: Int = 0
    for (i <- balls.indices) {
      if (balls(i).getColor == color)
        counter += 1
    }
    counter

  def sortByWeight(sortType:String): ListBuffer[Ball] =
    if (sortType == "asc")
      balls = balls.sortWith((a, b) => a.weight < b.weight)
    if (sortType == "desc")
      balls = balls.sortWith((a, b) => a.weight > b.weight)
    balls
}


@main def main() : Unit =
  val ball1 = new Ball("b1", 13.5, "blue")
  val ball2 = new Ball("b2", 17.0, "green")
  val ball3 = new Ball("b3", 1.3, "blue")
  val ball4 = new Ball("b4", 1.0, "white")
  val ball5 = new Ball("b5", 3.2, "green")
  val ball6 = new Ball("b6", 5.0, "blue")
  val ball7 = new Ball("b7", 13.0, "blue")
  val ball8 = new Ball("b8", 5.4, "orange")
  val ball9 = new Ball("b9", 3.0, "red")
  val ball10 = new Ball("b10", 13.0, "green")
  val ball11 = new Ball("b11", 1.45, "blue")
  val ball12 = new Ball("b12", 6.53, "yellow")
  val ball13 = new Ball("b13", 5.0, "yellow")
  val ballsList = ListBuffer(
    ball1,
    ball2,
    ball3,
    ball4,
    ball5,
    ball6,
    ball7,
    ball8,
    ball9,
    ball10,
    ball11,
    ball12,
    ball13
  )
  val basket = new Basket(ballsList);

  println("Total weight: " + basket.getTotalWeight);

  val color = "blue"
  println("Number of " + color + " balls = " + basket.getBallsNumberByColor(color));

  println("Ascending sort by weight: ")
  basket.sortByWeight("asc")
  for (ball <- basket.getBalls)
    println(ball.name + " " + ball.weight + " " + ball.color)

  println("Descending sort by weight: ")
  basket.sortByWeight("desc")
  for (ball <- basket.getBalls)
    println(ball.name + " " + ball.weight + " " + ball.color)
