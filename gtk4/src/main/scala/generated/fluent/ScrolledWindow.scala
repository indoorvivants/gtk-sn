package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Adjustment
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkCornerType
import sn.gnome.gtk4.internal.GtkPolicyType
import sn.gnome.gtk4.internal.GtkScrolledWindow

class ScrolledWindow(raw: Ptr[GtkScrolledWindow])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getChild(): Widget = new Widget(
    gtk_scrolled_window_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getHadjustment(): Adjustment = new Adjustment(
    gtk_scrolled_window_get_hadjustment(this.raw.asInstanceOf).asInstanceOf
  )

  def getHasFrame(): Boolean =
    gtk_scrolled_window_get_has_frame(this.raw.asInstanceOf).value.!=(0)

  def getHscrollbar(): Widget = new Widget(
    gtk_scrolled_window_get_hscrollbar(this.raw.asInstanceOf).asInstanceOf
  )

  def getKineticScrolling(): Boolean =
    gtk_scrolled_window_get_kinetic_scrolling(this.raw.asInstanceOf).value.!=(0)

  def getMaxContentHeight(): Int = gtk_scrolled_window_get_max_content_height(
    this.raw.asInstanceOf
  )

  def getMaxContentWidth(): Int = gtk_scrolled_window_get_max_content_width(
    this.raw.asInstanceOf
  )

  def getMinContentHeight(): Int = gtk_scrolled_window_get_min_content_height(
    this.raw.asInstanceOf
  )

  def getMinContentWidth(): Int = gtk_scrolled_window_get_min_content_width(
    this.raw.asInstanceOf
  )

  def getOverlayScrolling(): Boolean =
    gtk_scrolled_window_get_overlay_scrolling(this.raw.asInstanceOf).value.!=(0)

  def getPlacement(): GtkCornerType = gtk_scrolled_window_get_placement(
    this.raw.asInstanceOf
  )

  // Method get_policy contains an OUT parameter, which is not supported yet

  def getPropagateNaturalHeight(): Boolean =
    gtk_scrolled_window_get_propagate_natural_height(
      this.raw.asInstanceOf
    ).value.!=(0)

  def getPropagateNaturalWidth(): Boolean =
    gtk_scrolled_window_get_propagate_natural_width(this.raw.asInstanceOf).value
      .!=(0)

  def getVadjustment(): Adjustment = new Adjustment(
    gtk_scrolled_window_get_vadjustment(this.raw.asInstanceOf).asInstanceOf
  )

  def getVscrollbar(): Widget = new Widget(
    gtk_scrolled_window_get_vscrollbar(this.raw.asInstanceOf).asInstanceOf
  )

  def setChild(child: Widget): Unit = gtk_scrolled_window_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setHadjustment(hadjustment: Adjustment): Unit =
    gtk_scrolled_window_set_hadjustment(
      this.raw.asInstanceOf,
      hadjustment.getUnsafeRawPointer().asInstanceOf
    )

  def setHasFrame(has_frame: Boolean): Unit = gtk_scrolled_window_set_has_frame(
    this.raw.asInstanceOf,
    gboolean(gint((if has_frame == true then 1 else 0)))
  )

  def setKineticScrolling(kinetic_scrolling: Boolean): Unit =
    gtk_scrolled_window_set_kinetic_scrolling(
      this.raw.asInstanceOf,
      gboolean(gint((if kinetic_scrolling == true then 1 else 0)))
    )

  def setMaxContentHeight(height: Int): Unit =
    gtk_scrolled_window_set_max_content_height(this.raw.asInstanceOf, height)

  def setMaxContentWidth(width: Int): Unit =
    gtk_scrolled_window_set_max_content_width(this.raw.asInstanceOf, width)

  def setMinContentHeight(height: Int): Unit =
    gtk_scrolled_window_set_min_content_height(this.raw.asInstanceOf, height)

  def setMinContentWidth(width: Int): Unit =
    gtk_scrolled_window_set_min_content_width(this.raw.asInstanceOf, width)

  def setOverlayScrolling(overlay_scrolling: Boolean): Unit =
    gtk_scrolled_window_set_overlay_scrolling(
      this.raw.asInstanceOf,
      gboolean(gint((if overlay_scrolling == true then 1 else 0)))
    )

  def setPlacement(window_placement: GtkCornerType): Unit =
    gtk_scrolled_window_set_placement(this.raw.asInstanceOf, window_placement)

  def setPolicy(
      hscrollbar_policy: GtkPolicyType,
      vscrollbar_policy: GtkPolicyType
  ): Unit = gtk_scrolled_window_set_policy(
    this.raw.asInstanceOf,
    hscrollbar_policy,
    vscrollbar_policy
  )

  def setPropagateNaturalHeight(propagate: Boolean): Unit =
    gtk_scrolled_window_set_propagate_natural_height(
      this.raw.asInstanceOf,
      gboolean(gint((if propagate == true then 1 else 0)))
    )

  def setPropagateNaturalWidth(propagate: Boolean): Unit =
    gtk_scrolled_window_set_propagate_natural_width(
      this.raw.asInstanceOf,
      gboolean(gint((if propagate == true then 1 else 0)))
    )

  def setVadjustment(vadjustment: Adjustment): Unit =
    gtk_scrolled_window_set_vadjustment(
      this.raw.asInstanceOf,
      vadjustment.getUnsafeRawPointer().asInstanceOf
    )

  def unsetPlacement(): Unit = gtk_scrolled_window_unset_placement(
    this.raw.asInstanceOf
  )

end ScrolledWindow

object ScrolledWindow:
  def apply(): ScrolledWindow = new ScrolledWindow(
    gtk_scrolled_window_new().asInstanceOf
  )
end ScrolledWindow
