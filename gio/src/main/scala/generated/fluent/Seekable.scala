package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.Cancellable
import sn.gnome.glib.{GResult, SeekType}
import sn.gnome.glib.internal.{gboolean, gint, gint64, goffset}
import sn.gnome.gobject.runtime.*

trait Seekable:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Tests if the stream supports the #GSeekableIface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def canSeek(): Boolean /* None */ =
    g_seekable_can_seek(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSeekable]]
    ).value.!=(0)
  end canSeek

  /** Tests if the length of the stream can be adjusted with
    * g_seekable_truncate().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def canTruncate(): Boolean /* None */ =
    g_seekable_can_truncate(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSeekable]]
    ).value.!=(0)
  end canTruncate

  /** Seeks in the stream by the given @offset, modified by @type.
    *
    * Attempting to seek past the end of the stream will have different results
    * depending on if the stream is fixed-sized or resizable. If the stream is
    * resizable then seeking past the end and then writing will result in zeros
    * filling the empty space. Seeking past the end of a resizable stream and
    * reading will result in EOF. Seeking past the end of a fixed-sized stream
    * will fail.
    *
    * Any operation that would result in a negative offset will fail.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def seek(
      offset: gint64 /* Some(_root_.sn.gnome.glib.internal.goffset) */,
      `type`: SeekType /* Some(_root_.sn.gnome.glib.internal.GSeekType) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_seekable_seek(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSeekable]],
        goffset(offset),
        `type`.raw,
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end seek

  /** Tells the current position within the stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def tell(): gint64 /* None */ =
    g_seekable_tell(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSeekable]]
    ).asInstanceOf
  end tell

  /** Sets the length of the stream to @offset. If the stream was previously
    * larger than @offset, the extra data is discarded. If the stream was
    * previously shorter than @offset, it is extended with NUL ('\0') bytes.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned. If an
    * operation was partially finished when the operation was cancelled the
    * partial result will be returned, without an error.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def truncate(
      offset: gint64 /* Some(_root_.sn.gnome.glib.internal.goffset) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_seekable_truncate(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSeekable]],
        goffset(offset),
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end truncate

end Seekable

object Seekable:
  class Abstract(raw: Ptr[Byte]) extends Seekable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Seekable
