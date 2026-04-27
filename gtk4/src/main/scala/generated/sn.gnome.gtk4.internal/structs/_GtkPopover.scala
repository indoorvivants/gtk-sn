package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkPopover = CStruct1[GtkWidget]

object _GtkPopover:
  given _tag: Tag[_GtkPopover] = Tag.materializeCStruct1Tag[GtkWidget]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkPopover)
      inline def parent : GtkWidget = struct._1
      inline def parent_=(value: GtkWidget): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GtkPopover on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkPopover] = scala.scalanative.unsafe.alloc[_GtkPopover](1)
  def apply(parent : GtkWidget)(using Zone): Ptr[_GtkPopover] =
    val ____ptr = apply()
    (!____ptr).parent = parent
    ____ptr