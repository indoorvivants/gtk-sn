package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTreeView = CStruct1[GtkWidget]

object GtkTreeView:
  given _tag: Tag[GtkTreeView] = Tag.materializeCStruct1Tag[GtkWidget]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkTreeView)
      inline def parent_instance : GtkWidget = struct._1
      inline def parent_instance_=(value: GtkWidget): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkTreeView on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkTreeView] = scala.scalanative.unsafe.alloc[GtkTreeView](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[GtkTreeView] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr