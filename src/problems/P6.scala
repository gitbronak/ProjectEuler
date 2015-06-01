package problems

import utils.MathHelper

/**
 * @author Ronak
 */

object P6 {

  def main(args: Array[String]) {
    println(MathHelper.SquareOfSum(100) -
      MathHelper.sumOfSquares(100))
  }

}