package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GdkContentProvider = CStruct1[_root_.sn.gnome.gobject.internal.GObject]

object _GdkContentProvider:
  given _tag: Tag[_GdkContentProvider] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObject]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GdkContentProvider)
      inline def parent : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GdkContentProvider on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GdkContentProvider] = scala.scalanative.unsafe.alloc[_GdkContentProvider](1)
  def apply(parent : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[_GdkContentProvider] =
    val ____ptr = apply()
    (!____ptr).parent = parent
    ____ptr