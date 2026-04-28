package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkAspectFrame

class AspectFrame(raw: Ptr[GtkAspectFrame])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getChild(): Widget = new Widget(
    gtk_aspect_frame_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getObeyChild(): Boolean =
    gtk_aspect_frame_get_obey_child(this.raw.asInstanceOf).value.!=(0)

  def getRatio(): Float = gtk_aspect_frame_get_ratio(this.raw.asInstanceOf)

  def getXalign(): Float = gtk_aspect_frame_get_xalign(this.raw.asInstanceOf)

  def getYalign(): Float = gtk_aspect_frame_get_yalign(this.raw.asInstanceOf)

  def setChild(child: Widget): Unit = gtk_aspect_frame_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setObeyChild(obey_child: Boolean): Unit = gtk_aspect_frame_set_obey_child(
    this.raw.asInstanceOf,
    gboolean(gint((if obey_child == true then 1 else 0)))
  )

  def setRatio(ratio: Float): Unit =
    gtk_aspect_frame_set_ratio(this.raw.asInstanceOf, ratio.asInstanceOf)

  def setXalign(xalign: Float): Unit =
    gtk_aspect_frame_set_xalign(this.raw.asInstanceOf, xalign.asInstanceOf)

  def setYalign(yalign: Float): Unit =
    gtk_aspect_frame_set_yalign(this.raw.asInstanceOf, yalign.asInstanceOf)

end AspectFrame

object AspectFrame:
  def apply(
      xalign: Float,
      yalign: Float,
      ratio: Float,
      obey_child: Boolean
  ): AspectFrame = new AspectFrame(
    gtk_aspect_frame_new(
      xalign.asInstanceOf,
      yalign.asInstanceOf,
      ratio.asInstanceOf,
      gboolean(gint((if obey_child == true then 1 else 0)))
    ).asInstanceOf
  )
end AspectFrame
