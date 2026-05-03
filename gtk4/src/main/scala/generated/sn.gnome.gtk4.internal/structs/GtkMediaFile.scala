package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkMediaFile = CStruct1[GtkMediaStream]

object GtkMediaFile:
  given _tag: Tag[GtkMediaFile] = Tag.materializeCStruct1Tag[GtkMediaStream]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkMediaFile)
      inline def parent_instance : GtkMediaStream = struct._1
      inline def parent_instance_=(value: GtkMediaStream): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkMediaFile on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkMediaFile] = scala.scalanative.unsafe.alloc[GtkMediaFile](1)
  def apply(parent_instance : GtkMediaStream)(using Zone): Ptr[GtkMediaFile] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr