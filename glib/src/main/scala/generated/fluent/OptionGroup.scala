package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.OptionGroup
import sn.gnome.glib.internal.{GOptionGroup, gchar}

/** A `GOptionGroup` struct defines the options in a single group. The struct
  * has only private fields and should not be directly accessed.
  *
  * All options in a group share the same translation function. Libraries which
  * need to parse commandline options are expected to provide a function for
  * getting a `GOptionGroup` holding their options, which the application can
  * then add to its #GOptionContext.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class OptionGroup private[gnome] (raw: Ptr[GOptionGroup]):

  def getUnsafeRawPointer(): Ptr[GOptionGroup] = this.raw

  /** Adds the options specified in @entries to @group.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_entries/<method parameters>/entries]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(OptionEntry), @type -> DataRecord(GOptionEntry)))),ListMap(@type -> DataRecord(const GOptionEntry*)))"
  )
  private def addEntries__ = ???

  /** Frees a #GOptionGroup. Note that you must not free groups which have been
    * added to a #GOptionContext.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_option_group_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GOptionGroup]]
    )
  end free

  /** Increments the reference count of @group by one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.glib.OptionGroup /* None */ =
    sn.gnome.glib.OptionGroup.fromRaw(
      g_option_group_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GOptionGroup]]
      )
    )
  end ref

  /** Associates a function with @group which will be called from
    * g_option_context_parse() when an error occurs.
    *
    * Note that the user data to be passed to @error_func can be specified when
    * constructing the group with g_option_group_new().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_error_hook/<method parameters>/error_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(OptionErrorFunc), @type -> DataRecord(GOptionErrorFunc)))"
  )
  private def setErrorHook__ = ???

  /** Associates two functions with @group which will be called from
    * g_option_context_parse() before the first option is parsed and after the
    * last option has been parsed, respectively.
    *
    * Note that the user data to be passed to @pre_parse_func and
    * @post_parse_func
    *   can be specified when constructing the group with g_option_group_new().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_parse_hooks/<method parameters>/pre_parse_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(OptionParseFunc), @type -> DataRecord(GOptionParseFunc)))"
  )
  private def setParseHooks__ = ???

  /** Sets the function which is used to translate user-visible strings, for
    * `--help` output. Different groups can use different #GTranslateFuncs. If @func
    * is %NULL, strings are not translated.
    *
    * If you are using gettext(), you only need to set the translation domain,
    * see g_option_group_set_translation_domain().
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
    g_option_group_set_translation_domain(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GOptionGroup]],
      toCString(domain).asInstanceOf[Ptr[gchar]]
    )
  end setTranslationDomain

  /** Decrements the reference count of @group by one. If the reference count
    * drops to 0, the @group will be freed. and all memory allocated by the @group
    * is released.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_option_group_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GOptionGroup]]
    )
  end unref

end OptionGroup

object OptionGroup:
  def fromRaw(ptr: Ptr[GOptionGroup]): OptionGroup = new OptionGroup(ptr)
end OptionGroup
