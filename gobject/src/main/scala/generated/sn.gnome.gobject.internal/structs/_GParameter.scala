package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GParameter: : the parameter value

 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
opaque type _GParameter = CStruct2[Ptr[_root_.sn.gnome.glib.internal.gchar], GValue]

object _GParameter:
  given _tag: Tag[_GParameter] = Tag.materializeCStruct2Tag[Ptr[_root_.sn.gnome.glib.internal.gchar], GValue]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GParameter)
      inline def name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._1
      inline def name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at1 = value)
      inline def value : GValue = struct._2
      inline def value_=(value: GValue): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GParameter on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GParameter] = scala.scalanative.unsafe.alloc[_GParameter](1)
  def apply(name : Ptr[_root_.sn.gnome.glib.internal.gchar], value : GValue)(using Zone): Ptr[_GParameter] =
    val ____ptr = apply()
    (!____ptr).name = name
    (!____ptr).value = value
    ____ptr