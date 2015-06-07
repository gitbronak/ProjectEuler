package problems

import java.io._
import java.net._
import java.util._

/**
 * @author Ronak
 *
 * What is the greatest product of four adjacent numbers in the same direction in the 20×20 grid?
 */

object P11 {
  def main(args: Array[String]) {

    val url: URL = ClassLoader.getSystemResource("resources/P11.txt");
    val scanner: Scanner = new Scanner(url.openStream());

    var arr = Array.ofDim[Int](20, 20);

    var i = 0;
    var j = 0;
    for (i <- 0 to 19) {
      for (j <- 0 to 19) {
        arr(i)(j) = scanner.nextInt();
      }
    }

    var maxProd: Long = 0;
    var prod: Long = 0;

    for (i <- 0 to 19) {
      for (j <- 0 to 19) {
        if (arr(i)(j) != 0) {
          if (j + 3 <= 19) {
            prod = arr(i)(j) * arr(i)(j + 1) * arr(i)(j + 2) * arr(i)(j + 3);
            if (prod > maxProd)
              maxProd = prod;
          }
          if (i + 3 <= 19) {
            prod = arr(i)(j) * arr(i + 1)(j) * arr(i + 2)(j) * arr(i + 3)(j);
            if (prod > maxProd)
              maxProd = prod;
          }
          if (j + 3 <= 19 && i + 3 <= 19) {
            prod = arr(i)(j) * arr(i + 1)(j + 1) * arr(i + 1)(j + 2) * arr(i + 1)(j + 3);
            if (prod > maxProd)
              maxProd = prod;
          }
          if (j - 3 >= 0 && i + 3 <= 19) {
            prod = arr(i)(j) * arr(i + 1)(j - 1) * arr(i + 2)(j - 2) * arr(i + 3)(j - 3);
            if (prod > maxProd)
              maxProd = prod;
          }
        }
      }
    }

    println(maxProd);
  }
}