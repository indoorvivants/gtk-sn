package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSubprocessFlags: _SUBPROCESS_FLAGS_NONE: No flags. _SUBPROCESS_FLAGS_STDIN_PIPE: create a pipe for the stdin of the spawned process that can be accessed with g_subprocess_get_stdin_pipe(). _SUBPROCESS_FLAGS_STDIN_INHERIT: stdin is inherited from the calling process. _SUBPROCESS_FLAGS_STDOUT_PIPE: create a pipe for the stdout of the spawned process that can be accessed with g_subprocess_get_stdout_pipe(). _SUBPROCESS_FLAGS_STDOUT_SILENCE: silence the stdout of the spawned process (ie: redirect to `/dev/null`). _SUBPROCESS_FLAGS_STDERR_PIPE: create a pipe for the stderr of the spawned process that can be accessed with g_subprocess_get_stderr_pipe(). _SUBPROCESS_FLAGS_STDERR_SILENCE: silence the stderr of the spawned process (ie: redirect to `/dev/null`). _SUBPROCESS_FLAGS_STDERR_MERGE: merge the stderr of the spawned process with whatever the stdout happens to be. This is a good way of directing both streams to a common log file, for example. _SUBPROCESS_FLAGS_INHERIT_FDS: spawned processes will inherit the file descriptors of their parent, unless those descriptors have been explicitly marked as close-on-exec. This flag has no effect over the "standard" file descriptors (stdin, stdout, stderr). _SUBPROCESS_FLAGS_SEARCH_PATH_FROM_ENVP: if path searching is needed when spawning the subprocess, use the `PATH` in the launcher environment. (Since: 2.72)
*/
opaque type GSubprocessFlags = CUnsignedInt
object GSubprocessFlags extends _BindgenEnumCUnsignedInt[GSubprocessFlags]:
  given _tag: Tag[GSubprocessFlags] = Tag.UInt
  inline def define(inline a: Long): GSubprocessFlags = a.toUInt
  val G_SUBPROCESS_FLAGS_NONE = define(0)
  val G_SUBPROCESS_FLAGS_STDIN_PIPE = define(1)
  val G_SUBPROCESS_FLAGS_STDIN_INHERIT = define(2)
  val G_SUBPROCESS_FLAGS_STDOUT_PIPE = define(4)
  val G_SUBPROCESS_FLAGS_STDOUT_SILENCE = define(8)
  val G_SUBPROCESS_FLAGS_STDERR_PIPE = define(16)
  val G_SUBPROCESS_FLAGS_STDERR_SILENCE = define(32)
  val G_SUBPROCESS_FLAGS_STDERR_MERGE = define(64)
  val G_SUBPROCESS_FLAGS_INHERIT_FDS = define(128)
  val G_SUBPROCESS_FLAGS_SEARCH_PATH_FROM_ENVP = define(256)
  def getName(value: GSubprocessFlags): Option[String] =
    value match
      case `G_SUBPROCESS_FLAGS_NONE` => Some("G_SUBPROCESS_FLAGS_NONE")
      case `G_SUBPROCESS_FLAGS_STDIN_PIPE` => Some("G_SUBPROCESS_FLAGS_STDIN_PIPE")
      case `G_SUBPROCESS_FLAGS_STDIN_INHERIT` => Some("G_SUBPROCESS_FLAGS_STDIN_INHERIT")
      case `G_SUBPROCESS_FLAGS_STDOUT_PIPE` => Some("G_SUBPROCESS_FLAGS_STDOUT_PIPE")
      case `G_SUBPROCESS_FLAGS_STDOUT_SILENCE` => Some("G_SUBPROCESS_FLAGS_STDOUT_SILENCE")
      case `G_SUBPROCESS_FLAGS_STDERR_PIPE` => Some("G_SUBPROCESS_FLAGS_STDERR_PIPE")
      case `G_SUBPROCESS_FLAGS_STDERR_SILENCE` => Some("G_SUBPROCESS_FLAGS_STDERR_SILENCE")
      case `G_SUBPROCESS_FLAGS_STDERR_MERGE` => Some("G_SUBPROCESS_FLAGS_STDERR_MERGE")
      case `G_SUBPROCESS_FLAGS_INHERIT_FDS` => Some("G_SUBPROCESS_FLAGS_INHERIT_FDS")
      case `G_SUBPROCESS_FLAGS_SEARCH_PATH_FROM_ENVP` => Some("G_SUBPROCESS_FLAGS_SEARCH_PATH_FROM_ENVP")
      case _ => _root_.scala.None
  extension (a: GSubprocessFlags)
    inline def &(b: GSubprocessFlags): GSubprocessFlags = a & b
    inline def |(b: GSubprocessFlags): GSubprocessFlags = a | b
    inline def is(b: GSubprocessFlags): Boolean = (a & b) == b