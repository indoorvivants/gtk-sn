package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_position_t:
*/
type hb_position_t = int32_t
object hb_position_t:
  inline def apply(inline o: int32_t): hb_position_t = o
  export int32_t.{apply => _, *, given}