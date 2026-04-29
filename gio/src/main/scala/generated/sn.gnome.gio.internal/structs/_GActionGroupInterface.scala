package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GActionGroupInterface = CStruct15[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GActionGroup], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]], CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]], CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]], CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]], CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean, Unit], CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], CFuncPtr7[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gboolean], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], _root_.sn.gnome.glib.internal.gboolean]]

object _GActionGroupInterface:
  given _tag: Tag[_GActionGroupInterface] = Tag.materializeCStruct15Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GActionGroup], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]], CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]], CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]], CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]], CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean, Unit], CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], CFuncPtr7[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gboolean], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], _root_.sn.gnome.glib.internal.gboolean]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GActionGroupInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def has_action : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean] = struct._2
      inline def has_action_=(value: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value)
      inline def list_actions : CFuncPtr1[Ptr[GActionGroup], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = struct._3
      inline def list_actions_=(value: CFuncPtr1[Ptr[GActionGroup], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]): Unit = (!struct.at3 = value)
      inline def get_action_enabled : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean] = struct._4
      inline def get_action_enabled_=(value: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at4 = value)
      inline def get_action_parameter_type : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]] = struct._5
      inline def get_action_parameter_type_=(value: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]): Unit = (!struct.at5 = value)
      inline def get_action_state_type : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]] = struct._6
      inline def get_action_state_type_=(value: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]): Unit = (!struct.at6 = value)
      inline def get_action_state_hint : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]] = struct._7
      inline def get_action_state_hint_=(value: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]]): Unit = (!struct.at7 = value)
      inline def get_action_state : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]] = struct._8
      inline def get_action_state_=(value: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]]): Unit = (!struct.at8 = value)
      inline def change_action_state : CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = struct._9
      inline def change_action_state_=(value: CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = (!struct.at9 = value)
      inline def activate_action : CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = struct._10
      inline def activate_action_=(value: CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = (!struct.at10 = value)
      inline def action_added : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit] = struct._11
      inline def action_added_=(value: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]): Unit = (!struct.at11 = value)
      inline def action_removed : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit] = struct._12
      inline def action_removed_=(value: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]): Unit = (!struct.at12 = value)
      inline def action_enabled_changed : CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean, Unit] = struct._13
      inline def action_enabled_changed_=(value: CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean, Unit]): Unit = (!struct.at13 = value)
      inline def action_state_changed : CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = struct._14
      inline def action_state_changed_=(value: CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = (!struct.at14 = value)
      inline def query_action : CFuncPtr7[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gboolean], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], _root_.sn.gnome.glib.internal.gboolean] = struct._15
      inline def query_action_=(value: CFuncPtr7[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gboolean], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at15 = value)
    end extension
  
  // Allocates _GActionGroupInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GActionGroupInterface] = scala.scalanative.unsafe.alloc[_GActionGroupInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, has_action : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean], list_actions : CFuncPtr1[Ptr[GActionGroup], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], get_action_enabled : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean], get_action_parameter_type : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]], get_action_state_type : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]], get_action_state_hint : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]], get_action_state : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]], change_action_state : CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], activate_action : CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], action_added : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], action_removed : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], action_enabled_changed : CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean, Unit], action_state_changed : CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], query_action : CFuncPtr7[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gboolean], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[_GActionGroupInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).has_action = has_action
    (!____ptr).list_actions = list_actions
    (!____ptr).get_action_enabled = get_action_enabled
    (!____ptr).get_action_parameter_type = get_action_parameter_type
    (!____ptr).get_action_state_type = get_action_state_type
    (!____ptr).get_action_state_hint = get_action_state_hint
    (!____ptr).get_action_state = get_action_state
    (!____ptr).change_action_state = change_action_state
    (!____ptr).activate_action = activate_action
    (!____ptr).action_added = action_added
    (!____ptr).action_removed = action_removed
    (!____ptr).action_enabled_changed = action_enabled_changed
    (!____ptr).action_state_changed = action_state_changed
    (!____ptr).query_action = query_action
    ____ptr