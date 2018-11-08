package funsets

object Main extends App {
  import FunSets._
  val s1 = singletonSet(1)
  printSet(s1)
  val s2 = singletonSet(2)
  printSet(s2)
  val s3 = singletonSet(999)
  val s12 = union(s1, s2)
  val s13 = union(s1, s3)
  val s23 = union(s2, s3)
  val s123 = union(s12, s23)
  //printSet(compliment(s123))
  println(contains(singletonSet(1), 1))
  printSet(union(singletonSet(4), singletonSet(4)))
  printSet(intersect(singletonSet(elem = 4), singletonSet(elem = 4)))
  printSet(diff(singletonSet(elem = 3), singletonSet(elem = -1)))
  def predicate(x: Int): Boolean = x<6
  //printSet(filter(compliment(s123),(x:Int)=> x%2==0))
  println(forall(compliment(s123), (x: Int)=> x !=2 || x!=3))
  def square(x: Int): Int = x * x * x
  printSet(map(s123, square))
}
