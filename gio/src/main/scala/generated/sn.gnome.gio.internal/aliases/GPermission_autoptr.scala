package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GPermission_autoptr = Ptr[GPermission]
object GPermission_autoptr:
  given _tag: Tag[GPermission_autoptr] = Tag.Ptr[GPermission](GPermission._tag)
  inline def apply(inline o: Ptr[GPermission]): GPermission_autoptr = o
  extension (v: GPermission_autoptr)
    inline def value: Ptr[GPermission] = v