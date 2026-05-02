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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GtkExpression` that calls `callback_func` when it is evaluated.
    *
    * This function is a variant of [ctor@Gtk.ClosureExpression.new] that
    * creates a `GClosure` by calling g_cclosure_new() with the given
    * `callback_func`, `user_data` and `user_destroy`.
    */
  @annotation.compileTimeOnly(
    "Constructor new is weird: non NULL-terminated arrays require special handling"
  )
  def apply() = ???

end CClosureExpression
