package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.{Converter, Initable}
import sn.gnome.gio.internal.GCharsetConverter
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint, guint}
import sn.gnome.gobject.fluent.Object

/** #GCharsetConverter is an implementation of #GConverter based on GIConv.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CharsetConverter(raw: Ptr[GCharsetConverter])
    extends Object(raw.asInstanceOf),
      Converter,
      Initable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the number of fallbacks that @converter has applied so far.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNumFallbacks(): UInt /* None */ =
    g_charset_converter_get_num_fallbacks(
      this.raw.asInstanceOf[Ptr[GCharsetConverter]]
    ).value

  /** Gets the #GCharsetConverter:use-fallback property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUseFallback(): Boolean /* None */ =
    g_charset_converter_get_use_fallback(
      this.raw.asInstanceOf[Ptr[GCharsetConverter]]
    ).value.!=(0)

  /** Sets the #GCharsetConverter:use-fallback property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUseFallback(
      use_fallback: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = g_charset_converter_set_use_fallback(
    this.raw.asInstanceOf[Ptr[GCharsetConverter]],
    gboolean(gint((if use_fallback == true then 1 else 0)))
  )

end CharsetConverter

object CharsetConverter:
  /** Creates a new #GCharsetConverter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      to_charset: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      from_charset: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): GResult[CharsetConverter] = GResult.wrap(__errorPtr =>
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
