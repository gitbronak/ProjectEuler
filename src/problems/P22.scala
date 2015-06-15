package problems

import java.net.URL
import java.util.Scanner
import java.util.StringTokenizer
import java.util.ArrayList
import java.util.Collections
import java.util.Scanner
import utils.StringHelper

/**
 * @author Ronak
 *
 * What is the total of all the name scores in the file?
 */

object P22 {
  def main(args: Array[String]) {
    val url: URL = ClassLoader.getSystemResource("resources/P22.txt");
    val scanner: Scanner = new Scanner(url.openStream());

    val names: String = scanner.next();
    val tokenz: StringTokenizer = new StringTokenizer(names, ",");
    var nameList: ArrayList[String] = new ArrayList[String];
    var nameScore: Long = 0;

    while (tokenz.hasMoreElements()) {
      nameList.add(tokenz.nextToken())
    }

    Collections.sort(nameList);

    for (i <- 0 to nameList.size() - 1) {
      nameScore += ((i + 1) * StringHelper.alphaValue(nameList.get(i).substring(1,
        nameList.get(i).length() - 1)));
    }

    println(nameScore);

  }
}