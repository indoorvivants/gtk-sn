package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ColorChooser,
  ConstraintTarget,
  Dialog,
  Native,
  Root,
  ShortcutManager,
  Window
}
import sn.gnome.gtk4.internal.GtkColorChooserDialog

/** A dialog for choosing a color.
  *
  * ![An example GtkColorChooserDialog](colorchooser.png)
  *
  * `GtkColorChooserDialog` implements the [iface@Gtk.ColorChooser] interface
  * and does not provide much API of its own.
  *
  * To create a `GtkColorChooserDialog`, use [ctor@Gtk.ColorChooserDialog.new].
  *
  * To change the initially selected color, use
  * [method@Gtk.ColorChooser.set_rgba]. To get the selected color use
  * [method@Gtk.ColorChooser.get_rgba].
  *
  * `GtkColorChooserDialog` has been deprecated in favor of
  * [class@Gtk.ColorDialog].
  *
  * ## CSS nodes
  *
  * `GtkColorChooserDialog` has a single CSS node with the name `window` and
  * style class `.colorchooser`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ColorChooserDialog(raw: Ptr[GtkColorChooserDialog])
    extends Dialog(raw.asInstanceOf),
      Accessible,
      Buildable,
      ColorChooser,
      ConstraintTarget,
      Native,
      Root,
      ShortcutManager:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ColorChooserDialog

object ColorChooserDialog:
  /** Creates a new `GtkColorChooserDialog`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      title: Option[String | CString /* Some(CString) */ ],
      parent: Option[Window /* Some(Ptr[GtkWindow]) */ ]
  )(using Zone)(using Runtime): ColorChooserDialog =
    val raw: Ptr[Byte] = gtk_color_chooser_dialog_new(
      title
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString]),
      parent
        .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWindow]])
    ).asInstanceOf
    summon[Runtime].getOrCreate[ColorChooserDialog](
      raw,
      r => new ColorChooserDialog(r.asInstanceOf)
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
end ColorChooserDialog
