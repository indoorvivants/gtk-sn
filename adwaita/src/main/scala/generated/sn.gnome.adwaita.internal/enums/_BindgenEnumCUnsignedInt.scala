package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

private[internal] trait _BindgenEnumCUnsignedInt[T](using eq: T =:= CUnsignedInt):
  given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
  extension (inline t: T)
    inline def value: CUnsignedInt = t.asInstanceOf[CUnsignedInt]
    inline def int: CInt = value.toInt
    inline def uint: CUnsignedInt = value