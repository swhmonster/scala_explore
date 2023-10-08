package classes

import traits.Speaker
import traits.Runner
import traits.TailWagger

/**
 * @author 道禹 Walter
 */
class Cat(name: String) extends Speaker, TailWagger, Runner:
  def speak(): String = "Meow"

  override def startRunning(): Unit = println("Yeah ... I don’t run")

  override def stopRunning(): Unit = println("No need to stop")
