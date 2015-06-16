package problems

/**
 * @author Ronak
 *
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */

object P19 {
  def main(args: Array[String]) {
    var day: Int = 367; // 1900 would be leap year
    var year: Int = 1901; // Starting from 1901
    var month: Int = 1;
    var numOfSundays = 0;

    while (year < 2001) {
      month = 1;
      while (month <= 12) {
        if (day % 7 == 0)
          numOfSundays += 1;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
          day += 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
          day += 30;
        } else {
          if (isLeapYear(year)) {
            day += 29;
          } else
            day += 28;
        }
        month += 1;
      }
      year += 1;
    }

    println(numOfSundays);
  }

  def isLeapYear(year: Int): Boolean = {
    if (year % 4 == 0) {
      if (year % 100 == 0 && year % 400 != 0)
        return false;
      return true;
    }
    return false;
  }
}