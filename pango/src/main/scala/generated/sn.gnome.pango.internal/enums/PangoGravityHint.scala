package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoGravityHint: _GRAVITY_HINT_NATURAL: scripts will take their natural gravity based on the base gravity and the script. This is the default. _GRAVITY_HINT_STRONG: always use the base gravity set, regardless of the script. _GRAVITY_HINT_LINE: for scripts not in their natural direction (eg. Latin in East gravity), choose per-script gravity such that every script respects the line progression. This means, Latin and Arabic will take opposite gravities and both flow top-to-bottom for example.
*/
opaque type PangoGravityHint = CUnsignedInt
object PangoGravityHint extends _BindgenEnumCUnsignedInt[PangoGravityHint]:
  given _tag: Tag[PangoGravityHint] = Tag.UInt
  inline def define(inline a: Long): PangoGravityHint = a.toUInt
  val PANGO_GRAVITY_HINT_NATURAL = define(0)
  val PANGO_GRAVITY_HINT_STRONG = define(1)
  val PANGO_GRAVITY_HINT_LINE = define(2)
  def getName(value: PangoGravityHint): Option[String] =
    value match
      case `PANGO_GRAVITY_HINT_NATURAL` => Some("PANGO_GRAVITY_HINT_NATURAL")
      case `PANGO_GRAVITY_HINT_STRONG` => Some("PANGO_GRAVITY_HINT_STRONG")
      case `PANGO_GRAVITY_HINT_LINE` => Some("PANGO_GRAVITY_HINT_LINE")
      case _ => _root_.scala.None
  extension (a: PangoGravityHint)
    inline def &(b: PangoGravityHint): PangoGravityHint = a & b
    inline def |(b: PangoGravityHint): PangoGravityHint = a | b
    inline def is(b: PangoGravityHint): Boolean = (a & b) == b