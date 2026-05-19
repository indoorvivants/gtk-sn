package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{
  AsyncResult,
  Cancellable,
  Initable,
  InputStream,
  OutputStream
}
import sn.gnome.gio.internal.GSubprocess
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** #GSubprocess allows the creation of and interaction with child processes.
  *
  * Processes can be communicated with using standard GIO-style APIs (ie:
  * #GInputStream, #GOutputStream). There are GIO-style APIs to wait for process
  * termination (ie: cancellable and with an asynchronous variant).
  *
  * There is an API to force a process to terminate, as well as a race-free API
  * for sending UNIX signals to a subprocess.
  *
  * One major advantage that GIO brings over the core GLib library is
  * comprehensive API for asynchronous I/O, such g_output_stream_splice_async().
  * This makes GSubprocess significantly more powerful and flexible than
  * equivalent APIs in some other languages such as the `subprocess.py` included
  * with Python. For example, using #GSubprocess one could create two child
  * processes, reading standard output from the first, processing it, and
  * writing to the input stream of the second, all without blocking the main
  * loop.
  *
  * A powerful g_subprocess_communicate() API is provided similar to the
  * `communicate()` method of `subprocess.py`. This enables very easy
  * interaction with a subprocess that has been opened with pipes.
  *
  * #GSubprocess defaults to tight control over the file descriptors open in the
  * child process, avoiding dangling-fd issues that are caused by a simple
  * fork()/exec(). The only open file descriptors in the spawned process are
  * ones that were explicitly specified by the #GSubprocess API (unless
  * %G_SUBPROCESS_FLAGS_INHERIT_FDS was specified).
  *
  * #GSubprocess will quickly reap all child processes as they exit, avoiding
  * "zombie processes" remaining around for long periods of time.
  * g_subprocess_wait() can be used to wait for this to happen, but it will
  * happen even without the call being explicitly made.
  *
  * As a matter of principle, #GSubprocess has no API that accepts shell-style
  * space-separated strings. It will, however, match the typical shell behaviour
  * of searching the PATH for executables that do not contain a directory
  * separator in their name. By default, the `PATH` of the current process is
  * used. You can specify %G_SUBPROCESS_FLAGS_SEARCH_PATH_FROM_ENVP to use the
  * `PATH` of the launcher environment instead.
  *
  * #GSubprocess attempts to have a very simple API for most uses (ie: spawning
  * a subprocess with arguments and support for most typical kinds of input and
  * output redirection). See g_subprocess_new(). The #GSubprocessLauncher API is
  * provided for more complicated cases (advanced types of redirection,
  * environment variable manipulation, change of working directory, child setup
  * functions, etc).
  *
  * A typical use of #GSubprocess will involve calling g_subprocess_new(),
  * followed by g_subprocess_wait_async() or g_subprocess_wait(). After the
  * process exits, the status can be checked using functions such as
  * g_subprocess_get_if_exited() (which are similar to the familiar
  * WIFEXITED-style POSIX macros).
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Subprocess private[gnome] (raw: Ptr[GSubprocess])
    extends Object(raw.asInstanceOf),
      Initable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Communicate with the subprocess until it terminates, and all input and
    * output has been completed.
    *
    * If @stdin_buf is given, the subprocess must have been created with
    * %G_SUBPROCESS_FLAGS_STDIN_PIPE. The given data is fed to the stdin of the
    * subprocess and the pipe is closed (ie: EOF).
    *
    * At the same time (as not to cause blocking when dealing with large amounts
    * of data), if %G_SUBPROCESS_FLAGS_STDOUT_PIPE or
    * %G_SUBPROCESS_FLAGS_STDERR_PIPE were used, reads from those streams. The
    * data that was read is returned in @stdout and/or the @stderr.
    *
    * If the subprocess was created with %G_SUBPROCESS_FLAGS_STDOUT_PIPE,
    * @stdout_buf
    *   will contain the data read from stdout. Otherwise, for subprocesses not
    *   created with %G_SUBPROCESS_FLAGS_STDOUT_PIPE,
    * @stdout_buf
    *   will be set to %NULL. Similar provisions apply to
    * @stderr_buf
    *   and %G_SUBPROCESS_FLAGS_STDERR_PIPE.
    *
    * As usual, any output variable may be given as %NULL to ignore it.
    *
    * If you desire the stdout and stderr data to be interleaved, create the
    * subprocess with %G_SUBPROCESS_FLAGS_STDOUT_PIPE and
    * %G_SUBPROCESS_FLAGS_STDERR_MERGE. The merged result will be returned in @stdout_buf
    * and @stderr_buf will be set to %NULL.
    *
    * In case of any error (including cancellation), %FALSE will be returned
    * with @error set. Some or all of the stdin data may have been written. Any
    * stdout or stderr data that has been read will be discarded. None of the
    * out variables (aside from @error) will have been set to anything in
    * particular and should not be inspected.
    *
    * In the case that %TRUE is returned, the subprocess has exited and the exit
    * status inspection APIs (eg: g_subprocess_get_if_exited(),
    * g_subprocess_get_exit_status()) may be used.
    *
    * You should not attempt to use any of the subprocess pipes after starting
    * this function, since they may be left in strange states, even if the
    * operation was cancelled. You should especially not attempt to interact
    * with the pipes while the operation is in progress (either from another
    * thread or if using the asynchronous version).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method communicate]: Method communicate contains an OUT parameter, which is not supported yet"
  )
  private def communicate__ = ???

  /** Asynchronous version of g_subprocess_communicate(). Complete invocation
    * with g_subprocess_communicate_finish().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method communicate_async/<method parameters>/stdin_buf]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def communicateAsync__ = ???

  /** Complete an invocation of g_subprocess_communicate_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method communicate_finish]: Method communicate_finish contains an OUT parameter, which is not supported yet"
  )
  private def communicateFinish__ = ???

  /** Like g_subprocess_communicate(), but validates the output of the process
    * as UTF-8, and returns it as a regular NUL terminated string.
    *
    * On error, @stdout_buf and @stderr_buf will be set to undefined values and
    * should not be used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method communicate_utf8]: Method communicate_utf8 contains an OUT parameter, which is not supported yet"
  )
  private def communicateUtf8__ = ???

  /** Asynchronous version of g_subprocess_communicate_utf8(). Complete
    * invocation with g_subprocess_communicate_utf8_finish().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method communicate_utf8_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def communicateUtf8Async__ = ???

  /** Complete an invocation of g_subprocess_communicate_utf8_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method communicate_utf8_finish]: Method communicate_utf8_finish contains an OUT parameter, which is not supported yet"
  )
  private def communicateUtf8Finish__ = ???

  /** Use an operating-system specific method to attempt an immediate, forceful
    * termination of the process. There is no mechanism to determine whether or
    * not the request itself was successful; however, you can use
    * g_subprocess_wait() to monitor the status of the process after calling
    * this function.
    *
    * On Unix, this function sends %SIGKILL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forceExit(): Unit /* None */ =
    g_subprocess_force_exit(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocess]]
    )
  end forceExit

  /** Check the exit status of the subprocess, given that it exited normally.
    * This is the value passed to the exit() system call or the return value
    * from main.
    *
    * This is equivalent to the system WEXITSTATUS macro.
    *
    * It is an error to call this function before g_subprocess_wait() and unless
    * g_subprocess_get_if_exited() returned %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExitStatus(): Int /* None */ =
    g_subprocess_get_exit_status(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocess]]
    ).value
  end getExitStatus

  /** On UNIX, returns the process ID as a decimal string. On Windows, returns
    * the result of GetProcessId() also as a string. If the subprocess has
    * terminated, this will return %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIdentifier(): String /* None */ =
    fromCString(
      g_subprocess_get_identifier(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocess]]
      ).asInstanceOf
    )
  end getIdentifier

  /** Check if the given subprocess exited normally (ie: by way of exit() or
    * return from main()).
    *
    * This is equivalent to the system WIFEXITED macro.
    *
    * It is an error to call this function before g_subprocess_wait() has
    * returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIfExited(): Boolean /* None */ =
    g_subprocess_get_if_exited(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocess]]
    ).value.!=(0)
  end getIfExited

  /** Check if the given subprocess terminated in response to a signal.
    *
    * This is equivalent to the system WIFSIGNALED macro.
    *
    * It is an error to call this function before g_subprocess_wait() has
    * returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIfSignaled(): Boolean /* None */ =
    g_subprocess_get_if_signaled(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocess]]
    ).value.!=(0)
  end getIfSignaled

  /** Gets the raw status code of the process, as from waitpid().
    *
    * This value has no particular meaning, but it can be used with the macros
    * defined by the system headers such as WIFEXITED. It can also be used with
    * g_spawn_check_wait_status().
    *
    * It is more likely that you want to use g_subprocess_get_if_exited()
    * followed by g_subprocess_get_exit_status().
    *
    * It is an error to call this function before g_subprocess_wait() has
    * returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStatus(): Int /* None */ =
    g_subprocess_get_status(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocess]]
    ).value
  end getStatus

  /** Gets the #GInputStream from which to read the stderr output of
    * @subprocess.
    *
    * The process must have been created with %G_SUBPROCESS_FLAGS_STDERR_PIPE,
    * otherwise %NULL will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStderrPipe()(using Runtime): sn.gnome.gio.InputStream /* None */ =
    sn.gnome.gio.InputStream.applyUnsafe(
      g_subprocess_get_stderr_pipe(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocess]]
      ).asInstanceOf
    )
  end getStderrPipe

  /** Gets the #GOutputStream that you can write to in order to give data to the
    * stdin of @subprocess.
    *
    * The process must have been created with %G_SUBPROCESS_FLAGS_STDIN_PIPE and
    * not %G_SUBPROCESS_FLAGS_STDIN_INHERIT, otherwise %NULL will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStdinPipe()(using Runtime): sn.gnome.gio.OutputStream /* None */ =
    sn.gnome.gio.OutputStream.applyUnsafe(
      g_subprocess_get_stdin_pipe(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocess]]
      ).asInstanceOf
    )
  end getStdinPipe

  /** Gets the #GInputStream from which to read the stdout output of
    * @subprocess.
    *
    * The process must have been created with %G_SUBPROCESS_FLAGS_STDOUT_PIPE,
    * otherwise %NULL will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStdoutPipe()(using Runtime): sn.gnome.gio.InputStream /* None */ =
    sn.gnome.gio.InputStream.applyUnsafe(
      g_subprocess_get_stdout_pipe(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocess]]
      ).asInstanceOf
    )
  end getStdoutPipe

  /** Checks if the process was "successful". A process is considered successful
    * if it exited cleanly with an exit status of 0, either by way of the exit()
    * system call or return from main().
    *
    * It is an error to call this function before g_subprocess_wait() has
    * returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSuccessful(): Boolean /* None */ =
    g_subprocess_get_successful(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocess]]
    ).value.!=(0)
  end getSuccessful

  /** Get the signal number that caused the subprocess to terminate, given that
    * it terminated due to a signal.
    *
    * This is equivalent to the system WTERMSIG macro.
    *
    * It is an error to call this function before g_subprocess_wait() and unless
    * g_subprocess_get_if_signaled() returned %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTermSig(): Int /* None */ =
    g_subprocess_get_term_sig(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocess]]
    ).value
  end getTermSig

  /** Sends the UNIX signal @signal_num to the subprocess, if it is still
    * running.
    *
    * This API is race-free. If the subprocess has terminated, it will not be
    * signalled.
    *
    * This API is not available on Windows.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def sendSignal(
      signal_num: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): Unit /* None */ =
    g_subprocess_send_signal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocess]],
      gint(signal_num)
    )
  end sendSignal

  /** Synchronously wait for the subprocess to terminate.
    *
    * After the process terminates you can query its exit status with functions
    * such as g_subprocess_get_if_exited() and g_subprocess_get_exit_status().
    *
    * This function does not fail in the case of the subprocess having abnormal
    * termination. See g_subprocess_wait_check() for that.
    *
    * Cancelling @cancellable doesn't kill the subprocess. Call
    * g_subprocess_force_exit() if it is desirable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def _wait(
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_subprocess_wait(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocess]],
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end _wait

  /** Wait for the subprocess to terminate.
    *
    * This is the asynchronous version of g_subprocess_wait().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method wait_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def waitAsync__ = ???

  /** Combines g_subprocess_wait() with g_spawn_check_wait_status().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def waitCheck(
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_subprocess_wait_check(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocess]],
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end waitCheck

  /** Combines g_subprocess_wait_async() with g_spawn_check_wait_status().
    *
    * This is the asynchronous version of g_subprocess_wait_check().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method wait_check_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def waitCheckAsync__ = ???

  /** Collects the result of a previous call to g_subprocess_wait_check_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def waitCheckFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_subprocess_wait_check_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocess]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end waitCheckFinish

  /** Collects the result of a previous call to g_subprocess_wait_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def waitFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_subprocess_wait_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSubprocess]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end waitFinish

end Subprocess

object Subprocess:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GSubprocess])(using Runtime) =
    summon[Runtime].getOrCreate[Subprocess](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new Subprocess(ptr)
    )

  /** Create a new process with the given flags and varargs argument list. By
    * default, matching the g_spawn_async() defaults, the child's stdin will be
    * set to the system null device, and stdout/stderr will be inherited from
    * the parent. You can use
    * @flags
    *   to control this behavior.
    *
    * The argument list must be terminated with %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new/error]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(GError**)))"
  )
  private def apply() = ???

  /** Create a new process with the given flags and argument list.
    *
    * The argument list is expected to be %NULL-terminated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor newv/argv]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(filename)))),ListMap(@type -> DataRecord(const gchar* const*)))"
  )
  private def newv() = ???

end Subprocess
