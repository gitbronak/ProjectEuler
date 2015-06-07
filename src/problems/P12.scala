package problems

import utils.MathHelper
import scala.util.control.Breaks._

/**
 * @author Ronak
 *
 * What is the value of the first triangle number to have over five hundred divisors?
 */

object P12 {

  def main(args: Array[String]) {
    var triNum: Long = 0;
    var index: Long = 1;

    breakable {
      while (true) {
        triNum += index;
        index += 1;
        if (MathHelper.getNumberofDivisors(triNum) > 500) {
          println(triNum);
          break;
        }
      }
    }

  }
}