package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{SettingsSchema, SettingsSchemaKey}
import sn.gnome.gio.internal.GSettingsSchema
import sn.gnome.glib.internal.{gboolean, gchar, gint}

/**  The #GSettingsSchemaSource and #GSettingsSchema APIs provide a
  *  mechanism for advanced control over the loading of schemas and a
  *  mechanism for introspecting their content.
  *
  *  Plugin loading systems that wish to provide plugins a way to access
  *  settings face the problem of how to make the schemas for these
  *  settings visible to GSettings.  Typically, a plugin will want to ship
  *  the schema along with itself and it won't be installed into the
  *  standard system directories for schemas.
  *
  *  #GSettingsSchemaSource provides a mechanism for dealing with this by
  *  allowing the creation of a new 'schema source' from which schemas can
  *  be acquired.  This schema source can then become part of the metadata
  *  associated with the plugin and queried whenever the plugin requires
  *  access to some settings.
  *
  *  Consider the following example:
  *
  *  |[<!-- language="C" -->
  *  typedef struct
  *  {
  *     ...
  *     GSettingsSchemaSource *schema_source;
  *     ...
  *  } Plugin;
  *
  *  Plugin *
  *  initialise_plugin (const gchar *dir)
  *  {
  *    Plugin *plugin;
  *
  *    ...
  *
  *    plugin->schema_source =
  *      g_settings_schema_source_new_from_directory (dir,
  *        g_settings_schema_source_get_default (), FALSE, NULL);
  *
  *    ...
  *
  *    return plugin;
  *  }
  *
  *  ...
  *
  *  GSettings *
  *  plugin_get_settings (Plugin      *plugin,
  *                       const gchar *schema_id)
  *  {
  *    GSettingsSchema *schema;
  *
  *    if (schema_id == NULL)
  *      schema_id = plugin->identifier;
  *
  *    schema = g_settings_schema_source_lookup (plugin->schema_source,
  *                                              schema_id, FALSE);
  *
  *    if (schema == NULL)
  *      {
  *        ... disable the plugin or abort, etc ...
  *      }
  *
  *    return g_settings_new_full (schema, NULL, NULL);
  *  }
  *  ]|
  *
  *  The code above shows how hooks should be added to the code that
  *  initialises (or enables) the plugin to create the schema source and
  *  how an API can be added to the plugin system to provide a convenient
  *  way for the plugin to access its settings, using the schemas that it
  *  ships.
  *
  *  From the standpoint of the plugin, it would need to ensure that it
  *  ships a gschemas.compiled file as part of itself, and then simply do
  *  the following:
  *
  *  |[<!-- language="C" -->
  *  {
  *    GSettings *settings;
  *    gint some_value;
  *
  *    settings = plugin_get_settings (self, NULL);
  *    some_value = g_settings_get_int (settings, "some-value");
  *    ...
  *  }
  *  ]|
  *
  *  It's also possible that the plugin system expects the schema source
  *  files (ie: .gschema.xml files) instead of a gschemas.compiled file.
  *  In that case, the plugin loading system must compile the schemas for
  *  itself before attempting to create the settings source.
  *
  *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
  */
class SettingsSchema private[gnome] (raw: Ptr[GSettingsSchema]):

  def getUnsafeRawPointer(): Ptr[GSettingsSchema] = this.raw

  /** Get the ID of @schema.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getId(): scala.Predef.String /* None */ =
    fromCString(
      g_settings_schema_get_id(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSettingsSchema]]
      ).asInstanceOf
    )
  end getId

  /** Gets the key named @name from @schema.
    *
    * It is a programmer error to request a key that does not exist. See
    * g_settings_schema_list_keys().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getKey(
      name: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): sn.gnome.gio.SettingsSchemaKey /* None */ =
    sn.gnome.gio.SettingsSchemaKey.fromRaw(
      g_settings_schema_get_key(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSettingsSchema]],
        toCString(name).asInstanceOf[Ptr[gchar]]
      )
    )
  end getKey

  /** Gets the path associated with @schema, or %NULL.
    *
    * Schemas may be single-instance or relocatable. Single-instance schemas
    * correspond to exactly one set of keys in the backend database: those
    * located at the path returned by this function.
    *
    * Relocatable schemas can be referenced by other schemas and can therefore
    * describe multiple sets of keys at different locations. For relocatable
    * schemas, this function will return %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPath(): scala.Predef.String /* None */ =
    fromCString(
      g_settings_schema_get_path(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSettingsSchema]]
      ).asInstanceOf
    )
  end getPath

  /** Checks if @schema has a key named @name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasKey(
      name: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* None */ =
    g_settings_schema_has_key(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSettingsSchema]],
      toCString(name).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)
  end hasKey

  /** Gets the list of children in @schema.
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

  /** Introspects the list of keys on @schema.
    *
    * You should probably not be calling this function from "normal" code (since
    * you should already know what keys are in your schema). This function is
    * intended for introspection reasons.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method list_keys/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def listKeys__ = ???

  /** Increase the reference count of @schema, returning a new reference.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gio.SettingsSchema /* None */ =
    sn.gnome.gio.SettingsSchema.fromRaw(
      g_settings_schema_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSettingsSchema]]
      )
    )
  end ref

  /** Decrease the reference count of @schema, possibly freeing it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_settings_schema_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSettingsSchema]]
    )
  end unref

end SettingsSchema

object SettingsSchema:
  def fromRaw(ptr: Ptr[GSettingsSchema]): SettingsSchema = new SettingsSchema(
    ptr
  )
end SettingsSchema
