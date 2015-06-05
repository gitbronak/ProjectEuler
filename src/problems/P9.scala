package problems

import scala.util.control.Breaks._
import scala.Array
import utils.MathHelper

/**
 * @author Ronak
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

object P9 {

  def main(args: Array[String]) {
    var n: Int = 2;

    breakable {
      while (true) {
        var m: Int = 1;

        while (m < n) {
          val triplets: Array[Long] = MathHelper.findPythagoreanTriplet(m, n);
          var sum: Long = 0;
          var product: Long = 1;
          var i = 0;

          while (i < triplets.length) {
            sum += triplets(i);
            product *= triplets(i);
            i += 1;
          }

          if (sum == 1000) {
            println(product);
            break;
          }

          m += 1;
        }
        n += 1;
      }

    }
  }
}