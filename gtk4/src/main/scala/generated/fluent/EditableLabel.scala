package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ConstraintTarget,
  Editable,
  Widget
}
import sn.gnome.gtk4.internal.GtkEditableLabel

/** A `GtkEditableLabel` is a label that allows users to edit the text by
  * switching to an “edit mode”.
  *
  * ![An example GtkEditableLabel](editable-label.png)
  *
  * `GtkEditableLabel` does not have API of its own, but it implements the
  * [iface@Gtk.Editable] interface.
  *
  * The default bindings for activating the edit mode is to click or press the
  * Enter key. The default bindings for leaving the edit mode are the Enter key
  * (to save the results) or the Escape key (to cancel the editing).
  *
  * # CSS nodes
  *
  * ```
  * editablelabel[.editing]
  * ╰── stack
  *     ├── label
  *     ╰── text
  * ```
  *
  * `GtkEditableLabel` has a main node with the name editablelabel. When the
  * entry is in editing mode, it gets the .editing style class.
  *
  * For all the subnodes added to the text node in various situations, see
  * [class@Gtk.Text].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class EditableLabel private[gnome] (raw: Ptr[GtkEditableLabel])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Editable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns whether the label is currently in “editing mode”.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEditing(): Boolean /* None */ =
    gtk_editable_label_get_editing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditableLabel]]
    ).value.!=(0)
  end getEditing

  /** Switches the label into “editing mode”.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def startEditing(): Unit /* None */ =
    gtk_editable_label_start_editing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditableLabel]]
    )
  end startEditing

  /** Switches the label out of “editing mode”.
    *
    * If @commit is %TRUE, the resulting text is kept as the
    * [property@Gtk.Editable:text] property value, otherwise the resulting text
    * is discarded and the label will keep its previous
    * [property@Gtk.Editable:text] property value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def stopEditing(
      commit: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_editable_label_stop_editing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditableLabel]],
      gboolean(gint((if commit == true then 1 else 0)))
    )
  end stopEditing

end EditableLabel

object EditableLabel:
  def applyUnsafe(ptr: Ptr[GtkEditableLabel])(using Runtime) =
    summon[Runtime].getOrCreate[EditableLabel](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new EditableLabel(ptr)
    )

  /** Creates a new `GtkEditableLabel` widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      str: String /* Some(CString) */
  )(using Zone, Runtime): EditableLabel =
    val raw: Ptr[Byte] = gtk_editable_label_new(toCString(str)).asInstanceOf
    summon[Runtime].getOrCreate[EditableLabel](
      raw,
      r => EditableLabel.applyUnsafe(r.asInstanceOf)
    )
  end apply
end EditableLabel
