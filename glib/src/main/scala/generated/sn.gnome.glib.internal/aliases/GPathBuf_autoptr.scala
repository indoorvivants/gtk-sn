package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GPathBuf_autoptr = Ptr[GPathBuf]
object GPathBuf_autoptr:
  given _tag: Tag[GPathBuf_autoptr] = Tag.Ptr[GPathBuf](GPathBuf._tag)
  inline def apply(inline o: Ptr[GPathBuf]): GPathBuf_autoptr = o
  extension (v: GPathBuf_autoptr)
    inline def value: Ptr[GPathBuf] = v