package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.MediaStream
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkMediaControls

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkMediaControls` is a widget to show controls for a video.
  *
  * ![An example GtkMediaControls](media-controls.png)
  *
  * Usually, `GtkMediaControls` is used as part of [class@Gtk.Video].
  */
class MediaControls(raw: Ptr[GtkMediaControls])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the media stream managed by @controls or %NULL if none.
    */
  def getMediaStream(): MediaStream /* None */ = new MediaStream(
    gtk_media_controls_get_media_stream(
      this.raw.asInstanceOf[Ptr[GtkMediaControls]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the stream that is controlled by @controls.
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkMediaControls` managing the @stream passed to it.
    */
  def apply(
      stream: Option[MediaStream /* Some(Ptr[GtkMediaStream]) */ ]
  ): MediaControls = new MediaControls(
    gtk_media_controls_new(
      stream
        .map[Ptr[GtkMediaStream]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkMediaStream]])
    ).asInstanceOf
  )
end MediaControls
