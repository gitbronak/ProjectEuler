package problems

/**
 * @author Ronak
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
 * find the sum of the even-valued terms
 */
object P2 {
  def main(args: Array[String]) {
    var prev:Integer = 1;
    var temp:Integer = 0;
    var sum:Integer = 0;
    var a = 1;
    while(a < 4000000)
    {
      temp = a;
      a = a + prev;
      if(a%2 == 0)
        sum += a;
      prev = temp;
    }
    
    println(sum);
  }
}