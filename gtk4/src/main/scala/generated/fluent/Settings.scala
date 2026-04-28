package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.StyleProvider
import sn.gnome.gtk4.internal.GtkSettings

class Settings(raw: Ptr[GtkSettings])
    extends Object(raw.asInstanceOf),
      StyleProvider:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def resetProperty(name: String | CString)(using Zone): Unit =
    gtk_settings_reset_property(
      this.raw.asInstanceOf,
      __sn_extract_string(name)
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Settings
