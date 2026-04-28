package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.FileChooser
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkFileChooserAction
import sn.gnome.gtk4.internal.GtkFileChooserWidget

class FileChooserWidget(raw: Ptr[GtkFileChooserWidget])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      FileChooser:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end FileChooserWidget

object FileChooserWidget:
  def apply(action: GtkFileChooserAction): FileChooserWidget =
    new FileChooserWidget(gtk_file_chooser_widget_new(action).asInstanceOf)
end FileChooserWidget
