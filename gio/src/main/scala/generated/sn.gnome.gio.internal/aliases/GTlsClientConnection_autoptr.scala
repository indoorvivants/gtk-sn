package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTlsClientConnection_autoptr = Ptr[GTlsClientConnection]
object GTlsClientConnection_autoptr:
  given _tag: Tag[GTlsClientConnection_autoptr] = Tag.Ptr[GTlsClientConnection](GTlsClientConnection._tag)
  inline def apply(inline o: Ptr[GTlsClientConnection]): GTlsClientConnection_autoptr = o
  extension (v: GTlsClientConnection_autoptr)
    inline def value: Ptr[GTlsClientConnection] = v