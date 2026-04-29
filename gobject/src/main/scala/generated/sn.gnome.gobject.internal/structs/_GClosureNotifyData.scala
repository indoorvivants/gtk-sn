package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GClosureNotifyData = CStruct2[_root_.sn.gnome.glib.internal.gpointer, Ptr[Byte]]

object _GClosureNotifyData:
  given _tag: Tag[_GClosureNotifyData] = Tag.materializeCStruct2Tag[_root_.sn.gnome.glib.internal.gpointer, Ptr[Byte]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GClosureNotifyData)
      inline def data : _root_.sn.gnome.glib.internal.gpointer = struct._1
      inline def data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at1 = value)
      inline def _notify : GClosureNotify = struct._2.asInstanceOf[GClosureNotify]
      inline def _notify_=(value: GClosureNotify): Unit = (!struct.at2 = value.asInstanceOf[Ptr[Byte]])
    end extension
  
  // Allocates _GClosureNotifyData on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GClosureNotifyData] = scala.scalanative.unsafe.alloc[_GClosureNotifyData](1)
  def apply(data : _root_.sn.gnome.glib.internal.gpointer, _notify : GClosureNotify)(using Zone): Ptr[_GClosureNotifyData] =
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr)._notify = _notify
    ____ptr