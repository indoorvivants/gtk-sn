package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.LayoutManager
import sn.gnome.gtk4.internal.GtkOverlayLayout

/** `GtkOverlayLayout` is the layout manager used by [class@Gtk.Overlay].
  *
  * It places widgets as overlays on top of the main child.
  *
  * This is not a reusable layout manager, since it expects its widget to be a
  * `GtkOverlay`. It is only listed here so that its layout properties get
  * documented.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class OverlayLayout private[gnome] (raw: Ptr[GtkOverlayLayout])
    extends LayoutManager(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end OverlayLayout

object OverlayLayout:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkOverlayLayout])(using Runtime) =
    summon[Runtime].getOrCreate[OverlayLayout](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new OverlayLayout(ptr)
    )

  /** Creates a new `GtkOverlayLayout` instance.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): OverlayLayout =
    val raw: Ptr[Byte] = gtk_overlay_layout_new().asInstanceOf
    summon[Runtime].getOrCreate[OverlayLayout](
      raw,
      r => OverlayLayout.applyUnsafe(r.asInstanceOf)
    )
  end apply
end OverlayLayout
