package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.MediaStream
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkMediaControls

class MediaControls(raw: Ptr[GtkMediaControls])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getMediaStream(): MediaStream = new MediaStream(
    gtk_media_controls_get_media_stream(this.raw.asInstanceOf).asInstanceOf
  )

  def setMediaStream(stream: MediaStream): Unit =
    gtk_media_controls_set_media_stream(
      this.raw.asInstanceOf,
      stream.getUnsafeRawPointer().asInstanceOf
    )

end MediaControls

object MediaControls:
  def apply(stream: MediaStream): MediaControls = new MediaControls(
    gtk_media_controls_new(
      stream.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end MediaControls
