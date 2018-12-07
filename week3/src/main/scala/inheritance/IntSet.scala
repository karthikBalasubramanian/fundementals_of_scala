package inheritance

abstract class IntSet {
  /***
    * This method is to include an element to the set
    * @param x
    * @return
    */
  def incl(x: Int): IntSet

  /***
    * This element is to check if the element exists in the set
    * @param x
    * @return
    */
  def contains(x: Int): Boolean

  /***
    * Union of two sets
    * @param other
    * @return
    */
  def union(other: IntSet): IntSet
}
