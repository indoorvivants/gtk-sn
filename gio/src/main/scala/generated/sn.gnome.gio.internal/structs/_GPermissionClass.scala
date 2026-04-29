package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GPermissionClass = CStruct8[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GPermission], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr4[Ptr[GPermission], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GPermission], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GPermission], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr4[Ptr[GPermission], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GPermission], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._6]]]

object _GPermissionClass:
  given _tag: Tag[_GPermissionClass] = Tag.materializeCStruct8Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GPermission], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr4[Ptr[GPermission], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GPermission], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GPermission], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr4[Ptr[GPermission], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GPermission], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._6]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GPermissionClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def acquire : CFuncPtr3[Ptr[GPermission], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._2
      inline def acquire_=(value: CFuncPtr3[Ptr[GPermission], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value)
      inline def acquire_async : CFuncPtr4[Ptr[GPermission], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._3
      inline def acquire_async_=(value: CFuncPtr4[Ptr[GPermission], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at3 = value)
      inline def acquire_finish : CFuncPtr3[Ptr[GPermission], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._4
      inline def acquire_finish_=(value: CFuncPtr3[Ptr[GPermission], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at4 = value)
      inline def release : CFuncPtr3[Ptr[GPermission], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._5
      inline def release_=(value: CFuncPtr3[Ptr[GPermission], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at5 = value)
      inline def release_async : CFuncPtr4[Ptr[GPermission], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._6
      inline def release_async_=(value: CFuncPtr4[Ptr[GPermission], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at6 = value)
      inline def release_finish : CFuncPtr3[Ptr[GPermission], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._7
      inline def release_finish_=(value: CFuncPtr3[Ptr[GPermission], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at7 = value)
      inline def reserved : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._6]] = struct._8
      inline def reserved_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._6]]): Unit = (!struct.at8 = value)
    end extension
  
  // Allocates _GPermissionClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GPermissionClass] = scala.scalanative.unsafe.alloc[_GPermissionClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, acquire : CFuncPtr3[Ptr[GPermission], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], acquire_async : CFuncPtr4[Ptr[GPermission], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], acquire_finish : CFuncPtr3[Ptr[GPermission], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], release : CFuncPtr3[Ptr[GPermission], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], release_async : CFuncPtr4[Ptr[GPermission], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], release_finish : CFuncPtr3[Ptr[GPermission], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], reserved : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[_GPermissionClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).acquire = acquire
    (!____ptr).acquire_async = acquire_async
    (!____ptr).acquire_finish = acquire_finish
    (!____ptr).release = release
    (!____ptr).release_async = release_async
    (!____ptr).release_finish = release_finish
    (!____ptr).reserved = reserved
    ____ptr