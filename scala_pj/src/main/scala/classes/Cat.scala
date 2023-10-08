package classes

/**
 * @author 道禹 Walter
 * @date 2023-10-08
 */
class Cat(name: String) extends Speaker, TailWagger, Runner:
  def speak(): String = "Meow"

  override def startRunning(): Unit = println("Yeah ... I don’t run")

  override def stopRunning(): Unit = println("No need to stop")
