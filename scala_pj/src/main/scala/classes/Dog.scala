package classes

import traits.Speaker

/**
 * @author 道禹 Walter
 */
class Dog(name: String) extends Speaker:
  def speak(): String = "Woof!"