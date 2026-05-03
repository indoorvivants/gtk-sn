package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkDmabufTexture_autoptr = Ptr[GdkDmabufTexture]
object GdkDmabufTexture_autoptr:
  given _tag: Tag[GdkDmabufTexture_autoptr] = Tag.Ptr[GdkDmabufTexture](GdkDmabufTexture._tag)
  inline def apply(inline o: Ptr[GdkDmabufTexture]): GdkDmabufTexture_autoptr = o
  extension (v: GdkDmabufTexture_autoptr)
    inline def value: Ptr[GdkDmabufTexture] = v