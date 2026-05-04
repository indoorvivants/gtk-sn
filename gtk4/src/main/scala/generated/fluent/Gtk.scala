package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.{Display, ModifierType, Surface}
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint, guint, guint32}
import sn.gnome.gobject.fluent.{ParamFlags, ParamSpec}
import sn.gnome.gtk4.fluent.{
  Accessible,
  AccessibleProperty,
  AccessibleRelation,
  AccessibleRole,
  AccessibleState,
  DebugFlags,
  Native,
  Ordering,
  PageSetup,
  PrintSettings,
  TextDirection,
  Widget,
  Window
}

object Gtk:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the modifier mask.
    *
    * The modifier mask determines which modifiers are considered significant
    * for keyboard accelerators. This includes all keyboard modifiers except for
    * %GDK_LOCK_MASK.
    */
  def acceleratorGetDefaultModMask()
      : ModifierType /* Some(_root_.sn.gnome.gdk4.internal.GdkModifierType) */ =
    ModifierType.fromRaw(gtk_accelerator_get_default_mod_mask())

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts an accelerator keyval and modifier mask into a string which can
    * be used to represent the accelerator to the user.
    */
  def acceleratorGetLabel(
      accelerator_key: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      accelerator_mods: ModifierType /* Some(_root_.sn.gnome.gdk4.internal.GdkModifierType) */
  )(using Zone): String /* Some(CString) */ = fromCString(
    gtk_accelerator_get_label(
      guint(accelerator_key),
      accelerator_mods.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts an accelerator keyval and modifier mask into a string that can be
    * displayed to the user.
    *
    * The string may be translated.
    *
    * This function is similar to [func@Gtk.accelerator_get_label], but handling
    * keycodes. This is only useful for system-level components, applications
    * should use [func@Gtk.accelerator_get_label] instead.
    */
  def acceleratorGetLabelWithKeycode(
      display: Option[
        Display /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDisplay]) */
      ],
      accelerator_key: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      keycode: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      accelerator_mods: ModifierType /* Some(_root_.sn.gnome.gdk4.internal.GdkModifierType) */
  )(using Zone): String /* Some(CString) */ = fromCString(
    gtk_accelerator_get_label_with_keycode(
      display
        .map[Ptr[_root_.sn.gnome.gdk4.internal.GdkDisplay]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gdk4.internal.GdkDisplay]]
        ),
      guint(accelerator_key),
      guint(keycode),
      accelerator_mods.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts an accelerator keyval and modifier mask into a string parseable
    * by gtk_accelerator_parse().
    *
    * For example, if you pass in %GDK_KEY_q and %GDK_CONTROL_MASK, this
    * function returns `<Control>q`.
    *
    * If you need to display accelerators in the user interface, see
    * [func@Gtk.accelerator_get_label].
    */
  def acceleratorName(
      accelerator_key: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      accelerator_mods: ModifierType /* Some(_root_.sn.gnome.gdk4.internal.GdkModifierType) */
  )(using Zone): String /* Some(CString) */ = fromCString(
    gtk_accelerator_name(
      guint(accelerator_key),
      accelerator_mods.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts an accelerator keyval and modifier mask into a string parseable
    * by gtk_accelerator_parse_with_keycode().
    *
    * This is similar to [func@Gtk.accelerator_name] but handling keycodes. This
    * is only useful for system-level components, applications should use
    * [func@Gtk.accelerator_name] instead.
    */
  def acceleratorNameWithKeycode(
      display: Option[
        Display /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDisplay]) */
      ],
      accelerator_key: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      keycode: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      accelerator_mods: ModifierType /* Some(_root_.sn.gnome.gdk4.internal.GdkModifierType) */
  )(using Zone): String /* Some(CString) */ = fromCString(
    gtk_accelerator_name_with_keycode(
      display
        .map[Ptr[_root_.sn.gnome.gdk4.internal.GdkDisplay]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gdk4.internal.GdkDisplay]]
        ),
      guint(accelerator_key),
      guint(keycode),
      accelerator_mods.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Parses a string representing an accelerator.
    *
    * The format looks like “`<Control>a`” or “`<Shift><Alt>F1`”.
    *
    * The parser is fairly liberal and allows lower or upper case, and also
    * abbreviations such as “`<Ctl>`” and “`<Ctrl>`”.
    *
    * Key names are parsed using [func@Gdk.keyval_from_name]. For character keys
    * the name is not the symbol, but the lowercase name, e.g. one would use
    * “`<Ctrl>minus`” instead of “`<Ctrl>-`”.
    *
    * Modifiers are enclosed in angular brackets `<>`, and match the
    * [flags@Gdk.ModifierType] mask:
    *
    *   - `<Shift>` for `GDK_SHIFT_MASK`
    *   - `<Ctrl>` for `GDK_CONTROL_MASK`
    *   - `<Alt>` for `GDK_ALT_MASK`
    *   - `<Meta>` for `GDK_META_MASK`
    *   - `<Super>` for `GDK_SUPER_MASK`
    *   - `<Hyper>` for `GDK_HYPER_MASK`
    *
    * If the parse operation fails, @accelerator_key and @accelerator_mods will
    * be set to 0 (zero).
    */
  @annotation.compileTimeOnly(
    "Function accelerator_parse contains an OUT parameter, which is not supported yet"
  )
  def acceleratorParse() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Parses a string representing an accelerator.
    *
    * This is similar to [func@Gtk.accelerator_parse] but handles keycodes as
    * well. This is only useful for system-level components, applications should
    * use [func@Gtk.accelerator_parse] instead.
    *
    * If @accelerator_codes is given and the result stored in it is non-%NULL,
    * the result must be freed with g_free().
    *
    * If a keycode is present in the accelerator and no @accelerator_codes is
    * given, the parse will fail.
    *
    * If the parse fails, @accelerator_key, @accelerator_mods and
    * @accelerator_codes
    *   will be set to 0 (zero).
    */
  @annotation.compileTimeOnly(
    "Function accelerator_parse_with_keycode contains an OUT parameter, which is not supported yet"
  )
  def acceleratorParseWithKeycode() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines whether a given keyval and modifier mask constitute a valid
    * keyboard accelerator.
    *
    * For example, the %GDK_KEY_a keyval plus %GDK_CONTROL_MASK mark is valid,
    * and matches the “Ctrl+a” accelerator. But, you can't, for instance, use
    * the %GDK_KEY_Control_L keyval as an accelerator.
    */
  def acceleratorValid(
      keyval: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      modifiers: ModifierType /* Some(_root_.sn.gnome.gdk4.internal.GdkModifierType) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    gtk_accelerator_valid(guint(keyval), modifiers.raw).value.!=(0)

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(GValue*)))"
  )
  def accessiblePropertyInitValue() = ???

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(GValue*)))"
  )
  def accessibleRelationInitValue() = ???

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(GValue*)))"
  )
  def accessibleStateInitValue() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Initializes @iter to point to @target.
    *
    * If @target is not found, finds the next value after it. If no value >= @target
    * exists in @set, this function returns %FALSE.
    */
  @annotation.compileTimeOnly(
    "Function bitset_iter_init_at contains an OUT parameter, which is not supported yet"
  )
  def bitsetIterInitAt() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Initializes an iterator for @set and points it to the first value in @set.
    *
    * If @set is empty, %FALSE is returned and @value is set to %G_MAXUINT.
    */
  @annotation.compileTimeOnly(
    "Function bitset_iter_init_first contains an OUT parameter, which is not supported yet"
  )
  def bitsetIterInitFirst() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Initializes an iterator for @set and points it to the last value in @set.
    *
    * If @set is empty, %FALSE is returned.
    */
  @annotation.compileTimeOnly(
    "Function bitset_iter_init_last contains an OUT parameter, which is not supported yet"
  )
  def bitsetIterInitLast() = ???

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def builderErrorQuark() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks that the GTK library in use is compatible with the given version.
    *
    * Generally you would pass in the constants %GTK_MAJOR_VERSION,
    * %GTK_MINOR_VERSION, %GTK_MICRO_VERSION as the three arguments to this
    * function; that produces a check that the library in use is compatible with
    * the version of GTK the application or module was compiled against.
    *
    * Compatibility is defined by two things: first the version of the running
    * library is newer than the version
    * @required_major.required_minor.@required_micro.
    *   Second the running library must be binary compatible with the version @required_major.required_minor.@required_micro
    *   (same major version.)
    *
    * This function is primarily for GTK modules; the module can call this
    * function to check that it wasn’t loaded into an incompatible version of
    * GTK. However, such a check isn’t completely reliable, since the module may
    * be linked against an old version of GTK and calling the old version of
    * gtk_check_version(), but still get loaded into an application using a
    * newer version of GTK.
    */
  def checkVersion(
      required_major: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      required_minor: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      required_micro: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Zone): String /* Some(CString) */ = fromCString(
    gtk_check_version(
      guint(required_major),
      guint(required_minor),
      guint(required_micro)
    ).asInstanceOf
  )

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def constraintVflParserErrorQuark() = ???

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def cssParserErrorQuark() = ???

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def cssParserWarningQuark() = ???

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def dialogErrorQuark() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Prevents [func@Gtk.init] and [func@Gtk.init_check] from automatically
    * calling `setlocale (LC_ALL, "")`.
    *
    * You would want to use this function if you wanted to set the locale for
    * your program to something other than the user’s locale, or if you wanted
    * to set different values for different locale categories.
    *
    * Most programs should not need to call this function.
    */
  def disableSetlocale(): Unit /* Some(Unit) */ = gtk_disable_setlocale()

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Distributes @extra_space to child @sizes by bringing smaller children up
    * to natural size first.
    *
    * The remaining space will be added to the @minimum_size member of the
    * `GtkRequestedSize` struct. If all sizes reach their natural size then the
    * remaining space is returned.
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(RequestedSize), @type -> DataRecord(GtkRequestedSize)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(GtkRequestedSize*)))"
  )
  def distributeNaturalAllocation() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a property of the `GtkEditable` delegate for @object.
    *
    * This is helper function that should be called in the `get_property`
    * function of your `GtkEditable` implementation, before handling your own
    * properties.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(GValue*)))"
  )
  def editableDelegateGetProperty() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a property on the `GtkEditable` delegate for @object.
    *
    * This is a helper function that should be called in the `set_property`
    * function of your `GtkEditable` implementation, before handling your own
    * properties.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(const GValue*)))"
  )
  def editableDelegateSetProperty() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Overrides the `GtkEditable` properties for @class.
    *
    * This is a helper function that should be called in class_init, after
    * installing your own properties.
    *
    * Note that your class must have "text", "cursor-position",
    * "selection-bound", "editable", "width-chars", "max-width-chars", "xalign"
    * and "enable-undo" properties for this function to work.
    *
    * To handle the properties in your set_property and get_property functions,
    * you can either use [func@Gtk.Editable.delegate_set_property] and
    * [func@Gtk.Editable.delegate_get_property] (if you are using a delegate),
    * or remember the @first_prop offset and add it to the values in the
    * [enum@Gtk.EditableProperties] enumeration to get the property IDs for
    * these properties.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.ObjectClass), @type -> DataRecord(GObjectClass*)))"
  )
  def editableInstallProperties() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Calls a function for all `GtkPrinter`s.
    *
    * If @func returns %TRUE, the enumeration is stopped.
    */
  @annotation.compileTimeOnly(
    "Method gtk_enumerate_printers has no target types"
  )
  def enumeratePrinters() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Registers an error quark for `GtkFileChooser` errors.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def fileChooserErrorQuark() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the binary age as passed to `libtool`.
    *
    * If `libtool` means nothing to you, don't worry about it.
    */
  def getBinaryAge(): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ =
    gtk_get_binary_age().value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the GTK debug flags that are currently active.
    *
    * This function is intended for GTK modules that want to adjust their debug
    * output based on GTK debug flags.
    */
  def getDebugFlags(): DebugFlags /* Some(GtkDebugFlags) */ =
    DebugFlags.fromRaw(gtk_get_debug_flags())

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `PangoLanguage` for the default language currently in effect.
    *
    * Note that this can change over the life of an application.
    *
    * The default language is derived from the current locale. It determines,
    * for example, whether GTK uses the right-to-left or left-to-right text
    * direction.
    *
    * This function is equivalent to [func@Pango.Language.get_default]. See that
    * function for details.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.Language), @type -> DataRecord(PangoLanguage*)))"
  )
  def getDefaultLanguage() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the interface age as passed to `libtool`.
    *
    * If `libtool` means nothing to you, don't worry about it.
    */
  def getInterfaceAge(): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ =
    gtk_get_interface_age().value

  /**  COMMENT FOR THE ORIGINAL C DEFINITION
    *
    *  Get the direction of the current locale. This is the expected
    *  reading direction for text and UI.
    *
    *  This function depends on the current locale being set with
    *  setlocale() and will default to setting the %GTK_TEXT_DIR_LTR
    *  direction otherwise. %GTK_TEXT_DIR_NONE will never be returned.
    *
    *  GTK sets the default text direction according to the locale
    *  during gtk_init(), and you should normally use
    *  gtk_widget_get_direction() or gtk_widget_get_default_direction()
    *  to obtain the current direction.
    *
    *  This function is only needed rare cases when the locale is
    *  changed after GTK has already been initialized. In this case,
    *  you can use it to update the default text direction as follows:
    *
    *  |[<!-- language="C" -->
    *  #include <locale.h>
    *
    *  static void
    *  update_locale (const char *new_locale)
    *  {
    *    setlocale (LC_ALL, new_locale);
    *    gtk_widget_set_default_direction (gtk_get_locale_direction ());
    *  }
    *  ]|
    */
  def getLocaleDirection(): TextDirection /* Some(GtkTextDirection) */ =
    TextDirection.fromRaw(gtk_get_locale_direction())

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the major version number of the GTK library.
    *
    * For example, in GTK version 3.1.5 this is 3.
    *
    * This function is in the library, so it represents the GTK library your
    * code is running against. Contrast with the %GTK_MAJOR_VERSION macro, which
    * represents the major version of the GTK headers you have included when
    * compiling your code.
    */
  def getMajorVersion(): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ =
    gtk_get_major_version().value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the micro version number of the GTK library.
    *
    * For example, in GTK version 3.1.5 this is 5.
    *
    * This function is in the library, so it represents the GTK library your
    * code is are running against. Contrast with the %GTK_MICRO_VERSION macro,
    * which represents the micro version of the GTK headers you have included
    * when compiling your code.
    */
  def getMicroVersion(): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ =
    gtk_get_micro_version().value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the minor version number of the GTK library.
    *
    * For example, in GTK version 3.1.5 this is 1.
    *
    * This function is in the library, so it represents the GTK library your
    * code is are running against. Contrast with the %GTK_MINOR_VERSION macro,
    * which represents the minor version of the GTK headers you have included
    * when compiling your code.
    */
  def getMinorVersion(): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ =
    gtk_get_minor_version().value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts a color from HSV space to RGB.
    *
    * Input values must be in the [0.0, 1.0] range; output values will be in the
    * same range.
    */
  @annotation.compileTimeOnly(
    "Function hsv_to_rgb contains an OUT parameter, which is not supported yet"
  )
  def hsvToRgb() = ???

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def iconThemeErrorQuark() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Call this function before using any other GTK functions in your GUI
    * applications. It will initialize everything needed to operate the toolkit.
    *
    * If you are using `GtkApplication`, you usually don't have to call this
    * function; the `GApplication::startup` handler does it for you. Though, if
    * you are using GApplication methods that will be invoked before `startup`,
    * such as `local_command_line`, you may need to initialize stuff explicitly.
    *
    * This function will terminate your program if it was unable to initialize
    * the windowing system for some reason. If you want your program to fall
    * back to a textual interface, call [func@Gtk.init_check] instead.
    *
    * GTK calls `signal (SIGPIPE, SIG_IGN)` during initialization, to ignore
    * SIGPIPE signals, since these are almost never wanted in graphical
    * applications. If you do need to handle SIGPIPE for some reason, reset the
    * handler after gtk_init(), but notice that other libraries (e.g. libdbus or
    * gvfs) might do similar things.
    */
  def init(): Unit /* Some(Unit) */ = gtk_init()

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function does the same work as gtk_init() with only a single change:
    * It does not terminate the program if the windowing system can’t be
    * initialized. Instead it returns %FALSE on failure.
    *
    * This way the application can fall back to some other means of
    * communication with the user - for example a curses or command line
    * interface.
    */
  def initCheck(): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    gtk_init_check().value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Use this function to check if GTK has been initialized.
    *
    * See [func@Gtk.init].
    */
  def isInitialized()
      : Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    gtk_is_initialized().value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finds the `GtkNative` associated with the surface.
    */
  def nativeGetForSurface(
      surface: Surface /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkSurface]) */
  ): Native /* Some(Ptr[GtkNative]) */ = new Native.Abstract(
    gtk_native_get_for_surface(
      surface.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts the result of a `GCompareFunc` like strcmp() to a `GtkOrdering`
    * value.
    */
  def orderingFromCmpfunc(
      cmpfunc_result: Int /* Some(CInt) */
  ): Ordering /* Some(GtkOrdering) */ =
    Ordering.fromRaw(gtk_ordering_from_cmpfunc(cmpfunc_result))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the name of the default paper size, which depends on the current
    * locale.
    */
  def paperSizeGetDefault()(using Zone): String /* Some(CString) */ =
    fromCString(gtk_paper_size_get_default().asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a list of known paper sizes.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(PaperSize))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  def paperSizeGetPaperSizes() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GParamSpec` instance for a property holding a
    * `GtkExpression`.
    *
    * See `g_param_spec_internal()` for details on the property strings.
    */
  def paramSpecExpression(
      name: String | CString /* Some(CString) */,
      nick: String | CString /* Some(CString) */,
      blurb: String | CString /* Some(CString) */,
      flags: ParamFlags /* Some(_root_.sn.gnome.gobject.internal.GParamFlags) */
  )(using
      Zone
  ): ParamSpec /* Some(Ptr[_root_.sn.gnome.gobject.internal.GParamSpec]) */ =
    new ParamSpec(
      gtk_param_spec_expression(
        __sn_extract_string(name),
        __sn_extract_string(nick),
        __sn_extract_string(blurb),
        flags.raw
      ).asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Registers an error quark for `GtkPrintOperation` if necessary.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def printErrorQuark() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Runs a page setup dialog, letting the user modify the values from
    * @page_setup.
    *   If the user cancels the dialog, the returned `GtkPageSetup` is identical
    *   to the passed in @page_setup, otherwise it contains the modifications
    *   done in the dialog.
    *
    * Note that this function may use a recursive mainloop to show the page
    * setup dialog. See gtk_print_run_page_setup_dialog_async() if this is a
    * problem.
    */
  def printRunPageSetupDialog(
      parent: Option[Window /* Some(Ptr[GtkWindow]) */ ],
      page_setup: Option[PageSetup /* Some(Ptr[GtkPageSetup]) */ ],
      settings: PrintSettings /* Some(Ptr[GtkPrintSettings]) */
  ): PageSetup /* Some(Ptr[GtkPageSetup]) */ = new PageSetup(
    gtk_print_run_page_setup_dialog(
      parent
        .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
      page_setup
        .map[Ptr[GtkPageSetup]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkPageSetup]]),
      settings.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Runs a page setup dialog, letting the user modify the values from @page_setup.
    *
    * In contrast to gtk_print_run_page_setup_dialog(), this function returns
    * after showing the page setup dialog on platforms that support this, and
    * calls @done_cb from a signal handler for the ::response signal of the
    * dialog.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(PageSetupDoneFunc), @type -> DataRecord(GtkPageSetupDoneFunc)))"
  )
  def printRunPageSetupDialogAsync() = ???

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def recentManagerErrorQuark() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Renders an activity indicator (such as in `GtkSpinner`). The state
    * %GTK_STATE_FLAG_CHECKED determines whether there is activity going on.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  def renderActivity() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Renders an arrow pointing to @angle.
    *
    * Typical arrow rendering at 0, 1⁄2 π;, π; and 3⁄2 π:
    *
    * ![](arrows.png)
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  def renderArrow() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Renders the background of an element.
    *
    * Typical background rendering, showing the effect of `background-image`,
    * `border-width` and `border-radius`:
    *
    * ![](background.png)
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  def renderBackground() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Renders a checkmark (as in a `GtkCheckButton`).
    *
    * The %GTK_STATE_FLAG_CHECKED state determines whether the check is on or
    * off, and %GTK_STATE_FLAG_INCONSISTENT determines whether it should be
    * marked as undefined.
    *
    * Typical checkmark rendering:
    *
    * ![](checks.png)
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  def renderCheck() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Renders an expander (as used in `GtkTreeView` and `GtkExpander`) in the
    * area defined by @x, @y, @width, @height. The state %GTK_STATE_FLAG_CHECKED
    * determines whether the expander is collapsed or expanded.
    *
    * Typical expander rendering:
    *
    * ![](expanders.png)
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  def renderExpander() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Renders a focus indicator on the rectangle determined by @x, @y, @width, @height.
    *
    * Typical focus rendering:
    *
    * ![](focus.png)
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  def renderFocus() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Renders a frame around the rectangle defined by @x, @y, @width, @height.
    *
    * Examples of frame rendering, showing the effect of `border-image`,
    * `border-color`, `border-width`, `border-radius` and junctions:
    *
    * ![](frames.png)
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  def renderFrame() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Renders a handle (as in `GtkPaned` and `GtkWindow`’s resize grip), in the
    * rectangle determined by @x, @y, @width, @height.
    *
    * Handles rendered for the paned and grip classes:
    *
    * ![](handles.png)
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  def renderHandle() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Renders the icon in @texture at the specified @x and @y coordinates.
    *
    * This function will render the icon in @texture at exactly its size,
    * regardless of scaling factors, which may not be appropriate when drawing
    * on displays with high pixel densities.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  def renderIcon() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Renders @layout on the coordinates @x, @y
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  def renderLayout() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Renders a line from (x0, y0) to (x1, y1).
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  def renderLine() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Renders an option mark (as in a radio button), the %GTK_STATE_FLAG_CHECKED
    * state will determine whether the option is on or off, and
    * %GTK_STATE_FLAG_INCONSISTENT whether it should be marked as undefined.
    *
    * Typical option mark rendering:
    *
    * ![](options.png)
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  def renderOption() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts a color from RGB space to HSV.
    *
    * Input values must be in the [0.0, 1.0] range; output values will be in the
    * same range.
    */
  @annotation.compileTimeOnly(
    "Function rgb_to_hsv contains an OUT parameter, which is not supported yet"
  )
  def rgbToHsv() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the GTK debug flags.
    */
  def setDebugFlags(
      flags: DebugFlags /* Some(GtkDebugFlags) */
  ): Unit /* Some(Unit) */ = gtk_set_debug_flags(flags.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A convenience function for showing an application’s about dialog.
    *
    * The constructed dialog is associated with the parent window and reused for
    * future invocations of this function.
    */
  inline def showAboutDialog(
      parent: Option[Window /* Some(Ptr[GtkWindow]) */ ],
      first_property_name: String | CString /* Some(CString) */,
      args: Any*
  )(using Zone): Unit /* Some(Unit) */ = gtk_show_about_dialog(
    parent
      .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
    __sn_extract_string(first_property_name),
    args*
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function launches the default application for showing a given uri, or
    * shows an error dialog if that fails.
    */
  def showUri(
      parent: Option[Window /* Some(Ptr[GtkWindow]) */ ],
      uri: String | CString /* Some(CString) */,
      timestamp: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */
  )(using Zone): Unit /* Some(Unit) */ = gtk_show_uri(
    parent
      .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
    __sn_extract_string(uri),
    guint32(timestamp)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function launches the default application for showing a given uri.
    *
    * The @callback will be called when the launch is completed. It should call
    * gtk_show_uri_full_finish() to obtain the result.
    *
    * This is the recommended call to be used as it passes information necessary
    * for sandbox helpers to parent their dialogs properly.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  def showUriFull() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes the gtk_show_uri() call and returns the result of the operation.
    */
  def showUriFullFinish(
      parent: Window /* Some(Ptr[GtkWindow]) */,
      result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  ): GResult[Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ ] =
    GResult.wrap(__errorPtr =>
      gtk_show_uri_full_finish(
        parent.getUnsafeRawPointer().asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def testAccessibleAssertionMessageRole(
      domain: String | CString /* Some(CString) */,
      file: String | CString /* Some(CString) */,
      line: Int /* Some(CInt) */,
      func: String | CString /* Some(CString) */,
      expr: String | CString /* Some(CString) */,
      accessible: Accessible /* Some(Ptr[GtkAccessible]) */,
      expected_role: AccessibleRole /* Some(GtkAccessibleRole) */,
      actual_role: AccessibleRole /* Some(GtkAccessibleRole) */
  )(using Zone): Unit /* Some(Unit) */ =
    gtk_test_accessible_assertion_message_role(
      __sn_extract_string(domain),
      __sn_extract_string(file),
      line,
      __sn_extract_string(func),
      __sn_extract_string(expr),
      accessible.getUnsafeRawPointer().asInstanceOf,
      expected_role.raw,
      actual_role.raw
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the accessible @property of @accessible is set to a
    * specific value.
    */
  inline def testAccessibleCheckProperty(
      accessible: Accessible /* Some(Ptr[GtkAccessible]) */,
      property: AccessibleProperty /* Some(GtkAccessibleProperty) */,
      args: Any*
  )(using Zone): String /* Some(CString) */ = fromCString(
    gtk_test_accessible_check_property(
      accessible.getUnsafeRawPointer().asInstanceOf,
      property.raw,
      args*
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the accessible @relation of @accessible is set to a
    * specific value.
    */
  inline def testAccessibleCheckRelation(
      accessible: Accessible /* Some(Ptr[GtkAccessible]) */,
      relation: AccessibleRelation /* Some(GtkAccessibleRelation) */,
      args: Any*
  )(using Zone): String /* Some(CString) */ = fromCString(
    gtk_test_accessible_check_relation(
      accessible.getUnsafeRawPointer().asInstanceOf,
      relation.raw,
      args*
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the accessible @state of @accessible is set to a specific
    * value.
    */
  inline def testAccessibleCheckState(
      accessible: Accessible /* Some(Ptr[GtkAccessible]) */,
      state: AccessibleState /* Some(GtkAccessibleState) */,
      args: Any*
  )(using Zone): String /* Some(CString) */ = fromCString(
    gtk_test_accessible_check_state(
      accessible.getUnsafeRawPointer().asInstanceOf,
      state.raw,
      args*
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the `GtkAccessible` has @property set.
    */
  def testAccessibleHasProperty(
      accessible: Accessible /* Some(Ptr[GtkAccessible]) */,
      property: AccessibleProperty /* Some(GtkAccessibleProperty) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    gtk_test_accessible_has_property(
      accessible.getUnsafeRawPointer().asInstanceOf,
      property.raw
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the `GtkAccessible` has @relation set.
    */
  def testAccessibleHasRelation(
      accessible: Accessible /* Some(Ptr[GtkAccessible]) */,
      relation: AccessibleRelation /* Some(GtkAccessibleRelation) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    gtk_test_accessible_has_relation(
      accessible.getUnsafeRawPointer().asInstanceOf,
      relation.raw
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the `GtkAccessible:accessible-role` of the accessible is @role.
    */
  def testAccessibleHasRole(
      accessible: Accessible /* Some(Ptr[GtkAccessible]) */,
      role: AccessibleRole /* Some(GtkAccessibleRole) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    gtk_test_accessible_has_role(
      accessible.getUnsafeRawPointer().asInstanceOf,
      role.raw
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the `GtkAccessible` has @state set.
    */
  def testAccessibleHasState(
      accessible: Accessible /* Some(Ptr[GtkAccessible]) */,
      state: AccessibleState /* Some(GtkAccessibleState) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    gtk_test_accessible_has_state(
      accessible.getUnsafeRawPointer().asInstanceOf,
      state.raw
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function is used to initialize a GTK test program.
    *
    * It will in turn call g_test_init() and gtk_init() to properly initialize
    * the testing framework and graphical toolkit. It’ll also set the program’s
    * locale to “C”. This is done to make test program environments as
    * deterministic as possible.
    *
    * Like gtk_init() and g_test_init(), any known arguments will be processed
    * and stripped from @argc and @argv.
    */
  @annotation.compileTimeOnly(
    "Function test_init contains an INOUT parameter, which is not supported yet"
  )
  def testInit() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Return the type ids that have been registered after calling
    * gtk_test_register_all_types().
    */
  @annotation.compileTimeOnly(
    "Function test_list_all_types contains an OUT parameter, which is not supported yet"
  )
  def testListAllTypes() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Force registration of all core GTK object types.
    *
    * This allows to refer to any of those object types via g_type_from_name()
    * after calling this function.
    */
  def testRegisterAllTypes(): Unit /* Some(Unit) */ =
    gtk_test_register_all_types()

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Enters the main loop and waits for @widget to be “drawn”.
    *
    * In this context that means it waits for the frame clock of
    * @widget
    *   to have run a full styling, layout and drawing cycle.
    *
    * This function is intended to be used for syncing with actions that depend
    * on @widget relayouting or on interaction with the display server.
    */
  def testWidgetWaitForDraw(
      widget: Widget /* Some(Ptr[GtkWidget]) */
  ): Unit /* Some(Unit) */ = gtk_test_widget_wait_for_draw(
    widget.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a content provider for dragging @path from @tree_model.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  def treeCreateRowDragContent() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains a @tree_model and @path from value of target type
    * %GTK_TYPE_TREE_ROW_DATA.
    *
    * The returned path must be freed with gtk_tree_path_free().
    */
  @annotation.compileTimeOnly(
    "Function tree_get_row_drag_data contains an OUT parameter, which is not supported yet"
  )
  def treeGetRowDragData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Lets a set of row reference created by gtk_tree_row_reference_new_proxy()
    * know that the model emitted the ::row-deleted signal.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  def treeRowReferenceDeleted() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Lets a set of row reference created by gtk_tree_row_reference_new_proxy()
    * know that the model emitted the ::row-inserted signal.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  def treeRowReferenceInserted() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Lets a set of row reference created by gtk_tree_row_reference_new_proxy()
    * know that the model emitted the ::rows-reordered signal.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  def treeRowReferenceReordered() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the `GtkExpression` stored inside the given `value`, and
    * acquires a reference to it.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(const GValue*)))"
  )
  def valueDupExpression() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the `GtkExpression` stored inside the given `value`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(const GValue*)))"
  )
  def valueGetExpression() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Stores the given `GtkExpression` inside `value`.
    *
    * The `GValue` will acquire a reference to the `expression`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(GValue*)))"
  )
  def valueSetExpression() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Stores the given `GtkExpression` inside `value`.
    *
    * This function transfers the ownership of the `expression` to the `GValue`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(GValue*)))"
  )
  def valueTakeExpression() = ???

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Gtk
