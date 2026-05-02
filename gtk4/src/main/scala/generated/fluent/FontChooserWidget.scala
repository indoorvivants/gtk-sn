package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.FontChooser
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkFontChooserWidget

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `GtkFontChooserWidget` widget lets the user select a font.
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkFontChooserWidget`.
    */
  def apply(): FontChooserWidget = new FontChooserWidget(
    gtk_font_chooser_widget_new().asInstanceOf
  )
end FontChooserWidget
