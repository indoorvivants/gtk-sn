package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.internal.GValue
import sn.gnome.gtk4.fluent.Expression
import sn.gnome.gtk4.internal.GtkConstantExpression

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A constant value in a `GtkExpression`.
  */
class ConstantExpression(raw: Ptr[GtkConstantExpression])
    extends Expression(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value that a constant expression evaluates to.
    */
  def getValue(): Ptr[GValue] /* None */ = gtk_constant_expression_get_value(
    this.raw.asInstanceOf
  )

end ConstantExpression

object ConstantExpression:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GtkExpression` that evaluates to the object given by the
    * arguments.
    */
  inline def apply(
      value_type: GType /* Some(_root_.sn.gnome.gobject.internal.GType) */,
      args: Any*
  ): ConstantExpression = new ConstantExpression(
    gtk_constant_expression_new(value_type, args*).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates an expression that always evaluates to the given `value`.
    */
  def forValue(
      value: Ptr[
        GValue
      ] /* Some(Ptr[_root_.sn.gnome.gobject.internal.GValue]) */
  ): ConstantExpression = new ConstantExpression(
    gtk_constant_expression_new_for_value(value).asInstanceOf
  )
end ConstantExpression
