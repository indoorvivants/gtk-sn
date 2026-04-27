package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMappedFile_slistautoptr = Ptr[GSList]
object GMappedFile_slistautoptr:
  given _tag: Tag[GMappedFile_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GMappedFile_slistautoptr = o
  extension (v: GMappedFile_slistautoptr)
    inline def value: Ptr[GSList] = v