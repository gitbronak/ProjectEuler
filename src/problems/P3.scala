package problems

/**
 * @author Ronak
 * 
 * What is the largest prime factor of the number 600851475143 ?
 * 
 */
object P3 {
  def main(args: Array[String]) {
    var value = 600851475143L;
    var factor = 2L;
    
    while(value > factor) {
      if(value % factor == 0){
        value = value/factor;
      }
      factor+=1;
    }
    println(value);
  }
}