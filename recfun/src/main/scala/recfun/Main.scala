package recfun

import scala.collection.mutable.ListBuffer

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
    println(balance(":-)".toList))
    println(balance("(if (zero? x) max (/ 1 x))".toList))
    println(countChange(4, List(1,2)))

  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c==0 || c==r) 1
      else pascal(c-1, r-1) + pascal(c, r-1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def balanceRemaining(chars: List[Char], openParanthesis: Int): Boolean = {
        if(chars.isEmpty){
          openParanthesis==0
        }else{
          val charAtHead = chars.head
          val currOpenParanthesis = if (charAtHead == '(') openParanthesis + 1 else if (charAtHead == ')') openParanthesis-1 else openParanthesis
          if (currOpenParanthesis >=0) balanceRemaining(chars.tail, currOpenParanthesis)
          else false
        }
      }
      balanceRemaining(chars, 0)
    }
  
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def f(lastMaxCoin_total_coll: List[(Int, Int)], count: Int): Int = {
      if (lastMaxCoin_total_coll.isEmpty) {
        count
      } else {
        val b = ListBuffer[(Int, Int)]()
        var newCount = count
        for ((lastMaxCoin, total) <- lastMaxCoin_total_coll) {
          if (total < money) {
            for (c <- coins) {
              if (c >= lastMaxCoin) {
                val e = (c, total + c)
                b += e
              }
            }
          } else if (total == money) {
            newCount += 1
          }
        }

        f(b.toList, newCount)
      }
    }

    val b = coins.map { c => (c, c) }
    println(b)
    f(b, 0)
  }

  }
