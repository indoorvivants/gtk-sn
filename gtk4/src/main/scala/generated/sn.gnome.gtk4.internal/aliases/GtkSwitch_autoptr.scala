package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkSwitch_autoptr = Ptr[GtkSwitch]
object GtkSwitch_autoptr:
  given _tag: Tag[GtkSwitch_autoptr] = Tag.Ptr[GtkSwitch](GtkSwitch._tag)
  inline def apply(inline o: Ptr[GtkSwitch]): GtkSwitch_autoptr = o
  extension (v: GtkSwitch_autoptr)
    inline def value: Ptr[GtkSwitch] = v