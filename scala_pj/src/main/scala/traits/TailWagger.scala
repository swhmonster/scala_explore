package traits

/**
 * @author 道禹 Walter
 * @date 2023-10-08
 */
trait TailWagger:
  def startTail(): Unit = println("tail is wagging")

  def stopTail(): Unit = println("tail is stopped")
