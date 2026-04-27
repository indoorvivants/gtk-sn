package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Icon
import sn.gnome.gio.internal.GThemedIcon
import sn.gnome.gobject.fluent.Object

class ThemedIcon(raw: Ptr[GThemedIcon]) extends Object(raw.asInstanceOf), Icon:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def appendName(iconname: String | CString)(using Zone): Unit =
    g_themed_icon_append_name(
      this.raw.asInstanceOf,
      __sn_extract_string(iconname)
    )

  def prependName(iconname: String | CString)(using Zone): Unit =
    g_themed_icon_prepend_name(
      this.raw.asInstanceOf,
      __sn_extract_string(iconname)
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ThemedIcon

object ThemedIcon:
  def apply(iconname: String | CString)(using Zone): ThemedIcon =
    new ThemedIcon(
      g_themed_icon_new(__sn_extract_string(iconname)).asInstanceOf
    )
  def fromNames(iconnames: Ptr[CString], len: Int)(using Zone): ThemedIcon =
    new ThemedIcon(g_themed_icon_new_from_names(iconnames, len).asInstanceOf)
  def withDefaultFallbacks(iconname: String | CString)(using Zone): ThemedIcon =
    new ThemedIcon(
      g_themed_icon_new_with_default_fallbacks(
        __sn_extract_string(iconname)
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
end ThemedIcon
