package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkGridLayoutChildClass = CStruct1[GtkLayoutChildClass]

object GtkGridLayoutChildClass:
  given _tag: Tag[GtkGridLayoutChildClass] = Tag.materializeCStruct1Tag[GtkLayoutChildClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkGridLayoutChildClass)
      inline def parent_class : GtkLayoutChildClass = struct._1
      inline def parent_class_=(value: GtkLayoutChildClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkGridLayoutChildClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkGridLayoutChildClass] = scala.scalanative.unsafe.alloc[GtkGridLayoutChildClass](1)
  def apply(parent_class : GtkLayoutChildClass)(using Zone): Ptr[GtkGridLayoutChildClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr