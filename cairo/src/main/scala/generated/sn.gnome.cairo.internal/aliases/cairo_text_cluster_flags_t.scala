package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_text_cluster_flags_t: _TEXT_CLUSTER_FLAG_BACKWARD: The clusters in the cluster array map to glyphs in the glyph array from end to start. (Since 1.8)
*/
type cairo_text_cluster_flags_t = _cairo_text_cluster_flags
object cairo_text_cluster_flags_t:
  given _tag: Tag[cairo_text_cluster_flags_t] = _cairo_text_cluster_flags._tag
  inline def apply(inline o: _cairo_text_cluster_flags): cairo_text_cluster_flags_t = o
  extension (v: cairo_text_cluster_flags_t)
    inline def value: _cairo_text_cluster_flags = v