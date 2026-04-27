package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkDialog = CStruct1[GtkWindow]

object GtkDialog:
  given _tag: Tag[GtkDialog] = Tag.materializeCStruct1Tag[GtkWindow]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkDialog)
      inline def parent_instance : GtkWindow = struct._1
      inline def parent_instance_=(value: GtkWindow): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkDialog on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkDialog] = scala.scalanative.unsafe.alloc[GtkDialog](1)
  def apply(parent_instance : GtkWindow)(using Zone): Ptr[GtkDialog] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr