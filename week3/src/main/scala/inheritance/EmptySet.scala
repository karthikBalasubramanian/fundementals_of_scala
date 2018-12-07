package inheritance

object EmptySet extends IntSet {
  /***
    * An empty set contains no element
    * So if we search for an integer in an empty set it always returns false.
    * @param x
    * @return
    */
  def contains(x: Int) = false

  /***
    * Empty set is a building block of the Set
    * Sets are represented as a Binary tree. This is a Binary tree implementation of Sets
    * Include creates a Node with an element.
    * Both Left and right subtrees to the element will form an emptySets
    * @param x
    * @return
    */
  def incl(x: Int): IntSet = new NonEmptySet(x, EmptySet, EmptySet)

  override def toString: String = "null"

  /** *
    * Union of two sets
    *
    * @param other
    * @return
    */
  override def union(other: IntSet): IntSet = other
}
