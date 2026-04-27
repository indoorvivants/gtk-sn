package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Subprocess
import sn.gnome.gio.internal.GSubprocessFlags
import sn.gnome.gio.internal.GSubprocessLauncher
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.GError
import sn.gnome.glib.internal.GSpawnChildSetupFunc
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

class SubprocessLauncher(raw: Ptr[GSubprocessLauncher])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def close(): Unit = g_subprocess_launcher_close(this.raw.asInstanceOf)

  def getenv(variable: String | CString)(using Zone): String = fromCString(
    g_subprocess_launcher_getenv(
      this.raw.asInstanceOf,
      __sn_extract_string(variable).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  def setChildSetup(
      child_setup: GSpawnChildSetupFunc,
      user_data: Ptr[Byte],
      destroy_notify: GDestroyNotify
  ): Unit = g_subprocess_launcher_set_child_setup(
    this.raw.asInstanceOf,
    child_setup,
    gpointer(user_data),
    destroy_notify
  )

  def setCwd(cwd: String | CString)(using Zone): Unit =
    g_subprocess_launcher_set_cwd(
      this.raw.asInstanceOf,
      __sn_extract_string(cwd).asInstanceOf[Ptr[gchar]]
    )

  // Method set_environ contains an array parameter, which is not supported yet

  def setFlags(flags: GSubprocessFlags): Unit =
    g_subprocess_launcher_set_flags(this.raw.asInstanceOf, flags)

  def setStderrFilePath(path: String | CString)(using Zone): Unit =
    g_subprocess_launcher_set_stderr_file_path(
      this.raw.asInstanceOf,
      __sn_extract_string(path).asInstanceOf[Ptr[gchar]]
    )

  def setStdinFilePath(path: String | CString)(using Zone): Unit =
    g_subprocess_launcher_set_stdin_file_path(
      this.raw.asInstanceOf,
      __sn_extract_string(path).asInstanceOf[Ptr[gchar]]
    )

  def setStdoutFilePath(path: String | CString)(using Zone): Unit =
    g_subprocess_launcher_set_stdout_file_path(
      this.raw.asInstanceOf,
      __sn_extract_string(path).asInstanceOf[Ptr[gchar]]
    )

  def setenv(
      variable: String | CString,
      value: String | CString,
      overwrite: Boolean
  )(using Zone): Unit = g_subprocess_launcher_setenv(
    this.raw.asInstanceOf,
    __sn_extract_string(variable).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(value).asInstanceOf[Ptr[gchar]],
    gboolean(gint((if overwrite == true then 1 else 0)))
  )

  inline def spawn(
      error: Ptr[Ptr[GError]],
      argv0: String | CString,
      args: Any*
  )(using Zone): Subprocess = new Subprocess(
    g_subprocess_launcher_spawn(
      this.raw.asInstanceOf,
      error,
      __sn_extract_string(argv0).asInstanceOf[Ptr[gchar]],
      args*
    ).asInstanceOf
  )

  // Method spawnv contains an array parameter, which is not supported yet

  def takeFd(source_fd: Int, target_fd: Int): Unit =
    g_subprocess_launcher_take_fd(
      this.raw.asInstanceOf,
      gint(source_fd),
      gint(target_fd)
    )

  def takeStderrFd(fd: Int): Unit =
    g_subprocess_launcher_take_stderr_fd(this.raw.asInstanceOf, gint(fd))

  def takeStdinFd(fd: Int): Unit =
    g_subprocess_launcher_take_stdin_fd(this.raw.asInstanceOf, gint(fd))

  def takeStdoutFd(fd: Int): Unit =
    g_subprocess_launcher_take_stdout_fd(this.raw.asInstanceOf, gint(fd))

  def unsetenv(variable: String | CString)(using Zone): Unit =
    g_subprocess_launcher_unsetenv(
      this.raw.asInstanceOf,
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
  def apply(flags: GSubprocessFlags): SubprocessLauncher =
    new SubprocessLauncher(g_subprocess_launcher_new(flags).asInstanceOf)
end SubprocessLauncher
