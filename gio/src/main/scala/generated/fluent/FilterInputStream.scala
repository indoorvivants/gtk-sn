package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.InputStream
import sn.gnome.gio.internal.GFilterInputStream
import sn.gnome.glib.internal.{gboolean, gint}

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Base class for input stream implementations that perform some kind of
  * filtering operation on a base stream. Typical examples of filtering
  * operations are character set conversion, compression and byte order
  * flipping.
  */
class FilterInputStream(raw: Ptr[GFilterInputStream])
    extends InputStream(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the base stream for the filter stream.
    */
  def getBaseStream(): InputStream /* None */ = new InputStream(
    g_filter_input_stream_get_base_stream(
      this.raw.asInstanceOf[Ptr[GFilterInputStream]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the base stream will be closed when @stream is closed.
    */
  def getCloseBaseStream(): Boolean /* None */ =
    g_filter_input_stream_get_close_base_stream(
      this.raw.asInstanceOf[Ptr[GFilterInputStream]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the base stream will be closed when @stream is closed.
    */
  def setCloseBaseStream(
      close_base: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = g_filter_input_stream_set_close_base_stream(
    this.raw.asInstanceOf[Ptr[GFilterInputStream]],
    gboolean(gint((if close_base == true then 1 else 0)))
  )

end FilterInputStream
