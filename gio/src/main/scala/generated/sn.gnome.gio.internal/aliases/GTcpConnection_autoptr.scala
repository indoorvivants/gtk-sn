package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTcpConnection_autoptr = Ptr[GTcpConnection]
object GTcpConnection_autoptr:
  given _tag: Tag[GTcpConnection_autoptr] = Tag.Ptr[GTcpConnection](GTcpConnection._tag)
  inline def apply(inline o: Ptr[GTcpConnection]): GTcpConnection_autoptr = o
  extension (v: GTcpConnection_autoptr)
    inline def value: Ptr[GTcpConnection] = v