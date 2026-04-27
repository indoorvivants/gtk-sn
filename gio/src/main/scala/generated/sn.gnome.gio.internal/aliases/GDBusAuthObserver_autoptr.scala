package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDBusAuthObserver_autoptr = Ptr[GDBusAuthObserver]
object GDBusAuthObserver_autoptr:
  given _tag: Tag[GDBusAuthObserver_autoptr] = Tag.Ptr[GDBusAuthObserver](GDBusAuthObserver._tag)
  inline def apply(inline o: Ptr[GDBusAuthObserver]): GDBusAuthObserver_autoptr = o
  extension (v: GDBusAuthObserver_autoptr)
    inline def value: Ptr[GDBusAuthObserver] = v