package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GUnixCredentialsMessage_autoptr = Ptr[GUnixCredentialsMessage]
object GUnixCredentialsMessage_autoptr:
  given _tag: Tag[GUnixCredentialsMessage_autoptr] = Tag.Ptr[GUnixCredentialsMessage](GUnixCredentialsMessage._tag)
  inline def apply(inline o: Ptr[GUnixCredentialsMessage]): GUnixCredentialsMessage_autoptr = o
  extension (v: GUnixCredentialsMessage_autoptr)
    inline def value: Ptr[GUnixCredentialsMessage] = v