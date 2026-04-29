package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Expression
import sn.gnome.gtk4.internal.GtkCClosureExpression

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A variant of `GtkClosureExpression` using a C closure.
  */
class CClosureExpression(raw: Ptr[GtkCClosureExpression])
    extends Expression(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CClosureExpression

object CClosureExpression:
  @annotation.compileTimeOnly(
    "Constructor new is weird: non NULL-terminated arrays require special handling"
  )
  def apply() = ???

end CClosureExpression
