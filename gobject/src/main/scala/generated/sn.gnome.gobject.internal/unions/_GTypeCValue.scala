package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
opaque type _GTypeCValue = CArray[Byte, Nat._0]
object _GTypeCValue:
  given _tag: Tag[_GTypeCValue] = Tag.CArray[CChar, Nat._0](Tag.Byte, Tag.Nat0)