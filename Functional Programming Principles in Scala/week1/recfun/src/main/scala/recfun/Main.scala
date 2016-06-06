package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
    if(c==0 || c==r) return 1;
    else return pascal(c-1,r-1)+pascal(c,r-1);
  }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def helper(flag:Int, chars:List[Char]):Boolean={
        if(chars.isEmpty) return flag==0;
        if(chars.head=='(' )helper(flag+1, chars.tail)
        else  if (chars.head==')')  return ( flag > 0 && helper(flag-1, chars.tail));
        else helper(flag, chars.tail);
      }
    helper(0,chars)
  }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
        if(coins.isEmpty || money <0) return 0;
        if(money==0) return 1;
        countChange(money,coins.tail)+ countChange(money-coins.head, coins)
    }
  }

