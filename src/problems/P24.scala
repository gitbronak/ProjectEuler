package problems

import java.util.ArrayList

import utils.StringHelper

/**
 * @author Ronak
 *
 *
 */

object P24 {
  def main(args: Array[String]) {
    var x: ArrayList[String] = StringHelper.permutation(str = "0123456789");
    println(x.get(999999));
  }
}