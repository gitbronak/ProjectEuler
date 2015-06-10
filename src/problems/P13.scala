package problems

import java.net.URL
import java.util.Scanner
import utils.MathHelper

/**
 * @author Ronak
 *
 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 */

object P13 {
  def main(args: Array[String]) {

    val url: URL = ClassLoader.getSystemResource("resources/P13.txt");
    val scanner: Scanner = new Scanner(url.openStream());

    var arr = Array.ofDim[BigInt](100);

    for (i <- 0 to 99) {
      arr(i) = scanner.nextBigInteger();
    }

    val str: String = MathHelper.getBigIntSum(arr).toString();

    println(str.substring(0, 10));

  }
}