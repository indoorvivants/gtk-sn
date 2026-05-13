package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{
  Converter,
  FilterOutputStream,
  OutputStream,
  PollableOutputStream
}
import sn.gnome.gio.internal.GConverterOutputStream
import sn.gnome.gobject.runtime.*

/** Converter output stream implements #GOutputStream and allows conversion of
  * data of various types during reading.
  *
  * As of GLib 2.34, #GConverterOutputStream implements #GPollableOutputStream.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ConverterOutputStream private[gnome] (raw: Ptr[GConverterOutputStream])
    extends FilterOutputStream(raw.asInstanceOf),
      PollableOutputStream:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the #GConverter that is used by @converter_stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getConverter(): Converter /* None */ =
    new Converter.Abstract(
      g_converter_output_stream_get_converter(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GConverterOutputStream]]
      ).asInstanceOf
    )
  end getConverter

end ConverterOutputStream

object ConverterOutputStream:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GConverterOutputStream])(using Runtime) =
    summon[Runtime].getOrCreate[ConverterOutputStream](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ConverterOutputStream(ptr)
    )

  /** Creates a new converter output stream for the @base_stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      base_stream: sn.gnome.gio.fluent.OutputStream /* Some(Ptr[GOutputStream]) */,
      converter: Converter /* Some(Ptr[GConverter]) */
  )(using Runtime): ConverterOutputStream =
    val raw: Ptr[Byte] = g_converter_output_stream_new(
      base_stream.getUnsafeRawPointer().asInstanceOf,
      converter.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime].getOrCreate[ConverterOutputStream](
      raw,
      r => ConverterOutputStream.applyUnsafe(r.asInstanceOf)
    )
  end apply
end ConverterOutputStream
