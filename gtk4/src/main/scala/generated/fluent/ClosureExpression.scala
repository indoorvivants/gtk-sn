package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Expression
import sn.gnome.gtk4.internal.GtkClosureExpression

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An expression using a custom `GClosure` to compute the value from its
  * parameters.
  */
class ClosureExpression(raw: Ptr[GtkClosureExpression])
    extends Expression(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ClosureExpression

object ClosureExpression:
  @annotation.compileTimeOnly(
    "Constructor new is weird: non NULL-terminated arrays require special handling"
  )
  def apply() = ???

end ClosureExpression
