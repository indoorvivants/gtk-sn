package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTask_autoptr = Ptr[GTask]
object GTask_autoptr:
  given _tag: Tag[GTask_autoptr] = Tag.Ptr[GTask](GTask._tag)
  inline def apply(inline o: Ptr[GTask]): GTask_autoptr = o
  extension (v: GTask_autoptr)
    inline def value: Ptr[GTask] = v