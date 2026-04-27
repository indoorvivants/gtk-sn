package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GFileError = CUnsignedInt
object GFileError extends _BindgenEnumCUnsignedInt[GFileError]:
  given _tag: Tag[GFileError] = Tag.UInt
  inline def define(inline a: Long): GFileError = a.toUInt
  val G_FILE_ERROR_EXIST = define(0)
  val G_FILE_ERROR_ISDIR = define(1)
  val G_FILE_ERROR_ACCES = define(2)
  val G_FILE_ERROR_NAMETOOLONG = define(3)
  val G_FILE_ERROR_NOENT = define(4)
  val G_FILE_ERROR_NOTDIR = define(5)
  val G_FILE_ERROR_NXIO = define(6)
  val G_FILE_ERROR_NODEV = define(7)
  val G_FILE_ERROR_ROFS = define(8)
  val G_FILE_ERROR_TXTBSY = define(9)
  val G_FILE_ERROR_FAULT = define(10)
  val G_FILE_ERROR_LOOP = define(11)
  val G_FILE_ERROR_NOSPC = define(12)
  val G_FILE_ERROR_NOMEM = define(13)
  val G_FILE_ERROR_MFILE = define(14)
  val G_FILE_ERROR_NFILE = define(15)
  val G_FILE_ERROR_BADF = define(16)
  val G_FILE_ERROR_INVAL = define(17)
  val G_FILE_ERROR_PIPE = define(18)
  val G_FILE_ERROR_AGAIN = define(19)
  val G_FILE_ERROR_INTR = define(20)
  val G_FILE_ERROR_IO = define(21)
  val G_FILE_ERROR_PERM = define(22)
  val G_FILE_ERROR_NOSYS = define(23)
  val G_FILE_ERROR_FAILED = define(24)
  def getName(value: GFileError): Option[String] =
    value match
      case `G_FILE_ERROR_EXIST` => Some("G_FILE_ERROR_EXIST")
      case `G_FILE_ERROR_ISDIR` => Some("G_FILE_ERROR_ISDIR")
      case `G_FILE_ERROR_ACCES` => Some("G_FILE_ERROR_ACCES")
      case `G_FILE_ERROR_NAMETOOLONG` => Some("G_FILE_ERROR_NAMETOOLONG")
      case `G_FILE_ERROR_NOENT` => Some("G_FILE_ERROR_NOENT")
      case `G_FILE_ERROR_NOTDIR` => Some("G_FILE_ERROR_NOTDIR")
      case `G_FILE_ERROR_NXIO` => Some("G_FILE_ERROR_NXIO")
      case `G_FILE_ERROR_NODEV` => Some("G_FILE_ERROR_NODEV")
      case `G_FILE_ERROR_ROFS` => Some("G_FILE_ERROR_ROFS")
      case `G_FILE_ERROR_TXTBSY` => Some("G_FILE_ERROR_TXTBSY")
      case `G_FILE_ERROR_FAULT` => Some("G_FILE_ERROR_FAULT")
      case `G_FILE_ERROR_LOOP` => Some("G_FILE_ERROR_LOOP")
      case `G_FILE_ERROR_NOSPC` => Some("G_FILE_ERROR_NOSPC")
      case `G_FILE_ERROR_NOMEM` => Some("G_FILE_ERROR_NOMEM")
      case `G_FILE_ERROR_MFILE` => Some("G_FILE_ERROR_MFILE")
      case `G_FILE_ERROR_NFILE` => Some("G_FILE_ERROR_NFILE")
      case `G_FILE_ERROR_BADF` => Some("G_FILE_ERROR_BADF")
      case `G_FILE_ERROR_INVAL` => Some("G_FILE_ERROR_INVAL")
      case `G_FILE_ERROR_PIPE` => Some("G_FILE_ERROR_PIPE")
      case `G_FILE_ERROR_AGAIN` => Some("G_FILE_ERROR_AGAIN")
      case `G_FILE_ERROR_INTR` => Some("G_FILE_ERROR_INTR")
      case `G_FILE_ERROR_IO` => Some("G_FILE_ERROR_IO")
      case `G_FILE_ERROR_PERM` => Some("G_FILE_ERROR_PERM")
      case `G_FILE_ERROR_NOSYS` => Some("G_FILE_ERROR_NOSYS")
      case `G_FILE_ERROR_FAILED` => Some("G_FILE_ERROR_FAILED")
      case _ => _root_.scala.None
  extension (a: GFileError)
    inline def &(b: GFileError): GFileError = a & b
    inline def |(b: GFileError): GFileError = a | b
    inline def is(b: GFileError): Boolean = (a & b) == b