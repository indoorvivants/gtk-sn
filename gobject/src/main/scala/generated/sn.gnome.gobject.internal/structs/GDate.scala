package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDate = CStruct6[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]

object GDate:
  given _tag: Tag[GDate] = Tag.materializeCStruct6Tag[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDate)
      inline def julian_days : _root_.sn.gnome.glib.internal.guint = struct._1
      inline def julian_days_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at1 = value)
      inline def julian : _root_.sn.gnome.glib.internal.guint = struct._2
      inline def julian_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at2 = value)
      inline def dmy : _root_.sn.gnome.glib.internal.guint = struct._3
      inline def dmy_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at3 = value)
      inline def day : _root_.sn.gnome.glib.internal.guint = struct._4
      inline def day_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at4 = value)
      inline def month : _root_.sn.gnome.glib.internal.guint = struct._5
      inline def month_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at5 = value)
      inline def year : _root_.sn.gnome.glib.internal.guint = struct._6
      inline def year_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates GDate on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDate] = scala.scalanative.unsafe.alloc[GDate](1)
  def apply(julian_days : _root_.sn.gnome.glib.internal.guint, julian : _root_.sn.gnome.glib.internal.guint, dmy : _root_.sn.gnome.glib.internal.guint, day : _root_.sn.gnome.glib.internal.guint, month : _root_.sn.gnome.glib.internal.guint, year : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[GDate] =
    val ____ptr = apply()
    (!____ptr).julian_days = julian_days
    (!____ptr).julian = julian
    (!____ptr).dmy = dmy
    (!____ptr).day = day
    (!____ptr).month = month
    (!____ptr).year = year
    ____ptr