package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkTimeCoord: : The timestamp for this event : Flags indicating what axes are present, see [flags.AxisFlags] : (array fixed-size=12): axis values, indexed by [enum.AxisUse]
*/
opaque type _GdkTimeCoord = CStruct3[_root_.sn.gnome.glib.internal.guint32, GdkAxisFlags, CArray[Double, Nat.Digit2[Nat._1, Nat._2]]]

object _GdkTimeCoord:
  given _tag: Tag[_GdkTimeCoord] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.guint32, GdkAxisFlags, CArray[Double, Nat.Digit2[Nat._1, Nat._2]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GdkTimeCoord)
      inline def time : _root_.sn.gnome.glib.internal.guint32 = struct._1
      inline def time_=(value: _root_.sn.gnome.glib.internal.guint32): Unit = (!struct.at1 = value)
      inline def flags : GdkAxisFlags = struct._2
      inline def flags_=(value: GdkAxisFlags): Unit = (!struct.at2 = value)
      inline def axes : CArray[Double, Nat.Digit2[Nat._1, Nat._2]] = struct._3
      inline def axes_=(value: CArray[Double, Nat.Digit2[Nat._1, Nat._2]]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GdkTimeCoord on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GdkTimeCoord] = scala.scalanative.unsafe.alloc[_GdkTimeCoord](1)
  def apply(time : _root_.sn.gnome.glib.internal.guint32, flags : GdkAxisFlags, axes : CArray[Double, Nat.Digit2[Nat._1, Nat._2]])(using Zone): Ptr[_GdkTimeCoord] =
    val ____ptr = apply()
    (!____ptr).time = time
    (!____ptr).flags = flags
    (!____ptr).axes = axes
    ____ptr