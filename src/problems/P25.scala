package problems

import utils.MathHelper
import scala.util.control.Breaks._

/**
 * @author Ronak
 *
 * What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 */

object P25 {
  def main(args: Array[String]) {
    breakable {
      var index: Int = 3;
      var i1: BigInt = 1;
      var i2: BigInt = 1;
      var temp: BigInt = 1;
      while (true) {
        temp = MathHelper.fibonacci(index, i1, i2);
        i2 = i1;
        i1 = temp;
        if (i1.toString().length() >= 1000) {
          println(index);
          break;
        }
        index += 1;
      }
    }
  }
}