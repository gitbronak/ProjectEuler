package problems

/**
 * @author Ronak
 *
 * How many routes are there through a 20×20 grid to get from (0,0) to (20,20)?
 */

object P15 {
  def main(args: Array[String]) {
    var matrix = Array.ofDim[Long](21, 21);

    for (i <- 0 to 20) {
      for (j <- 0 to 20) {
        matrix(i)(j) = 0;
      }
    }

    matrix(0)(0) = 1;

    for (i <- 0 to 20) {
      for (j <- 0 to 20) {
        if (i < 20)
          matrix(i + 1)(j) += matrix(i)(j);
        if (j < 20)
          matrix(i)(j + 1) += matrix(i)(j);
      }
    }

    println(matrix(20)(20));
  }
}