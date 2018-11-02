import ProductOf._
object Functions {
  def summationFunction(a: Int, b: Int, func: Int => Int): Int ={
    if (a>b) 0 else func(a) + summationFunction(a+1, b, func)
  }

  def sum(a: Int, b: Int) : Int = a+b
  def product(a: Int, b: Int) : Int = a*b
  def nota(x: Int) = x
  def squares(x: Int): Int = x*x
  def cubes(x: Int): Int = x*x*x
  // for factorial linear recursion is better than tail recursion
  def factorial(x:Int): Int = if(x==1) 1 else x * factorial(x-1)
  def productFactorial(n: Int): Int = ProductOf.product(nota)(1, n)
}
