object GenericFunction {

  def mapReduce(f: Int=> Int, combine: (Int, Int)=> Int, zero: Int) (x: Int, y: Int): Int = {
    if(x > y) zero
    else combine(f(x), mapReduce(f, combine, zero)(x+1,y))
  }

}
