package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GHashTableIter = CStruct6[gpointer, gpointer, gpointer, CInt, gboolean, gpointer]

object GHashTableIter:
  given _tag: Tag[GHashTableIter] = Tag.materializeCStruct6Tag[gpointer, gpointer, gpointer, CInt, gboolean, gpointer]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GHashTableIter)
      inline def dummy1 : gpointer = struct._1
      inline def dummy1_=(value: gpointer): Unit = (!struct.at1 = value)
      inline def dummy2 : gpointer = struct._2
      inline def dummy2_=(value: gpointer): Unit = (!struct.at2 = value)
      inline def dummy3 : gpointer = struct._3
      inline def dummy3_=(value: gpointer): Unit = (!struct.at3 = value)
      inline def dummy4 : CInt = struct._4
      inline def dummy4_=(value: CInt): Unit = (!struct.at4 = value)
      inline def dummy5 : gboolean = struct._5
      inline def dummy5_=(value: gboolean): Unit = (!struct.at5 = value)
      inline def dummy6 : gpointer = struct._6
      inline def dummy6_=(value: gpointer): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates GHashTableIter on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GHashTableIter] = scala.scalanative.unsafe.alloc[GHashTableIter](1)
  def apply(dummy1 : gpointer, dummy2 : gpointer, dummy3 : gpointer, dummy4 : CInt, dummy5 : gboolean, dummy6 : gpointer)(using Zone): Ptr[GHashTableIter] =
    val ____ptr = apply()
    (!____ptr).dummy1 = dummy1
    (!____ptr).dummy2 = dummy2
    (!____ptr).dummy3 = dummy3
    (!____ptr).dummy4 = dummy4
    (!____ptr).dummy5 = dummy5
    (!____ptr).dummy6 = dummy6
    ____ptr