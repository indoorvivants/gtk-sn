package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSimplePermission_autoptr = Ptr[GSimplePermission]
object GSimplePermission_autoptr:
  given _tag: Tag[GSimplePermission_autoptr] = Tag.Ptr[GSimplePermission](GSimplePermission._tag)
  inline def apply(inline o: Ptr[GSimplePermission]): GSimplePermission_autoptr = o
  extension (v: GSimplePermission_autoptr)
    inline def value: Ptr[GSimplePermission] = v