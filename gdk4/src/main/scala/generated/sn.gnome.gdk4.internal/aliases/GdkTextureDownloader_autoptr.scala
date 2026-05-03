package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkTextureDownloader_autoptr = Ptr[GdkTextureDownloader]
object GdkTextureDownloader_autoptr:
  given _tag: Tag[GdkTextureDownloader_autoptr] = Tag.Ptr[GdkTextureDownloader](GdkTextureDownloader._tag)
  inline def apply(inline o: Ptr[GdkTextureDownloader]): GdkTextureDownloader_autoptr = o
  extension (v: GdkTextureDownloader_autoptr)
    inline def value: Ptr[GdkTextureDownloader] = v