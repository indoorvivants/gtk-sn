package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GSocketAddressClass = CStruct4[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GSocketAddress], GSocketFamily], CFuncPtr1[Ptr[GSocketAddress], _root_.sn.gnome.glib.internal.gssize], CFuncPtr4[Ptr[GSocketAddress], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]

object _GSocketAddressClass:
  given _tag: Tag[_GSocketAddressClass] = Tag.materializeCStruct4Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GSocketAddress], GSocketFamily], CFuncPtr1[Ptr[GSocketAddress], _root_.sn.gnome.glib.internal.gssize], CFuncPtr4[Ptr[GSocketAddress], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GSocketAddressClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def get_family : CFuncPtr1[Ptr[GSocketAddress], GSocketFamily] = struct._2
      inline def get_family_=(value: CFuncPtr1[Ptr[GSocketAddress], GSocketFamily]): Unit = (!struct.at2 = value)
      inline def get_native_size : CFuncPtr1[Ptr[GSocketAddress], _root_.sn.gnome.glib.internal.gssize] = struct._3
      inline def get_native_size_=(value: CFuncPtr1[Ptr[GSocketAddress], _root_.sn.gnome.glib.internal.gssize]): Unit = (!struct.at3 = value)
      inline def to_native : CFuncPtr4[Ptr[GSocketAddress], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._4
      inline def to_native_=(value: CFuncPtr4[Ptr[GSocketAddress], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GSocketAddressClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GSocketAddressClass] = scala.scalanative.unsafe.alloc[_GSocketAddressClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, get_family : CFuncPtr1[Ptr[GSocketAddress], GSocketFamily], get_native_size : CFuncPtr1[Ptr[GSocketAddress], _root_.sn.gnome.glib.internal.gssize], to_native : CFuncPtr4[Ptr[GSocketAddress], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[_GSocketAddressClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_family = get_family
    (!____ptr).get_native_size = get_native_size
    (!____ptr).to_native = to_native
    ____ptr