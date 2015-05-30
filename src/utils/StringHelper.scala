package utils

/**
 * @author Ronak
 */

object StringHelper {

  def isPalindrome(number: Int): Boolean = {

    var str: String = number.toString();
    var revstr: String = str.reverse.toString();
    return str.equals(revstr);
  }

}