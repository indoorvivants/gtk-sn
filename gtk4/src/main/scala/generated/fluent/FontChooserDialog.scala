package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ConstraintTarget,
  Dialog,
  FontChooser,
  Native,
  Root,
  ShortcutManager,
  Window
}
import sn.gnome.gtk4.internal.GtkFontChooserDialog

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
class FontChooserDialog(raw: Ptr[GtkFontChooserDialog])
    extends Dialog(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      FontChooser,
      Native,
      Root,
      ShortcutManager:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end FontChooserDialog

object FontChooserDialog:
  /** Creates a new `GtkFontChooserDialog`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      title: Option[String | CString /* Some(CString) */ ],
      parent: Option[Window /* Some(Ptr[GtkWindow]) */ ]
  )(using Zone)(using Runtime): FontChooserDialog =
    val raw: Ptr[Byte] = gtk_font_chooser_dialog_new(
      title
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString]),
      parent
        .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWindow]])
    ).asInstanceOf
    summon[Runtime].getOrCreate[FontChooserDialog](
      raw,
      r => new FontChooserDialog(r.asInstanceOf)
    )
  end apply

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end FontChooserDialog
