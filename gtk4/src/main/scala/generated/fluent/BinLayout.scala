package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.LayoutManager
import sn.gnome.gtk4.internal.GtkBinLayout

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkBinLayout` is a `GtkLayoutManager` subclass useful for create "bins" of
  * widgets.
  *
  * `GtkBinLayout` will stack each child of a widget on top of each other, using
  * the [property@Gtk.Widget:hexpand], [property@Gtk.Widget:vexpand],
  * [property@Gtk.Widget:halign], and [property@Gtk.Widget:valign] properties of
  * each child to determine where they should be positioned.
  */
class BinLayout(raw: Ptr[GtkBinLayout]) extends LayoutManager(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end BinLayout

object BinLayout:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkBinLayout` instance.
    */
  def apply(): BinLayout = new BinLayout(gtk_bin_layout_new().asInstanceOf)
end BinLayout
