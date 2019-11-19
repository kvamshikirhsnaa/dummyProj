import scala.util.Random

import java.time.LocalDate

case class Car(make: String, model: String, year: Int) {
  lazy val isVintage: Boolean =
    LocalDate.now.getYear - year > 20
}


object Test1 {
  def main(args: Array[String]): Unit = {

    val mustang = Car("Ford", "Mustang", 1965)

    println(mustang.make)
    println(mustang.model)
    println(mustang.year)
    println(mustang.isVintage)

    println(mustang == Car("Ford", "Mustang", 1965))
    println(mustang == Car("Ford", "Mustang", 1964))





  }

}
