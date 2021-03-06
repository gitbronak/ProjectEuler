package utils

import java.util.ArrayList;

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

  /**
   * Find Sum of 'x' consecutive digits in a String starting index 'start'
   */
  def findSum(input: String, start: Int, x: Int): Long = {
    var sum: Long = 0;
    var i = 0;
    var range: Int = start + x - 1;
    for (i <- start to range) {
      sum = sum + input.charAt(i).asDigit;
    }
    return sum;
  }

  /**
   * Get AlphaValue of a String
   * Eg: aby = 1 + 2 + 25 =  28
   *
   */
  def alphaValue(str: String): Long = {
    var alpha: Long = 0;
    for (c <- str) {
      alpha += c.toUpper.toInt - 64;
    }

    return alpha;
  }

  def permutation(prefix: String = "", str: String): ArrayList[String] = {
    var n: Int = str.length();
    var perm: ArrayList[String] = new ArrayList[String];

    if (n == 0)
      perm.add(prefix);
    else {
      for (i <- 0 to n - 1)
        perm.addAll(permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n)));
    }

    return perm;
  }

}