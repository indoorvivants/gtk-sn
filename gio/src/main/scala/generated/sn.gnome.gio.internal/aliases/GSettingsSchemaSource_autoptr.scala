package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSettingsSchemaSource_autoptr = Ptr[GSettingsSchemaSource]
object GSettingsSchemaSource_autoptr:
  given _tag: Tag[GSettingsSchemaSource_autoptr] = Tag.Ptr[GSettingsSchemaSource](GSettingsSchemaSource._tag)
  inline def apply(inline o: Ptr[GSettingsSchemaSource]): GSettingsSchemaSource_autoptr = o
  extension (v: GSettingsSchemaSource_autoptr)
    inline def value: Ptr[GSettingsSchemaSource] = v