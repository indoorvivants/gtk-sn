package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GRemoteActionGroup_autoptr = Ptr[GRemoteActionGroup]
object GRemoteActionGroup_autoptr:
  given _tag: Tag[GRemoteActionGroup_autoptr] = Tag.Ptr[GRemoteActionGroup](GRemoteActionGroup._tag)
  inline def apply(inline o: Ptr[GRemoteActionGroup]): GRemoteActionGroup_autoptr = o
  extension (v: GRemoteActionGroup_autoptr)
    inline def value: Ptr[GRemoteActionGroup] = v