package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GOnce = CStruct2[GOnceStatus, gpointer]

object GOnce:
  given _tag: Tag[GOnce] = Tag.materializeCStruct2Tag[GOnceStatus, gpointer]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GOnce)
      inline def status : GOnceStatus = struct._1
      inline def status_=(value: GOnceStatus): Unit = (!struct.at1 = value)
      inline def retval : gpointer = struct._2
      inline def retval_=(value: gpointer): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GOnce on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GOnce] = scala.scalanative.unsafe.alloc[GOnce](1)
  def apply(status : GOnceStatus, retval : gpointer)(using Zone): Ptr[GOnce] =
    val ____ptr = apply()
    (!____ptr).status = status
    (!____ptr).retval = retval
    ____ptr