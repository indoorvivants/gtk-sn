package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GStaticPrivate = CStruct1[guint]

object _GStaticPrivate:
  given _tag: Tag[_GStaticPrivate] = Tag.materializeCStruct1Tag[guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GStaticPrivate)
      inline def index : guint = struct._1
      inline def index_=(value: guint): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GStaticPrivate on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GStaticPrivate] = scala.scalanative.unsafe.alloc[_GStaticPrivate](1)
  def apply(index : guint)(using Zone): Ptr[_GStaticPrivate] =
    val ____ptr = apply()
    (!____ptr).index = index
    ____ptr