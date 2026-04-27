package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkMediaFile = CStruct1[GtkMediaStream]

object _GtkMediaFile:
  given _tag: Tag[_GtkMediaFile] = Tag.materializeCStruct1Tag[GtkMediaStream]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkMediaFile)
      inline def parent_instance : GtkMediaStream = struct._1
      inline def parent_instance_=(value: GtkMediaStream): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GtkMediaFile on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkMediaFile] = scala.scalanative.unsafe.alloc[_GtkMediaFile](1)
  def apply(parent_instance : GtkMediaStream)(using Zone): Ptr[_GtkMediaFile] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr