package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.{Bytes, GResult, KeyFile, KeyFileFlags}
import sn.gnome.glib.internal.{
  GKeyFile,
  gboolean,
  gchar,
  gdouble,
  gint,
  gint64,
  gsize,
  guint64
}

/**  #GKeyFile lets you parse, edit or create files containing groups of
  *  key-value pairs, which we call "key files" for lack of a better name.
  *  Several freedesktop.org specifications use key files now, e.g the
  *  [Desktop Entry Specification](http://freedesktop.org/Standards/desktop-entry-spec)
  *  and the
  *  [Icon Theme Specification](http://freedesktop.org/Standards/icon-theme-spec).
  *
  *  The syntax of key files is described in detail in the
  *  [Desktop Entry Specification](http://freedesktop.org/Standards/desktop-entry-spec),
  *  here is a quick summary: Key files
  *  consists of groups of key-value pairs, interspersed with comments.
  *
  *  |[
  *  # this is just an example
  *  # there can be comments before the first group
  *
  *  [First Group]
  *
  *  Name=Key File Example\tthis value shows\nescaping
  *
  *  # localized strings are stored in multiple key-value pairs
  *  Welcome=Hello
  *  Welcome[de]=Hallo
  *  Welcome[fr_FR]=Bonjour
  *  Welcome[it]=Ciao
  *  Welcome[be@latin]=Hello
  *
  *  [Another Group]
  *
  *  Numbers=2;20;-200;0
  *
  *  Booleans=true;false;true;true
  *  ]|
  *
  *  Lines beginning with a '#' and blank lines are considered comments.
  *
  *  Groups are started by a header line containing the group name enclosed
  *  in '[' and ']', and ended implicitly by the start of the next group or
  *  the end of the file. Each key-value pair must be contained in a group.
  *
  *  Key-value pairs generally have the form `key=value`, with the
  *  exception of localized strings, which have the form
  *  `key[locale]=value`, with a locale identifier of the
  *  form `lang_COUNTRY@MODIFIER` where `COUNTRY` and `MODIFIER`
  *  are optional.
  *  Space before and after the '=' character are ignored. Newline, tab,
  *  carriage return and backslash characters in value are escaped as \n,
  *  \t, \r, and \\\\, respectively. To preserve leading spaces in values,
  *  these can also be escaped as \s.
  *
  *  Key files can store strings (possibly with localized variants), integers,
  *  booleans and lists of these. Lists are separated by a separator character,
  *  typically ';' or ','. To use the list separator character in a value in
  *  a list, it has to be escaped by prefixing it with a backslash.
  *
  *  This syntax is obviously inspired by the .ini files commonly met
  *  on Windows, but there are some important differences:
  *
  *  - .ini files use the ';' character to begin comments,
  *    key files use the '#' character.
  *
  *  - Key files do not allow for ungrouped keys meaning only
  *    comments can precede the first group.
  *
  *  - Key files are always encoded in UTF-8.
  *
  *  - Key and Group names are case-sensitive. For example, a group called
  *    [GROUP] is a different from [group].
  *
  *  - .ini files don't have a strongly typed boolean entry type,
  *     they only have GetProfileInt(). In key files, only
  *     true and false (in lower case) are allowed.
  *
  *  Note that in contrast to the
  *  [Desktop Entry Specification](http://freedesktop.org/Standards/desktop-entry-spec),
  *  groups in key files may contain the same
  *  key multiple times; the last entry wins. Key files may also contain
  *  multiple groups with the same name; they are merged together.
  *  Another difference is that keys and group names in key files are not
  *  restricted to ASCII characters.
  *
  *  Here is an example of loading a key file and reading a value:
  *
  *  |[<!-- language="C" -->
  *  g_autoptr(GError) error = NULL;
  *  g_autoptr(GKeyFile) key_file = g_key_file_new ();
  *
  *  if (!g_key_file_load_from_file (key_file, "key-file.ini", flags, &error))
  *    {
  *      if (!g_error_matches (error, G_FILE_ERROR, G_FILE_ERROR_NOENT))
  *        g_warning ("Error loading key file: %s", error->message);
  *      return;
  *    }
  *
  *  g_autofree gchar *val = g_key_file_get_string (key_file, "Group Name", "SomeKey", &error);
  *  if (val == NULL &&
  *      !g_error_matches (error, G_KEY_FILE_ERROR, G_KEY_FILE_ERROR_KEY_NOT_FOUND))
  *    {
  *      g_warning ("Error finding key in key file: %s", error->message);
  *      return;
  *    }
  *  else if (val == NULL)
  *    {
  *      // Fall back to a default value.
  *      val = g_strdup ("default-value");
  *    }
  *  ]|
  *
  *  Here is an example of creating and saving a key file:
  *
  *  |[<!-- language="C" -->
  *  g_autoptr(GKeyFile) key_file = g_key_file_new ();
  *  const gchar *val = …;
  *  g_autoptr(GError) error = NULL;
  *
  *  g_key_file_set_string (key_file, "Group Name", "SomeKey", val);
  *
  *  // Save as a file.
  *  if (!g_key_file_save_to_file (key_file, "key-file.ini", &error))
  *    {
  *      g_warning ("Error saving key file: %s", error->message);
  *      return;
  *    }
  *
  *  // Or store to a GBytes for use elsewhere.
  *  gsize data_len;
  *  g_autofree guint8 *data = (guint8 *) g_key_file_to_data (key_file, &data_len, &error);
  *  if (data == NULL)
  *    {
  *      g_warning ("Error saving key file: %s", error->message);
  *      return;
  *    }
  *  g_autoptr(GBytes) bytes = g_bytes_new_take (g_steal_pointer (&data), data_len);
  *  ]|
  *
  *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
  */
