package problems

import utils.MathHelper

/**
 * @author Ronak
 *
 * Find the sum of the digits in the number 100!
 */

object P20 {
  def main(arg: Array[String]) {

    println(MathHelper.digitSum(MathHelper.fact(100)));
    
  }
}