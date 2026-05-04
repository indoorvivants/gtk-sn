package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GSpawnFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags passed to g_spawn_sync(), g_spawn_async() and
  * g_spawn_async_with_pipes().
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags passed to g_spawn_sync(), g_spawn_async() and
    * g_spawn_async_with_pipes().
    */
  enum KnownValue(override val raw: GSpawnFlags, name: String)
      extends SpawnFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * no flags, default behaviour
      */
    case DEFAULT extends KnownValue(GSpawnFlags.G_SPAWN_DEFAULT, "DEFAULT")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the parent's open file descriptors will be inherited by the child;
      * otherwise all descriptors except stdin, stdout and stderr will be closed
      * before calling exec() in the child.
      */
    case LEAVE_DESCRIPTORS_OPEN
        extends KnownValue(
          GSpawnFlags.G_SPAWN_LEAVE_DESCRIPTORS_OPEN,
          "LEAVE_DESCRIPTORS_OPEN"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the child will not be automatically reaped; you must use
      * g_child_watch_add() yourself (or call waitpid() or handle `SIGCHLD`
      * yourself), or the child will become a zombie.
      */
    case DO_NOT_REAP_CHILD
        extends KnownValue(
          GSpawnFlags.G_SPAWN_DO_NOT_REAP_CHILD,
          "DO_NOT_REAP_CHILD"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * `argv[0]` need not be an absolute path, it will be looked for in the
      * user's `PATH`.
      */
    case SEARCH_PATH
        extends KnownValue(GSpawnFlags.G_SPAWN_SEARCH_PATH, "SEARCH_PATH")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the child's standard output will be discarded, instead of going to the
      * same location as the parent's standard output.
      */
    case STDOUT_TO_DEV_NULL
        extends KnownValue(
          GSpawnFlags.G_SPAWN_STDOUT_TO_DEV_NULL,
          "STDOUT_TO_DEV_NULL"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the child's standard error will be discarded.
      */
    case STDERR_TO_DEV_NULL
        extends KnownValue(
          GSpawnFlags.G_SPAWN_STDERR_TO_DEV_NULL,
          "STDERR_TO_DEV_NULL"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the child will inherit the parent's standard input (by default, the
      * child's standard input is attached to `/dev/null`).
      */
    case CHILD_INHERITS_STDIN
        extends KnownValue(
          GSpawnFlags.G_SPAWN_CHILD_INHERITS_STDIN,
          "CHILD_INHERITS_STDIN"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the first element of `argv` is the file to execute, while the remaining
      * elements are the actual argument vector to pass to the file. Normally
      * g_spawn_async_with_pipes() uses `argv[0]` as the file to execute, and
      * passes all of `argv` to the child.
      */
    case FILE_AND_ARGV_ZERO
        extends KnownValue(
          GSpawnFlags.G_SPAWN_FILE_AND_ARGV_ZERO,
          "FILE_AND_ARGV_ZERO"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * if `argv[0]` is not an absolute path, it will be looked for in the
      * `PATH` from the passed child environment. Since: 2.34
      */
    case SEARCH_PATH_FROM_ENVP
        extends KnownValue(
          GSpawnFlags.G_SPAWN_SEARCH_PATH_FROM_ENVP,
          "SEARCH_PATH_FROM_ENVP"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * create all pipes with the `O_CLOEXEC` flag set. Since: 2.40
      */
    case CLOEXEC_PIPES
        extends KnownValue(GSpawnFlags.G_SPAWN_CLOEXEC_PIPES, "CLOEXEC_PIPES")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The child will inherit the parent's standard output.
      */
    case CHILD_INHERITS_STDOUT
        extends KnownValue(
          GSpawnFlags.G_SPAWN_CHILD_INHERITS_STDOUT,
          "CHILD_INHERITS_STDOUT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The child will inherit the parent's standard error.
      */
    case CHILD_INHERITS_STDERR
        extends KnownValue(
          GSpawnFlags.G_SPAWN_CHILD_INHERITS_STDERR,
          "CHILD_INHERITS_STDERR"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The child's standard input is attached to `/dev/null`.
      */
    case STDIN_FROM_DEV_NULL
        extends KnownValue(
          GSpawnFlags.G_SPAWN_STDIN_FROM_DEV_NULL,
          "STDIN_FROM_DEV_NULL"
        )
  end KnownValue
end SpawnFlags
