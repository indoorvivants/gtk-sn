package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_codepoint_t:
*/
type hb_codepoint_t = uint32_t
object hb_codepoint_t:
  inline def apply(inline o: uint32_t): hb_codepoint_t = o
  export uint32_t.{apply => _, *, given}