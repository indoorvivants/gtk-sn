package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.FontChooser
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkFontChooserWidget

class FontChooserWidget(raw: Ptr[GtkFontChooserWidget])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      FontChooser:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end FontChooserWidget

object FontChooserWidget:
  def apply(): FontChooserWidget = new FontChooserWidget(
    gtk_font_chooser_widget_new().asInstanceOf
  )
end FontChooserWidget
