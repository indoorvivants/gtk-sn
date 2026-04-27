package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_language_t:
*/
opaque type hb_language_t = Ptr[hb_language_impl_t]
object hb_language_t:
  given _tag: Tag[hb_language_t] = Tag.Ptr[hb_language_impl_t](hb_language_impl_t._tag)
  inline def apply(inline o: Ptr[hb_language_impl_t]): hb_language_t = o
  extension (v: hb_language_t)
    inline def value: Ptr[hb_language_impl_t] = v