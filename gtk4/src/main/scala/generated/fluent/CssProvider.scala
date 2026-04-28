package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.File
import sn.gnome.glib.internal.GBytes
import sn.gnome.glib.internal.gssize
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.StyleProvider
import sn.gnome.gtk4.internal.GtkCssProvider

class CssProvider(raw: Ptr[GtkCssProvider])
    extends Object(raw.asInstanceOf),
      StyleProvider:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def loadFromBytes(data: Ptr[GBytes]): Unit =
    gtk_css_provider_load_from_bytes(this.raw.asInstanceOf, data)

  def loadFromData(data: String | CString, length: CLongInt)(using Zone): Unit =
    gtk_css_provider_load_from_data(
      this.raw.asInstanceOf,
      __sn_extract_string(data),
      gssize(length)
    )

  def loadFromFile(file: File): Unit = gtk_css_provider_load_from_file(
    this.raw.asInstanceOf,
    file.getUnsafeRawPointer().asInstanceOf
  )

  def loadFromPath(path: String | CString)(using Zone): Unit =
    gtk_css_provider_load_from_path(
      this.raw.asInstanceOf,
      __sn_extract_string(path)
    )

  def loadFromResource(resource_path: String | CString)(using Zone): Unit =
    gtk_css_provider_load_from_resource(
      this.raw.asInstanceOf,
      __sn_extract_string(resource_path)
    )

  def loadFromString(string: String | CString)(using Zone): Unit =
    gtk_css_provider_load_from_string(
      this.raw.asInstanceOf,
      __sn_extract_string(string)
    )

  def loadNamed(name: String | CString, variant: String | CString)(using
      Zone
  ): Unit = gtk_css_provider_load_named(
    this.raw.asInstanceOf,
    __sn_extract_string(name),
    __sn_extract_string(variant)
  )

  def toString()(using Zone): String = fromCString(
    gtk_css_provider_to_string(this.raw.asInstanceOf).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end CssProvider

object CssProvider:
  def apply(): CssProvider = new CssProvider(
    gtk_css_provider_new().asInstanceOf
  )
end CssProvider
