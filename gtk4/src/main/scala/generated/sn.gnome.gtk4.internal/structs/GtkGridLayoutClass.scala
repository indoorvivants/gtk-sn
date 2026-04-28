package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkGridLayoutClass = CStruct1[GtkLayoutManagerClass]

object GtkGridLayoutClass:
  given _tag: Tag[GtkGridLayoutClass] = Tag.materializeCStruct1Tag[GtkLayoutManagerClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkGridLayoutClass)
      inline def parent_class : GtkLayoutManagerClass = struct._1
      inline def parent_class_=(value: GtkLayoutManagerClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkGridLayoutClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkGridLayoutClass] = scala.scalanative.unsafe.alloc[GtkGridLayoutClass](1)
  def apply(parent_class : GtkLayoutManagerClass)(using Zone): Ptr[GtkGridLayoutClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr