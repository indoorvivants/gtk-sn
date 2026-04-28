package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkPasswordEntryBufferClass_autoptr = Ptr[GtkPasswordEntryBufferClass]
object GtkPasswordEntryBufferClass_autoptr:
  given _tag: Tag[GtkPasswordEntryBufferClass_autoptr] = Tag.Ptr[GtkPasswordEntryBufferClass](GtkPasswordEntryBufferClass._tag)
  inline def apply(inline o: Ptr[GtkPasswordEntryBufferClass]): GtkPasswordEntryBufferClass_autoptr = o
  extension (v: GtkPasswordEntryBufferClass_autoptr)
    inline def value: Ptr[GtkPasswordEntryBufferClass] = v