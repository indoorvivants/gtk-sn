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
import sn.gnome.gtk4.internal.{GtkFontChooserWidget, GtkWidget}
import sn.gnome.pango.fluent.FontMap

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
class FontChooserWidget private[gnome] (raw: Ptr[GtkFontChooserWidget])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      FontChooser:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the font map of @widget.
    *
    * See [method@Gtk.Widget.set_font_map].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getFontMap()(using
      Runtime
  ): sn.gnome.pango.fluent.FontMap /* None */ =
    sn.gnome.pango.fluent.FontMap.applyUnsafe(
      gtk_widget_get_font_map(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getFontMap

  /** Sets the font map to use for Pango rendering.
    *
    * The font map is the object that is used to look up fonts. Setting a custom
    * font map can be useful in special situations, e.g. when you need to add
    * application-specific fonts to the set of available fonts.
    *
    * When not set, the widget will inherit the font map from its parent.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def setFontMap(
      font_map: Option[
        sn.gnome.pango.fluent.FontMap /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_widget_set_font_map(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      font_map
        .map[Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]]
        )
    )
  end setFontMap

end FontChooserWidget

object FontChooserWidget:
  def applyUnsafe(ptr: Ptr[GtkFontChooserWidget])(using Runtime) =
    summon[Runtime].getOrCreate[FontChooserWidget](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new FontChooserWidget(ptr)
    )

  /** Creates a new `GtkFontChooserWidget`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): FontChooserWidget =
    val raw: Ptr[Byte] = gtk_font_chooser_widget_new().asInstanceOf
    summon[Runtime].getOrCreate[FontChooserWidget](
      raw,
      r => FontChooserWidget.applyUnsafe(r.asInstanceOf)
    )
  end apply
end FontChooserWidget
