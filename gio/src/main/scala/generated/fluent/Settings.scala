package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.{
  Action,
  Settings,
  SettingsBackend,
  SettingsBindFlags
}
import sn.gnome.gio.internal.GSettings
import sn.gnome.glib.internal.{
  gboolean,
  gchar,
  gdouble,
  gint,
  gint64,
  gpointer,
  guint,
  guint64
}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*

/**  The #GSettings class provides a convenient API for storing and retrieving
  *  application settings.
  *
  *  Reads and writes can be considered to be non-blocking.  Reading
  *  settings with #GSettings is typically extremely fast: on
  *  approximately the same order of magnitude (but slower than) a
  *  #GHashTable lookup.  Writing settings is also extremely fast in terms
  *  of time to return to your application, but can be extremely expensive
  *  for other threads and other processes.  Many settings backends
  *  (including dconf) have lazy initialisation which means in the common
  *  case of the user using their computer without modifying any settings
  *  a lot of work can be avoided.  For dconf, the D-Bus service doesn't
  *  even need to be started in this case.  For this reason, you should
  *  only ever modify #GSettings keys in response to explicit user action.
  *  Particular care should be paid to ensure that modifications are not
  *  made during startup -- for example, when setting the initial value
  *  of preferences widgets.  The built-in g_settings_bind() functionality
  *  is careful not to write settings in response to notify signals as a
  *  result of modifications that it makes to widgets.
  *
  *  When creating a GSettings instance, you have to specify a schema
  *  that describes the keys in your settings and their types and default
  *  values, as well as some other information.
  *
  *  Normally, a schema has a fixed path that determines where the settings
  *  are stored in the conceptual global tree of settings. However, schemas
  *  can also be '[relocatable][gsettings-relocatable]', i.e. not equipped with
  *  a fixed path. This is
  *  useful e.g. when the schema describes an 'account', and you want to be
  *  able to store a arbitrary number of accounts.
  *
  *  Paths must start with and end with a forward slash character ('/')
  *  and must not contain two sequential slash characters.  Paths should
  *  be chosen based on a domain name associated with the program or
  *  library to which the settings belong.  Examples of paths are
  *  "/org/gtk/settings/file-chooser/" and "/ca/desrt/dconf-editor/".
  *  Paths should not start with "/apps/", "/desktop/" or "/system/" as
  *  they often did in GConf.
  *
  *  Unlike other configuration systems (like GConf), GSettings does not
  *  restrict keys to basic types like strings and numbers. GSettings stores
  *  values as #GVariant, and allows any #GVariantType for keys. Key names
  *  are restricted to lowercase characters, numbers and '-'. Furthermore,
  *  the names must begin with a lowercase character, must not end
  *  with a '-', and must not contain consecutive dashes.
  *
  *  Similar to GConf, the default values in GSettings schemas can be
  *  localized, but the localized values are stored in gettext catalogs
  *  and looked up with the domain that is specified in the
  *  `gettext-domain` attribute of the <schemalist> or <schema>
  *  elements and the category that is specified in the `l10n` attribute of
  *  the <default> element. The string which is translated includes all text in
  *  the <default> element, including any surrounding quotation marks.
  *
  *  The `l10n` attribute must be set to `messages` or `time`, and sets the
  *  [locale category for
  *  translation](https://www.gnu.org/software/gettext/manual/html_node/Aspects.html#index-locale-categories-1).
  *  The `messages` category should be used by default; use `time` for
  *  translatable date or time formats. A translation comment can be added as an
  *  XML comment immediately above the <default> element — it is recommended to
  *  add these comments to aid translators understand the meaning and
  *  implications of the default value. An optional translation `context`
  *  attribute can be set on the <default> element to disambiguate multiple
  *  defaults which use the same string.
  *
  *  For example:
  *  |[
  *   <!-- Translators: A list of words which are not allowed to be typed, in
  *        GVariant serialization syntax.
  *        See: https://developer.gnome.org/glib/stable/gvariant-text.html -->
  *   <default l10n='messages' context='Banned words'>['bad', 'words']</default>
  *  ]|
  *
  *  Translations of default values must remain syntactically valid serialized
  *  #GVariants (e.g. retaining any surrounding quotation marks) or runtime
  *  errors will occur.
  *
  *  GSettings uses schemas in a compact binary form that is created
  *  by the [glib-compile-schemas][glib-compile-schemas]
  *  utility. The input is a schema description in an XML format.
  *
  *  A DTD for the gschema XML format can be found here:
  *  [gschema.dtd](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/gschema.dtd)
  *
  *  The [glib-compile-schemas][glib-compile-schemas] tool expects schema
  *  files to have the extension `.gschema.xml`.
  *
  *  At runtime, schemas are identified by their id (as specified in the
  *  id attribute of the <schema> element). The convention for schema
  *  ids is to use a dotted name, similar in style to a D-Bus bus name,
  *  e.g. "org.gnome.SessionManager". In particular, if the settings are
  *  for a specific service that owns a D-Bus bus name, the D-Bus bus name
  *  and schema id should match. For schemas which deal with settings not
  *  associated with one named application, the id should not use
  *  StudlyCaps, e.g. "org.gnome.font-rendering".
  *
  *  In addition to #GVariant types, keys can have types that have
  *  enumerated types. These can be described by a <choice>,
  *  <enum> or <flags> element, as seen in the
  *  [example][schema-enumerated]. The underlying type of such a key
  *  is string, but you can use g_settings_get_enum(), g_settings_set_enum(),
  *  g_settings_get_flags(), g_settings_set_flags() access the numeric values
  *  corresponding to the string value of enum and flags keys.
  *
  *  An example for default value:
  *  |[
  *  <schemalist>
  *    <schema id="org.gtk.Test" path="/org/gtk/Test/" gettext-domain="test">
  *
  *      <key name="greeting" type="s">
  *        <default l10n="messages">"Hello, earthlings"</default>
  *        <summary>A greeting</summary>
  *        <description>
  *          Greeting of the invading martians
  *        </description>
  *      </key>
  *
  *      <key name="box" type="(ii)">
  *        <default>(20,30)</default>
  *      </key>
  *
  *      <key name="empty-string" type="s">
  *        <default>""</default>
  *        <summary>Empty strings have to be provided in GVariant form</summary>
  *      </key>
  *
  *    </schema>
  *  </schemalist>
  *  ]|
  *
  *  An example for ranges, choices and enumerated types:
  *  |[
  *  <schemalist>
  *
  *    <enum id="org.gtk.Test.myenum">
  *      <value nick="first" value="1"/>
  *      <value nick="second" value="2"/>
  *    </enum>
  *
  *    <flags id="org.gtk.Test.myflags">
  *      <value nick="flag1" value="1"/>
  *      <value nick="flag2" value="2"/>
  *      <value nick="flag3" value="4"/>
  *    </flags>
  *
  *    <schema id="org.gtk.Test">
  *
  *      <key name="key-with-range" type="i">
  *        <range min="1" max="100"/>
  *        <default>10</default>
  *      </key>
  *
  *      <key name="key-with-choices" type="s">
  *        <choices>
  *          <choice value='Elisabeth'/>
  *          <choice value='Annabeth'/>
  *          <choice value='Joe'/>
  *        </choices>
  *        <aliases>
  *          <alias value='Anna' target='Annabeth'/>
  *          <alias value='Beth' target='Elisabeth'/>
  *        </aliases>
  *        <default>'Joe'</default>
  *      </key>
  *
  *      <key name='enumerated-key' enum='org.gtk.Test.myenum'>
  *        <default>'first'</default>
  *      </key>
  *
  *      <key name='flags-key' flags='org.gtk.Test.myflags'>
  *        <default>["flag1","flag2"]</default>
  *      </key>
  *    </schema>
  *  </schemalist>
  *  ]|
  *
  *  ## Vendor overrides
  *
  *  Default values are defined in the schemas that get installed by
  *  an application. Sometimes, it is necessary for a vendor or distributor
  *  to adjust these defaults. Since patching the XML source for the schema
  *  is inconvenient and error-prone,
  *  [glib-compile-schemas][glib-compile-schemas] reads so-called vendor
  *  override' files. These are keyfiles in the same directory as the XML
  *  schema sources which can override default values. The schema id serves
  *  as the group name in the key file, and the values are expected in
  *  serialized GVariant form, as in the following example:
  *  |[
  *      [org.gtk.Example]
  *      key1='string'
  *      key2=1.5
  *  ]|
  *
  *  glib-compile-schemas expects schema files to have the extension
  *  `.gschema.override`.
  *
  *  ## Binding
  *
  *  A very convenient feature of GSettings lets you bind #GObject properties
  *  directly to settings, using g_settings_bind(). Once a GObject property
  *  has been bound to a setting, changes on either side are automatically
  *  propagated to the other side. GSettings handles details like mapping
  *  between GObject and GVariant types, and preventing infinite cycles.
  *
  *  This makes it very easy to hook up a preferences dialog to the
  *  underlying settings. To make this even more convenient, GSettings
  *  looks for a boolean property with the name "sensitivity" and
  *  automatically binds it to the writability of the bound setting.
  *  If this 'magic' gets in the way, it can be suppressed with the
  *  %G_SETTINGS_BIND_NO_SENSITIVITY flag.
  *
  *  ## Relocatable schemas # {#gsettings-relocatable}
  *
  *  A relocatable schema is one with no `path` attribute specified on its
  *  <schema> element. By using g_settings_new_with_path(), a #GSettings object
  *  can be instantiated for a relocatable schema, assigning a path to the
  *  instance. Paths passed to g_settings_new_with_path() will typically be
  *  constructed dynamically from a constant prefix plus some form of instance
  *  identifier; but they must still be valid GSettings paths. Paths could also
  *  be constant and used with a globally installed schema originating from a
  *  dependency library.
  *
  *  For example, a relocatable schema could be used to store geometry information
  *  for different windows in an application. If the schema ID was
  *  `org.foo.MyApp.Window`, it could be instantiated for paths
  *  `/org/foo/MyApp/main/`, `/org/foo/MyApp/document-1/`,
  *  `/org/foo/MyApp/document-2/`, etc. If any of the paths are well-known
  *  they can be specified as <child> elements in the parent schema, e.g.:
  *  |[
  *  <schema id="org.foo.MyApp" path="/org/foo/MyApp/">
  *    <child name="main" schema="org.foo.MyApp.Window"/>
  *  </schema>
  *  ]|
  *
  *  ## Build system integration # {#gsettings-build-system}
  *
  *  GSettings comes with autotools integration to simplify compiling and
  *  installing schemas. To add GSettings support to an application, add the
  *  following to your `configure.ac`:
  *  |[
  *  GLIB_GSETTINGS
  *  ]|
  *
  *  In the appropriate `Makefile.am`, use the following snippet to compile and
  *  install the named schema:
  *  |[
  *  gsettings_SCHEMAS = org.foo.MyApp.gschema.xml
  *  EXTRA_DIST = $(gsettings_SCHEMAS)
  *
  *  @GSETTINGS_RULES@
  *  ]|
  *
  *  No changes are needed to the build system to mark a schema XML file for
  *  translation. Assuming it sets the `gettext-domain` attribute, a schema may
  *  be marked for translation by adding it to `POTFILES.in`, assuming gettext
  *  0.19 is in use (the preferred method for translation):
  *  |[
  *  data/org.foo.MyApp.gschema.xml
  *  ]|
  *
  *  Alternatively, if intltool 0.50.1 is in use:
  *  |[
  *  [type: gettext/gsettings]data/org.foo.MyApp.gschema.xml
  *  ]|
  *
  *  GSettings will use gettext to look up translations for the <summary> and
  *  <description> elements, and also any <default> elements which have a `l10n`
  *  attribute set. Translations must not be included in the `.gschema.xml` file
  *  by the build system, for example by using intltool XML rules with a
  *  `.gschema.xml.in` template.
  *
  *  If an enumerated type defined in a C header file is to be used in a GSettings
  *  schema, it can either be defined manually using an <enum> element in the
  *  schema XML, or it can be extracted automatically from the C header. This
  *  approach is preferred, as it ensures the two representations are always
  *  synchronised. To do so, add the following to the relevant `Makefile.am`:
  *  |[
  *  gsettings_ENUM_NAMESPACE = org.foo.MyApp
  *  gsettings_ENUM_FILES = my-app-enums.h my-app-misc.h
  *  ]|
  *
  *  `gsettings_ENUM_NAMESPACE` specifies the schema namespace for the enum files,
  *  which are specified in `gsettings_ENUM_FILES`. This will generate a
  *  `org.foo.MyApp.enums.xml` file containing the extracted enums, which will be
  *  automatically included in the schema compilation, install and uninstall
  *  rules. It should not be committed to version control or included in
  *  `EXTRA_DIST`.
  *
  *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
  */
