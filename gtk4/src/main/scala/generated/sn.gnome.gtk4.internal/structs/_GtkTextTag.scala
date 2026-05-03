package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkTextTag = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GtkTextTagPrivate]]

object _GtkTextTag:
  given _tag: Tag[_GtkTextTag] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GtkTextTagPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkTextTag)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GtkTextTagPrivate] = struct._2
      inline def priv_=(value: Ptr[GtkTextTagPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GtkTextTag on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkTextTag] = scala.scalanative.unsafe.alloc[_GtkTextTag](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GtkTextTagPrivate])(using Zone): Ptr[_GtkTextTag] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr