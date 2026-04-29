package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTlsDatabase_autoptr = Ptr[GTlsDatabase]
object GTlsDatabase_autoptr:
  given _tag: Tag[GTlsDatabase_autoptr] = Tag.Ptr[GTlsDatabase](GTlsDatabase._tag)
  inline def apply(inline o: Ptr[GTlsDatabase]): GTlsDatabase_autoptr = o
  extension (v: GTlsDatabase_autoptr)
    inline def value: Ptr[GTlsDatabase] = v