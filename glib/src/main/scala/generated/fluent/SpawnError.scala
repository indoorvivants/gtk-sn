package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GSpawnError

/** Error codes returned by spawning processes.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum SpawnError(val raw: GSpawnError):
  /** Fork failed due to lack of memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FORK extends SpawnError(GSpawnError.G_SPAWN_ERROR_FORK)

  /** Read or select on pipes failed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case READ extends SpawnError(GSpawnError.G_SPAWN_ERROR_READ)

  /** Changing to working directory failed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CHDIR extends SpawnError(GSpawnError.G_SPAWN_ERROR_CHDIR)

  /** execv() returned `EACCES`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ACCES extends SpawnError(GSpawnError.G_SPAWN_ERROR_ACCES)

  /** execv() returned `EPERM`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PERM extends SpawnError(GSpawnError.G_SPAWN_ERROR_PERM)

  /** execv() returned `E2BIG`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOO_BIG extends SpawnError(GSpawnError.G_SPAWN_ERROR_TOO_BIG)

  /** deprecated alias for %G_SPAWN_ERROR_TOO_BIG (deprecated since GLib 2.32)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case `2BIG` extends SpawnError(GSpawnError.G_SPAWN_ERROR_2BIG)

  /** execv() returned `ENOEXEC`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOEXEC extends SpawnError(GSpawnError.G_SPAWN_ERROR_NOEXEC)

  /** execv() returned `ENAMETOOLONG`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NAMETOOLONG extends SpawnError(GSpawnError.G_SPAWN_ERROR_NAMETOOLONG)

  /** execv() returned `ENOENT`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOENT extends SpawnError(GSpawnError.G_SPAWN_ERROR_NOENT)

  /** execv() returned `ENOMEM`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOMEM extends SpawnError(GSpawnError.G_SPAWN_ERROR_NOMEM)

  /** execv() returned `ENOTDIR`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOTDIR extends SpawnError(GSpawnError.G_SPAWN_ERROR_NOTDIR)

  /** execv() returned `ELOOP`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LOOP extends SpawnError(GSpawnError.G_SPAWN_ERROR_LOOP)

  /** execv() returned `ETXTBUSY`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TXTBUSY extends SpawnError(GSpawnError.G_SPAWN_ERROR_TXTBUSY)

  /** execv() returned `EIO`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case IO extends SpawnError(GSpawnError.G_SPAWN_ERROR_IO)

  /** execv() returned `ENFILE`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NFILE extends SpawnError(GSpawnError.G_SPAWN_ERROR_NFILE)

  /** execv() returned `EMFILE`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MFILE extends SpawnError(GSpawnError.G_SPAWN_ERROR_MFILE)

  /** execv() returned `EINVAL`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVAL extends SpawnError(GSpawnError.G_SPAWN_ERROR_INVAL)

  /** execv() returned `EISDIR`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ISDIR extends SpawnError(GSpawnError.G_SPAWN_ERROR_ISDIR)

  /** execv() returned `ELIBBAD`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LIBBAD extends SpawnError(GSpawnError.G_SPAWN_ERROR_LIBBAD)

  /** Some other fatal failure, `error->message` should explain.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
