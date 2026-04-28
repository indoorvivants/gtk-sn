package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkMnemonicTriggerClass_autoptr = Ptr[GtkMnemonicTriggerClass]
object GtkMnemonicTriggerClass_autoptr:
  given _tag: Tag[GtkMnemonicTriggerClass_autoptr] = Tag.Ptr[GtkMnemonicTriggerClass](GtkMnemonicTriggerClass._tag)
  inline def apply(inline o: Ptr[GtkMnemonicTriggerClass]): GtkMnemonicTriggerClass_autoptr = o
  extension (v: GtkMnemonicTriggerClass_autoptr)
    inline def value: Ptr[GtkMnemonicTriggerClass] = v