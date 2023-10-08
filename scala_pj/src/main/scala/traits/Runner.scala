package traits

/**
 * @author 道禹 Walter
 * @date 2023-10-08
 */
trait Runner:
  def startRunning(): Unit = println("I’m running")

  def stopRunning(): Unit = println("Stopped running")
