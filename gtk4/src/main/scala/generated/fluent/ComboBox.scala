package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Device
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  CellEditable,
  CellLayout,
  ConstraintTarget,
  SensitivityType,
  TreeModel,
  Widget
}
import sn.gnome.gtk4.internal.GtkComboBox

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkComboBox` is a widget that allows the user to choose from a list of
  * valid choices.
  *
  * ![An example GtkComboBox](combo-box.png)
  *
  * The `GtkComboBox` displays the selected choice; when activated, the
  * `GtkComboBox` displays a popup which allows the user to make a new choice.
  *
  * The `GtkComboBox` uses the model-view pattern; the list of valid choices is
  * specified in the form of a tree model, and the display of the choices can be
  * adapted to the data in the model by using cell renderers, as you would in a
  * tree view. This is possible since `GtkComboBox` implements the
  * [iface@Gtk.CellLayout] interface. The tree model holding the valid choices
  * is not restricted to a flat list, it can be a real tree, and the popup will
  * reflect the tree structure.
  *
  * To allow the user to enter values not in the model, the
  * [property@Gtk.ComboBox:has-entry] property allows the `GtkComboBox` to
  * contain a [class@Gtk.Entry]. This entry can be accessed by calling
  * [method@Gtk.ComboBox.get_child] on the combo box.
  *
  * For a simple list of textual choices, the model-view API of `GtkComboBox`
  * can be a bit overwhelming. In this case, [class@Gtk.ComboBoxText] offers a
  * simple alternative. Both `GtkComboBox` and `GtkComboBoxText` can contain an
  * entry.
  *
  * ## CSS nodes
  *
  * ```
  * combobox
  * ├── box.linked
  * │   ╰── button.combo
  * │       ╰── box
  * │           ├── cellview
  * │           ╰── arrow
  * ╰── window.popup
  * ```
  *
  * A normal combobox contains a box with the .linked class, a button with the
  * .combo class and inside those buttons, there are a cellview and an arrow.
  *
  * ```
  * combobox
  * ├── box.linked
  * │   ├── entry.combo
  * │   ╰── button.combo
  * │       ╰── box
  * │           ╰── arrow
  * ╰── window.popup
  * ```
  *
  * A `GtkComboBox` with an entry has a single CSS node with name combobox. It
  * contains a box with the .linked class. That box contains an entry and a
  * button, both with the .combo class added. The button also contains another
  * node with name arrow.
  *
  * ## Accessibility
  *
  * `GtkComboBox` uses the %GTK_ACCESSIBLE_ROLE_COMBO_BOX role.
  */
class ComboBox(raw: Ptr[GtkComboBox])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      CellEditable,
      CellLayout,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the index of the currently active item.
    *
    * If the model is a non-flat treemodel, and the active item is not an
    * immediate child of the root of the tree, this function returns
    * `gtk_tree_path_get_indices (path)[0]`, where `path` is the
    * [struct@Gtk.TreePath] of the active item.
    */
  def getActive(): Int /* None */ = gtk_combo_box_get_active(
    this.raw.asInstanceOf[Ptr[GtkComboBox]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the ID of the active row of @combo_box.
    *
    * This value is taken from the active row and the column specified by the
    * [property@Gtk.ComboBox:id-column] property of @combo_box (see
    * [method@Gtk.ComboBox.set_id_column]).
    *
    * The returned value is an interned string which means that you can compare
    * the pointer by value to other interned strings and that you must not free
    * it.
    *
    * If the [property@Gtk.ComboBox:id-column] property of @combo_box is not
    * set, or if no row is active, or if the active row has a %NULL ID value,
    * then %NULL is returned.
    */
  def getActiveId()(using Zone): String /* None */ = fromCString(
    gtk_combo_box_get_active_id(
      this.raw.asInstanceOf[Ptr[GtkComboBox]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @iter to point to the currently active item.
    *
    * If no item is active, @iter is left unchanged.
    */
  @annotation.compileTimeOnly(
    "Method get_active_iter contains an OUT parameter, which is not supported yet"
  )
  def getActiveIter__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the combo box sets the dropdown button sensitive or not
    * when there are no items in the model.
    */
  def getButtonSensitivity(): SensitivityType /* None */ =
    SensitivityType.fromRaw(
      gtk_combo_box_get_button_sensitivity(
        this.raw.asInstanceOf[Ptr[GtkComboBox]]
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child widget of @combo_box.
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_combo_box_get_child(
      this.raw.asInstanceOf[Ptr[GtkComboBox]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the column which @combo_box is using to get the strings from to
    * display in the internal entry.
    */
  def getEntryTextColumn(): Int /* None */ =
    gtk_combo_box_get_entry_text_column(this.raw.asInstanceOf[Ptr[GtkComboBox]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the combo box has an entry.
    */
  def getHasEntry(): Boolean /* None */ = gtk_combo_box_get_has_entry(
    this.raw.asInstanceOf[Ptr[GtkComboBox]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the column which @combo_box is using to get string IDs for values
    * from.
    */
  def getIdColumn(): Int /* None */ = gtk_combo_box_get_id_column(
    this.raw.asInstanceOf[Ptr[GtkComboBox]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GtkTreeModel` of @combo_box.
    */
  def getModel(): TreeModel /* None */ = new TreeModel.Abstract(
    gtk_combo_box_get_model(
      this.raw.asInstanceOf[Ptr[GtkComboBox]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the popup uses a fixed width.
    */
  def getPopupFixedWidth(): Boolean /* None */ =
    gtk_combo_box_get_popup_fixed_width(
      this.raw.asInstanceOf[Ptr[GtkComboBox]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the current row separator function.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeViewRowSeparatorFunc), @type -> DataRecord(GtkTreeViewRowSeparatorFunc)))"
  )
  def getRowSeparatorFunc__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hides the menu or dropdown list of @combo_box.
    *
    * This function is mostly intended for use by accessibility technologies;
    * applications should have little use for it.
    */
  def popdown(): Unit /* None */ = gtk_combo_box_popdown(
    this.raw.asInstanceOf[Ptr[GtkComboBox]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pops up the menu or dropdown list of @combo_box.
    *
    * This function is mostly intended for use by accessibility technologies;
    * applications should have little use for it.
    *
    * Before calling this, @combo_box must be mapped, or nothing will happen.
    */
  def popup(): Unit /* None */ = gtk_combo_box_popup(
    this.raw.asInstanceOf[Ptr[GtkComboBox]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pops up the menu of @combo_box.
    *
    * Note that currently this does not do anything with the device, as it was
    * previously only used for list-mode combo boxes, and those were removed in
    * GTK 4. However, it is retained in case similar functionality is added back
    * later.
    */
  def popupForDevice(
      device: Device /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDevice]) */
  ): Unit /* None */ = gtk_combo_box_popup_for_device(
    this.raw.asInstanceOf[Ptr[GtkComboBox]],
    device.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the active item of @combo_box to be the item at @index.
    */
  def setActive(`index_`: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_combo_box_set_active(this.raw.asInstanceOf[Ptr[GtkComboBox]], `index_`)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Changes the active row of @combo_box to the one that has an ID equal to
    * @active_id.
    *
    * If @active_id is %NULL, the active row is unset. Rows having a %NULL ID
    * string cannot be made active by this function.
    *
    * If the [property@Gtk.ComboBox:id-column] property of @combo_box is unset
    * or if no row has the given ID then the function does nothing and returns
    * %FALSE.
    */
  def setActiveId(
      active_id: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Boolean /* None */ = gtk_combo_box_set_active_id(
    this.raw.asInstanceOf[Ptr[GtkComboBox]],
    active_id
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the current active item to be the one referenced by @iter.
    *
    * If @iter is %NULL, the active item is unset.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))"
  )
  def setActiveIter__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the dropdown button of the combo box should update its
    * sensitivity depending on the model contents.
    */
  def setButtonSensitivity(
      sensitivity: SensitivityType /* Some(GtkSensitivityType) */
  ): Unit /* None */ = gtk_combo_box_set_button_sensitivity(
    this.raw.asInstanceOf[Ptr[GtkComboBox]],
    sensitivity.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the child widget of @combo_box.
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_combo_box_set_child(
    this.raw.asInstanceOf[Ptr[GtkComboBox]],
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the model column which @combo_box should use to get strings from to
    * be @text_column.
    *
    * For this column no separate [class@Gtk.CellRenderer] is needed.
    *
    * The column @text_column in the model of @combo_box must be of type
    * %G_TYPE_STRING.
    *
    * This is only relevant if @combo_box has been created with
    * [property@Gtk.ComboBox:has-entry] as %TRUE.
    */
  def setEntryTextColumn(text_column: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_combo_box_set_entry_text_column(
      this.raw.asInstanceOf[Ptr[GtkComboBox]],
      text_column
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the model column which @combo_box should use to get string IDs for
    * values from.
    *
    * The column @id_column in the model of @combo_box must be of type
    * %G_TYPE_STRING.
    */
  def setIdColumn(id_column: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_combo_box_set_id_column(
      this.raw.asInstanceOf[Ptr[GtkComboBox]],
      id_column
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the model used by @combo_box to be @model.
    *
    * Will unset a previously set model (if applicable). If model is %NULL, then
    * it will unset the model.
    *
    * Note that this function does not clear the cell renderers, you have to
    * call [method@Gtk.CellLayout.clear] yourself if you need to set up
    * different cell renderers for the new model.
    */
  def setModel(
      model: Option[TreeModel /* Some(Ptr[GtkTreeModel]) */ ]
  ): Unit /* None */ = gtk_combo_box_set_model(
    this.raw.asInstanceOf[Ptr[GtkComboBox]],
    model
      .map[Ptr[GtkTreeModel]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkTreeModel]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Specifies whether the popup’s width should be a fixed width.
    *
    * If @fixed is %TRUE, the popup's width is set to match the allocated width
    * of the combo box.
    */
  def setPopupFixedWidth(
      fixed: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_combo_box_set_popup_fixed_width(
    this.raw.asInstanceOf[Ptr[GtkComboBox]],
    gboolean(gint((if fixed == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the row separator function, which is used to determine whether a row
    * should be drawn as a separator.
    *
    * If the row separator function is %NULL, no separators are drawn. This is
    * the default value.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeViewRowSeparatorFunc), @type -> DataRecord(GtkTreeViewRowSeparatorFunc)))"
  )
  def setRowSeparatorFunc__ = ???

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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new empty `GtkComboBox`.
    */
  def apply(): ComboBox = new ComboBox(gtk_combo_box_new().asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new empty `GtkComboBox` with an entry.
    *
    * In order to use a combo box with entry, you need to tell it which column
    * of the model contains the text for the entry by calling
    * [method@Gtk.ComboBox.set_entry_text_column].
    */
  def withEntry(): ComboBox = new ComboBox(
    gtk_combo_box_new_with_entry().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkComboBox` with a model.
    */
  def withModel(model: TreeModel /* Some(Ptr[GtkTreeModel]) */ ): ComboBox =
    new ComboBox(
      gtk_combo_box_new_with_model(
        model.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new empty `GtkComboBox` with an entry and a model.
    *
    * See also [ctor@Gtk.ComboBox.new_with_entry].
    */
  def withModelAndEntry(
      model: TreeModel /* Some(Ptr[GtkTreeModel]) */
  ): ComboBox = new ComboBox(
    gtk_combo_box_new_with_model_and_entry(
      model.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end ComboBox
