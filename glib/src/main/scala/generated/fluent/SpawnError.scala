package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GSpawnError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Error codes returned by spawning processes.
  */
enum SpawnError(val raw: GSpawnError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fork failed due to lack of memory.
    */
  case FORK extends SpawnError(GSpawnError.G_SPAWN_ERROR_FORK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Read or select on pipes failed.
    */
  case READ extends SpawnError(GSpawnError.G_SPAWN_ERROR_READ)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Changing to working directory failed.
    */
  case CHDIR extends SpawnError(GSpawnError.G_SPAWN_ERROR_CHDIR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * execv() returned `EACCES`
    */
  case ACCES extends SpawnError(GSpawnError.G_SPAWN_ERROR_ACCES)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * execv() returned `EPERM`
    */
  case PERM extends SpawnError(GSpawnError.G_SPAWN_ERROR_PERM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * execv() returned `E2BIG`
    */
  case TOO_BIG extends SpawnError(GSpawnError.G_SPAWN_ERROR_TOO_BIG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * deprecated alias for %G_SPAWN_ERROR_TOO_BIG (deprecated since GLib 2.32)
    */
  case `2BIG` extends SpawnError(GSpawnError.G_SPAWN_ERROR_2BIG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * execv() returned `ENOEXEC`
    */
  case NOEXEC extends SpawnError(GSpawnError.G_SPAWN_ERROR_NOEXEC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * execv() returned `ENAMETOOLONG`
    */
  case NAMETOOLONG extends SpawnError(GSpawnError.G_SPAWN_ERROR_NAMETOOLONG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * execv() returned `ENOENT`
    */
  case NOENT extends SpawnError(GSpawnError.G_SPAWN_ERROR_NOENT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * execv() returned `ENOMEM`
    */
  case NOMEM extends SpawnError(GSpawnError.G_SPAWN_ERROR_NOMEM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * execv() returned `ENOTDIR`
    */
  case NOTDIR extends SpawnError(GSpawnError.G_SPAWN_ERROR_NOTDIR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * execv() returned `ELOOP`
    */
  case LOOP extends SpawnError(GSpawnError.G_SPAWN_ERROR_LOOP)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * execv() returned `ETXTBUSY`
    */
  case TXTBUSY extends SpawnError(GSpawnError.G_SPAWN_ERROR_TXTBUSY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * execv() returned `EIO`
    */
  case IO extends SpawnError(GSpawnError.G_SPAWN_ERROR_IO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * execv() returned `ENFILE`
    */
  case NFILE extends SpawnError(GSpawnError.G_SPAWN_ERROR_NFILE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * execv() returned `EMFILE`
    */
  case MFILE extends SpawnError(GSpawnError.G_SPAWN_ERROR_MFILE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * execv() returned `EINVAL`
    */
  case INVAL extends SpawnError(GSpawnError.G_SPAWN_ERROR_INVAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * execv() returned `EISDIR`
    */
  case ISDIR extends SpawnError(GSpawnError.G_SPAWN_ERROR_ISDIR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * execv() returned `ELIBBAD`
    */
  case LIBBAD extends SpawnError(GSpawnError.G_SPAWN_ERROR_LIBBAD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Some other fatal failure, `error->message` should explain.
    */
  case FAILED extends SpawnError(GSpawnError.G_SPAWN_ERROR_FAILED)
end SpawnError

object SpawnError:
  def fromRaw(raw: GSpawnError): SpawnError =
    raw match
      case GSpawnError.G_SPAWN_ERROR_FORK        => SpawnError.FORK
      case GSpawnError.G_SPAWN_ERROR_READ        => SpawnError.READ
      case GSpawnError.G_SPAWN_ERROR_CHDIR       => SpawnError.CHDIR
      case GSpawnError.G_SPAWN_ERROR_ACCES       => SpawnError.ACCES
      case GSpawnError.G_SPAWN_ERROR_PERM        => SpawnError.PERM
      case GSpawnError.G_SPAWN_ERROR_TOO_BIG     => SpawnError.TOO_BIG
      case GSpawnError.G_SPAWN_ERROR_2BIG        => SpawnError.`2BIG`
      case GSpawnError.G_SPAWN_ERROR_NOEXEC      => SpawnError.NOEXEC
      case GSpawnError.G_SPAWN_ERROR_NAMETOOLONG => SpawnError.NAMETOOLONG
      case GSpawnError.G_SPAWN_ERROR_NOENT       => SpawnError.NOENT
      case GSpawnError.G_SPAWN_ERROR_NOMEM       => SpawnError.NOMEM
      case GSpawnError.G_SPAWN_ERROR_NOTDIR      => SpawnError.NOTDIR
      case GSpawnError.G_SPAWN_ERROR_LOOP        => SpawnError.LOOP
      case GSpawnError.G_SPAWN_ERROR_TXTBUSY     => SpawnError.TXTBUSY
      case GSpawnError.G_SPAWN_ERROR_IO          => SpawnError.IO
      case GSpawnError.G_SPAWN_ERROR_NFILE       => SpawnError.NFILE
      case GSpawnError.G_SPAWN_ERROR_MFILE       => SpawnError.MFILE
      case GSpawnError.G_SPAWN_ERROR_INVAL       => SpawnError.INVAL
      case GSpawnError.G_SPAWN_ERROR_ISDIR       => SpawnError.ISDIR
      case GSpawnError.G_SPAWN_ERROR_LIBBAD      => SpawnError.LIBBAD
      case GSpawnError.G_SPAWN_ERROR_FAILED      => SpawnError.FAILED
  end fromRaw
end SpawnError
