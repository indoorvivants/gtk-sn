package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkScale = CStruct1[GtkRange]

object _GtkScale:
  given _tag: Tag[_GtkScale] = Tag.materializeCStruct1Tag[GtkRange]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkScale)
      inline def parent_instance : GtkRange = struct._1
      inline def parent_instance_=(value: GtkRange): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GtkScale on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkScale] = scala.scalanative.unsafe.alloc[_GtkScale](1)
  def apply(parent_instance : GtkRange)(using Zone): Ptr[_GtkScale] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr