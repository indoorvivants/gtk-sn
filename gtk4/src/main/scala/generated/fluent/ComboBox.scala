package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Device
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.CellEditable
import sn.gnome.gtk4.fluent.CellLayout
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.TreeModel
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkComboBox
import sn.gnome.gtk4.internal.GtkSensitivityType
import sn.gnome.gtk4.internal.GtkTreeIter
import sn.gnome.gtk4.internal.GtkTreeViewRowSeparatorFunc

class ComboBox(raw: Ptr[GtkComboBox])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      CellEditable,
      CellLayout,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getActive(): Int = gtk_combo_box_get_active(this.raw.asInstanceOf)

  def getActiveId()(using Zone): String = fromCString(
    gtk_combo_box_get_active_id(this.raw.asInstanceOf).asInstanceOf
  )

  // Method get_active_iter contains an OUT parameter, which is not supported yet

  def getButtonSensitivity(): GtkSensitivityType =
    gtk_combo_box_get_button_sensitivity(this.raw.asInstanceOf)

  def getChild(): Widget = new Widget(
    gtk_combo_box_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getEntryTextColumn(): Int = gtk_combo_box_get_entry_text_column(
    this.raw.asInstanceOf
  )

  def getHasEntry(): Boolean =
    gtk_combo_box_get_has_entry(this.raw.asInstanceOf).value.!=(0)

  def getIdColumn(): Int = gtk_combo_box_get_id_column(this.raw.asInstanceOf)

  def getModel(): TreeModel = new TreeModel.Abstract(
    gtk_combo_box_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  def getPopupFixedWidth(): Boolean =
    gtk_combo_box_get_popup_fixed_width(this.raw.asInstanceOf).value.!=(0)

  def getRowSeparatorFunc(): GtkTreeViewRowSeparatorFunc =
    gtk_combo_box_get_row_separator_func(this.raw.asInstanceOf)

  def popdown(): Unit = gtk_combo_box_popdown(this.raw.asInstanceOf)

  def popup(): Unit = gtk_combo_box_popup(this.raw.asInstanceOf)

  def popupForDevice(device: Device): Unit = gtk_combo_box_popup_for_device(
    this.raw.asInstanceOf,
    device.getUnsafeRawPointer().asInstanceOf
  )

  def setActive(`index_`: Int): Unit =
    gtk_combo_box_set_active(this.raw.asInstanceOf, `index_`)

  def setActiveId(active_id: String | CString)(using Zone): Boolean =
    gtk_combo_box_set_active_id(
      this.raw.asInstanceOf,
      __sn_extract_string(active_id)
    ).value.!=(0)

  def setActiveIter(iter: Ptr[GtkTreeIter]): Unit =
    gtk_combo_box_set_active_iter(this.raw.asInstanceOf, iter)

  def setButtonSensitivity(sensitivity: GtkSensitivityType): Unit =
    gtk_combo_box_set_button_sensitivity(this.raw.asInstanceOf, sensitivity)

  def setChild(child: Widget): Unit = gtk_combo_box_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setEntryTextColumn(text_column: Int): Unit =
    gtk_combo_box_set_entry_text_column(this.raw.asInstanceOf, text_column)

  def setIdColumn(id_column: Int): Unit =
    gtk_combo_box_set_id_column(this.raw.asInstanceOf, id_column)

  def setModel(model: TreeModel): Unit = gtk_combo_box_set_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

  def setPopupFixedWidth(fixed: Boolean): Unit =
    gtk_combo_box_set_popup_fixed_width(
      this.raw.asInstanceOf,
      gboolean(gint((if fixed == true then 1 else 0)))
    )

  def setRowSeparatorFunc(
      func: GtkTreeViewRowSeparatorFunc,
      data: Ptr[Byte],
      destroy: GDestroyNotify
  ): Unit = gtk_combo_box_set_row_separator_func(
    this.raw.asInstanceOf,
    func,
    gpointer(data),
    destroy
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ComboBox

object ComboBox:
  def apply(): ComboBox = new ComboBox(gtk_combo_box_new().asInstanceOf)
  def withEntry(): ComboBox = new ComboBox(
    gtk_combo_box_new_with_entry().asInstanceOf
  )
  def withModel(model: TreeModel): ComboBox = new ComboBox(
    gtk_combo_box_new_with_model(
      model.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
  def withModelAndEntry(model: TreeModel): ComboBox = new ComboBox(
    gtk_combo_box_new_with_model_and_entry(
      model.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end ComboBox
