package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.SubprocessFlags
import sn.gnome.gio.internal.GSubprocessLauncher
import sn.gnome.glib.internal.{gboolean, gchar, gint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*

/** This class contains a set of options for launching child processes, such as
  * where its standard input and output will be directed, the argument list, the
  * environment, and more.
  *
  * While the #GSubprocess class has high level functions covering popular
  * cases, use of this class allows access to more advanced options. It can also
  * be used to launch multiple subprocesses with a similar configuration.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SubprocessLauncher private[gnome] (raw: Ptr[GSubprocessLauncher])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Closes all the file descriptors previously passed to the object with
    * g_subprocess_launcher_take_fd(), g_subprocess_launcher_take_stderr_fd(),
    * etc.
    *
    * After calling this method, any subsequent calls to
    * g_subprocess_launcher_spawn() or g_subprocess_launcher_spawnv() will
    * return %G_IO_ERROR_CLOSED. This method is idempotent if called more than
    * once.
    *
    * This function is called automatically when the #GSubprocessLauncher is
    * disposed, but is provided separately so that garbage collected language
    * bindings can call it earlier to guarantee when FDs are closed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def close(): Unit /* None */ =
    g_subprocess_launcher_close(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocessLauncher]]
    )
  end close

  /** Returns the value of the environment variable @variable in the environment
    * of processes launched from this launcher.
    *
    * On UNIX, the returned string can be an arbitrary byte string. On Windows,
    * it will be UTF-8.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getenv(
      variable: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): String /* None */ =
    fromCString(
      g_subprocess_launcher_getenv(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocessLauncher]],
        toCString(variable).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )
  end getenv

  /** Sets up a child setup function.
    *
    * The child setup function will be called after fork() but before exec() on
    * the child's side.
    *
    * @destroy_notify
    *   will not be automatically called on the child's side of the fork(). It
    *   will only be called when the last reference on the #GSubprocessLauncher
    *   is dropped or when a new child setup function is given.
    *
    * %NULL can be given as @child_setup to disable the functionality.
    *
    * Child setup functions are only available on UNIX.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_child_setup/<method parameters>/child_setup]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.SpawnChildSetupFunc), @type -> DataRecord(GSpawnChildSetupFunc)))"
  )
  private def setChildSetup__ = ???

  /** Sets the current working directory that processes will be launched with.
    *
    * By default processes are launched with the current working directory of
    * the launching process at the time of launch.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCwd(
      cwd: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ =
    g_subprocess_launcher_set_cwd(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocessLauncher]],
      toCString(cwd).asInstanceOf[Ptr[gchar]]
    )
  end setCwd

  /** Replace the entire environment of processes launched from this launcher
    * with the given 'environ' variable.
    *
    * Typically you will build this variable by using g_listenv() to copy the
    * process 'environ' and using the functions g_environ_setenv(),
    * g_environ_unsetenv(), etc.
    *
    * As an alternative, you can use g_subprocess_launcher_setenv(),
    * g_subprocess_launcher_unsetenv(), etc.
    *
    * Pass an empty array to set an empty environment. Pass %NULL to inherit the
    * parent process’ environment. As of GLib 2.54, the parent process’
    * environment will be copied when g_subprocess_launcher_set_environ() is
    * called. Previously, it was copied when the subprocess was executed. This
    * means the copied environment may now be modified (using
    * g_subprocess_launcher_setenv(), etc.) before launching the subprocess.
    *
    * On UNIX, all strings in this array can be arbitrary byte strings. On
    * Windows, they should be in UTF-8.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_environ/<method parameters>/env]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(filename)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def setEnviron__ = ???

  /** Sets the flags on the launcher.
    *
    * The default flags are %G_SUBPROCESS_FLAGS_NONE.
    *
    * You may not set flags that specify conflicting options for how to handle a
    * particular stdio stream (eg: specifying both
    * %G_SUBPROCESS_FLAGS_STDIN_PIPE and %G_SUBPROCESS_FLAGS_STDIN_INHERIT).
    *
    * You may also not set a flag that conflicts with a previous call to a
    * function like g_subprocess_launcher_set_stdin_file_path() or
    * g_subprocess_launcher_take_stdout_fd().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFlags(
      flags: SubprocessFlags /* Some(GSubprocessFlags) */
  ): Unit /* None */ =
    g_subprocess_launcher_set_flags(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocessLauncher]],
      flags.raw
    )
  end setFlags

  /** Sets the file path to use as the stderr for spawned processes.
    *
    * If @path is %NULL then any previously given path is unset.
    *
    * The file will be created or truncated when the process is spawned, as
    * would be the case if using '2>' at the shell.
    *
    * If you want to send both stdout and stderr to the same file then use
    * %G_SUBPROCESS_FLAGS_STDERR_MERGE.
    *
    * You may not set a stderr file path if a stderr fd is already set or if the
    * launcher flags contain any flags directing stderr elsewhere.
    *
    * This feature is only available on UNIX.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setStderrFilePath(
      path: Option[String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */ ]
  )(using Zone): Unit /* None */ =
    g_subprocess_launcher_set_stderr_file_path(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocessLauncher]],
      path
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
    )
  end setStderrFilePath

  /** Sets the file path to use as the stdin for spawned processes.
    *
    * If @path is %NULL then any previously given path is unset.
    *
    * The file must exist or spawning the process will fail.
    *
    * You may not set a stdin file path if a stdin fd is already set or if the
    * launcher flags contain any flags directing stdin elsewhere.
    *
    * This feature is only available on UNIX.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setStdinFilePath(
      path: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ =
    g_subprocess_launcher_set_stdin_file_path(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocessLauncher]],
      toCString(path).asInstanceOf[Ptr[gchar]]
    )
  end setStdinFilePath

  /** Sets the file path to use as the stdout for spawned processes.
    *
    * If @path is %NULL then any previously given path is unset.
    *
    * The file will be created or truncated when the process is spawned, as
    * would be the case if using '>' at the shell.
    *
    * You may not set a stdout file path if a stdout fd is already set or if the
    * launcher flags contain any flags directing stdout elsewhere.
    *
    * This feature is only available on UNIX.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setStdoutFilePath(
      path: Option[String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */ ]
  )(using Zone): Unit /* None */ =
    g_subprocess_launcher_set_stdout_file_path(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocessLauncher]],
      path
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
    )
  end setStdoutFilePath

  /** Sets the environment variable @variable in the environment of processes
    * launched from this launcher.
    *
    * On UNIX, both the variable's name and value can be arbitrary byte strings,
    * except that the variable's name cannot contain '='. On Windows, they
    * should be in UTF-8.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setenv(
      variable: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      value: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      overwrite: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Zone): Unit /* None */ =
    g_subprocess_launcher_setenv(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocessLauncher]],
      toCString(variable).asInstanceOf[Ptr[gchar]],
      toCString(value).asInstanceOf[Ptr[gchar]],
      gboolean(gint((if overwrite == true then 1 else 0)))
    )
  end setenv

  /** Creates a #GSubprocess given a provided varargs list of arguments.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method spawn/<method parameters>/error]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(GError**)))"
  )
  private def spawn__ = ???

  /** Creates a #GSubprocess given a provided array of arguments.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method spawnv/<method parameters>/argv]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(filename)))),ListMap(@type -> DataRecord(const gchar* const*)))"
  )
  private def spawnv__ = ???

  /** Transfer an arbitrary file descriptor from parent process to the child.
    * This function takes ownership of the @source_fd; it will be closed in the
    * parent when @self is freed.
    *
    * By default, all file descriptors from the parent will be closed. This
    * function allows you to create (for example) a custom `pipe()` or
    * `socketpair()` before launching the process, and choose the target
    * descriptor in the child.
    *
    * An example use case is GNUPG, which has a command line argument
    * `--passphrase-fd` providing a file descriptor number where it expects the
    * passphrase to be written.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def takeFd(
      source_fd: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      target_fd: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): Unit /* None */ =
    g_subprocess_launcher_take_fd(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocessLauncher]],
      gint(source_fd),
      gint(target_fd)
    )
  end takeFd

  /** Sets the file descriptor to use as the stderr for spawned processes.
    *
    * If @fd is -1 then any previously given fd is unset.
    *
    * Note that the default behaviour is to pass stderr through to the stderr of
    * the parent process.
    *
    * The passed @fd belongs to the #GSubprocessLauncher. It will be
    * automatically closed when the launcher is finalized. The file descriptor
    * will also be closed on the child side when executing the spawned process.
    *
    * You may not set a stderr fd if a stderr file path is already set or if the
    * launcher flags contain any flags directing stderr elsewhere.
    *
    * This feature is only available on UNIX.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def takeStderrFd(
      fd: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): Unit /* None */ =
    g_subprocess_launcher_take_stderr_fd(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocessLauncher]],
      gint(fd)
    )
  end takeStderrFd

  /** Sets the file descriptor to use as the stdin for spawned processes.
    *
    * If @fd is -1 then any previously given fd is unset.
    *
    * Note that if your intention is to have the stdin of the calling process
    * inherited by the child then %G_SUBPROCESS_FLAGS_STDIN_INHERIT is a better
    * way to go about doing that.
    *
    * The passed @fd is noted but will not be touched in the current process. It
    * is therefore necessary that it be kept open by the caller until the
    * subprocess is spawned. The file descriptor will also not be explicitly
    * closed on the child side, so it must be marked O_CLOEXEC if that's what
    * you want.
    *
    * You may not set a stdin fd if a stdin file path is already set or if the
    * launcher flags contain any flags directing stdin elsewhere.
    *
    * This feature is only available on UNIX.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def takeStdinFd(
      fd: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): Unit /* None */ =
    g_subprocess_launcher_take_stdin_fd(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocessLauncher]],
      gint(fd)
    )
  end takeStdinFd

  /** Sets the file descriptor to use as the stdout for spawned processes.
    *
    * If @fd is -1 then any previously given fd is unset.
    *
    * Note that the default behaviour is to pass stdout through to the stdout of
    * the parent process.
    *
    * The passed @fd is noted but will not be touched in the current process. It
    * is therefore necessary that it be kept open by the caller until the
    * subprocess is spawned. The file descriptor will also not be explicitly
    * closed on the child side, so it must be marked O_CLOEXEC if that's what
    * you want.
    *
    * You may not set a stdout fd if a stdout file path is already set or if the
    * launcher flags contain any flags directing stdout elsewhere.
    *
    * This feature is only available on UNIX.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def takeStdoutFd(
      fd: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): Unit /* None */ =
    g_subprocess_launcher_take_stdout_fd(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocessLauncher]],
      gint(fd)
    )
  end takeStdoutFd

  /** Removes the environment variable @variable from the environment of
    * processes launched from this launcher.
    *
    * On UNIX, the variable's name can be an arbitrary byte string not
    * containing '='. On Windows, it should be in UTF-8.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unsetenv(
      variable: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ =
    g_subprocess_launcher_unsetenv(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocessLauncher]],
      toCString(variable).asInstanceOf[Ptr[gchar]]
    )
  end unsetenv

end SubprocessLauncher

object SubprocessLauncher:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GSubprocessLauncher])(using Runtime) =
    summon[Runtime].getOrCreate[SubprocessLauncher](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new SubprocessLauncher(ptr)
    )

  /** Creates a new #GSubprocessLauncher.
    *
    * The launcher is created with the default options. A copy of the
    * environment of the calling process is made at the time of this call and
    * will be used as the environment that the process is launched in.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(flags: SubprocessFlags /* Some(GSubprocessFlags) */ )(using
      Runtime
  ): SubprocessLauncher =
    val raw: Ptr[Byte] = g_subprocess_launcher_new(flags.raw).asInstanceOf
    summon[Runtime].getOrCreate[SubprocessLauncher](
      raw,
      r => SubprocessLauncher.applyUnsafe(r.asInstanceOf)
    )
  end apply
end SubprocessLauncher
