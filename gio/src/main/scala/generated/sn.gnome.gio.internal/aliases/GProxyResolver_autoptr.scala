package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GProxyResolver_autoptr = Ptr[GProxyResolver]
object GProxyResolver_autoptr:
  given _tag: Tag[GProxyResolver_autoptr] = Tag.Ptr[GProxyResolver](GProxyResolver._tag)
  inline def apply(inline o: Ptr[GProxyResolver]): GProxyResolver_autoptr = o
  extension (v: GProxyResolver_autoptr)
    inline def value: Ptr[GProxyResolver] = v