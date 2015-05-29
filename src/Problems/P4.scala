package Problems

import scala.util.control._

/**
 * @author Ronak
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
object P4 {
  def main(args: Array[String]) {
    
  }

  def isPalindrome(number: Int): Boolean = {

    var str: String = number.toString();
    var revstr: String = str.reverse.toString();
    return str.equals(revstr);
  }
}