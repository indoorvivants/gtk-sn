package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkDisplayManager_autoptr = Ptr[GdkDisplayManager]
object GdkDisplayManager_autoptr:
  given _tag: Tag[GdkDisplayManager_autoptr] = Tag.Ptr[GdkDisplayManager](GdkDisplayManager._tag)
  inline def apply(inline o: Ptr[GdkDisplayManager]): GdkDisplayManager_autoptr = o
  extension (v: GdkDisplayManager_autoptr)
    inline def value: Ptr[GdkDisplayManager] = v