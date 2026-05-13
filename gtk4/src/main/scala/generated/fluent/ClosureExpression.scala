package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.Expression
import sn.gnome.gtk4.internal.GtkClosureExpression

/** An expression using a custom `GClosure` to compute the value from its
  * parameters.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ClosureExpression private[gnome] (raw: Ptr[GtkClosureExpression])
    extends Expression(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ClosureExpression

object ClosureExpression:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkClosureExpression])(using Runtime) =
    summon[Runtime].getOrCreate[ClosureExpression](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ClosureExpression(ptr)
    )

  /** Creates a `GtkExpression` that calls `closure` when it is evaluated.
    *
    * `closure` is called with the `this` object and the results of evaluating
    * the `params` expressions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "Constructor new is weird: non NULL-terminated arrays require special handling"
  )
  private def apply() = ???

end ClosureExpression
