package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMappedFile_autoptr = Ptr[GMappedFile]
object GMappedFile_autoptr:
  given _tag: Tag[GMappedFile_autoptr] = Tag.Ptr[GMappedFile](GMappedFile._tag)
  inline def apply(inline o: Ptr[GMappedFile]): GMappedFile_autoptr = o
  extension (v: GMappedFile_autoptr)
    inline def value: Ptr[GMappedFile] = v