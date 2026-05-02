package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.LayoutManager
import sn.gnome.gtk4.internal.GtkOverlayLayout

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkOverlayLayout` is the layout manager used by [class@Gtk.Overlay].
  *
  * It places widgets as overlays on top of the main child.
  *
  * This is not a reusable layout manager, since it expects its widget to be a
  * `GtkOverlay`. It is only listed here so that its layout properties get
  * documented.
  */
class OverlayLayout(raw: Ptr[GtkOverlayLayout])
    extends LayoutManager(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end OverlayLayout

object OverlayLayout:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkOverlayLayout` instance.
    */
  def apply(): OverlayLayout = new OverlayLayout(
    gtk_overlay_layout_new().asInstanceOf
  )
end OverlayLayout
