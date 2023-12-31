import classes.{Cat, Dog}

import scala.io.StdIn.readLine

@main def m() =
  println("Hello wolrd! Pls enter your name:")
  val name = readLine()
  println("Hello, " + name + "!")
  println(s"Hello, $name!")
  val quote ="""The essence of Scala:
                 Fusion of functional and object-oriented
                 programming in a typed setting."""
  println(quote)

  val ints = List(1, 2, 3, 4, 5)
  for i <- ints do println(i)

  val d = Dog("Rover")
  println(d.speak()) // prints "Woof!"

  val c = Cat("Morris")
  println(c.speak()) // "Meow"
  c.startRunning() // "Yeah ... I don’t run"
  c.stopRunning()