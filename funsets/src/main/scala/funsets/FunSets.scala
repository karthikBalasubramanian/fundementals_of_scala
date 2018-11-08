package funsets


/**
 * 2. Purely Functional Sets.
 */
object FunSets {
  /**
   * We represent a set by its characteristic function, i.e.
   * its `contains` predicate.
   */
  // type represents an anonymous function Int => Boolean
  type Set = Int => Boolean

  /**
   * Indicates whether a set contains a given element.
   */
  def contains(s: Set, elem: Int): Boolean = s(elem)

  /**
   * Returns the set of the one given element.
   */
  // This is how a set is created. any integer if matxhes the parameter of the method, it returns true.
  // This method returns a Set definition. An integer giving a boolean.
    def singletonSet(elem: Int): Set = (x: Int) => x==elem
  

  /**
   * Returns the union of the two given sets,
   * the sets of all elements that are in either `s` or `t`.
   */
  // a method to check if an element belongs to either Set S or Set t
  // this method returns a type Set. (Int) => Boolean
    def union(s: Set, t: Set): Set = (x: Int) => s(x) | t(x)
  
  /**
   * Returns the intersection of the two given sets,
   * the set of all elements that are both in `s` and `t`.
   */
    def intersect(s: Set, t: Set): Set = (x: Int) => s(x) & t(x)
  
  /**
   * Returns the difference of the two given sets,
   * the set of all elements of `s` that are not in `t`.
   */

    def compliment(s:Set): Set = (x: Int) => !s(x)
    def diff(s: Set, t: Set): Set = (x: Int) => s(x) & !t(x)
  
  /**
   * Returns the subset of `s` for which `p` holds.
    * Filter a set based on a predicate. A predicate can be an anonymous function with Int => Boolean
   */
    def filter(s: Set, p: Int => Boolean): Set = (x: Int) => s(x) & p(x)
  

  /**
   * The bounds for `forall` and `exists` are +/- 1000.
   */
  val bound = 1000

  /**
   * Returns All the elements in the set for which the predicate holds good.
    * It continues to run until the predicate does not hold good.
   */
    def forall(s: Set, p: Int => Boolean): Boolean = {
    def iter(a: Int): Boolean = {
      if (a > bound) true
      else if (s(a) & !p(a)) false
      else iter(a + 1)
    }
    iter(-bound)
  }
  
  /**
   * Returns whether there exists a bounded integer within `s`
   * that satisfies `p`.
   */
    def exists(s: Set, p: Int => Boolean): Boolean = {
     !forall(s, (x: Int) => !p(x))
  }
  /**
   * Returns a set transformed by applying `f` to each element of `s`.
   */
    // from  a given boundary -1000 to 1000 find all the elements in the set whose "mapped" functional transformation is
    // also present in the bound
    // expressed as - map a function which has Int input and returns an int output on a Set and return only those
    // elements that follow the predicate.  
    def map(s: Set, f: Int => Int): Set = (a: Int) => exists(s, (b: Int) => f(b) == a)
  
  /**
   * Displays the contents of a set
   */
  // this method is not overridden
  def toString(s: Set): String = {
    val xs = for (i <- -bound to bound if contains(s, i)) yield i
    xs.mkString("{", ",", "}")
  }

  /**
   * Prints the contents of a set on the console.
   */
  // whenever we run printSet,
  // Type is part of set is validated from range -1000 to 1000
  // which ever value is true, those are returned as a vector and then to A string
  def printSet(s: Set) {
    println(toString(s))
  }
}
