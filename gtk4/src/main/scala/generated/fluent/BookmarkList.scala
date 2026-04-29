package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.internal.GtkBookmarkList

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkBookmarkList` is a list model that wraps `GBookmarkFile`.
  *
  * It presents a `GListModel` and fills it asynchronously with the `GFileInfo`s
  * returned from that function.
  *
  * The `GFileInfo`s in the list have some attributes in the recent namespace
  * added: `recent::private` (boolean) and `recent:applications` (stringv).
  */
class BookmarkList(raw: Ptr[GtkBookmarkList])
    extends Object(raw.asInstanceOf),
      ListModel:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the attributes queried on the children.
    */
  def getAttributes()(using Zone): String = fromCString(
    gtk_bookmark_list_get_attributes(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the filename of the bookmark file that this list is loading.
    */
  def getFilename()(using Zone): String = fromCString(
    gtk_bookmark_list_get_filename(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the IO priority to use while loading file.
    */
  def getIoPriority(): Int = gtk_bookmark_list_get_io_priority(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if the files are currently being loaded.
    *
    * Files will be added to @self from time to time while loading is going on.
    * The order in which are added is undefined and may change in between runs.
    */
  def isLoading(): Boolean =
    gtk_bookmark_list_is_loading(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the @attributes to be enumerated and starts the enumeration.
    *
    * If @attributes is %NULL, no attributes will be queried, but a list of
    * `GFileInfo`s will still be created.
    */
  def setAttributes(attributes: String | CString)(using Zone): Unit =
    gtk_bookmark_list_set_attributes(
      this.raw.asInstanceOf,
      __sn_extract_string(attributes)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the IO priority to use while loading files.
    *
    * The default IO priority is %G_PRIORITY_DEFAULT.
    */
  def setIoPriority(io_priority: Int): Unit =
    gtk_bookmark_list_set_io_priority(this.raw.asInstanceOf, io_priority)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end BookmarkList

object BookmarkList:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkBookmarkList` with the given @attributes.
    */
  def apply(filename: String | CString, attributes: String | CString)(using
      Zone
  ): BookmarkList = new BookmarkList(
    gtk_bookmark_list_new(
      __sn_extract_string(filename),
      __sn_extract_string(attributes)
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
end BookmarkList
