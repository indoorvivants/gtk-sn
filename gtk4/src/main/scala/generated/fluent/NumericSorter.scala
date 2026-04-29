package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Expression
import sn.gnome.gtk4.fluent.Sorter
import sn.gnome.gtk4.internal.GtkNumericSorter
import sn.gnome.gtk4.internal.GtkSortType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkNumericSorter` is a `GtkSorter` that compares numbers.
  *
  * To obtain the numbers to compare, this sorter evaluates a
  * [class@Gtk.Expression].
  */
class NumericSorter(raw: Ptr[GtkNumericSorter])
    extends Sorter(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the expression that is evaluated to obtain numbers from items.
    */
  def getExpression(): Expression = new Expression(
    gtk_numeric_sorter_get_expression(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether this sorter will sort smaller numbers first.
    */
  def getSortOrder(): GtkSortType = gtk_numeric_sorter_get_sort_order(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the expression that is evaluated to obtain numbers from items.
    *
    * Unless an expression is set on @self, the sorter will always compare items
    * as invalid.
    *
    * The expression must have a return type that can be compared numerically,
    * such as %G_TYPE_INT or %G_TYPE_DOUBLE.
    */
  def setExpression(expression: Expression): Unit =
    gtk_numeric_sorter_set_expression(
      this.raw.asInstanceOf,
      expression.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether to sort smaller numbers before larger ones.
    */
  def setSortOrder(sort_order: GtkSortType): Unit =
    gtk_numeric_sorter_set_sort_order(this.raw.asInstanceOf, sort_order)

end NumericSorter

object NumericSorter:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new numeric sorter using the given @expression.
    *
    * Smaller numbers will be sorted first. You can call
    * [method@Gtk.NumericSorter.set_sort_order] to change this.
    */
  def apply(expression: Expression): NumericSorter = new NumericSorter(
    gtk_numeric_sorter_new(
      expression.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end NumericSorter
