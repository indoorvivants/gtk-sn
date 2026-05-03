package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCenterLayoutClass_autoptr = Ptr[GtkCenterLayoutClass]
object GtkCenterLayoutClass_autoptr:
  given _tag: Tag[GtkCenterLayoutClass_autoptr] = Tag.Ptr[GtkCenterLayoutClass](GtkCenterLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkCenterLayoutClass]): GtkCenterLayoutClass_autoptr = o
  extension (v: GtkCenterLayoutClass_autoptr)
    inline def value: Ptr[GtkCenterLayoutClass] = v