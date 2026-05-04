package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GSubprocessFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags to define the behaviour of a #GSubprocess.
  *
  * Note that the default for stdin is to redirect from `/dev/null`. For stdout
  * and stderr the default are for them to inherit the corresponding descriptor
  * from the calling process.
  *
  * Note that it is a programmer error to mix 'incompatible' flags. For example,
  * you may not request both %G_SUBPROCESS_FLAGS_STDOUT_PIPE and
  * %G_SUBPROCESS_FLAGS_STDOUT_SILENCE.
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags to define the behaviour of a #GSubprocess.
    *
    * Note that the default for stdin is to redirect from `/dev/null`. For
    * stdout and stderr the default are for them to inherit the corresponding
    * descriptor from the calling process.
    *
    * Note that it is a programmer error to mix 'incompatible' flags. For
    * example, you may not request both %G_SUBPROCESS_FLAGS_STDOUT_PIPE and
    * %G_SUBPROCESS_FLAGS_STDOUT_SILENCE.
    */
  enum KnownValue(override val raw: GSubprocessFlags, name: String)
      extends SubprocessFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags.
      */
    case NONE
        extends KnownValue(GSubprocessFlags.G_SUBPROCESS_FLAGS_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * create a pipe for the stdin of the spawned process that can be accessed
      * with g_subprocess_get_stdin_pipe().
      */
    case STDIN_PIPE
        extends KnownValue(
          GSubprocessFlags.G_SUBPROCESS_FLAGS_STDIN_PIPE,
          "STDIN_PIPE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * stdin is inherited from the calling process.
      */
    case STDIN_INHERIT
        extends KnownValue(
          GSubprocessFlags.G_SUBPROCESS_FLAGS_STDIN_INHERIT,
          "STDIN_INHERIT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * create a pipe for the stdout of the spawned process that can be accessed
      * with g_subprocess_get_stdout_pipe().
      */
    case STDOUT_PIPE
        extends KnownValue(
          GSubprocessFlags.G_SUBPROCESS_FLAGS_STDOUT_PIPE,
          "STDOUT_PIPE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * silence the stdout of the spawned process (ie: redirect to `/dev/null`).
      */
    case STDOUT_SILENCE
        extends KnownValue(
          GSubprocessFlags.G_SUBPROCESS_FLAGS_STDOUT_SILENCE,
          "STDOUT_SILENCE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * create a pipe for the stderr of the spawned process that can be accessed
      * with g_subprocess_get_stderr_pipe().
      */
    case STDERR_PIPE
        extends KnownValue(
          GSubprocessFlags.G_SUBPROCESS_FLAGS_STDERR_PIPE,
          "STDERR_PIPE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * silence the stderr of the spawned process (ie: redirect to `/dev/null`).
      */
    case STDERR_SILENCE
        extends KnownValue(
          GSubprocessFlags.G_SUBPROCESS_FLAGS_STDERR_SILENCE,
          "STDERR_SILENCE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * merge the stderr of the spawned process with whatever the stdout happens
      * to be. This is a good way of directing both streams to a common log
      * file, for example.
      */
    case STDERR_MERGE
        extends KnownValue(
          GSubprocessFlags.G_SUBPROCESS_FLAGS_STDERR_MERGE,
          "STDERR_MERGE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * spawned processes will inherit the file descriptors of their parent,
      * unless those descriptors have been explicitly marked as close-on-exec.
      * This flag has no effect over the "standard" file descriptors (stdin,
      * stdout, stderr).
      */
    case INHERIT_FDS
        extends KnownValue(
          GSubprocessFlags.G_SUBPROCESS_FLAGS_INHERIT_FDS,
          "INHERIT_FDS"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * if path searching is needed when spawning the subprocess, use the `PATH`
      * in the launcher environment. (Since: 2.72)
      */
    case SEARCH_PATH_FROM_ENVP
        extends KnownValue(
          GSubprocessFlags.G_SUBPROCESS_FLAGS_SEARCH_PATH_FROM_ENVP,
          "SEARCH_PATH_FROM_ENVP"
        )
  end KnownValue
end SubprocessFlags
