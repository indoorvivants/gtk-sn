package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_buffer_cluster_level_t: _BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES: Return cluster values grouped by graphemes into monotone order. _BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS: Return cluster values grouped into monotone order. _BUFFER_CLUSTER_LEVEL_CHARACTERS: Don't group cluster values. _BUFFER_CLUSTER_LEVEL_DEFAULT: Default cluster level, equal to _BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES.
*/
opaque type hb_buffer_cluster_level_t = CUnsignedInt
object hb_buffer_cluster_level_t extends _BindgenEnumCUnsignedInt[hb_buffer_cluster_level_t]:
  given _tag: Tag[hb_buffer_cluster_level_t] = Tag.UInt
  inline def define(inline a: Long): hb_buffer_cluster_level_t = a.toUInt
  val HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES = define(0)
  val HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS = define(1)
  val HB_BUFFER_CLUSTER_LEVEL_CHARACTERS = define(2)
  val HB_BUFFER_CLUSTER_LEVEL_DEFAULT = define(0)
  def getName(value: hb_buffer_cluster_level_t): Option[String] =
    value match
      case `HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES` => Some("HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES")
      case `HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS` => Some("HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS")
      case `HB_BUFFER_CLUSTER_LEVEL_CHARACTERS` => Some("HB_BUFFER_CLUSTER_LEVEL_CHARACTERS")
      case `HB_BUFFER_CLUSTER_LEVEL_DEFAULT` => Some("HB_BUFFER_CLUSTER_LEVEL_DEFAULT")
      case _ => _root_.scala.None
  extension (a: hb_buffer_cluster_level_t)
    inline def &(b: hb_buffer_cluster_level_t): hb_buffer_cluster_level_t = a & b
    inline def |(b: hb_buffer_cluster_level_t): hb_buffer_cluster_level_t = a | b
    inline def is(b: hb_buffer_cluster_level_t): Boolean = (a & b) == b