package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.MenuAttributeIter
import sn.gnome.gio.fluent.MenuLinkIter
import sn.gnome.gio.fluent.MenuModel
import sn.gnome.gio.internal.GMenuModel
import sn.gnome.glib.internal.GVariant
import sn.gnome.glib.internal.GVariantType
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GMenuModel represents the contents of a menu -- an ordered list of menu
  * items. The items are associated with actions, which can be activated through
  * them. Items can be grouped in sections, and may have submenus associated
  * with them. Both items and sections usually have some representation data,
  * such as labels or icons. The type of the associated action (ie whether it is
  * stateful, and what kind of state it has) can influence the representation of
  * the item.
  *
  * The conceptual model of menus in #GMenuModel is hierarchical: sections and
  * submenus are again represented by #GMenuModels. Menus themselves do not
  * define their own roles. Rather, the role of a particular #GMenuModel is
  * defined by the item that references it (or, in the case of the 'root' menu,
  * is defined by the context in which it is used).
  *
  * As an example, consider the visible portions of this menu:
  *
  * ## An example menu # {#menu-example}
  *
  * ![](menu-example.png)
  *
  * There are 8 "menus" visible in the screenshot: one menubar, two submenus and
  * 5 sections:
  *
  *   - the toplevel menubar (containing 4 items)
  *   - the View submenu (containing 3 sections)
  *   - the first section of the View submenu (containing 2 items)
  *   - the second section of the View submenu (containing 1 item)
  *   - the final section of the View submenu (containing 1 item)
  *   - the Highlight Mode submenu (containing 2 sections)
  *   - the Sources section (containing 2 items)
  *   - the Markup section (containing 2 items)
  *
  * The [example][menu-model] illustrates the conceptual connection between
  * these 8 menus. Each large block in the figure represents a menu and the
  * smaller blocks within the large block represent items in that menu. Some
  * items contain references to other menus.
  *
  * ## A menu example # {#menu-model}
  *
  * ![](menu-model.png)
  *
  * Notice that the separators visible in the [example][menu-example] appear
  * nowhere in the [menu model][menu-model]. This is because separators are not
  * explicitly represented in the menu model. Instead, a separator is inserted
  * between any two non-empty sections of a menu. Section items can have labels
  * just like any other item. In that case, a display system may show a section
  * header instead of a separator.
  *
  * The motivation for this abstract model of application controls is that
  * modern user interfaces tend to make these controls available outside the
  * application. Examples include global menus, jumplists, dash boards, etc. To
  * support such uses, it is necessary to 'export' information about actions and
  * their representation in menus, which is exactly what the [GActionGroup
  * exporter][gio-GActionGroup-exporter] and the [GMenuModel
  * exporter][gio-GMenuModel-exporter] do for #GActionGroup and #GMenuModel. The
  * client-side counterparts to make use of the exported information are
  * #GDBusActionGroup and #GDBusMenuModel.
  *
  * The API of #GMenuModel is very generic, with iterators for the attributes
  * and links of an item, see g_menu_model_iterate_item_attributes() and
  * g_menu_model_iterate_item_links(). The 'standard' attributes and link types
  * have predefined names: %G_MENU_ATTRIBUTE_LABEL, %G_MENU_ATTRIBUTE_ACTION,
  * %G_MENU_ATTRIBUTE_TARGET, %G_MENU_LINK_SECTION and %G_MENU_LINK_SUBMENU.
  *
  * Items in a #GMenuModel represent active controls if they refer to an action
  * that can get activated when the user interacts with the menu item. The
  * reference to the action is encoded by the string id in the
  * %G_MENU_ATTRIBUTE_ACTION attribute. An action id uniquely identifies an
  * action in an action group. Which action group(s) provide actions depends on
  * the context in which the menu model is used. E.g. when the model is exported
  * as the application menu of a #GtkApplication, actions can be
  * application-wide or window-specific (and thus come from two different action
  * groups). By convention, the application-wide actions have names that start
  * with "app.", while the names of window-specific actions start with "win.".
  *
  * While a wide variety of stateful actions is possible, the following is the
  * minimum that is expected to be supported by all users of exported menu
  * information:
  *   - an action with no parameter type and no state
  *   - an action with no parameter type and boolean state
  *   - an action with string parameter type and string state
  *
  * ## Stateless
  *
  * A stateless action typically corresponds to an ordinary menu item.
  *
  * Selecting such a menu item will activate the action (with no parameter).
  *
  * ## Boolean State
  *
  * An action with a boolean state will most typically be used with a "toggle"
  * or "switch" menu item. The state can be set directly, but activating the
  * action (with no parameter) results in the state being toggled.
  *
  * Selecting a toggle menu item will activate the action. The menu item should
  * be rendered as "checked" when the state is true.
  *
  * ## String Parameter and State
  *
  * Actions with string parameters and state will most typically be used to
  * represent an enumerated choice over the items available for a group of radio
  * menu items. Activating the action with a string parameter is equivalent to
  * setting that parameter as the state.
  *
  * Radio menu items, in addition to being associated with the action, will have
  * a target value. Selecting that menu item will result in activation of the
  * action with the target value as the parameter. The menu item should be
  * rendered as "selected" when the state of the action is equal to the target
  * value of the menu item.
  */
