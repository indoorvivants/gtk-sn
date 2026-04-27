package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GSettingsClass = CStruct6[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], CFuncPtr2[Ptr[GSettings], _root_.sn.gnome.glib.internal.GQuark, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.GQuark], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._2, Nat._0]]]

object _GSettingsClass:
  given _tag: Tag[_GSettingsClass] = Tag.materializeCStruct6Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], CFuncPtr2[Ptr[GSettings], _root_.sn.gnome.glib.internal.GQuark, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.GQuark], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._2, Nat._0]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GSettingsClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def writable_changed : CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit] = struct._2
      inline def writable_changed_=(value: CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]): Unit = (!struct.at2 = value)
      inline def changed : CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit] = struct._3
      inline def changed_=(value: CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]): Unit = (!struct.at3 = value)
      inline def writable_change_event : CFuncPtr2[Ptr[GSettings], _root_.sn.gnome.glib.internal.GQuark, _root_.sn.gnome.glib.internal.gboolean] = struct._4
      inline def writable_change_event_=(value: CFuncPtr2[Ptr[GSettings], _root_.sn.gnome.glib.internal.GQuark, _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at4 = value)
      inline def change_event : CFuncPtr3[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.GQuark], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gboolean] = struct._5
      inline def change_event_=(value: CFuncPtr3[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.GQuark], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at5 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._2, Nat._0]] = struct._6
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._2, Nat._0]]): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates _GSettingsClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GSettingsClass] = scala.scalanative.unsafe.alloc[_GSettingsClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, writable_changed : CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], changed : CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], writable_change_event : CFuncPtr2[Ptr[GSettings], _root_.sn.gnome.glib.internal.GQuark, _root_.sn.gnome.glib.internal.gboolean], change_event : CFuncPtr3[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.GQuark], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gboolean], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._2, Nat._0]])(using Zone): Ptr[_GSettingsClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).writable_changed = writable_changed
    (!____ptr).changed = changed
    (!____ptr).writable_change_event = writable_change_event
    (!____ptr).change_event = change_event
    (!____ptr).padding = padding
    ____ptr