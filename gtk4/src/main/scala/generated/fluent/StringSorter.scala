package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Expression
import sn.gnome.gtk4.fluent.Sorter
import sn.gnome.gtk4.internal.GtkCollation
import sn.gnome.gtk4.internal.GtkStringSorter

class StringSorter(raw: Ptr[GtkStringSorter]) extends Sorter(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getCollation(): GtkCollation = gtk_string_sorter_get_collation(
    this.raw.asInstanceOf
  )

  def getExpression(): Expression = new Expression(
    gtk_string_sorter_get_expression(this.raw.asInstanceOf).asInstanceOf
  )

  def getIgnoreCase(): Boolean =
    gtk_string_sorter_get_ignore_case(this.raw.asInstanceOf).value.!=(0)

  def setCollation(collation: GtkCollation): Unit =
    gtk_string_sorter_set_collation(this.raw.asInstanceOf, collation)

  def setExpression(expression: Expression): Unit =
    gtk_string_sorter_set_expression(
      this.raw.asInstanceOf,
      expression.getUnsafeRawPointer().asInstanceOf
    )

  def setIgnoreCase(ignore_case: Boolean): Unit =
    gtk_string_sorter_set_ignore_case(
      this.raw.asInstanceOf,
      gboolean(gint((if ignore_case == true then 1 else 0)))
    )

end StringSorter

object StringSorter:
  def apply(expression: Expression): StringSorter = new StringSorter(
    gtk_string_sorter_new(
      expression.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end StringSorter
