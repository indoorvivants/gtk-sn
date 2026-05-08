package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{Collation, Expression, Sorter}
import sn.gnome.gtk4.internal.GtkStringSorter

/** `GtkStringSorter` is a `GtkSorter` that compares strings.
  *
  * It does the comparison in a linguistically correct way using the current
  * locale by normalizing Unicode strings and possibly case-folding them before
  * performing the comparison.
  *
  * To obtain the strings to compare, this sorter evaluates a
  * [class@Gtk.Expression].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class StringSorter(raw: Ptr[GtkStringSorter]) extends Sorter(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets which collation method the sorter uses.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCollation(): Collation /* None */ = Collation.fromRaw(
    gtk_string_sorter_get_collation(this.raw.asInstanceOf[Ptr[GtkStringSorter]])
  )

  /** Gets the expression that is evaluated to obtain strings from items.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExpression(): Expression /* None */ = new Expression(
    gtk_string_sorter_get_expression(
      this.raw.asInstanceOf[Ptr[GtkStringSorter]]
    ).asInstanceOf
  )

  /** Gets whether the sorter ignores case differences.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIgnoreCase(): Boolean /* None */ = gtk_string_sorter_get_ignore_case(
    this.raw.asInstanceOf[Ptr[GtkStringSorter]]
  ).value.!=(0)

  /** Sets the collation method to use for sorting.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCollation(
      collation: Collation /* Some(GtkCollation) */
  ): Unit /* None */ = gtk_string_sorter_set_collation(
    this.raw.asInstanceOf[Ptr[GtkStringSorter]],
    collation.raw
  )

  /** Sets the expression that is evaluated to obtain strings from items.
    *
    * The expression must have the type %G_TYPE_STRING.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setExpression(
      expression: Option[Expression /* Some(Ptr[GtkExpression]) */ ]
  ): Unit /* None */ = gtk_string_sorter_set_expression(
    this.raw.asInstanceOf[Ptr[GtkStringSorter]],
    expression
      .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkExpression]])
  )

  /** Sets whether the sorter will ignore case differences.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIgnoreCase(
      ignore_case: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_string_sorter_set_ignore_case(
    this.raw.asInstanceOf[Ptr[GtkStringSorter]],
    gboolean(gint((if ignore_case == true then 1 else 0)))
  )

end StringSorter

object StringSorter:
  /** Creates a new string sorter that compares items using the given
    * @expression.
    *
    * Unless an expression is set on it, this sorter will always compare items
    * as invalid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(expression: Option[Expression /* Some(Ptr[GtkExpression]) */ ])(
      using Runtime
  ): StringSorter =
    val raw: Ptr[Byte] = gtk_string_sorter_new(
      expression
        .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkExpression]])
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[StringSorter](raw, r => new StringSorter(r.asInstanceOf))
  end apply
end StringSorter
