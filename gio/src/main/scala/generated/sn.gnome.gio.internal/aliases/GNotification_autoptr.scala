package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GNotification_autoptr = Ptr[GNotification]
object GNotification_autoptr:
  given _tag: Tag[GNotification_autoptr] = Tag.Ptr[GNotification](GNotification._tag)
  inline def apply(inline o: Ptr[GNotification]): GNotification_autoptr = o
  extension (v: GNotification_autoptr)
    inline def value: Ptr[GNotification] = v