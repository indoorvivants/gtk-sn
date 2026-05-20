package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.pango.Script
import sn.gnome.pango.internal.PangoLanguage

/** The `PangoLanguage` structure is used to represent a language.
  *
  * `PangoLanguage` pointers can be efficiently copied and compared with each
  * other.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Language private[gnome] (raw: Ptr[PangoLanguage]):

  def getUnsafeRawPointer(): Ptr[PangoLanguage] = this.raw

  /** Get a string that is representative of the characters needed to render a
    * particular language.
    *
    * The sample text may be a pangram, but is not necessarily. It is chosen to
    * be demonstrative of normal text in the language, as well as exposing font
    * feature requirements unique to the language. It is suitable for use as
    * sample text in a font selection dialog.
    *
    * If @language is %NULL, the default language as found by
    * [func@Pango.Language.get_default] is used.
    *
    * If Pango does not have a sample string for @language, the classic "The
    * quick brown fox..." is returned. This can be detected by comparing the
    * returned pointer value to that returned for (non-existent) language code
    * "xx". That is, compare to:
    *
    * ```
    * pango_language_get_sample_string (pango_language_from_string ("xx"))
    * ```
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSampleString(): scala.Predef.String /* None */ =
    fromCString(
      pango_language_get_sample_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLanguage]]
      ).asInstanceOf
    )
  end getSampleString

  /** Determines the scripts used to to write @language.
    *
    * If nothing is known about the language tag @language, or if @language is
    * %NULL, then %NULL is returned. The list of scripts returned starts with
    * the script that the language uses most and continues to the one it uses
    * least.
    *
    * The value @num_script points at will be set to the number of scripts in
    * the returned array (or zero if %NULL is returned).
    *
    * Most languages use only one script for writing, but there are some that
    * use two (Latin and Cyrillic for example), and a few use three (Japanese
    * for example). Applications should not make any assumptions on the maximum
    * number of scripts returned though, except that it is positive if the
    * return value is not %NULL, and it is a small number.
    *
    * The [method@Pango.Language.includes_script] function uses this function
    * internally.
    *
    * Note: while the return value is declared as `PangoScript`, the returned
    * values are from the `GUnicodeScript` enumeration, which may have more
    * values. Callers need to handle unknown values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_scripts]: Method get_scripts contains an OUT parameter, which is not supported yet"
  )
  private def getScripts__ = ???

  /** Determines if @script is one of the scripts used to write @language.
    *
    * The returned value is conservative; if nothing is known about the language
    * tag @language, %TRUE will be returned, since, as far as Pango knows, @script
    * might be used to write @language.
    *
    * This routine is used in Pango's itemization process when determining if a
    * supplied language tag is relevant to a particular section of text. It
    * probably is not useful for applications in most circumstances.
    *
    * This function uses [method@Pango.Language.get_scripts] internally.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def includesScript(
      script: sn.gnome.pango.Script /* Some(PangoScript) */
  ): Boolean /* None */ =
    pango_language_includes_script(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLanguage]],
      script.raw
    ).value.!=(0)
  end includesScript

  /** Checks if a language tag matches one of the elements in a list of language
    * ranges.
    *
    * A language tag is considered to match a range in the list if the range is
    * '*', the range is exactly the tag, or the range is a prefix of the tag,
    * and the character after it in the tag is '-'.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def matches(
      range_list: scala.Predef.String /* Some(CString) */
  )(using Zone): Boolean /* None */ =
    pango_language_matches(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLanguage]],
      toCString(range_list)
    ).value.!=(0)
  end matches

  /** Gets the RFC-3066 format string representing the given language tag.
    *
    * Returns (transfer none): a string representing the language tag
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def _toString(): scala.Predef.String /* None */ =
    fromCString(
      pango_language_to_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLanguage]]
      ).asInstanceOf
    )
  end _toString

end Language

object Language:
  def fromRaw(ptr: Ptr[PangoLanguage]): Language = new Language(ptr)
end Language
