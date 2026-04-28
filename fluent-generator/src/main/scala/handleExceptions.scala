import util.boundary.*
import scala.util.control.NonFatal

def handleExceptions[T](f: => T)(using l: Label[String]): T =
  try f
  catch
    case b: Break[String] => break(b.value)
    case NonFatal(exc)    => break(exc.toString())
