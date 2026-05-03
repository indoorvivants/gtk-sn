package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkDirectoryListClass_autoptr = Ptr[GtkDirectoryListClass]
object GtkDirectoryListClass_autoptr:
  given _tag: Tag[GtkDirectoryListClass_autoptr] = Tag.Ptr[GtkDirectoryListClass](GtkDirectoryListClass._tag)
  inline def apply(inline o: Ptr[GtkDirectoryListClass]): GtkDirectoryListClass_autoptr = o
  extension (v: GtkDirectoryListClass_autoptr)
    inline def value: Ptr[GtkDirectoryListClass] = v