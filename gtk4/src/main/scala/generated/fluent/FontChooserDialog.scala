package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.Display
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{
  Accessible,
  Buildable,
  ConstraintTarget,
  Dialog,
  FontChooser,
  Native,
  Root,
  ShortcutManager,
  Widget,
  Window
}
import sn.gnome.gtk4.internal.{
  GtkFontChooser,
  GtkFontChooserDialog,
  GtkNative,
  GtkRoot
}
import sn.gnome.pango.FontMap

/** The `GtkFontChooserDialog` widget is a dialog for selecting a font.
  *
  * ![An example GtkFontChooserDialog](fontchooser.png)
  *
  * `GtkFontChooserDialog` implements the [iface@Gtk.FontChooser] interface and
  * does not provide much API of its own.
  *
  * To create a `GtkFontChooserDialog`, use [ctor@Gtk.FontChooserDialog.new].
  *
  * # GtkFontChooserDialog as GtkBuildable
  *
  * The `GtkFontChooserDialog` implementation of the `GtkBuildable` interface
  * exposes the buttons with the names “select_button” and “cancel_button”.
  *
  * ## CSS nodes
  *
  * `GtkFontChooserDialog` has a single CSS node with the name `window` and
  * style class `.fontchooser`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FontChooserDialog private[gnome] (raw: Ptr[GtkFontChooserDialog])
    extends Dialog(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      FontChooser,
      Native,
      Root,
      ShortcutManager:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the display that this `GtkRoot` is on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getDisplay()(using Runtime): sn.gnome.gdk4.Display /* None */ =
    sn.gnome.gdk4.Display.applyUnsafe(
      gtk_root_get_display(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRoot]]
      ).asInstanceOf
    )
  end getDisplay

  /** Retrieves the current focused widget within the root.
    *
    * Note that this is the widget that would have the focus if the root is
    * active; if the root is not focused then `gtk_widget_has_focus (widget)`
    * will be %FALSE for the widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getFocus()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_root_get_focus(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRoot]]
      ).asInstanceOf
    )
  end getFocus

  /** Gets the custom font map of this font chooser widget, or %NULL if it does
    * not have one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getFontMap()(using Runtime): sn.gnome.pango.FontMap /* None */ =
    sn.gnome.pango.FontMap.applyUnsafe(
      gtk_font_chooser_get_font_map(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontChooser]]
      ).asInstanceOf
    )
  end getFontMap

  /** Realizes a `GtkNative`.
    *
    * This should only be used by subclasses.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def realize(): Unit /* None */ =
    gtk_native_realize(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNative]])
  end realize

  /** If @focus is not the current focus widget, and is focusable, sets it as
    * the focus widget for the root.
    *
    * If @focus is %NULL, unsets the focus widget for the root.
    *
    * To set the focus to a particular widget in the root, it is usually more
    * convenient to use [method@Gtk.Widget.grab_focus] instead of this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def setFocus(
      focus: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_root_set_focus(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRoot]],
      focus
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setFocus

  /** Sets a custom font map to use for this font chooser widget.
    *
    * A custom font map can be used to present application-specific fonts
    * instead of or in addition to the normal system fonts.
    *
    * ```c
    * FcConfig *config;
    * PangoFontMap *fontmap;
    *
    * config = FcInitLoadConfigAndFonts ();
    * FcConfigAppFontAddFile (config, my_app_font_file);
    *
    * fontmap = pango_cairo_font_map_new_for_font_type (CAIRO_FONT_TYPE_FT);
    * pango_fc_font_map_set_config (PANGO_FC_FONT_MAP (fontmap), config);
    *
    * gtk_font_chooser_set_font_map (font_chooser, fontmap);
    * ```
    *
    * Note that other GTK widgets will only be able to use the
    * application-specific font if it is present in the font map they use:
    *
    * ```c
    * context = gtk_widget_get_pango_context (label);
    * pango_context_set_font_map (context, fontmap);
    * ```
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def setFontMap(
      fontmap: Option[
        sn.gnome.pango.FontMap /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_font_chooser_set_font_map(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontChooser]],
      fontmap
        .map[Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]]
        )
    )
  end setFontMap

  /** Unrealizes a `GtkNative`.
    *
    * This should only be used by subclasses.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def unrealize(): Unit /* None */ =
    gtk_native_unrealize(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNative]]
    )
  end unrealize

end FontChooserDialog

object FontChooserDialog:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkFontChooserDialog])(using Runtime) =
    summon[Runtime].getOrCreate[FontChooserDialog](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new FontChooserDialog(ptr)
    )

  /** Creates a new `GtkFontChooserDialog`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      title: Option[String /* Some(CString) */ ],
      parent: Option[sn.gnome.gtk4.Window /* Some(Ptr[GtkWindow]) */ ]
  )(using Zone, Runtime): FontChooserDialog =
    val raw: Ptr[Byte] = gtk_font_chooser_dialog_new(
      title
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString]),
      parent
        .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWindow]])
    ).asInstanceOf
    summon[Runtime].getOrCreate[FontChooserDialog](
      raw,
      r => FontChooserDialog.applyUnsafe(r.asInstanceOf)
    )
  end apply
end FontChooserDialog
