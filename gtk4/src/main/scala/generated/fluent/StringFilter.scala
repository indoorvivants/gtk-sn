package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Expression
import sn.gnome.gtk4.fluent.Filter
import sn.gnome.gtk4.fluent.StringFilterMatchMode
import sn.gnome.gtk4.internal.GtkStringFilter

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkStringFilter` determines whether to include items by comparing strings
  * to a fixed search term.
  *
  * The strings are obtained from the items by evaluating a `GtkExpression` set
  * with [method@Gtk.StringFilter.set_expression], and they are compared against
  * a search term set with [method@Gtk.StringFilter.set_search].
  *
  * `GtkStringFilter` has several different modes of comparison - it can match
  * the whole string, just a prefix, or any substring. Use
  * [method@Gtk.StringFilter.set_match_mode] choose a mode.
  *
  * It is also possible to make case-insensitive comparisons, with
  * [method@Gtk.StringFilter.set_ignore_case].
  */
class StringFilter(raw: Ptr[GtkStringFilter]) extends Filter(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the expression that the string filter uses to obtain strings from
    * items.
    */
  def getExpression(): Expression /* None */ = new Expression(
    gtk_string_filter_get_expression(
      this.raw.asInstanceOf[Ptr[GtkStringFilter]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the filter ignores case differences.
    */
  def getIgnoreCase(): Boolean /* None */ = gtk_string_filter_get_ignore_case(
    this.raw.asInstanceOf[Ptr[GtkStringFilter]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the match mode that the filter is using.
    */
  def getMatchMode(): StringFilterMatchMode /* None */ =
    StringFilterMatchMode.fromRaw(
      gtk_string_filter_get_match_mode(
        this.raw.asInstanceOf[Ptr[GtkStringFilter]]
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the search term.
    */
  def getSearch()(using Zone): String /* None */ = fromCString(
    gtk_string_filter_get_search(
      this.raw.asInstanceOf[Ptr[GtkStringFilter]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the expression that the string filter uses to obtain strings from
    * items.
    *
    * The expression must have a value type of %G_TYPE_STRING.
    */
  def setExpression(
      expression: Option[Expression /* Some(Ptr[GtkExpression]) */ ]
  ): Unit /* None */ = gtk_string_filter_set_expression(
    this.raw.asInstanceOf[Ptr[GtkStringFilter]],
    expression
      .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkExpression]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the filter ignores case differences.
    */
  def setIgnoreCase(
      ignore_case: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_string_filter_set_ignore_case(
    this.raw.asInstanceOf[Ptr[GtkStringFilter]],
    gboolean(gint((if ignore_case == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the match mode for the filter.
    */
  def setMatchMode(
      mode: StringFilterMatchMode /* Some(GtkStringFilterMatchMode) */
  ): Unit /* None */ = gtk_string_filter_set_match_mode(
    this.raw.asInstanceOf[Ptr[GtkStringFilter]],
    mode.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the string to search for.
    */
  def setSearch(
      search: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_string_filter_set_search(
    this.raw.asInstanceOf[Ptr[GtkStringFilter]],
    search
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end StringFilter

object StringFilter:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new string filter.
    *
    * You will want to set up the filter by providing a string to search for and
    * by providing a property to look up on the item.
    */
  def apply(
      expression: Option[Expression /* Some(Ptr[GtkExpression]) */ ]
  ): StringFilter = new StringFilter(
    gtk_string_filter_new(
      expression
        .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkExpression]])
    ).asInstanceOf
  )
end StringFilter
