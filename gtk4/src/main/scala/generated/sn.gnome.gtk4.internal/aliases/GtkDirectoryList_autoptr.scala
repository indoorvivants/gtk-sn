package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkDirectoryList_autoptr = Ptr[GtkDirectoryList]
object GtkDirectoryList_autoptr:
  given _tag: Tag[GtkDirectoryList_autoptr] = Tag.Ptr[GtkDirectoryList](GtkDirectoryList._tag)
  inline def apply(inline o: Ptr[GtkDirectoryList]): GtkDirectoryList_autoptr = o
  extension (v: GtkDirectoryList_autoptr)
    inline def value: Ptr[GtkDirectoryList] = v