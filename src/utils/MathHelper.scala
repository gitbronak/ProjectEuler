package utils

/**
 * @author ronak
 */

object MathHelper {

  def gcd(x: Int, y: Int): Int = {
    if (y == 0)
      return x;
    return gcd(y, x % y);
  }
  
  def lcm(x: Int, y: Int): Int = {
    return (x*y)/gcd(x,y);
  }
}