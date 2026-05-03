package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSimpleProxyResolver_autoptr = Ptr[GSimpleProxyResolver]
object GSimpleProxyResolver_autoptr:
  given _tag: Tag[GSimpleProxyResolver_autoptr] = Tag.Ptr[GSimpleProxyResolver](GSimpleProxyResolver._tag)
  inline def apply(inline o: Ptr[GSimpleProxyResolver]): GSimpleProxyResolver_autoptr = o
  extension (v: GSimpleProxyResolver_autoptr)
    inline def value: Ptr[GSimpleProxyResolver] = v