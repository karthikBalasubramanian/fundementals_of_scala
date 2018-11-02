object SummationOf extends App {


  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      println(acc)
      if (a>b) acc
      else loop(a+1, (f(a) + acc))
    }
    loop(a, 0)
  }

}
