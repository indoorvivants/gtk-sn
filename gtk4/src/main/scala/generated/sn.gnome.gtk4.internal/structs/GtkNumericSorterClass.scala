package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkNumericSorterClass = CStruct1[GtkSorterClass]

object GtkNumericSorterClass:
  given _tag: Tag[GtkNumericSorterClass] = Tag.materializeCStruct1Tag[GtkSorterClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkNumericSorterClass)
      inline def parent_class : GtkSorterClass = struct._1
      inline def parent_class_=(value: GtkSorterClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkNumericSorterClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkNumericSorterClass] = scala.scalanative.unsafe.alloc[GtkNumericSorterClass](1)
  def apply(parent_class : GtkSorterClass)(using Zone): Ptr[GtkNumericSorterClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr