package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.internal.GtkBookmarkList

class BookmarkList(raw: Ptr[GtkBookmarkList])
    extends Object(raw.asInstanceOf),
      ListModel:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAttributes()(using Zone): String = fromCString(
    gtk_bookmark_list_get_attributes(this.raw.asInstanceOf).asInstanceOf
  )

  def getFilename()(using Zone): String = fromCString(
    gtk_bookmark_list_get_filename(this.raw.asInstanceOf).asInstanceOf
  )

  def getIoPriority(): Int = gtk_bookmark_list_get_io_priority(
    this.raw.asInstanceOf
  )

  def isLoading(): Boolean =
    gtk_bookmark_list_is_loading(this.raw.asInstanceOf).value.!=(0)

  def setAttributes(attributes: String | CString)(using Zone): Unit =
    gtk_bookmark_list_set_attributes(
      this.raw.asInstanceOf,
      __sn_extract_string(attributes)
    )

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
