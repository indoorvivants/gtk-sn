package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTlsInteractionResult: _TLS_INTERACTION_UNHANDLED: The interaction was unhandled (i.e. not implemented). _TLS_INTERACTION_HANDLED: The interaction completed, and resulting data is available. _TLS_INTERACTION_FAILED: The interaction has failed, or was cancelled. and the operation should be aborted.
*/
opaque type GTlsInteractionResult = CUnsignedInt
object GTlsInteractionResult extends _BindgenEnumCUnsignedInt[GTlsInteractionResult]:
  given _tag: Tag[GTlsInteractionResult] = Tag.UInt
  inline def define(inline a: Long): GTlsInteractionResult = a.toUInt
  val G_TLS_INTERACTION_UNHANDLED = define(0)
  val G_TLS_INTERACTION_HANDLED = define(1)
  val G_TLS_INTERACTION_FAILED = define(2)
  def getName(value: GTlsInteractionResult): Option[String] =
    value match
      case `G_TLS_INTERACTION_UNHANDLED` => Some("G_TLS_INTERACTION_UNHANDLED")
      case `G_TLS_INTERACTION_HANDLED` => Some("G_TLS_INTERACTION_HANDLED")
      case `G_TLS_INTERACTION_FAILED` => Some("G_TLS_INTERACTION_FAILED")
      case _ => _root_.scala.None
  extension (a: GTlsInteractionResult)
    inline def &(b: GTlsInteractionResult): GTlsInteractionResult = a & b
    inline def |(b: GTlsInteractionResult): GTlsInteractionResult = a | b
    inline def is(b: GTlsInteractionResult): Boolean = (a & b) == b