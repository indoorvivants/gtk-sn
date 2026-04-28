package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Expression
import sn.gnome.gtk4.fluent.Sorter
import sn.gnome.gtk4.internal.GtkNumericSorter
import sn.gnome.gtk4.internal.GtkSortType

class NumericSorter(raw: Ptr[GtkNumericSorter])
    extends Sorter(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getExpression(): Expression = new Expression(
    gtk_numeric_sorter_get_expression(this.raw.asInstanceOf).asInstanceOf
  )

  def getSortOrder(): GtkSortType = gtk_numeric_sorter_get_sort_order(
    this.raw.asInstanceOf
  )

  def setExpression(expression: Expression): Unit =
    gtk_numeric_sorter_set_expression(
      this.raw.asInstanceOf,
      expression.getUnsafeRawPointer().asInstanceOf
    )

  def setSortOrder(sort_order: GtkSortType): Unit =
    gtk_numeric_sorter_set_sort_order(this.raw.asInstanceOf, sort_order)

end NumericSorter

object NumericSorter:
  def apply(expression: Expression): NumericSorter = new NumericSorter(
    gtk_numeric_sorter_new(
      expression.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end NumericSorter
