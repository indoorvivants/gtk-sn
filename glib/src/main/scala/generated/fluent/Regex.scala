package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.{Regex, RegexCompileFlags, RegexMatchFlags}
import sn.gnome.glib.internal.{GRegex, gboolean, gchar, gint}

/** The g_regex_*() functions implement regular expression pattern matching
  * using syntax and semantics similar to Perl regular expression.
  *
  * Some functions accept a @start_position argument, setting it differs from
  * just passing over a shortened string and setting %G_REGEX_MATCH_NOTBOL in
  * the case of a pattern that begins with any kind of lookbehind assertion. For
  * example, consider the pattern "\Biss\B" which finds occurrences of "iss" in
  * the middle of words. ("\B" matches only if the current position in the
  * subject is not a word boundary.) When applied to the string "Mississipi"
  * from the fourth byte, namely "issipi", it does not match, because "\B" is
  * always false at the start of the subject, which is deemed to be a word
  * boundary. However, if the entire string is passed , but with
  * @start_position
  *   set to 4, it finds the second occurrence of "iss" because it is able to
  *   look behind the starting point to discover that it is preceded by a
  *   letter.
  *
  * Note that, unless you set the %G_REGEX_RAW flag, all the strings passed to
  * these functions must be encoded in UTF-8. The lengths and the positions
  * inside the strings are in bytes and not in characters, so, for instance,
  * "\xc3\xa0" (i.e. "à") is two bytes long but it is treated as a single
  * character. If you set %G_REGEX_RAW the strings can be non-valid UTF-8
  * strings and a byte is treated as a character, so "\xc3\xa0" is two bytes and
  * two characters long.
  *
  * When matching a pattern, "\n" matches only against a "\n" character in the
  * string, and "\r" matches only a "\r" character. To match any newline
  * sequence use "\R". This particular group matches either the two-character
  * sequence CR + LF ("\r\n"), or one of the single characters LF (linefeed,
  * U+000A, "\n"), VT vertical tab, U+000B, "\v"), FF (formfeed, U+000C, "\f"),
  * CR (carriage return, U+000D, "\r"), NEL (next line, U+0085), LS (line
  * separator, U+2028), or PS (paragraph separator, U+2029).
  *
  * The behaviour of the dot, circumflex, and dollar metacharacters are affected
  * by newline characters, the default is to recognize any newline character
  * (the same characters recognized by "\R"). This can be changed with
  * %G_REGEX_NEWLINE_CR, %G_REGEX_NEWLINE_LF and %G_REGEX_NEWLINE_CRLF compile
  * options, and with %G_REGEX_MATCH_NEWLINE_ANY, %G_REGEX_MATCH_NEWLINE_CR,
  * %G_REGEX_MATCH_NEWLINE_LF and %G_REGEX_MATCH_NEWLINE_CRLF match options.
  * These settings are also relevant when compiling a pattern if
  * %G_REGEX_EXTENDED is set, and an unescaped "#" outside a character class is
  * encountered. This indicates a comment that lasts until after the next
  * newline.
  *
  * Creating and manipulating the same #GRegex structure from different threads
  * is not a problem as #GRegex does not modify its internal state between
  * creation and destruction, on the other hand #GMatchInfo is not threadsafe.
  *
  * The regular expressions low-level functionalities are obtained through the
  * excellent [PCRE](http://www.pcre.org/) library written by Philip Hazel.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Regex private[gnome] (raw: Ptr[GRegex]):

  def getUnsafeRawPointer(): Ptr[GRegex] = this.raw

  /** Returns the number of capturing subpatterns in the pattern.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCaptureCount(): Int /* None */ =
    g_regex_get_capture_count(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GRegex]]
    ).value
  end getCaptureCount

  /** Returns the compile options that @regex was created with.
    *
    * Depending on the version of PCRE that is used, this may or may not include
    * flags set by option expressions such as `(?i)` found at the top-level
    * within the compiled pattern.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCompileFlags(): sn.gnome.glib.RegexCompileFlags /* None */ =
    sn.gnome.glib.RegexCompileFlags.fromRaw(
      g_regex_get_compile_flags(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GRegex]]
      )
    )
  end getCompileFlags

  /** Checks whether the pattern contains explicit CR or LF references.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHasCrOrLf(): Boolean /* None */ =
    g_regex_get_has_cr_or_lf(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GRegex]]
    ).value.!=(0)
  end getHasCrOrLf

  /** Returns the match options that @regex was created with.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMatchFlags(): sn.gnome.glib.RegexMatchFlags /* None */ =
    sn.gnome.glib.RegexMatchFlags.fromRaw(
      g_regex_get_match_flags(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GRegex]]
      )
    )
  end getMatchFlags

  /** Returns the number of the highest back reference in the pattern, or 0 if
    * the pattern does not contain back references.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMaxBackref(): Int /* None */ =
    g_regex_get_max_backref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GRegex]]
    ).value
  end getMaxBackref

  /** Gets the number of characters in the longest lookbehind assertion in the
    * pattern. This information is useful when doing multi-segment matching
    * using the partial matching facilities.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMaxLookbehind(): Int /* None */ =
    g_regex_get_max_lookbehind(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GRegex]]
    ).value
  end getMaxLookbehind

  /** Gets the pattern string associated with @regex, i.e. a copy of the string
    * passed to g_regex_new().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPattern(): scala.Predef.String /* None */ =
    fromCString(
      g_regex_get_pattern(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GRegex]]
      ).asInstanceOf
    )
  end getPattern

  /** Retrieves the number of the subexpression named @name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStringNumber(
      name: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): Int /* None */ =
    g_regex_get_string_number(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GRegex]],
      toCString(name).asInstanceOf[Ptr[gchar]]
    ).value
  end getStringNumber

  /**  Scans for a match in @string for the pattern in @regex.
    *  The @match_options are combined with the match options specified
    *  when the @regex structure was created, letting you have more
    *  flexibility in reusing #GRegex structures.
    *
    *  Unless %G_REGEX_RAW is specified in the options, @string must be valid UTF-8.
    *
    *  A #GMatchInfo structure, used to get information on the match,
    *  is stored in @match_info if not %NULL. Note that if @match_info
    *  is not %NULL then it is created even if the function returns %FALSE,
    *  i.e. you must free it regardless if regular expression actually matched.
    *
    *  To retrieve all the non-overlapping matches of the pattern in
    *  string you can use g_match_info_next().
    *
    *  |[<!-- language="C" -->
    *  static void
    *  print_uppercase_words (const gchar *string)
    *  {
    *    // Print all uppercase-only words.
    *    GRegex *regex;
    *    GMatchInfo *match_info;
    *
    *    regex = g_regex_new ("[A-Z]+", G_REGEX_DEFAULT, G_REGEX_MATCH_DEFAULT, NULL);
    *    g_regex_match (regex, string, 0, &match_info);
    *    while (g_match_info_matches (match_info))
    *      {
    *        gchar *word = g_match_info_fetch (match_info, 0);
    *        g_print ("Found: %s\n", word);
    *        g_free (word);
    *        g_match_info_next (match_info, NULL);
    *      }
    *    g_match_info_free (match_info);
    *    g_regex_unref (regex);
    *  }
    *  ]|
    *
    *  @string is not copied and is used in #GMatchInfo internally. If
    *  you use any #GMatchInfo method (except g_match_info_free()) after
    *  freeing or modifying @string then the behaviour is undefined.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method match]: Method match contains an OUT parameter, which is not supported yet"
  )
  private def match__ = ???

  /** Using the standard algorithm for regular expression matching only the
    * longest match in the string is retrieved. This function uses a different
    * algorithm so it can retrieve all the possible matches. For more
    * documentation see g_regex_match_all_full().
    *
    * A #GMatchInfo structure, used to get information on the match, is stored
    * in @match_info if not %NULL. Note that if @match_info is not %NULL then it
    * is created even if the function returns %FALSE, i.e. you must free it
    * regardless if regular expression actually matched.
    *
    * @string
    *   is not copied and is used in #GMatchInfo internally. If you use any
    *   #GMatchInfo method (except g_match_info_free()) after freeing or
    *   modifying @string then the behaviour is undefined.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method match_all]: Method match_all contains an OUT parameter, which is not supported yet"
  )
  private def matchAll__ = ???

  /** Using the standard algorithm for regular expression matching only the
    * longest match in the @string is retrieved, it is not possible to obtain
    * all the available matches. For instance matching "<a> <b> <c>" against the
    * pattern "<.*>" you get "<a> <b> <c>".
    *
    * This function uses a different algorithm (called DFA, i.e. deterministic
    * finite automaton), so it can retrieve all the possible matches, all
    * starting at the same point in the string. For instance matching "<a> <b>
    * <c>" against the pattern "<.*>;" you would obtain three matches: "<a> <b>
    * <c>", "<a> <b>" and "<a>".
    *
    * The number of matched strings is retrieved using
    * g_match_info_get_match_count(). To obtain the matched strings and their
    * position you can use, respectively, g_match_info_fetch() and
    * g_match_info_fetch_pos(). Note that the strings are returned in reverse
    * order of length; that is, the longest matching string is given first.
    *
    * Note that the DFA algorithm is slower than the standard one and it is not
    * able to capture substrings, so backreferences do not work.
    *
    * Setting @start_position differs from just passing over a shortened string
    * and setting %G_REGEX_MATCH_NOTBOL in the case of a pattern that begins
    * with any kind of lookbehind assertion, such as "\b".
    *
    * Unless %G_REGEX_RAW is specified in the options, @string must be valid
    * UTF-8.
    *
    * A #GMatchInfo structure, used to get information on the match, is stored
    * in @match_info if not %NULL. Note that if @match_info is not %NULL then it
    * is created even if the function returns %FALSE, i.e. you must free it
    * regardless if regular expression actually matched.
    *
    * @string
    *   is not copied and is used in #GMatchInfo internally. If you use any
    *   #GMatchInfo method (except g_match_info_free()) after freeing or
    *   modifying @string then the behaviour is undefined.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method match_all_full]: Method match_all_full contains an OUT parameter, which is not supported yet"
  )
  private def matchAllFull__ = ???

  /**  Scans for a match in @string for the pattern in @regex.
    *  The @match_options are combined with the match options specified
    *  when the @regex structure was created, letting you have more
    *  flexibility in reusing #GRegex structures.
    *
    *  Setting @start_position differs from just passing over a shortened
    *  string and setting %G_REGEX_MATCH_NOTBOL in the case of a pattern
    *  that begins with any kind of lookbehind assertion, such as "\b".
    *
    *  Unless %G_REGEX_RAW is specified in the options, @string must be valid UTF-8.
    *
    *  A #GMatchInfo structure, used to get information on the match, is
    *  stored in @match_info if not %NULL. Note that if @match_info is
    *  not %NULL then it is created even if the function returns %FALSE,
    *  i.e. you must free it regardless if regular expression actually
    *  matched.
    *
    *  @string is not copied and is used in #GMatchInfo internally. If
    *  you use any #GMatchInfo method (except g_match_info_free()) after
    *  freeing or modifying @string then the behaviour is undefined.
    *
    *  To retrieve all the non-overlapping matches of the pattern in
    *  string you can use g_match_info_next().
    *
    *  |[<!-- language="C" -->
    *  static void
    *  print_uppercase_words (const gchar *string)
    *  {
    *    // Print all uppercase-only words.
    *    GRegex *regex;
    *    GMatchInfo *match_info;
    *    GError *error = NULL;
    *
    *    regex = g_regex_new ("[A-Z]+", G_REGEX_DEFAULT, G_REGEX_MATCH_DEFAULT, NULL);
    *    g_regex_match_full (regex, string, -1, 0, 0, &match_info, &error);
    *    while (g_match_info_matches (match_info))
    *      {
    *        gchar *word = g_match_info_fetch (match_info, 0);
    *        g_print ("Found: %s\n", word);
    *        g_free (word);
    *        g_match_info_next (match_info, &error);
    *      }
    *    g_match_info_free (match_info);
    *    g_regex_unref (regex);
    *    if (error != NULL)
    *      {
    *        g_printerr ("Error while matching: %s\n", error->message);
    *        g_error_free (error);
    *      }
    *  }
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method match_full]: Method match_full contains an OUT parameter, which is not supported yet"
  )
  private def matchFull__ = ???

  /** Increases reference count of @regex by 1.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.glib.Regex /* None */ =
    sn.gnome.glib.Regex.fromRaw(
      g_regex_ref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GRegex]])
    )
  end ref

  /** Replaces all occurrences of the pattern in @regex with the replacement
    * text. Backreferences of the form '\number' or '\g<number>' in the
    * replacement text are interpolated by the number-th captured subexpression
    * of the match, '\g<name>' refers to the captured subexpression with the
    * given name. '\0' refers to the complete match, but '\0' followed by a
    * number is the octal representation of a character. To include a literal
    * '\' in the replacement, write '\\\\'.
    *
    * There are also escapes that changes the case of the following text:
    *
    *   - \l: Convert to lower case the next character
    *   - \u: Convert to upper case the next character
    *   - \L: Convert to lower case till \E
    *   - \U: Convert to upper case till \E
    *   - \E: End case modification
    *
    * If you do not need to use backreferences use g_regex_replace_literal().
    *
    * The @replacement string must be UTF-8 encoded even if %G_REGEX_RAW was
    * passed to g_regex_new(). If you want to use not UTF-8 encoded strings you
    * can use g_regex_replace_literal().
    *
    * Setting @start_position differs from just passing over a shortened string
    * and setting %G_REGEX_MATCH_NOTBOL in the case of a pattern that begins
    * with any kind of lookbehind assertion, such as "\b".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method replace/<method parameters>/string]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const gchar*)))"
  )
  private def replace__ = ???

  /**  Replaces occurrences of the pattern in regex with the output of
    *  @eval for that occurrence.
    *
    *  Setting @start_position differs from just passing over a shortened
    *  string and setting %G_REGEX_MATCH_NOTBOL in the case of a pattern
    *  that begins with any kind of lookbehind assertion, such as "\b".
    *
    *  The following example uses g_regex_replace_eval() to replace multiple
    *  strings at once:
    *  |[<!-- language="C" -->
    *  static gboolean
    *  eval_cb (const GMatchInfo *info,
    *           GString          *res,
    *           gpointer          data)
    *  {
    *    gchar *match;
    *    gchar *r;
    *
    *     match = g_match_info_fetch (info, 0);
    *     r = g_hash_table_lookup ((GHashTable *)data, match);
    *     g_string_append (res, r);
    *     g_free (match);
    *
    *     return FALSE;
    *  }
    *
    *  ...
    *
    *  GRegex *reg;
    *  GHashTable *h;
    *  gchar *res;
    *
    *  h = g_hash_table_new (g_str_hash, g_str_equal);
    *
    *  g_hash_table_insert (h, "1", "ONE");
    *  g_hash_table_insert (h, "2", "TWO");
    *  g_hash_table_insert (h, "3", "THREE");
    *  g_hash_table_insert (h, "4", "FOUR");
    *
    *  reg = g_regex_new ("1|2|3|4", G_REGEX_DEFAULT, G_REGEX_MATCH_DEFAULT, NULL);
    *  res = g_regex_replace_eval (reg, text, -1, 0, 0, eval_cb, h, NULL);
    *  g_hash_table_destroy (h);
    *
    *  ...
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method replace_eval/<method parameters>/string]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const gchar*)))"
  )
  private def replaceEval__ = ???

  /** Replaces all occurrences of the pattern in @regex with the replacement
    * text. @replacement is replaced literally, to include backreferences use
    * g_regex_replace().
    *
    * Setting @start_position differs from just passing over a shortened string
    * and setting %G_REGEX_MATCH_NOTBOL in the case of a pattern that begins
    * with any kind of lookbehind assertion, such as "\b".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method replace_literal/<method parameters>/string]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const gchar*)))"
  )
  private def replaceLiteral__ = ???

  /** Breaks the string on the pattern, and returns an array of the tokens. If
    * the pattern contains capturing parentheses, then the text for each of the
    * substrings will also be returned. If the pattern does not match anywhere
    * in the string, then the whole string is returned as the first token.
    *
    * As a special case, the result of splitting the empty string "" is an empty
    * vector, not a vector containing a single string. The reason for this
    * special case is that being able to represent an empty vector is typically
    * more useful than consistent handling of empty elements. If you do need to
    * represent empty elements, you'll need to check for the empty string before
    * calling this function.
    *
    * A pattern that can match empty strings splits @string into separate
    * characters wherever it matches the empty string between characters. For
    * example splitting "ab c" using as a separator "\s*", you will get "a", "b"
    * and "c".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method split/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def split__ = ???

  /** Breaks the string on the pattern, and returns an array of the tokens. If
    * the pattern contains capturing parentheses, then the text for each of the
    * substrings will also be returned. If the pattern does not match anywhere
    * in the string, then the whole string is returned as the first token.
    *
    * As a special case, the result of splitting the empty string "" is an empty
    * vector, not a vector containing a single string. The reason for this
    * special case is that being able to represent an empty vector is typically
    * more useful than consistent handling of empty elements. If you do need to
    * represent empty elements, you'll need to check for the empty string before
    * calling this function.
    *
    * A pattern that can match empty strings splits @string into separate
    * characters wherever it matches the empty string between characters. For
    * example splitting "ab c" using as a separator "\s*", you will get "a", "b"
    * and "c".
    *
    * Setting @start_position differs from just passing over a shortened string
    * and setting %G_REGEX_MATCH_NOTBOL in the case of a pattern that begins
    * with any kind of lookbehind assertion, such as "\b".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method split_full/<method parameters>/string]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const gchar*)))"
  )
  private def splitFull__ = ???

  /** Decreases reference count of @regex by 1. When reference count drops to
    * zero, it frees all the memory associated with the regex structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_regex_unref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GRegex]])
  end unref

end Regex

object Regex:
  def fromRaw(ptr: Ptr[GRegex]): Regex = new Regex(ptr)
end Regex
