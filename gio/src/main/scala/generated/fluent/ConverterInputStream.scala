package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{
  Converter,
  FilterInputStream,
  InputStream,
  PollableInputStream
}
import sn.gnome.gio.internal.GConverterInputStream
import sn.gnome.gobject.runtime.*

/** Converter input stream implements #GInputStream and allows conversion of
  * data of various types during reading.
  *
  * As of GLib 2.34, #GConverterInputStream implements #GPollableInputStream.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ConverterInputStream private[gnome] (raw: Ptr[GConverterInputStream])
    extends FilterInputStream(raw.asInstanceOf),
      PollableInputStream:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the #GConverter that is used by @converter_stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getConverter(): Converter /* None */ =
    new Converter.Abstract(
      g_converter_input_stream_get_converter(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GConverterInputStream]]
      ).asInstanceOf
    )
  end getConverter

end ConverterInputStream

object ConverterInputStream:
  def applyUnsafe(ptr: Ptr[GConverterInputStream])(using Runtime) =
    summon[Runtime].getOrCreate[ConverterInputStream](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ConverterInputStream(ptr)
    )

  /** Creates a new converter input stream for the @base_stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      base_stream: sn.gnome.gio.fluent.InputStream /* Some(Ptr[GInputStream]) */,
      converter: Converter /* Some(Ptr[GConverter]) */
  )(using Runtime): ConverterInputStream =
    val raw: Ptr[Byte] = g_converter_input_stream_new(
      base_stream.getUnsafeRawPointer().asInstanceOf,
      converter.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime].getOrCreate[ConverterInputStream](
      raw,
      r => ConverterInputStream.applyUnsafe(r.asInstanceOf)
    )
  end apply
end ConverterInputStream