class KeyFile private[gnome] (raw: Ptr[GKeyFile]):

  def getUnsafeRawPointer(): Ptr[GKeyFile] = this.raw

  /** Clears all keys and groups from @key_file, and decreases the reference
    * count by 1. If the reference count reaches zero, frees the key file and
    * all its allocated memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_key_file_free(this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]])
  end free

  /** Returns the value associated with @key under @group_name as a boolean.
    *
    * If @key cannot be found then %FALSE is returned and @error is set to
    * %G_KEY_FILE_ERROR_KEY_NOT_FOUND. Likewise, if the value associated with @key
    * cannot be interpreted as a boolean then %FALSE is returned and @error is
    * set to %G_KEY_FILE_ERROR_INVALID_VALUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBoolean(
      group_name: scala.Predef.String /* Some(Ptr[gchar]) */,
      key: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_key_file_get_boolean(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
        toCString(group_name).asInstanceOf[Ptr[gchar]],
        toCString(key).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).value.!=(0)
    )
  end getBoolean

  /** Returns the values associated with @key under @group_name as booleans.
    *
    * If @key cannot be found then %NULL is returned and @error is set to
    * %G_KEY_FILE_ERROR_KEY_NOT_FOUND. Likewise, if the values associated with @key
    * cannot be interpreted as booleans then %NULL is returned and @error is set
    * to %G_KEY_FILE_ERROR_INVALID_VALUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_boolean_list]: Method get_boolean_list contains an OUT parameter, which is not supported yet"
  )
  private def getBooleanList__ = ???

  /** Retrieves a comment above @key from @group_name. If @key is %NULL then @comment
    * will be read from above
    * @group_name.
    *   If both @key and @group_name are %NULL, then
    * @comment
    *   will be read from above the first group in the file.
    *
    * Note that the returned string does not include the '#' comment markers,
    * but does include any whitespace after them (on each line). It includes the
    * line breaks between lines, but does not include the final line break.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getComment(
      group_name: Option[scala.Predef.String /* Some(Ptr[gchar]) */ ],
      key: Option[scala.Predef.String /* Some(Ptr[gchar]) */ ]
  )(using Zone): GResult[scala.Predef.String /* None */ ] =
    GResult.wrap(__errorPtr =>
      fromCString(
        g_key_file_get_comment(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
          group_name
            .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
            .getOrElse(null.asInstanceOf[Ptr[gchar]]),
          key
            .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
            .getOrElse(null.asInstanceOf[Ptr[gchar]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end getComment

  /** Returns the value associated with @key under @group_name as a double. If @group_name
    * is %NULL, the start_group is used.
    *
    * If @key cannot be found then 0.0 is returned and @error is set to
    * %G_KEY_FILE_ERROR_KEY_NOT_FOUND. Likewise, if the value associated with @key
    * cannot be interpreted as a double then 0.0 is returned and @error is set
    * to %G_KEY_FILE_ERROR_INVALID_VALUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDouble(
      group_name: scala.Predef.String /* Some(Ptr[gchar]) */,
      key: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): GResult[Double /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_key_file_get_double(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
        toCString(group_name).asInstanceOf[Ptr[gchar]],
        toCString(key).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).value
    )
  end getDouble

  /** Returns the values associated with @key under @group_name as doubles.
    *
    * If @key cannot be found then %NULL is returned and @error is set to
    * %G_KEY_FILE_ERROR_KEY_NOT_FOUND. Likewise, if the values associated with @key
    * cannot be interpreted as doubles then %NULL is returned and @error is set
    * to %G_KEY_FILE_ERROR_INVALID_VALUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_double_list]: Method get_double_list contains an OUT parameter, which is not supported yet"
  )
  private def getDoubleList__ = ???

  /** Returns all groups in the key file loaded with @key_file. The array of
    * returned groups will be %NULL-terminated, so
    * @length
    *   may optionally be %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_groups]: Method get_groups contains an OUT parameter, which is not supported yet"
  )
  private def getGroups__ = ???

  /** Returns the value associated with @key under @group_name as a signed
    * 64-bit integer. This is similar to g_key_file_get_integer() but can return
    * 64-bit results without truncation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInt64(
      group_name: scala.Predef.String /* Some(Ptr[gchar]) */,
      key: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): GResult[CLongInt /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_key_file_get_int64(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
        toCString(group_name).asInstanceOf[Ptr[gchar]],
        toCString(key).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).value
    )
  end getInt64

  /** Returns the value associated with @key under @group_name as an integer.
    *
    * If @key cannot be found then 0 is returned and @error is set to
    * %G_KEY_FILE_ERROR_KEY_NOT_FOUND. Likewise, if the value associated with @key
    * cannot be interpreted as an integer, or is out of range for a #gint, then
    * 0 is returned and @error is set to %G_KEY_FILE_ERROR_INVALID_VALUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInteger(
      group_name: scala.Predef.String /* Some(Ptr[gchar]) */,
      key: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): GResult[Int /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_key_file_get_integer(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
        toCString(group_name).asInstanceOf[Ptr[gchar]],
        toCString(key).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).value
    )
  end getInteger

  /** Returns the values associated with @key under @group_name as integers.
    *
    * If @key cannot be found then %NULL is returned and @error is set to
    * %G_KEY_FILE_ERROR_KEY_NOT_FOUND. Likewise, if the values associated with @key
    * cannot be interpreted as integers, or are out of range for #gint, then
    * %NULL is returned and @error is set to %G_KEY_FILE_ERROR_INVALID_VALUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_integer_list]: Method get_integer_list contains an OUT parameter, which is not supported yet"
  )
  private def getIntegerList__ = ???

  /** Returns all keys for the group name @group_name. The array of returned
    * keys will be %NULL-terminated, so @length may optionally be %NULL. In the
    * event that the @group_name cannot be found, %NULL is returned and @error
    * is set to %G_KEY_FILE_ERROR_GROUP_NOT_FOUND.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_keys]: Method get_keys contains an OUT parameter, which is not supported yet"
  )
  private def getKeys__ = ???

  /**  Returns the actual locale which the result of
    *  g_key_file_get_locale_string() or g_key_file_get_locale_string_list()
    *  came from.
    *
    *  If calling g_key_file_get_locale_string() or
    *  g_key_file_get_locale_string_list() with exactly the same @key_file,
    *  @group_name, @key and @locale, the result of those functions will
    *  have originally been tagged with the locale that is the result of
    *  this function.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def getLocaleForKey(
      group_name: scala.Predef.String /* Some(Ptr[gchar]) */,
      key: scala.Predef.String /* Some(Ptr[gchar]) */,
      locale: Option[scala.Predef.String /* Some(Ptr[gchar]) */ ]
  )(using Zone): scala.Predef.String /* None */ =
    fromCString(
      g_key_file_get_locale_for_key(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
        toCString(group_name).asInstanceOf[Ptr[gchar]],
        toCString(key).asInstanceOf[Ptr[gchar]],
        locale
          .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
          .getOrElse(null.asInstanceOf[Ptr[gchar]])
      ).asInstanceOf
    )
  end getLocaleForKey

  /** Returns the value associated with @key under @group_name translated in the
    * given @locale if available. If @locale is %NULL then the current locale is
    * assumed.
    *
    * If @locale is to be non-%NULL, or if the current locale will change over
    * the lifetime of the #GKeyFile, it must be loaded with
    * %G_KEY_FILE_KEEP_TRANSLATIONS in order to load strings for all locales.
    *
    * If @key cannot be found then %NULL is returned and @error is set to
    * %G_KEY_FILE_ERROR_KEY_NOT_FOUND. If the value associated with @key cannot
    * be interpreted or no suitable translation can be found then the
    * untranslated value is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLocaleString(
      group_name: scala.Predef.String /* Some(Ptr[gchar]) */,
      key: scala.Predef.String /* Some(Ptr[gchar]) */,
      locale: Option[scala.Predef.String /* Some(Ptr[gchar]) */ ]
  )(using Zone): GResult[scala.Predef.String /* None */ ] =
    GResult.wrap(__errorPtr =>
      fromCString(
        g_key_file_get_locale_string(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
          toCString(group_name).asInstanceOf[Ptr[gchar]],
          toCString(key).asInstanceOf[Ptr[gchar]],
          locale
            .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
            .getOrElse(null.asInstanceOf[Ptr[gchar]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end getLocaleString

  /** Returns the values associated with @key under @group_name translated in
    * the given @locale if available. If @locale is %NULL then the current
    * locale is assumed.
    *
    * If @locale is to be non-%NULL, or if the current locale will change over
    * the lifetime of the #GKeyFile, it must be loaded with
    * %G_KEY_FILE_KEEP_TRANSLATIONS in order to load strings for all locales.
    *
    * If @key cannot be found then %NULL is returned and @error is set to
    * %G_KEY_FILE_ERROR_KEY_NOT_FOUND. If the values associated with @key cannot
    * be interpreted or no suitable translations can be found then the
    * untranslated values are returned. The returned array is %NULL-terminated,
    * so @length may optionally be %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_locale_string_list]: Method get_locale_string_list contains an OUT parameter, which is not supported yet"
  )
  private def getLocaleStringList__ = ???

  /** Returns the name of the start group of the file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStartGroup()(using Zone): scala.Predef.String /* None */ =
    fromCString(
      g_key_file_get_start_group(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]]
      ).asInstanceOf
    )
  end getStartGroup

  /** Returns the string value associated with @key under @group_name. Unlike
    * g_key_file_get_value(), this function handles escape sequences like \s.
    *
    * In the event the key cannot be found, %NULL is returned and
    * @error
    *   is set to %G_KEY_FILE_ERROR_KEY_NOT_FOUND. In the event that the @group_name
    *   cannot be found, %NULL is returned and @error is set to
    *   %G_KEY_FILE_ERROR_GROUP_NOT_FOUND.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getString(
      group_name: scala.Predef.String /* Some(Ptr[gchar]) */,
      key: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): GResult[scala.Predef.String /* None */ ] =
    GResult.wrap(__errorPtr =>
      fromCString(
        g_key_file_get_string(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
          toCString(group_name).asInstanceOf[Ptr[gchar]],
          toCString(key).asInstanceOf[Ptr[gchar]],
          __errorPtr
        ).asInstanceOf
      )
    )
  end getString

  /** Returns the values associated with @key under @group_name.
    *
    * In the event the key cannot be found, %NULL is returned and
    * @error
    *   is set to %G_KEY_FILE_ERROR_KEY_NOT_FOUND. In the event that the @group_name
    *   cannot be found, %NULL is returned and @error is set to
    *   %G_KEY_FILE_ERROR_GROUP_NOT_FOUND.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_string_list]: Method get_string_list contains an OUT parameter, which is not supported yet"
  )
  private def getStringList__ = ???

  /** Returns the value associated with @key under @group_name as an unsigned
    * 64-bit integer. This is similar to g_key_file_get_integer() but can return
    * large positive results without truncation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUint64(
      group_name: scala.Predef.String /* Some(Ptr[gchar]) */,
      key: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): GResult[CUnsignedLongInt /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_key_file_get_uint64(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
        toCString(group_name).asInstanceOf[Ptr[gchar]],
        toCString(key).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).value
    )
  end getUint64

  /** Returns the raw value associated with @key under @group_name. Use
    * g_key_file_get_string() to retrieve an unescaped UTF-8 string.
    *
    * In the event the key cannot be found, %NULL is returned and
    * @error
    *   is set to %G_KEY_FILE_ERROR_KEY_NOT_FOUND. In the event that the @group_name
    *   cannot be found, %NULL is returned and @error is set to
    *   %G_KEY_FILE_ERROR_GROUP_NOT_FOUND.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getValue(
      group_name: scala.Predef.String /* Some(Ptr[gchar]) */,
      key: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): GResult[scala.Predef.String /* None */ ] =
    GResult.wrap(__errorPtr =>
      fromCString(
        g_key_file_get_value(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
          toCString(group_name).asInstanceOf[Ptr[gchar]],
          toCString(key).asInstanceOf[Ptr[gchar]],
          __errorPtr
        ).asInstanceOf
      )
    )
  end getValue

  /** Looks whether the key file has the group @group_name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasGroup(
      group_name: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): Boolean /* None */ =
    g_key_file_has_group(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
      toCString(group_name).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)
  end hasGroup

  /** Looks whether the key file has the key @key in the group
    * @group_name.
    *
    * Note that this function does not follow the rules for #GError strictly;
    * the return value both carries meaning and signals an error. To use this
    * function, you must pass a #GError pointer in @error, and check whether it
    * is not %NULL to see if an error occurred.
    *
    * Language bindings should use g_key_file_get_value() to test whether or not
    * a key exists.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasKey(
      group_name: scala.Predef.String /* Some(Ptr[gchar]) */,
      key: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_key_file_has_key(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
        toCString(group_name).asInstanceOf[Ptr[gchar]],
        toCString(key).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).value.!=(0)
    )
  end hasKey

  /** Loads a key file from the data in @bytes into an empty #GKeyFile
    * structure. If the object cannot be created then %error is set to a
    * #GKeyFileError.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def loadFromBytes(
      bytes: sn.gnome.glib.Bytes /* Some(Ptr[GBytes]) */,
      flags: sn.gnome.glib.KeyFileFlags /* Some(GKeyFileFlags) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_key_file_load_from_bytes(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
        bytes.getUnsafeRawPointer().asInstanceOf,
        flags.raw,
        __errorPtr
      ).value.!=(0)
    )
  end loadFromBytes

  /** Loads a key file from memory into an empty #GKeyFile structure. If the
    * object cannot be created then %error is set to a #GKeyFileError.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def loadFromData(
      data: scala.Predef.String /* Some(Ptr[gchar]) */,
      length: CUnsignedLongInt /* Some(gsize) */,
      flags: sn.gnome.glib.KeyFileFlags /* Some(GKeyFileFlags) */
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_key_file_load_from_data(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
        toCString(data).asInstanceOf[Ptr[gchar]],
        gsize(length),
        flags.raw,
        __errorPtr
      ).value.!=(0)
    )
  end loadFromData

  /** This function looks for a key file named @file in the paths returned from
    * g_get_user_data_dir() and g_get_system_data_dirs(), loads the file into @key_file
    * and returns the file's full path in
    * @full_path.
    *   If the file could not be loaded then an %error is set to either a
    *   #GFileError or #GKeyFileError.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method load_from_data_dirs]: Method load_from_data_dirs contains an OUT parameter, which is not supported yet"
  )
  private def loadFromDataDirs__ = ???

  /** This function looks for a key file named @file in the paths specified in @search_dirs,
    * loads the file into @key_file and returns the file's full path in @full_path.
    *
    * If the file could not be found in any of the @search_dirs,
    * %G_KEY_FILE_ERROR_NOT_FOUND is returned. If the file is found but the OS
    * returns an error when opening or reading the file, a %G_FILE_ERROR is
    * returned. If there is a problem parsing the file, a %G_KEY_FILE_ERROR is
    * returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method load_from_dirs]: Method load_from_dirs contains an OUT parameter, which is not supported yet"
  )
  private def loadFromDirs__ = ???

  /** Loads a key file into an empty #GKeyFile structure.
    *
    * If the OS returns an error when opening or reading the file, a
    * %G_FILE_ERROR is returned. If there is a problem parsing the file, a
    * %G_KEY_FILE_ERROR is returned.
    *
    * This function will never return a %G_KEY_FILE_ERROR_NOT_FOUND error. If
    * the
    * @file
    *   is not found, %G_FILE_ERROR_NOENT is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def loadFromFile(
      file: scala.Predef.String /* Some(Ptr[gchar]) */,
      flags: sn.gnome.glib.KeyFileFlags /* Some(GKeyFileFlags) */
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_key_file_load_from_file(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
        toCString(file).asInstanceOf[Ptr[gchar]],
        flags.raw,
        __errorPtr
      ).value.!=(0)
    )
  end loadFromFile

  /** Increases the reference count of @key_file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.glib.KeyFile /* None */ =
    sn.gnome.glib.KeyFile.fromRaw(
      g_key_file_ref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]])
    )
  end ref

  /** Removes a comment above @key from @group_name. If @key is %NULL then @comment
    * will be removed above @group_name. If both @key and @group_name are %NULL,
    * then @comment will be removed above the first group in the file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeComment(
      group_name: Option[scala.Predef.String /* Some(Ptr[gchar]) */ ],
      key: Option[scala.Predef.String /* Some(Ptr[gchar]) */ ]
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_key_file_remove_comment(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
        group_name
          .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
          .getOrElse(null.asInstanceOf[Ptr[gchar]]),
        key
          .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
          .getOrElse(null.asInstanceOf[Ptr[gchar]]),
        __errorPtr
      ).value.!=(0)
    )
  end removeComment

  /** Removes the specified group, @group_name, from the key file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeGroup(
      group_name: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_key_file_remove_group(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
        toCString(group_name).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).value.!=(0)
    )
  end removeGroup

  /** Removes @key in @group_name from the key file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeKey(
      group_name: scala.Predef.String /* Some(Ptr[gchar]) */,
      key: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_key_file_remove_key(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
        toCString(group_name).asInstanceOf[Ptr[gchar]],
        toCString(key).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).value.!=(0)
    )
  end removeKey

  /** Writes the contents of @key_file to @filename using g_file_set_contents().
    * If you need stricter guarantees about durability of the written file than
    * are provided by g_file_set_contents(), use g_file_set_contents_full() with
    * the return value of g_key_file_to_data().
    *
    * This function can fail for any of the reasons that g_file_set_contents()
    * may fail.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def saveToFile(
      filename: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_key_file_save_to_file(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
        toCString(filename).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).value.!=(0)
    )
  end saveToFile

  /** Associates a new boolean value with @key under @group_name. If @key cannot
    * be found then it is created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBoolean(
      group_name: scala.Predef.String /* Some(Ptr[gchar]) */,
      key: scala.Predef.String /* Some(Ptr[gchar]) */,
      value: Boolean /* Some(gboolean) */
  )(using Zone): Unit /* None */ =
    g_key_file_set_boolean(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
      toCString(group_name).asInstanceOf[Ptr[gchar]],
      toCString(key).asInstanceOf[Ptr[gchar]],
      gboolean(gint((if value == true then 1 else 0)))
    )
  end setBoolean

  /** Associates a list of boolean values with @key under @group_name. If @key
    * cannot be found then it is created. If @group_name is %NULL, the
    * start_group is used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_boolean_list/<method parameters>/list]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gboolean), @type -> DataRecord(gboolean)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(3), @type -> DataRecord(gboolean*)))"
  )
  private def setBooleanList__ = ???

  /** Places a comment above @key from @group_name.
    *
    * If @key is %NULL then @comment will be written above @group_name. If both @key
    * and @group_name are %NULL, then @comment will be written above the first
    * group in the file.
    *
    * Note that this function prepends a '#' comment marker to each line of @comment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setComment(
      group_name: Option[scala.Predef.String /* Some(Ptr[gchar]) */ ],
      key: Option[scala.Predef.String /* Some(Ptr[gchar]) */ ],
      comment: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_key_file_set_comment(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
        group_name
          .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
          .getOrElse(null.asInstanceOf[Ptr[gchar]]),
        key
          .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
          .getOrElse(null.asInstanceOf[Ptr[gchar]]),
        toCString(comment).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).value.!=(0)
    )
  end setComment

  /** Associates a new double value with @key under @group_name. If @key cannot
    * be found then it is created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDouble(
      group_name: scala.Predef.String /* Some(Ptr[gchar]) */,
      key: scala.Predef.String /* Some(Ptr[gchar]) */,
      value: Double /* Some(gdouble) */
  )(using Zone): Unit /* None */ =
    g_key_file_set_double(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
      toCString(group_name).asInstanceOf[Ptr[gchar]],
      toCString(key).asInstanceOf[Ptr[gchar]],
      gdouble(value)
    )
  end setDouble

  /** Associates a list of double values with @key under
    * @group_name.
    *   If @key cannot be found then it is created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_double_list/<method parameters>/list]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(3), @type -> DataRecord(gdouble*)))"
  )
  private def setDoubleList__ = ???

  /** Associates a new integer value with @key under @group_name. If @key cannot
    * be found then it is created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInt64(
      group_name: scala.Predef.String /* Some(Ptr[gchar]) */,
      key: scala.Predef.String /* Some(Ptr[gchar]) */,
      value: CLongInt /* Some(gint64) */
  )(using Zone): Unit /* None */ =
    g_key_file_set_int64(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
      toCString(group_name).asInstanceOf[Ptr[gchar]],
      toCString(key).asInstanceOf[Ptr[gchar]],
      gint64(value)
    )
  end setInt64

  /** Associates a new integer value with @key under @group_name. If @key cannot
    * be found then it is created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInteger(
      group_name: scala.Predef.String /* Some(Ptr[gchar]) */,
      key: scala.Predef.String /* Some(Ptr[gchar]) */,
      value: Int /* Some(gint) */
  )(using Zone): Unit /* None */ =
    g_key_file_set_integer(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
      toCString(group_name).asInstanceOf[Ptr[gchar]],
      toCString(key).asInstanceOf[Ptr[gchar]],
      gint(value)
    )
  end setInteger

  /** Associates a list of integer values with @key under @group_name. If @key
    * cannot be found then it is created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_integer_list/<method parameters>/list]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gint), @type -> DataRecord(gint)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(3), @type -> DataRecord(gint*)))"
  )
  private def setIntegerList__ = ???

  /** Sets the character which is used to separate values in lists. Typically
    * ';' or ',' are used as separators. The default list separator is ';'.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setListSeparator(separator: Byte /* Some(gchar) */ ): Unit /* None */ =
    g_key_file_set_list_separator(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
      gchar(separator)
    )
  end setListSeparator

  /** Associates a string value for @key and @locale under @group_name. If the
    * translation for @key cannot be found then it is created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLocaleString(
      group_name: scala.Predef.String /* Some(Ptr[gchar]) */,
      key: scala.Predef.String /* Some(Ptr[gchar]) */,
      locale: scala.Predef.String /* Some(Ptr[gchar]) */,
      string: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): Unit /* None */ =
    g_key_file_set_locale_string(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
      toCString(group_name).asInstanceOf[Ptr[gchar]],
      toCString(key).asInstanceOf[Ptr[gchar]],
      toCString(locale).asInstanceOf[Ptr[gchar]],
      toCString(string).asInstanceOf[Ptr[gchar]]
    )
  end setLocaleString

  /** Associates a list of string values for @key and @locale under
    * @group_name.
    *   If the translation for @key cannot be found then it is created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_locale_string_list/<method parameters>/list]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar*)))),ListMap(@zero-terminated -> DataRecord(1), @length -> DataRecord(4), @type -> DataRecord(const gchar* const*)))"
  )
  private def setLocaleStringList__ = ???

  /** Associates a new string value with @key under @group_name. If @key cannot
    * be found then it is created. If @group_name cannot be found then it is
    * created. Unlike g_key_file_set_value(), this function handles characters
    * that need escaping, such as newlines.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setString(
      group_name: scala.Predef.String /* Some(Ptr[gchar]) */,
      key: scala.Predef.String /* Some(Ptr[gchar]) */,
      string: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): Unit /* None */ =
    g_key_file_set_string(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
      toCString(group_name).asInstanceOf[Ptr[gchar]],
      toCString(key).asInstanceOf[Ptr[gchar]],
      toCString(string).asInstanceOf[Ptr[gchar]]
    )
  end setString

  /** Associates a list of string values for @key under @group_name. If @key
    * cannot be found then it is created. If @group_name cannot be found then it
    * is created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_string_list/<method parameters>/list]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@zero-terminated -> DataRecord(1), @length -> DataRecord(3), @type -> DataRecord(const gchar* const*)))"
  )
  private def setStringList__ = ???

  /** Associates a new integer value with @key under @group_name. If @key cannot
    * be found then it is created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUint64(
      group_name: scala.Predef.String /* Some(Ptr[gchar]) */,
      key: scala.Predef.String /* Some(Ptr[gchar]) */,
      value: CUnsignedLongInt /* Some(guint64) */
  )(using Zone): Unit /* None */ =
    g_key_file_set_uint64(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
      toCString(group_name).asInstanceOf[Ptr[gchar]],
      toCString(key).asInstanceOf[Ptr[gchar]],
      guint64(value)
    )
  end setUint64

  /** Associates a new value with @key under @group_name.
    *
    * If @key cannot be found then it is created. If @group_name cannot be found
    * then it is created. To set an UTF-8 string which may contain characters
    * that need escaping (such as newlines or spaces), use
    * g_key_file_set_string().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setValue(
      group_name: scala.Predef.String /* Some(Ptr[gchar]) */,
      key: scala.Predef.String /* Some(Ptr[gchar]) */,
      value: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): Unit /* None */ =
    g_key_file_set_value(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]],
      toCString(group_name).asInstanceOf[Ptr[gchar]],
      toCString(key).asInstanceOf[Ptr[gchar]],
      toCString(value).asInstanceOf[Ptr[gchar]]
    )
  end setValue

  /** This function outputs @key_file as a string.
    *
    * Note that this function never reports an error, so it is safe to pass
    * %NULL as @error.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method to_data]: Method to_data contains an OUT parameter, which is not supported yet"
  )
  private def toData__ = ???

  /** Decreases the reference count of @key_file by 1. If the reference count
    * reaches zero, frees the key file and all its allocated memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_key_file_unref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GKeyFile]])
  end unref

end KeyFile

object KeyFile:
  def fromRaw(ptr: Ptr[GKeyFile]): KeyFile = new KeyFile(ptr)
end KeyFile
