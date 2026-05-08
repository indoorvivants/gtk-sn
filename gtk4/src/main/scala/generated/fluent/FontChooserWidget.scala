package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ConstraintTarget,
  FontChooser,
  Widget
}
import sn.gnome.gtk4.internal.GtkFontChooserWidget

/** The `GtkFontChooserWidget` widget lets the user select a font.
  *
  * It is used in the `GtkFontChooserDialog` widget to provide a dialog for
  * selecting fonts.
  *
  * To set the font which is initially selected, use
  * [method@Gtk.FontChooser.set_font] or [method@Gtk.FontChooser.set_font_desc].
  *
  * To get the selected font use [method@Gtk.FontChooser.get_font] or
  * [method@Gtk.FontChooser.get_font_desc].
  *
  * To change the text which is shown in the preview area, use
  * [method@Gtk.FontChooser.set_preview_text].
  *
  * # CSS nodes
  *
  * `GtkFontChooserWidget` has a single CSS node with name fontchooser.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FontChooserWidget(raw: Ptr[GtkFontChooserWidget])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      FontChooser:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end FontChooserWidget

object FontChooserWidget:
  /** Creates a new `GtkFontChooserWidget`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): FontChooserWidget =
    val raw: Ptr[Byte] = gtk_font_chooser_widget_new().asInstanceOf
    summon[Runtime].getOrCreate[FontChooserWidget](
      raw,
      r => new FontChooserWidget(r.asInstanceOf)
    )
  end apply
end FontChooserWidget
