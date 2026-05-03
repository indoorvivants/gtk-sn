package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GPollableInputStream_autoptr = Ptr[GPollableInputStream]
object GPollableInputStream_autoptr:
  given _tag: Tag[GPollableInputStream_autoptr] = Tag.Ptr[GPollableInputStream](GPollableInputStream._tag)
  inline def apply(inline o: Ptr[GPollableInputStream]): GPollableInputStream_autoptr = o
  extension (v: GPollableInputStream_autoptr)
    inline def value: Ptr[GPollableInputStream] = v