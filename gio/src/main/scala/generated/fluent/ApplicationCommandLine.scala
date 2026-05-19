package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{File, InputStream}
import sn.gnome.gio.internal.GApplicationCommandLine
import sn.gnome.glib.internal.{gboolean, gchar, gint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/**  #GApplicationCommandLine represents a command-line invocation of
  *  an application.  It is created by #GApplication and emitted
  *  in the #GApplication::command-line signal and virtual function.
  *
  *  The class contains the list of arguments that the program was invoked
  *  with.  It is also possible to query if the commandline invocation was
  *  local (ie: the current process is running in direct response to the
  *  invocation) or remote (ie: some other process forwarded the
  *  commandline to this process).
  *
  *  The GApplicationCommandLine object can provide the @argc and @argv
  *  parameters for use with the #GOptionContext command-line parsing API,
  *  with the g_application_command_line_get_arguments() function. See
  *  [gapplication-example-cmdline3.c][gapplication-example-cmdline3]
  *  for an example.
  *
  *  The exit status of the originally-invoked process may be set and
  *  messages can be printed to stdout or stderr of that process.  The
  *  lifecycle of the originally-invoked process is tied to the lifecycle
  *  of this object (ie: the process exits when the last reference is
  *  dropped).
  *
  *  The main use for #GApplicationCommandLine (and the
  *  #GApplication::command-line signal) is 'Emacs server' like use cases:
  *  You can set the `EDITOR` environment variable to have e.g. git use
  *  your favourite editor to edit commit messages, and if you already
  *  have an instance of the editor running, the editing will happen
  *  in the running instance, instead of opening a new one. An important
  *  aspect of this use case is that the process that gets started by git
  *  does not return until the editing is done.
  *
  *  Normally, the commandline is completely handled in the
  *  #GApplication::command-line handler. The launching instance exits
  *  once the signal handler in the primary instance has returned, and
  *  the return value of the signal handler becomes the exit status
  *  of the launching instance.
  *  |[<!-- language="C" -->
  *  static int
  *  command_line (GApplication            *application,
  *                GApplicationCommandLine *cmdline)
  *  {
  *    gchar **argv;
  *    gint argc;
  *    gint i;
  *
  *    argv = g_application_command_line_get_arguments (cmdline, &argc);
  *
  *    g_application_command_line_print (cmdline,
  *                                      "This text is written back\n"
  *                                      "to stdout of the caller\n");
  *
  *    for (i = 0; i < argc; i++)
  *      g_print ("argument %d: %s\n", i, argv[i]);
  *
  *    g_strfreev (argv);
  *
  *    return 0;
  *  }
  *  ]|
  *  The complete example can be found here:
  *  [gapplication-example-cmdline.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-cmdline.c)
  *
  *  In more complicated cases, the handling of the commandline can be
  *  split between the launcher and the primary instance.
  *  |[<!-- language="C" -->
  *  static gboolean
  *   test_local_cmdline (GApplication   *application,
  *                       gchar        ***arguments,
  *                       gint           *exit_status)
  *  {
  *    gint i, j;
  *    gchar **argv;
  *
  *    argv = *arguments;
  *
  *    if (argv[0] == NULL)
  *      {
  *        *exit_status = 0;
  *        return FALSE;
  *      }
  *
  *    i = 1;
  *    while (argv[i])
  *      {
  *        if (g_str_has_prefix (argv[i], "--local-"))
  *          {
  *            g_print ("handling argument %s locally\n", argv[i]);
  *            g_free (argv[i]);
  *            for (j = i; argv[j]; j++)
  *              argv[j] = argv[j + 1];
  *          }
  *        else
  *          {
  *            g_print ("not handling argument %s locally\n", argv[i]);
  *            i++;
  *          }
  *      }
  *
  *    *exit_status = 0;
  *
  *    return FALSE;
  *  }
  *
  *  static void
  *  test_application_class_init (TestApplicationClass *class)
  *  {
  *    G_APPLICATION_CLASS (class)->local_command_line = test_local_cmdline;
  *
  *    ...
  *  }
  *  ]|
  *  In this example of split commandline handling, options that start
  *  with `--local-` are handled locally, all other options are passed
  *  to the #GApplication::command-line handler which runs in the primary
  *  instance.
  *
  *  The complete example can be found here:
  *  [gapplication-example-cmdline2.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-cmdline2.c)
  *
  *  If handling the commandline requires a lot of work, it may
  *  be better to defer it.
  *  |[<!-- language="C" -->
  *  static gboolean
  *  my_cmdline_handler (gpointer data)
  *  {
  *    GApplicationCommandLine *cmdline = data;
  *
  *    // do the heavy lifting in an idle
  *
  *    g_application_command_line_set_exit_status (cmdline, 0);
  *    g_object_unref (cmdline); // this releases the application
  *
  *    return G_SOURCE_REMOVE;
  *  }
  *
  *  static int
  *  command_line (GApplication            *application,
  *                GApplicationCommandLine *cmdline)
  *  {
  *    // keep the application running until we are done with this commandline
  *    g_application_hold (application);
  *
  *    g_object_set_data_full (G_OBJECT (cmdline),
  *                            "application", application,
  *                            (GDestroyNotify)g_application_release);
  *
  *    g_object_ref (cmdline);
  *    g_idle_add (my_cmdline_handler, cmdline);
  *
  *    return 0;
  *  }
  *  ]|
  *  In this example the commandline is not completely handled before
  *  the #GApplication::command-line handler returns. Instead, we keep
  *  a reference to the #GApplicationCommandLine object and handle it
  *  later (in this example, in an idle). Note that it is necessary to
  *  hold the application until you are done with the commandline.
  *
  *  The complete example can be found here:
  *  [gapplication-example-cmdline3.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-cmdline3.c)
  *
  *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
  */
class ApplicationCommandLine private[gnome] (raw: Ptr[GApplicationCommandLine])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Creates a #GFile corresponding to a filename that was given as part of the
    * invocation of @cmdline.
    *
    * This differs from g_file_new_for_commandline_arg() in that it resolves
    * relative pathnames using the current working directory of the invoking
    * process rather than the local process.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def createFileForArg(
      arg: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Runtime): File /* None */ =
    new File.Abstract(
      g_application_command_line_create_file_for_arg(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GApplicationCommandLine]],
        summon[Runtime].inZone(toCString(arg)).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )
  end createFileForArg

  /** Gets the list of arguments that was passed on the command line.
    *
    * The strings in the array may contain non-UTF-8 data on UNIX (such as
    * filenames or arguments given in the system locale) but are always in UTF-8
    * on Windows.
    *
    * If you wish to use the return value with #GOptionContext, you must use
    * g_option_context_parse_strv().
    *
    * The return value is %NULL-terminated and should be freed using
    * g_strfreev().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_arguments]: Method get_arguments contains an OUT parameter, which is not supported yet"
  )
  private def getArguments__ = ???

  /** Gets the working directory of the command line invocation. The string may
    * contain non-utf8 data.
    *
    * It is possible that the remote application did not send a working
    * directory, so this may be %NULL.
    *
    * The return value should not be modified or freed and is valid for as long
    * as @cmdline exists.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCwd(): String /* None */ =
    fromCString(
      g_application_command_line_get_cwd(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GApplicationCommandLine]]
      ).asInstanceOf
    )
  end getCwd

  /** Gets the contents of the 'environ' variable of the command line
    * invocation, as would be returned by g_get_environ(), ie as a
    * %NULL-terminated list of strings in the form 'NAME=VALUE'. The strings may
    * contain non-utf8 data.
    *
    * The remote application usually does not send an environment. Use
    * %G_APPLICATION_SEND_ENVIRONMENT to affect that. Even with this flag set it
    * is possible that the environment is still not available (due to invocation
    * messages from other applications).
    *
    * The return value should not be modified or freed and is valid for as long
    * as @cmdline exists.
    *
    * See g_application_command_line_getenv() if you are only interested in the
    * value of a single environment variable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_environ/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(filename)))),ListMap(@type -> DataRecord(const gchar* const*)))"
  )
  private def getEnviron__ = ???

  /** Gets the exit status of @cmdline. See
    * g_application_command_line_set_exit_status() for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExitStatus(): Int /* None */ =
    g_application_command_line_get_exit_status(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GApplicationCommandLine]]
    )
  end getExitStatus

  /** Determines if @cmdline represents a remote invocation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsRemote(): Boolean /* None */ =
    g_application_command_line_get_is_remote(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GApplicationCommandLine]]
    ).value.!=(0)
  end getIsRemote

  /** Gets the options that were passed to g_application_command_line().
    *
    * If you did not override local_command_line() then these are the same
    * options that were parsed according to the #GOptionEntrys added to the
    * application with g_application_add_main_option_entries() and possibly
    * modified from your GApplication::handle-local-options handler.
    *
    * If no options were sent then an empty dictionary is returned so that you
    * don't need to check for %NULL.
    *
    * The data has been passed via an untrusted external process, so the types
    * of all values must be checked before being used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_options_dict/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.VariantDict), @type -> DataRecord(GVariantDict*)))"
  )
  private def getOptionsDict__ = ???

  /** Gets the platform data associated with the invocation of @cmdline.
    *
    * This is a #GVariant dictionary containing information about the context in
    * which the invocation occurred. It typically contains information like the
    * current working directory and the startup notification ID.
    *
    * It comes from an untrusted external process and hence the types of all
    * values must be validated before being used.
    *
    * For local invocation, it will be %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_platform_data/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def getPlatformData__ = ???

  /** Gets the stdin of the invoking process.
    *
    * The #GInputStream can be used to read data passed to the standard input of
    * the invoking process. This doesn't work on all platforms. Presently, it is
    * only available on UNIX when using a D-Bus daemon capable of passing file
    * descriptors. If stdin is not available then %NULL will be returned. In the
    * future, support may be expanded to other platforms.
    *
    * You must only call this function once per commandline invocation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStdin()(using Runtime): sn.gnome.gio.InputStream /* None */ =
    sn.gnome.gio.InputStream.applyUnsafe(
      g_application_command_line_get_stdin(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GApplicationCommandLine]]
      ).asInstanceOf
    )
  end getStdin

  /** Gets the value of a particular environment variable of the command line
    * invocation, as would be returned by g_getenv(). The strings may contain
    * non-utf8 data.
    *
    * The remote application usually does not send an environment. Use
    * %G_APPLICATION_SEND_ENVIRONMENT to affect that. Even with this flag set it
    * is possible that the environment is still not available (due to invocation
    * messages from other applications).
    *
    * The return value should not be modified or freed and is valid for as long
    * as @cmdline exists.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getenv(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Runtime): String /* None */ =
    fromCString(
      g_application_command_line_getenv(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GApplicationCommandLine]],
        summon[Runtime].inZone(toCString(name)).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )
  end getenv

  /** Formats a message and prints it using the stdout print handler in the
    * invoking process.
    *
    * If @cmdline is a local invocation then this is exactly equivalent to
    * g_print(). If @cmdline is remote then this is equivalent to calling
    * g_print() in the invoking process.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method print/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def print__ = ???

  /** Formats a message and prints it using the stderr print handler in the
    * invoking process.
    *
    * If @cmdline is a local invocation then this is exactly equivalent to
    * g_printerr(). If @cmdline is remote then this is equivalent to calling
    * g_printerr() in the invoking process.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method printerr/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def printerr__ = ???

  /** Sets the exit status that will be used when the invoking process exits.
    *
    * The return value of the #GApplication::command-line signal is passed to
    * this function when the handler returns. This is the usual way of setting
    * the exit status.
    *
    * In the event that you want the remote invocation to continue running and
    * want to decide on the exit status in the future, you can use this call.
    * For the case of a remote invocation, the remote process will typically
    * exit when the last reference is dropped on @cmdline. The exit status of
    * the remote process will be equal to the last value that was set with this
    * function.
    *
    * In the case that the commandline invocation is local, the situation is
    * slightly more complicated. If the commandline invocation results in the
    * mainloop running (ie: because the use-count of the application increased
    * to a non-zero value) then the application is considered to have been
    * 'successful' in a certain sense, and the exit status is always zero. If
    * the application use count is zero, though, the exit status of the local
    * #GApplicationCommandLine is used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setExitStatus(exit_status: Int /* Some(CInt) */ ): Unit /* None */ =
    g_application_command_line_set_exit_status(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GApplicationCommandLine]],
      exit_status
    )
  end setExitStatus

end ApplicationCommandLine

object ApplicationCommandLine:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GApplicationCommandLine])(using Runtime) =
    summon[Runtime].getOrCreate[ApplicationCommandLine](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ApplicationCommandLine(ptr)
    )

end ApplicationCommandLine
