package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkRange = CStruct1[GtkWidget]

object _GtkRange:
  given _tag: Tag[_GtkRange] = Tag.materializeCStruct1Tag[GtkWidget]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkRange)
      inline def parent_instance : GtkWidget = struct._1
      inline def parent_instance_=(value: GtkWidget): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GtkRange on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkRange] = scala.scalanative.unsafe.alloc[_GtkRange](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[_GtkRange] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr