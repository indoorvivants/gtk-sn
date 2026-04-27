package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GActionInterface = CStruct9[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.gchar]], CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]], CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]], CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]], CFuncPtr1[Ptr[GAction], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]], CFuncPtr2[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], CFuncPtr2[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]

object _GActionInterface:
  given _tag: Tag[_GActionInterface] = Tag.materializeCStruct9Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.gchar]], CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]], CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]], CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]], CFuncPtr1[Ptr[GAction], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]], CFuncPtr2[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], CFuncPtr2[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GActionInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def get_name : CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.gchar]] = struct._2
      inline def get_name_=(value: CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = (!struct.at2 = value)
      inline def get_parameter_type : CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]] = struct._3
      inline def get_parameter_type_=(value: CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]): Unit = (!struct.at3 = value)
      inline def get_state_type : CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]] = struct._4
      inline def get_state_type_=(value: CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]): Unit = (!struct.at4 = value)
      inline def get_state_hint : CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]] = struct._5
      inline def get_state_hint_=(value: CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]]): Unit = (!struct.at5 = value)
      inline def get_enabled : CFuncPtr1[Ptr[GAction], _root_.sn.gnome.glib.internal.gboolean] = struct._6
      inline def get_enabled_=(value: CFuncPtr1[Ptr[GAction], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at6 = value)
      inline def get_state : CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]] = struct._7
      inline def get_state_=(value: CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]]): Unit = (!struct.at7 = value)
      inline def change_state : CFuncPtr2[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = struct._8
      inline def change_state_=(value: CFuncPtr2[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = (!struct.at8 = value)
      inline def activate : CFuncPtr2[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = struct._9
      inline def activate_=(value: CFuncPtr2[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = (!struct.at9 = value)
    end extension
  
  // Allocates _GActionInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GActionInterface] = scala.scalanative.unsafe.alloc[_GActionInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, get_name : CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.gchar]], get_parameter_type : CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]], get_state_type : CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]], get_state_hint : CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]], get_enabled : CFuncPtr1[Ptr[GAction], _root_.sn.gnome.glib.internal.gboolean], get_state : CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]], change_state : CFuncPtr2[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], activate : CFuncPtr2[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit])(using Zone): Ptr[_GActionInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).get_name = get_name
    (!____ptr).get_parameter_type = get_parameter_type
    (!____ptr).get_state_type = get_state_type
    (!____ptr).get_state_hint = get_state_hint
    (!____ptr).get_enabled = get_enabled
    (!____ptr).get_state = get_state
    (!____ptr).change_state = change_state
    (!____ptr).activate = activate
    ____ptr