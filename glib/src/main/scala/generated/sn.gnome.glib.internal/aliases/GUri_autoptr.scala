package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GUri_autoptr = Ptr[GUri]
object GUri_autoptr:
  given _tag: Tag[GUri_autoptr] = Tag.Ptr[GUri](GUri._tag)
  inline def apply(inline o: Ptr[GUri]): GUri_autoptr = o
  extension (v: GUri_autoptr)
    inline def value: Ptr[GUri] = v