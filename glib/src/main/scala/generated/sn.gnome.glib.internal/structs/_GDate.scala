package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GDate = CStruct6[guint, guint, guint, guint, guint, guint]

object _GDate:
  given _tag: Tag[_GDate] = Tag.materializeCStruct6Tag[guint, guint, guint, guint, guint, guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDate)
      inline def julian_days : guint = struct._1
      inline def julian_days_=(value: guint): Unit = (!struct.at1 = value)
      inline def julian : guint = struct._2
      inline def julian_=(value: guint): Unit = (!struct.at2 = value)
      inline def dmy : guint = struct._3
      inline def dmy_=(value: guint): Unit = (!struct.at3 = value)
      inline def day : guint = struct._4
      inline def day_=(value: guint): Unit = (!struct.at4 = value)
      inline def month : guint = struct._5
      inline def month_=(value: guint): Unit = (!struct.at5 = value)
      inline def year : guint = struct._6
      inline def year_=(value: guint): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates _GDate on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDate] = scala.scalanative.unsafe.alloc[_GDate](1)
  def apply(julian_days : guint, julian : guint, dmy : guint, day : guint, month : guint, year : guint)(using Zone): Ptr[_GDate] =
    val ____ptr = apply()
    (!____ptr).julian_days = julian_days
    (!____ptr).julian = julian
    (!____ptr).dmy = dmy
    (!____ptr).day = day
    (!____ptr).month = month
    (!____ptr).year = year
    ____ptr