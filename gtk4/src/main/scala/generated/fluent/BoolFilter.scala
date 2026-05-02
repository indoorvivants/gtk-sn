package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Expression
import sn.gnome.gtk4.fluent.Filter
import sn.gnome.gtk4.internal.GtkBoolFilter

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkBoolFilter` evaluates a boolean `GtkExpression` to determine whether to
  * include items.
  */
class BoolFilter(raw: Ptr[GtkBoolFilter]) extends Filter(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the expression that the filter uses to evaluate if an item should be
    * filtered.
    */
  def getExpression(): Expression /* None */ = new Expression(
    gtk_bool_filter_get_expression(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the filter inverts the expression.
    */
  def getInvert(): Boolean /* None */ =
    gtk_bool_filter_get_invert(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the expression that the filter uses to check if items should be
    * filtered.
    *
    * The expression must have a value type of %G_TYPE_BOOLEAN.
    */
  def setExpression(
      expression: Option[Expression /* Some(Ptr[GtkExpression]) */ ]
  ): Unit /* None */ = gtk_bool_filter_set_expression(
    this.raw.asInstanceOf,
    expression
      .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkExpression]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the filter should invert the expression.
    */
  def setInvert(
      invert: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_bool_filter_set_invert(
    this.raw.asInstanceOf,
    gboolean(gint((if invert == true then 1 else 0)))
  )

end BoolFilter

object BoolFilter:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new bool filter.
    */
  def apply(
      expression: Option[Expression /* Some(Ptr[GtkExpression]) */ ]
  ): BoolFilter = new BoolFilter(
    gtk_bool_filter_new(
      expression
        .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkExpression]])
    ).asInstanceOf
  )
end BoolFilter
