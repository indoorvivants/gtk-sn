package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTuples = CStruct1[guint]

object GTuples:
  given _tag: Tag[GTuples] = Tag.materializeCStruct1Tag[guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GTuples)
      inline def len : guint = struct._1
      inline def len_=(value: guint): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GTuples on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GTuples] = scala.scalanative.unsafe.alloc[GTuples](1)
  def apply(len : guint)(using Zone): Ptr[GTuples] =
    val ____ptr = apply()
    (!____ptr).len = len
    ____ptr