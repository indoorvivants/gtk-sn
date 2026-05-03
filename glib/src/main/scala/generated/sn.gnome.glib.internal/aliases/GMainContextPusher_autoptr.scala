package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMainContextPusher_autoptr = Ptr[GMainContextPusher]
object GMainContextPusher_autoptr:
  given _tag: Tag[GMainContextPusher_autoptr] = Tag.Ptr[GMainContextPusher](GMainContextPusher._tag)
  inline def apply(inline o: Ptr[GMainContextPusher]): GMainContextPusher_autoptr = o
  extension (v: GMainContextPusher_autoptr)
    inline def value: Ptr[GMainContextPusher] = v