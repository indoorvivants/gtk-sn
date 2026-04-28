package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkRecentManager_autoptr = Ptr[GtkRecentManager]
object GtkRecentManager_autoptr:
  given _tag: Tag[GtkRecentManager_autoptr] = Tag.Ptr[GtkRecentManager](GtkRecentManager._tag)
  inline def apply(inline o: Ptr[GtkRecentManager]): GtkRecentManager_autoptr = o
  extension (v: GtkRecentManager_autoptr)
    inline def value: Ptr[GtkRecentManager] = v