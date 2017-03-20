package example

import scala.meta._

class foo extends scala.annotation.StaticAnnotation {
  inline def apply(defn: Any): Any = meta {
    defn match {
      case q"object $name { ..$stats }" =>
        q"""
        object $name {
          val foo: Int = 1
          val bar: String = "bar"
          ..$stats
        }
        """
      case _ =>
        abort("@test must annotate an object.")
    }
  }
}
