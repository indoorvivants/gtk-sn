package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkKeyMatch: _KEY_MATCH_NONE: The key event does not match _KEY_MATCH_PARTIAL: The key event matches if keyboard state (specifically, the currently active group) is ignored _KEY_MATCH_EXACT: The key event matches
*/
opaque type GdkKeyMatch = CUnsignedInt
object GdkKeyMatch extends _BindgenEnumCUnsignedInt[GdkKeyMatch]:
  given _tag: Tag[GdkKeyMatch] = Tag.UInt
  inline def define(inline a: Long): GdkKeyMatch = a.toUInt
  val GDK_KEY_MATCH_NONE = define(0)
  val GDK_KEY_MATCH_PARTIAL = define(1)
  val GDK_KEY_MATCH_EXACT = define(2)
  def getName(value: GdkKeyMatch): Option[String] =
    value match
      case `GDK_KEY_MATCH_NONE` => Some("GDK_KEY_MATCH_NONE")
      case `GDK_KEY_MATCH_PARTIAL` => Some("GDK_KEY_MATCH_PARTIAL")
      case `GDK_KEY_MATCH_EXACT` => Some("GDK_KEY_MATCH_EXACT")
      case _ => _root_.scala.None
  extension (a: GdkKeyMatch)
    inline def &(b: GdkKeyMatch): GdkKeyMatch = a & b
    inline def |(b: GdkKeyMatch): GdkKeyMatch = a | b
    inline def is(b: GdkKeyMatch): Boolean = (a & b) == b