package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
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
class MediaControls(raw: Ptr[GtkMediaControls])
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
  def getMediaStream(): MediaStream /* None */ = new MediaStream(
    gtk_media_controls_get_media_stream(
      this.raw.asInstanceOf[Ptr[GtkMediaControls]]
    ).asInstanceOf
  )

  /** Sets the stream that is controlled by @controls.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMediaStream(
      stream: Option[MediaStream /* Some(Ptr[GtkMediaStream]) */ ]
  ): Unit /* None */ = gtk_media_controls_set_media_stream(
    this.raw.asInstanceOf[Ptr[GtkMediaControls]],
    stream
      .map[Ptr[GtkMediaStream]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkMediaStream]])
  )

end MediaControls

object MediaControls:
  /** Creates a new `GtkMediaControls` managing the @stream passed to it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(stream: Option[MediaStream /* Some(Ptr[GtkMediaStream]) */ ])(using
      Runtime
  ): MediaControls =
    val raw: Ptr[Byte] = gtk_media_controls_new(
      stream
        .map[Ptr[GtkMediaStream]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkMediaStream]])
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[MediaControls](raw, r => new MediaControls(r.asInstanceOf))
  end apply
end MediaControls
