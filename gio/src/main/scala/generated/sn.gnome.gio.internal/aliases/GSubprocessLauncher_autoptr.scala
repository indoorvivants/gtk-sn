package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSubprocessLauncher_autoptr = Ptr[GSubprocessLauncher]
object GSubprocessLauncher_autoptr:
  given _tag: Tag[GSubprocessLauncher_autoptr] = Tag.Ptr[GSubprocessLauncher](GSubprocessLauncher._tag)
  inline def apply(inline o: Ptr[GSubprocessLauncher]): GSubprocessLauncher_autoptr = o
  extension (v: GSubprocessLauncher_autoptr)
    inline def value: Ptr[GSubprocessLauncher] = v