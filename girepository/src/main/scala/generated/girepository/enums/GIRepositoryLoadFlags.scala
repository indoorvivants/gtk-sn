package girepository

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GIRepositoryLoadFlags: _IREPOSITORY_LOAD_FLAG_LAZY: Lazily load the typelib.
*/
opaque type GIRepositoryLoadFlags = CUnsignedInt
object GIRepositoryLoadFlags extends _BindgenEnumCUnsignedInt[GIRepositoryLoadFlags]:
  given _tag: Tag[GIRepositoryLoadFlags] = Tag.UInt
  inline def define(inline a: Long): GIRepositoryLoadFlags = a.toUInt
  val G_IREPOSITORY_LOAD_FLAG_LAZY = define(1)
  def getName(value: GIRepositoryLoadFlags): Option[String] =
    value match
      case `G_IREPOSITORY_LOAD_FLAG_LAZY` => Some("G_IREPOSITORY_LOAD_FLAG_LAZY")
      case _ => _root_.scala.None
  extension (a: GIRepositoryLoadFlags)
    inline def &(b: GIRepositoryLoadFlags): GIRepositoryLoadFlags = a & b
    inline def |(b: GIRepositoryLoadFlags): GIRepositoryLoadFlags = a | b
    inline def is(b: GIRepositoryLoadFlags): Boolean = (a & b) == b