package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Collation
import sn.gnome.gtk4.fluent.Expression
import sn.gnome.gtk4.fluent.Sorter
import sn.gnome.gtk4.internal.GtkStringSorter

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkStringSorter` is a `GtkSorter` that compares strings.
  *
  * It does the comparison in a linguistically correct way using the current
  * locale by normalizing Unicode strings and possibly case-folding them before
  * performing the comparison.
  *
  * To obtain the strings to compare, this sorter evaluates a
  * [class@Gtk.Expression].
  */
class StringSorter(raw: Ptr[GtkStringSorter]) extends Sorter(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets which collation method the sorter uses.
    */
  def getCollation(): Collation /* None */ = Collation.fromRaw(
    gtk_string_sorter_get_collation(this.raw.asInstanceOf[Ptr[GtkStringSorter]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the expression that is evaluated to obtain strings from items.
    */
  def getExpression(): Expression /* None */ = new Expression(
    gtk_string_sorter_get_expression(
      this.raw.asInstanceOf[Ptr[GtkStringSorter]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the sorter ignores case differences.
    */
  def getIgnoreCase(): Boolean /* None */ = gtk_string_sorter_get_ignore_case(
    this.raw.asInstanceOf[Ptr[GtkStringSorter]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the collation method to use for sorting.
    */
  def setCollation(
      collation: Collation /* Some(GtkCollation) */
  ): Unit /* None */ = gtk_string_sorter_set_collation(
    this.raw.asInstanceOf[Ptr[GtkStringSorter]],
    collation.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the expression that is evaluated to obtain strings from items.
    *
    * The expression must have the type %G_TYPE_STRING.
    */
  def setExpression(
      expression: Option[Expression /* Some(Ptr[GtkExpression]) */ ]
  ): Unit /* None */ = gtk_string_sorter_set_expression(
    this.raw.asInstanceOf[Ptr[GtkStringSorter]],
    expression
      .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkExpression]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the sorter will ignore case differences.
    */
  def setIgnoreCase(
      ignore_case: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_string_sorter_set_ignore_case(
    this.raw.asInstanceOf[Ptr[GtkStringSorter]],
    gboolean(gint((if ignore_case == true then 1 else 0)))
  )

end StringSorter

object StringSorter:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new string sorter that compares items using the given
    * @expression.
    *
    * Unless an expression is set on it, this sorter will always compare items
    * as invalid.
    */
  def apply(
      expression: Option[Expression /* Some(Ptr[GtkExpression]) */ ]
  ): StringSorter = new StringSorter(
    gtk_string_sorter_new(
      expression
        .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkExpression]])
    ).asInstanceOf
  )
end StringSorter
