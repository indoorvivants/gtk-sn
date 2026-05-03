package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSignalInvocationHint: _id: The signal id of the signal invoking the callback
*/
opaque type _GSignalInvocationHint = CStruct3[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.GQuark, GSignalFlags]

object _GSignalInvocationHint:
  given _tag: Tag[_GSignalInvocationHint] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.GQuark, GSignalFlags]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GSignalInvocationHint)
      inline def signal_id : _root_.sn.gnome.glib.internal.guint = struct._1
      inline def signal_id_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at1 = value)
      inline def detail : _root_.sn.gnome.glib.internal.GQuark = struct._2
      inline def detail_=(value: _root_.sn.gnome.glib.internal.GQuark): Unit = (!struct.at2 = value)
      inline def run_type : GSignalFlags = struct._3
      inline def run_type_=(value: GSignalFlags): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GSignalInvocationHint on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GSignalInvocationHint] = scala.scalanative.unsafe.alloc[_GSignalInvocationHint](1)
  def apply(signal_id : _root_.sn.gnome.glib.internal.guint, detail : _root_.sn.gnome.glib.internal.GQuark, run_type : GSignalFlags)(using Zone): Ptr[_GSignalInvocationHint] =
    val ____ptr = apply()
    (!____ptr).signal_id = signal_id
    (!____ptr).detail = detail
    (!____ptr).run_type = run_type
    ____ptr