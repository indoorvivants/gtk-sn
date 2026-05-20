package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.cairo.Context
import sn.gnome.gdk4.{ContentProvider, Display, ModifierType, Surface, Texture}
import sn.gnome.gio.AsyncResult
import sn.gnome.glib.{GResult, List}
import sn.gnome.glib.internal.{gboolean, gint, guint, guint32}
import sn.gnome.gobject.{Object, ObjectClass, ParamFlags, ParamSpec, Value}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{
  Accessible,
  AccessibleProperty,
  AccessibleRelation,
  AccessibleRole,
  AccessibleState,
  DebugFlags,
  Expression,
  Native,
  Ordering,
  PageSetup,
  PrintSettings,
  StyleContext,
  TextDirection,
  TreeModel,
  TreePath,
  Widget,
  Window
}
import sn.gnome.pango.{Language, Layout}
import sn.gnome.runtime.*

object Gtk:
  /** Gets the modifier mask.
    *
    * The modifier mask determines which modifiers are considered significant
    * for keyboard accelerators. This includes all keyboard modifiers except for
    * %GDK_LOCK_MASK.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def acceleratorGetDefaultModMask()
      : sn.gnome.gdk4.ModifierType /* Some(_root_.sn.gnome.gdk4.internal.GdkModifierType) */ =
    sn.gnome.gdk4.ModifierType.fromRaw(gtk_accelerator_get_default_mod_mask())

  /** Converts an accelerator keyval and modifier mask into a string which can
    * be used to represent the accelerator to the user.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def acceleratorGetLabel(
      accelerator_key: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      accelerator_mods: sn.gnome.gdk4.ModifierType /* Some(_root_.sn.gnome.gdk4.internal.GdkModifierType) */
  ): scala.Predef.String /* Some(CString) */ = fromCString(
    gtk_accelerator_get_label(
      guint(accelerator_key),
      accelerator_mods.raw
    ).asInstanceOf
  )

  /** Converts an accelerator keyval and modifier mask into a string that can be
    * displayed to the user.
    *
    * The string may be translated.
    *
    * This function is similar to [func@Gtk.accelerator_get_label], but handling
    * keycodes. This is only useful for system-level components, applications
    * should use [func@Gtk.accelerator_get_label] instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def acceleratorGetLabelWithKeycode(
      display: Option[
        sn.gnome.gdk4.Display /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDisplay]) */
      ],
      accelerator_key: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      keycode: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      accelerator_mods: sn.gnome.gdk4.ModifierType /* Some(_root_.sn.gnome.gdk4.internal.GdkModifierType) */
  )(using Runtime): scala.Predef.String /* Some(CString) */ = fromCString(
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

  /** Converts an accelerator keyval and modifier mask into a string parseable
    * by gtk_accelerator_parse().
    *
    * For example, if you pass in %GDK_KEY_q and %GDK_CONTROL_MASK, this
    * function returns `<Control>q`.
    *
    * If you need to display accelerators in the user interface, see
    * [func@Gtk.accelerator_get_label].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def acceleratorName(
      accelerator_key: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      accelerator_mods: sn.gnome.gdk4.ModifierType /* Some(_root_.sn.gnome.gdk4.internal.GdkModifierType) */
  ): scala.Predef.String /* Some(CString) */ = fromCString(
    gtk_accelerator_name(
      guint(accelerator_key),
      accelerator_mods.raw
    ).asInstanceOf
  )

  /** Converts an accelerator keyval and modifier mask into a string parseable
    * by gtk_accelerator_parse_with_keycode().
    *
    * This is similar to [func@Gtk.accelerator_name] but handling keycodes. This
    * is only useful for system-level components, applications should use
    * [func@Gtk.accelerator_name] instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def acceleratorNameWithKeycode(
      display: Option[
        sn.gnome.gdk4.Display /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDisplay]) */
      ],
      accelerator_key: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      keycode: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      accelerator_mods: sn.gnome.gdk4.ModifierType /* Some(_root_.sn.gnome.gdk4.internal.GdkModifierType) */
  )(using Runtime): scala.Predef.String /* Some(CString) */ = fromCString(
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

  /** Parses a string representing an accelerator.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[accelerator_parse:]: Function accelerator_parse contains an OUT parameter, which is not supported yet"
  )
  private def acceleratorParse() = ???

  /** Parses a string representing an accelerator.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[accelerator_parse_with_keycode:]: Function accelerator_parse_with_keycode contains an OUT parameter, which is not supported yet"
  )
  private def acceleratorParseWithKeycode() = ???

  /** Determines whether a given keyval and modifier mask constitute a valid
    * keyboard accelerator.
    *
    * For example, the %GDK_KEY_a keyval plus %GDK_CONTROL_MASK mark is valid,
    * and matches the “Ctrl+a” accelerator. But, you can't, for instance, use
    * the %GDK_KEY_Control_L keyval as an accelerator.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def acceleratorValid(
      keyval: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      modifiers: sn.gnome.gdk4.ModifierType /* Some(_root_.sn.gnome.gdk4.internal.GdkModifierType) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    gtk_accelerator_valid(guint(keyval), modifiers.raw).value.!=(0)

  def accessiblePropertyInitValue(
      property: sn.gnome.gtk4.AccessibleProperty /* Some(GtkAccessibleProperty) */,
      value: sn.gnome.gobject.Value /* Some(Ptr[_root_.sn.gnome.gobject.internal.GValue]) */
  )(using Runtime): Unit /* Some(Unit) */ = gtk_accessible_property_init_value(
    property.raw,
    value.getUnsafeRawPointer().asInstanceOf
  )

  def accessibleRelationInitValue(
      relation: sn.gnome.gtk4.AccessibleRelation /* Some(GtkAccessibleRelation) */,
      value: sn.gnome.gobject.Value /* Some(Ptr[_root_.sn.gnome.gobject.internal.GValue]) */
  )(using Runtime): Unit /* Some(Unit) */ = gtk_accessible_relation_init_value(
    relation.raw,
    value.getUnsafeRawPointer().asInstanceOf
  )

  def accessibleStateInitValue(
      state: sn.gnome.gtk4.AccessibleState /* Some(GtkAccessibleState) */,
      value: sn.gnome.gobject.Value /* Some(Ptr[_root_.sn.gnome.gobject.internal.GValue]) */
  )(using Runtime): Unit /* Some(Unit) */ = gtk_accessible_state_init_value(
    state.raw,
    value.getUnsafeRawPointer().asInstanceOf
  )

  /** Initializes @iter to point to @target.
    *
    * If @target is not found, finds the next value after it. If no value >= @target
    * exists in @set, this function returns %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[bitset_iter_init_at:]: Function bitset_iter_init_at contains an OUT parameter, which is not supported yet"
  )
  private def bitsetIterInitAt() = ???

  /** Initializes an iterator for @set and points it to the first value in @set.
    *
    * If @set is empty, %FALSE is returned and @value is set to %G_MAXUINT.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[bitset_iter_init_first:]: Function bitset_iter_init_first contains an OUT parameter, which is not supported yet"
  )
  private def bitsetIterInitFirst() = ???

  /** Initializes an iterator for @set and points it to the last value in @set.
    *
    * If @set is empty, %FALSE is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[bitset_iter_init_last:]: Function bitset_iter_init_last contains an OUT parameter, which is not supported yet"
  )
  private def bitsetIterInitLast() = ???

  @annotation.compileTimeOnly(
    "[builder_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def builderErrorQuark() = ???

  /** Checks that the GTK library in use is compatible with the given version.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def checkVersion(
      required_major: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      required_minor: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      required_micro: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): scala.Predef.String /* Some(CString) */ = fromCString(
    gtk_check_version(
      guint(required_major),
      guint(required_minor),
      guint(required_micro)
    ).asInstanceOf
  )

  @annotation.compileTimeOnly(
    "[constraint_vfl_parser_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def constraintVflParserErrorQuark() = ???

  @annotation.compileTimeOnly(
    "[css_parser_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def cssParserErrorQuark() = ???

  @annotation.compileTimeOnly(
    "[css_parser_warning_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def cssParserWarningQuark() = ???

  @annotation.compileTimeOnly(
    "[dialog_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def dialogErrorQuark() = ???

  /** Prevents [func@Gtk.init] and [func@Gtk.init_check] from automatically
    * calling `setlocale (LC_ALL, "")`.
    *
    * You would want to use this function if you wanted to set the locale for
    * your program to something other than the user’s locale, or if you wanted
    * to set different values for different locale categories.
    *
    * Most programs should not need to call this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def disableSetlocale(): Unit /* Some(Unit) */ = gtk_disable_setlocale()

  /** Distributes @extra_space to child @sizes by bringing smaller children up
    * to natural size first.
    *
    * The remaining space will be added to the @minimum_size member of the
    * `GtkRequestedSize` struct. If all sizes reach their natural size then the
    * remaining space is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[distribute_natural_allocation:/<function parameters>/sizes]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(RequestedSize), @type -> DataRecord(GtkRequestedSize)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(GtkRequestedSize*)))"
  )
  private def distributeNaturalAllocation() = ???

  /** Gets a property of the `GtkEditable` delegate for @object.
    *
    * This is helper function that should be called in the `get_property`
    * function of your `GtkEditable` implementation, before handling your own
    * properties.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def editableDelegateGetProperty(
      `object`: sn.gnome.gobject.Object /* Some(Ptr[_root_.sn.gnome.gobject.internal.GObject]) */,
      prop_id: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      value: sn.gnome.gobject.Value /* Some(Ptr[_root_.sn.gnome.gobject.internal.GValue]) */,
      pspec: sn.gnome.gobject.ParamSpec /* Some(Ptr[_root_.sn.gnome.gobject.internal.GParamSpec]) */
  )(using Runtime): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    gtk_editable_delegate_get_property(
      `object`.getUnsafeRawPointer().asInstanceOf,
      guint(prop_id),
      value.getUnsafeRawPointer().asInstanceOf,
      pspec.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  /** Sets a property on the `GtkEditable` delegate for @object.
    *
    * This is a helper function that should be called in the `set_property`
    * function of your `GtkEditable` implementation, before handling your own
    * properties.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def editableDelegateSetProperty(
      `object`: sn.gnome.gobject.Object /* Some(Ptr[_root_.sn.gnome.gobject.internal.GObject]) */,
      prop_id: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      value: sn.gnome.gobject.Value /* Some(Ptr[_root_.sn.gnome.gobject.internal.GValue]) */,
      pspec: sn.gnome.gobject.ParamSpec /* Some(Ptr[_root_.sn.gnome.gobject.internal.GParamSpec]) */
  )(using Runtime): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    gtk_editable_delegate_set_property(
      `object`.getUnsafeRawPointer().asInstanceOf,
      guint(prop_id),
      value.getUnsafeRawPointer().asInstanceOf,
      pspec.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  /** Overrides the `GtkEditable` properties for @class.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def editableInstallProperties(
      object_class: sn.gnome.gobject.ObjectClass /* Some(Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]) */,
      first_prop: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ =
    gtk_editable_install_properties(
      object_class.getUnsafeRawPointer().asInstanceOf,
      guint(first_prop)
    ).value

  /** Calls a function for all `GtkPrinter`s.
    *
    * If @func returns %TRUE, the enumeration is stopped.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[enumerate_printers:]: Method gtk_enumerate_printers has no target types"
  )
  private def enumeratePrinters() = ???

  /** Registers an error quark for `GtkFileChooser` errors.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[file_chooser_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def fileChooserErrorQuark() = ???

  /** Returns the binary age as passed to `libtool`.
    *
    * If `libtool` means nothing to you, don't worry about it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBinaryAge(): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ =
    gtk_get_binary_age().value

  /** Returns the GTK debug flags that are currently active.
    *
    * This function is intended for GTK modules that want to adjust their debug
    * output based on GTK debug flags.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDebugFlags(): sn.gnome.gtk4.DebugFlags /* Some(GtkDebugFlags) */ =
    sn.gnome.gtk4.DebugFlags.fromRaw(gtk_get_debug_flags())

  /** Returns the `PangoLanguage` for the default language currently in effect.
    *
    * Note that this can change over the life of an application.
    *
    * The default language is derived from the current locale. It determines,
    * for example, whether GTK uses the right-to-left or left-to-right text
    * direction.
    *
    * This function is equivalent to [func@Pango.Language.get_default]. See that
    * function for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefaultLanguage()
      : sn.gnome.pango.Language /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoLanguage]) */ =
    sn.gnome.pango.Language.fromRaw(gtk_get_default_language())

  /** Returns the interface age as passed to `libtool`.
    *
    * If `libtool` means nothing to you, don't worry about it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInterfaceAge(): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ =
    gtk_get_interface_age().value

  /**  Get the direction of the current locale. This is the expected
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
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def getLocaleDirection()
      : sn.gnome.gtk4.TextDirection /* Some(GtkTextDirection) */ =
    sn.gnome.gtk4.TextDirection.fromRaw(gtk_get_locale_direction())

  /** Returns the major version number of the GTK library.
    *
    * For example, in GTK version 3.1.5 this is 3.
    *
    * This function is in the library, so it represents the GTK library your
    * code is running against. Contrast with the %GTK_MAJOR_VERSION macro, which
    * represents the major version of the GTK headers you have included when
    * compiling your code.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMajorVersion(): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ =
    gtk_get_major_version().value

  /** Returns the micro version number of the GTK library.
    *
    * For example, in GTK version 3.1.5 this is 5.
    *
    * This function is in the library, so it represents the GTK library your
    * code is are running against. Contrast with the %GTK_MICRO_VERSION macro,
    * which represents the micro version of the GTK headers you have included
    * when compiling your code.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMicroVersion(): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ =
    gtk_get_micro_version().value

  /** Returns the minor version number of the GTK library.
    *
    * For example, in GTK version 3.1.5 this is 1.
    *
    * This function is in the library, so it represents the GTK library your
    * code is are running against. Contrast with the %GTK_MINOR_VERSION macro,
    * which represents the minor version of the GTK headers you have included
    * when compiling your code.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMinorVersion(): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ =
    gtk_get_minor_version().value

  /** Converts a color from HSV space to RGB.
    *
    * Input values must be in the [0.0, 1.0] range; output values will be in the
    * same range.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hsv_to_rgb:]: Function hsv_to_rgb contains an OUT parameter, which is not supported yet"
  )
  private def hsvToRgb() = ???

  @annotation.compileTimeOnly(
    "[icon_theme_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def iconThemeErrorQuark() = ???

  /** Call this function before using any other GTK functions in your GUI
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def init(): Unit /* Some(Unit) */ = gtk_init()

  /** This function does the same work as gtk_init() with only a single change:
    * It does not terminate the program if the windowing system can’t be
    * initialized. Instead it returns %FALSE on failure.
    *
    * This way the application can fall back to some other means of
    * communication with the user - for example a curses or command line
    * interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def initCheck(): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    gtk_init_check().value.!=(0)

  /** Use this function to check if GTK has been initialized.
    *
    * See [func@Gtk.init].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isInitialized()
      : Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    gtk_is_initialized().value.!=(0)

  /** Finds the `GtkNative` associated with the surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nativeGetForSurface(
      surface: sn.gnome.gdk4.Surface /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkSurface]) */
  )(using Runtime): sn.gnome.gtk4.Native /* Some(Ptr[GtkNative]) */ =
    new Native.Abstract(
      gtk_native_get_for_surface(
        surface.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

  /** Converts the result of a `GCompareFunc` like strcmp() to a `GtkOrdering`
    * value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def orderingFromCmpfunc(
      cmpfunc_result: Int /* Some(CInt) */
  ): sn.gnome.gtk4.Ordering /* Some(GtkOrdering) */ =
    sn.gnome.gtk4.Ordering.fromRaw(gtk_ordering_from_cmpfunc(cmpfunc_result))

  /** Returns the name of the default paper size, which depends on the current
    * locale.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paperSizeGetDefault(): scala.Predef.String /* Some(CString) */ =
    fromCString(gtk_paper_size_get_default().asInstanceOf)

  /** Creates a list of known paper sizes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paperSizeGetPaperSizes(
      include_custom: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): sn.gnome.glib.List /* Some(Ptr[_root_.sn.gnome.glib.internal.GList]) */ =
    sn.gnome.glib.List.fromRaw(
      gtk_paper_size_get_paper_sizes(
        gboolean(gint((if include_custom == true then 1 else 0)))
      )
    )

  /** Creates a new `GParamSpec` instance for a property holding a
    * `GtkExpression`.
    *
    * See `g_param_spec_internal()` for details on the property strings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paramSpecExpression(
      name: scala.Predef.String /* Some(CString) */,
      nick: scala.Predef.String /* Some(CString) */,
      blurb: scala.Predef.String /* Some(CString) */,
      flags: sn.gnome.gobject.ParamFlags /* Some(_root_.sn.gnome.gobject.internal.GParamFlags) */
  )(using
      Runtime
  ): sn.gnome.gobject.ParamSpec /* Some(Ptr[_root_.sn.gnome.gobject.internal.GParamSpec]) */ =
    sn.gnome.gobject.ParamSpec.applyUnsafe(
      gtk_param_spec_expression(
        summon[Runtime].inZone(toCString(name)),
        summon[Runtime].inZone(toCString(nick)),
        summon[Runtime].inZone(toCString(blurb)),
        flags.raw
      ).asInstanceOf
    )

  /** Registers an error quark for `GtkPrintOperation` if necessary.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[print_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def printErrorQuark() = ???

  /** Runs a page setup dialog, letting the user modify the values from
    * @page_setup.
    *   If the user cancels the dialog, the returned `GtkPageSetup` is identical
    *   to the passed in @page_setup, otherwise it contains the modifications
    *   done in the dialog.
    *
    * Note that this function may use a recursive mainloop to show the page
    * setup dialog. See gtk_print_run_page_setup_dialog_async() if this is a
    * problem.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def printRunPageSetupDialog(
      parent: Option[sn.gnome.gtk4.Window /* Some(Ptr[GtkWindow]) */ ],
      page_setup: Option[
        sn.gnome.gtk4.PageSetup /* Some(Ptr[GtkPageSetup]) */
      ],
      settings: sn.gnome.gtk4.PrintSettings /* Some(Ptr[GtkPrintSettings]) */
  )(using Runtime): sn.gnome.gtk4.PageSetup /* Some(Ptr[GtkPageSetup]) */ =
    sn.gnome.gtk4.PageSetup.applyUnsafe(
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

  /** Runs a page setup dialog, letting the user modify the values from @page_setup.
    *
    * In contrast to gtk_print_run_page_setup_dialog(), this function returns
    * after showing the page setup dialog on platforms that support this, and
    * calls @done_cb from a signal handler for the ::response signal of the
    * dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[print_run_page_setup_dialog_async:/<function parameters>/done_cb]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PageSetupDoneFunc), @type -> DataRecord(GtkPageSetupDoneFunc)))"
  )
  private def printRunPageSetupDialogAsync() = ???

  @annotation.compileTimeOnly(
    "[recent_manager_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def recentManagerErrorQuark() = ???

  /** Renders an activity indicator (such as in `GtkSpinner`). The state
    * %GTK_STATE_FLAG_CHECKED determines whether there is activity going on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def renderActivity(
      context: sn.gnome.gtk4.StyleContext /* Some(Ptr[GtkStyleContext]) */,
      cr: sn.gnome.cairo.Context /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_t]) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */,
      width: Double /* Some(Double) */,
      height: Double /* Some(Double) */
  )(using Runtime): Unit /* Some(Unit) */ = gtk_render_activity(
    context.getUnsafeRawPointer().asInstanceOf,
    cr.getUnsafeRawPointer().asInstanceOf,
    x,
    y,
    width,
    height
  )

  /** Renders an arrow pointing to @angle.
    *
    * Typical arrow rendering at 0, 1⁄2 π;, π; and 3⁄2 π:
    *
    * ![](arrows.png)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def renderArrow(
      context: sn.gnome.gtk4.StyleContext /* Some(Ptr[GtkStyleContext]) */,
      cr: sn.gnome.cairo.Context /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_t]) */,
      angle: Double /* Some(Double) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */,
      size: Double /* Some(Double) */
  )(using Runtime): Unit /* Some(Unit) */ = gtk_render_arrow(
    context.getUnsafeRawPointer().asInstanceOf,
    cr.getUnsafeRawPointer().asInstanceOf,
    angle,
    x,
    y,
    size
  )

  /** Renders the background of an element.
    *
    * Typical background rendering, showing the effect of `background-image`,
    * `border-width` and `border-radius`:
    *
    * ![](background.png)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def renderBackground(
      context: sn.gnome.gtk4.StyleContext /* Some(Ptr[GtkStyleContext]) */,
      cr: sn.gnome.cairo.Context /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_t]) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */,
      width: Double /* Some(Double) */,
      height: Double /* Some(Double) */
  )(using Runtime): Unit /* Some(Unit) */ = gtk_render_background(
    context.getUnsafeRawPointer().asInstanceOf,
    cr.getUnsafeRawPointer().asInstanceOf,
    x,
    y,
    width,
    height
  )

  /** Renders a checkmark (as in a `GtkCheckButton`).
    *
    * The %GTK_STATE_FLAG_CHECKED state determines whether the check is on or
    * off, and %GTK_STATE_FLAG_INCONSISTENT determines whether it should be
    * marked as undefined.
    *
    * Typical checkmark rendering:
    *
    * ![](checks.png)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def renderCheck(
      context: sn.gnome.gtk4.StyleContext /* Some(Ptr[GtkStyleContext]) */,
      cr: sn.gnome.cairo.Context /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_t]) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */,
      width: Double /* Some(Double) */,
      height: Double /* Some(Double) */
  )(using Runtime): Unit /* Some(Unit) */ = gtk_render_check(
    context.getUnsafeRawPointer().asInstanceOf,
    cr.getUnsafeRawPointer().asInstanceOf,
    x,
    y,
    width,
    height
  )

  /** Renders an expander (as used in `GtkTreeView` and `GtkExpander`) in the
    * area defined by @x, @y, @width, @height. The state %GTK_STATE_FLAG_CHECKED
    * determines whether the expander is collapsed or expanded.
    *
    * Typical expander rendering:
    *
    * ![](expanders.png)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def renderExpander(
      context: sn.gnome.gtk4.StyleContext /* Some(Ptr[GtkStyleContext]) */,
      cr: sn.gnome.cairo.Context /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_t]) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */,
      width: Double /* Some(Double) */,
      height: Double /* Some(Double) */
  )(using Runtime): Unit /* Some(Unit) */ = gtk_render_expander(
    context.getUnsafeRawPointer().asInstanceOf,
    cr.getUnsafeRawPointer().asInstanceOf,
    x,
    y,
    width,
    height
  )

  /** Renders a focus indicator on the rectangle determined by @x, @y, @width, @height.
    *
    * Typical focus rendering:
    *
    * ![](focus.png)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def renderFocus(
      context: sn.gnome.gtk4.StyleContext /* Some(Ptr[GtkStyleContext]) */,
      cr: sn.gnome.cairo.Context /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_t]) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */,
      width: Double /* Some(Double) */,
      height: Double /* Some(Double) */
  )(using Runtime): Unit /* Some(Unit) */ = gtk_render_focus(
    context.getUnsafeRawPointer().asInstanceOf,
    cr.getUnsafeRawPointer().asInstanceOf,
    x,
    y,
    width,
    height
  )

  /** Renders a frame around the rectangle defined by @x, @y, @width, @height.
    *
    * Examples of frame rendering, showing the effect of `border-image`,
    * `border-color`, `border-width`, `border-radius` and junctions:
    *
    * ![](frames.png)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def renderFrame(
      context: sn.gnome.gtk4.StyleContext /* Some(Ptr[GtkStyleContext]) */,
      cr: sn.gnome.cairo.Context /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_t]) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */,
      width: Double /* Some(Double) */,
      height: Double /* Some(Double) */
  )(using Runtime): Unit /* Some(Unit) */ = gtk_render_frame(
    context.getUnsafeRawPointer().asInstanceOf,
    cr.getUnsafeRawPointer().asInstanceOf,
    x,
    y,
    width,
    height
  )

  /** Renders a handle (as in `GtkPaned` and `GtkWindow`’s resize grip), in the
    * rectangle determined by @x, @y, @width, @height.
    *
    * Handles rendered for the paned and grip classes:
    *
    * ![](handles.png)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def renderHandle(
      context: sn.gnome.gtk4.StyleContext /* Some(Ptr[GtkStyleContext]) */,
      cr: sn.gnome.cairo.Context /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_t]) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */,
      width: Double /* Some(Double) */,
      height: Double /* Some(Double) */
  )(using Runtime): Unit /* Some(Unit) */ = gtk_render_handle(
    context.getUnsafeRawPointer().asInstanceOf,
    cr.getUnsafeRawPointer().asInstanceOf,
    x,
    y,
    width,
    height
  )

  /** Renders the icon in @texture at the specified @x and @y coordinates.
    *
    * This function will render the icon in @texture at exactly its size,
    * regardless of scaling factors, which may not be appropriate when drawing
    * on displays with high pixel densities.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def renderIcon(
      context: sn.gnome.gtk4.StyleContext /* Some(Ptr[GtkStyleContext]) */,
      cr: sn.gnome.cairo.Context /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_t]) */,
      texture: sn.gnome.gdk4.Texture /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkTexture]) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */
  )(using Runtime): Unit /* Some(Unit) */ = gtk_render_icon(
    context.getUnsafeRawPointer().asInstanceOf,
    cr.getUnsafeRawPointer().asInstanceOf,
    texture.getUnsafeRawPointer().asInstanceOf,
    x,
    y
  )

  /** Renders @layout on the coordinates @x, @y
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def renderLayout(
      context: sn.gnome.gtk4.StyleContext /* Some(Ptr[GtkStyleContext]) */,
      cr: sn.gnome.cairo.Context /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_t]) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */,
      layout: sn.gnome.pango.Layout /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoLayout]) */
  )(using Runtime): Unit /* Some(Unit) */ = gtk_render_layout(
    context.getUnsafeRawPointer().asInstanceOf,
    cr.getUnsafeRawPointer().asInstanceOf,
    x,
    y,
    layout.getUnsafeRawPointer().asInstanceOf
  )

  /** Renders a line from (x0, y0) to (x1, y1).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def renderLine(
      context: sn.gnome.gtk4.StyleContext /* Some(Ptr[GtkStyleContext]) */,
      cr: sn.gnome.cairo.Context /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_t]) */,
      x0: Double /* Some(Double) */,
      y0: Double /* Some(Double) */,
      x1: Double /* Some(Double) */,
      y1: Double /* Some(Double) */
  )(using Runtime): Unit /* Some(Unit) */ = gtk_render_line(
    context.getUnsafeRawPointer().asInstanceOf,
    cr.getUnsafeRawPointer().asInstanceOf,
    x0,
    y0,
    x1,
    y1
  )

  /** Renders an option mark (as in a radio button), the %GTK_STATE_FLAG_CHECKED
    * state will determine whether the option is on or off, and
    * %GTK_STATE_FLAG_INCONSISTENT whether it should be marked as undefined.
    *
    * Typical option mark rendering:
    *
    * ![](options.png)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def renderOption(
      context: sn.gnome.gtk4.StyleContext /* Some(Ptr[GtkStyleContext]) */,
      cr: sn.gnome.cairo.Context /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_t]) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */,
      width: Double /* Some(Double) */,
      height: Double /* Some(Double) */
  )(using Runtime): Unit /* Some(Unit) */ = gtk_render_option(
    context.getUnsafeRawPointer().asInstanceOf,
    cr.getUnsafeRawPointer().asInstanceOf,
    x,
    y,
    width,
    height
  )

  /** Converts a color from RGB space to HSV.
    *
    * Input values must be in the [0.0, 1.0] range; output values will be in the
    * same range.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[rgb_to_hsv:]: Function rgb_to_hsv contains an OUT parameter, which is not supported yet"
  )
  private def rgbToHsv() = ???

  /** Sets the GTK debug flags.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDebugFlags(
      flags: sn.gnome.gtk4.DebugFlags /* Some(GtkDebugFlags) */
  ): Unit /* Some(Unit) */ = gtk_set_debug_flags(flags.raw)

  /** A convenience function for showing an application’s about dialog.
    *
    * The constructed dialog is associated with the parent window and reused for
    * future invocations of this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  inline def showAboutDialog(
      parent: Option[sn.gnome.gtk4.Window /* Some(Ptr[GtkWindow]) */ ],
      first_property_name: scala.Predef.String /* Some(CString) */,
      args: Any*
  )(using Runtime): Unit /* Some(Unit) */ = gtk_show_about_dialog(
    parent
      .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
    summon[Runtime].inZone(toCString(first_property_name)),
    args*
  )

  /** This function launches the default application for showing a given uri, or
    * shows an error dialog if that fails.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def showUri(
      parent: Option[sn.gnome.gtk4.Window /* Some(Ptr[GtkWindow]) */ ],
      uri: scala.Predef.String /* Some(CString) */,
      timestamp: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */
  )(using Runtime): Unit /* Some(Unit) */ = gtk_show_uri(
    parent
      .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
    summon[Runtime].inZone(toCString(uri)),
    guint32(timestamp)
  )

  /** This function launches the default application for showing a given uri.
    *
    * The @callback will be called when the launch is completed. It should call
    * gtk_show_uri_full_finish() to obtain the result.
    *
    * This is the recommended call to be used as it passes information necessary
    * for sandbox helpers to parent their dialogs properly.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[show_uri_full:/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def showUriFull() = ???

  /** Finishes the gtk_show_uri() call and returns the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def showUriFullFinish(
      parent: sn.gnome.gtk4.Window /* Some(Ptr[GtkWindow]) */,
      result: sn.gnome.gio.AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  )(using
      Runtime
  ): GResult[Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ ] =
    GResult.wrap(__errorPtr =>
      gtk_show_uri_full_finish(
        parent.getUnsafeRawPointer().asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def testAccessibleAssertionMessageRole(
      domain: scala.Predef.String /* Some(CString) */,
      file: scala.Predef.String /* Some(CString) */,
      line: Int /* Some(CInt) */,
      func: scala.Predef.String /* Some(CString) */,
      expr: scala.Predef.String /* Some(CString) */,
      accessible: sn.gnome.gtk4.Accessible /* Some(Ptr[GtkAccessible]) */,
      expected_role: sn.gnome.gtk4.AccessibleRole /* Some(GtkAccessibleRole) */,
      actual_role: sn.gnome.gtk4.AccessibleRole /* Some(GtkAccessibleRole) */
  )(using Runtime): Unit /* Some(Unit) */ =
    gtk_test_accessible_assertion_message_role(
      summon[Runtime].inZone(toCString(domain)),
      summon[Runtime].inZone(toCString(file)),
      line,
      summon[Runtime].inZone(toCString(func)),
      summon[Runtime].inZone(toCString(expr)),
      accessible.getUnsafeRawPointer().asInstanceOf,
      expected_role.raw,
      actual_role.raw
    )

  /** Checks whether the accessible @property of @accessible is set to a
    * specific value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  inline def testAccessibleCheckProperty(
      accessible: sn.gnome.gtk4.Accessible /* Some(Ptr[GtkAccessible]) */,
      property: sn.gnome.gtk4.AccessibleProperty /* Some(GtkAccessibleProperty) */,
      args: Any*
  ): scala.Predef.String /* Some(CString) */ = fromCString(
    gtk_test_accessible_check_property(
      accessible.getUnsafeRawPointer().asInstanceOf,
      property.raw,
      args*
    ).asInstanceOf
  )

  /** Checks whether the accessible @relation of @accessible is set to a
    * specific value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  inline def testAccessibleCheckRelation(
      accessible: sn.gnome.gtk4.Accessible /* Some(Ptr[GtkAccessible]) */,
      relation: sn.gnome.gtk4.AccessibleRelation /* Some(GtkAccessibleRelation) */,
      args: Any*
  ): scala.Predef.String /* Some(CString) */ = fromCString(
    gtk_test_accessible_check_relation(
      accessible.getUnsafeRawPointer().asInstanceOf,
      relation.raw,
      args*
    ).asInstanceOf
  )

  /** Checks whether the accessible @state of @accessible is set to a specific
    * value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  inline def testAccessibleCheckState(
      accessible: sn.gnome.gtk4.Accessible /* Some(Ptr[GtkAccessible]) */,
      state: sn.gnome.gtk4.AccessibleState /* Some(GtkAccessibleState) */,
      args: Any*
  ): scala.Predef.String /* Some(CString) */ = fromCString(
    gtk_test_accessible_check_state(
      accessible.getUnsafeRawPointer().asInstanceOf,
      state.raw,
      args*
    ).asInstanceOf
  )

  /** Checks whether the `GtkAccessible` has @property set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testAccessibleHasProperty(
      accessible: sn.gnome.gtk4.Accessible /* Some(Ptr[GtkAccessible]) */,
      property: sn.gnome.gtk4.AccessibleProperty /* Some(GtkAccessibleProperty) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    gtk_test_accessible_has_property(
      accessible.getUnsafeRawPointer().asInstanceOf,
      property.raw
    ).value.!=(0)

  /** Checks whether the `GtkAccessible` has @relation set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testAccessibleHasRelation(
      accessible: sn.gnome.gtk4.Accessible /* Some(Ptr[GtkAccessible]) */,
      relation: sn.gnome.gtk4.AccessibleRelation /* Some(GtkAccessibleRelation) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    gtk_test_accessible_has_relation(
      accessible.getUnsafeRawPointer().asInstanceOf,
      relation.raw
    ).value.!=(0)

  /** Checks whether the `GtkAccessible:accessible-role` of the accessible is @role.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testAccessibleHasRole(
      accessible: sn.gnome.gtk4.Accessible /* Some(Ptr[GtkAccessible]) */,
      role: sn.gnome.gtk4.AccessibleRole /* Some(GtkAccessibleRole) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    gtk_test_accessible_has_role(
      accessible.getUnsafeRawPointer().asInstanceOf,
      role.raw
    ).value.!=(0)

  /** Checks whether the `GtkAccessible` has @state set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testAccessibleHasState(
      accessible: sn.gnome.gtk4.Accessible /* Some(Ptr[GtkAccessible]) */,
      state: sn.gnome.gtk4.AccessibleState /* Some(GtkAccessibleState) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    gtk_test_accessible_has_state(
      accessible.getUnsafeRawPointer().asInstanceOf,
      state.raw
    ).value.!=(0)

  /** This function is used to initialize a GTK test program.
    *
    * It will in turn call g_test_init() and gtk_init() to properly initialize
    * the testing framework and graphical toolkit. It’ll also set the program’s
    * locale to “C”. This is done to make test program environments as
    * deterministic as possible.
    *
    * Like gtk_init() and g_test_init(), any known arguments will be processed
    * and stripped from @argc and @argv.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[test_init:]: Function test_init contains an INOUT parameter, which is not supported yet"
  )
  private def testInit() = ???

  /** Return the type ids that have been registered after calling
    * gtk_test_register_all_types().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[test_list_all_types:]: Function test_list_all_types contains an OUT parameter, which is not supported yet"
  )
  private def testListAllTypes() = ???

  /** Force registration of all core GTK object types.
    *
    * This allows to refer to any of those object types via g_type_from_name()
    * after calling this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testRegisterAllTypes(): Unit /* Some(Unit) */ =
    gtk_test_register_all_types()

  /** Enters the main loop and waits for @widget to be “drawn”.
    *
    * In this context that means it waits for the frame clock of
    * @widget
    *   to have run a full styling, layout and drawing cycle.
    *
    * This function is intended to be used for syncing with actions that depend
    * on @widget relayouting or on interaction with the display server.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testWidgetWaitForDraw(
      widget: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* Some(Unit) */ = gtk_test_widget_wait_for_draw(
    widget.getUnsafeRawPointer().asInstanceOf
  )

  /** Creates a content provider for dragging @path from @tree_model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def treeCreateRowDragContent(
      tree_model: sn.gnome.gtk4.TreeModel /* Some(Ptr[GtkTreeModel]) */,
      path: sn.gnome.gtk4.TreePath /* Some(Ptr[GtkTreePath]) */
  )(using
      Runtime
  ): sn.gnome.gdk4.ContentProvider /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkContentProvider]) */ =
    sn.gnome.gdk4.ContentProvider.applyUnsafe(
      gtk_tree_create_row_drag_content(
        tree_model.getUnsafeRawPointer().asInstanceOf,
        path.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

  /** Obtains a @tree_model and @path from value of target type
    * %GTK_TYPE_TREE_ROW_DATA.
    *
    * The returned path must be freed with gtk_tree_path_free().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[tree_get_row_drag_data:]: Function tree_get_row_drag_data contains an OUT parameter, which is not supported yet"
  )
  private def treeGetRowDragData() = ???

  /** Lets a set of row reference created by gtk_tree_row_reference_new_proxy()
    * know that the model emitted the ::row-deleted signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def treeRowReferenceDeleted(
      proxy: sn.gnome.gobject.Object /* Some(Ptr[_root_.sn.gnome.gobject.internal.GObject]) */,
      path: sn.gnome.gtk4.TreePath /* Some(Ptr[GtkTreePath]) */
  )(using Runtime): Unit /* Some(Unit) */ = gtk_tree_row_reference_deleted(
    proxy.getUnsafeRawPointer().asInstanceOf,
    path.getUnsafeRawPointer().asInstanceOf
  )

  /** Lets a set of row reference created by gtk_tree_row_reference_new_proxy()
    * know that the model emitted the ::row-inserted signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def treeRowReferenceInserted(
      proxy: sn.gnome.gobject.Object /* Some(Ptr[_root_.sn.gnome.gobject.internal.GObject]) */,
      path: sn.gnome.gtk4.TreePath /* Some(Ptr[GtkTreePath]) */
  )(using Runtime): Unit /* Some(Unit) */ = gtk_tree_row_reference_inserted(
    proxy.getUnsafeRawPointer().asInstanceOf,
    path.getUnsafeRawPointer().asInstanceOf
  )

  /** Lets a set of row reference created by gtk_tree_row_reference_new_proxy()
    * know that the model emitted the ::rows-reordered signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[tree_row_reference_reordered:/<function parameters>/new_order]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gint), @type -> DataRecord(int)))),ListMap(@zero-terminated -> DataRecord(0), @type -> DataRecord(int*)))"
  )
  private def treeRowReferenceReordered() = ???

  /** Retrieves the `GtkExpression` stored inside the given `value`, and
    * acquires a reference to it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def valueDupExpression(
      value: sn.gnome.gobject.Value /* Some(Ptr[_root_.sn.gnome.gobject.internal.GValue]) */
  )(using Runtime): sn.gnome.gtk4.Expression /* Some(Ptr[GtkExpression]) */ =
    sn.gnome.gtk4.Expression.applyUnsafe(
      gtk_value_dup_expression(
        value.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

  /** Retrieves the `GtkExpression` stored inside the given `value`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def valueGetExpression(
      value: sn.gnome.gobject.Value /* Some(Ptr[_root_.sn.gnome.gobject.internal.GValue]) */
  )(using Runtime): sn.gnome.gtk4.Expression /* Some(Ptr[GtkExpression]) */ =
    sn.gnome.gtk4.Expression.applyUnsafe(
      gtk_value_get_expression(
        value.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

  /** Stores the given `GtkExpression` inside `value`.
    *
    * The `GValue` will acquire a reference to the `expression`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def valueSetExpression(
      value: sn.gnome.gobject.Value /* Some(Ptr[_root_.sn.gnome.gobject.internal.GValue]) */,
      expression: sn.gnome.gtk4.Expression /* Some(Ptr[GtkExpression]) */
  )(using Runtime): Unit /* Some(Unit) */ = gtk_value_set_expression(
    value.getUnsafeRawPointer().asInstanceOf,
    expression.getUnsafeRawPointer().asInstanceOf
  )

  /** Stores the given `GtkExpression` inside `value`.
    *
    * This function transfers the ownership of the `expression` to the `GValue`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def valueTakeExpression(
      value: sn.gnome.gobject.Value /* Some(Ptr[_root_.sn.gnome.gobject.internal.GValue]) */,
      expression: Option[
        sn.gnome.gtk4.Expression /* Some(Ptr[GtkExpression]) */
      ]
  )(using Runtime): Unit /* Some(Unit) */ = gtk_value_take_expression(
    value.getUnsafeRawPointer().asInstanceOf,
    expression
      .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkExpression]])
  )

  /** An undefined value. The accessible attribute is either unset, or its value
    * is undefined.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val ACCESSIBLE_VALUE_UNDEFINED: Int = -1

  /** Like [func@get_binary_age], but from the headers used at application
    * compile time, rather than from the library linked against at application
    * run time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val BINARY_AGE: Int = 1301
  final val IM_MODULE_EXTENSION_POINT_NAME: scala.Predef.String =
    "gtk-im-module"

  /** Constant to return from a signal handler for the ::input signal in case of
    * conversion failure.
    *
    * See [signal@Gtk.SpinButton::input].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val INPUT_ERROR: Int = -1

  /** Like [func@get_interface_age], but from the headers used at application
    * compile time, rather than from the library linked against at application
    * run time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val INTERFACE_AGE: Int = 0

  /** The value used to refer to a guaranteed invalid position in a
    * `GListModel`.
    *
    * This value may be returned from some functions, others may accept it as
    * input. Its interpretation may differ for different functions.
    *
    * Refer to each function's documentation for if this value is allowed and
    * what it does.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val INVALID_LIST_POSITION: UInt = 4294967295L.toUInt

  /** The name used for the stock full offset included by `GtkLevelBar`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val LEVEL_BAR_OFFSET_FULL: scala.Predef.String = "full"

  /** The name used for the stock high offset included by `GtkLevelBar`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val LEVEL_BAR_OFFSET_HIGH: scala.Predef.String = "high"

  /** The name used for the stock low offset included by `GtkLevelBar`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val LEVEL_BAR_OFFSET_LOW: scala.Predef.String = "low"

  /** Like [func@get_major_version], but from the headers used at application
    * compile time, rather than from the library linked against at application
    * run time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val MAJOR_VERSION: Int = 4
  final val MAX_COMPOSE_LEN: Int = 7
  final val MEDIA_FILE_EXTENSION_POINT_NAME: scala.Predef.String =
    "gtk-media-file"

  /** Like [func@get_micro_version], but from the headers used at application
    * compile time, rather than from the library linked against at application
    * run time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val MICRO_VERSION: Int = 1

  /** Like [func@get_minor_version], but from the headers used at application
    * compile time, rather than from the library linked against at application
    * run time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val MINOR_VERSION: Int = 13

  /** Name for the A3 paper size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PAPER_NAME_A3: scala.Predef.String = "iso_a3"

  /** Name for the A4 paper size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PAPER_NAME_A4: scala.Predef.String = "iso_a4"

  /** Name for the A5 paper size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PAPER_NAME_A5: scala.Predef.String = "iso_a5"

  /** Name for the B5 paper size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PAPER_NAME_B5: scala.Predef.String = "iso_b5"

  /** Name for the Executive paper size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PAPER_NAME_EXECUTIVE: scala.Predef.String = "na_executive"

  /** Name for the Legal paper size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PAPER_NAME_LEGAL: scala.Predef.String = "na_legal"

  /** Name for the Letter paper size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PAPER_NAME_LETTER: scala.Predef.String = "na_letter"
  final val PRINT_SETTINGS_COLLATE: scala.Predef.String = "collate"
  final val PRINT_SETTINGS_DEFAULT_SOURCE: scala.Predef.String =
    "default-source"
  final val PRINT_SETTINGS_DITHER: scala.Predef.String = "dither"
  final val PRINT_SETTINGS_DUPLEX: scala.Predef.String = "duplex"
  final val PRINT_SETTINGS_FINISHINGS: scala.Predef.String = "finishings"
  final val PRINT_SETTINGS_MEDIA_TYPE: scala.Predef.String = "media-type"
  final val PRINT_SETTINGS_NUMBER_UP: scala.Predef.String = "number-up"
  final val PRINT_SETTINGS_NUMBER_UP_LAYOUT: scala.Predef.String =
    "number-up-layout"
  final val PRINT_SETTINGS_N_COPIES: scala.Predef.String = "n-copies"
  final val PRINT_SETTINGS_ORIENTATION: scala.Predef.String = "orientation"

  /** The key used by the “Print to file” printer to store the file name of the
    * output without the path to the directory and the file extension.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PRINT_SETTINGS_OUTPUT_BASENAME: scala.Predef.String =
    "output-basename"
  final val PRINT_SETTINGS_OUTPUT_BIN: scala.Predef.String = "output-bin"

  /** The key used by the “Print to file” printer to store the directory to
    * which the output should be written.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PRINT_SETTINGS_OUTPUT_DIR: scala.Predef.String = "output-dir"

  /** The key used by the “Print to file” printer to store the format of the
    * output. The supported values are “PS” and “PDF”.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PRINT_SETTINGS_OUTPUT_FILE_FORMAT: scala.Predef.String =
    "output-file-format"

  /** The key used by the “Print to file” printer to store the URI to which the
    * output should be written. GTK itself supports only “file://” URIs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PRINT_SETTINGS_OUTPUT_URI: scala.Predef.String = "output-uri"
  final val PRINT_SETTINGS_PAGE_RANGES: scala.Predef.String = "page-ranges"
  final val PRINT_SETTINGS_PAGE_SET: scala.Predef.String = "page-set"
  final val PRINT_SETTINGS_PAPER_FORMAT: scala.Predef.String = "paper-format"
  final val PRINT_SETTINGS_PAPER_HEIGHT: scala.Predef.String = "paper-height"
  final val PRINT_SETTINGS_PAPER_WIDTH: scala.Predef.String = "paper-width"
  final val PRINT_SETTINGS_PRINTER: scala.Predef.String = "printer"
  final val PRINT_SETTINGS_PRINTER_LPI: scala.Predef.String = "printer-lpi"
  final val PRINT_SETTINGS_PRINT_PAGES: scala.Predef.String = "print-pages"
  final val PRINT_SETTINGS_QUALITY: scala.Predef.String = "quality"
  final val PRINT_SETTINGS_RESOLUTION: scala.Predef.String = "resolution"
  final val PRINT_SETTINGS_RESOLUTION_X: scala.Predef.String = "resolution-x"
  final val PRINT_SETTINGS_RESOLUTION_Y: scala.Predef.String = "resolution-y"
  final val PRINT_SETTINGS_REVERSE: scala.Predef.String = "reverse"
  final val PRINT_SETTINGS_SCALE: scala.Predef.String = "scale"
  final val PRINT_SETTINGS_USE_COLOR: scala.Predef.String = "use-color"
  final val PRINT_SETTINGS_WIN32_DRIVER_EXTRA: scala.Predef.String =
    "win32-driver-extra"
  final val PRINT_SETTINGS_WIN32_DRIVER_VERSION: scala.Predef.String =
    "win32-driver-version"

  /** Use this priority for functionality related to size allocation.
    *
    * It is used internally by GTK+ to compute the sizes of widgets. This
    * priority is higher than %GDK_PRIORITY_REDRAW to avoid resizing a widget
    * which was just redrawn.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PRIORITY_RESIZE: Int = 110

  /** A priority that can be used when adding a `GtkStyleProvider` for
    * application-specific style information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val STYLE_PROVIDER_PRIORITY_APPLICATION: Int = 600

  /** The priority used for default style information that is used in the
    * absence of themes.
    *
    * Note that this is not very useful for providing default styling for custom
    * style classes - themes are likely to override styling provided at this
    * priority with catch-all `* {...}` rules.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val STYLE_PROVIDER_PRIORITY_FALLBACK: Int = 1

  /** The priority used for style information provided via `GtkSettings`.
    *
    * This priority is higher than %GTK_STYLE_PROVIDER_PRIORITY_THEME to let
    * settings override themes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val STYLE_PROVIDER_PRIORITY_SETTINGS: Int = 400

  /** The priority used for style information provided by themes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val STYLE_PROVIDER_PRIORITY_THEME: Int = 200

  /** The priority used for the style information from
    * `$XDG_CONFIG_HOME/gtk-4.0/gtk.css`.
    *
    * You should not use priorities higher than this, to give the user the last
    * word.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val STYLE_PROVIDER_PRIORITY_USER: Int = 800

  /** The priority at which the text view validates onscreen lines in an idle
    * job in the background.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val TEXT_VIEW_PRIORITY_VALIDATE: Int = 125

  /** Uses the default sort function in a [iface@Gtk.TreeSortable].
    *
    * See also: [method@Gtk.TreeSortable.set_sort_column_id]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID: Int = -1

  /** Disables sorting in a [iface@Gtk.TreeSortable].
    *
    * See also: [method@Gtk.TreeSortable.set_sort_column_id]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val TREE_SORTABLE_UNSORTED_SORT_COLUMN_ID: Int = -2
end Gtk
