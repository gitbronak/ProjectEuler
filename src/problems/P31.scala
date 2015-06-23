package problems

import java.util.ArrayList

/**
 * @author Ronak
 *
 * How many different ways can £2 be made using any number of coins?
 */

object P31 {
  def main(args: Array[String]) {
    println(waysCount(200, Array(1, 2, 5, 10, 20, 50, 100, 200)));
  }

  def waysCount(amount: Int, denomination: Array[Int]): Long = {

    var waz: Array[Long] = new Array[Long](amount + 1);
    waz(0) = 1;

    for (i <- 1 to amount) {
      waz(i) = 0;
    }

    for (j <- denomination) {
      for (i <- j to amount) {
        waz(i) = waz(i) + waz(i - j);
      }
    }

    return waz(amount);
  }

}