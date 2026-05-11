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
class BoolFilter private[gnome] (raw: Ptr[GtkBoolFilter])
    extends Filter(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the expression that the filter uses to evaluate if an item should be
    * filtered.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExpression()(using
      Runtime
  ): sn.gnome.gtk4.fluent.Expression /* None */ =
    sn.gnome.gtk4.fluent.Expression.applyUnsafe(
      gtk_bool_filter_get_expression(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBoolFilter]]
      ).asInstanceOf
    )
  end getExpression

  /** Returns whether the filter inverts the expression.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInvert(): Boolean /* None */ =
    gtk_bool_filter_get_invert(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBoolFilter]]
    ).value.!=(0)
  end getInvert

  /** Sets the expression that the filter uses to check if items should be
    * filtered.
    *
    * The expression must have a value type of %G_TYPE_BOOLEAN.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setExpression(
      expression: Option[
        sn.gnome.gtk4.fluent.Expression /* Some(Ptr[GtkExpression]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_bool_filter_set_expression(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBoolFilter]],
      expression
        .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkExpression]])
    )
  end setExpression

  /** Sets whether the filter should invert the expression.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInvert(
      invert: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_bool_filter_set_invert(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBoolFilter]],
      gboolean(gint((if invert == true then 1 else 0)))
    )
  end setInvert

end BoolFilter

object BoolFilter:
  def applyUnsafe(ptr: Ptr[GtkBoolFilter])(using Runtime) =
    summon[Runtime].getOrCreate[BoolFilter](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new BoolFilter(ptr)
    )

  /** Creates a new bool filter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      expression: Option[
        sn.gnome.gtk4.fluent.Expression /* Some(Ptr[GtkExpression]) */
      ]
  )(using Runtime): BoolFilter =
    val raw: Ptr[Byte] = gtk_bool_filter_new(
      expression
        .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkExpression]])
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[BoolFilter](raw, r => BoolFilter.applyUnsafe(r.asInstanceOf))
  end apply
end BoolFilter
