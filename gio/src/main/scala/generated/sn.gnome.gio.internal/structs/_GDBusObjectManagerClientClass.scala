package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusObjectManagerClientClass: _class: The parent class.
*/
opaque type _GDBusObjectManagerClientClass = CStruct4[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr6[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], CFuncPtr5[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object _GDBusObjectManagerClientClass:
  given _tag: Tag[_GDBusObjectManagerClientClass] = Tag.materializeCStruct4Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr6[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], CFuncPtr5[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDBusObjectManagerClientClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def interface_proxy_signal : CFuncPtr6[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = struct._2
      inline def interface_proxy_signal_=(value: CFuncPtr6[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = (!struct.at2 = value)
      inline def interface_proxy_properties_changed : CFuncPtr5[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit] = struct._3
      inline def interface_proxy_properties_changed_=(value: CFuncPtr5[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit]): Unit = (!struct.at3 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._4
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GDBusObjectManagerClientClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDBusObjectManagerClientClass] = scala.scalanative.unsafe.alloc[_GDBusObjectManagerClientClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, interface_proxy_signal : CFuncPtr6[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], interface_proxy_properties_changed : CFuncPtr5[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[_GDBusObjectManagerClientClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).interface_proxy_signal = interface_proxy_signal
    (!____ptr).interface_proxy_properties_changed = interface_proxy_properties_changed
    (!____ptr).padding = padding
    ____ptr