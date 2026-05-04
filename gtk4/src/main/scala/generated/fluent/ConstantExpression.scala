package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.internal.GType
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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(const GValue*)))"
  )
  def getValue__ = ???

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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(const GValue*)))"
  )
  def new_for_value() = ???

end ConstantExpression
