package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFileLauncherClass_autoptr = Ptr[GtkFileLauncherClass]
object GtkFileLauncherClass_autoptr:
  given _tag: Tag[GtkFileLauncherClass_autoptr] = Tag.Ptr[GtkFileLauncherClass](GtkFileLauncherClass._tag)
  inline def apply(inline o: Ptr[GtkFileLauncherClass]): GtkFileLauncherClass_autoptr = o
  extension (v: GtkFileLauncherClass_autoptr)
    inline def value: Ptr[GtkFileLauncherClass] = v