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

class MenuItem(raw: Ptr[GMenuItem]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

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

  def getAttributeValue(
      attribute: String | CString,
      expected_type: Ptr[GVariantType]
  )(using Zone): Ptr[GVariant] = g_menu_item_get_attribute_value(
    this.raw.asInstanceOf,
    __sn_extract_string(attribute).asInstanceOf[Ptr[gchar]],
    expected_type
  )

  def getLink(link: String | CString)(using Zone): MenuModel = new MenuModel(
    g_menu_item_get_link(
      this.raw.asInstanceOf,
      __sn_extract_string(link).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

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

  def setActionAndTargetValue(
      action: String | CString,
      target_value: Ptr[GVariant]
  )(using Zone): Unit = g_menu_item_set_action_and_target_value(
    this.raw.asInstanceOf,
    __sn_extract_string(action).asInstanceOf[Ptr[gchar]],
    target_value
  )

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

  def setAttributeValue(attribute: String | CString, value: Ptr[GVariant])(using
      Zone
  ): Unit = g_menu_item_set_attribute_value(
    this.raw.asInstanceOf,
    __sn_extract_string(attribute).asInstanceOf[Ptr[gchar]],
    value
  )

  def setDetailedAction(detailed_action: String | CString)(using Zone): Unit =
    g_menu_item_set_detailed_action(
      this.raw.asInstanceOf,
      __sn_extract_string(detailed_action).asInstanceOf[Ptr[gchar]]
    )

  def setIcon(icon: Icon): Unit = g_menu_item_set_icon(
    this.raw.asInstanceOf,
    icon.getUnsafeRawPointer().asInstanceOf
  )

  def setLabel(label: String | CString)(using Zone): Unit =
    g_menu_item_set_label(
      this.raw.asInstanceOf,
      __sn_extract_string(label).asInstanceOf[Ptr[gchar]]
    )

  def setLink(link: String | CString, model: MenuModel)(using Zone): Unit =
    g_menu_item_set_link(
      this.raw.asInstanceOf,
      __sn_extract_string(link).asInstanceOf[Ptr[gchar]],
      model.getUnsafeRawPointer().asInstanceOf
    )

  def setSection(section: MenuModel): Unit = g_menu_item_set_section(
    this.raw.asInstanceOf,
    section.getUnsafeRawPointer().asInstanceOf
  )

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
  def apply(label: String | CString, detailed_action: String | CString)(using
      Zone
  ): MenuItem = new MenuItem(
    g_menu_item_new(
      __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(detailed_action).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )
  def fromModel(model: MenuModel, item_index: Int): MenuItem = new MenuItem(
    g_menu_item_new_from_model(
      model.getUnsafeRawPointer().asInstanceOf,
      gint(item_index)
    ).asInstanceOf
  )
  def section(label: String | CString, section: MenuModel)(using
      Zone
  ): MenuItem = new MenuItem(
    g_menu_item_new_section(
      __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
      section.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
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
