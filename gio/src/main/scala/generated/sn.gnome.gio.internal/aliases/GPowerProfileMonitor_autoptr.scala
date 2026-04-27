package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GPowerProfileMonitor_autoptr = Ptr[GPowerProfileMonitor]
object GPowerProfileMonitor_autoptr:
  given _tag: Tag[GPowerProfileMonitor_autoptr] = Tag.Ptr[GPowerProfileMonitor](GPowerProfileMonitor._tag)
  inline def apply(inline o: Ptr[GPowerProfileMonitor]): GPowerProfileMonitor_autoptr = o
  extension (v: GPowerProfileMonitor_autoptr)
    inline def value: Ptr[GPowerProfileMonitor] = v