package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusProxyClass: _properties_changed: Signal class handler for the #GDBusProxy::g-properties-changed signal. _signal: Signal class handler for the #GDBusProxy::g-signal signal.
*/
opaque type _GDBusProxyClass = CStruct4[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit], CFuncPtr4[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._3, Nat._2]]]

object _GDBusProxyClass:
  given _tag: Tag[_GDBusProxyClass] = Tag.materializeCStruct4Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit], CFuncPtr4[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._3, Nat._2]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDBusProxyClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def g_properties_changed : CFuncPtr3[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit] = struct._2
      inline def g_properties_changed_=(value: CFuncPtr3[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit]): Unit = (!struct.at2 = value)
      inline def g_signal : CFuncPtr4[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = struct._3
      inline def g_signal_=(value: CFuncPtr4[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = (!struct.at3 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._3, Nat._2]] = struct._4
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._3, Nat._2]]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GDBusProxyClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDBusProxyClass] = scala.scalanative.unsafe.alloc[_GDBusProxyClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, g_properties_changed : CFuncPtr3[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit], g_signal : CFuncPtr4[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._3, Nat._2]])(using Zone): Ptr[_GDBusProxyClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).g_properties_changed = g_properties_changed
    (!____ptr).g_signal = g_signal
    (!____ptr).padding = padding
    ____ptr