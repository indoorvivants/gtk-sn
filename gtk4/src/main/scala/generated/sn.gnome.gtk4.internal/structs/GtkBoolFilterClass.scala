package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkBoolFilterClass = CStruct1[GtkFilterClass]

object GtkBoolFilterClass:
  given _tag: Tag[GtkBoolFilterClass] = Tag.materializeCStruct1Tag[GtkFilterClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkBoolFilterClass)
      inline def parent_class : GtkFilterClass = struct._1
      inline def parent_class_=(value: GtkFilterClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkBoolFilterClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkBoolFilterClass] = scala.scalanative.unsafe.alloc[GtkBoolFilterClass](1)
  def apply(parent_class : GtkFilterClass)(using Zone): Ptr[GtkBoolFilterClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr