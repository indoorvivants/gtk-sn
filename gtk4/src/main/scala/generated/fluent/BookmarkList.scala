package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.ListModel
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
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
class BookmarkList private[gnome] (raw: Ptr[GtkBookmarkList])
    extends Object(raw.asInstanceOf),
      ListModel:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the attributes queried on the children.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributes(): scala.Predef.String /* None */ =
    fromCString(
      gtk_bookmark_list_get_attributes(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBookmarkList]]
      ).asInstanceOf
    )
  end getAttributes

  /** Returns the filename of the bookmark file that this list is loading.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFilename(): scala.Predef.String /* None */ =
    fromCString(
      gtk_bookmark_list_get_filename(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBookmarkList]]
      ).asInstanceOf
    )
  end getFilename

  /** Gets the IO priority to use while loading file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIoPriority(): Int /* None */ =
    gtk_bookmark_list_get_io_priority(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBookmarkList]]
    )
  end getIoPriority

  /** Returns %TRUE if the files are currently being loaded.
    *
    * Files will be added to @self from time to time while loading is going on.
    * The order in which are added is undefined and may change in between runs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isLoading(): Boolean /* None */ =
    gtk_bookmark_list_is_loading(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBookmarkList]]
    ).value.!=(0)
  end isLoading

  /** Sets the @attributes to be enumerated and starts the enumeration.
    *
    * If @attributes is %NULL, no attributes will be queried, but a list of
    * `GFileInfo`s will still be created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributes(
      attributes: Option[scala.Predef.String /* Some(CString) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_bookmark_list_set_attributes(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBookmarkList]],
      attributes
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setAttributes

  /** Sets the IO priority to use while loading files.
    *
    * The default IO priority is %G_PRIORITY_DEFAULT.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIoPriority(io_priority: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_bookmark_list_set_io_priority(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBookmarkList]],
      io_priority
    )
  end setIoPriority

end BookmarkList

object BookmarkList:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkBookmarkList])(using Runtime) =
    summon[Runtime].getOrCreate[BookmarkList](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new BookmarkList(ptr)
    )

  /** Creates a new `GtkBookmarkList` with the given @attributes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      filename: Option[scala.Predef.String /* Some(CString) */ ],
      attributes: Option[scala.Predef.String /* Some(CString) */ ]
  )(using Runtime): BookmarkList =
    val raw: Ptr[Byte] = gtk_bookmark_list_new(
      filename
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString]),
      attributes
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
    summon[Runtime].getOrCreate[BookmarkList](
      raw,
      r => BookmarkList.applyUnsafe(r.asInstanceOf)
    )
  end apply
end BookmarkList
