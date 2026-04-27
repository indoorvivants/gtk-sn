package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GTuples = CStruct1[_root_.sn.gnome.glib.internal.guint]

object _GTuples:
  given _tag: Tag[_GTuples] = Tag.materializeCStruct1Tag[_root_.sn.gnome.glib.internal.guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GTuples)
      inline def len : _root_.sn.gnome.glib.internal.guint = struct._1
      inline def len_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GTuples on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GTuples] = scala.scalanative.unsafe.alloc[_GTuples](1)
  def apply(len : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[_GTuples] =
    val ____ptr = apply()
    (!____ptr).len = len
    ____ptr