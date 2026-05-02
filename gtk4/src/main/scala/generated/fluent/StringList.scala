package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.internal.GtkStringList

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkStringList` is a list model that wraps an array of strings.
  *
  * The objects in the model are of type [class@Gtk.StringObject] and have a
  * "string" property that can be used inside expressions.
  *
  * `GtkStringList` is well-suited for any place where you would typically use a
  * `char*[]`, but need a list model.
  *
  * ## GtkStringList as GtkBuildable
  *
  * The `GtkStringList` implementation of the `GtkBuildable` interface supports
  * adding items directly using the `<items>` element and specifying `<item>`
  * elements for each item. Each `<item>` element supports the regular
  * translation attributes “translatable”, “context” and “comments”.
  *
  * Here is a UI definition fragment specifying a `GtkStringList`
  *
  * ```xml
  * <object class="GtkStringList">
  *   <items>
  *     <item translatable="yes">Factory</item>
  *     <item translatable="yes">Home</item>
  *     <item translatable="yes">Subway</item>
  *   </items>
  * </object>
  * ```
  */
class StringList(raw: Ptr[GtkStringList])
    extends Object(raw.asInstanceOf),
      ListModel,
      Buildable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends @string to @self.
    *
    * The @string will be copied. See [method@Gtk.StringList.take] for a way to
    * avoid that.
    */
  def append(
      string: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_string_list_append(this.raw.asInstanceOf, __sn_extract_string(string))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the string that is at @position in @self.
    *
    * If @self does not contain @position items, %NULL is returned.
    *
    * This function returns the const char *. To get the object wrapping it, use
    * g_list_model_get_item().
    */
  def getString(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Zone): String /* None */ = fromCString(
    gtk_string_list_get_string(
      this.raw.asInstanceOf,
      guint(position)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes the string at @position from @self.
    *
    * @position
    *   must be smaller than the current length of the list.
    */
  def remove(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_string_list_remove(this.raw.asInstanceOf, guint(position))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Changes @self by removing @n_removals strings and adding @additions to it.
    *
    * This function is more efficient than [method@Gtk.StringList.append] and
    * [method@Gtk.StringList.remove], because it only emits the ::items-changed
    * signal once for the change.
    *
    * This function copies the strings in @additions.
    *
    * The parameters @position and @n_removals must be correct (ie:
    * @position
    *   + @n_removals must be less than or equal to the length of the list at
    *   the time this function is called).
    */
  def splice(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      n_removals: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      additions: Option[Ptr[CString] /* Some(Ptr[CString]) */ ]
  )(using Zone): Unit /* None */ = gtk_string_list_splice(
    this.raw.asInstanceOf,
    guint(position),
    guint(n_removals),
    additions
      .map[Ptr[CString]](o => o)
      .getOrElse(null.asInstanceOf[Ptr[CString]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds @string to self at the end, and takes ownership of it.
    *
    * This variant of [method@Gtk.StringList.append] is convenient for
    * formatting strings:
    *
    * ```c
    * gtk_string_list_take (self, g_strdup_print ("%d dollars", lots));
    * ```
    */
  def take(
      string: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_string_list_take(this.raw.asInstanceOf, __sn_extract_string(string))

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end StringList

object StringList:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkStringList` with the given @strings.
    */
  def apply(
      strings: Option[Ptr[CString] /* Some(Ptr[CString]) */ ]
  )(using Zone): StringList = new StringList(
    gtk_string_list_new(
      strings
        .map[Ptr[CString]](o => o)
        .getOrElse(null.asInstanceOf[Ptr[CString]])
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end StringList
