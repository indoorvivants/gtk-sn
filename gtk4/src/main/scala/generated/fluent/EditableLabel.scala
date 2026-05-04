package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
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
class EditableLabel(raw: Ptr[GtkEditableLabel])
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
  def getEditing(): Boolean /* None */ = gtk_editable_label_get_editing(
    this.raw.asInstanceOf[Ptr[GtkEditableLabel]]
  ).value.!=(0)

  /** Switches the label into “editing mode”.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def startEditing(): Unit /* None */ = gtk_editable_label_start_editing(
    this.raw.asInstanceOf[Ptr[GtkEditableLabel]]
  )

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
  ): Unit /* None */ = gtk_editable_label_stop_editing(
    this.raw.asInstanceOf[Ptr[GtkEditableLabel]],
    gboolean(gint((if commit == true then 1 else 0)))
  )

end EditableLabel

object EditableLabel:
  /** Creates a new `GtkEditableLabel` widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      str: String | CString /* Some(CString) */
  )(using Zone): EditableLabel = new EditableLabel(
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
