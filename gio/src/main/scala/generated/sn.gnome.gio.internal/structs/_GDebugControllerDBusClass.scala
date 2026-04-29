package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDebugControllerDBusClass: _class: The parent class. : Default handler for the #GDebugControllerDBus::authorize signal.
*/
opaque type _GDebugControllerDBusClass = CStruct3[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr2[Ptr[GDebugControllerDBus], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._2]]]

object _GDebugControllerDBusClass:
  given _tag: Tag[_GDebugControllerDBusClass] = Tag.materializeCStruct3Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr2[Ptr[GDebugControllerDBus], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._2]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDebugControllerDBusClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def authorize : CFuncPtr2[Ptr[GDebugControllerDBus], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean] = struct._2
      inline def authorize_=(value: CFuncPtr2[Ptr[GDebugControllerDBus], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._2]] = struct._3
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._2]]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GDebugControllerDBusClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDebugControllerDBusClass] = scala.scalanative.unsafe.alloc[_GDebugControllerDBusClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, authorize : CFuncPtr2[Ptr[GDebugControllerDBus], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._2]])(using Zone): Ptr[_GDebugControllerDBusClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).authorize = authorize
    (!____ptr).padding = padding
    ____ptr