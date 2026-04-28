package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.CellEditable
import sn.gnome.gtk4.fluent.CellLayout
import sn.gnome.gtk4.fluent.ComboBox
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.internal.GtkComboBoxText

class ComboBoxText(raw: Ptr[GtkComboBoxText])
    extends ComboBox(raw.asInstanceOf),
      Accessible,
      Buildable,
      CellEditable,
      CellLayout,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def append(id: String | CString, text: String | CString)(using Zone): Unit =
    gtk_combo_box_text_append(
      this.raw.asInstanceOf,
      __sn_extract_string(id),
      __sn_extract_string(text)
    )

  def appendText(text: String | CString)(using Zone): Unit =
    gtk_combo_box_text_append_text(
      this.raw.asInstanceOf,
      __sn_extract_string(text)
    )

  def getActiveText()(using Zone): String = fromCString(
    gtk_combo_box_text_get_active_text(this.raw.asInstanceOf).asInstanceOf
  )

  def insert(position: Int, id: String | CString, text: String | CString)(using
      Zone
  ): Unit = gtk_combo_box_text_insert(
    this.raw.asInstanceOf,
    position,
    __sn_extract_string(id),
    __sn_extract_string(text)
  )

  def insertText(position: Int, text: String | CString)(using Zone): Unit =
    gtk_combo_box_text_insert_text(
      this.raw.asInstanceOf,
      position,
      __sn_extract_string(text)
    )

  def prepend(id: String | CString, text: String | CString)(using Zone): Unit =
    gtk_combo_box_text_prepend(
      this.raw.asInstanceOf,
      __sn_extract_string(id),
      __sn_extract_string(text)
    )

  def prependText(text: String | CString)(using Zone): Unit =
    gtk_combo_box_text_prepend_text(
      this.raw.asInstanceOf,
      __sn_extract_string(text)
    )

  def remove(position: Int): Unit =
    gtk_combo_box_text_remove(this.raw.asInstanceOf, position)

  def removeAll(): Unit = gtk_combo_box_text_remove_all(this.raw.asInstanceOf)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ComboBoxText

object ComboBoxText:
  def apply(): ComboBoxText = new ComboBoxText(
    gtk_combo_box_text_new().asInstanceOf
  )
  def withEntry(): ComboBoxText = new ComboBoxText(
    gtk_combo_box_text_new_with_entry().asInstanceOf
  )
end ComboBoxText
