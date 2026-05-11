package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
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
class NumericSorter private[gnome] (raw: Ptr[GtkNumericSorter])
    extends Sorter(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the expression that is evaluated to obtain numbers from items.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExpression()(using
      Runtime
  ): sn.gnome.gtk4.fluent.Expression /* None */ =
    sn.gnome.gtk4.fluent.Expression.applyUnsafe(
      gtk_numeric_sorter_get_expression(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNumericSorter]]
      ).asInstanceOf
    )
  end getExpression

  /** Gets whether this sorter will sort smaller numbers first.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSortOrder(): SortType /* None */ =
    SortType.fromRaw(
      gtk_numeric_sorter_get_sort_order(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNumericSorter]]
      )
    )
  end getSortOrder

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
      expression: Option[
        sn.gnome.gtk4.fluent.Expression /* Some(Ptr[GtkExpression]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_numeric_sorter_set_expression(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNumericSorter]],
      expression
        .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkExpression]])
    )
  end setExpression

  /** Sets whether to sort smaller numbers before larger ones.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSortOrder(
      sort_order: SortType /* Some(GtkSortType) */
  ): Unit /* None */ =
    gtk_numeric_sorter_set_sort_order(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNumericSorter]],
      sort_order.raw
    )
  end setSortOrder

end NumericSorter

object NumericSorter:
  def applyUnsafe(ptr: Ptr[GtkNumericSorter])(using Runtime) =
    summon[Runtime].getOrCreate[NumericSorter](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new NumericSorter(ptr)
    )

  /** Creates a new numeric sorter using the given @expression.
    *
    * Smaller numbers will be sorted first. You can call
    * [method@Gtk.NumericSorter.set_sort_order] to change this.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      expression: Option[
        sn.gnome.gtk4.fluent.Expression /* Some(Ptr[GtkExpression]) */
      ]
  )(using Runtime): NumericSorter =
    val raw: Ptr[Byte] = gtk_numeric_sorter_new(
      expression
        .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkExpression]])
    ).asInstanceOf
    summon[Runtime].getOrCreate[NumericSorter](
      raw,
      r => NumericSorter.applyUnsafe(r.asInstanceOf)
    )
  end apply
end NumericSorter
