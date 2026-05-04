package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GSpawnFlags

/** Flags passed to g_spawn_sync(), g_spawn_async() and
  * g_spawn_async_with_pipes().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SpawnFlags private (val raw: GSpawnFlags):
  def is(kv: SpawnFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[SpawnFlags.KnownValue]
    SpawnFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"SpawnFlags(${sb.result().mkString(", ")})"
end SpawnFlags

object SpawnFlags:
  export KnownValue.*

  def fromRaw(raw: GSpawnFlags) = new SpawnFlags(raw)

  extension (af: SpawnFlags)
    def &(other: SpawnFlags) =
      SpawnFlags(af.raw & other.raw)
    def |(other: SpawnFlags) =
      SpawnFlags(af.raw | other.raw)

  /** Flags passed to g_spawn_sync(), g_spawn_async() and
    * g_spawn_async_with_pipes().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GSpawnFlags, name: String)
      extends SpawnFlags(raw):
    override def toString(): String = this.name

    /** no flags, default behaviour
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DEFAULT extends KnownValue(GSpawnFlags.G_SPAWN_DEFAULT, "DEFAULT")

    /** the parent's open file descriptors will be inherited by the child;
      * otherwise all descriptors except stdin, stdout and stderr will be closed
      * before calling exec() in the child.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case LEAVE_DESCRIPTORS_OPEN
        extends KnownValue(
          GSpawnFlags.G_SPAWN_LEAVE_DESCRIPTORS_OPEN,
          "LEAVE_DESCRIPTORS_OPEN"
        )

    /** the child will not be automatically reaped; you must use
      * g_child_watch_add() yourself (or call waitpid() or handle `SIGCHLD`
      * yourself), or the child will become a zombie.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DO_NOT_REAP_CHILD
        extends KnownValue(
          GSpawnFlags.G_SPAWN_DO_NOT_REAP_CHILD,
          "DO_NOT_REAP_CHILD"
        )

    /** `argv[0]` need not be an absolute path, it will be looked for in the
      * user's `PATH`.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SEARCH_PATH
        extends KnownValue(GSpawnFlags.G_SPAWN_SEARCH_PATH, "SEARCH_PATH")

    /** the child's standard output will be discarded, instead of going to the
      * same location as the parent's standard output.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case STDOUT_TO_DEV_NULL
        extends KnownValue(
          GSpawnFlags.G_SPAWN_STDOUT_TO_DEV_NULL,
          "STDOUT_TO_DEV_NULL"
        )

    /** the child's standard error will be discarded.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case STDERR_TO_DEV_NULL
        extends KnownValue(
          GSpawnFlags.G_SPAWN_STDERR_TO_DEV_NULL,
          "STDERR_TO_DEV_NULL"
        )

    /** the child will inherit the parent's standard input (by default, the
      * child's standard input is attached to `/dev/null`).
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CHILD_INHERITS_STDIN
        extends KnownValue(
          GSpawnFlags.G_SPAWN_CHILD_INHERITS_STDIN,
          "CHILD_INHERITS_STDIN"
        )

    /** the first element of `argv` is the file to execute, while the remaining
      * elements are the actual argument vector to pass to the file. Normally
      * g_spawn_async_with_pipes() uses `argv[0]` as the file to execute, and
      * passes all of `argv` to the child.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FILE_AND_ARGV_ZERO
        extends KnownValue(
          GSpawnFlags.G_SPAWN_FILE_AND_ARGV_ZERO,
          "FILE_AND_ARGV_ZERO"
        )

    /** if `argv[0]` is not an absolute path, it will be looked for in the
      * `PATH` from the passed child environment. Since: 2.34
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SEARCH_PATH_FROM_ENVP
        extends KnownValue(
          GSpawnFlags.G_SPAWN_SEARCH_PATH_FROM_ENVP,
          "SEARCH_PATH_FROM_ENVP"
        )

    /** create all pipes with the `O_CLOEXEC` flag set. Since: 2.40
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CLOEXEC_PIPES
        extends KnownValue(GSpawnFlags.G_SPAWN_CLOEXEC_PIPES, "CLOEXEC_PIPES")

    /** The child will inherit the parent's standard output.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CHILD_INHERITS_STDOUT
        extends KnownValue(
          GSpawnFlags.G_SPAWN_CHILD_INHERITS_STDOUT,
          "CHILD_INHERITS_STDOUT"
        )

    /** The child will inherit the parent's standard error.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CHILD_INHERITS_STDERR
        extends KnownValue(
          GSpawnFlags.G_SPAWN_CHILD_INHERITS_STDERR,
          "CHILD_INHERITS_STDERR"
        )

    /** The child's standard input is attached to `/dev/null`.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case STDIN_FROM_DEV_NULL
        extends KnownValue(
          GSpawnFlags.G_SPAWN_STDIN_FROM_DEV_NULL,
          "STDIN_FROM_DEV_NULL"
        )
  end KnownValue
end SpawnFlags
