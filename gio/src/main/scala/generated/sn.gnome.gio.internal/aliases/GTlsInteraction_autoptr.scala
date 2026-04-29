package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTlsInteraction_autoptr = Ptr[GTlsInteraction]
object GTlsInteraction_autoptr:
  given _tag: Tag[GTlsInteraction_autoptr] = Tag.Ptr[GTlsInteraction](GTlsInteraction._tag)
  inline def apply(inline o: Ptr[GTlsInteraction]): GTlsInteraction_autoptr = o
  extension (v: GTlsInteraction_autoptr)
    inline def value: Ptr[GTlsInteraction] = v