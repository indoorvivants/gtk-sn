package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Expression
import sn.gnome.gtk4.internal.GtkObjectExpression

class ObjectExpression(raw: Ptr[GtkObjectExpression])
    extends Expression(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getObject(): Object = new Object(
    gtk_object_expression_get_object(this.raw.asInstanceOf).asInstanceOf
  )

end ObjectExpression

object ObjectExpression:
  def apply(`object`: Object): ObjectExpression = new ObjectExpression(
    gtk_object_expression_new(
      `object`.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end ObjectExpression
