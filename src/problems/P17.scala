package problems

import java.util.HashMap
import java.net.URL
import java.util.Scanner
import utils.MathHelper

/**
 * @author Ronak
 *
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, 
 * how many letters would be used?
 */

object P17 {

  def main(args: Array[String]) {
    val url: URL = ClassLoader.getSystemResource("resources/P17.txt");
    val scanner: Scanner = new Scanner(url.openStream());

    var hash: HashMap[Int, String] = new HashMap[Int, String];
    var numeral: String = "";

    while (scanner.hasNextInt()) {
      hash.put(scanner.nextInt(), scanner.next());
    }

    hash.put(0, "");

    var sum: Int = 0;

    for (i <- 1 to 1000) {
      if (i <= 20) {
        sum += hash.get(i).length();
      } else if (i < 100) {
        numeral = hash.get(i - (i % 10)) + hash.get(i % 10);
        sum += numeral.length();
      } else if (i < 1000) {
        numeral = hash.get((i - (i % 100)) / 100);
        numeral += hash.get(100);
        if (i % 100 != 0) {
          numeral += "and";
          if ((i % 100) <= 20) {
            numeral += hash.get(i % 100);
          } else {
            numeral += hash.get((i % 100) - ((i % 100) % 10)) + hash.get((i % 100) % 10);
          }
        }

        sum += numeral.length();
      }

    }

    sum += hash.get(1).length();
    sum += hash.get(1000).length();

    println(sum);
  }

}