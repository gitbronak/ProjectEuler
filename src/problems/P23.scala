package problems

import utils.MathHelper
import scala.util.control.Breaks._
import java.util.ArrayList
import java.util.HashMap

/**
 * @author Ronak
 * 
 * Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 */

object P23 {
  def main(args: Array[String]) {

    var abnum: ArrayList[Int] = new ArrayList[Int];
    var sums: HashMap[Int, Boolean] = new HashMap[Int, Boolean];

    for (i <- 12 to 28123) {
      if (MathHelper.sumOfDivisors(i) > i)
        abnum.add(i);
      sums.put(i, false);
    }

    var total: Long = ((28123 * (28123 + 1) / 2));

    breakable {
      for (j <- 0 to abnum.size() - 1) {
        var x = abnum.get(j);
        var i = j;
        breakable {
          while (i < abnum.size() - 1) {
            var y = abnum.get(i);
            var z = x + y;
            if (z > 28123)
              break;
            if (!sums.get(z)) {
              sums.put(z, true);
            }

            i += 1;
          }

        }
      }
    }

    for (i <- 12 to 28123) {
      if (sums.get(i))
        total -= i;
    }

    println(total);
  }
}