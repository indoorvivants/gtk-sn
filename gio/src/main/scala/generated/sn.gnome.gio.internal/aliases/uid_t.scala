package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

type uid_t = posix.sys.types.uid_t
object uid_t:
  val _tag: Tag[uid_t] = summon[Tag[posix.sys.types.uid_t]]
  inline def apply(inline o: posix.sys.types.uid_t): uid_t = o
  extension (v: uid_t)
    inline def value: posix.sys.types.uid_t = v