package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GMenuModelClass::get_item_attributes: : the #GMenuModel to query _index: The #GMenuItem to query : (out) (element-type utf8 GLib.Variant): Attributes on the item
*/
opaque type _GMenuModelClass = CStruct9[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint], CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit], CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuAttributeIter]], CFuncPtr4[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType], Ptr[_root_.sn.gnome.glib.internal.GVariant]], CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit], CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuLinkIter]], CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GMenuModel]]]

object _GMenuModelClass:
  given _tag: Tag[_GMenuModelClass] = Tag.materializeCStruct9Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint], CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit], CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuAttributeIter]], CFuncPtr4[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType], Ptr[_root_.sn.gnome.glib.internal.GVariant]], CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit], CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuLinkIter]], CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GMenuModel]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GMenuModelClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def is_mutable : CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gboolean] = struct._2
      inline def is_mutable_=(value: CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value)
      inline def get_n_items : CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint] = struct._3
      inline def get_n_items_=(value: CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint]): Unit = (!struct.at3 = value)
      inline def get_item_attributes : CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit] = struct._4
      inline def get_item_attributes_=(value: CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit]): Unit = (!struct.at4 = value)
      inline def iterate_item_attributes : CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuAttributeIter]] = struct._5
      inline def iterate_item_attributes_=(value: CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuAttributeIter]]): Unit = (!struct.at5 = value)
      inline def get_item_attribute_value : CFuncPtr4[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType], Ptr[_root_.sn.gnome.glib.internal.GVariant]] = struct._6
      inline def get_item_attribute_value_=(value: CFuncPtr4[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType], Ptr[_root_.sn.gnome.glib.internal.GVariant]]): Unit = (!struct.at6 = value)
      inline def get_item_links : CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit] = struct._7
      inline def get_item_links_=(value: CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit]): Unit = (!struct.at7 = value)
      inline def iterate_item_links : CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuLinkIter]] = struct._8
      inline def iterate_item_links_=(value: CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuLinkIter]]): Unit = (!struct.at8 = value)
      inline def get_item_link : CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GMenuModel]] = struct._9
      inline def get_item_link_=(value: CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GMenuModel]]): Unit = (!struct.at9 = value)
    end extension
  
  // Allocates _GMenuModelClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GMenuModelClass] = scala.scalanative.unsafe.alloc[_GMenuModelClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, is_mutable : CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gboolean], get_n_items : CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint], get_item_attributes : CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit], iterate_item_attributes : CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuAttributeIter]], get_item_attribute_value : CFuncPtr4[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType], Ptr[_root_.sn.gnome.glib.internal.GVariant]], get_item_links : CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit], iterate_item_links : CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuLinkIter]], get_item_link : CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GMenuModel]])(using Zone): Ptr[_GMenuModelClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).is_mutable = is_mutable
    (!____ptr).get_n_items = get_n_items
    (!____ptr).get_item_attributes = get_item_attributes
    (!____ptr).iterate_item_attributes = iterate_item_attributes
    (!____ptr).get_item_attribute_value = get_item_attribute_value
    (!____ptr).get_item_links = get_item_links
    (!____ptr).iterate_item_links = iterate_item_links
    (!____ptr).get_item_link = get_item_link
    ____ptr