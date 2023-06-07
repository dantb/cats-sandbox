package sandbox

import cats.syntax.all.*
import cats.kernel.Semigroup

final case class Box(value: Int)

given Semigroup[Box] = (a, b) => Box(a.value + b.value)

@main def main(): Unit =
  println(List(1, 2, 3) |+| List(4, 5))
  println(Option(1) |+| none)
  val thing: Int => String = x => s"hello$x"
  val thing2: Int => String = x => s"world$x"
  val thing3 = thing |+| thing2
  // val thing4 = thing |+| egg
  println(thing3(4))
  println(("x", 4.3) |+| ("y", 7.8))
  println(Map("a" -> 1, "b" -> 3) |+| Map("a" -> 2))


  

