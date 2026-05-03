package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-breakpoint-bin.h
*/
opaque type AdwBreakpointBin_autoptr = Ptr[AdwBreakpointBin]
object AdwBreakpointBin_autoptr:
  given _tag: Tag[AdwBreakpointBin_autoptr] = Tag.Ptr[AdwBreakpointBin](AdwBreakpointBin._tag)
  inline def apply(inline o: Ptr[AdwBreakpointBin]): AdwBreakpointBin_autoptr = o
  extension (v: AdwBreakpointBin_autoptr)
    inline def value: Ptr[AdwBreakpointBin] = v