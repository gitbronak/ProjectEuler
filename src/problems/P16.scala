package problems

import utils.StringHelper

/**
 * @author Ronak
 *
 * What is the sum of the digits of the number 21000?
 */

object P16 {
  def main(args: Array[String]) {
    val str: String = BigInt(2).pow(1000).toString();
    println(StringHelper.findSum(str, 0, str.length()));
  }
}