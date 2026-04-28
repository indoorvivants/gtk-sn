package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkLevelBarMode: _LEVEL_BAR_MODE_CONTINUOUS: the bar has a continuous mode _LEVEL_BAR_MODE_DISCRETE: the bar has a discrete mode
*/
opaque type GtkLevelBarMode = CUnsignedInt
object GtkLevelBarMode extends _BindgenEnumCUnsignedInt[GtkLevelBarMode]:
  given _tag: Tag[GtkLevelBarMode] = Tag.UInt
  inline def define(inline a: Long): GtkLevelBarMode = a.toUInt
  val GTK_LEVEL_BAR_MODE_CONTINUOUS = define(0)
  val GTK_LEVEL_BAR_MODE_DISCRETE = define(1)
  def getName(value: GtkLevelBarMode): Option[String] =
    value match
      case `GTK_LEVEL_BAR_MODE_CONTINUOUS` => Some("GTK_LEVEL_BAR_MODE_CONTINUOUS")
      case `GTK_LEVEL_BAR_MODE_DISCRETE` => Some("GTK_LEVEL_BAR_MODE_DISCRETE")
      case _ => _root_.scala.None
  extension (a: GtkLevelBarMode)
    inline def &(b: GtkLevelBarMode): GtkLevelBarMode = a & b
    inline def |(b: GtkLevelBarMode): GtkLevelBarMode = a | b
    inline def is(b: GtkLevelBarMode): Boolean = (a & b) == b