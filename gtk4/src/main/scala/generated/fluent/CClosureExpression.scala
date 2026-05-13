package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.Expression
import sn.gnome.gtk4.internal.GtkCClosureExpression

/** A variant of `GtkClosureExpression` using a C closure.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CClosureExpression private[gnome] (raw: Ptr[GtkCClosureExpression])
    extends Expression(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CClosureExpression

object CClosureExpression:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkCClosureExpression])(using Runtime) =
    summon[Runtime].getOrCreate[CClosureExpression](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new CClosureExpression(ptr)
    )

  /** Creates a `GtkExpression` that calls `callback_func` when it is evaluated.
    *
    * This function is a variant of [ctor@Gtk.ClosureExpression.new] that
    * creates a `GClosure` by calling g_cclosure_new() with the given
    * `callback_func`, `user_data` and `user_destroy`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new]: Constructor new is weird: non NULL-terminated arrays require special handling"
  )
  private def apply() = ???

end CClosureExpression
