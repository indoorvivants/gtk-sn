package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.Converter
import sn.gnome.gio.fluent.Initable
import sn.gnome.gio.internal.GCharsetConverter
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object

class CharsetConverter(raw: Ptr[GCharsetConverter])
    extends Object(raw.asInstanceOf),
      Converter,
      Initable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getNumFallbacks(): UInt = g_charset_converter_get_num_fallbacks(
    this.raw.asInstanceOf
  ).value

  def getUseFallback(): Boolean =
    g_charset_converter_get_use_fallback(this.raw.asInstanceOf).value.!=(0)

  def setUseFallback(use_fallback: Boolean): Unit =
    g_charset_converter_set_use_fallback(
      this.raw.asInstanceOf,
      gboolean(gint((if use_fallback == true then 1 else 0)))
    )

end CharsetConverter

object CharsetConverter:
  def apply(to_charset: String | CString, from_charset: String | CString)(using
      Zone
  ): GResult[CharsetConverter] = GResult.wrap(__errorPtr =>
    new CharsetConverter(
      g_charset_converter_new(
        __sn_extract_string(to_charset).asInstanceOf[Ptr[gchar]],
        __sn_extract_string(from_charset).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).asInstanceOf
    )
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end CharsetConverter
