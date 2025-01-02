```scala
import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

class MyClass(implicit ec: ExecutionContext) {
  def myMethod(i: Int): Future[Int] = Future {
    if (i < 0) throw new IllegalArgumentException("i must be non-negative")
    i * 2
  }.recover { 
    case e: IllegalArgumentException => 0 // Handle the exception
  }
}
```