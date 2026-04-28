package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Expression
import sn.gnome.gtk4.fluent.Filter
import sn.gnome.gtk4.internal.GtkBoolFilter

class BoolFilter(raw: Ptr[GtkBoolFilter]) extends Filter(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getExpression(): Expression = new Expression(
    gtk_bool_filter_get_expression(this.raw.asInstanceOf).asInstanceOf
  )

  def getInvert(): Boolean =
    gtk_bool_filter_get_invert(this.raw.asInstanceOf).value.!=(0)

  def setExpression(expression: Expression): Unit =
    gtk_bool_filter_set_expression(
      this.raw.asInstanceOf,
      expression.getUnsafeRawPointer().asInstanceOf
    )

  def setInvert(invert: Boolean): Unit = gtk_bool_filter_set_invert(
    this.raw.asInstanceOf,
    gboolean(gint((if invert == true then 1 else 0)))
  )

end BoolFilter

object BoolFilter:
  def apply(expression: Expression): BoolFilter = new BoolFilter(
    gtk_bool_filter_new(
      expression.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end BoolFilter
