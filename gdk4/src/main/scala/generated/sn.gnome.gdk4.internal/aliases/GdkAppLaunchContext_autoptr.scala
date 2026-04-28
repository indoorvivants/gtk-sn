package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkAppLaunchContext_autoptr = Ptr[GdkAppLaunchContext]
object GdkAppLaunchContext_autoptr:
  given _tag: Tag[GdkAppLaunchContext_autoptr] = Tag.Ptr[GdkAppLaunchContext](GdkAppLaunchContext._tag)
  inline def apply(inline o: Ptr[GdkAppLaunchContext]): GdkAppLaunchContext_autoptr = o
  extension (v: GdkAppLaunchContext_autoptr)
    inline def value: Ptr[GdkAppLaunchContext] = v