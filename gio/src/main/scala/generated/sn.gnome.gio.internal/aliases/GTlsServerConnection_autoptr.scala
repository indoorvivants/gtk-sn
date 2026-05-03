package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTlsServerConnection_autoptr = Ptr[GTlsServerConnection]
object GTlsServerConnection_autoptr:
  given _tag: Tag[GTlsServerConnection_autoptr] = Tag.Ptr[GTlsServerConnection](GTlsServerConnection._tag)
  inline def apply(inline o: Ptr[GTlsServerConnection]): GTlsServerConnection_autoptr = o
  extension (v: GTlsServerConnection_autoptr)
    inline def value: Ptr[GTlsServerConnection] = v