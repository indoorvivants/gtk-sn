package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkSettings_autoptr = Ptr[GtkSettings]
object GtkSettings_autoptr:
  given _tag: Tag[GtkSettings_autoptr] = Tag.Ptr[GtkSettings](GtkSettings._tag)
  inline def apply(inline o: Ptr[GtkSettings]): GtkSettings_autoptr = o
  extension (v: GtkSettings_autoptr)
    inline def value: Ptr[GtkSettings] = v