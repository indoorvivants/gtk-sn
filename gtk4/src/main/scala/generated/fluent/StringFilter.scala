package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{Expression, Filter, StringFilterMatchMode}
import sn.gnome.gtk4.internal.GtkStringFilter

/** `GtkStringFilter` determines whether to include items by comparing strings
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class StringFilter private[gnome] (raw: Ptr[GtkStringFilter])
    extends Filter(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the expression that the string filter uses to obtain strings from
    * items.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExpression()(using Runtime): sn.gnome.gtk4.Expression /* None */ =
    sn.gnome.gtk4.Expression.applyUnsafe(
      gtk_string_filter_get_expression(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStringFilter]]
      ).asInstanceOf
    )
  end getExpression

  /** Returns whether the filter ignores case differences.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIgnoreCase(): Boolean /* None */ =
    gtk_string_filter_get_ignore_case(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStringFilter]]
    ).value.!=(0)
  end getIgnoreCase

  /** Returns the match mode that the filter is using.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMatchMode(): StringFilterMatchMode /* None */ =
    StringFilterMatchMode.fromRaw(
      gtk_string_filter_get_match_mode(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStringFilter]]
      )
    )
  end getMatchMode

  /** Gets the search term.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSearch(): String /* None */ =
    fromCString(
      gtk_string_filter_get_search(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStringFilter]]
      ).asInstanceOf
    )
  end getSearch

  /** Sets the expression that the string filter uses to obtain strings from
    * items.
    *
    * The expression must have a value type of %G_TYPE_STRING.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setExpression(
      expression: Option[
        sn.gnome.gtk4.Expression /* Some(Ptr[GtkExpression]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_string_filter_set_expression(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStringFilter]],
      expression
        .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkExpression]])
    )
  end setExpression

  /** Sets whether the filter ignores case differences.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIgnoreCase(
      ignore_case: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_string_filter_set_ignore_case(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStringFilter]],
      gboolean(gint((if ignore_case == true then 1 else 0)))
    )
  end setIgnoreCase

  /** Sets the match mode for the filter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMatchMode(
      mode: StringFilterMatchMode /* Some(GtkStringFilterMatchMode) */
  ): Unit /* None */ =
    gtk_string_filter_set_match_mode(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStringFilter]],
      mode.raw
    )
  end setMatchMode

  /** Sets the string to search for.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSearch(search: Option[String /* Some(CString) */ ])(using
      Runtime
  ): Unit /* None */ =
    gtk_string_filter_set_search(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStringFilter]],
      search
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setSearch

end StringFilter

object StringFilter:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkStringFilter])(using Runtime) =
    summon[Runtime].getOrCreate[StringFilter](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new StringFilter(ptr)
    )

  /** Creates a new string filter.
    *
    * You will want to set up the filter by providing a string to search for and
    * by providing a property to look up on the item.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      expression: Option[
        sn.gnome.gtk4.Expression /* Some(Ptr[GtkExpression]) */
      ]
  )(using Runtime): StringFilter =
    val raw: Ptr[Byte] = gtk_string_filter_new(
      expression
        .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkExpression]])
    ).asInstanceOf
    summon[Runtime].getOrCreate[StringFilter](
      raw,
      r => StringFilter.applyUnsafe(r.asInstanceOf)
    )
  end apply
end StringFilter