class MenuModel(raw: Ptr[GMenuModel]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Queries item at position @item_index in @model for the attribute specified
    * by @attribute.
    *
    * If the attribute exists and matches the #GVariantType corresponding to @format_string
    * then @format_string is used to deconstruct the value into the positional
    * parameters and %TRUE is returned.
    *
    * If the attribute does not exist, or it does exist but has the wrong type,
    * then the positional parameters are ignored and %FALSE is returned.
    *
    * This function is a mix of g_menu_model_get_item_attribute_value() and
    * g_variant_get(), followed by a g_variant_unref(). As such,
    * @format_string
    *   must make a complete copy of the data (since the #GVariant may go away
    *   after the call to g_variant_unref()). In particular, no '&' characters
    *   are allowed in @format_string.
    */
  inline def getItemAttribute(
      item_index: Int,
      attribute: String | CString,
      format_string: String | CString,
      args: Any*
  )(using Zone): Boolean = g_menu_model_get_item_attribute(
    this.raw.asInstanceOf,
    gint(item_index),
    __sn_extract_string(attribute).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(format_string).asInstanceOf[Ptr[gchar]],
    args*
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Queries the item at position @item_index in @model for the attribute
    * specified by @attribute.
    *
    * If @expected_type is non-%NULL then it specifies the expected type of the
    * attribute. If it is %NULL then any type will be accepted.
    *
    * If the attribute exists and matches @expected_type (or if the expected
    * type is unspecified) then the value is returned.
    *
    * If the attribute does not exist, or does not match the expected type then
    * %NULL is returned.
    */
  def getItemAttributeValue(
      item_index: Int,
      attribute: String | CString,
      expected_type: Ptr[GVariantType]
  )(using Zone): Ptr[GVariant] = g_menu_model_get_item_attribute_value(
    this.raw.asInstanceOf,
    gint(item_index),
    __sn_extract_string(attribute).asInstanceOf[Ptr[gchar]],
    expected_type
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Queries the item at position @item_index in @model for the link specified
    * by @link.
    *
    * If the link exists, the linked #GMenuModel is returned. If the link does
    * not exist, %NULL is returned.
    */
  def getItemLink(item_index: Int, link: String | CString)(using
      Zone
  ): MenuModel = new MenuModel(
    g_menu_model_get_item_link(
      this.raw.asInstanceOf,
      gint(item_index),
      __sn_extract_string(link).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Query the number of items in @model.
    */
  def getNItems(): Int = g_menu_model_get_n_items(this.raw.asInstanceOf).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Queries if @model is mutable.
    *
    * An immutable #GMenuModel will never emit the #GMenuModel::items-changed
    * signal. Consumers of the model may make optimisations accordingly.
    */
  def isMutable(): Boolean =
    g_menu_model_is_mutable(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Requests emission of the #GMenuModel::items-changed signal on @model.
    *
    * This function should never be called except by #GMenuModel subclasses. Any
    * other calls to this function will very likely lead to a violation of the
    * interface of the model.
    *
    * The implementation should update its internal representation of the menu
    * before emitting the signal. The implementation should further expect to
    * receive queries about the new state of the menu (and particularly added
    * menu items) while signal handlers are running.
    *
    * The implementation must dispatch this call directly from a mainloop entry
    * and not in response to calls -- particularly those from the #GMenuModel
    * API. Said another way: the menu must not change while user code is running
    * without returning to the mainloop.
    */
  def itemsChanged(position: Int, removed: Int, added: Int): Unit =
    g_menu_model_items_changed(
      this.raw.asInstanceOf,
      gint(position),
      gint(removed),
      gint(added)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a #GMenuAttributeIter to iterate over the attributes of the item
    * at position @item_index in @model.
    *
    * You must free the iterator with g_object_unref() when you are done.
    */
  def iterateItemAttributes(item_index: Int): MenuAttributeIter =
    new MenuAttributeIter(
      g_menu_model_iterate_item_attributes(
        this.raw.asInstanceOf,
        gint(item_index)
      ).asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a #GMenuLinkIter to iterate over the links of the item at position @item_index
    * in @model.
    *
    * You must free the iterator with g_object_unref() when you are done.
    */
  def iterateItemLinks(item_index: Int): MenuLinkIter = new MenuLinkIter(
    g_menu_model_iterate_item_links(
      this.raw.asInstanceOf,
      gint(item_index)
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end MenuModel
