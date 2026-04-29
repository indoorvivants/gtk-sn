package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSettings_autoptr = Ptr[GSettings]
object GSettings_autoptr:
  given _tag: Tag[GSettings_autoptr] = Tag.Ptr[GSettings](GSettings._tag)
  inline def apply(inline o: Ptr[GSettings]): GSettings_autoptr = o
  extension (v: GSettings_autoptr)
    inline def value: Ptr[GSettings] = v