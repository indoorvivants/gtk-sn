package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ColorChooser
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Dialog
import sn.gnome.gtk4.fluent.Native
import sn.gnome.gtk4.fluent.Root
import sn.gnome.gtk4.fluent.ShortcutManager
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkColorChooserDialog

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A dialog for choosing a color.
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkColorChooserDialog`.
    */
  def apply(title: String | CString, parent: Window)(using
      Zone
  ): ColorChooserDialog = new ColorChooserDialog(
    gtk_color_chooser_dialog_new(
      __sn_extract_string(title),
      parent.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ColorChooserDialog
