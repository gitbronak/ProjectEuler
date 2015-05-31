package problems

import utils.MathHelper

/**
 * @author Ronak
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

object P5 {

  def main(args: Array[String]) {
    println(lowestMultiple(20));
  }

  def lowestMultiple(x: Int): Long = {
    if (x == 0)
      return -1;
    if (x == 1)
      return 1;
    
    var index: Int = 2;
    var multiple:Long = 1;
    
    while (index <= x) {
      multiple = MathHelper.lcm(index, multiple);
      index += 1;
    }
    return multiple;
  }

}