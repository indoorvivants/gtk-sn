package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.FileChooser
import sn.gnome.gtk4.fluent.FileChooserAction
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkFileChooserWidget

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkFileChooserWidget` is a widget for choosing files.
  *
  * It exposes the [iface@Gtk.FileChooser] interface, and you should use the
  * methods of this interface to interact with the widget.
  *
  * # CSS nodes
  *
  * `GtkFileChooserWidget` has a single CSS node with name filechooser.
  */
class FileChooserWidget(raw: Ptr[GtkFileChooserWidget])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      FileChooser:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end FileChooserWidget

object FileChooserWidget:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkFileChooserWidget`.
    *
    * This is a file chooser widget that can be embedded in custom windows, and
    * it is the same widget that is used by `GtkFileChooserDialog`.
    */
  def apply(
      action: FileChooserAction /* Some(GtkFileChooserAction) */
  ): FileChooserWidget = new FileChooserWidget(
    gtk_file_chooser_widget_new(action.raw).asInstanceOf
  )
end FileChooserWidget
