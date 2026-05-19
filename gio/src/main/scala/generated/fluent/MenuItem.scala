package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{Icon, MenuModel}
import sn.gnome.gio.internal.GMenuItem
import sn.gnome.glib.internal.{gchar, gint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** #GMenuItem is an opaque structure type. You must access it using the
  * functions below.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MenuItem private[gnome] (raw: Ptr[GMenuItem])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Queries the named @attribute on @menu_item.
    *
    * If the attribute exists and matches the #GVariantType corresponding to @format_string
    * then @format_string is used to deconstruct the value into the positional
    * parameters and %TRUE is returned.
    *
    * If the attribute does not exist, or it does exist but has the wrong type,
    * then the positional parameters are ignored and %FALSE is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_attribute/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def getAttribute__ = ???

  /** Queries the named @attribute on @menu_item.
    *
    * If @expected_type is specified and the attribute does not have this type,
    * %NULL is returned. %NULL is also returned if the attribute simply does not
    * exist.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_attribute_value/<method parameters>/expected_type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.VariantType), @type -> DataRecord(const GVariantType*)))"
  )
  private def getAttributeValue__ = ???

  /** Queries the named @link on @menu_item.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLink(
      link: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone, Runtime): sn.gnome.gio.MenuModel /* None */ =
    sn.gnome.gio.MenuModel.applyUnsafe(
      g_menu_item_get_link(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenuItem]],
        toCString(link).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )
  end getLink

  /** Sets or unsets the "action" and "target" attributes of @menu_item.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_action_and_target/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def setActionAndTarget__ = ???

  /** Sets or unsets the "action" and "target" attributes of @menu_item.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_action_and_target_value/<method parameters>/target_value]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def setActionAndTargetValue__ = ???

  /** Sets or unsets an attribute on @menu_item.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_attribute/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def setAttribute__ = ???

  /** Sets or unsets an attribute on @menu_item.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_attribute_value/<method parameters>/value]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def setAttributeValue__ = ???

  /** Sets the "action" and possibly the "target" attribute of @menu_item.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDetailedAction(
      detailed_action: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ =
    g_menu_item_set_detailed_action(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenuItem]],
      toCString(detailed_action).asInstanceOf[Ptr[gchar]]
    )
  end setDetailedAction

  /** Sets (or unsets) the icon on @menu_item.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIcon(icon: Icon /* Some(Ptr[GIcon]) */ ): Unit /* None */ =
    g_menu_item_set_icon(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenuItem]],
      icon.getUnsafeRawPointer().asInstanceOf
    )
  end setIcon

  /** Sets or unsets the "label" attribute of @menu_item.
    *
    * If @label is non-%NULL it is used as the label for the menu item. If it is
    * %NULL then the label attribute is unset.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLabel(
      label: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone): Unit /* None */ =
    g_menu_item_set_label(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenuItem]],
      label
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
    )
  end setLabel

  /** Creates a link from @menu_item to @model if non-%NULL, or unsets it.
    *
    * Links are used to establish a relationship between a particular menu item
    * and another menu. For example, %G_MENU_LINK_SUBMENU is used to associate a
    * submenu with a particular menu item, and %G_MENU_LINK_SECTION is used to
    * create a section. Other types of link can be used, but there is no
    * guarantee that clients will be able to make sense of them. Link types are
    * restricted to lowercase characters, numbers and '-'. Furthermore, the
    * names must begin with a lowercase character, must not end with a '-', and
    * must not contain consecutive dashes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLink(
      link: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      model: Option[sn.gnome.gio.MenuModel /* Some(Ptr[GMenuModel]) */ ]
  )(using Zone, Runtime): Unit /* None */ =
    g_menu_item_set_link(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenuItem]],
      toCString(link).asInstanceOf[Ptr[gchar]],
      model
        .map[Ptr[GMenuModel]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GMenuModel]])
    )
  end setLink

  /** Sets or unsets the "section" link of @menu_item to @section.
    *
    * The effect of having one menu appear as a section of another is exactly as
    * it sounds: the items from @section become a direct part of the menu that @menu_item
    * is added to. See g_menu_item_new_section() for more information about what
    * it means for a menu item to be a section.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSection(
      section: Option[sn.gnome.gio.MenuModel /* Some(Ptr[GMenuModel]) */ ]
  )(using Runtime): Unit /* None */ =
    g_menu_item_set_section(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenuItem]],
      section
        .map[Ptr[GMenuModel]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GMenuModel]])
    )
  end setSection

  /** Sets or unsets the "submenu" link of @menu_item to @submenu.
    *
    * If @submenu is non-%NULL, it is linked to. If it is %NULL then the link is
    * unset.
    *
    * The effect of having one menu appear as a submenu of another is exactly as
    * it sounds.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSubmenu(
      submenu: Option[sn.gnome.gio.MenuModel /* Some(Ptr[GMenuModel]) */ ]
  )(using Runtime): Unit /* None */ =
    g_menu_item_set_submenu(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenuItem]],
      submenu
        .map[Ptr[GMenuModel]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GMenuModel]])
    )
  end setSubmenu

end MenuItem

object MenuItem:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GMenuItem])(using Runtime) = summon[Runtime]
    .getOrCreate[MenuItem](ptr.asInstanceOf[Ptr[Byte]], p => new MenuItem(ptr))

  /** Creates a new #GMenuItem.
    *
    * If @label is non-%NULL it is used to set the "label" attribute of the new
    * item.
    *
    * If @detailed_action is non-%NULL it is used to set the "action" and
    * possibly the "target" attribute of the new item. See
    * g_menu_item_set_detailed_action() for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      label: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      detailed_action: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone, Runtime): MenuItem =
    val raw: Ptr[Byte] = g_menu_item_new(
      label
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      detailed_action
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[MenuItem](raw, r => MenuItem.applyUnsafe(r.asInstanceOf))
  end apply

  /** Creates a #GMenuItem as an exact copy of an existing menu item in a
    * #GMenuModel.
    *
    * @item_index
    *   must be valid (ie: be sure to call g_menu_model_get_n_items() first).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromModel(
      model: sn.gnome.gio.MenuModel /* Some(Ptr[GMenuModel]) */,
      item_index: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  )(using Runtime): MenuItem =
    val raw: Ptr[Byte] = g_menu_item_new_from_model(
      model.getUnsafeRawPointer().asInstanceOf,
      gint(item_index)
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[MenuItem](raw, r => MenuItem.applyUnsafe(r.asInstanceOf))
  end fromModel

  /**  Creates a new #GMenuItem representing a section.
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
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def section(
      label: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      section: sn.gnome.gio.MenuModel /* Some(Ptr[GMenuModel]) */
  )(using Zone, Runtime): MenuItem =
    val raw: Ptr[Byte] = g_menu_item_new_section(
      label
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      section.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[MenuItem](raw, r => MenuItem.applyUnsafe(r.asInstanceOf))
  end section

  /** Creates a new #GMenuItem representing a submenu.
    *
    * This is a convenience API around g_menu_item_new() and
    * g_menu_item_set_submenu().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def submenu(
      label: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      submenu: sn.gnome.gio.MenuModel /* Some(Ptr[GMenuModel]) */
  )(using Zone, Runtime): MenuItem =
    val raw: Ptr[Byte] = g_menu_item_new_submenu(
      label
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      submenu.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[MenuItem](raw, r => MenuItem.applyUnsafe(r.asInstanceOf))
  end submenu
end MenuItem
