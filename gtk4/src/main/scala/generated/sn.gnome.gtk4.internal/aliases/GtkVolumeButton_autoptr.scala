package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkVolumeButton_autoptr = Ptr[GtkVolumeButton]
object GtkVolumeButton_autoptr:
  given _tag: Tag[GtkVolumeButton_autoptr] = Tag.Ptr[GtkVolumeButton](GtkVolumeButton._tag)
  inline def apply(inline o: Ptr[GtkVolumeButton]): GtkVolumeButton_autoptr = o
  extension (v: GtkVolumeButton_autoptr)
    inline def value: Ptr[GtkVolumeButton] = v