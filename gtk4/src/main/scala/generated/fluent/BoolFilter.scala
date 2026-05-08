package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{Expression, Filter}
import sn.gnome.gtk4.internal.GtkBoolFilter

/** `GtkBoolFilter` evaluates a boolean `GtkExpression` to determine whether to
  * include items.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class BoolFilter(raw: Ptr[GtkBoolFilter]) extends Filter(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the expression that the filter uses to evaluate if an item should be
    * filtered.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExpression(): Expression /* None */ = new Expression(
    gtk_bool_filter_get_expression(
      this.raw.asInstanceOf[Ptr[GtkBoolFilter]]
    ).asInstanceOf
  )

  /** Returns whether the filter inverts the expression.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInvert(): Boolean /* None */ = gtk_bool_filter_get_invert(
    this.raw.asInstanceOf[Ptr[GtkBoolFilter]]
  ).value.!=(0)

  /** Sets the expression that the filter uses to check if items should be
    * filtered.
    *
    * The expression must have a value type of %G_TYPE_BOOLEAN.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setExpression(
      expression: Option[Expression /* Some(Ptr[GtkExpression]) */ ]
  ): Unit /* None */ = gtk_bool_filter_set_expression(
    this.raw.asInstanceOf[Ptr[GtkBoolFilter]],
    expression
      .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkExpression]])
  )

  /** Sets whether the filter should invert the expression.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInvert(
      invert: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_bool_filter_set_invert(
    this.raw.asInstanceOf[Ptr[GtkBoolFilter]],
    gboolean(gint((if invert == true then 1 else 0)))
  )

end BoolFilter

object BoolFilter:
  /** Creates a new bool filter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(expression: Option[Expression /* Some(Ptr[GtkExpression]) */ ])(
      using Runtime
  ): BoolFilter =
    val raw: Ptr[Byte] = gtk_bool_filter_new(
      expression
        .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkExpression]])
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[BoolFilter](raw, r => new BoolFilter(r.asInstanceOf))
  end apply
end BoolFilter
