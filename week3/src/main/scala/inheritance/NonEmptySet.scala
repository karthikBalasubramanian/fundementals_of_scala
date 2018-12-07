package inheritance

/***
  * Criteria of a Binary tree implementation of the Set is, The Tree is always sorted.
  * Subtree to left of the element is always smaller than element
  * and element in the right subtree is always greater
  * @param elem
  * @param left
  * @param right
  */
class NonEmptySet(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  /** *
    * checks if the element is present in the Set. Start from the top of the tree and traverse through the tree.
    * override is not mandatory
    * @param x
    * @return
    */
  def contains(x: Int): Boolean = {
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true
  }

  def incl(x: Int): IntSet = {
    // we are still purely functional. There are no mutations.
    // a subtree in the current node is recreated when we include
    // an element to the tree unless and until its not the same
    // element
    if (x < elem) new NonEmptySet(elem, left incl x, right)
    else if (x > elem) new NonEmptySet(elem, left, right incl x)
    else this
  }

  override def toString: String = "( " + left + " ) <= " + elem + " => ( " + right + " )"

  /** *
    * Union of two sets
    *
    * @param other
    * @return
    */
  override def union(other: IntSet): IntSet = ((left union right) union other) incl elem
}