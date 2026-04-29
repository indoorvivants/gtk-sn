package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Expression
import sn.gnome.gtk4.fluent.ListItemFactory
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkDropDown
import sn.gnome.gtk4.internal.GtkStringFilterMatchMode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkDropDown` is a widget that allows the user to choose an item from a list
  * of options.
  *
  * ![An example GtkDropDown](drop-down.png)
  *
  * The `GtkDropDown` displays the [selected][property@Gtk.DropDown:selected]
  * choice.
  *
  * The options are given to `GtkDropDown` in the form of `GListModel` and how
  * the individual options are represented is determined by a
  * [class@Gtk.ListItemFactory]. The default factory displays simple strings,
  * and adds a checkmark to the selected item in the popup.
  *
  * To set your own factory, use [method@Gtk.DropDown.set_factory]. It is
  * possible to use a separate factory for the items in the popup, with
  * [method@Gtk.DropDown.set_list_factory].
  *
  * `GtkDropDown` knows how to obtain strings from the items in a
  * [class@Gtk.StringList]; for other models, you have to provide an expression
  * to find the strings via [method@Gtk.DropDown.set_expression].
  *
  * `GtkDropDown` can optionally allow search in the popup, which is useful if
  * the list of options is long. To enable the search entry, use
  * [method@Gtk.DropDown.set_enable_search].
  *
  * Here is a UI definition example for `GtkDropDown` with a simple model:
  *
  * ```xml
  * <object class="GtkDropDown">
  *   <property name="model">
  *     <object class="GtkStringList">
  *       <items>
  *         <item translatable="yes">Factory</item>
  *         <item translatable="yes">Home</item>
  *         <item translatable="yes">Subway</item>
  *       </items>
  *     </object>
  *   </property>
  * </object>
  * ```
  *
  * To learn more about the list widget framework, see the
  * [overview](section-list-widget.html).
  *
  * ## CSS nodes
  *
  * `GtkDropDown` has a single CSS node with name dropdown, with the button and
  * popover nodes as children.
  *
  * ## Accessibility
  *
  * `GtkDropDown` uses the %GTK_ACCESSIBLE_ROLE_COMBO_BOX role.
  */
class DropDown(raw: Ptr[GtkDropDown])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether search is enabled.
    */
  def getEnableSearch(): Boolean =
    gtk_drop_down_get_enable_search(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the expression set that is used to obtain strings from items.
    *
    * See [method@Gtk.DropDown.set_expression].
    */
  def getExpression(): Expression = new Expression(
    gtk_drop_down_get_expression(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the factory that's currently used to populate list items.
    *
    * The factory returned by this function is always used for the item in the
    * button. It is also used for items in the popup if
    * [property@Gtk.DropDown:list-factory] is not set.
    */
  def getFactory(): ListItemFactory = new ListItemFactory(
    gtk_drop_down_get_factory(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the factory that's currently used to create header widgets for the
    * popup.
    */
  def getHeaderFactory(): ListItemFactory = new ListItemFactory(
    gtk_drop_down_get_header_factory(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the factory that's currently used to populate list items in the
    * popup.
    */
  def getListFactory(): ListItemFactory = new ListItemFactory(
    gtk_drop_down_get_list_factory(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the model that provides the displayed items.
    */
  def getModel(): ListModel = new ListModel.Abstract(
    gtk_drop_down_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the match mode that the search filter is using.
    */
  def getSearchMatchMode(): GtkStringFilterMatchMode =
    gtk_drop_down_get_search_match_mode(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the position of the selected item.
    */
  def getSelected(): UInt = gtk_drop_down_get_selected(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the selected item. If no item is selected, %NULL is returned.
    */
  def getSelectedItem(): Object = new Object(
    gtk_drop_down_get_selected_item(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether to show an arrow within the widget.
    */
  def getShowArrow(): Boolean =
    gtk_drop_down_get_show_arrow(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether a search entry will be shown in the popup that allows to
    * search for items in the list.
    *
    * Note that [property@Gtk.DropDown:expression] must be set for search to
    * work.
    */
  def setEnableSearch(enable_search: Boolean): Unit =
    gtk_drop_down_set_enable_search(
      this.raw.asInstanceOf,
      gboolean(gint((if enable_search == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the expression that gets evaluated to obtain strings from items.
    *
    * This is used for search in the popup. The expression must have a value
    * type of %G_TYPE_STRING.
    */
  def setExpression(expression: Expression): Unit =
    gtk_drop_down_set_expression(
      this.raw.asInstanceOf,
      expression.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `GtkListItemFactory` to use for populating list items.
    */
  def setFactory(factory: ListItemFactory): Unit = gtk_drop_down_set_factory(
    this.raw.asInstanceOf,
    factory.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `GtkListItemFactory` to use for creating header widgets for the
    * popup.
    */
  def setHeaderFactory(factory: ListItemFactory): Unit =
    gtk_drop_down_set_header_factory(
      this.raw.asInstanceOf,
      factory.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `GtkListItemFactory` to use for populating list items in the
    * popup.
    */
  def setListFactory(factory: ListItemFactory): Unit =
    gtk_drop_down_set_list_factory(
      this.raw.asInstanceOf,
      factory.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `GListModel` to use.
    */
  def setModel(model: ListModel): Unit = gtk_drop_down_set_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the match mode for the search filter.
    */
  def setSearchMatchMode(search_match_mode: GtkStringFilterMatchMode): Unit =
    gtk_drop_down_set_search_match_mode(
      this.raw.asInstanceOf,
      search_match_mode
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects the item at the given position.
    */
  def setSelected(position: UInt): Unit =
    gtk_drop_down_set_selected(this.raw.asInstanceOf, guint(position))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether an arrow will be displayed within the widget.
    */
  def setShowArrow(show_arrow: Boolean): Unit = gtk_drop_down_set_show_arrow(
    this.raw.asInstanceOf,
    gboolean(gint((if show_arrow == true then 1 else 0)))
  )

end DropDown

object DropDown:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkDropDown`.
    *
    * You may want to call [method@Gtk.DropDown.set_factory] to set up a way to
    * map its items to widgets.
    */
  def apply(model: ListModel, expression: Expression): DropDown = new DropDown(
    gtk_drop_down_new(
      model.getUnsafeRawPointer().asInstanceOf,
      expression.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkDropDown` that is populated with the strings.
    */
  def fromStrings(strings: Ptr[CString])(using Zone): DropDown = new DropDown(
    gtk_drop_down_new_from_strings(strings).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DropDown
