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

  /**
   * Finds the Maximum product of 'x' consecutive digits in the string of digits 'token'
   */
  def findMaxProduct(token: String, x: Int): Long = {

    var maxProd: Long = findProduct(token, 0, x);
    var index: Int = x;
    var prod: Long = maxProd;

    while (index < token.length()) {
      prod = (prod / token.charAt(index - x).asDigit) * token.charAt(index).asDigit;
      if (prod > maxProd)
        maxProd = prod;
      index += 1;
    }

    return maxProd;
  }

  /**
   * Find Product of 'x' consecutive digits in a String starting index 'start'
   */
  def findProduct(input: String, start: Int, x: Int): Long = {
    var prod: Long = 1;
    var i = 0;
    var range: Int = start + x - 1;
    for (i <- start to range) {
      prod = prod * input.charAt(i).asDigit;
    }
    return prod;
  }

}