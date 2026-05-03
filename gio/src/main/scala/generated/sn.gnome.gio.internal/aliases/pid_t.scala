package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

type pid_t = posix.sys.types.pid_t
object pid_t:
  val _tag: Tag[pid_t] = summon[Tag[posix.sys.types.pid_t]]
  inline def apply(inline o: posix.sys.types.pid_t): pid_t = o
  extension (v: pid_t)
    inline def value: posix.sys.types.pid_t = v