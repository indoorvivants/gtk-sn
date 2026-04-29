package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusObjectSkeletonClass: _class: The parent class. _method: Signal class handler for the #GDBusObjectSkeleton::authorize-method signal.
*/
opaque type _GDBusObjectSkeletonClass = CStruct3[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GDBusObjectSkeleton], Ptr[GDBusInterfaceSkeleton], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object _GDBusObjectSkeletonClass:
  given _tag: Tag[_GDBusObjectSkeletonClass] = Tag.materializeCStruct3Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GDBusObjectSkeleton], Ptr[GDBusInterfaceSkeleton], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDBusObjectSkeletonClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def authorize_method : CFuncPtr3[Ptr[GDBusObjectSkeleton], Ptr[GDBusInterfaceSkeleton], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean] = struct._2
      inline def authorize_method_=(value: CFuncPtr3[Ptr[GDBusObjectSkeleton], Ptr[GDBusInterfaceSkeleton], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._3
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GDBusObjectSkeletonClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDBusObjectSkeletonClass] = scala.scalanative.unsafe.alloc[_GDBusObjectSkeletonClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, authorize_method : CFuncPtr3[Ptr[GDBusObjectSkeleton], Ptr[GDBusInterfaceSkeleton], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[_GDBusObjectSkeletonClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).authorize_method = authorize_method
    (!____ptr).padding = padding
    ____ptr