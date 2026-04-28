package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkMonitor_autoptr = Ptr[GdkMonitor]
object GdkMonitor_autoptr:
  given _tag: Tag[GdkMonitor_autoptr] = Tag.Ptr[GdkMonitor](GdkMonitor._tag)
  inline def apply(inline o: Ptr[GdkMonitor]): GdkMonitor_autoptr = o
  extension (v: GdkMonitor_autoptr)
    inline def value: Ptr[GdkMonitor] = v