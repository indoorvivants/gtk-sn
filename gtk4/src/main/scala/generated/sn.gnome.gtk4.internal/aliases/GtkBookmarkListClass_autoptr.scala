package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkBookmarkListClass_autoptr = Ptr[GtkBookmarkListClass]
object GtkBookmarkListClass_autoptr:
  given _tag: Tag[GtkBookmarkListClass_autoptr] = Tag.Ptr[GtkBookmarkListClass](GtkBookmarkListClass._tag)
  inline def apply(inline o: Ptr[GtkBookmarkListClass]): GtkBookmarkListClass_autoptr = o
  extension (v: GtkBookmarkListClass_autoptr)
    inline def value: Ptr[GtkBookmarkListClass] = v