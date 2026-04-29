package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GAppLaunchContext_autoptr = Ptr[GAppLaunchContext]
object GAppLaunchContext_autoptr:
  given _tag: Tag[GAppLaunchContext_autoptr] = Tag.Ptr[GAppLaunchContext](GAppLaunchContext._tag)
  inline def apply(inline o: Ptr[GAppLaunchContext]): GAppLaunchContext_autoptr = o
  extension (v: GAppLaunchContext_autoptr)
    inline def value: Ptr[GAppLaunchContext] = v