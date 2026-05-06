package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.internal.GtkColumnViewRow

/** `GtkColumnViewRow` is used by [class@Gtk.ColumnView] to allow configuring
  * how rows are displayed.
  *
  * It is not used to set the widgets displayed in the individual cells. For
  * that see [method@GtkColumnViewColumn.set_factory] and
  * [class@GtkColumnViewCell].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ColumnViewRow(raw: Ptr[GtkColumnViewRow])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the accessible description of @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAccessibleDescription()(using Zone): String /* None */ = fromCString(
    gtk_column_view_row_get_accessible_description(
      this.raw.asInstanceOf[Ptr[GtkColumnViewRow]]
    ).asInstanceOf
  )

  /** Gets the accessible label of @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAccessibleLabel()(using Zone): String /* None */ = fromCString(
    gtk_column_view_row_get_accessible_label(
      this.raw.asInstanceOf[Ptr[GtkColumnViewRow]]
    ).asInstanceOf
  )

  /** Checks if the row has been set to be activatable via
    * gtk_column_view_row_set_activatable().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActivatable(): Boolean /* None */ =
    gtk_column_view_row_get_activatable(
      this.raw.asInstanceOf[Ptr[GtkColumnViewRow]]
    ).value.!=(0)

  /** Checks if a row item has been set to be focusable via
    * gtk_column_view_row_set_focusable().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFocusable(): Boolean /* None */ = gtk_column_view_row_get_focusable(
    this.raw.asInstanceOf[Ptr[GtkColumnViewRow]]
  ).value.!=(0)

  /** Gets the model item that associated with @self.
    *
    * If @self is unbound, this function returns %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getItem(): Object /* None */ = new Object(
    gtk_column_view_row_get_item(
      this.raw.asInstanceOf[Ptr[GtkColumnViewRow]]
    ).asInstanceOf
  )

  /** Gets the position in the model that @self currently displays.
    *
    * If @self is unbound, %GTK_INVALID_LIST_POSITION is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPosition(): UInt /* None */ = gtk_column_view_row_get_position(
    this.raw.asInstanceOf[Ptr[GtkColumnViewRow]]
  ).value

  /** Checks if the row has been set to be selectable via
    * gtk_column_view_row_set_selectable().
    *
    * Do not confuse this function with [method@Gtk.ColumnViewRow.get_selected].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSelectable(): Boolean /* None */ = gtk_column_view_row_get_selectable(
    this.raw.asInstanceOf[Ptr[GtkColumnViewRow]]
  ).value.!=(0)

  /** Checks if the item is selected that this row corresponds to.
    *
    * The selected state is maintained by the list widget and its model and
    * cannot be set otherwise.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSelected(): Boolean /* None */ = gtk_column_view_row_get_selected(
    this.raw.asInstanceOf[Ptr[GtkColumnViewRow]]
  ).value.!=(0)

  /** Sets the accessible description for the row, which may be used by e.g.
    * screen readers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAccessibleDescription(
      description: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_column_view_row_set_accessible_description(
      this.raw.asInstanceOf[Ptr[GtkColumnViewRow]],
      __sn_extract_string(description)
    )

  /** Sets the accessible label for the row, which may be used by e.g. screen
    * readers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAccessibleLabel(
      label: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_column_view_row_set_accessible_label(
    this.raw.asInstanceOf[Ptr[GtkColumnViewRow]],
    __sn_extract_string(label)
  )

  /** Sets @self to be activatable.
    *
    * If a row is activatable, double-clicking on the row, using the Return key
    * or calling gtk_widget_activate() will activate the row. Activating
    * instructs the containing columnview to emit the
    * [signal@Gtk.ColumnView::activate] signal.
    *
    * By default, row are activatable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setActivatable(
      activatable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_column_view_row_set_activatable(
    this.raw.asInstanceOf[Ptr[GtkColumnViewRow]],
    gboolean(gint((if activatable == true then 1 else 0)))
  )

  /** Sets @self to be focusable.
    *
    * If a row is focusable, it can be focused using the keyboard. This works
    * similar to [method@Gtk.Widget.set_focusable].
    *
    * Note that if row are not focusable, the contents of cells can still be
    * focused if they are focusable.
    *
    * By default, rows are focusable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFocusable(
      focusable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_column_view_row_set_focusable(
    this.raw.asInstanceOf[Ptr[GtkColumnViewRow]],
    gboolean(gint((if focusable == true then 1 else 0)))
  )

  /** Sets @self to be selectable.
    *
    * If a row is selectable, clicking on the row or using the keyboard will try
    * to select or unselect the row. Whether this succeeds is up to the model to
    * determine, as it is managing the selected state.
    *
    * Note that this means that making a row non-selectable has no influence on
    * the selected state at all. A non-selectable row may still be selected.
    *
    * By default, rows are selectable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSelectable(
      selectable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_column_view_row_set_selectable(
    this.raw.asInstanceOf[Ptr[GtkColumnViewRow]],
    gboolean(gint((if selectable == true then 1 else 0)))
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ColumnViewRow
