package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.OptionArg
import sn.gnome.glib.internal.{GOptionEntry, gchar, gint, gpointer}

/** A GOptionEntry struct defines a single option. To have an effect, they must
  * be added to a #GOptionGroup with g_option_context_add_main_entries() or
  * g_option_group_add_entries().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class OptionEntry private[gnome] (raw: Ptr[GOptionEntry]):

  def getUnsafeRawPointer(): Ptr[GOptionEntry] = this.raw

  /** The long name of an option can be used to specify it in a commandline as
    * `--long_name`. Every option must have a long name. To resolve conflicts if
    * multiple option groups contain the same long name, it is also possible to
    * specify the option as `--groupname-long_name`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def longName: scala.Predef.String /* None */ =
    (!raw).long_name.asInstanceOf[Ptr[gchar]]

  /** The long name of an option can be used to specify it in a commandline as
    * `--long_name`. Every option must have a long name. To resolve conflicts if
    * multiple option groups contain the same long name, it is also possible to
    * specify the option as `--groupname-long_name`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def longName_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).long_name_=(
      toCString(value).asInstanceOf[Ptr[gchar]].asInstanceOf[Ptr[gchar]]
    )

  /** If an option has a short name, it can be specified `-short_name` in a
    * commandline. @short_name must be a printable ASCII character different
    * from '-', or zero if the option has no short name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def shortName: Byte /* None */ = (!raw).short_name.asInstanceOf[gchar]

  /** If an option has a short name, it can be specified `-short_name` in a
    * commandline. @short_name must be a printable ASCII character different
    * from '-', or zero if the option has no short name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def shortName_=(value: Byte /* None */ ): Unit =
    (!raw).short_name_=(gchar(value).asInstanceOf[gchar])

  /** Flags from #GOptionFlags
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flags: Int /* None */ = (!raw).flags.asInstanceOf[gint]

  /** Flags from #GOptionFlags
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flags_=(value: Int /* None */ ): Unit =
    (!raw).flags_=(gint(value).asInstanceOf[gint])

  /** The type of the option, as a #GOptionArg
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def arg: sn.gnome.glib.OptionArg /* None */ =
    (!raw).arg.asInstanceOf[GOptionArg]

  /** The type of the option, as a #GOptionArg
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def arg_=(value: sn.gnome.glib.OptionArg /* None */ ): Unit =
    (!raw).arg_=(value.raw.asInstanceOf[GOptionArg])

  /** If the @arg type is %G_OPTION_ARG_CALLBACK, then @arg_data must point to a
    * #GOptionArgFunc callback function, which will be called to handle the
    * extra argument. Otherwise, @arg_data is a pointer to a location to store
    * the value, the required type of the location depends on the @arg type:
    *   - %G_OPTION_ARG_NONE: %gboolean
    *   - %G_OPTION_ARG_STRING: %gchar*
    *   - %G_OPTION_ARG_INT: %gint
    *   - %G_OPTION_ARG_FILENAME: %gchar*
    *   - %G_OPTION_ARG_STRING_ARRAY: %gchar**
    *   - %G_OPTION_ARG_FILENAME_ARRAY: %gchar**
    *   - %G_OPTION_ARG_DOUBLE: %gdouble
    * If @arg type is %G_OPTION_ARG_STRING or %G_OPTION_ARG_FILENAME, the
    * location will contain a newly allocated string if the option was given.
    * That string needs to be freed by the callee using g_free(). Likewise if @arg
    * type is %G_OPTION_ARG_STRING_ARRAY or %G_OPTION_ARG_FILENAME_ARRAY, the
    * data should be freed using g_strfreev().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def argData: Ptr[Byte] /* None */ = (!raw).arg_data.asInstanceOf[gpointer]

  /** If the @arg type is %G_OPTION_ARG_CALLBACK, then @arg_data must point to a
    * #GOptionArgFunc callback function, which will be called to handle the
    * extra argument. Otherwise, @arg_data is a pointer to a location to store
    * the value, the required type of the location depends on the @arg type:
    *   - %G_OPTION_ARG_NONE: %gboolean
    *   - %G_OPTION_ARG_STRING: %gchar*
    *   - %G_OPTION_ARG_INT: %gint
    *   - %G_OPTION_ARG_FILENAME: %gchar*
    *   - %G_OPTION_ARG_STRING_ARRAY: %gchar**
    *   - %G_OPTION_ARG_FILENAME_ARRAY: %gchar**
    *   - %G_OPTION_ARG_DOUBLE: %gdouble
    * If @arg type is %G_OPTION_ARG_STRING or %G_OPTION_ARG_FILENAME, the
    * location will contain a newly allocated string if the option was given.
    * That string needs to be freed by the callee using g_free(). Likewise if @arg
    * type is %G_OPTION_ARG_STRING_ARRAY or %G_OPTION_ARG_FILENAME_ARRAY, the
    * data should be freed using g_strfreev().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def argData_=(value: Ptr[Byte] /* None */ ): Unit =
    (!raw).arg_data_=(gpointer(value).asInstanceOf[gpointer])

  /** the description for the option in `--help` output. The @description is
    * translated using the @translate_func of the group, see
    * g_option_group_set_translation_domain().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def description: scala.Predef.String /* None */ =
    (!raw).description.asInstanceOf[Ptr[gchar]]

  /** the description for the option in `--help` output. The @description is
    * translated using the @translate_func of the group, see
    * g_option_group_set_translation_domain().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def description_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).description_=(
      toCString(value).asInstanceOf[Ptr[gchar]].asInstanceOf[Ptr[gchar]]
    )

  /** The placeholder to use for the extra argument parsed by the option in
    * `--help` output. The @arg_description is translated using the @translate_func
    * of the group, see g_option_group_set_translation_domain().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def argDescription: scala.Predef.String /* None */ =
    (!raw).arg_description.asInstanceOf[Ptr[gchar]]

  /** The placeholder to use for the extra argument parsed by the option in
    * `--help` output. The @arg_description is translated using the @translate_func
    * of the group, see g_option_group_set_translation_domain().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def argDescription_=(
      value: scala.Predef.String /* None */
  )(using Zone): Unit = (!raw).arg_description_=(
    toCString(value).asInstanceOf[Ptr[gchar]].asInstanceOf[Ptr[gchar]]
  )
end OptionEntry

object OptionEntry:
  def fromRaw(ptr: Ptr[GOptionEntry]): OptionEntry = new OptionEntry(ptr)
end OptionEntry
