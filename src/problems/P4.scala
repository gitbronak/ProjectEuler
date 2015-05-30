package problems

import scala.util.control._
import utils.StringHelper

/**
 * @author Ronak
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

object P4 {
  
  def main(args: Array[String]) {
    var timess: Long = System.currentTimeMillis;
    println(solution1());
    var timese: Long = System.currentTimeMillis;
    println("Run Time: " + (timese - timess));

    timess = System.currentTimeMillis;
    println(solution2());
    timese = System.currentTimeMillis;
    println("Run Time: "  + (timese - timess));

  }

  def solution2(): Int = {
    var value: Int = 999 * 999;
    var min: Int = 10001;

    while (value > min) {
      if (StringHelper.isPalindrome(value)) {
        for (i <- 999 to 99 by -1) {
          if (value % i == 0) {
            if (value / i > 99 && value / i < 999) {
              return value;
            }
          }
        }
      }
      value -= 1;
    }

    return 0;
  }

  def solution1(): Int = {
    var x: Int = 999;
    var limit: Int = 99;
    var palindromes = List[Int]();

    while (x > limit) {

      val loop = new Breaks;
      var y: Int = 999;

      loop.breakable {
        while (y > limit) {
          var product: Int = x * y;
          if (StringHelper.isPalindrome(product)) {
            palindromes = palindromes.++(List[Int](product));
            limit = y;
            loop.break();
          }
          y -= 1;
        }
      }
      x -= 1;
    }
    return palindromes.max;
  }
}