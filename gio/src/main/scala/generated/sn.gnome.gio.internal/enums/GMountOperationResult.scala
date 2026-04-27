package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GMountOperationResult: _MOUNT_OPERATION_HANDLED: The request was fulfilled and the user specified data is now available _MOUNT_OPERATION_ABORTED: The user requested the mount operation to be aborted _MOUNT_OPERATION_UNHANDLED: The request was unhandled (i.e. not implemented)
*/
opaque type GMountOperationResult = CUnsignedInt
object GMountOperationResult extends _BindgenEnumCUnsignedInt[GMountOperationResult]:
  given _tag: Tag[GMountOperationResult] = Tag.UInt
  inline def define(inline a: Long): GMountOperationResult = a.toUInt
  val G_MOUNT_OPERATION_HANDLED = define(0)
  val G_MOUNT_OPERATION_ABORTED = define(1)
  val G_MOUNT_OPERATION_UNHANDLED = define(2)
  def getName(value: GMountOperationResult): Option[String] =
    value match
      case `G_MOUNT_OPERATION_HANDLED` => Some("G_MOUNT_OPERATION_HANDLED")
      case `G_MOUNT_OPERATION_ABORTED` => Some("G_MOUNT_OPERATION_ABORTED")
      case `G_MOUNT_OPERATION_UNHANDLED` => Some("G_MOUNT_OPERATION_UNHANDLED")
      case _ => _root_.scala.None
  extension (a: GMountOperationResult)
    inline def &(b: GMountOperationResult): GMountOperationResult = a & b
    inline def |(b: GMountOperationResult): GMountOperationResult = a | b
    inline def is(b: GMountOperationResult): Boolean = (a & b) == b