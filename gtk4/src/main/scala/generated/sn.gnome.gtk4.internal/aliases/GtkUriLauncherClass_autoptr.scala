package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkUriLauncherClass_autoptr = Ptr[GtkUriLauncherClass]
object GtkUriLauncherClass_autoptr:
  given _tag: Tag[GtkUriLauncherClass_autoptr] = Tag.Ptr[GtkUriLauncherClass](GtkUriLauncherClass._tag)
  inline def apply(inline o: Ptr[GtkUriLauncherClass]): GtkUriLauncherClass_autoptr = o
  extension (v: GtkUriLauncherClass_autoptr)
    inline def value: Ptr[GtkUriLauncherClass] = v