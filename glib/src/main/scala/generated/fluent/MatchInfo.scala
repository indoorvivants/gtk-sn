package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.{GResult, MatchInfo, Regex}
import sn.gnome.glib.internal.{GMatchInfo, gboolean, gchar, gint}

/** A GMatchInfo is an opaque struct used to return information about matches.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MatchInfo private[gnome] (raw: Ptr[GMatchInfo]):

  def getUnsafeRawPointer(): Ptr[GMatchInfo] = this.raw

  /** Returns a new string containing the text in @string_to_expand with
    * references and escape sequences expanded. References refer to the last
    * match done with @string against @regex and have the same syntax used by
    * g_regex_replace().
    *
    * The @string_to_expand must be UTF-8 encoded even if %G_REGEX_RAW was
    * passed to g_regex_new().
    *
    * The backreferences are extracted from the string passed to the match
    * function, so you cannot call this function after freeing the string.
    *
    * @match_info
    *   may be %NULL in which case @string_to_expand must not contain
    *   references. For instance "foo\n" does not refer to an actual pattern and
    *   '\n' merely will be replaced with \n character, while to expand "\0"
    *   (whole match) one needs the result of a match. Use
    *   g_regex_check_replacement() to find out whether @string_to_expand
    *   contains references.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def expandReferences(
      string_to_expand: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): GResult[scala.Predef.String /* None */ ] =
    GResult.wrap(__errorPtr =>
      fromCString(
        g_match_info_expand_references(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GMatchInfo]],
          toCString(string_to_expand).asInstanceOf[Ptr[gchar]],
          __errorPtr
        ).asInstanceOf
      )
    )
  end expandReferences

  /** Retrieves the text matching the @match_num'th capturing parentheses. 0 is
    * the full text of the match, 1 is the first paren set, 2 the second, and so
    * on.
    *
    * If @match_num is a valid sub pattern but it didn't match anything (e.g.
    * sub pattern 1, matching "b" against "(a)?b") then an empty string is
    * returned.
    *
    * If the match was obtained using the DFA algorithm, that is using
    * g_regex_match_all() or g_regex_match_all_full(), the retrieved string is
    * not that of a set of parentheses but that of a matched substring.
    * Substrings are matched in reverse order of length, so 0 is the longest
    * match.
    *
    * The string is fetched from the string passed to the match function, so you
    * cannot call this function after freeing the string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fetch(
      match_num: Int /* Some(gint) */
  )(using Zone): scala.Predef.String /* None */ =
    fromCString(
      g_match_info_fetch(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMatchInfo]],
        gint(match_num)
      ).asInstanceOf
    )
  end fetch

  /** Bundles up pointers to each of the matching substrings from a match and
    * stores them in an array of gchar pointers. The first element in the
    * returned array is the match number 0, i.e. the entire matched text.
    *
    * If a sub pattern didn't match anything (e.g. sub pattern 1, matching "b"
    * against "(a)?b") then an empty string is inserted.
    *
    * If the last match was obtained using the DFA algorithm, that is using
    * g_regex_match_all() or g_regex_match_all_full(), the retrieved strings are
    * not that matched by sets of parentheses but that of the matched substring.
    * Substrings are matched in reverse order of length, so the first one is the
    * longest match.
    *
    * The strings are fetched from the string passed to the match function, so
    * you cannot call this function after freeing the string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method fetch_all/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def fetchAll__ = ???

  /** Retrieves the text matching the capturing parentheses named @name.
    *
    * If @name is a valid sub pattern name but it didn't match anything (e.g.
    * sub pattern "X", matching "b" against "(?P<X>a)?b") then an empty string
    * is returned.
    *
    * The string is fetched from the string passed to the match function, so you
    * cannot call this function after freeing the string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fetchNamed(
      name: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): scala.Predef.String /* None */ =
    fromCString(
      g_match_info_fetch_named(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMatchInfo]],
        toCString(name).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )
  end fetchNamed

  /** Retrieves the position in bytes of the capturing parentheses named @name.
    *
    * If @name is a valid sub pattern name but it didn't match anything (e.g.
    * sub pattern "X", matching "b" against "(?P<X>a)?b") then @start_pos and @end_pos
    * are set to -1 and %TRUE is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method fetch_named_pos]: Method fetch_named_pos contains an OUT parameter, which is not supported yet"
  )
  private def fetchNamedPos__ = ???

  /** Retrieves the position in bytes of the @match_num'th capturing
    * parentheses. 0 is the full text of the match, 1 is the first paren set, 2
    * the second, and so on.
    *
    * If @match_num is a valid sub pattern but it didn't match anything (e.g.
    * sub pattern 1, matching "b" against "(a)?b") then @start_pos and @end_pos
    * are set to -1 and %TRUE is returned.
    *
    * If the match was obtained using the DFA algorithm, that is using
    * g_regex_match_all() or g_regex_match_all_full(), the retrieved position is
    * not that of a set of parentheses but that of a matched substring.
    * Substrings are matched in reverse order of length, so 0 is the longest
    * match.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method fetch_pos]: Method fetch_pos contains an OUT parameter, which is not supported yet"
  )
  private def fetchPos__ = ???

  /** If @match_info is not %NULL, calls g_match_info_unref(); otherwise does
    * nothing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_match_info_free(this.getUnsafeRawPointer().asInstanceOf[Ptr[GMatchInfo]])
  end free

  /** Retrieves the number of matched substrings (including substring 0, that is
    * the whole matched text), so 1 is returned if the pattern has no substrings
    * in it and 0 is returned if the match failed.
    *
    * If the last match was obtained using the DFA algorithm, that is using
    * g_regex_match_all() or g_regex_match_all_full(), the retrieved count is
    * not that of the number of capturing parentheses but that of the number of
    * matched substrings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMatchCount(): Int /* None */ =
    g_match_info_get_match_count(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMatchInfo]]
    ).value
  end getMatchCount

  /** Returns #GRegex object used in @match_info. It belongs to Glib and must
    * not be freed. Use g_regex_ref() if you need to keep it after you free @match_info
    * object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRegex(): sn.gnome.glib.Regex /* None */ =
    sn.gnome.glib.Regex.fromRaw(
      g_match_info_get_regex(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMatchInfo]]
      )
    )
  end getRegex

  /** Returns the string searched with @match_info. This is the string passed to
    * g_regex_match() or g_regex_replace() so you may not free it before calling
    * this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getString(): scala.Predef.String /* None */ =
    fromCString(
      g_match_info_get_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMatchInfo]]
      ).asInstanceOf
    )
  end getString

  /** Usually if the string passed to g_regex_match*() matches as far as it
    * goes, but is too short to match the entire pattern, %FALSE is returned.
    * There are circumstances where it might be helpful to distinguish this case
    * from other cases in which there is no match.
    *
    * Consider, for example, an application where a human is required to type in
    * data for a field with specific formatting requirements. An example might
    * be a date in the form ddmmmyy, defined by the pattern
    * "^\d?\d(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)\d\d$". If the
    * application sees the user’s keystrokes one by one, and can check that what
    * has been typed so far is potentially valid, it is able to raise an error
    * as soon as a mistake is made.
    *
    * GRegex supports the concept of partial matching by means of the
    * %G_REGEX_MATCH_PARTIAL_SOFT and %G_REGEX_MATCH_PARTIAL_HARD flags. When
    * they are used, the return code for g_regex_match() or g_regex_match_full()
    * is, as usual, %TRUE for a complete match, %FALSE otherwise. But, when
    * these functions return %FALSE, you can check if the match was partial
    * calling g_match_info_is_partial_match().
    *
    * The difference between %G_REGEX_MATCH_PARTIAL_SOFT and
    * %G_REGEX_MATCH_PARTIAL_HARD is that when a partial match is encountered
    * with %G_REGEX_MATCH_PARTIAL_SOFT, matching continues to search for a
    * possible complete match, while with %G_REGEX_MATCH_PARTIAL_HARD matching
    * stops at the partial match. When both %G_REGEX_MATCH_PARTIAL_SOFT and
    * %G_REGEX_MATCH_PARTIAL_HARD are set, the latter takes precedence.
    *
    * There were formerly some restrictions on the pattern for partial matching.
    * The restrictions no longer apply.
    *
    * See pcrepartial(3) for more information on partial matching.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isPartialMatch(): Boolean /* None */ =
    g_match_info_is_partial_match(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMatchInfo]]
    ).value.!=(0)
  end isPartialMatch

  /** Returns whether the previous match operation succeeded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def matches(): Boolean /* None */ =
    g_match_info_matches(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMatchInfo]]
    ).value.!=(0)
  end matches

  /** Scans for the next match using the same parameters of the previous call to
    * g_regex_match_full() or g_regex_match() that returned
    * @match_info.
    *
    * The match is done on the string passed to the match function, so you
    * cannot free it before calling this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def next(): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_match_info_next(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMatchInfo]],
        __errorPtr
      ).value.!=(0)
    )
  end next

  /** Increases reference count of @match_info by 1.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.glib.MatchInfo /* None */ =
    sn.gnome.glib.MatchInfo.fromRaw(
      g_match_info_ref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GMatchInfo]])
    )
  end ref

  /** Decreases reference count of @match_info by 1. When reference count drops
    * to zero, it frees all the memory associated with the match_info structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_match_info_unref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GMatchInfo]])
  end unref

end MatchInfo

object MatchInfo:
  def fromRaw(ptr: Ptr[GMatchInfo]): MatchInfo = new MatchInfo(ptr)
end MatchInfo
