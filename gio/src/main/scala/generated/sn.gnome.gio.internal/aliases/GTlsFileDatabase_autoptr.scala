package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTlsFileDatabase_autoptr = Ptr[GTlsFileDatabase]
object GTlsFileDatabase_autoptr:
  given _tag: Tag[GTlsFileDatabase_autoptr] = Tag.Ptr[GTlsFileDatabase](GTlsFileDatabase._tag)
  inline def apply(inline o: Ptr[GTlsFileDatabase]): GTlsFileDatabase_autoptr = o
  extension (v: GTlsFileDatabase_autoptr)
    inline def value: Ptr[GTlsFileDatabase] = v