package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  AccessibleRange,
  Buildable,
  ConstraintTarget,
  Orientable,
  ScaleButton
}
import sn.gnome.gtk4.internal.GtkVolumeButton

/** `GtkVolumeButton` is a `GtkScaleButton` subclass tailored for volume
  * control.
  *
  * ![An example GtkVolumeButton](volumebutton.png)
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class VolumeButton private[gnome] (raw: Ptr[GtkVolumeButton])
    extends ScaleButton(raw.asInstanceOf),
      Accessible,
      AccessibleRange,
      Buildable,
      ConstraintTarget,
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end VolumeButton

object VolumeButton:
  def applyUnsafe(ptr: Ptr[GtkVolumeButton])(using Runtime) =
    summon[Runtime].getOrCreate[VolumeButton](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new VolumeButton(ptr)
    )

  /** Creates a `GtkVolumeButton`.
    *
    * The button has a range between 0.0 and 1.0, with a stepping of 0.02.
    * Volume values can be obtained and modified using the functions from
    * [class@Gtk.ScaleButton].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): VolumeButton =
    val raw: Ptr[Byte] = gtk_volume_button_new().asInstanceOf
    summon[Runtime].getOrCreate[VolumeButton](
      raw,
      r => VolumeButton.applyUnsafe(r.asInstanceOf)
    )
  end apply
end VolumeButton
