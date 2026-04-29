package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSettingsBackend_autoptr = Ptr[GSettingsBackend]
object GSettingsBackend_autoptr:
  given _tag: Tag[GSettingsBackend_autoptr] = Tag.Ptr[GSettingsBackend](GSettingsBackend._tag)
  inline def apply(inline o: Ptr[GSettingsBackend]): GSettingsBackend_autoptr = o
  extension (v: GSettingsBackend_autoptr)
    inline def value: Ptr[GSettingsBackend] = v