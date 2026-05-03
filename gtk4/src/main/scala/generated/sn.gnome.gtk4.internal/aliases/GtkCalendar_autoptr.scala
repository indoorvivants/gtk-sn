package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCalendar_autoptr = Ptr[GtkCalendar]
object GtkCalendar_autoptr:
  given _tag: Tag[GtkCalendar_autoptr] = Tag.Ptr[GtkCalendar](GtkCalendar._tag)
  inline def apply(inline o: Ptr[GtkCalendar]): GtkCalendar_autoptr = o
  extension (v: GtkCalendar_autoptr)
    inline def value: Ptr[GtkCalendar] = v