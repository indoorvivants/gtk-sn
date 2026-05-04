package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.internal.GtkBookmarkList

/** `GtkBookmarkList` is a list model that wraps `GBookmarkFile`.
  *
  * It presents a `GListModel` and fills it asynchronously with the `GFileInfo`s
  * returned from that function.
  *
  * The `GFileInfo`s in the list have some attributes in the recent namespace
  * added: `recent::private` (boolean) and `recent:applications` (stringv).
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class BookmarkList(raw: Ptr[GtkBookmarkList])
    extends Object(raw.asInstanceOf),
      ListModel:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the attributes queried on the children.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributes()(using Zone): String /* None */ = fromCString(
    gtk_bookmark_list_get_attributes(
      this.raw.asInstanceOf[Ptr[GtkBookmarkList]]
    ).asInstanceOf
  )

  /** Returns the filename of the bookmark file that this list is loading.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFilename()(using Zone): String /* None */ = fromCString(
    gtk_bookmark_list_get_filename(
      this.raw.asInstanceOf[Ptr[GtkBookmarkList]]
    ).asInstanceOf
  )

  /** Gets the IO priority to use while loading file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIoPriority(): Int /* None */ = gtk_bookmark_list_get_io_priority(
    this.raw.asInstanceOf[Ptr[GtkBookmarkList]]
  )

  /** Returns %TRUE if the files are currently being loaded.
    *
    * Files will be added to @self from time to time while loading is going on.
    * The order in which are added is undefined and may change in between runs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isLoading(): Boolean /* None */ = gtk_bookmark_list_is_loading(
    this.raw.asInstanceOf[Ptr[GtkBookmarkList]]
  ).value.!=(0)

  /** Sets the @attributes to be enumerated and starts the enumeration.
    *
    * If @attributes is %NULL, no attributes will be queried, but a list of
    * `GFileInfo`s will still be created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributes(
      attributes: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_bookmark_list_set_attributes(
    this.raw.asInstanceOf[Ptr[GtkBookmarkList]],
    attributes
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets the IO priority to use while loading files.
    *
    * The default IO priority is %G_PRIORITY_DEFAULT.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIoPriority(io_priority: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_bookmark_list_set_io_priority(
      this.raw.asInstanceOf[Ptr[GtkBookmarkList]],
      io_priority
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

object BookmarkList:
  /** Creates a new `GtkBookmarkList` with the given @attributes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      filename: Option[String | CString /* Some(CString) */ ],
      attributes: Option[String | CString /* Some(CString) */ ]
  )(using Zone): BookmarkList = new BookmarkList(
    gtk_bookmark_list_new(
      filename
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString]),
      attributes
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString])
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
