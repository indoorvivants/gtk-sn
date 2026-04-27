package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GStrv = Ptr[Ptr[gchar]]
object GStrv:
  given _tag: Tag[GStrv] = Tag.Ptr[Ptr[gchar]](Tag.Ptr[gchar](gchar._tag))
  inline def apply(inline o: Ptr[Ptr[gchar]]): GStrv = o
  extension (v: GStrv)
    inline def value: Ptr[Ptr[gchar]] = v