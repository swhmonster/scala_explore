package classes

import traits.Speaker

/**
 * @author 道禹 Walter
 * @date 2023-10-08
 */
class Dog(name: String) extends Speaker:
  def speaker(): String = "Woof!"