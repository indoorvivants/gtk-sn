package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-breakpoint.h
*/
opaque type AdwBreakpointCondition_autoptr = Ptr[AdwBreakpointCondition]
object AdwBreakpointCondition_autoptr:
  given _tag: Tag[AdwBreakpointCondition_autoptr] = Tag.Ptr[AdwBreakpointCondition](AdwBreakpointCondition._tag)
  inline def apply(inline o: Ptr[AdwBreakpointCondition]): AdwBreakpointCondition_autoptr = o
  extension (v: AdwBreakpointCondition_autoptr)
    inline def value: Ptr[AdwBreakpointCondition] = v