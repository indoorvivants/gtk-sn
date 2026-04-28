package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Editable
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkEditableLabel

class EditableLabel(raw: Ptr[GtkEditableLabel])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Editable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getEditing(): Boolean =
    gtk_editable_label_get_editing(this.raw.asInstanceOf).value.!=(0)

  def startEditing(): Unit = gtk_editable_label_start_editing(
    this.raw.asInstanceOf
  )

  def stopEditing(commit: Boolean): Unit = gtk_editable_label_stop_editing(
    this.raw.asInstanceOf,
    gboolean(gint((if commit == true then 1 else 0)))
  )

end EditableLabel

object EditableLabel:
  def apply(str: String | CString)(using Zone): EditableLabel =
    new EditableLabel(
      gtk_editable_label_new(__sn_extract_string(str)).asInstanceOf
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end EditableLabel
