package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSpawnError: _SPAWN_ERROR_FORK: Fork failed due to lack of memory. _SPAWN_ERROR_READ: Read or select on pipes failed. _SPAWN_ERROR_CHDIR: Changing to working directory failed. _SPAWN_ERROR_ACCES: execv() returned `EACCES` _SPAWN_ERROR_PERM: execv() returned `EPERM` _SPAWN_ERROR_TOO_BIG: execv() returned `E2BIG` _SPAWN_ERROR_2BIG: deprecated alias for %G_SPAWN_ERROR_TOO_BIG (deprecated since GLib 2.32) _SPAWN_ERROR_NOEXEC: execv() returned `ENOEXEC` _SPAWN_ERROR_NAMETOOLONG: execv() returned `ENAMETOOLONG` _SPAWN_ERROR_NOENT: execv() returned `ENOENT` _SPAWN_ERROR_NOMEM: execv() returned `ENOMEM` _SPAWN_ERROR_NOTDIR: execv() returned `ENOTDIR` _SPAWN_ERROR_LOOP: execv() returned `ELOOP` _SPAWN_ERROR_TXTBUSY: execv() returned `ETXTBUSY` _SPAWN_ERROR_IO: execv() returned `EIO` _SPAWN_ERROR_NFILE: execv() returned `ENFILE` _SPAWN_ERROR_MFILE: execv() returned `EMFILE` _SPAWN_ERROR_INVAL: execv() returned `EINVAL` _SPAWN_ERROR_ISDIR: execv() returned `EISDIR` _SPAWN_ERROR_LIBBAD: execv() returned `ELIBBAD` _SPAWN_ERROR_FAILED: Some other fatal failure, `error->message` should explain.
*/
opaque type GSpawnError = CUnsignedInt
object GSpawnError extends _BindgenEnumCUnsignedInt[GSpawnError]:
  given _tag: Tag[GSpawnError] = Tag.UInt
  inline def define(inline a: Long): GSpawnError = a.toUInt
  val G_SPAWN_ERROR_FORK = define(0)
  val G_SPAWN_ERROR_READ = define(1)
  val G_SPAWN_ERROR_CHDIR = define(2)
  val G_SPAWN_ERROR_ACCES = define(3)
  val G_SPAWN_ERROR_PERM = define(4)
  val G_SPAWN_ERROR_TOO_BIG = define(5)
  val G_SPAWN_ERROR_2BIG = define(5)
  val G_SPAWN_ERROR_NOEXEC = define(6)
  val G_SPAWN_ERROR_NAMETOOLONG = define(7)
  val G_SPAWN_ERROR_NOENT = define(8)
  val G_SPAWN_ERROR_NOMEM = define(9)
  val G_SPAWN_ERROR_NOTDIR = define(10)
  val G_SPAWN_ERROR_LOOP = define(11)
  val G_SPAWN_ERROR_TXTBUSY = define(12)
  val G_SPAWN_ERROR_IO = define(13)
  val G_SPAWN_ERROR_NFILE = define(14)
  val G_SPAWN_ERROR_MFILE = define(15)
  val G_SPAWN_ERROR_INVAL = define(16)
  val G_SPAWN_ERROR_ISDIR = define(17)
  val G_SPAWN_ERROR_LIBBAD = define(18)
  val G_SPAWN_ERROR_FAILED = define(19)
  def getName(value: GSpawnError): Option[String] =
    value match
      case `G_SPAWN_ERROR_FORK` => Some("G_SPAWN_ERROR_FORK")
      case `G_SPAWN_ERROR_READ` => Some("G_SPAWN_ERROR_READ")
      case `G_SPAWN_ERROR_CHDIR` => Some("G_SPAWN_ERROR_CHDIR")
      case `G_SPAWN_ERROR_ACCES` => Some("G_SPAWN_ERROR_ACCES")
      case `G_SPAWN_ERROR_PERM` => Some("G_SPAWN_ERROR_PERM")
      case `G_SPAWN_ERROR_TOO_BIG` => Some("G_SPAWN_ERROR_TOO_BIG")
      case `G_SPAWN_ERROR_2BIG` => Some("G_SPAWN_ERROR_2BIG")
      case `G_SPAWN_ERROR_NOEXEC` => Some("G_SPAWN_ERROR_NOEXEC")
      case `G_SPAWN_ERROR_NAMETOOLONG` => Some("G_SPAWN_ERROR_NAMETOOLONG")
      case `G_SPAWN_ERROR_NOENT` => Some("G_SPAWN_ERROR_NOENT")
      case `G_SPAWN_ERROR_NOMEM` => Some("G_SPAWN_ERROR_NOMEM")
      case `G_SPAWN_ERROR_NOTDIR` => Some("G_SPAWN_ERROR_NOTDIR")
      case `G_SPAWN_ERROR_LOOP` => Some("G_SPAWN_ERROR_LOOP")
      case `G_SPAWN_ERROR_TXTBUSY` => Some("G_SPAWN_ERROR_TXTBUSY")
      case `G_SPAWN_ERROR_IO` => Some("G_SPAWN_ERROR_IO")
      case `G_SPAWN_ERROR_NFILE` => Some("G_SPAWN_ERROR_NFILE")
      case `G_SPAWN_ERROR_MFILE` => Some("G_SPAWN_ERROR_MFILE")
      case `G_SPAWN_ERROR_INVAL` => Some("G_SPAWN_ERROR_INVAL")
      case `G_SPAWN_ERROR_ISDIR` => Some("G_SPAWN_ERROR_ISDIR")
      case `G_SPAWN_ERROR_LIBBAD` => Some("G_SPAWN_ERROR_LIBBAD")
      case `G_SPAWN_ERROR_FAILED` => Some("G_SPAWN_ERROR_FAILED")
      case _ => _root_.scala.None
  extension (a: GSpawnError)
    inline def &(b: GSpawnError): GSpawnError = a & b
    inline def |(b: GSpawnError): GSpawnError = a | b
    inline def is(b: GSpawnError): Boolean = (a & b) == b