package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.Device
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{
  Accessible,
  Buildable,
  CellEditable,
  CellLayout,
  ConstraintTarget,
  ScrollType,
  SensitivityType,
  TreeIter,
  TreeModel,
  Widget
}
import sn.gnome.gtk4.internal.{GtkComboBox, GtkScrollType}
import sn.gnome.runtime.*

/** A `GtkComboBox` is a widget that allows the user to choose from a list of
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ComboBox private[gnome] (raw: Ptr[GtkComboBox])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      CellEditable,
      CellLayout,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the index of the currently active item.
    *
    * If the model is a non-flat treemodel, and the active item is not an
    * immediate child of the root of the tree, this function returns
    * `gtk_tree_path_get_indices (path)[0]`, where `path` is the
    * [struct@Gtk.TreePath] of the active item.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActive(): Int /* None */ =
    gtk_combo_box_get_active(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBox]]
    )
  end getActive

  /** Returns the ID of the active row of @combo_box.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActiveId(): scala.Predef.String /* None */ =
    fromCString(
      gtk_combo_box_get_active_id(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBox]]
      ).asInstanceOf
    )
  end getActiveId

  /** Sets @iter to point to the currently active item.
    *
    * If no item is active, @iter is left unchanged.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_active_iter]: Method get_active_iter contains an OUT parameter, which is not supported yet"
  )
  private def getActiveIter__ = ???

  /** Returns whether the combo box sets the dropdown button sensitive or not
    * when there are no items in the model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getButtonSensitivity(): sn.gnome.gtk4.SensitivityType /* None */ =
    sn.gnome.gtk4.SensitivityType.fromRaw(
      gtk_combo_box_get_button_sensitivity(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBox]]
      )
    )
  end getButtonSensitivity

  /** Gets the child widget of @combo_box.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_combo_box_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBox]]
      ).asInstanceOf
    )
  end getChild

  /** Returns the column which @combo_box is using to get the strings from to
    * display in the internal entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEntryTextColumn(): Int /* None */ =
    gtk_combo_box_get_entry_text_column(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBox]]
    )
  end getEntryTextColumn

  /** Returns whether the combo box has an entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHasEntry(): Boolean /* None */ =
    gtk_combo_box_get_has_entry(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBox]]
    ).value.!=(0)
  end getHasEntry

  /** Returns the column which @combo_box is using to get string IDs for values
    * from.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIdColumn(): Int /* None */ =
    gtk_combo_box_get_id_column(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBox]]
    )
  end getIdColumn

  /** Returns the `GtkTreeModel` of @combo_box.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModel(): sn.gnome.gtk4.TreeModel /* None */ =
    new TreeModel.Abstract(
      gtk_combo_box_get_model(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBox]]
      ).asInstanceOf
    )
  end getModel

  /** Gets whether the popup uses a fixed width.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPopupFixedWidth(): Boolean /* None */ =
    gtk_combo_box_get_popup_fixed_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBox]]
    ).value.!=(0)
  end getPopupFixedWidth

  /** Returns the current row separator function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_row_separator_func/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeViewRowSeparatorFunc), @type -> DataRecord(GtkTreeViewRowSeparatorFunc)))"
  )
  private def getRowSeparatorFunc__ = ???

  /** Hides the menu or dropdown list of @combo_box.
    *
    * This function is mostly intended for use by accessibility technologies;
    * applications should have little use for it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def popdown(): Unit /* None */ =
    gtk_combo_box_popdown(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBox]]
    )
  end popdown

  /** Pops up the menu or dropdown list of @combo_box.
    *
    * This function is mostly intended for use by accessibility technologies;
    * applications should have little use for it.
    *
    * Before calling this, @combo_box must be mapped, or nothing will happen.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def popup(): Unit /* None */ =
    gtk_combo_box_popup(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBox]]
    )
  end popup

  /** Pops up the menu of @combo_box.
    *
    * Note that currently this does not do anything with the device, as it was
    * previously only used for list-mode combo boxes, and those were removed in
    * GTK 4. However, it is retained in case similar functionality is added back
    * later.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def popupForDevice(
      device: sn.gnome.gdk4.Device /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDevice]) */
  )(using Runtime): Unit /* None */ =
    gtk_combo_box_popup_for_device(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBox]],
      device.getUnsafeRawPointer().asInstanceOf
    )
  end popupForDevice

  /** Sets the active item of @combo_box to be the item at @index.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setActive(`index_`: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_combo_box_set_active(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBox]],
      `index_`
    )
  end setActive

  /** Changes the active row of @combo_box to the one that has an ID equal to
    * @active_id.
    *
    * If @active_id is %NULL, the active row is unset. Rows having a %NULL ID
    * string cannot be made active by this function.
    *
    * If the [property@Gtk.ComboBox:id-column] property of @combo_box is unset
    * or if no row has the given ID then the function does nothing and returns
    * %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setActiveId(active_id: Option[scala.Predef.String /* Some(CString) */ ])(
      using Runtime
  ): Boolean /* None */ =
    gtk_combo_box_set_active_id(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBox]],
      active_id
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    ).value.!=(0)
  end setActiveId

  /** Sets the current active item to be the one referenced by @iter.
    *
    * If @iter is %NULL, the active item is unset.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setActiveIter(
      iter: Option[sn.gnome.gtk4.TreeIter /* Some(Ptr[GtkTreeIter]) */ ]
  ): Unit /* None */ =
    gtk_combo_box_set_active_iter(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBox]],
      iter
        .map[Ptr[GtkTreeIter]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkTreeIter]])
    )
  end setActiveIter

  /** Sets whether the dropdown button of the combo box should update its
    * sensitivity depending on the model contents.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setButtonSensitivity(
      sensitivity: sn.gnome.gtk4.SensitivityType /* Some(GtkSensitivityType) */
  ): Unit /* None */ =
    gtk_combo_box_set_button_sensitivity(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBox]],
      sensitivity.raw
    )
  end setButtonSensitivity

  /** Sets the child widget of @combo_box.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChild(child: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ])(
      using Runtime
  ): Unit /* None */ =
    gtk_combo_box_set_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBox]],
      child
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setChild

  /** Sets the model column which @combo_box should use to get strings from to
    * be @text_column.
    *
    * For this column no separate [class@Gtk.CellRenderer] is needed.
    *
    * The column @text_column in the model of @combo_box must be of type
    * %G_TYPE_STRING.
    *
    * This is only relevant if @combo_box has been created with
    * [property@Gtk.ComboBox:has-entry] as %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEntryTextColumn(text_column: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_combo_box_set_entry_text_column(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBox]],
      text_column
    )
  end setEntryTextColumn

  /** Sets the model column which @combo_box should use to get string IDs for
    * values from.
    *
    * The column @id_column in the model of @combo_box must be of type
    * %G_TYPE_STRING.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIdColumn(id_column: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_combo_box_set_id_column(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBox]],
      id_column
    )
  end setIdColumn

  /** Sets the model used by @combo_box to be @model.
    *
    * Will unset a previously set model (if applicable). If model is %NULL, then
    * it will unset the model.
    *
    * Note that this function does not clear the cell renderers, you have to
    * call [method@Gtk.CellLayout.clear] yourself if you need to set up
    * different cell renderers for the new model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModel(
      model: Option[sn.gnome.gtk4.TreeModel /* Some(Ptr[GtkTreeModel]) */ ]
  ): Unit /* None */ =
    gtk_combo_box_set_model(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBox]],
      model
        .map[Ptr[GtkTreeModel]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkTreeModel]])
    )
  end setModel

  /** Specifies whether the popup’s width should be a fixed width.
    *
    * If @fixed is %TRUE, the popup's width is set to match the allocated width
    * of the combo box.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPopupFixedWidth(
      fixed: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_combo_box_set_popup_fixed_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBox]],
      gboolean(gint((if fixed == true then 1 else 0)))
    )
  end setPopupFixedWidth

  /** Sets the row separator function, which is used to determine whether a row
    * should be drawn as a separator.
    *
    * If the row separator function is %NULL, no separators are drawn. This is
    * the default value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_row_separator_func/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeViewRowSeparatorFunc), @type -> DataRecord(GtkTreeViewRowSeparatorFunc)))"
  )
  private def setRowSeparatorFunc__ = ???

  /** Emitted to when the combo box is activated.
    *
    * The `::activate` signal on `GtkComboBox` is an action signal and emitting
    * it causes the combo box to pop up its dropdown.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivate(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkComboBox],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"activate"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onActivate

  /** Emitted when the active item is changed.
    *
    * The can be due to the user selecting a different item from the list, or
    * due to a call to [method@Gtk.ComboBox.set_active_iter]. It will also be
    * emitted while typing into the entry of a combo box with an entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onChanged(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkComboBox],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"changed"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onChanged

  /** Emitted to allow changing how the text in a combo box's entry is
    * displayed.
    *
    * See [property@Gtk.ComboBox:has-entry].
    *
    * Connect a signal handler which returns an allocated string representing
    * @path.
    *   That string will then be used to set the text in the combo box's entry.
    *   The default signal handler uses the text from the
    *   [property@Gtk.ComboBox:entry-text-column] model column.
    *
    * Here's an example signal handler which fetches data from the model and
    * displays it in the entry.
    * ```c
    * static char *
    * format_entry_text_callback (GtkComboBox *combo,
    *                             const char *path,
    *                             gpointer     user_data)
    * {
    *   GtkTreeIter iter;
    *   GtkTreeModel model;
    *   double       value;
    *
    *   model = gtk_combo_box_get_model (combo);
    *
    *   gtk_tree_model_get_iter_from_string (model, &iter, path);
    *   gtk_tree_model_get (model, &iter,
    *                       THE_DOUBLE_VALUE_COLUMN, &value,
    *                       -1);
    *
    *   return g_strdup_printf ("%g", value);
    * }
    * ```
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal format-entry-text]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar*)))"
  )
  private def onFormatEntryText = ???

  /** Emitted to move the active selection.
    *
    * This is an [keybinding signal](class.SignalAction.html).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onMoveActive(handler: ((scrollType: ScrollType)) => Unit)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (scrollType: ScrollType), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkComboBox],
          scrollType: GtkScrollType /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((scrollType = ScrollType.fromRaw(scrollType)))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"move-active"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onMoveActive

  /** Emitted to popdown the combo box list.
    *
    * This is an [keybinding signal](class.SignalAction.html).
    *
    * The default bindings for this signal are Alt+Up and Escape.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onPopdown(handler: => Boolean)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Boolean]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkComboBox],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"popdown"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onPopdown

  /** Emitted to popup the combo box list.
    *
    * This is an [keybinding signal](class.SignalAction.html).
    *
    * The default binding for this signal is Alt+Down.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onPopup(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkComboBox],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"popup"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onPopup
end ComboBox

object ComboBox:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkComboBox])(using Runtime) = summon[Runtime]
    .getOrCreate[ComboBox](ptr.asInstanceOf[Ptr[Byte]], p => new ComboBox(ptr))

  /** Creates a new empty `GtkComboBox`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): ComboBox =
    val raw: Ptr[Byte] = gtk_combo_box_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[ComboBox](raw, r => ComboBox.applyUnsafe(r.asInstanceOf))
  end apply

  /** Creates a new empty `GtkComboBox` with an entry.
    *
    * In order to use a combo box with entry, you need to tell it which column
    * of the model contains the text for the entry by calling
    * [method@Gtk.ComboBox.set_entry_text_column].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withEntry()(using Runtime): ComboBox =
    val raw: Ptr[Byte] = gtk_combo_box_new_with_entry().asInstanceOf
    summon[Runtime]
      .getOrCreate[ComboBox](raw, r => ComboBox.applyUnsafe(r.asInstanceOf))
  end withEntry

  /** Creates a new `GtkComboBox` with a model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withModel(model: sn.gnome.gtk4.TreeModel /* Some(Ptr[GtkTreeModel]) */ )(
      using Runtime
  ): ComboBox =
    val raw: Ptr[Byte] = gtk_combo_box_new_with_model(
      model.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[ComboBox](raw, r => ComboBox.applyUnsafe(r.asInstanceOf))
  end withModel

  /** Creates a new empty `GtkComboBox` with an entry and a model.
    *
    * See also [ctor@Gtk.ComboBox.new_with_entry].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withModelAndEntry(
      model: sn.gnome.gtk4.TreeModel /* Some(Ptr[GtkTreeModel]) */
  )(using Runtime): ComboBox =
    val raw: Ptr[Byte] = gtk_combo_box_new_with_model_and_entry(
      model.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[ComboBox](raw, r => ComboBox.applyUnsafe(r.asInstanceOf))
  end withModelAndEntry
end ComboBox
