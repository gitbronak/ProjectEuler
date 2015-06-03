package problems

import utils.MathHelper

/**
 * @author Ronak
 */

object P7 {
  def main(args: Array[String]) {
    val n:Int = 10001; 
    var prime:Int = 1;
    
    var index:Long = 3;
    
    while(prime < n){
      if(MathHelper.isPrime(index)){
         prime+=1;
      }
      index+=2;
    }
    println(index - 2);
  }
}