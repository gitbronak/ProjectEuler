package utils

import java.math._
import java.util.HashMap

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
    if (x < 2)
      return false;
    if (x == 2)
      return true;
    else {
      var limit: Long = x;
      var index: Long = 2;

      while (index <= limit) {
        if (x % index == 0) {
          return false;
        }
        limit = x / index;
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

  /**
   * Find Pythagorean triplet using m and n when m<n
   *
   * a = n2 - m2
   * b = 2nm
   * c = n2 + m2
   *
   */
  def findPythagoreanTriplet(m: Int, n: Int): Array[Long] = {

    val a: Long = (Math.pow(n, 2) - Math.pow(m, 2)).toLong;
    val b: Long = 2 * n * m;
    val c: Long = (Math.pow(n, 2) + Math.pow(m, 2)).toLong;

    return Array(a, b, c);
  }

  def getNumberofDivisors(value: Long): Int = {
    var numOfDivisors: Int = 1;
    if (value > 1)
      numOfDivisors += 1;

    var limit: Long = value;
    var index: Long = 2;

    while (index < limit) {
      if (value % index == 0) {
        numOfDivisors += 1;
        if (index * index != value)
          numOfDivisors += 1;
      }
      limit = value / index;
      index += 1;
    }

    return numOfDivisors;
  }

  def getBigIntSum(arr: Array[BigInt]): BigInt = {
    var sum: BigInt = 0;

    for (i <- 0 to (arr.length - 1)) {
      sum += arr(i);
    }

    return sum;
  }

  /**
   * Collatz sequence of a number can be found by
   *
   * n → n/2 (n is even)
   * n → 3n + 1 (n is odd)
   *
   *
   */
  def getCollatzSequenceLength(value: Long, cacheHash: HashMap[Long, Long]): Long = {

    var len: Long = 0;
    var v:Long = value;

    while (v != 1) {
      if(v < value){
        cacheHash.put(value, cacheHash.get(v) + len);
        return cacheHash.get(v) + len;
      }
        
      if (v % 2 == 0)
        v /= 2;
      else
        v = (3 * v) + 1;
      len += 1;
    }
    
    cacheHash.put(value, len);
    return len;
  }
}