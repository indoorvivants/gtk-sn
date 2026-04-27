package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+1-0ab16a73-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

type tm = posix.time.tm
object tm:
  val _tag: Tag[tm] = summon[Tag[posix.time.tm]]
  inline def apply(inline o: posix.time.tm): tm = o
  extension (v: tm)
    inline def value: posix.time.tm = v