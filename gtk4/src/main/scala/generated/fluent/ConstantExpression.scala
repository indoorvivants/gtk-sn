package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.internal.GValue
import sn.gnome.gtk4.fluent.Expression
import sn.gnome.gtk4.internal.GtkConstantExpression

class ConstantExpression(raw: Ptr[GtkConstantExpression])
    extends Expression(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getValue(): Ptr[GValue] = gtk_constant_expression_get_value(
    this.raw.asInstanceOf
  )

end ConstantExpression

object ConstantExpression:
  inline def apply(value_type: GType, args: Any*): ConstantExpression =
    new ConstantExpression(
      gtk_constant_expression_new(value_type, args*).asInstanceOf
    )
  def forValue(value: Ptr[GValue]): ConstantExpression = new ConstantExpression(
    gtk_constant_expression_new_for_value(value).asInstanceOf
  )
end ConstantExpression
