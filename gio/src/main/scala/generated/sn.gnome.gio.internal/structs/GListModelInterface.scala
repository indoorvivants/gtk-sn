package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GListModelInterface = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]

object GListModelInterface:
  given _tag: Tag[GListModelInterface] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GListModelInterface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def get_item_type: CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.gobject.internal.GType] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.gobject.internal.GType]]]
      inline def get_item_type_=(value: CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.gobject.internal.GType]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.gobject.internal.GType]]] = value
      inline def get_n_items: CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.glib.internal.guint] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.glib.internal.guint]]]
      inline def get_n_items_=(value: CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.glib.internal.guint]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.glib.internal.guint]]] = value
      inline def get_item: CFuncPtr2[Ptr[GListModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gpointer] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GListModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gpointer]]]
      inline def get_item_=(value: CFuncPtr2[Ptr[GListModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gpointer]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GListModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gpointer]]] = value
    end extension
  
  // Allocates GListModelInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GListModelInterface] = scala.scalanative.unsafe.alloc[GListModelInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, get_item_type : CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.gobject.internal.GType], get_n_items : CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.glib.internal.guint], get_item : CFuncPtr2[Ptr[GListModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gpointer])(using Zone): Ptr[GListModelInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).get_item_type = get_item_type
    (!____ptr).get_n_items = get_n_items
    (!____ptr).get_item = get_item
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](4)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.gobject.internal.GType]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.gobject.internal.GType]].toInt, alignmentof[CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.glib.internal.guint]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr1[Ptr[GListModel], _root_.sn.gnome.glib.internal.guint]].toInt, alignmentof[CFuncPtr2[Ptr[GListModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gpointer]].toInt)
    res
  end offsets