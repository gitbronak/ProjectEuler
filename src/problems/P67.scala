package problems

import java.util.ArrayList
import java.net.URL
import java.util.Scanner
import utils.MathHelper

/**
 * @author Ronak
 *
 * Find the maximum total from top to bottom of the triangle.
 */

object P67 {

  def main(args: Array[String]) {

    val url: URL = ClassLoader.getSystemResource("resources/P67.txt");
    val scanner: Scanner = new Scanner(url.openStream());

    var arr: ArrayList[Int] = new ArrayList[Int];

    while (scanner.hasNextInt()) {
      arr.add(scanner.nextInt());
    }

    println(MathHelper.maxTriangleSum(arr));
  }

}