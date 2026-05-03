package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GThread_autoptr = Ptr[GThread]
object GThread_autoptr:
  given _tag: Tag[GThread_autoptr] = Tag.Ptr[GThread](GThread._tag)
  inline def apply(inline o: Ptr[GThread]): GThread_autoptr = o
  extension (v: GThread_autoptr)
    inline def value: Ptr[GThread] = v