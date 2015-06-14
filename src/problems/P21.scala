package problems

import utils.MathHelper

/**
 * @author Ronak
 *
 * Evaluate the sum of all the amicable numbers under 10000.
 */

object P21 {
  def main(args: Array[String]) {
    var sum: Long = 0;
    var sumOfDivisors: Long = -1;

    for (i <- 1 to 10000) {
      sumOfDivisors = MathHelper.sumOfDivisors(i);
      if (sumOfDivisors != i) {
        if (MathHelper.sumOfDivisors(sumOfDivisors) == i) {
          sum += i;
        }
      }

    }

    println(sum);

  }
}