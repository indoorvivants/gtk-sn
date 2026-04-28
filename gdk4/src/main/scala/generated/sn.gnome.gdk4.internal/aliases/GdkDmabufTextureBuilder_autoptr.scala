package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkDmabufTextureBuilder_autoptr = Ptr[GdkDmabufTextureBuilder]
object GdkDmabufTextureBuilder_autoptr:
  given _tag: Tag[GdkDmabufTextureBuilder_autoptr] = Tag.Ptr[GdkDmabufTextureBuilder](GdkDmabufTextureBuilder._tag)
  inline def apply(inline o: Ptr[GdkDmabufTextureBuilder]): GdkDmabufTextureBuilder_autoptr = o
  extension (v: GdkDmabufTextureBuilder_autoptr)
    inline def value: Ptr[GdkDmabufTextureBuilder] = v