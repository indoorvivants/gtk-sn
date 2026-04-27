package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTextBuffer = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GtkTextBufferPrivate]]

object GtkTextBuffer:
  given _tag: Tag[GtkTextBuffer] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GtkTextBufferPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkTextBuffer)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GtkTextBufferPrivate] = struct._2
      inline def priv_=(value: Ptr[GtkTextBufferPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GtkTextBuffer on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkTextBuffer] = scala.scalanative.unsafe.alloc[GtkTextBuffer](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GtkTextBufferPrivate])(using Zone): Ptr[GtkTextBuffer] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr