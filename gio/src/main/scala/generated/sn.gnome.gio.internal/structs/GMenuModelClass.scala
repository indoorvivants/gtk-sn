package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GMenuModelClass::get_item_attributes: : the #GMenuModel to query _index: The #GMenuItem to query : (out) (element-type utf8 GLib.Variant): Attributes on the item
*/
opaque type GMenuModelClass = CArray[CChar, Nat.Digit3[Nat._2, Nat._0, Nat._0]]

object GMenuModelClass:
  given _tag: Tag[GMenuModelClass] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._0, Nat._0]](Tag.Byte, Tag.Digit3[Nat._2, Nat._0, Nat._0](Tag.Nat2, Tag.Nat0, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GMenuModelClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def is_mutable: CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def is_mutable_=(value: CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def get_n_items: CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint]]]
      inline def get_n_items_=(value: CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint]]] = value
      inline def get_item_attributes: CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit]]]
      inline def get_item_attributes_=(value: CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit]]] = value
      inline def iterate_item_attributes: CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuAttributeIter]] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuAttributeIter]]]]
      inline def iterate_item_attributes_=(value: CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuAttributeIter]]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuAttributeIter]]]] = value
      inline def get_item_attribute_value: CFuncPtr4[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType], Ptr[_root_.sn.gnome.glib.internal.GVariant]] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType], Ptr[_root_.sn.gnome.glib.internal.GVariant]]]]
      inline def get_item_attribute_value_=(value: CFuncPtr4[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType], Ptr[_root_.sn.gnome.glib.internal.GVariant]]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType], Ptr[_root_.sn.gnome.glib.internal.GVariant]]]] = value
      inline def get_item_links: CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit]]]
      inline def get_item_links_=(value: CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit]]] = value
      inline def iterate_item_links: CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuLinkIter]] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuLinkIter]]]]
      inline def iterate_item_links_=(value: CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuLinkIter]]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuLinkIter]]]] = value
      inline def get_item_link: CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GMenuModel]] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GMenuModel]]]]
      inline def get_item_link_=(value: CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GMenuModel]]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GMenuModel]]]] = value
    end extension
  
  // Allocates GMenuModelClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GMenuModelClass] = scala.scalanative.unsafe.alloc[GMenuModelClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, is_mutable : CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gboolean], get_n_items : CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint], get_item_attributes : CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit], iterate_item_attributes : CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuAttributeIter]], get_item_attribute_value : CFuncPtr4[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType], Ptr[_root_.sn.gnome.glib.internal.GVariant]], get_item_links : CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit], iterate_item_links : CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuLinkIter]], get_item_link : CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GMenuModel]])(using Zone): Ptr[GMenuModelClass] =
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
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](9)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr1[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint]].toInt, alignmentof[CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuAttributeIter]]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuAttributeIter]]].toInt, alignmentof[CFuncPtr4[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType], Ptr[_root_.sn.gnome.glib.internal.GVariant]]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr4[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType], Ptr[_root_.sn.gnome.glib.internal.GVariant]]].toInt, alignmentof[CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GHashTable]], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuLinkIter]]].toInt)
    res(8) = align(res(7) + sizeof[CFuncPtr2[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[GMenuLinkIter]]].toInt, alignmentof[CFuncPtr3[Ptr[GMenuModel], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GMenuModel]]].toInt)
    res
  end offsets