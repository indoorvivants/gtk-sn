package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.Initable
import sn.gnome.gio.fluent.InputStream
import sn.gnome.gio.fluent.OutputStream
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GSubprocess
import sn.gnome.gio.internal.GSubprocessFlags
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GBytes
import sn.gnome.glib.internal.GError
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

class Subprocess(raw: Ptr[GSubprocess])
    extends Object(raw.asInstanceOf),
      Initable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  // Method communicate contains an OUT parameter, which is not supported yet

  def communicateAsync(
      stdin_buf: Ptr[GBytes],
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_subprocess_communicate_async(
    this.raw.asInstanceOf,
    stdin_buf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  // Method communicate_finish contains an OUT parameter, which is not supported yet

  // Method communicate_utf8 contains an OUT parameter, which is not supported yet

  def communicateUtf8Async(
      stdin_buf: String | CString,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = g_subprocess_communicate_utf8_async(
    this.raw.asInstanceOf,
    __sn_extract_string(stdin_buf),
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  // Method communicate_utf8_finish contains an OUT parameter, which is not supported yet

  def forceExit(): Unit = g_subprocess_force_exit(this.raw.asInstanceOf)

  def getExitStatus(): Int = g_subprocess_get_exit_status(
    this.raw.asInstanceOf
  ).value

  def getIdentifier()(using Zone): String = fromCString(
    g_subprocess_get_identifier(this.raw.asInstanceOf).asInstanceOf
  )

  def getIfExited(): Boolean =
    g_subprocess_get_if_exited(this.raw.asInstanceOf).value.!=(0)

  def getIfSignaled(): Boolean =
    g_subprocess_get_if_signaled(this.raw.asInstanceOf).value.!=(0)

  def getStatus(): Int = g_subprocess_get_status(this.raw.asInstanceOf).value

  def getStderrPipe(): InputStream = new InputStream(
    g_subprocess_get_stderr_pipe(this.raw.asInstanceOf).asInstanceOf
  )

  def getStdinPipe(): OutputStream = new OutputStream(
    g_subprocess_get_stdin_pipe(this.raw.asInstanceOf).asInstanceOf
  )

  def getStdoutPipe(): InputStream = new InputStream(
    g_subprocess_get_stdout_pipe(this.raw.asInstanceOf).asInstanceOf
  )

  def getSuccessful(): Boolean =
    g_subprocess_get_successful(this.raw.asInstanceOf).value.!=(0)

  def getTermSig(): Int = g_subprocess_get_term_sig(this.raw.asInstanceOf).value

  def sendSignal(signal_num: Int): Unit =
    g_subprocess_send_signal(this.raw.asInstanceOf, gint(signal_num))

  def _wait(cancellable: Cancellable): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_subprocess_wait(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def waitAsync(
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_subprocess_wait_async(
    this.raw.asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def waitCheck(cancellable: Cancellable): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_subprocess_wait_check(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def waitCheckAsync(
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_subprocess_wait_check_async(
    this.raw.asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def waitCheckFinish(result: AsyncResult): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_subprocess_wait_check_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def waitFinish(result: AsyncResult): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_subprocess_wait_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Subprocess

object Subprocess:
  inline def apply(
      flags: GSubprocessFlags,
      error: Ptr[Ptr[GError]],
      argv0: String | CString,
      args: Any*
  )(using Zone): Subprocess = new Subprocess(
    g_subprocess_new(
      flags,
      error,
      __sn_extract_string(argv0).asInstanceOf[Ptr[gchar]],
      args*
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Subprocess
