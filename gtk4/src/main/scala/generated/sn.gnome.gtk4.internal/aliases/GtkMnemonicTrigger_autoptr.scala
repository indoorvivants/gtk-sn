package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkMnemonicTrigger_autoptr = Ptr[GtkMnemonicTrigger]
object GtkMnemonicTrigger_autoptr:
  given _tag: Tag[GtkMnemonicTrigger_autoptr] = Tag.Ptr[GtkMnemonicTrigger](GtkMnemonicTrigger._tag)
  inline def apply(inline o: Ptr[GtkMnemonicTrigger]): GtkMnemonicTrigger_autoptr = o
  extension (v: GtkMnemonicTrigger_autoptr)
    inline def value: Ptr[GtkMnemonicTrigger] = v