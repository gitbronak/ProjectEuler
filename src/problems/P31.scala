package problems

import java.util.HashMap

/**
 * @author Ronak
 * 
 * 
 */


object P31 {
  def main(args: Array[String]) {
    println(waysCount(3));
  }

  def waysCount(amount: Int, cacheHash: HashMap[Int, Long] = new HashMap[Int, Long]): Long = {
    if (amount == 0)
      return 1;
    else if (amount < 0)
      return 0;
    else {
      var count: Long = 0;

      if (cacheHash.containsKey(amount))
        return cacheHash.get(amount);

      count += waysCount(amount - 200, cacheHash);
      if (count != 0)
        cacheHash.put(amount - 200, count);

      count += waysCount(amount - 100, cacheHash);
      if (count != 0)
        cacheHash.put(amount - 100, count);

      count += waysCount(amount - 50, cacheHash);
      if (count != 0)
        cacheHash.put(amount - 50, count);

      count += waysCount(amount - 20, cacheHash);
      if (count != 0)
        cacheHash.put(amount - 20, count);

      count += waysCount(amount - 10, cacheHash);
      if (count != 0)
        cacheHash.put(amount - 10, count);

      count += waysCount(amount - 5, cacheHash);
      if (count != 0)
        cacheHash.put(amount - 5, count);

      count += waysCount(amount - 2, cacheHash);
      if (count != 0)
        cacheHash.put(amount - 2, count);

      count += waysCount(amount - 1, cacheHash);
      if (count != 0)
        cacheHash.put(amount - 1, count);

      println(cacheHash);
      return count;
      
    }
    return 0;
  }

}