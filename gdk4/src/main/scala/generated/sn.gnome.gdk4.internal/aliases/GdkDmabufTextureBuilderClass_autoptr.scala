package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkDmabufTextureBuilderClass_autoptr = Ptr[GdkDmabufTextureBuilderClass]
object GdkDmabufTextureBuilderClass_autoptr:
  given _tag: Tag[GdkDmabufTextureBuilderClass_autoptr] = Tag.Ptr[GdkDmabufTextureBuilderClass](GdkDmabufTextureBuilderClass._tag)
  inline def apply(inline o: Ptr[GdkDmabufTextureBuilderClass]): GdkDmabufTextureBuilderClass_autoptr = o
  extension (v: GdkDmabufTextureBuilderClass_autoptr)
    inline def value: Ptr[GdkDmabufTextureBuilderClass] = v