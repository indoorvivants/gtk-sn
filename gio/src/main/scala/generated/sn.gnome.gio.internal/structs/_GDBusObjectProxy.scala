package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GDBusObjectProxy = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GDBusObjectProxyPrivate]]

object _GDBusObjectProxy:
  given _tag: Tag[_GDBusObjectProxy] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GDBusObjectProxyPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDBusObjectProxy)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GDBusObjectProxyPrivate] = struct._2
      inline def priv_=(value: Ptr[GDBusObjectProxyPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GDBusObjectProxy on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDBusObjectProxy] = scala.scalanative.unsafe.alloc[_GDBusObjectProxy](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GDBusObjectProxyPrivate])(using Zone): Ptr[_GDBusObjectProxy] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr