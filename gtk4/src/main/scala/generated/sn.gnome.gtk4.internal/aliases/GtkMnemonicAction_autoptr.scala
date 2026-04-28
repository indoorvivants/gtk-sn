package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkMnemonicAction_autoptr = Ptr[GtkMnemonicAction]
object GtkMnemonicAction_autoptr:
  given _tag: Tag[GtkMnemonicAction_autoptr] = Tag.Ptr[GtkMnemonicAction](GtkMnemonicAction._tag)
  inline def apply(inline o: Ptr[GtkMnemonicAction]): GtkMnemonicAction_autoptr = o
  extension (v: GtkMnemonicAction_autoptr)
    inline def value: Ptr[GtkMnemonicAction] = v