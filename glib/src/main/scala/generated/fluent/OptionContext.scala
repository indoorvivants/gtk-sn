package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.OptionGroup
import sn.gnome.glib.internal.{GOptionContext, gboolean, gchar, gint}

/**  The GOption commandline parser is intended to be a simpler replacement
  *  for the popt library. It supports short and long commandline options,
  *  as shown in the following example:
  *
  *  `testtreemodel -r 1 --max-size 20 --rand --display=:1.0 -vb -- file1 file2`
  *
  *  The example demonstrates a number of features of the GOption
  *  commandline parser:
  *
  *  - Options can be single letters, prefixed by a single dash.
  *
  *  - Multiple short options can be grouped behind a single dash.
  *
  *  - Long options are prefixed by two consecutive dashes.
  *
  *  - Options can have an extra argument, which can be a number, a string or
  *    a filename. For long options, the extra argument can be appended with
  *    an equals sign after the option name, which is useful if the extra
  *    argument starts with a dash, which would otherwise cause it to be
  *    interpreted as another option.
  *
  *  - Non-option arguments are returned to the application as rest arguments.
  *
  *  - An argument consisting solely of two dashes turns off further parsing,
  *    any remaining arguments (even those starting with a dash) are returned
  *    to the application as rest arguments.
  *
  *  Another important feature of GOption is that it can automatically
  *  generate nicely formatted help output. Unless it is explicitly turned
  *  off with g_option_context_set_help_enabled(), GOption will recognize
  *  the `--help`, `-?`, `--help-all` and `--help-groupname` options
  *  (where `groupname` is the name of a #GOptionGroup) and write a text
  *  similar to the one shown in the following example to stdout.
  *
  *  |[
  *  Usage:
  *    testtreemodel [OPTION...] - test tree model performance
  *
  *  Help Options:
  *    -h, --help               Show help options
  *    --help-all               Show all help options
  *    --help-gtk               Show GTK Options
  *
  *  Application Options:
  *    -r, --repeats=N          Average over N repetitions
  *    -m, --max-size=M         Test up to 2^M items
  *    --display=DISPLAY        X display to use
  *    -v, --verbose            Be verbose
  *    -b, --beep               Beep when done
  *    --rand                   Randomize the data
  *  ]|
  *
  *  GOption groups options in #GOptionGroups, which makes it easy to
  *  incorporate options from multiple sources. The intended use for this is
  *  to let applications collect option groups from the libraries it uses,
  *  add them to their #GOptionContext, and parse all options by a single call
  *  to g_option_context_parse(). See gtk_get_option_group() for an example.
  *
  *  If an option is declared to be of type string or filename, GOption takes
  *  care of converting it to the right encoding; strings are returned in
  *  UTF-8, filenames are returned in the GLib filename encoding. Note that
  *  this only works if setlocale() has been called before
  *  g_option_context_parse().
  *
  *  Here is a complete example of setting up GOption to parse the example
  *  commandline above and produce the example help output.
  *  |[<!-- language="C" -->
  *  static gint repeats = 2;
  *  static gint max_size = 8;
  *  static gboolean verbose = FALSE;
  *  static gboolean beep = FALSE;
  *  static gboolean randomize = FALSE;
  *
  *  static GOptionEntry entries[] =
  *  {
  *    { "repeats", 'r', 0, G_OPTION_ARG_INT, &repeats, "Average over N repetitions", "N" },
  *    { "max-size", 'm', 0, G_OPTION_ARG_INT, &max_size, "Test up to 2^M items", "M" },
  *    { "verbose", 'v', 0, G_OPTION_ARG_NONE, &verbose, "Be verbose", NULL },
  *    { "beep", 'b', 0, G_OPTION_ARG_NONE, &beep, "Beep when done", NULL },
  *    { "rand", 0, 0, G_OPTION_ARG_NONE, &randomize, "Randomize the data", NULL },
  *    G_OPTION_ENTRY_NULL
  *  };
  *
  *  int
  *  main (int argc, char *argv[])
  *  {
  *    GError *error = NULL;
  *    GOptionContext *context;
  *
  *    context = g_option_context_new ("- test tree model performance");
  *    g_option_context_add_main_entries (context, entries, GETTEXT_PACKAGE);
  *    g_option_context_add_group (context, gtk_get_option_group (TRUE));
  *    if (!g_option_context_parse (context, &argc, &argv, &error))
  *      {
  *        g_print ("option parsing failed: %s\n", error->message);
  *        exit (1);
  *      }
  *
  *    ...
  *
  *  }
  *  ]|
  *
  *  On UNIX systems, the argv that is passed to main() has no particular
  *  encoding, even to the extent that different parts of it may have
  *  different encodings.  In general, normal arguments and flags will be
  *  in the current locale and filenames should be considered to be opaque
  *  byte strings.  Proper use of %G_OPTION_ARG_FILENAME vs
  *  %G_OPTION_ARG_STRING is therefore important.
  *
  *  Note that on Windows, filenames do have an encoding, but using
  *  #GOptionContext with the argv as passed to main() will result in a
  *  program that can only accept commandline arguments with characters
  *  from the system codepage.  This can cause problems when attempting to
  *  deal with filenames containing Unicode characters that fall outside
  *  of the codepage.
  *
  *  A solution to this is to use g_win32_get_command_line() and
  *  g_option_context_parse_strv() which will properly handle full Unicode
  *  filenames.  If you are using #GApplication, this is done
  *  automatically for you.
  *
  *  The following example shows how you can use #GOptionContext directly
  *  in order to correctly deal with Unicode filenames on Windows:
  *
  *  |[<!-- language="C" -->
  *  int
  *  main (int argc, char **argv)
  *  {
  *    GError *error = NULL;
  *    GOptionContext *context;
  *    gchar **args;
  *
  *  #ifdef G_OS_WIN32
  *    args = g_win32_get_command_line ();
  *  #else
  *    args = g_strdupv (argv);
  *  #endif
  *
  *    // set up context
  *
  *    if (!g_option_context_parse_strv (context, &args, &error))
  *      {
  *        // error happened
  *      }
  *
  *    ...
  *
  *    g_strfreev (args);
  *
  *    ...
  *  }
  *  ]|
  *
  *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
  */
