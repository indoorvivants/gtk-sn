package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.Display
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{
  Accessible,
  Buildable,
  ColorChooser,
  ConstraintTarget,
  Dialog,
  Native,
  Root,
  ShortcutManager,
  Widget,
  Window
}
import sn.gnome.gtk4.internal.{GtkColorChooserDialog, GtkNative, GtkRoot}

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
class ColorChooserDialog private[gnome] (raw: Ptr[GtkColorChooserDialog])
    extends Dialog(raw.asInstanceOf),
      Accessible,
      Buildable,
      ColorChooser,
      ConstraintTarget,
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

end ColorChooserDialog

object ColorChooserDialog:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkColorChooserDialog])(using Runtime) =
    summon[Runtime].getOrCreate[ColorChooserDialog](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ColorChooserDialog(ptr)
    )

  /** Creates a new `GtkColorChooserDialog`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      title: Option[String /* Some(CString) */ ],
      parent: Option[sn.gnome.gtk4.Window /* Some(Ptr[GtkWindow]) */ ]
  )(using Runtime): ColorChooserDialog =
    val raw: Ptr[Byte] = gtk_color_chooser_dialog_new(
      title
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString]),
      parent
        .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWindow]])
    ).asInstanceOf
    summon[Runtime].getOrCreate[ColorChooserDialog](
      raw,
      r => ColorChooserDialog.applyUnsafe(r.asInstanceOf)
    )
  end apply
end ColorChooserDialog
