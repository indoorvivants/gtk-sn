package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkContentProvider = CStruct1[_root_.sn.gnome.gobject.internal.GObject]

object GdkContentProvider:
  given _tag: Tag[GdkContentProvider] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObject]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GdkContentProvider)
      inline def parent : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GdkContentProvider on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GdkContentProvider] = scala.scalanative.unsafe.alloc[GdkContentProvider](1)
  def apply(parent : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[GdkContentProvider] =
    val ____ptr = apply()
    (!____ptr).parent = parent
    ____ptr