package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.{Converter, Initable}
import sn.gnome.gio.internal.GCharsetConverter
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint, guint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*

/** #GCharsetConverter is an implementation of #GConverter based on GIConv.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CharsetConverter private[gnome] (raw: Ptr[GCharsetConverter])
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
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GCharsetConverter]]
    ).value
  end getNumFallbacks

  /** Gets the #GCharsetConverter:use-fallback property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUseFallback(): Boolean /* None */ =
    g_charset_converter_get_use_fallback(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GCharsetConverter]]
    ).value.!=(0)
  end getUseFallback

  /** Sets the #GCharsetConverter:use-fallback property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUseFallback(
      use_fallback: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    g_charset_converter_set_use_fallback(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GCharsetConverter]],
      gboolean(gint((if use_fallback == true then 1 else 0)))
    )
  end setUseFallback

end CharsetConverter

object CharsetConverter:
  def applyUnsafe(ptr: Ptr[GCharsetConverter])(using Runtime) =
    summon[Runtime].getOrCreate[CharsetConverter](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new CharsetConverter(ptr)
    )

  /** Creates a new #GCharsetConverter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      to_charset: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      from_charset: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone, Runtime): GResult[CharsetConverter] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] = g_charset_converter_new(
        toCString(to_charset).asInstanceOf[Ptr[gchar]],
        toCString(from_charset).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime].getOrCreate[CharsetConverter](
          raw,
          r => CharsetConverter.applyUnsafe(r.asInstanceOf)
        )

  end apply
end CharsetConverter
