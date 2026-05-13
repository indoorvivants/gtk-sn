package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  CellEditable,
  CellLayout,
  ComboBox,
  ConstraintTarget
}
import sn.gnome.gtk4.internal.GtkComboBoxText

/** A `GtkComboBoxText` is a simple variant of `GtkComboBox` for text-only use
  * cases.
  *
  * ![An example GtkComboBoxText](combo-box-text.png)
  *
  * `GtkComboBoxText` hides the model-view complexity of `GtkComboBox`.
  *
  * To create a `GtkComboBoxText`, use [ctor@Gtk.ComboBoxText.new] or
  * [ctor@Gtk.ComboBoxText.new_with_entry].
  *
  * You can add items to a `GtkComboBoxText` with
  * [method@Gtk.ComboBoxText.append_text], [method@Gtk.ComboBoxText.insert_text]
  * or [method@Gtk.ComboBoxText.prepend_text] and remove options with
  * [method@Gtk.ComboBoxText.remove].
  *
  * If the `GtkComboBoxText` contains an entry (via the
  * [property@Gtk.ComboBox:has-entry] property), its contents can be retrieved
  * using [method@Gtk.ComboBoxText.get_active_text].
  *
  * You should not call [method@Gtk.ComboBox.set_model] or attempt to pack more
  * cells into this combo box via its [iface@Gtk.CellLayout] interface.
  *
  * ## GtkComboBoxText as GtkBuildable
  *
  * The `GtkComboBoxText` implementation of the `GtkBuildable` interface
  * supports adding items directly using the `<items>` element and specifying
  * `<item>` elements for each item. Each `<item>` element can specify the “id”
  * corresponding to the appended text and also supports the regular translation
  * attributes “translatable”, “context” and “comments”.
  *
  * Here is a UI definition fragment specifying `GtkComboBoxText` items:
  * ```xml
  * <object class="GtkComboBoxText">
  *   <items>
  *     <item translatable="yes" id="factory">Factory</item>
  *     <item translatable="yes" id="home">Home</item>
  *     <item translatable="yes" id="subway">Subway</item>
  *   </items>
  * </object>
  * ```
  *
  * ## CSS nodes
  *
  * ```
  * combobox
  * ╰── box.linked
  *     ├── entry.combo
  *     ├── button.combo
  *     ╰── window.popup
  * ```
  *
  * `GtkComboBoxText` has a single CSS node with name combobox. It adds the
  * style class .combo to the main CSS nodes of its entry and button children,
  * and the .linked class to the node of its internal box.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ComboBoxText private[gnome] (raw: Ptr[GtkComboBoxText])
    extends ComboBox(raw.asInstanceOf),
      Accessible,
      Buildable,
      CellEditable,
      CellLayout,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Appends @text to the list of strings stored in @combo_box.
    *
    * If @id is non-%NULL then it is used as the ID of the row.
    *
    * This is the same as calling [method@Gtk.ComboBoxText.insert] with a
    * position of -1.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def append(
      id: Option[String /* Some(CString) */ ],
      text: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_combo_box_text_append(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBoxText]],
      id.map[CString](o => toCString(o)).getOrElse(null.asInstanceOf[CString]),
      toCString(text)
    )
  end append

  /** Appends @text to the list of strings stored in @combo_box.
    *
    * This is the same as calling [method@Gtk.ComboBoxText.insert_text] with a
    * position of -1.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendText(
      text: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_combo_box_text_append_text(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBoxText]],
      toCString(text)
    )
  end appendText

  /** Returns the currently active string in @combo_box.
    *
    * If no row is currently selected, %NULL is returned. If @combo_box contains
    * an entry, this function will return its contents (which will not
    * necessarily be an item from the list).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActiveText()(using Zone): String /* None */ =
    fromCString(
      gtk_combo_box_text_get_active_text(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBoxText]]
      ).asInstanceOf
    )
  end getActiveText

  /** Inserts @text at @position in the list of strings stored in @combo_box.
    *
    * If @id is non-%NULL then it is used as the ID of the row. See
    * [property@Gtk.ComboBox:id-column].
    *
    * If @position is negative then @text is appended.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insert(
      position: Int /* Some(CInt) */,
      id: Option[String /* Some(CString) */ ],
      text: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_combo_box_text_insert(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBoxText]],
      position,
      id.map[CString](o => toCString(o)).getOrElse(null.asInstanceOf[CString]),
      toCString(text)
    )
  end insert

  /** Inserts @text at @position in the list of strings stored in @combo_box.
    *
    * If @position is negative then @text is appended.
    *
    * This is the same as calling [method@Gtk.ComboBoxText.insert] with a %NULL
    * ID string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertText(
      position: Int /* Some(CInt) */,
      text: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_combo_box_text_insert_text(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBoxText]],
      position,
      toCString(text)
    )
  end insertText

  /** Prepends @text to the list of strings stored in @combo_box.
    *
    * If @id is non-%NULL then it is used as the ID of the row.
    *
    * This is the same as calling [method@Gtk.ComboBoxText.insert] with a
    * position of 0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prepend(
      id: Option[String /* Some(CString) */ ],
      text: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_combo_box_text_prepend(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBoxText]],
      id.map[CString](o => toCString(o)).getOrElse(null.asInstanceOf[CString]),
      toCString(text)
    )
  end prepend

  /** Prepends @text to the list of strings stored in @combo_box.
    *
    * This is the same as calling [method@Gtk.ComboBoxText.insert_text] with a
    * position of 0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prependText(
      text: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_combo_box_text_prepend_text(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBoxText]],
      toCString(text)
    )
  end prependText

  /** Removes the string at @position from @combo_box.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remove(position: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_combo_box_text_remove(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBoxText]],
      position
    )
  end remove

  /** Removes all the text entries from the combo box.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeAll(): Unit /* None */ =
    gtk_combo_box_text_remove_all(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkComboBoxText]]
    )
  end removeAll

end ComboBoxText

object ComboBoxText:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkComboBoxText])(using Runtime) =
    summon[Runtime].getOrCreate[ComboBoxText](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ComboBoxText(ptr)
    )

  /** Creates a new `GtkComboBoxText`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): ComboBoxText =
    val raw: Ptr[Byte] = gtk_combo_box_text_new().asInstanceOf
    summon[Runtime].getOrCreate[ComboBoxText](
      raw,
      r => ComboBoxText.applyUnsafe(r.asInstanceOf)
    )
  end apply

  /** Creates a new `GtkComboBoxText` with an entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withEntry()(using Runtime): ComboBoxText =
    val raw: Ptr[Byte] = gtk_combo_box_text_new_with_entry().asInstanceOf
    summon[Runtime].getOrCreate[ComboBoxText](
      raw,
      r => ComboBoxText.applyUnsafe(r.asInstanceOf)
    )
  end withEntry
end ComboBoxText
