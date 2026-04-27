package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_region_overlap_t: _REGION_OVERLAP_IN: The contents are entirely inside the region. (Since 1.10) _REGION_OVERLAP_OUT: The contents are entirely outside the region. (Since 1.10) _REGION_OVERLAP_PART: The contents are partially inside and partially outside the region. (Since 1.10)
*/
type cairo_region_overlap_t = _cairo_region_overlap
object cairo_region_overlap_t:
  given _tag: Tag[cairo_region_overlap_t] = _cairo_region_overlap._tag
  inline def apply(inline o: _cairo_region_overlap): cairo_region_overlap_t = o
  extension (v: cairo_region_overlap_t)
    inline def value: _cairo_region_overlap = v