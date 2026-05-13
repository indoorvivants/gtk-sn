package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{
  Accessible,
  Buildable,
  ConstraintTarget,
  MediaStream,
  Widget
}
import sn.gnome.gtk4.internal.GtkMediaControls

/** `GtkMediaControls` is a widget to show controls for a video.
  *
  * ![An example GtkMediaControls](media-controls.png)
  *
  * Usually, `GtkMediaControls` is used as part of [class@Gtk.Video].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MediaControls private[gnome] (raw: Ptr[GtkMediaControls])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the media stream managed by @controls or %NULL if none.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMediaStream()(using Runtime): sn.gnome.gtk4.MediaStream /* None */ =
    sn.gnome.gtk4.MediaStream.applyUnsafe(
      gtk_media_controls_get_media_stream(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaControls]]
      ).asInstanceOf
    )
  end getMediaStream

  /** Sets the stream that is controlled by @controls.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMediaStream(
      stream: Option[sn.gnome.gtk4.MediaStream /* Some(Ptr[GtkMediaStream]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_media_controls_set_media_stream(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMediaControls]],
      stream
        .map[Ptr[GtkMediaStream]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkMediaStream]])
    )
  end setMediaStream

end MediaControls

object MediaControls:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkMediaControls])(using Runtime) =
    summon[Runtime].getOrCreate[MediaControls](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new MediaControls(ptr)
    )

  /** Creates a new `GtkMediaControls` managing the @stream passed to it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      stream: Option[sn.gnome.gtk4.MediaStream /* Some(Ptr[GtkMediaStream]) */ ]
  )(using Runtime): MediaControls =
    val raw: Ptr[Byte] = gtk_media_controls_new(
      stream
        .map[Ptr[GtkMediaStream]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkMediaStream]])
    ).asInstanceOf
    summon[Runtime].getOrCreate[MediaControls](
      raw,
      r => MediaControls.applyUnsafe(r.asInstanceOf)
    )
  end apply
end MediaControls
