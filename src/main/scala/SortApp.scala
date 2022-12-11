object SortApp {
  def main(args: Array[String]): Unit = {
    val numbers = Array(500, 503, 435, 1234, 444, 888, 333, 1034)
    val strings = Array("Ilya", "Nikita", "Roman", "Torch")

    val sortedNumbers = numbers.sortWith((a, b) => a < b)
    val sortedStrings = strings.sortWith((a, b) => a < b)
    println("Sorted [" + numbers.mkString(", ") + "]: " + sortedNumbers.mkString("[", ", ", "]"))
    println("Sorted [" + strings.mkString(", ") + "]: " + sortedStrings.mkString("[", ", ", "]"))

    val filteredNumbers = numbers.filter(n => n > 500)
    val filteredStrings = strings.filter(n => n.toUpperCase.endsWith("A"))
    println("Filtered numbers: " + filteredNumbers.mkString("[", ", ", "]"))
    println("Filtered strings: " + filteredStrings.mkString("[", ", ", "]"))
  }
}
