package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkBinLayoutClass = CStruct1[GtkLayoutManagerClass]

object GtkBinLayoutClass:
  given _tag: Tag[GtkBinLayoutClass] = Tag.materializeCStruct1Tag[GtkLayoutManagerClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkBinLayoutClass)
      inline def parent_class : GtkLayoutManagerClass = struct._1
      inline def parent_class_=(value: GtkLayoutManagerClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkBinLayoutClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkBinLayoutClass] = scala.scalanative.unsafe.alloc[GtkBinLayoutClass](1)
  def apply(parent_class : GtkLayoutManagerClass)(using Zone): Ptr[GtkBinLayoutClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr