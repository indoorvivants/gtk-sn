package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GStaticPrivate = CStruct1[guint]

object GStaticPrivate:
  given _tag: Tag[GStaticPrivate] = Tag.materializeCStruct1Tag[guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GStaticPrivate)
      inline def index : guint = struct._1
      inline def index_=(value: guint): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GStaticPrivate on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GStaticPrivate] = scala.scalanative.unsafe.alloc[GStaticPrivate](1)
  def apply(index : guint)(using Zone): Ptr[GStaticPrivate] =
    val ____ptr = apply()
    (!____ptr).index = index
    ____ptr