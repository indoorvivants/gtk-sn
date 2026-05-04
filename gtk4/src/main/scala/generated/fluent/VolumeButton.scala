package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.{
  Accessible,
  AccessibleRange,
  Buildable,
  ConstraintTarget,
  Orientable,
  ScaleButton
}
import sn.gnome.gtk4.internal.GtkVolumeButton

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkVolumeButton` is a `GtkScaleButton` subclass tailored for volume
  * control.
  *
  * ![An example GtkVolumeButton](volumebutton.png)
  */
class VolumeButton(raw: Ptr[GtkVolumeButton])
    extends ScaleButton(raw.asInstanceOf),
      Accessible,
      AccessibleRange,
      Buildable,
      ConstraintTarget,
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end VolumeButton

object VolumeButton:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GtkVolumeButton`.
    *
    * The button has a range between 0.0 and 1.0, with a stepping of 0.02.
    * Volume values can be obtained and modified using the functions from
    * [class@Gtk.ScaleButton].
    */
  def apply(): VolumeButton = new VolumeButton(
    gtk_volume_button_new().asInstanceOf
  )
end VolumeButton
