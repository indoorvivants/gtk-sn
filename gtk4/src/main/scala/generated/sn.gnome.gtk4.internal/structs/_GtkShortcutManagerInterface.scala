package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkShortcutManagerInterface: _controller: Add a `GtkShortcutController` to be managed. _controller: Remove a `GtkShortcutController` that had previously been added
*/
opaque type _GtkShortcutManagerInterface = CStruct3[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit], CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit]]

object _GtkShortcutManagerInterface:
  given _tag: Tag[_GtkShortcutManagerInterface] = Tag.materializeCStruct3Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit], CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkShortcutManagerInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def add_controller : CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit] = struct._2
      inline def add_controller_=(value: CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit]): Unit = (!struct.at2 = value)
      inline def remove_controller : CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit] = struct._3
      inline def remove_controller_=(value: CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GtkShortcutManagerInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkShortcutManagerInterface] = scala.scalanative.unsafe.alloc[_GtkShortcutManagerInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, add_controller : CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit], remove_controller : CFuncPtr2[Ptr[GtkShortcutManager], Ptr[GtkShortcutController], Unit])(using Zone): Ptr[_GtkShortcutManagerInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).add_controller = add_controller
    (!____ptr).remove_controller = remove_controller
    ____ptr