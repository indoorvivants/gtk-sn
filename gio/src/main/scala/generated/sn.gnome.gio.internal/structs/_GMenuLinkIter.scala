package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GMenuLinkIter = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GMenuLinkIterPrivate]]

object _GMenuLinkIter:
  given _tag: Tag[_GMenuLinkIter] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GMenuLinkIterPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GMenuLinkIter)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GMenuLinkIterPrivate] = struct._2
      inline def priv_=(value: Ptr[GMenuLinkIterPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GMenuLinkIter on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GMenuLinkIter] = scala.scalanative.unsafe.alloc[_GMenuLinkIter](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GMenuLinkIterPrivate])(using Zone): Ptr[_GMenuLinkIter] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr