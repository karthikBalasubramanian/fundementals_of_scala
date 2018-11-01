object SummationOf extends App {
  def summationFunction(a: Int, b: Int, func: Int => Int): Int = if (a>b) 0 else func(a) + summationFunction(a+1, b, func)
  def nota(x: Int) = x
  def squares(x: Int): Int = x*x
  def cubes(x: Int): Int = x*x*x
  def factorial(x:Int): Int = if(x==1) 1 else x * factorial(x-1)

  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      println(acc)
      if (a>b) acc
      else loop(a+1, (f(a) + acc))
    }
    loop(a, 0)
  }
  println(summationFunction(2,1,nota))
  println(summationFunction(3,5,squares))
  println(summationFunction(1,2,cubes))
  println(summationFunction(3,4,factorial))
  println(sum(squares)(3,5))
}
