package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GSubprocessFlags

/** Flags to define the behaviour of a #GSubprocess.
  *
  * Note that the default for stdin is to redirect from `/dev/null`. For stdout
  * and stderr the default are for them to inherit the corresponding descriptor
  * from the calling process.
  *
  * Note that it is a programmer error to mix 'incompatible' flags. For example,
  * you may not request both %G_SUBPROCESS_FLAGS_STDOUT_PIPE and
  * %G_SUBPROCESS_FLAGS_STDOUT_SILENCE.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SubprocessFlags private (val raw: GSubprocessFlags):
  def is(kv: SubprocessFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[SubprocessFlags.KnownValue]
    SubprocessFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"SubprocessFlags(${sb.result().mkString(", ")})"
end SubprocessFlags

object SubprocessFlags:
  export KnownValue.*

  def fromRaw(raw: GSubprocessFlags) = new SubprocessFlags(raw)

  extension (af: SubprocessFlags)
    def &(other: SubprocessFlags) =
      SubprocessFlags(af.raw & other.raw)
    def |(other: SubprocessFlags) =
      SubprocessFlags(af.raw | other.raw)

  /** Flags to define the behaviour of a #GSubprocess.
    *
    * Note that the default for stdin is to redirect from `/dev/null`. For
    * stdout and stderr the default are for them to inherit the corresponding
    * descriptor from the calling process.
    *
    * Note that it is a programmer error to mix 'incompatible' flags. For
    * example, you may not request both %G_SUBPROCESS_FLAGS_STDOUT_PIPE and
    * %G_SUBPROCESS_FLAGS_STDOUT_SILENCE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GSubprocessFlags, name: String)
      extends SubprocessFlags(raw):
    override def toString(): String = this.name

    /** No flags.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(GSubprocessFlags.G_SUBPROCESS_FLAGS_NONE, "NONE")

    /** create a pipe for the stdin of the spawned process that can be accessed
      * with g_subprocess_get_stdin_pipe().
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case STDIN_PIPE
        extends KnownValue(
          GSubprocessFlags.G_SUBPROCESS_FLAGS_STDIN_PIPE,
          "STDIN_PIPE"
        )

    /** stdin is inherited from the calling process.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case STDIN_INHERIT
        extends KnownValue(
          GSubprocessFlags.G_SUBPROCESS_FLAGS_STDIN_INHERIT,
          "STDIN_INHERIT"
        )

    /** create a pipe for the stdout of the spawned process that can be accessed
      * with g_subprocess_get_stdout_pipe().
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case STDOUT_PIPE
        extends KnownValue(
          GSubprocessFlags.G_SUBPROCESS_FLAGS_STDOUT_PIPE,
          "STDOUT_PIPE"
        )

    /** silence the stdout of the spawned process (ie: redirect to `/dev/null`).
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case STDOUT_SILENCE
        extends KnownValue(
          GSubprocessFlags.G_SUBPROCESS_FLAGS_STDOUT_SILENCE,
          "STDOUT_SILENCE"
        )

    /** create a pipe for the stderr of the spawned process that can be accessed
      * with g_subprocess_get_stderr_pipe().
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case STDERR_PIPE
        extends KnownValue(
          GSubprocessFlags.G_SUBPROCESS_FLAGS_STDERR_PIPE,
          "STDERR_PIPE"
        )

    /** silence the stderr of the spawned process (ie: redirect to `/dev/null`).
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case STDERR_SILENCE
        extends KnownValue(
          GSubprocessFlags.G_SUBPROCESS_FLAGS_STDERR_SILENCE,
          "STDERR_SILENCE"
        )

    /** merge the stderr of the spawned process with whatever the stdout happens
      * to be. This is a good way of directing both streams to a common log
      * file, for example.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case STDERR_MERGE
        extends KnownValue(
          GSubprocessFlags.G_SUBPROCESS_FLAGS_STDERR_MERGE,
          "STDERR_MERGE"
        )

    /** spawned processes will inherit the file descriptors of their parent,
      * unless those descriptors have been explicitly marked as close-on-exec.
      * This flag has no effect over the "standard" file descriptors (stdin,
      * stdout, stderr).
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case INHERIT_FDS
        extends KnownValue(
          GSubprocessFlags.G_SUBPROCESS_FLAGS_INHERIT_FDS,
          "INHERIT_FDS"
        )

    /** if path searching is needed when spawning the subprocess, use the `PATH`
      * in the launcher environment. (Since: 2.72)
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SEARCH_PATH_FROM_ENVP
        extends KnownValue(
          GSubprocessFlags.G_SUBPROCESS_FLAGS_SEARCH_PATH_FROM_ENVP,
          "SEARCH_PATH_FROM_ENVP"
        )
  end KnownValue
end SubprocessFlags
