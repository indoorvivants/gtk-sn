package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{SettingsSchema, SettingsSchemaSource}
import sn.gnome.gio.internal.GSettingsSchemaSource
import sn.gnome.glib.internal.{gboolean, gchar, gint}

/** This is an opaque structure type. You may not access it directly.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SettingsSchemaSource private[gnome] (raw: Ptr[GSettingsSchemaSource]):

  def getUnsafeRawPointer(): Ptr[GSettingsSchemaSource] = this.raw

  /** Lists the schemas in a given source.
    *
    * If @recursive is %TRUE then include parent sources. If %FALSE then only
    * include the schemas from one source (ie: one directory). You probably want
    * %TRUE.
    *
    * Non-relocatable schemas are those for which you can call g_settings_new().
    * Relocatable schemas are those for which you must use
    * g_settings_new_with_path().
    *
    * Do not call this function from normal programs. This is designed for use
    * by database editors, commandline tools, etc.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method list_schemas]: Method list_schemas contains an OUT parameter, which is not supported yet"
  )
  private def listSchemas__ = ???

  /** Looks up a schema with the identifier @schema_id in @source.
    *
    * This function is not required for normal uses of #GSettings but it may be
    * useful to authors of plugin management systems or to those who want to
    * introspect the content of schemas.
    *
    * If the schema isn't found directly in @source and @recursive is %TRUE then
    * the parent sources will also be checked.
    *
    * If the schema isn't found, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lookup(
      schema_id: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      recursive: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Zone): sn.gnome.gio.SettingsSchema /* None */ =
    sn.gnome.gio.SettingsSchema.fromRaw(
      g_settings_schema_source_lookup(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSettingsSchemaSource]],
        toCString(schema_id).asInstanceOf[Ptr[gchar]],
        gboolean(gint((if recursive == true then 1 else 0)))
      )
    )
  end lookup

  /** Increase the reference count of @source, returning a new reference.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gio.SettingsSchemaSource /* None */ =
    sn.gnome.gio.SettingsSchemaSource.fromRaw(
      g_settings_schema_source_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSettingsSchemaSource]]
      )
    )
  end ref

  /** Decrease the reference count of @source, possibly freeing it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_settings_schema_source_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSettingsSchemaSource]]
    )
  end unref

end SettingsSchemaSource

object SettingsSchemaSource:
  def fromRaw(ptr: Ptr[GSettingsSchemaSource]): SettingsSchemaSource =
    new SettingsSchemaSource(ptr)
end SettingsSchemaSource
