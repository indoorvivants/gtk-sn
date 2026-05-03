package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GTlsPassword = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GTlsPasswordPrivate]]

object _GTlsPassword:
  given _tag: Tag[_GTlsPassword] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GTlsPasswordPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GTlsPassword)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GTlsPasswordPrivate] = struct._2
      inline def priv_=(value: Ptr[GTlsPasswordPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GTlsPassword on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GTlsPassword] = scala.scalanative.unsafe.alloc[_GTlsPassword](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GTlsPasswordPrivate])(using Zone): Ptr[_GTlsPassword] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr