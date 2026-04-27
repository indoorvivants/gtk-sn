package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkParamSpecExpression:
*/
opaque type GtkParamSpecExpression = CStruct1[_root_.sn.gnome.gobject.internal.GParamSpec]

object GtkParamSpecExpression:
  given _tag: Tag[GtkParamSpecExpression] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GParamSpec]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkParamSpecExpression)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GParamSpec = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GParamSpec): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkParamSpecExpression on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkParamSpecExpression] = scala.scalanative.unsafe.alloc[GtkParamSpecExpression](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GParamSpec)(using Zone): Ptr[GtkParamSpecExpression] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr