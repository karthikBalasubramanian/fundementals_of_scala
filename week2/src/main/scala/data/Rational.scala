package data

class Rational(x: Int, y: Int) {
  // require enforces a precondition on the caller of the function
  require(y != 0, "denominator must be non zero")

  // second constructor
  def this(x: Int) = this(x, 1)
  private def gcd(a: Int, b: Int): Int = if (b==0) a else gcd(b, a % b)
  val numer: Int = x / gcd(x,y)
  val denom: Int = y / gcd(x,y)
  def < (that: Rational): Boolean = this.numer * that.denom < that.numer*this.denom
  def max(that: Rational): Rational = if (this < that) that else this
  def + (another: Rational): Rational={
    new Rational((numer * another.denom + denom *another.numer),denom*another.denom )
  }
  // this will be a prefix operator
  def unary_- : Rational = new Rational(-numer, denom)

  def - (another: Rational): Rational = this + -another

  override def toString: String = numer + "/" + denom

}
