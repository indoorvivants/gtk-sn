package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTlsBackend_autoptr = Ptr[GTlsBackend]
object GTlsBackend_autoptr:
  given _tag: Tag[GTlsBackend_autoptr] = Tag.Ptr[GTlsBackend](GTlsBackend._tag)
  inline def apply(inline o: Ptr[GTlsBackend]): GTlsBackend_autoptr = o
  extension (v: GTlsBackend_autoptr)
    inline def value: Ptr[GTlsBackend] = v