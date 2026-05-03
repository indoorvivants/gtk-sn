package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

private[internal] trait _BindgenEnumCInt[T](using eq: T =:= CInt):
  given Tag[T] = Tag.Int.asInstanceOf[Tag[T]]
  extension (inline t: T)
    inline def value: CInt = t.asInstanceOf[CInt]
    inline def int: CInt = value.toInt