package utils

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
}