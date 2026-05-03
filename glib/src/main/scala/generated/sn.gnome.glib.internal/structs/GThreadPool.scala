package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GThreadPool = CStruct3[GFunc, gpointer, gboolean]

object GThreadPool:
  given _tag: Tag[GThreadPool] = Tag.materializeCStruct3Tag[GFunc, gpointer, gboolean]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GThreadPool)
      inline def func : GFunc = struct._1
      inline def func_=(value: GFunc): Unit = (!struct.at1 = value)
      inline def user_data : gpointer = struct._2
      inline def user_data_=(value: gpointer): Unit = (!struct.at2 = value)
      inline def exclusive : gboolean = struct._3
      inline def exclusive_=(value: gboolean): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GThreadPool on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GThreadPool] = scala.scalanative.unsafe.alloc[GThreadPool](1)
  def apply(func : GFunc, user_data : gpointer, exclusive : gboolean)(using Zone): Ptr[GThreadPool] =
    val ____ptr = apply()
    (!____ptr).func = func
    (!____ptr).user_data = user_data
    (!____ptr).exclusive = exclusive
    ____ptr