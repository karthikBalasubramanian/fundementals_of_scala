import scala.annotation.tailrec
// how newton squareroot is calculated?
// start a guess with 1
// let number be x
// x / guess = output
// if abs(output *output) == x terminate
// else call squareroot (x , mean(x, output)



def sqrt(number: Double): Double = {
  def sqrtIter(guess: Double): Double =
    if (isGoodGuess(guess)) guess else sqrtIter(improve(guess))

  def isGoodGuess(guess: Double): Boolean = {
    Math.abs((guess * guess) - number ) / number < 0.001
  }

  def improve(guess: Double): Double =
    (guess + (number/ guess))/2
  sqrtIter(1.0)
}


sqrt(1e6)

def factorial(a: Int): Int = {
  @tailrec
  def loop(acc: Int, x: Int): Int = {
    if (x==0) acc
    else loop(acc*x, x-1)
  }
  loop(1,a)
}
factorial(4)