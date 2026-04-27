package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTlsPassword_autoptr = Ptr[GTlsPassword]
object GTlsPassword_autoptr:
  given _tag: Tag[GTlsPassword_autoptr] = Tag.Ptr[GTlsPassword](GTlsPassword._tag)
  inline def apply(inline o: Ptr[GTlsPassword]): GTlsPassword_autoptr = o
  extension (v: GTlsPassword_autoptr)
    inline def value: Ptr[GTlsPassword] = v