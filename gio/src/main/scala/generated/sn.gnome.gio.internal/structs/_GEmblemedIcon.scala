package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GEmblemedIcon = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GEmblemedIconPrivate]]

object _GEmblemedIcon:
  given _tag: Tag[_GEmblemedIcon] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GEmblemedIconPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GEmblemedIcon)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GEmblemedIconPrivate] = struct._2
      inline def priv_=(value: Ptr[GEmblemedIconPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GEmblemedIcon on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GEmblemedIcon] = scala.scalanative.unsafe.alloc[_GEmblemedIcon](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GEmblemedIconPrivate])(using Zone): Ptr[_GEmblemedIcon] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr