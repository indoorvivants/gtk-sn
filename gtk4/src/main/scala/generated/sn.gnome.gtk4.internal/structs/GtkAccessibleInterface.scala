package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkAccessibleInterface: _at_context: retrieve the platform-specific accessibility context for the accessible implementation _platform_state: retrieve the accessible state
*/
opaque type GtkAccessibleInterface = CStruct7[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GtkAccessible], Ptr[GtkATContext]], CFuncPtr2[Ptr[GtkAccessible], GtkAccessiblePlatformState, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GtkAccessible], Ptr[GtkAccessible]], CFuncPtr1[Ptr[GtkAccessible], Ptr[GtkAccessible]], CFuncPtr1[Ptr[GtkAccessible], Ptr[GtkAccessible]], CFuncPtr5[Ptr[GtkAccessible], Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean]]

object GtkAccessibleInterface:
  given _tag: Tag[GtkAccessibleInterface] = Tag.materializeCStruct7Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GtkAccessible], Ptr[GtkATContext]], CFuncPtr2[Ptr[GtkAccessible], GtkAccessiblePlatformState, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GtkAccessible], Ptr[GtkAccessible]], CFuncPtr1[Ptr[GtkAccessible], Ptr[GtkAccessible]], CFuncPtr1[Ptr[GtkAccessible], Ptr[GtkAccessible]], CFuncPtr5[Ptr[GtkAccessible], Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkAccessibleInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def get_at_context : CFuncPtr1[Ptr[GtkAccessible], Ptr[GtkATContext]] = struct._2
      inline def get_at_context_=(value: CFuncPtr1[Ptr[GtkAccessible], Ptr[GtkATContext]]): Unit = (!struct.at2 = value)
      inline def get_platform_state : CFuncPtr2[Ptr[GtkAccessible], GtkAccessiblePlatformState, _root_.sn.gnome.glib.internal.gboolean] = struct._3
      inline def get_platform_state_=(value: CFuncPtr2[Ptr[GtkAccessible], GtkAccessiblePlatformState, _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at3 = value)
      inline def get_accessible_parent : CFuncPtr1[Ptr[GtkAccessible], Ptr[GtkAccessible]] = struct._4
      inline def get_accessible_parent_=(value: CFuncPtr1[Ptr[GtkAccessible], Ptr[GtkAccessible]]): Unit = (!struct.at4 = value)
      inline def get_first_accessible_child : CFuncPtr1[Ptr[GtkAccessible], Ptr[GtkAccessible]] = struct._5
      inline def get_first_accessible_child_=(value: CFuncPtr1[Ptr[GtkAccessible], Ptr[GtkAccessible]]): Unit = (!struct.at5 = value)
      inline def get_next_accessible_sibling : CFuncPtr1[Ptr[GtkAccessible], Ptr[GtkAccessible]] = struct._6
      inline def get_next_accessible_sibling_=(value: CFuncPtr1[Ptr[GtkAccessible], Ptr[GtkAccessible]]): Unit = (!struct.at6 = value)
      inline def get_bounds : CFuncPtr5[Ptr[GtkAccessible], Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean] = struct._7
      inline def get_bounds_=(value: CFuncPtr5[Ptr[GtkAccessible], Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at7 = value)
    end extension
  
  // Allocates GtkAccessibleInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkAccessibleInterface] = scala.scalanative.unsafe.alloc[GtkAccessibleInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, get_at_context : CFuncPtr1[Ptr[GtkAccessible], Ptr[GtkATContext]], get_platform_state : CFuncPtr2[Ptr[GtkAccessible], GtkAccessiblePlatformState, _root_.sn.gnome.glib.internal.gboolean], get_accessible_parent : CFuncPtr1[Ptr[GtkAccessible], Ptr[GtkAccessible]], get_first_accessible_child : CFuncPtr1[Ptr[GtkAccessible], Ptr[GtkAccessible]], get_next_accessible_sibling : CFuncPtr1[Ptr[GtkAccessible], Ptr[GtkAccessible]], get_bounds : CFuncPtr5[Ptr[GtkAccessible], Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[GtkAccessibleInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).get_at_context = get_at_context
    (!____ptr).get_platform_state = get_platform_state
    (!____ptr).get_accessible_parent = get_accessible_parent
    (!____ptr).get_first_accessible_child = get_first_accessible_child
    (!____ptr).get_next_accessible_sibling = get_next_accessible_sibling
    (!____ptr).get_bounds = get_bounds
    ____ptr