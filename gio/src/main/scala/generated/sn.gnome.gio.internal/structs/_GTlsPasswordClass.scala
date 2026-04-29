package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTlsPasswordClass: _value: virtual method for g_tls_password_get_value()
*/
opaque type _GTlsPasswordClass = CStruct5[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr2[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.guchar]], CFuncPtr4[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.guchar], _root_.sn.gnome.glib.internal.gssize, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit], CFuncPtr1[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gchar]], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]

object _GTlsPasswordClass:
  given _tag: Tag[_GTlsPasswordClass] = Tag.materializeCStruct5Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr2[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.guchar]], CFuncPtr4[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.guchar], _root_.sn.gnome.glib.internal.gssize, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit], CFuncPtr1[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gchar]], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GTlsPasswordClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def get_value : CFuncPtr2[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.guchar]] = struct._2
      inline def get_value_=(value: CFuncPtr2[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.guchar]]): Unit = (!struct.at2 = value)
      inline def set_value : CFuncPtr4[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.guchar], _root_.sn.gnome.glib.internal.gssize, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit] = struct._3
      inline def set_value_=(value: CFuncPtr4[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.guchar], _root_.sn.gnome.glib.internal.gssize, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit]): Unit = (!struct.at3 = value)
      inline def get_default_warning : CFuncPtr1[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gchar]] = struct._4
      inline def get_default_warning_=(value: CFuncPtr1[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = (!struct.at4 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._5
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates _GTlsPasswordClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GTlsPasswordClass] = scala.scalanative.unsafe.alloc[_GTlsPasswordClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, get_value : CFuncPtr2[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.guchar]], set_value : CFuncPtr4[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.guchar], _root_.sn.gnome.glib.internal.gssize, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit], get_default_warning : CFuncPtr1[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gchar]], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[_GTlsPasswordClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_value = get_value
    (!____ptr).set_value = set_value
    (!____ptr).get_default_warning = get_default_warning
    (!____ptr).padding = padding
    ____ptr