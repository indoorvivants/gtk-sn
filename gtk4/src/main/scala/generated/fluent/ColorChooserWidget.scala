package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ColorChooser,
  ConstraintTarget,
  Widget
}
import sn.gnome.gtk4.internal.GtkColorChooserWidget

/** The `GtkColorChooserWidget` widget lets the user select a color.
  *
  * By default, the chooser presents a predefined palette of colors, plus a
  * small number of settable custom colors. It is also possible to select a
  * different color with the single-color editor.
  *
  * To enter the single-color editing mode, use the context menu of any color of
  * the palette, or use the '+' button to add a new custom color.
  *
  * The chooser automatically remembers the last selection, as well as custom
  * colors.
  *
  * To create a `GtkColorChooserWidget`, use [ctor@Gtk.ColorChooserWidget.new].
  *
  * To change the initially selected color, use
  * [method@Gtk.ColorChooser.set_rgba]. To get the selected color use
  * [method@Gtk.ColorChooser.get_rgba].
  *
  * The `GtkColorChooserWidget` is used in the [class@Gtk.ColorChooserDialog] to
  * provide a dialog for selecting colors.
  *
  * # CSS names
  *
  * `GtkColorChooserWidget` has a single CSS node with name colorchooser.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ColorChooserWidget(raw: Ptr[GtkColorChooserWidget])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ColorChooser,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ColorChooserWidget

object ColorChooserWidget:
  /** Creates a new `GtkColorChooserWidget`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): ColorChooserWidget = new ColorChooserWidget(
    gtk_color_chooser_widget_new().asInstanceOf
  )
end ColorChooserWidget
