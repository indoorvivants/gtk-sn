package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkOverlayLayoutClass = CStruct1[GtkLayoutManagerClass]

object GtkOverlayLayoutClass:
  given _tag: Tag[GtkOverlayLayoutClass] = Tag.materializeCStruct1Tag[GtkLayoutManagerClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkOverlayLayoutClass)
      inline def parent_class : GtkLayoutManagerClass = struct._1
      inline def parent_class_=(value: GtkLayoutManagerClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkOverlayLayoutClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkOverlayLayoutClass] = scala.scalanative.unsafe.alloc[GtkOverlayLayoutClass](1)
  def apply(parent_class : GtkLayoutManagerClass)(using Zone): Ptr[GtkOverlayLayoutClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr