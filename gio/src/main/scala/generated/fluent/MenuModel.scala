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

class MenuModel(raw: Ptr[GMenuModel]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

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

  def getItemLink(item_index: Int, link: String | CString)(using
      Zone
  ): MenuModel = new MenuModel(
    g_menu_model_get_item_link(
      this.raw.asInstanceOf,
      gint(item_index),
      __sn_extract_string(link).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  def getNItems(): Int = g_menu_model_get_n_items(this.raw.asInstanceOf).value

  def isMutable(): Boolean =
    g_menu_model_is_mutable(this.raw.asInstanceOf).value.!=(0)

  def itemsChanged(position: Int, removed: Int, added: Int): Unit =
    g_menu_model_items_changed(
      this.raw.asInstanceOf,
      gint(position),
      gint(removed),
      gint(added)
    )

  def iterateItemAttributes(item_index: Int): MenuAttributeIter =
    new MenuAttributeIter(
      g_menu_model_iterate_item_attributes(
        this.raw.asInstanceOf,
        gint(item_index)
      ).asInstanceOf
    )

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
