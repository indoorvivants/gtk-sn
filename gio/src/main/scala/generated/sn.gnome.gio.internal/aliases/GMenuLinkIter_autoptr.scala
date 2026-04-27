package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMenuLinkIter_autoptr = Ptr[GMenuLinkIter]
object GMenuLinkIter_autoptr:
  given _tag: Tag[GMenuLinkIter_autoptr] = Tag.Ptr[GMenuLinkIter](GMenuLinkIter._tag)
  inline def apply(inline o: Ptr[GMenuLinkIter]): GMenuLinkIter_autoptr = o
  extension (v: GMenuLinkIter_autoptr)
    inline def value: Ptr[GMenuLinkIter] = v