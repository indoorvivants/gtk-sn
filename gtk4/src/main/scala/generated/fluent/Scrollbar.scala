package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Adjustment
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkOrientation
import sn.gnome.gtk4.internal.GtkScrollbar

class Scrollbar(raw: Ptr[GtkScrollbar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAdjustment(): Adjustment = new Adjustment(
    gtk_scrollbar_get_adjustment(this.raw.asInstanceOf).asInstanceOf
  )

  def setAdjustment(adjustment: Adjustment): Unit =
    gtk_scrollbar_set_adjustment(
      this.raw.asInstanceOf,
      adjustment.getUnsafeRawPointer().asInstanceOf
    )

end Scrollbar

object Scrollbar:
  def apply(orientation: GtkOrientation, adjustment: Adjustment): Scrollbar =
    new Scrollbar(
      gtk_scrollbar_new(
        orientation,
        adjustment.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
end Scrollbar
