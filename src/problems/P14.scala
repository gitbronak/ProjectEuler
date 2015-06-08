package problems

import utils.MathHelper
import java.util._

/**
 * @author Ronak
 *
 * Collatz Sequence:
 * Which starting number, under one million, produces the longest chain?
 */

object P14 {

  def main(args: Array[String]) {
    var timess: Long = System.currentTimeMillis;
    var longS: Long = 0;
    var longNum: Int = 0;

    var i: Int = 1;
    var temp: Long = 0;
    var cache:HashMap[Long, Long] = new HashMap[Long,Long];
    
    while (i < 1000000) {
      temp = MathHelper.getCollatzSequenceLength(i, cache);
      if (temp > longS) {
        longS = temp;
        longNum = i;
      }

      i += 1
    }

    println(longNum);
    var timese: Long = System.currentTimeMillis;
    println("Run Time: " + (timese - timess));
  }
}