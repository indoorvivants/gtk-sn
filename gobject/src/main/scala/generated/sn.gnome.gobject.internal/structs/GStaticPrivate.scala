package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GStaticPrivate = CStruct1[_root_.sn.gnome.glib.internal.guint]

object GStaticPrivate:
  given _tag: Tag[GStaticPrivate] = Tag.materializeCStruct1Tag[_root_.sn.gnome.glib.internal.guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GStaticPrivate)
      inline def index : _root_.sn.gnome.glib.internal.guint = struct._1
      inline def index_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GStaticPrivate on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GStaticPrivate] = scala.scalanative.unsafe.alloc[GStaticPrivate](1)
  def apply(index : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[GStaticPrivate] =
    val ____ptr = apply()
    (!____ptr).index = index
    ____ptr