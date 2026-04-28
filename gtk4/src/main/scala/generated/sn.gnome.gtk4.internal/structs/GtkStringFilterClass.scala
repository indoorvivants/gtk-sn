package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkStringFilterClass = CStruct1[GtkFilterClass]

object GtkStringFilterClass:
  given _tag: Tag[GtkStringFilterClass] = Tag.materializeCStruct1Tag[GtkFilterClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkStringFilterClass)
      inline def parent_class : GtkFilterClass = struct._1
      inline def parent_class_=(value: GtkFilterClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkStringFilterClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkStringFilterClass] = scala.scalanative.unsafe.alloc[GtkStringFilterClass](1)
  def apply(parent_class : GtkFilterClass)(using Zone): Ptr[GtkStringFilterClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr