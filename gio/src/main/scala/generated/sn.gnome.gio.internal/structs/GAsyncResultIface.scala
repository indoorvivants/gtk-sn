package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GAsyncResultIface: _iface: The parent interface. _user_data: Gets the user data passed to the callback. _source_object: Gets the source object that issued the asynchronous operation.
*/
opaque type GAsyncResultIface = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]

object GAsyncResultIface:
  given _tag: Tag[GAsyncResultIface] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GAsyncResultIface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def get_user_data: CFuncPtr1[Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer]]]
      inline def get_user_data_=(value: CFuncPtr1[Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer]]] = value
      inline def get_source_object: CFuncPtr1[Ptr[GAsyncResult], Ptr[_root_.sn.gnome.gobject.internal.GObject]] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAsyncResult], Ptr[_root_.sn.gnome.gobject.internal.GObject]]]]
      inline def get_source_object_=(value: CFuncPtr1[Ptr[GAsyncResult], Ptr[_root_.sn.gnome.gobject.internal.GObject]]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAsyncResult], Ptr[_root_.sn.gnome.gobject.internal.GObject]]]] = value
      inline def is_tagged: CFuncPtr2[Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]]]
      inline def is_tagged_=(value: CFuncPtr2[Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]]] = value
    end extension
  
  // Allocates GAsyncResultIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GAsyncResultIface] = scala.scalanative.unsafe.alloc[GAsyncResultIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, get_user_data : CFuncPtr1[Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer], get_source_object : CFuncPtr1[Ptr[GAsyncResult], Ptr[_root_.sn.gnome.gobject.internal.GObject]], is_tagged : CFuncPtr2[Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[GAsyncResultIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).get_user_data = get_user_data
    (!____ptr).get_source_object = get_source_object
    (!____ptr).is_tagged = is_tagged
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
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr1[Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer]].toInt, alignmentof[CFuncPtr1[Ptr[GAsyncResult], Ptr[_root_.sn.gnome.gobject.internal.GObject]]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr1[Ptr[GAsyncResult], Ptr[_root_.sn.gnome.gobject.internal.GObject]]].toInt, alignmentof[CFuncPtr2[Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res
  end offsets