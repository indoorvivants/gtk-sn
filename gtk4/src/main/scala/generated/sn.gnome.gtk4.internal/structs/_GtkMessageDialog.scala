package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkMessageDialog = CStruct1[GtkDialog]

object _GtkMessageDialog:
  given _tag: Tag[_GtkMessageDialog] = Tag.materializeCStruct1Tag[GtkDialog]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkMessageDialog)
      inline def parent_instance : GtkDialog = struct._1
      inline def parent_instance_=(value: GtkDialog): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GtkMessageDialog on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkMessageDialog] = scala.scalanative.unsafe.alloc[_GtkMessageDialog](1)
  def apply(parent_instance : GtkDialog)(using Zone): Ptr[_GtkMessageDialog] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr