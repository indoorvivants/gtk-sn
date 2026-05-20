package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.Value
import sn.gnome.gtk4.ExpressionWatch
import sn.gnome.gtk4.internal.GtkExpressionWatch
import sn.gnome.runtime.*

/** An opaque structure representing a watched `GtkExpression`.
  *
  * The contents of `GtkExpressionWatch` should only be accessed through the
  * provided API.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ExpressionWatch private[gnome] (raw: Ptr[GtkExpressionWatch]):

  def getUnsafeRawPointer(): Ptr[GtkExpressionWatch] = this.raw

  /** Evaluates the watched expression and on success stores the result in
    * `value`.
    *
    * This is equivalent to calling [method@Gtk.Expression.evaluate] with the
    * expression and this pointer originally used to create `watch`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def evaluate(
      value: sn.gnome.gobject.Value /* Some(Ptr[_root_.sn.gnome.gobject.internal.GValue]) */
  )(using Runtime): Boolean /* None */ =
    gtk_expression_watch_evaluate(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkExpressionWatch]],
      value.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end evaluate

  /** Acquires a reference on the given `GtkExpressionWatch`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gtk4.ExpressionWatch /* None */ =
    sn.gnome.gtk4.ExpressionWatch.fromRaw(
      gtk_expression_watch_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkExpressionWatch]]
      )
    )
  end ref

  /** Releases a reference on the given `GtkExpressionWatch`.
    *
    * If the reference was the last, the resources associated to `self` are
    * freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    gtk_expression_watch_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkExpressionWatch]]
    )
  end unref

  /** Stops watching an expression.
    *
    * See [method@Gtk.Expression.watch] for how the watch was established.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unwatch(): Unit /* None */ =
    gtk_expression_watch_unwatch(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkExpressionWatch]]
    )
  end unwatch

end ExpressionWatch

object ExpressionWatch:
  def fromRaw(ptr: Ptr[GtkExpressionWatch]): ExpressionWatch =
    new ExpressionWatch(ptr)
end ExpressionWatch
