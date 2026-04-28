package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GVariant
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.Filter
import sn.gnome.gtk4.internal.GtkFileFilter

class FileFilter(raw: Ptr[GtkFileFilter])
    extends Filter(raw.asInstanceOf),
      Buildable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addMimeType(mime_type: String | CString)(using Zone): Unit =
    gtk_file_filter_add_mime_type(
      this.raw.asInstanceOf,
      __sn_extract_string(mime_type)
    )

  def addPattern(pattern: String | CString)(using Zone): Unit =
    gtk_file_filter_add_pattern(
      this.raw.asInstanceOf,
      __sn_extract_string(pattern)
    )

  def addPixbufFormats(): Unit = gtk_file_filter_add_pixbuf_formats(
    this.raw.asInstanceOf
  )

  def addSuffix(suffix: String | CString)(using Zone): Unit =
    gtk_file_filter_add_suffix(
      this.raw.asInstanceOf,
      __sn_extract_string(suffix)
    )

  def getName()(using Zone): String = fromCString(
    gtk_file_filter_get_name(this.raw.asInstanceOf).asInstanceOf
  )

  def setName(name: String | CString)(using Zone): Unit =
    gtk_file_filter_set_name(this.raw.asInstanceOf, __sn_extract_string(name))

  def toGvariant(): Ptr[GVariant] = gtk_file_filter_to_gvariant(
    this.raw.asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end FileFilter

object FileFilter:
  def apply(): FileFilter = new FileFilter(gtk_file_filter_new().asInstanceOf)
  def fromGvariant(variant: Ptr[GVariant]): FileFilter = new FileFilter(
    gtk_file_filter_new_from_gvariant(variant).asInstanceOf
  )
end FileFilter
