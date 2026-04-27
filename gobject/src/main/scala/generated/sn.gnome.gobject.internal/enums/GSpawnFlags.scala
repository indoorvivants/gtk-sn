package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSpawnFlags: _SPAWN_DEFAULT: no flags, default behaviour _SPAWN_LEAVE_DESCRIPTORS_OPEN: the parent's open file descriptors will be inherited by the child; otherwise all descriptors except stdin, stdout and stderr will be closed before calling exec() in the child. _SPAWN_DO_NOT_REAP_CHILD: the child will not be automatically reaped; you must use g_child_watch_add() yourself (or call waitpid() or handle `SIGCHLD` yourself), or the child will become a zombie. _SPAWN_SEARCH_PATH: `argv[0]` need not be an absolute path, it will be looked for in the user's `PATH`. _SPAWN_STDOUT_TO_DEV_NULL: the child's standard output will be discarded, instead of going to the same location as the parent's standard output. _SPAWN_STDERR_TO_DEV_NULL: the child's standard error will be discarded. _SPAWN_CHILD_INHERITS_STDIN: the child will inherit the parent's standard input (by default, the child's standard input is attached to `/dev/null`). _SPAWN_FILE_AND_ARGV_ZERO: the first element of `argv` is the file to execute, while the remaining elements are the actual argument vector to pass to the file. Normally g_spawn_async_with_pipes() uses `argv[0]` as the file to execute, and passes all of `argv` to the child. _SPAWN_SEARCH_PATH_FROM_ENVP: if `argv[0]` is not an absolute path, it will be looked for in the `PATH` from the passed child environment. Since: 2.34 _SPAWN_CLOEXEC_PIPES: create all pipes with the `O_CLOEXEC` flag set. Since: 2.40 _SPAWN_CHILD_INHERITS_STDOUT: the child will inherit the parent's standard output. Since: 2.74 _SPAWN_CHILD_INHERITS_STDERR: the child will inherit the parent's standard error. Since: 2.74 _SPAWN_STDIN_FROM_DEV_NULL: the child's standard input is attached to `/dev/null`. Since: 2.74
*/
opaque type GSpawnFlags = CUnsignedInt
object GSpawnFlags extends _BindgenEnumCUnsignedInt[GSpawnFlags]:
  given _tag: Tag[GSpawnFlags] = Tag.UInt
  inline def define(inline a: Long): GSpawnFlags = a.toUInt
  val G_SPAWN_DEFAULT = define(0)
  val G_SPAWN_LEAVE_DESCRIPTORS_OPEN = define(1)
  val G_SPAWN_DO_NOT_REAP_CHILD = define(2)
  val G_SPAWN_SEARCH_PATH = define(4)
  val G_SPAWN_STDOUT_TO_DEV_NULL = define(8)
  val G_SPAWN_STDERR_TO_DEV_NULL = define(16)
  val G_SPAWN_CHILD_INHERITS_STDIN = define(32)
  val G_SPAWN_FILE_AND_ARGV_ZERO = define(64)
  val G_SPAWN_SEARCH_PATH_FROM_ENVP = define(128)
  val G_SPAWN_CLOEXEC_PIPES = define(256)
  val G_SPAWN_CHILD_INHERITS_STDOUT = define(512)
  val G_SPAWN_CHILD_INHERITS_STDERR = define(1024)
  val G_SPAWN_STDIN_FROM_DEV_NULL = define(2048)
  def getName(value: GSpawnFlags): Option[String] =
    value match
      case `G_SPAWN_DEFAULT` => Some("G_SPAWN_DEFAULT")
      case `G_SPAWN_LEAVE_DESCRIPTORS_OPEN` => Some("G_SPAWN_LEAVE_DESCRIPTORS_OPEN")
      case `G_SPAWN_DO_NOT_REAP_CHILD` => Some("G_SPAWN_DO_NOT_REAP_CHILD")
      case `G_SPAWN_SEARCH_PATH` => Some("G_SPAWN_SEARCH_PATH")
      case `G_SPAWN_STDOUT_TO_DEV_NULL` => Some("G_SPAWN_STDOUT_TO_DEV_NULL")
      case `G_SPAWN_STDERR_TO_DEV_NULL` => Some("G_SPAWN_STDERR_TO_DEV_NULL")
      case `G_SPAWN_CHILD_INHERITS_STDIN` => Some("G_SPAWN_CHILD_INHERITS_STDIN")
      case `G_SPAWN_FILE_AND_ARGV_ZERO` => Some("G_SPAWN_FILE_AND_ARGV_ZERO")
      case `G_SPAWN_SEARCH_PATH_FROM_ENVP` => Some("G_SPAWN_SEARCH_PATH_FROM_ENVP")
      case `G_SPAWN_CLOEXEC_PIPES` => Some("G_SPAWN_CLOEXEC_PIPES")
      case `G_SPAWN_CHILD_INHERITS_STDOUT` => Some("G_SPAWN_CHILD_INHERITS_STDOUT")
      case `G_SPAWN_CHILD_INHERITS_STDERR` => Some("G_SPAWN_CHILD_INHERITS_STDERR")
      case `G_SPAWN_STDIN_FROM_DEV_NULL` => Some("G_SPAWN_STDIN_FROM_DEV_NULL")
      case _ => _root_.scala.None
  extension (a: GSpawnFlags)
    inline def &(b: GSpawnFlags): GSpawnFlags = a & b
    inline def |(b: GSpawnFlags): GSpawnFlags = a | b
    inline def is(b: GSpawnFlags): Boolean = (a & b) == b