class OptionContext private[gnome] (raw: Ptr[GOptionContext]):

  def getUnsafeRawPointer(): Ptr[GOptionContext] = this.raw

  /** Adds a #GOptionGroup to the @context, so that parsing with @context will
    * recognize the options in the group. Note that this will take ownership of
    * the @group and thus the @group should not be freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addGroup(
      group: sn.gnome.glib.OptionGroup /* Some(Ptr[GOptionGroup]) */
  ): Unit /* None */ =
    g_option_context_add_group(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GOptionContext]],
      group.getUnsafeRawPointer().asInstanceOf
    )
  end addGroup

  /** A convenience function which creates a main group if it doesn't exist,
    * adds the @entries to it and sets the translation domain.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_main_entries/<method parameters>/entries]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(OptionEntry), @type -> DataRecord(GOptionEntry)))),ListMap(@type -> DataRecord(const GOptionEntry*)))"
  )
  private def addMainEntries__ = ???

  /** Frees context and all the groups which have been added to it.
    *
    * Please note that parsed arguments need to be freed separately (see
    * #GOptionEntry).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_option_context_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GOptionContext]]
    )
  end free

  /** Returns the description. See g_option_context_set_description().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDescription(): scala.Predef.String /* None */ =
    fromCString(
      g_option_context_get_description(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GOptionContext]]
      ).asInstanceOf
    )
  end getDescription

  /** Returns a formatted, translated help text for the given context. To obtain
    * the text produced by `--help`, call
    * `g_option_context_get_help (context, TRUE, NULL)`. To obtain the text
    * produced by `--help-all`, call
    * `g_option_context_get_help (context, FALSE, NULL)`. To obtain the help
    * text for an option group, call
    * `g_option_context_get_help (context, FALSE, group)`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHelp(
      main_help: Boolean /* Some(gboolean) */,
      group: Option[sn.gnome.glib.OptionGroup /* Some(Ptr[GOptionGroup]) */ ]
  )(using Zone): scala.Predef.String /* None */ =
    fromCString(
      g_option_context_get_help(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GOptionContext]],
        gboolean(gint((if main_help == true then 1 else 0))),
        group
          .map[Ptr[GOptionGroup]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GOptionGroup]])
      ).asInstanceOf
    )
  end getHelp

  /** Returns whether automatic `--help` generation is turned on for @context.
    * See g_option_context_set_help_enabled().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHelpEnabled(): Boolean /* None */ =
    g_option_context_get_help_enabled(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GOptionContext]]
    ).value.!=(0)
  end getHelpEnabled

  /** Returns whether unknown options are ignored or not. See
    * g_option_context_set_ignore_unknown_options().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIgnoreUnknownOptions(): Boolean /* None */ =
    g_option_context_get_ignore_unknown_options(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GOptionContext]]
    ).value.!=(0)
  end getIgnoreUnknownOptions

  /** Returns a pointer to the main group of @context.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMainGroup(): sn.gnome.glib.OptionGroup /* None */ =
    sn.gnome.glib.OptionGroup.fromRaw(
      g_option_context_get_main_group(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GOptionContext]]
      )
    )
  end getMainGroup

  /** Returns whether strict POSIX code is enabled.
    *
    * See g_option_context_set_strict_posix() for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStrictPosix(): Boolean /* None */ =
    g_option_context_get_strict_posix(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GOptionContext]]
    ).value.!=(0)
  end getStrictPosix

  /** Returns the summary. See g_option_context_set_summary().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSummary(): scala.Predef.String /* None */ =
    fromCString(
      g_option_context_get_summary(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GOptionContext]]
      ).asInstanceOf
    )
  end getSummary

  /** Parses the command line arguments, recognizing options which have been
    * added to @context. A side-effect of calling this function is that
    * g_set_prgname() will be called.
    *
    * If the parsing is successful, any parsed arguments are removed from the
    * array and @argc and @argv are updated accordingly. A '--' option is
    * stripped from @argv unless there are unparsed options before and after it,
    * or some of the options after it start with '-'. In case of an error, @argc
    * and @argv are left unmodified.
    *
    * If automatic `--help` support is enabled (see
    * g_option_context_set_help_enabled()), and the
    * @argv
    *   array contains one of the recognized help options, this function will
    *   produce help output to stdout and call `exit (0)`.
    *
    * Note that function depends on the [current locale][setlocale] for
    * automatic character set conversion of string and filename arguments.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method parse]: Method parse contains an INOUT parameter, which is not supported yet"
  )
  private def parse__ = ???

  /** Parses the command line arguments.
    *
    * This function is similar to g_option_context_parse() except that it
    * respects the normal memory rules when dealing with a strv instead of
    * assuming that the passed-in array is the argv of the main function.
    *
    * In particular, strings that are removed from the arguments list will be
    * freed using g_free().
    *
    * On Windows, the strings are expected to be in UTF-8. This is in contrast
    * to g_option_context_parse() which expects them to be in the system
    * codepage, which is how they are passed as @argv to main(). See
    * g_win32_get_command_line() for a solution.
    *
    * This function is useful if you are trying to use #GOptionContext with
    * #GApplication.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method parse_strv]: Method parse_strv contains an INOUT parameter, which is not supported yet"
  )
  private def parseStrv__ = ???

  /** Adds a string to be displayed in `--help` output after the list of
    * options. This text often includes a bug reporting address.
    *
    * Note that the summary is translated (see
    * g_option_context_set_translate_func()).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDescription(
      description: Option[scala.Predef.String /* Some(Ptr[gchar]) */ ]
  )(using Zone): Unit /* None */ =
    g_option_context_set_description(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GOptionContext]],
      description
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]])
    )
  end setDescription

  /** Enables or disables automatic generation of `--help` output. By default,
    * g_option_context_parse() recognizes `--help`, `-h`, `-?`, `--help-all` and
    * `--help-groupname` and creates suitable output to stdout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHelpEnabled(
      help_enabled: Boolean /* Some(gboolean) */
  ): Unit /* None */ =
    g_option_context_set_help_enabled(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GOptionContext]],
      gboolean(gint((if help_enabled == true then 1 else 0)))
    )
  end setHelpEnabled

  /** Sets whether to ignore unknown options or not. If an argument is ignored,
    * it is left in the @argv array after parsing. By default,
    * g_option_context_parse() treats unknown options as error.
    *
    * This setting does not affect non-option arguments (i.e. arguments which
    * don't start with a dash). But note that GOption cannot reliably determine
    * whether a non-option belongs to a preceding unknown option.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIgnoreUnknownOptions(
      ignore_unknown: Boolean /* Some(gboolean) */
  ): Unit /* None */ =
    g_option_context_set_ignore_unknown_options(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GOptionContext]],
      gboolean(gint((if ignore_unknown == true then 1 else 0)))
    )
  end setIgnoreUnknownOptions

  /** Sets a #GOptionGroup as main group of the @context. This has the same
    * effect as calling g_option_context_add_group(), the only difference is
    * that the options in the main group are treated differently when generating
    * `--help` output.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMainGroup(
      group: sn.gnome.glib.OptionGroup /* Some(Ptr[GOptionGroup]) */
  ): Unit /* None */ =
    g_option_context_set_main_group(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GOptionContext]],
      group.getUnsafeRawPointer().asInstanceOf
    )
  end setMainGroup

  /** Sets strict POSIX mode.
    *
    * By default, this mode is disabled.
    *
    * In strict POSIX mode, the first non-argument parameter encountered (eg:
    * filename) terminates argument processing. Remaining arguments are treated
    * as non-options and are not attempted to be parsed.
    *
    * If strict POSIX mode is disabled then parsing is done in the GNU way where
    * option arguments can be freely mixed with non-options.
    *
    * As an example, consider "ls foo -l". With GNU style parsing, this will
    * list "foo" in long mode. In strict POSIX style, this will list the files
    * named "foo" and "-l".
    *
    * It may be useful to force strict POSIX mode when creating "verb style"
    * command line tools. For example, the "gsettings" command line tool
    * supports the global option "--schemadir" as well as many subcommands
    * ("get", "set", etc.) which each have their own set of arguments. Using
    * strict POSIX mode will allow parsing the global options up to the verb
    * name while leaving the remaining options to be parsed by the relevant
    * subcommand (which can be determined by examining the verb name, which
    * should be present in argv[1] after parsing).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setStrictPosix(
      strict_posix: Boolean /* Some(gboolean) */
  ): Unit /* None */ =
    g_option_context_set_strict_posix(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GOptionContext]],
      gboolean(gint((if strict_posix == true then 1 else 0)))
    )
  end setStrictPosix

  /** Adds a string to be displayed in `--help` output before the list of
    * options. This is typically a summary of the program functionality.
    *
    * Note that the summary is translated (see
    * g_option_context_set_translate_func() and
    * g_option_context_set_translation_domain()).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSummary(summary: Option[scala.Predef.String /* Some(Ptr[gchar]) */ ])(
      using Zone
  ): Unit /* None */ =
    g_option_context_set_summary(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GOptionContext]],
      summary
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]])
    )
  end setSummary

  /** Sets the function which is used to translate the contexts user-visible
    * strings, for `--help` output. If @func is %NULL, strings are not
    * translated.
    *
    * Note that option groups have their own translation functions, this
    * function only affects the @parameter_string (see g_option_context_new()),
    * the summary (see g_option_context_set_summary()) and the description (see
    * g_option_context_set_description()).
    *
    * If you are using gettext(), you only need to set the translation domain,
    * see g_option_context_set_translation_domain().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_translate_func/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TranslateFunc), @type -> DataRecord(GTranslateFunc)))"
  )
  private def setTranslateFunc__ = ???

  /** A convenience function to use gettext() for translating user-visible
    * strings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTranslationDomain(
      domain: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): Unit /* None */ =
    g_option_context_set_translation_domain(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GOptionContext]],
      toCString(domain).asInstanceOf[Ptr[gchar]]
    )
  end setTranslationDomain

end OptionContext

object OptionContext:
  def fromRaw(ptr: Ptr[GOptionContext]): OptionContext = new OptionContext(ptr)
end OptionContext
