package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.SubprocessFlags
import sn.gnome.gio.internal.GSubprocessLauncher
import sn.gnome.glib.internal.{gboolean, gchar, gint}
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * This class contains a set of options for launching child processes, such as
  * where its standard input and output will be directed, the argument list, the
  * environment, and more.
  *
  * While the #GSubprocess class has high level functions covering popular
  * cases, use of this class allows access to more advanced options. It can also
  * be used to launch multiple subprocesses with a similar configuration.
  */
class SubprocessLauncher(raw: Ptr[GSubprocessLauncher])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Closes all the file descriptors previously passed to the object with
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
    */
  def close(): Unit /* None */ = g_subprocess_launcher_close(
    this.raw.asInstanceOf[Ptr[GSubprocessLauncher]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the value of the environment variable @variable in the environment
    * of processes launched from this launcher.
    *
    * On UNIX, the returned string can be an arbitrary byte string. On Windows,
    * it will be UTF-8.
    */
  def getenv(
      variable: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): String /* None */ = fromCString(
    g_subprocess_launcher_getenv(
      this.raw.asInstanceOf[Ptr[GSubprocessLauncher]],
      __sn_extract_string(variable).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets up a child setup function.
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
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.SpawnChildSetupFunc), @type -> DataRecord(GSpawnChildSetupFunc)))"
  )
  def setChildSetup__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the current working directory that processes will be launched with.
    *
    * By default processes are launched with the current working directory of
    * the launching process at the time of launch.
    */
  def setCwd(
      cwd: String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ = g_subprocess_launcher_set_cwd(
    this.raw.asInstanceOf[Ptr[GSubprocessLauncher]],
    __sn_extract_string(cwd).asInstanceOf[Ptr[gchar]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Replace the entire environment of processes launched from this launcher
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
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(filename)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  def setEnviron__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the flags on the launcher.
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
    */
  def setFlags(
      flags: SubprocessFlags /* Some(GSubprocessFlags) */
  ): Unit /* None */ = g_subprocess_launcher_set_flags(
    this.raw.asInstanceOf[Ptr[GSubprocessLauncher]],
    flags.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the file path to use as the stderr for spawned processes.
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
    */
  def setStderrFilePath(
      path: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone): Unit /* None */ = g_subprocess_launcher_set_stderr_file_path(
    this.raw.asInstanceOf[Ptr[GSubprocessLauncher]],
    path
      .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
        __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
      )
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the file path to use as the stdin for spawned processes.
    *
    * If @path is %NULL then any previously given path is unset.
    *
    * The file must exist or spawning the process will fail.
    *
    * You may not set a stdin file path if a stdin fd is already set or if the
    * launcher flags contain any flags directing stdin elsewhere.
    *
    * This feature is only available on UNIX.
    */
  def setStdinFilePath(
      path: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ = g_subprocess_launcher_set_stdin_file_path(
    this.raw.asInstanceOf[Ptr[GSubprocessLauncher]],
    __sn_extract_string(path).asInstanceOf[Ptr[gchar]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the file path to use as the stdout for spawned processes.
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
    */
  def setStdoutFilePath(
      path: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone): Unit /* None */ = g_subprocess_launcher_set_stdout_file_path(
    this.raw.asInstanceOf[Ptr[GSubprocessLauncher]],
    path
      .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
        __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
      )
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the environment variable @variable in the environment of processes
    * launched from this launcher.
    *
    * On UNIX, both the variable's name and value can be arbitrary byte strings,
    * except that the variable's name cannot contain '='. On Windows, they
    * should be in UTF-8.
    */
  def setenv(
      variable: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      value: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      overwrite: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Zone): Unit /* None */ = g_subprocess_launcher_setenv(
    this.raw.asInstanceOf[Ptr[GSubprocessLauncher]],
    __sn_extract_string(variable).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(value).asInstanceOf[Ptr[gchar]],
    gboolean(gint((if overwrite == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a #GSubprocess given a provided varargs list of arguments.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(GError**)))"
  )
  def spawn__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a #GSubprocess given a provided array of arguments.
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(filename)))),ListMap(@type -> DataRecord(const gchar* const*)))"
  )
  def spawnv__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Transfer an arbitrary file descriptor from parent process to the child.
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
    */
  def takeFd(
      source_fd: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      target_fd: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): Unit /* None */ = g_subprocess_launcher_take_fd(
    this.raw.asInstanceOf[Ptr[GSubprocessLauncher]],
    gint(source_fd),
    gint(target_fd)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the file descriptor to use as the stderr for spawned processes.
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
    */
  def takeStderrFd(
      fd: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): Unit /* None */ = g_subprocess_launcher_take_stderr_fd(
    this.raw.asInstanceOf[Ptr[GSubprocessLauncher]],
    gint(fd)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the file descriptor to use as the stdin for spawned processes.
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
    */
  def takeStdinFd(
      fd: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): Unit /* None */ = g_subprocess_launcher_take_stdin_fd(
    this.raw.asInstanceOf[Ptr[GSubprocessLauncher]],
    gint(fd)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the file descriptor to use as the stdout for spawned processes.
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
    */
  def takeStdoutFd(
      fd: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): Unit /* None */ = g_subprocess_launcher_take_stdout_fd(
    this.raw.asInstanceOf[Ptr[GSubprocessLauncher]],
    gint(fd)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes the environment variable @variable from the environment of
    * processes launched from this launcher.
    *
    * On UNIX, the variable's name can be an arbitrary byte string not
    * containing '='. On Windows, it should be in UTF-8.
    */
  def unsetenv(
      variable: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ = g_subprocess_launcher_unsetenv(
    this.raw.asInstanceOf[Ptr[GSubprocessLauncher]],
    __sn_extract_string(variable).asInstanceOf[Ptr[gchar]]
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end SubprocessLauncher

object SubprocessLauncher:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GSubprocessLauncher.
    *
    * The launcher is created with the default options. A copy of the
    * environment of the calling process is made at the time of this call and
    * will be used as the environment that the process is launched in.
    */
  def apply(
      flags: SubprocessFlags /* Some(GSubprocessFlags) */
  ): SubprocessLauncher = new SubprocessLauncher(
    g_subprocess_launcher_new(flags.raw).asInstanceOf
  )
end SubprocessLauncher
