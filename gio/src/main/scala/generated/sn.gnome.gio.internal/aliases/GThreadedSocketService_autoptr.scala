package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GThreadedSocketService_autoptr = Ptr[GThreadedSocketService]
object GThreadedSocketService_autoptr:
  given _tag: Tag[GThreadedSocketService_autoptr] = Tag.Ptr[GThreadedSocketService](GThreadedSocketService._tag)
  inline def apply(inline o: Ptr[GThreadedSocketService]): GThreadedSocketService_autoptr = o
  extension (v: GThreadedSocketService_autoptr)
    inline def value: Ptr[GThreadedSocketService] = v