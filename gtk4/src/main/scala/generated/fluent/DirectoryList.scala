package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.File
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.GError
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.internal.GtkDirectoryList

class DirectoryList(raw: Ptr[GtkDirectoryList])
    extends Object(raw.asInstanceOf),
      ListModel:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAttributes()(using Zone): String = fromCString(
    gtk_directory_list_get_attributes(this.raw.asInstanceOf).asInstanceOf
  )

  def getError(): Ptr[GError] = gtk_directory_list_get_error(
    this.raw.asInstanceOf
  )

  def getFile(): File = new File.Abstract(
    gtk_directory_list_get_file(this.raw.asInstanceOf).asInstanceOf
  )

  def getIoPriority(): Int = gtk_directory_list_get_io_priority(
    this.raw.asInstanceOf
  )

  def getMonitored(): Boolean =
    gtk_directory_list_get_monitored(this.raw.asInstanceOf).value.!=(0)

  def isLoading(): Boolean =
    gtk_directory_list_is_loading(this.raw.asInstanceOf).value.!=(0)

  def setAttributes(attributes: String | CString)(using Zone): Unit =
    gtk_directory_list_set_attributes(
      this.raw.asInstanceOf,
      __sn_extract_string(attributes)
    )

  def setFile(file: File): Unit = gtk_directory_list_set_file(
    this.raw.asInstanceOf,
    file.getUnsafeRawPointer().asInstanceOf
  )

  def setIoPriority(io_priority: Int): Unit =
    gtk_directory_list_set_io_priority(this.raw.asInstanceOf, io_priority)

  def setMonitored(monitored: Boolean): Unit = gtk_directory_list_set_monitored(
    this.raw.asInstanceOf,
    gboolean(gint((if monitored == true then 1 else 0)))
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DirectoryList

object DirectoryList:
  def apply(attributes: String | CString, file: File)(using
      Zone
  ): DirectoryList = new DirectoryList(
    gtk_directory_list_new(
      __sn_extract_string(attributes),
      file.getUnsafeRawPointer().asInstanceOf
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
end DirectoryList
