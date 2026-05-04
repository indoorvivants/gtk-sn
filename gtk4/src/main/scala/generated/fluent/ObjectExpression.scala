package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Expression
import sn.gnome.gtk4.internal.GtkObjectExpression

/** A `GObject` value in a `GtkExpression`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ObjectExpression(raw: Ptr[GtkObjectExpression])
    extends Expression(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the object that the expression evaluates to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getObject(): Object /* None */ = new Object(
    gtk_object_expression_get_object(
      this.raw.asInstanceOf[Ptr[GtkExpression]]
    ).asInstanceOf
  )

end ObjectExpression

object ObjectExpression:
  /** Creates an expression evaluating to the given `object` with a weak
    * reference.
    *
    * Once the `object` is disposed, it will fail to evaluate.
    *
    * This expression is meant to break reference cycles.
    *
    * If you want to keep a reference to `object`, use
    * [ctor@Gtk.ConstantExpression.new].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      `object`: Object /* Some(Ptr[_root_.sn.gnome.gobject.internal.GObject]) */
  ): ObjectExpression = new ObjectExpression(
    gtk_object_expression_new(
      `object`.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end ObjectExpression
