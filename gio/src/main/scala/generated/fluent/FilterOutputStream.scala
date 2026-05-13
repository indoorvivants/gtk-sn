package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.OutputStream
import sn.gnome.gio.internal.GFilterOutputStream
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*

/** Base class for output stream implementations that perform some kind of
  * filtering operation on a base stream. Typical examples of filtering
  * operations are character set conversion, compression and byte order
  * flipping.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FilterOutputStream private[gnome] (raw: Ptr[GFilterOutputStream])
    extends OutputStream(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the base stream for the filter stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBaseStream()(using
      Runtime
  ): sn.gnome.gio.fluent.OutputStream /* None */ =
    sn.gnome.gio.fluent.OutputStream.applyUnsafe(
      g_filter_output_stream_get_base_stream(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFilterOutputStream]]
      ).asInstanceOf
    )
  end getBaseStream

  /** Returns whether the base stream will be closed when @stream is closed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCloseBaseStream(): Boolean /* None */ =
    g_filter_output_stream_get_close_base_stream(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFilterOutputStream]]
    ).value.!=(0)
  end getCloseBaseStream

  /** Sets whether the base stream will be closed when @stream is closed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCloseBaseStream(
      close_base: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    g_filter_output_stream_set_close_base_stream(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFilterOutputStream]],
      gboolean(gint((if close_base == true then 1 else 0)))
    )
  end setCloseBaseStream

end FilterOutputStream

object FilterOutputStream:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GFilterOutputStream])(using Runtime) =
    summon[Runtime].getOrCreate[FilterOutputStream](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new FilterOutputStream(ptr)
    )

end FilterOutputStream
