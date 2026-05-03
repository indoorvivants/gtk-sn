package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_text_cluster_flags_t: _TEXT_CLUSTER_FLAG_BACKWARD: The clusters in the cluster array map to glyphs in the glyph array from end to start. (Since 1.8)
*/
type cairo_text_cluster_flags_t = _cairo_text_cluster_flags
object cairo_text_cluster_flags_t:
  inline def apply(inline o: _cairo_text_cluster_flags): cairo_text_cluster_flags_t = o
  export _cairo_text_cluster_flags.{apply => _, *, given}