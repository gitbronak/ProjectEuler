package problems

/**
 * @author Ronak
 * 
 * Multiples of 3 and 5
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
object P1 {
     def main(args: Array[String]) {
       
       var max:Integer = 999;
       var sum:Integer = 0;
       
       for(i <- 3 to max by 3){
            sum+=i;
            println(i);
       }
       
       for(j <- 5 to max by 5){
            if(j%3 !=0){
              sum+=j;
              println(j);
            }
       }
       println(sum);
     }
}