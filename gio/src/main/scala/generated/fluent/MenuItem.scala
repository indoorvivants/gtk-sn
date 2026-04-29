package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Icon
import sn.gnome.gio.fluent.MenuModel
import sn.gnome.gio.internal.GMenuItem
import sn.gnome.glib.internal.GVariant
import sn.gnome.glib.internal.GVariantType
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GMenuItem is an opaque structure type. You must access it using the
  * functions below.
  */
class MenuItem(raw: Ptr[GMenuItem]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Queries the named @attribute on @menu_item.
    *
    * If the attribute exists and matches the #GVariantType corresponding to @format_string
    * then @format_string is used to deconstruct the value into the positional
    * parameters and %TRUE is returned.
    *
    * If the attribute does not exist, or it does exist but has the wrong type,
    * then the positional parameters are ignored and %FALSE is returned.
    */
  inline def getAttribute(
      attribute: String | CString,
      format_string: String | CString,
      args: Any*
  )(using Zone): Boolean = g_menu_item_get_attribute(
    this.raw.asInstanceOf,
    __sn_extract_string(attribute).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(format_string).asInstanceOf[Ptr[gchar]],
    args*
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Queries the named @attribute on @menu_item.
    *
    * If @expected_type is specified and the attribute does not have this type,
    * %NULL is returned. %NULL is also returned if the attribute simply does not
    * exist.
    */
  def getAttributeValue(
      attribute: String | CString,
      expected_type: Ptr[GVariantType]
  )(using Zone): Ptr[GVariant] = g_menu_item_get_attribute_value(
    this.raw.asInstanceOf,
    __sn_extract_string(attribute).asInstanceOf[Ptr[gchar]],
    expected_type
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Queries the named @link on @menu_item.
    */
  def getLink(link: String | CString)(using Zone): MenuModel = new MenuModel(
    g_menu_item_get_link(
      this.raw.asInstanceOf,
      __sn_extract_string(link).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets or unsets the "action" and "target" attributes of @menu_item.
    *
    * If @action is %NULL then both the "action" and "target" attributes are
    * unset (and @format_string is ignored along with the positional
    * parameters).
    *
    * If @action is non-%NULL then the "action" attribute is set.
    * @format_string
    *   is then inspected. If it is non-%NULL then the proper position
    *   parameters are collected to create a #GVariant instance to use as the
    *   target value. If it is %NULL then the positional parameters are ignored
    *   and the "target" attribute is unset.
    *
    * See also g_menu_item_set_action_and_target_value() for an equivalent call
    * that directly accepts a #GVariant. See g_menu_item_set_detailed_action()
    * for a more convenient version that works with string-typed targets.
    *
    * See also g_menu_item_set_action_and_target_value() for a description of
    * the semantics of the action and target attributes.
    */
  inline def setActionAndTarget(
      action: String | CString,
      format_string: String | CString,
      args: Any*
  )(using Zone): Unit = g_menu_item_set_action_and_target(
    this.raw.asInstanceOf,
    __sn_extract_string(action).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(format_string).asInstanceOf[Ptr[gchar]],
    args*
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets or unsets the "action" and "target" attributes of @menu_item.
    *
    * If @action is %NULL then both the "action" and "target" attributes are
    * unset (and @target_value is ignored).
    *
    * If @action is non-%NULL then the "action" attribute is set. The "target"
    * attribute is then set to the value of @target_value if it is non-%NULL or
    * unset otherwise.
    *
    * Normal menu items (ie: not submenu, section or other custom item types)
    * are expected to have the "action" attribute set to identify the action
    * that they are associated with. The state type of the action help to
    * determine the disposition of the menu item. See #GAction and #GActionGroup
    * for an overview of actions.
    *
    * In general, clicking on the menu item will result in activation of the
    * named action with the "target" attribute given as the parameter to the
    * action invocation. If the "target" attribute is not set then the action is
    * invoked with no parameter.
    *
    * If the action has no state then the menu item is usually drawn as a plain
    * menu item (ie: with no additional decoration).
    *
    * If the action has a boolean state then the menu item is usually drawn as a
    * toggle menu item (ie: with a checkmark or equivalent indication). The item
    * should be marked as 'toggled' or 'checked' when the boolean state is
    * %TRUE.
    *
    * If the action has a string state then the menu item is usually drawn as a
    * radio menu item (ie: with a radio bullet or equivalent indication). The
    * item should be marked as 'selected' when the string state is equal to the
    * value of the @target property.
    *
    * See g_menu_item_set_action_and_target() or
    * g_menu_item_set_detailed_action() for two equivalent calls that are
    * probably more convenient for most uses.
    */
  def setActionAndTargetValue(
      action: String | CString,
      target_value: Ptr[GVariant]
  )(using Zone): Unit = g_menu_item_set_action_and_target_value(
    this.raw.asInstanceOf,
    __sn_extract_string(action).asInstanceOf[Ptr[gchar]],
    target_value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets or unsets an attribute on @menu_item.
    *
    * The attribute to set or unset is specified by @attribute. This can be one
    * of the standard attribute names %G_MENU_ATTRIBUTE_LABEL,
    * %G_MENU_ATTRIBUTE_ACTION, %G_MENU_ATTRIBUTE_TARGET, or a custom attribute
    * name. Attribute names are restricted to lowercase characters, numbers and
    * '-'. Furthermore, the names must begin with a lowercase character, must
    * not end with a '-', and must not contain consecutive dashes.
    *
    * If @format_string is non-%NULL then the proper position parameters are
    * collected to create a #GVariant instance to use as the attribute value. If
    * it is %NULL then the positional parameterrs are ignored and the named
    * attribute is unset.
    *
    * See also g_menu_item_set_attribute_value() for an equivalent call that
    * directly accepts a #GVariant.
    */
  inline def setAttribute(
      attribute: String | CString,
      format_string: String | CString,
      args: Any*
  )(using Zone): Unit = g_menu_item_set_attribute(
    this.raw.asInstanceOf,
    __sn_extract_string(attribute).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(format_string).asInstanceOf[Ptr[gchar]],
    args*
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets or unsets an attribute on @menu_item.
    *
    * The attribute to set or unset is specified by @attribute. This can be one
    * of the standard attribute names %G_MENU_ATTRIBUTE_LABEL,
    * %G_MENU_ATTRIBUTE_ACTION, %G_MENU_ATTRIBUTE_TARGET, or a custom attribute
    * name. Attribute names are restricted to lowercase characters, numbers and
    * '-'. Furthermore, the names must begin with a lowercase character, must
    * not end with a '-', and must not contain consecutive dashes.
    *
    * must consist only of lowercase ASCII characters, digits and '-'.
    *
    * If @value is non-%NULL then it is used as the new value for the attribute.
    * If @value is %NULL then the attribute is unset. If the @value #GVariant is
    * floating, it is consumed.
    *
    * See also g_menu_item_set_attribute() for a more convenient way to do the
    * same.
    */
  def setAttributeValue(attribute: String | CString, value: Ptr[GVariant])(using
      Zone
  ): Unit = g_menu_item_set_attribute_value(
    this.raw.asInstanceOf,
    __sn_extract_string(attribute).asInstanceOf[Ptr[gchar]],
    value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the "action" and possibly the "target" attribute of @menu_item.
    *
    * The format of @detailed_action is the same format parsed by
    * g_action_parse_detailed_name().
    *
    * See g_menu_item_set_action_and_target() or
    * g_menu_item_set_action_and_target_value() for more flexible (but slightly
    * less convenient) alternatives.
    *
    * See also g_menu_item_set_action_and_target_value() for a description of
    * the semantics of the action and target attributes.
    */
  def setDetailedAction(detailed_action: String | CString)(using Zone): Unit =
    g_menu_item_set_detailed_action(
      this.raw.asInstanceOf,
      __sn_extract_string(detailed_action).asInstanceOf[Ptr[gchar]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets (or unsets) the icon on @menu_item.
    *
    * This call is the same as calling g_icon_serialize() and using the result
    * as the value to g_menu_item_set_attribute_value() for
    * %G_MENU_ATTRIBUTE_ICON.
    *
    * This API is only intended for use with "noun" menu items; things like
    * bookmarks or applications in an "Open With" menu. Don't use it on menu
    * items corresponding to verbs (eg: stock icons for 'Save' or 'Quit').
    *
    * If @icon is %NULL then the icon is unset.
    */
  def setIcon(icon: Icon): Unit = g_menu_item_set_icon(
    this.raw.asInstanceOf,
    icon.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets or unsets the "label" attribute of @menu_item.
    *
    * If @label is non-%NULL it is used as the label for the menu item. If it is
    * %NULL then the label attribute is unset.
    */
  def setLabel(label: String | CString)(using Zone): Unit =
    g_menu_item_set_label(
      this.raw.asInstanceOf,
      __sn_extract_string(label).asInstanceOf[Ptr[gchar]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a link from @menu_item to @model if non-%NULL, or unsets it.
    *
    * Links are used to establish a relationship between a particular menu item
    * and another menu. For example, %G_MENU_LINK_SUBMENU is used to associate a
    * submenu with a particular menu item, and %G_MENU_LINK_SECTION is used to
    * create a section. Other types of link can be used, but there is no
    * guarantee that clients will be able to make sense of them. Link types are
    * restricted to lowercase characters, numbers and '-'. Furthermore, the
    * names must begin with a lowercase character, must not end with a '-', and
    * must not contain consecutive dashes.
    */
  def setLink(link: String | CString, model: MenuModel)(using Zone): Unit =
    g_menu_item_set_link(
      this.raw.asInstanceOf,
      __sn_extract_string(link).asInstanceOf[Ptr[gchar]],
      model.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets or unsets the "section" link of @menu_item to @section.
    *
    * The effect of having one menu appear as a section of another is exactly as
    * it sounds: the items from @section become a direct part of the menu that @menu_item
    * is added to. See g_menu_item_new_section() for more information about what
    * it means for a menu item to be a section.
    */
  def setSection(section: MenuModel): Unit = g_menu_item_set_section(
    this.raw.asInstanceOf,
    section.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets or unsets the "submenu" link of @menu_item to @submenu.
    *
    * If @submenu is non-%NULL, it is linked to. If it is %NULL then the link is
    * unset.
    *
    * The effect of having one menu appear as a submenu of another is exactly as
    * it sounds.
    */
  def setSubmenu(submenu: MenuModel): Unit = g_menu_item_set_submenu(
    this.raw.asInstanceOf,
    submenu.getUnsafeRawPointer().asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end MenuItem

object MenuItem:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GMenuItem.
    *
    * If @label is non-%NULL it is used to set the "label" attribute of the new
    * item.
    *
    * If @detailed_action is non-%NULL it is used to set the "action" and
    * possibly the "target" attribute of the new item. See
    * g_menu_item_set_detailed_action() for more information.
    */
  def apply(label: String | CString, detailed_action: String | CString)(using
      Zone
  ): MenuItem = new MenuItem(
    g_menu_item_new(
      __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(detailed_action).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a #GMenuItem as an exact copy of an existing menu item in a
    * #GMenuModel.
    *
    * @item_index
    *   must be valid (ie: be sure to call g_menu_model_get_n_items() first).
    */
  def fromModel(model: MenuModel, item_index: Int): MenuItem = new MenuItem(
    g_menu_item_new_from_model(
      model.getUnsafeRawPointer().asInstanceOf,
      gint(item_index)
    ).asInstanceOf
  )

  /**  COMMENT FOR THE ORIGINAL C DEFINITION
    *
    *  Creates a new #GMenuItem representing a section.
    *
    *  This is a convenience API around g_menu_item_new() and
    *  g_menu_item_set_section().
    *
    *  The effect of having one menu appear as a section of another is
    *  exactly as it sounds: the items from @section become a direct part of
    *  the menu that @menu_item is added to.
    *
    *  Visual separation is typically displayed between two non-empty
    *  sections.  If @label is non-%NULL then it will be encorporated into
    *  this visual indication.  This allows for labeled subsections of a
    *  menu.
    *
    *  As a simple example, consider a typical "Edit" menu from a simple
    *  program.  It probably contains an "Undo" and "Redo" item, followed by
    *  a separator, followed by "Cut", "Copy" and "Paste".
    *
    *  This would be accomplished by creating three #GMenu instances.  The
    *  first would be populated with the "Undo" and "Redo" items, and the
    *  second with the "Cut", "Copy" and "Paste" items.  The first and
    *  second menus would then be added as submenus of the third.  In XML
    *  format, this would look something like the following:
    *  |[
    *  <menu id='edit-menu'>
    *    <section>
    *      <item label='Undo'/>
    *      <item label='Redo'/>
    *    </section>
    *    <section>
    *      <item label='Cut'/>
    *      <item label='Copy'/>
    *      <item label='Paste'/>
    *    </section>
    *  </menu>
    *  ]|
    *
    *  The following example is exactly equivalent.  It is more illustrative
    *  of the exact relationship between the menus and items (keeping in
    *  mind that the 'link' element defines a new menu that is linked to the
    *  containing one).  The style of the second example is more verbose and
    *  difficult to read (and therefore not recommended except for the
    *  purpose of understanding what is really going on).
    *  |[
    *  <menu id='edit-menu'>
    *    <item>
    *      <link name='section'>
    *        <item label='Undo'/>
    *        <item label='Redo'/>
    *      </link>
    *    </item>
    *    <item>
    *      <link name='section'>
    *        <item label='Cut'/>
    *        <item label='Copy'/>
    *        <item label='Paste'/>
    *      </link>
    *    </item>
    *  </menu>
    *  ]|
    */
  def section(label: String | CString, section: MenuModel)(using
      Zone
  ): MenuItem = new MenuItem(
    g_menu_item_new_section(
      __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
      section.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GMenuItem representing a submenu.
    *
    * This is a convenience API around g_menu_item_new() and
    * g_menu_item_set_submenu().
    */
  def submenu(label: String | CString, submenu: MenuModel)(using
      Zone
  ): MenuItem = new MenuItem(
    g_menu_item_new_submenu(
      __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
      submenu.getUnsafeRawPointer().asInstanceOf
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
end MenuItem
