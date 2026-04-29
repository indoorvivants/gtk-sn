package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GPollableReturn: _POLLABLE_RETURN_FAILED: Generic error condition for when an operation fails. _POLLABLE_RETURN_OK: The operation was successfully finished. _POLLABLE_RETURN_WOULD_BLOCK: The operation would block.
*/
opaque type GPollableReturn = CInt
object GPollableReturn extends _BindgenEnumCInt[GPollableReturn]:
  given _tag: Tag[GPollableReturn] = Tag.Int
  inline def define(inline a: CInt): GPollableReturn = a
  val G_POLLABLE_RETURN_FAILED = define(0)
  val G_POLLABLE_RETURN_OK = define(1)
  val G_POLLABLE_RETURN_WOULD_BLOCK = define(-27)
  def getName(value: GPollableReturn): Option[String] =
    value match
      case `G_POLLABLE_RETURN_FAILED` => Some("G_POLLABLE_RETURN_FAILED")
      case `G_POLLABLE_RETURN_OK` => Some("G_POLLABLE_RETURN_OK")
      case `G_POLLABLE_RETURN_WOULD_BLOCK` => Some("G_POLLABLE_RETURN_WOULD_BLOCK")
      case _ => _root_.scala.None
  extension (a: GPollableReturn)
    inline def &(b: GPollableReturn): GPollableReturn = a & b
    inline def |(b: GPollableReturn): GPollableReturn = a | b
    inline def is(b: GPollableReturn): Boolean = (a & b) == b