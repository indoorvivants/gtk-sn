package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.InputStream
import sn.gnome.gio.internal.GFilterInputStream
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*

/** Base class for input stream implementations that perform some kind of
  * filtering operation on a base stream. Typical examples of filtering
  * operations are character set conversion, compression and byte order
  * flipping.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FilterInputStream private[gnome] (raw: Ptr[GFilterInputStream])
    extends InputStream(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the base stream for the filter stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBaseStream()(using Runtime): sn.gnome.gio.InputStream /* None */ =
    sn.gnome.gio.InputStream.applyUnsafe(
      g_filter_input_stream_get_base_stream(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFilterInputStream]]
      ).asInstanceOf
    )
  end getBaseStream

  /** Returns whether the base stream will be closed when @stream is closed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCloseBaseStream(): Boolean /* None */ =
    g_filter_input_stream_get_close_base_stream(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFilterInputStream]]
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
    g_filter_input_stream_set_close_base_stream(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFilterInputStream]],
      gboolean(gint((if close_base == true then 1 else 0)))
    )
  end setCloseBaseStream

end FilterInputStream

object FilterInputStream:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GFilterInputStream])(using Runtime) =
    summon[Runtime].getOrCreate[FilterInputStream](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new FilterInputStream(ptr)
    )

end FilterInputStream
