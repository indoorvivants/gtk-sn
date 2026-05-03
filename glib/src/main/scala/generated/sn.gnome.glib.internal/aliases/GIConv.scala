package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GIConv: (skip)
*/
opaque type GIConv = Ptr[_GIConv]
object GIConv:
  given _tag: Tag[GIConv] = Tag.Ptr[_GIConv](_GIConv._tag)
  inline def apply(inline o: Ptr[_GIConv]): GIConv = o
  extension (v: GIConv)
    inline def value: Ptr[_GIConv] = v