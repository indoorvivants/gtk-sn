package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Adjustment
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Scrollable
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkScrollInfo
import sn.gnome.gtk4.internal.GtkViewport

class Viewport(raw: Ptr[GtkViewport])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Scrollable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getChild(): Widget = new Widget(
    gtk_viewport_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getScrollToFocus(): Boolean =
    gtk_viewport_get_scroll_to_focus(this.raw.asInstanceOf).value.!=(0)

  def scrollTo(descendant: Widget, scroll: Ptr[GtkScrollInfo]): Unit =
    gtk_viewport_scroll_to(
      this.raw.asInstanceOf,
      descendant.getUnsafeRawPointer().asInstanceOf,
      scroll
    )

  def setChild(child: Widget): Unit = gtk_viewport_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setScrollToFocus(scroll_to_focus: Boolean): Unit =
    gtk_viewport_set_scroll_to_focus(
      this.raw.asInstanceOf,
      gboolean(gint((if scroll_to_focus == true then 1 else 0)))
    )

end Viewport

object Viewport:
  def apply(hadjustment: Adjustment, vadjustment: Adjustment): Viewport =
    new Viewport(
      gtk_viewport_new(
        hadjustment.getUnsafeRawPointer().asInstanceOf,
        vadjustment.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
end Viewport
