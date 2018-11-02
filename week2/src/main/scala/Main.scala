import SummationOf._
import ProductOf._
import Functions._
import GenericFunction._

object Main extends App{
  println(summationFunction(2,1,nota))
  println(summationFunction(3,5,squares))
  println(summationFunction(1,2,cubes))
  println(summationFunction(3,4,factorial))
  println(SummationOf.sum(squares)(3,5))
  println(ProductOf.product(squares)(3,5))
  println(productFactorial(4))
  println(mapReduce(nota, combine=Functions.product, zero=1 ) (1,5))
  println(mapReduce(squares, combine = Functions.sum, zero=0 )(2,3))
}
