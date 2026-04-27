package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkMnemonicActionClass_autoptr = Ptr[GtkMnemonicActionClass]
object GtkMnemonicActionClass_autoptr:
  given _tag: Tag[GtkMnemonicActionClass_autoptr] = Tag.Ptr[GtkMnemonicActionClass](GtkMnemonicActionClass._tag)
  inline def apply(inline o: Ptr[GtkMnemonicActionClass]): GtkMnemonicActionClass_autoptr = o
  extension (v: GtkMnemonicActionClass_autoptr)
    inline def value: Ptr[GtkMnemonicActionClass] = v