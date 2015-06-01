package utils

import java.math._

/**
 * @author Ronak
 */

object MathHelper {

  def gcd(x: Long, y: Long): Long = {
    if (y == 0)
      return x;
    return gcd(y, x % y);
  }

  def lcm(x: Long, y: Long): Long = {
    return (x * y) / gcd(x, y);
  }

  def isPrime(x: Long): Boolean = {
    if (x == 2)
      return true;
    else {
      var limit: Long = x;
      var index: Long = 2;

      while (index < limit) {
        if (x % index == 0) {
          return false;
        }
        limit = limit / index;
        index += 1;
      }
    }
    return true;
  }

  def sumOfSquares(range: Int): Long = {

    var sum: Long = 0;

    for (i <- 1 to range) {
      sum += (Math.pow(i, 2)).toLong;
    }
    return sum;
  }

  def SquareOfSum(range: Int): Long = {
    val half: Double = range / 2;

    val sum: Long = ((1 + range) * half).toLong;

    return (Math.pow(sum, 2)).toLong;
  }
}