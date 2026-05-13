package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.LayoutManager
import sn.gnome.gtk4.internal.GtkBinLayout

/** `GtkBinLayout` is a `GtkLayoutManager` subclass useful for create "bins" of
  * widgets.
  *
  * `GtkBinLayout` will stack each child of a widget on top of each other, using
  * the [property@Gtk.Widget:hexpand], [property@Gtk.Widget:vexpand],
  * [property@Gtk.Widget:halign], and [property@Gtk.Widget:valign] properties of
  * each child to determine where they should be positioned.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class BinLayout private[gnome] (raw: Ptr[GtkBinLayout])
    extends LayoutManager(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end BinLayout

object BinLayout:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkBinLayout])(using Runtime) =
    summon[Runtime].getOrCreate[BinLayout](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new BinLayout(ptr)
    )

  /** Creates a new `GtkBinLayout` instance.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): BinLayout =
    val raw: Ptr[Byte] = gtk_bin_layout_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[BinLayout](raw, r => BinLayout.applyUnsafe(r.asInstanceOf))
  end apply
end BinLayout
