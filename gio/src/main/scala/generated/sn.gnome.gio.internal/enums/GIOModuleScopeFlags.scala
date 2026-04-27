package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GIOModuleScopeFlags: _IO_MODULE_SCOPE_NONE: No module scan flags _IO_MODULE_SCOPE_BLOCK_DUPLICATES: When using this scope to load or scan modules, automatically block a modules which has the same base basename as previously loaded module.
*/
opaque type GIOModuleScopeFlags = CUnsignedInt
object GIOModuleScopeFlags extends _BindgenEnumCUnsignedInt[GIOModuleScopeFlags]:
  given _tag: Tag[GIOModuleScopeFlags] = Tag.UInt
  inline def define(inline a: Long): GIOModuleScopeFlags = a.toUInt
  val G_IO_MODULE_SCOPE_NONE = define(0)
  val G_IO_MODULE_SCOPE_BLOCK_DUPLICATES = define(1)
  def getName(value: GIOModuleScopeFlags): Option[String] =
    value match
      case `G_IO_MODULE_SCOPE_NONE` => Some("G_IO_MODULE_SCOPE_NONE")
      case `G_IO_MODULE_SCOPE_BLOCK_DUPLICATES` => Some("G_IO_MODULE_SCOPE_BLOCK_DUPLICATES")
      case _ => _root_.scala.None
  extension (a: GIOModuleScopeFlags)
    inline def &(b: GIOModuleScopeFlags): GIOModuleScopeFlags = a & b
    inline def |(b: GIOModuleScopeFlags): GIOModuleScopeFlags = a | b
    inline def is(b: GIOModuleScopeFlags): Boolean = (a & b) == b