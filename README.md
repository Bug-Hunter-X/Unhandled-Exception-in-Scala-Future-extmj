# Unhandled Exception in Scala Future

This repository demonstrates a common error in Scala: unhandled exceptions within `Future`s. The `bug.scala` file contains code that throws an `IllegalArgumentException` without proper handling, potentially leading to unexpected application behavior.

The `bugSolution.scala` file provides a solution that gracefully handles the exception, showcasing best practices for robust asynchronous code.