package funsets


/**
 * 2. Purely Functional Sets.
 */
object FunSets {
  /**
   * We represent a set by its characteristic function, i.e.
   * its `contains` predicate.
   */
<<<<<<< HEAD
=======
  // type represents an anonymous function Int => Boolean
>>>>>>> b07060fc87681a75c9fc8691c803e6d847cc34b8
  type Set = Int => Boolean

  /**
   * Indicates whether a set contains a given element.
   */
  def contains(s: Set, elem: Int): Boolean = s(elem)

  /**
   * Returns the set of the one given element.
   */
<<<<<<< HEAD
    def singletonSet(elem: Int): Set = ???
=======
  // This is how a set is created. any integer if matxhes the parameter of the method, it returns true.
  // This method returns a Set definition. An integer giving a boolean.
    def singletonSet(elem: Int): Set = (x: Int) => x==elem
>>>>>>> b07060fc87681a75c9fc8691c803e6d847cc34b8
  

  /**
   * Returns the union of the two given sets,
   * the sets of all elements that are in either `s` or `t`.
   */
<<<<<<< HEAD
    def union(s: Set, t: Set): Set = ???
=======
  // a method to check if an element belongs to either Set S or Set t
  // this method returns a type Set. (Int) => Boolean
    def union(s: Set, t: Set): Set = (x: Int) => s(x) | t(x)
>>>>>>> b07060fc87681a75c9fc8691c803e6d847cc34b8
  
  /**
   * Returns the intersection of the two given sets,
   * the set of all elements that are both in `s` and `t`.
   */
<<<<<<< HEAD
    def intersect(s: Set, t: Set): Set = ???
=======
    def intersect(s: Set, t: Set): Set = (x: Int) => s(x) & t(x)
>>>>>>> b07060fc87681a75c9fc8691c803e6d847cc34b8
  
  /**
   * Returns the difference of the two given sets,
   * the set of all elements of `s` that are not in `t`.
   */
<<<<<<< HEAD
    def diff(s: Set, t: Set): Set = ???
  
  /**
   * Returns the subset of `s` for which `p` holds.
   */
    def filter(s: Set, p: Int => Boolean): Set = ???
=======

    def compliment(s:Set): Set = (x: Int) => !s(x)
    def diff(s: Set, t: Set): Set = (x: Int) => s(x) & !t(x)
  
  /**
   * Returns the subset of `s` for which `p` holds.
    * Filter a set based on a predicate. A predicate can be an anonymous function with Int => Boolean
   */
    def filter(s: Set, p: Int => Boolean): Set = (x: Int) => s(x) & p(x)
>>>>>>> b07060fc87681a75c9fc8691c803e6d847cc34b8
  

  /**
   * The bounds for `forall` and `exists` are +/- 1000.
   */
  val bound = 1000

  /**
<<<<<<< HEAD
   * Returns whether all bounded integers within `s` satisfy `p`.
   */
    def forall(s: Set, p: Int => Boolean): Boolean = {
    def iter(a: Int): Boolean = {
      if (???) ???
      else if (???) ???
      else iter(???)
    }
    iter(???)
=======
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
>>>>>>> b07060fc87681a75c9fc8691c803e6d847cc34b8
  }
  
  /**
   * Returns whether there exists a bounded integer within `s`
   * that satisfies `p`.
   */
<<<<<<< HEAD
    def exists(s: Set, p: Int => Boolean): Boolean = ???
  
  /**
   * Returns a set transformed by applying `f` to each element of `s`.
   */
    def map(s: Set, f: Int => Int): Set = ???
=======
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
>>>>>>> b07060fc87681a75c9fc8691c803e6d847cc34b8
  
  /**
   * Displays the contents of a set
   */
<<<<<<< HEAD
=======
  // this method is not overridden
>>>>>>> b07060fc87681a75c9fc8691c803e6d847cc34b8
  def toString(s: Set): String = {
    val xs = for (i <- -bound to bound if contains(s, i)) yield i
    xs.mkString("{", ",", "}")
  }

  /**
   * Prints the contents of a set on the console.
   */
<<<<<<< HEAD
=======
  // whenever we run printSet,
  // Type is part of set is validated from range -1000 to 1000
  // which ever value is true, those are returned as a vector and then to A string
>>>>>>> b07060fc87681a75c9fc8691c803e6d847cc34b8
  def printSet(s: Set) {
    println(toString(s))
  }
}
