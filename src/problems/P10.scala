package problems

import utils.MathHelper

/**
 * @author Ronak
 *
 * Find the sum of all the primes below two million.
 */

object P10 {
  def main(args: Array[String]) {
    var sum: Long = 2;

    var i = 0;
    for (i <- 3 to 2000000 by 2) {
      if (MathHelper.isPrime(i)) {
        sum += i;
      }
    }
    println(sum);
  }
}