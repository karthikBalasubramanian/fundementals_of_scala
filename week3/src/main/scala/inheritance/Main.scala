package inheritance

object Main extends App {

  val one = new NonEmptySet(1 ,  EmptySet,  EmptySet)
  val t2 = one incl 2
  println(one)
  println(t2)
}
