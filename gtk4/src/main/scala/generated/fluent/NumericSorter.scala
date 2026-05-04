package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.{Expression, SortType, Sorter}
import sn.gnome.gtk4.internal.GtkNumericSorter

/** `GtkNumericSorter` is a `GtkSorter` that compares numbers.
  *
  * To obtain the numbers to compare, this sorter evaluates a
  * [class@Gtk.Expression].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class NumericSorter(raw: Ptr[GtkNumericSorter])
    extends Sorter(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the expression that is evaluated to obtain numbers from items.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExpression(): Expression /* None */ = new Expression(
    gtk_numeric_sorter_get_expression(
      this.raw.asInstanceOf[Ptr[GtkNumericSorter]]
    ).asInstanceOf
  )

  /** Gets whether this sorter will sort smaller numbers first.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSortOrder(): SortType /* None */ = SortType.fromRaw(
    gtk_numeric_sorter_get_sort_order(
      this.raw.asInstanceOf[Ptr[GtkNumericSorter]]
    )
  )

  /** Sets the expression that is evaluated to obtain numbers from items.
    *
    * Unless an expression is set on @self, the sorter will always compare items
    * as invalid.
    *
    * The expression must have a return type that can be compared numerically,
    * such as %G_TYPE_INT or %G_TYPE_DOUBLE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setExpression(
      expression: Option[Expression /* Some(Ptr[GtkExpression]) */ ]
  ): Unit /* None */ = gtk_numeric_sorter_set_expression(
    this.raw.asInstanceOf[Ptr[GtkNumericSorter]],
    expression
      .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkExpression]])
  )

  /** Sets whether to sort smaller numbers before larger ones.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSortOrder(
      sort_order: SortType /* Some(GtkSortType) */
  ): Unit /* None */ = gtk_numeric_sorter_set_sort_order(
    this.raw.asInstanceOf[Ptr[GtkNumericSorter]],
    sort_order.raw
  )

end NumericSorter

object NumericSorter:
  /** Creates a new numeric sorter using the given @expression.
    *
    * Smaller numbers will be sorted first. You can call
    * [method@Gtk.NumericSorter.set_sort_order] to change this.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      expression: Option[Expression /* Some(Ptr[GtkExpression]) */ ]
  ): NumericSorter = new NumericSorter(
    gtk_numeric_sorter_new(
      expression
        .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkExpression]])
    ).asInstanceOf
  )
end NumericSorter