class Settings(raw: Ptr[GSettings]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Applies any changes that have been made to the settings. This function
    * does nothing unless @settings is in 'delay-apply' mode; see
    * g_settings_delay(). In the normal case settings are always applied
    * immediately.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): Unit /* None */ = g_settings_apply(
    this.raw.asInstanceOf[Ptr[GSettings]]
  )

  /** Create a binding between the @key in the @settings object and the property @property
    * of @object.
    *
    * The binding uses the default GIO mapping functions to map between the
    * settings and property values. These functions handle booleans, numeric
    * types and string types in a straightforward way. Use
    * g_settings_bind_with_mapping() if you need a custom mapping, or map
    * between types that are not supported by the default mapping functions.
    *
    * Unless the @flags include %G_SETTINGS_BIND_NO_SENSITIVITY, this function
    * also establishes a binding between the writability of
    * @key
    *   and the "sensitive" property of @object (if @object has a boolean
    *   property by that name). See g_settings_bind_writable() for more details
    *   about writable bindings.
    *
    * Note that the lifecycle of the binding is tied to @object, and that you
    * can have only one binding per object property. If you bind the same
    * property twice on the same object, the second binding overrides the first
    * one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def bind(
      key: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      `object`: Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      property: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      flags: SettingsBindFlags /* Some(GSettingsBindFlags) */
  )(using Zone): Unit /* None */ = g_settings_bind(
    this.raw.asInstanceOf[Ptr[GSettings]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    `object`.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(property).asInstanceOf[Ptr[gchar]],
    flags.raw
  )

  /** Create a binding between the @key in the @settings object and the property @property
    * of @object.
    *
    * The binding uses the provided mapping functions to map between settings
    * and property values.
    *
    * Note that the lifecycle of the binding is tied to @object, and that you
    * can have only one binding per object property. If you bind the same
    * property twice on the same object, the second binding overrides the first
    * one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method bind_with_mapping/<method parameters>/get_mapping]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SettingsBindGetMapping), @type -> DataRecord(GSettingsBindGetMapping)))"
  )
  private def bindWithMapping__ = ???

  /** Create a binding between the writability of @key in the
    * @settings
    *   object and the property @property of @object. The property must be
    *   boolean; "sensitive" or "visible" properties of widgets are the most
    *   likely candidates.
    *
    * Writable bindings are always uni-directional; changes of the writability
    * of the setting will be propagated to the object property, not the other
    * way.
    *
    * When the @inverted argument is %TRUE, the binding inverts the value as it
    * passes from the setting to the object, i.e. @property will be set to %TRUE
    * if the key is not writable.
    *
    * Note that the lifecycle of the binding is tied to @object, and that you
    * can have only one binding per object property. If you bind the same
    * property twice on the same object, the second binding overrides the first
    * one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def bindWritable(
      key: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      `object`: Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      property: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      inverted: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Zone): Unit /* None */ = g_settings_bind_writable(
    this.raw.asInstanceOf[Ptr[GSettings]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    `object`.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(property).asInstanceOf[Ptr[gchar]],
    gboolean(gint((if inverted == true then 1 else 0)))
  )

  /** Creates a #GAction corresponding to a given #GSettings key.
    *
    * The action has the same name as the key.
    *
    * The value of the key becomes the state of the action and the action is
    * enabled when the key is writable. Changing the state of the action results
    * in the key being written to. Changes to the value or writability of the
    * key cause appropriate change notifications to be emitted for the action.
    *
    * For boolean-valued keys, action activations take no parameter and result
    * in the toggling of the value. For all other types, activations take the
    * new value for the key (which must have the correct type).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def createAction(
      key: String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Action /* None */ = new Action.Abstract(
    g_settings_create_action(
      this.raw.asInstanceOf[Ptr[GSettings]],
      __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Changes the #GSettings object into 'delay-apply' mode. In this mode,
    * changes to @settings are not immediately propagated to the backend, but
    * kept locally until g_settings_apply() is called.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def delay(): Unit /* None */ = g_settings_delay(
    this.raw.asInstanceOf[Ptr[GSettings]]
  )

  /** Gets the value that is stored at @key in @settings.
    *
    * A convenience function that combines g_settings_get_value() with
    * g_variant_get().
    *
    * It is a programmer error to give a @key that isn't contained in the schema
    * for @settings or for the #GVariantType of @format to mismatch the type
    * given in the schema.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  inline def get(
      key: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      format: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      args: Any*
  )(using Zone): Unit /* None */ = g_settings_get(
    this.raw.asInstanceOf[Ptr[GSettings]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(format).asInstanceOf[Ptr[gchar]],
    args*
  )

  /** Gets the value that is stored at @key in @settings.
    *
    * A convenience variant of g_settings_get() for booleans.
    *
    * It is a programmer error to give a @key that isn't specified as having a
    * boolean type in the schema for @settings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBoolean(
      key: String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* None */ = g_settings_get_boolean(
    this.raw.asInstanceOf[Ptr[GSettings]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
  ).value.!=(0)

  /** Creates a child settings object which has a base path of
    * `base-path/@name`, where `base-path` is the base path of
    * @settings.
    *
    * The schema for the child settings object must have been declared in the
    * schema of @settings using a `<child>` element.
    *
    * The created child settings object will inherit the #GSettings:delay-apply
    * mode from @settings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Settings /* None */ = new Settings(
    g_settings_get_child(
      this.raw.asInstanceOf[Ptr[GSettings]],
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Gets the "default value" of a key.
    *
    * This is the value that would be read if g_settings_reset() were to be
    * called on the key.
    *
    * Note that this may be a different value than returned by
    * g_settings_schema_key_get_default_value() if the system administrator has
    * provided a default value.
    *
    * Comparing the return values of g_settings_get_default_value() and
    * g_settings_get_value() is not sufficient for determining if a value has
    * been set because the user may have explicitly set the value to something
    * that happens to be equal to the default. The difference here is that if
    * the default changes in the future, the user's key will still be set.
    *
    * This function may be useful for adding an indication to a UI of what the
    * default value was before the user set it.
    *
    * It is a programmer error to give a @key that isn't contained in the schema
    * for @settings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_default_value/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def getDefaultValue__ = ???

  /** Gets the value that is stored at @key in @settings.
    *
    * A convenience variant of g_settings_get() for doubles.
    *
    * It is a programmer error to give a @key that isn't specified as having a
    * 'double' type in the schema for @settings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDouble(
      key: String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Double /* None */ = g_settings_get_double(
    this.raw.asInstanceOf[Ptr[GSettings]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
  ).value

  /** Gets the value that is stored in @settings for @key and converts it to the
    * enum value that it represents.
    *
    * In order to use this function the type of the value must be a string and
    * it must be marked in the schema file as an enumerated type.
    *
    * It is a programmer error to give a @key that isn't contained in the schema
    * for @settings or is not marked as an enumerated type.
    *
    * If the value stored in the configuration database is not a valid value for
    * the enumerated type then this function will return the default value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEnum(
      key: String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Int /* None */ = g_settings_get_enum(
    this.raw.asInstanceOf[Ptr[GSettings]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
  ).value

  /** Gets the value that is stored in @settings for @key and converts it to the
    * flags value that it represents.
    *
    * In order to use this function the type of the value must be an array of
    * strings and it must be marked in the schema file as a flags type.
    *
    * It is a programmer error to give a @key that isn't contained in the schema
    * for @settings or is not marked as a flags type.
    *
    * If the value stored in the configuration database is not a valid value for
    * the flags type then this function will return the default value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFlags(
      key: String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): UInt /* None */ = g_settings_get_flags(
    this.raw.asInstanceOf[Ptr[GSettings]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
  ).value

  /** Returns whether the #GSettings object has any unapplied changes. This can
    * only be the case if it is in 'delayed-apply' mode.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHasUnapplied(): Boolean /* None */ = g_settings_get_has_unapplied(
    this.raw.asInstanceOf[Ptr[GSettings]]
  ).value.!=(0)

  /** Gets the value that is stored at @key in @settings.
    *
    * A convenience variant of g_settings_get() for 32-bit integers.
    *
    * It is a programmer error to give a @key that isn't specified as having a
    * int32 type in the schema for @settings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInt(
      key: String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Int /* None */ = g_settings_get_int(
    this.raw.asInstanceOf[Ptr[GSettings]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
  ).value

  /** Gets the value that is stored at @key in @settings.
    *
    * A convenience variant of g_settings_get() for 64-bit integers.
    *
    * It is a programmer error to give a @key that isn't specified as having a
    * int64 type in the schema for @settings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInt64(
      key: String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): CLongInt /* None */ = g_settings_get_int64(
    this.raw.asInstanceOf[Ptr[GSettings]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
  ).value

  /** Gets the value that is stored at @key in @settings, subject to
    * application-level validation/mapping.
    *
    * You should use this function when the application needs to perform some
    * processing on the value of the key (for example, parsing). The
    * @mapping
    *   function performs that processing. If the function indicates that the
    *   processing was unsuccessful (due to a parse error, for example) then the
    *   mapping is tried again with another value.
    *
    * This allows a robust 'fall back to defaults' behaviour to be implemented
    * somewhat automatically.
    *
    * The first value that is tried is the user's setting for the key. If the
    * mapping function fails to map this value, other values may be tried in an
    * unspecified order (system or site defaults, translated schema default
    * values, untranslated schema default values, etc).
    *
    * If the mapping function fails for all possible values, one additional
    * attempt is made: the mapping function is called with a %NULL value. If the
    * mapping function still indicates failure at this point then the
    * application will be aborted.
    *
    * The result parameter for the @mapping function is pointed to a #gpointer
    * which is initially set to %NULL. The same pointer is given to each
    * invocation of @mapping. The final value of that #gpointer is what is
    * returned by this function. %NULL is valid; it is returned just as any
    * other value would be.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_mapped/<method parameters>/mapping]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SettingsGetMapping), @type -> DataRecord(GSettingsGetMapping)))"
  )
  private def getMapped__ = ???

  /** Queries the range of a key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_range/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def getRange__ = ???

  /** Gets the value that is stored at @key in @settings.
    *
    * A convenience variant of g_settings_get() for strings.
    *
    * It is a programmer error to give a @key that isn't specified as having a
    * string type in the schema for @settings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getString(
      key: String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): String /* None */ = fromCString(
    g_settings_get_string(
      this.raw.asInstanceOf[Ptr[GSettings]],
      __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** A convenience variant of g_settings_get() for string arrays.
    *
    * It is a programmer error to give a @key that isn't specified as having an
    * array of strings type in the schema for @settings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_strv/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def getStrv__ = ???

  /** Gets the value that is stored at @key in @settings.
    *
    * A convenience variant of g_settings_get() for 32-bit unsigned integers.
    *
    * It is a programmer error to give a @key that isn't specified as having a
    * uint32 type in the schema for @settings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUint(
      key: String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): UInt /* None */ = g_settings_get_uint(
    this.raw.asInstanceOf[Ptr[GSettings]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
  ).value

  /** Gets the value that is stored at @key in @settings.
    *
    * A convenience variant of g_settings_get() for 64-bit unsigned integers.
    *
    * It is a programmer error to give a @key that isn't specified as having a
    * uint64 type in the schema for @settings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUint64(
      key: String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): CUnsignedLongInt /* None */ = g_settings_get_uint64(
    this.raw.asInstanceOf[Ptr[GSettings]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
  ).value

  /** Checks the "user value" of a key, if there is one.
    *
    * The user value of a key is the last value that was set by the user.
    *
    * After calling g_settings_reset() this function should always return %NULL
    * (assuming something is not wrong with the system configuration).
    *
    * It is possible that g_settings_get_value() will return a different value
    * than this function. This can happen in the case that the user set a value
    * for a key that was subsequently locked down by the system administrator --
    * this function will return the user's old value.
    *
    * This function may be useful for adding a "reset" option to a UI or for
    * providing indication that a particular value has been changed.
    *
    * It is a programmer error to give a @key that isn't contained in the schema
    * for @settings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_user_value/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def getUserValue__ = ???

  /** Gets the value that is stored in @settings for @key.
    *
    * It is a programmer error to give a @key that isn't contained in the schema
    * for @settings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_value/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def getValue__ = ???

  /** Finds out if a key can be written or not
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isWritable(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* None */ = g_settings_is_writable(
    this.raw.asInstanceOf[Ptr[GSettings]],
    __sn_extract_string(name).asInstanceOf[Ptr[gchar]]
  ).value.!=(0)

  /** Gets the list of children on @settings.
    *
    * The list is exactly the list of strings for which it is not an error to
    * call g_settings_get_child().
    *
    * There is little reason to call this function from "normal" code, since you
    * should already know what children are in your schema. This function may
    * still be useful there for introspection reasons, however.
    *
    * You should free the return value with g_strfreev() when you are done with
    * it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method list_children/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def listChildren__ = ???

  /** Introspects the list of keys on @settings.
    *
    * You should probably not be calling this function from "normal" code (since
    * you should already know what keys are in your schema). This function is
    * intended for introspection reasons.
    *
    * You should free the return value with g_strfreev() when you are done with
    * it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method list_keys/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def listKeys__ = ???

  /** Checks if the given @value is of the correct type and within the permitted
    * range for @key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method range_check/<method parameters>/value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def rangeCheck__ = ???

  /** Resets @key to its default value.
    *
    * This call resets the key, as much as possible, to its default value. That
    * might be the value specified in the schema or the one set by the
    * administrator.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def reset(
      key: String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ = g_settings_reset(
    this.raw.asInstanceOf[Ptr[GSettings]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
  )

  /** Reverts all non-applied changes to the settings. This function does
    * nothing unless @settings is in 'delay-apply' mode; see g_settings_delay().
    * In the normal case settings are always applied immediately.
    *
    * Change notifications will be emitted for affected keys.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def revert(): Unit /* None */ = g_settings_revert(
    this.raw.asInstanceOf[Ptr[GSettings]]
  )

  /** Sets @key in @settings to @value.
    *
    * A convenience function that combines g_settings_set_value() with
    * g_variant_new().
    *
    * It is a programmer error to give a @key that isn't contained in the schema
    * for @settings or for the #GVariantType of @format to mismatch the type
    * given in the schema.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  inline def set(
      key: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      format: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      args: Any*
  )(using Zone): Boolean /* None */ = g_settings_set(
    this.raw.asInstanceOf[Ptr[GSettings]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(format).asInstanceOf[Ptr[gchar]],
    args*
  ).value.!=(0)

  /** Sets @key in @settings to @value.
    *
    * A convenience variant of g_settings_set() for booleans.
    *
    * It is a programmer error to give a @key that isn't specified as having a
    * boolean type in the schema for @settings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBoolean(
      key: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      value: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Zone): Boolean /* None */ = g_settings_set_boolean(
    this.raw.asInstanceOf[Ptr[GSettings]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    gboolean(gint((if value == true then 1 else 0)))
  ).value.!=(0)

  /** Sets @key in @settings to @value.
    *
    * A convenience variant of g_settings_set() for doubles.
    *
    * It is a programmer error to give a @key that isn't specified as having a
    * 'double' type in the schema for @settings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDouble(
      key: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      value: Double /* Some(_root_.sn.gnome.glib.internal.gdouble) */
  )(using Zone): Boolean /* None */ = g_settings_set_double(
    this.raw.asInstanceOf[Ptr[GSettings]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    gdouble(value)
  ).value.!=(0)

  /** Looks up the enumerated type nick for @value and writes it to @key, within @settings.
    *
    * It is a programmer error to give a @key that isn't contained in the schema
    * for @settings or is not marked as an enumerated type, or for
    * @value
    *   not to be a valid value for the named type.
    *
    * After performing the write, accessing @key directly with
    * g_settings_get_string() will return the 'nick' associated with
    * @value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEnum(
      key: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      value: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  )(using Zone): Boolean /* None */ = g_settings_set_enum(
    this.raw.asInstanceOf[Ptr[GSettings]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    gint(value)
  ).value.!=(0)

  /** Looks up the flags type nicks for the bits specified by @value, puts them
    * in an array of strings and writes the array to @key, within
    * @settings.
    *
    * It is a programmer error to give a @key that isn't contained in the schema
    * for @settings or is not marked as a flags type, or for @value to contain
    * any bits that are not value for the named type.
    *
    * After performing the write, accessing @key directly with
    * g_settings_get_strv() will return an array of 'nicks'; one for each bit in @value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFlags(
      key: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      value: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Zone): Boolean /* None */ = g_settings_set_flags(
    this.raw.asInstanceOf[Ptr[GSettings]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    guint(value)
  ).value.!=(0)

  /** Sets @key in @settings to @value.
    *
    * A convenience variant of g_settings_set() for 32-bit integers.
    *
    * It is a programmer error to give a @key that isn't specified as having a
    * int32 type in the schema for @settings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInt(
      key: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      value: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  )(using Zone): Boolean /* None */ = g_settings_set_int(
    this.raw.asInstanceOf[Ptr[GSettings]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    gint(value)
  ).value.!=(0)

  /** Sets @key in @settings to @value.
    *
    * A convenience variant of g_settings_set() for 64-bit integers.
    *
    * It is a programmer error to give a @key that isn't specified as having a
    * int64 type in the schema for @settings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInt64(
      key: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      value: CLongInt /* Some(_root_.sn.gnome.glib.internal.gint64) */
  )(using Zone): Boolean /* None */ = g_settings_set_int64(
    this.raw.asInstanceOf[Ptr[GSettings]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    gint64(value)
  ).value.!=(0)

  /** Sets @key in @settings to @value.
    *
    * A convenience variant of g_settings_set() for strings.
    *
    * It is a programmer error to give a @key that isn't specified as having a
    * string type in the schema for @settings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setString(
      key: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      value: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* None */ = g_settings_set_string(
    this.raw.asInstanceOf[Ptr[GSettings]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(value).asInstanceOf[Ptr[gchar]]
  ).value.!=(0)

  /** Sets @key in @settings to @value.
    *
    * A convenience variant of g_settings_set() for string arrays. If
    * @value
    *   is %NULL, then @key is set to be the empty array.
    *
    * It is a programmer error to give a @key that isn't specified as having an
    * array of strings type in the schema for @settings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_strv/<method parameters>/value]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar*)))),ListMap(@type -> DataRecord(const gchar* const*)))"
  )
  private def setStrv__ = ???

  /** Sets @key in @settings to @value.
    *
    * A convenience variant of g_settings_set() for 32-bit unsigned integers.
    *
    * It is a programmer error to give a @key that isn't specified as having a
    * uint32 type in the schema for @settings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUint(
      key: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      value: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Zone): Boolean /* None */ = g_settings_set_uint(
    this.raw.asInstanceOf[Ptr[GSettings]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    guint(value)
  ).value.!=(0)

  /** Sets @key in @settings to @value.
    *
    * A convenience variant of g_settings_set() for 64-bit unsigned integers.
    *
    * It is a programmer error to give a @key that isn't specified as having a
    * uint64 type in the schema for @settings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUint64(
      key: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      value: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.guint64) */
  )(using Zone): Boolean /* None */ = g_settings_set_uint64(
    this.raw.asInstanceOf[Ptr[GSettings]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    guint64(value)
  ).value.!=(0)

  /** Sets @key in @settings to @value.
    *
    * It is a programmer error to give a @key that isn't contained in the schema
    * for @settings or for @value to have the incorrect type, per the schema.
    *
    * If @value is floating then this function consumes the reference.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_value/<method parameters>/value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def setValue__ = ???

  /** The "change-event" signal is emitted once per change event that affects
    * this settings object. You should connect to this signal only if you are
    * interested in viewing groups of changes before they are split out into
    * multiple emissions of the "changed" signal. For most use cases it is more
    * appropriate to use the "changed" signal.
    *
    * In the event that the change event applies to one or more specified keys, @keys
    * will be an array of #GQuark of length @n_keys. In the event that the
    * change event applies to the #GSettings object as a whole (ie: potentially
    * every key has been changed) then @keys will be %NULL and @n_keys will be 0.
    *
    * The default handler for this signal invokes the "changed" signal for each
    * affected key. If any other connected handler returns %TRUE then this
    * default functionality will be suppressed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal change-event]: Array signal parameters not supported yet"
  )
  private def onChangeEvent = ???

  /** The "changed" signal is emitted when a key has potentially changed. You
    * should call one of the g_settings_get() calls to check the new value.
    *
    * This signal supports detailed connections. You can connect to the detailed
    * signal "changed::x" in order to only receive callbacks when key "x"
    * changes.
    *
    * Note that @settings only emits this signal if you have read @key at least
    * once while a signal handler was already connected for @key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onChanged(handler: ((key: String)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (key: String), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GSettings],
          key: CString /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((key = fromCString(key)))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"changed"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onChanged

  /** The "writable-change-event" signal is emitted once per writability change
    * event that affects this settings object. You should connect to this signal
    * if you are interested in viewing groups of changes before they are split
    * out into multiple emissions of the "writable-changed" signal. For most use
    * cases it is more appropriate to use the "writable-changed" signal.
    *
    * In the event that the writability change applies only to a single key, @key
    * will be set to the #GQuark for that key. In the event that the writability
    * change affects the entire settings object,
    * @key
    *   will be 0.
    *
    * The default handler for this signal invokes the "writable-changed" and
    * "changed" signals for each affected key. This is done because changes in
    * writability might also imply changes in value (if for example, a new
    * mandatory setting is introduced). If any other connected handler returns
    * %TRUE then this default functionality will be suppressed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal writable-change-event]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))"
  )
  private def onWritableChangeEvent = ???

  /** The "writable-changed" signal is emitted when the writability of a key has
    * potentially changed. You should call g_settings_is_writable() in order to
    * determine the new status.
    *
    * This signal supports detailed connections. You can connect to the detailed
    * signal "writable-changed::x" in order to only receive callbacks when the
    * writability of "x" changes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onWritableChanged(handler: ((key: String)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (key: String), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GSettings],
          key: CString /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((key = fromCString(key)))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"writable-changed"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onWritableChanged

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Settings

object Settings:
  /** Creates a new #GSettings object with the schema specified by
    * @schema_id.
    *
    * It is an error for the schema to not exist: schemas are an essential part
    * of a program, as they provide type information. If schemas need to be
    * dynamically loaded (for example, from an optional runtime dependency),
    * g_settings_schema_source_lookup() can be used to test for their existence
    * before loading them.
    *
    * Signals on the newly created #GSettings object will be dispatched via the
    * thread-default #GMainContext in effect at the time of the call to
    * g_settings_new(). The new #GSettings will hold a reference on the context.
    * See g_main_context_push_thread_default().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      schema_id: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Settings = new Settings(
    g_settings_new(
      __sn_extract_string(schema_id).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /**  Creates a new #GSettings object with a given schema, backend and
    *  path.
    *
    *  It should be extremely rare that you ever want to use this function.
    *  It is made available for advanced use-cases (such as plugin systems
    *  that want to provide access to schemas loaded from custom locations,
    *  etc).
    *
    *  At the most basic level, a #GSettings object is a pure composition of
    *  4 things: a #GSettingsSchema, a #GSettingsBackend, a path within that
    *  backend, and a #GMainContext to which signals are dispatched.
    *
    *  This constructor therefore gives you full control over constructing
    *  #GSettings instances.  The first 3 parameters are given directly as
    *  @schema, @backend and @path, and the main context is taken from the
    *  thread-default (as per g_settings_new()).
    *
    *  If @backend is %NULL then the default backend is used.
    *
    *  If @path is %NULL then the path from the schema is used.  It is an
    *  error if @path is %NULL and the schema has no path of its own or if
    *  @path is non-%NULL and not equal to the path that the schema does
    *  have.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[schema]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SettingsSchema), @type -> DataRecord(GSettingsSchema*)))"
  )
  private def new_full() = ???

  /** Creates a new #GSettings object with the schema specified by
    * @schema_id
    *   and a given #GSettingsBackend.
    *
    * Creating a #GSettings object with a different backend allows accessing
    * settings from a database other than the usual one. For example, it may
    * make sense to pass a backend corresponding to the "defaults" settings
    * database on the system to get a settings object that modifies the system
    * default settings instead of the settings for this user.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withBackend(
      schema_id: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      backend: SettingsBackend /* Some(Ptr[GSettingsBackend]) */
  )(using Zone): Settings = new Settings(
    g_settings_new_with_backend(
      __sn_extract_string(schema_id).asInstanceOf[Ptr[gchar]],
      backend.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** Creates a new #GSettings object with the schema specified by
    * @schema_id
    *   and a given #GSettingsBackend and path.
    *
    * This is a mix of g_settings_new_with_backend() and
    * g_settings_new_with_path().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withBackendAndPath(
      schema_id: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      backend: SettingsBackend /* Some(Ptr[GSettingsBackend]) */,
      path: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Settings = new Settings(
    g_settings_new_with_backend_and_path(
      __sn_extract_string(schema_id).asInstanceOf[Ptr[gchar]],
      backend.getUnsafeRawPointer().asInstanceOf,
      __sn_extract_string(path).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Creates a new #GSettings object with the relocatable schema specified by @schema_id
    * and a given path.
    *
    * You only need to do this if you want to directly create a settings object
    * with a schema that doesn't have a specified path of its own. That's quite
    * rare.
    *
    * It is a programmer error to call this function for a schema that has an
    * explicitly specified path.
    *
    * It is a programmer error if @path is not a valid path. A valid path begins
    * and ends with '/' and does not contain two consecutive '/' characters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withPath(
      schema_id: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      path: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Settings = new Settings(
    g_settings_new_with_path(
      __sn_extract_string(schema_id).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(path).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Deprecated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[<return type>]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const gchar* const*)))"
  )
  private def listRelocatableSchemas() = ???

  /** Deprecated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[<return type>]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const gchar* const*)))"
  )
  private def listSchemas() = ???

  /** Ensures that all pending operations are complete for the default backend.
    *
    * Writes made to a #GSettings are handled asynchronously. For this reason,
    * it is very unlikely that the changes have it to disk by the time
    * g_settings_set() returns.
    *
    * This call will block until all of the writes have made it to the backend.
    * Since the mainloop is not running, no change notifications will be
    * dispatched during this call (but some may be queued by the time the call
    * is done).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def sync(): Unit /* Some(Unit) */ = g_settings_sync()

  /** Removes an existing binding for @property on @object.
    *
    * Note that bindings are automatically removed when the object is finalized,
    * so it is rarely necessary to call this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unbind(
      `object`: Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      property: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* Some(Unit) */ = g_settings_unbind(
    `object`.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(property).asInstanceOf[Ptr[gchar]]
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Settings
