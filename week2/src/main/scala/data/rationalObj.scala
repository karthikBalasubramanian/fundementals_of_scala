package data

object rationalObj extends App{

  val x = new Rational(1,3)
  val y = new Rational(5,7)
  val z = new Rational(3,2)
  println(x + y)
  println(y + y)
  println(x - y - z)
  println(x < y)
  println(x.max(y))
  // using second constructor
  println(new Rational(3))
}
