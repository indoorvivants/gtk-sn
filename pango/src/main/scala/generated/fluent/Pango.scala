package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gchar, gint, guint32, gunichar}
import sn.gnome.pango.fluent.{
  AttrType,
  BidiType,
  Direction,
  Gravity,
  GravityHint,
  Script
}

object Pango:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new allow-breaks attribute.
    *
    * If breaks are disabled, the range will be kept in a single run, as far as
    * possible.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrAllowBreaksNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new background alpha attribute.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrBackgroundAlphaNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new background color attribute.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrBackgroundNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new baseline displacement attribute.
    *
    * The effect of this attribute is to shift the baseline of a run, relative
    * to the run of preceding run.
    *
    * <picture> <source srcset="baseline-shift-dark.png"
    * media="(prefers-color-scheme: dark)"> <img alt="Baseline Shift"
    * src="baseline-shift-light.png"> </picture>
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrBaselineShiftNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Apply customization from attributes to the breaks in @attrs.
    *
    * The line breaks are assumed to have been produced by
    * [func@Pango.default_break] and [func@Pango.tailor_break].
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(AttrList), @type -> DataRecord(PangoAttrList*)))"
  )
  def attrBreak() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new font fallback attribute.
    *
    * If fallback is disabled, characters will only be used from the closest
    * matching font on the system. No fallback will be done to other fonts on
    * the system that might contain the characters in the text.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrFallbackNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new font family attribute.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrFamilyNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new font description attribute.
    *
    * This attribute allows setting family, style, weight, variant, stretch, and
    * size simultaneously.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(const PangoFontDescription*)))"
  )
  def attrFontDescNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new font features tag attribute.
    *
    * You can use this attribute to select OpenType font features like
    * small-caps, alternative glyphs, ligatures, etc. for fonts that support
    * them.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrFontFeaturesNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new font scale attribute.
    *
    * The effect of this attribute is to change the font size of a run, relative
    * to the size of preceding run.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrFontScaleNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new foreground alpha attribute.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrForegroundAlphaNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new foreground color attribute.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrForegroundNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new gravity hint attribute.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrGravityHintNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new gravity attribute.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrGravityNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new insert-hyphens attribute.
    *
    * Pango will insert hyphens when breaking lines in the middle of a word.
    * This attribute can be used to suppress the hyphen.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrInsertHyphensNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new language tag attribute.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Language), @type -> DataRecord(PangoLanguage*)))"
  )
  def attrLanguageNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new letter-spacing attribute.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrLetterSpacingNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Modify the height of logical line extents by a factor.
    *
    * This affects the values returned by [method@Pango.LayoutLine.get_extents],
    * [method@Pango.LayoutLine.get_pixel_extents] and
    * [method@Pango.LayoutIter.get_line_extents].
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrLineHeightNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Override the height of logical line extents to be @height.
    *
    * This affects the values returned by [method@Pango.LayoutLine.get_extents],
    * [method@Pango.LayoutLine.get_pixel_extents] and
    * [method@Pango.LayoutIter.get_line_extents].
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrLineHeightNewAbsolute() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Deserializes a `PangoAttrList` from a string.
    *
    * This is the counterpart to [method@Pango.AttrList.to_string]. See that
    * functions for details about the format.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(AttrList), @type -> DataRecord(PangoAttrList*)))"
  )
  def attrListFromString() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new overline color attribute.
    *
    * This attribute modifies the color of overlines. If not set, overlines will
    * use the foreground color.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrOverlineColorNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new overline-style attribute.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrOverlineNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new baseline displacement attribute.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrRiseNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new font size scale attribute.
    *
    * The base font for the affected text will have its size multiplied by @scale_factor.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrScaleNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Marks the range of the attribute as a single sentence.
    *
    * Note that this may require adjustments to word and sentence classification
    * around the range.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrSentenceNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new shape attribute.
    *
    * A shape is used to impose a particular ink and logical rectangle on the
    * result of shaping a particular glyph. This might be used, for instance,
    * for embedding a picture or a widget inside a `PangoLayout`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Rectangle), @type -> DataRecord(const PangoRectangle*)))"
  )
  def attrShapeNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new shape attribute.
    *
    * Like [func@Pango.AttrShape.new], but a user data pointer is also provided;
    * this pointer can be accessed when later rendering the glyph.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Rectangle), @type -> DataRecord(const PangoRectangle*)))"
  )
  def attrShapeNewWithData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new attribute that influences how invisible characters are
    * rendered.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrShowNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new font-size attribute in fractional points.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrSizeNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new font-size attribute in device units.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrSizeNewAbsolute() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new font stretch attribute.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrStretchNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new strikethrough color attribute.
    *
    * This attribute modifies the color of strikethrough lines. If not set,
    * strikethrough lines will use the foreground color.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrStrikethroughColorNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new strike-through attribute.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrStrikethroughNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new font slant style attribute.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrStyleNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new attribute that influences how characters are transformed
    * during shaping.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrTextTransformNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the attribute type name.
    *
    * The attribute type name is the string passed in when registering the type
    * using [func@Pango.AttrType.register].
    *
    * The returned value is an interned string (see g_intern_string() for what
    * that means) that should not be modified or freed.
    */
  def attrTypeGetName(
      `type`: AttrType /* Some(PangoAttrType) */
  )(using Zone): String /* Some(CString) */ = fromCString(
    pango_attr_type_get_name(`type`.raw).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Allocate a new attribute type ID.
    *
    * The attribute type name can be accessed later by using
    * [func@Pango.AttrType.get_name].
    */
  def attrTypeRegister(
      name: String | CString /* Some(CString) */
  )(using Zone): AttrType /* Some(PangoAttrType) */ =
    AttrType.fromRaw(pango_attr_type_register(__sn_extract_string(name)))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new underline color attribute.
    *
    * This attribute modifies the color of underlines. If not set, underlines
    * will use the foreground color.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrUnderlineColorNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new underline-style attribute.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrUnderlineNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new font variant attribute (normal or small caps).
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrVariantNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new font weight attribute.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrWeightNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Marks the range of the attribute as a single word.
    *
    * Note that this may require adjustments to word and sentence classification
    * around the range.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Attribute), @type -> DataRecord(PangoAttribute*)))"
  )
  def attrWordNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines the bidirectional type of a character.
    *
    * The bidirectional type is specified in the Unicode Character Database.
    *
    * A simplified version of this function is available as
    * [func@unichar_direction].
    */
  def bidiTypeForUnichar(
      ch: CUnsignedInt /* Some(_root_.sn.gnome.glib.internal.gunichar) */
  ): BidiType /* Some(PangoBidiType) */ =
    BidiType.fromRaw(pango_bidi_type_for_unichar(gunichar(guint32(ch))))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines possible line, word, and character breaks for a string of
    * Unicode text with a single analysis.
    *
    * For most purposes you may want to use [func@Pango.get_log_attrs].
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Analysis), @type -> DataRecord(PangoAnalysis*)))"
  )
  def break() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This is the default break algorithm.
    *
    * It applies rules from the [Unicode Line Breaking
    * Algorithm](http://www.unicode.org/unicode/reports/tr14/) without
    * language-specific tailoring, therefore the @analyis argument is unused and
    * can be %NULL.
    *
    * See [func@Pango.tailor_break] for language-specific breaks.
    *
    * See [func@Pango.attr_break] for attribute-based customization.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Analysis), @type -> DataRecord(PangoAnalysis*)))"
  )
  def defaultBreak() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts extents from Pango units to device units.
    *
    * The conversion is done by dividing by the %PANGO_SCALE factor and
    * performing rounding.
    *
    * The @inclusive rectangle is converted by flooring the x/y coordinates and
    * extending width/height, such that the final rectangle completely includes
    * the original rectangle.
    *
    * The @nearest rectangle is converted by rounding the coordinates of the
    * rectangle to the nearest device unit (pixel).
    *
    * The rule to which argument to use is: if you want the resulting
    * device-space rectangle to completely contain the original rectangle, pass
    * it in as
    * @inclusive.
    *   If you want two touching-but-not-overlapping rectangles stay
    *   touching-but-not-overlapping after rounding to device units, pass them
    *   in as @nearest.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Rectangle), @type -> DataRecord(PangoRectangle*)))"
  )
  def extentsToPixels() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Searches a string the first character that has a strong direction,
    * according to the Unicode bidirectional algorithm.
    */
  def findBaseDir(
      text: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      length: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  )(using Zone): Direction /* Some(PangoDirection) */ = Direction.fromRaw(
    pango_find_base_dir(
      __sn_extract_string(text).asInstanceOf[Ptr[gchar]],
      gint(length)
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Locates a paragraph boundary in @text.
    *
    * A boundary is caused by delimiter characters, such as a newline, carriage
    * return, carriage return-newline pair, or Unicode paragraph separator
    * character.
    *
    * The index of the run of delimiters is returned in
    * @paragraph_delimiter_index.
    *   The index of the start of the next paragraph (index after all
    *   delimiters) is stored n
    * @next_paragraph_start.
    *
    * If no delimiters are found, both @paragraph_delimiter_index and @next_paragraph_start
    * are filled with the length of @text (an index one off the end).
    */
  @annotation.compileTimeOnly(
    "Function find_paragraph_boundary contains an OUT parameter, which is not supported yet"
  )
  def findParagraphBoundary() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new font description from a string representation.
    *
    * The string must have the form
    *
    * "\[FAMILY-LIST] \[STYLE-OPTIONS] \[SIZE] \[VARIATIONS]",
    *
    * where FAMILY-LIST is a comma-separated list of families optionally
    * terminated by a comma, STYLE_OPTIONS is a whitespace-separated list of
    * words where each word describes one of style, variant, weight, stretch, or
    * gravity, and SIZE is a decimal number (size in points) or optionally
    * followed by the unit modifier "px" for absolute size. VARIATIONS is a
    * comma-separated list of font variation specifications of the form
    * "\@axis=value" (the = sign is optional).
    *
    * The following words are understood as styles: "Normal", "Roman",
    * "Oblique", "Italic".
    *
    * The following words are understood as variants: "Small-Caps",
    * "All-Small-Caps", "Petite-Caps", "All-Petite-Caps", "Unicase",
    * "Title-Caps".
    *
    * The following words are understood as weights: "Thin", "Ultra-Light",
    * "Extra-Light", "Light", "Semi-Light", "Demi-Light", "Book", "Regular",
    * "Medium", "Semi-Bold", "Demi-Bold", "Bold", "Ultra-Bold", "Extra-Bold",
    * "Heavy", "Black", "Ultra-Black", "Extra-Black".
    *
    * The following words are understood as stretch values: "Ultra-Condensed",
    * "Extra-Condensed", "Condensed", "Semi-Condensed", "Semi-Expanded",
    * "Expanded", "Extra-Expanded", "Ultra-Expanded".
    *
    * The following words are understood as gravity values: "Not-Rotated",
    * "South", "Upside-Down", "North", "Rotated-Left", "East", "Rotated-Right",
    * "West".
    *
    * Any one of the options may be absent. If FAMILY-LIST is absent, then the
    * family_name field of the resulting font description will be initialized to
    * %NULL. If STYLE-OPTIONS is missing, then all style options will be set to
    * the default values. If SIZE is missing, the size in the resulting font
    * description will be set to 0.
    *
    * A typical example:
    *
    * "Cantarell Italic Light 15 \@wght=200"
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(PangoFontDescription*)))"
  )
  def fontDescriptionFromString() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Computes a `PangoLogAttr` for each character in @text.
    *
    * The @attrs array must have one `PangoLogAttr` for each position in @text;
    * if @text contains N characters, it has N+1 positions, including the last
    * position at the end of the text. @text should be an entire paragraph;
    * logical attributes can't be computed without context (for example you need
    * to see spaces on either side of a word to know the word is a word).
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Language), @type -> DataRecord(PangoLanguage*)))"
  )
  def getLogAttrs() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the mirrored character of a Unicode character.
    *
    * Mirror characters are determined by the Unicode mirrored property.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(gunichar), @type -> DataRecord(gunichar*)))"
  )
  def getMirrorChar() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finds the gravity that best matches the rotation component in a
    * `PangoMatrix`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Matrix), @type -> DataRecord(const PangoMatrix*)))"
  )
  def gravityGetForMatrix() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the gravity to use in laying out a `PangoItem`.
    *
    * The gravity is determined based on the script, base gravity, and hint.
    *
    * If @base_gravity is %PANGO_GRAVITY_AUTO, it is first replaced with the
    * preferred gravity of @script. To get the preferred gravity of a script,
    * pass %PANGO_GRAVITY_AUTO and %PANGO_GRAVITY_HINT_STRONG in.
    */
  def gravityGetForScript(
      script: Script /* Some(PangoScript) */,
      base_gravity: Gravity /* Some(PangoGravity) */,
      hint: GravityHint /* Some(PangoGravityHint) */
  ): Gravity /* Some(PangoGravity) */ = Gravity.fromRaw(
    pango_gravity_get_for_script(script.raw, base_gravity.raw, hint.raw)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the gravity to use in laying out a single character or
    * `PangoItem`.
    *
    * The gravity is determined based on the script, East Asian width, base
    * gravity, and hint,
    *
    * This function is similar to [func@Pango.Gravity.get_for_script] except
    * that this function makes a distinction between narrow/half-width and
    * wide/full-width characters also. Wide/full-width characters always stand
    * *upright*, that is, they always take the base gravity, whereas
    * narrow/full-width characters are always rotated in vertical context.
    *
    * If @base_gravity is %PANGO_GRAVITY_AUTO, it is first replaced with the
    * preferred gravity of @script.
    */
  def gravityGetForScriptAndWidth(
      script: Script /* Some(PangoScript) */,
      wide: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      base_gravity: Gravity /* Some(PangoGravity) */,
      hint: GravityHint /* Some(PangoGravityHint) */
  ): Gravity /* Some(PangoGravity) */ = Gravity.fromRaw(
    pango_gravity_get_for_script_and_width(
      script.raw,
      gboolean(gint((if wide == true then 1 else 0))),
      base_gravity.raw,
      hint.raw
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts a `PangoGravity` value to its natural rotation in radians.
    *
    * Note that [method@Pango.Matrix.rotate] takes angle in degrees, not
    * radians. So, to call [method@Pango.Matrix,rotate] with the output of this
    * function you should multiply it by (180. / G_PI).
    */
  def gravityToRotation(
      gravity: Gravity /* Some(PangoGravity) */
  ): Double /* Some(Double) */ = pango_gravity_to_rotation(gravity.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if a character that should not be normally rendered.
    *
    * This includes all Unicode characters with "ZERO WIDTH" in their name, as
    * well as *bidi* formatting characters, and a few other ones.
    *
    * This is totally different from [func@GLib.unichar_iszerowidth] and is at
    * best misnamed.
    */
  def isZeroWidth(
      ch: CUnsignedInt /* Some(_root_.sn.gnome.glib.internal.gunichar) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    pango_is_zero_width(gunichar(guint32(ch))).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Breaks a piece of text into segments with consistent directional level and
    * font.
    *
    * Each byte of @text will be contained in exactly one of the items in the
    * returned list; the generated list of items will be in logical order (the
    * start offsets of the items are ascending).
    *
    * @cached_iter
    *   should be an iterator over @attrs currently positioned at a range before
    *   or containing @start_index; @cached_iter will be advanced to the range
    *   covering the position just after
    * @start_index
    *   + @length. (i.e. if itemizing in a loop, just keep passing in the same @cached_iter).
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(AttrList), @type -> DataRecord(PangoAttrList*)))"
  )
  def itemize() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Like `pango_itemize()`, but with an explicitly specified base direction.
    *
    * The base direction is used when computing bidirectional levels.
    * [func@itemize] gets the base direction from the `PangoContext` (see
    * [method@Pango.Context.set_base_dir]).
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(AttrList), @type -> DataRecord(PangoAttrList*)))"
  )
  def itemizeWithBaseDir() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convert a language tag to a `PangoLanguage`.
    *
    * The language tag must be in a RFC-3066 format. `PangoLanguage` pointers
    * can be efficiently copied (copy the pointer) and compared with other
    * language tags (compare the pointer.)
    *
    * This function first canonicalizes the string by converting it to
    * lowercase, mapping '_' to '-', and stripping all characters other than
    * letters and '-'.
    *
    * Use [func@Pango.Language.get_default] if you want to get the
    * `PangoLanguage` for the current locale of the process.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Language), @type -> DataRecord(PangoLanguage*)))"
  )
  def languageFromString() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `PangoLanguage` for the current locale of the process.
    *
    * On Unix systems, this is the return value is derived from
    * `setlocale (LC_CTYPE, NULL)`, and the user can affect this through the
    * environment variables LC_ALL, LC_CTYPE or LANG (checked in that order).
    * The locale string typically is in the form lang_COUNTRY, where lang is an
    * ISO-639 language code, and COUNTRY is an ISO-3166 country code. For
    * instance, sv_FI for Swedish as written in Finland or pt_BR for Portuguese
    * as written in Brazil.
    *
    * On Windows, the C library does not use any such environment variables, and
    * setting them won't affect the behavior of functions like ctime(). The user
    * sets the locale through the Regional Options in the Control Panel. The C
    * library (in the setlocale() function) does not use country and language
    * codes, but country and language names spelled out in English. However,
    * this function does check the above environment variables, and does return
    * a Unix-style locale string based on either said environment variables or
    * the thread's current locale.
    *
    * Your application should call `setlocale(LC_ALL, "")` for the user settings
    * to take effect. GTK does this in its initialization functions
    * automatically (by calling gtk_set_locale()). See the setlocale() manpage
    * for more details.
    *
    * Note that the default language can change over the life of an application.
    *
    * Also note that this function will not do the right thing if you use
    * per-thread locales with uselocale(). In that case, you should just call
    * pango_language_from_string() yourself.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Language), @type -> DataRecord(PangoLanguage*)))"
  )
  def languageGetDefault() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the list of languages that the user prefers.
    *
    * The list is specified by the `PANGO_LANGUAGE` or `LANGUAGE` environment
    * variables, in order of preference. Note that this list does not
    * necessarily include the language returned by
    * [func@Pango.Language.get_default].
    *
    * When choosing language-specific resources, such as the sample text
    * returned by [method@Pango.Language.get_sample_string], you should first
    * try the default language, followed by the languages returned by this
    * function.
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Language), @type -> DataRecord(PangoLanguage*)))),ListMap(@type -> DataRecord(PangoLanguage**)))"
  )
  def languageGetPreferred() = ???

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def layoutDeserializeErrorQuark() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Return the bidirectional embedding levels of the input paragraph.
    *
    * The bidirectional embedding levels are defined by the [Unicode
    * Bidirectional Algorithm](http://www.unicode.org/reports/tr9/).
    *
    * If the input base direction is a weak direction, the direction of the
    * characters in the text will determine the final resolved direction.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guint8*)))"
  )
  def log2visGetEmbeddingLevels() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes parsing markup.
    *
    * After feeding a Pango markup parser some data with
    * [method@GLib.MarkupParseContext.parse], use this function to get the list
    * of attributes and text out of the markup. This function will not free @context,
    * use [method@GLib.MarkupParseContext.free] to do so.
    */
  @annotation.compileTimeOnly(
    "Function markup_parser_finish contains an OUT parameter, which is not supported yet"
  )
  def markupParserFinish() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Incrementally parses marked-up text to create a plain-text string and an
    * attribute list.
    *
    * See the [Pango Markup](pango_markup.html) docs for details about the
    * supported markup.
    *
    * If @accel_marker is nonzero, the given character will mark the character
    * following it as an accelerator. For example, @accel_marker might be an
    * ampersand or underscore. All characters marked as an accelerator will
    * receive a %PANGO_UNDERLINE_LOW attribute, and the first character so
    * marked will be returned in @accel_char, when calling
    * [func@markup_parser_finish]. Two @accel_marker characters following each
    * other produce a single literal @accel_marker character.
    *
    * To feed markup to the parser, use [method@GLib.MarkupParseContext.parse]
    * on the returned [struct@GLib.MarkupParseContext]. When done with feeding
    * markup to the parser, use [func@markup_parser_finish] to get the data out
    * of it, and then use [method@GLib.MarkupParseContext.free] to free it.
    *
    * This function is designed for applications that read Pango markup from
    * streams. To simply parse a string containing Pango markup, the
    * [func@Pango.parse_markup] API is recommended instead.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.MarkupParseContext), @type -> DataRecord(GMarkupParseContext*)))"
  )
  def markupParserNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Parses an enum type and stores the result in @value.
    *
    * If @str does not match the nick name of any of the possible values for the
    * enum and is not an integer, %FALSE is returned, a warning is issued if @warn
    * is %TRUE, and a string representing the list of possible values is stored
    * in @possible_values. The list is slash-separated, eg.
    * "none/start/middle/end".
    *
    * If failed and @possible_values is not %NULL, returned string should be
    * freed using g_free().
    */
  @annotation.compileTimeOnly(
    "Function parse_enum contains an OUT parameter, which is not supported yet"
  )
  def parseEnum() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Parses marked-up text to create a plain-text string and an attribute list.
    *
    * See the [Pango Markup](pango_markup.html) docs for details about the
    * supported markup.
    *
    * If @accel_marker is nonzero, the given character will mark the character
    * following it as an accelerator. For example, @accel_marker might be an
    * ampersand or underscore. All characters marked as an accelerator will
    * receive a %PANGO_UNDERLINE_LOW attribute, and the first character so
    * marked will be returned in @accel_char. Two @accel_marker characters
    * following each other produce a single literal @accel_marker character.
    *
    * To parse a stream of pango markup incrementally, use
    * [func@markup_parser_new].
    *
    * If any error happens, none of the output arguments are touched except for @error.
    */
  @annotation.compileTimeOnly(
    "Function parse_markup contains an OUT parameter, which is not supported yet"
  )
  def parseMarkup() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Parses a font stretch.
    *
    * The allowed values are "ultra_condensed", "extra_condensed", "condensed",
    * "semi_condensed", "normal", "semi_expanded", "expanded", "extra_expanded"
    * and "ultra_expanded". Case variations are ignored and the '_' characters
    * may be omitted.
    */
  @annotation.compileTimeOnly(
    "Function parse_stretch contains an OUT parameter, which is not supported yet"
  )
  def parseStretch() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Parses a font style.
    *
    * The allowed values are "normal", "italic" and "oblique", case variations
    * being ignored.
    */
  @annotation.compileTimeOnly(
    "Function parse_style contains an OUT parameter, which is not supported yet"
  )
  def parseStyle() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Parses a font variant.
    *
    * The allowed values are "normal", "small-caps", "all-small-caps",
    * "petite-caps", "all-petite-caps", "unicase" and "title-caps", case
    * variations being ignored.
    */
  @annotation.compileTimeOnly(
    "Function parse_variant contains an OUT parameter, which is not supported yet"
  )
  def parseVariant() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Parses a font weight.
    *
    * The allowed values are "heavy", "ultrabold", "bold", "normal", "light",
    * "ultraleight" and integers. Case variations are ignored.
    */
  @annotation.compileTimeOnly(
    "Function parse_weight contains an OUT parameter, which is not supported yet"
  )
  def parseWeight() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Quantizes the thickness and position of a line to whole device pixels.
    *
    * This is typically used for underline or strikethrough. The purpose of this
    * function is to avoid such lines looking blurry.
    *
    * Care is taken to make sure @thickness is at least one pixel when this
    * function returns, but returned @position may become zero as a result of
    * rounding.
    */
  @annotation.compileTimeOnly(
    "Function quantize_line_geometry contains an INOUT parameter, which is not supported yet"
  )
  def quantizeLineGeometry() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reads an entire line from a file into a buffer.
    *
    * Lines may be delimited with '\n', '\r', '\n\r', or '\r\n'. The delimiter
    * is not written into the buffer. Text after a '#' character is treated as a
    * comment and skipped. '\' can be used to escape a # character. '\'
    * proceeding a line delimiter combines adjacent lines. A '\' proceeding any
    * other character is ignored and written into the output buffer unmodified.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(FILE*)))"
  )
  def readLine() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reorder items from logical order to visual order.
    *
    * The visual order is determined from the associated directional levels of
    * the items. The original list is unmodified.
    *
    * (Please open a bug if you use this function. It is not a particularly
    * convenient interface, and the code is duplicated elsewhere in Pango for
    * that reason.)
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Item))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  def reorderItems() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scans an integer.
    *
    * Leading white space is skipped.
    */
  @annotation.compileTimeOnly(
    "Function scan_int contains an OUT parameter, which is not supported yet"
  )
  def scanInt() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scans a string into a `GString` buffer.
    *
    * The string may either be a sequence of non-white-space characters, or a
    * quoted string with '"'. Instead a quoted string, '\"' represents a literal
    * quote. Leading white space outside of quotes is skipped.
    */
  @annotation.compileTimeOnly(
    "Function scan_string contains an INOUT parameter, which is not supported yet"
  )
  def scanString() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scans a word into a `GString` buffer.
    *
    * A word consists of [A-Za-z_] followed by zero or more [A-Za-z_0-9].
    * Leading white space is skipped.
    */
  @annotation.compileTimeOnly(
    "Function scan_word contains an INOUT parameter, which is not supported yet"
  )
  def scanWord() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks up the script for a particular character.
    *
    * The script of a character is defined by [Unicode Standard Annex 24: Script
    * names](http://www.unicode.org/reports/tr24/).
    *
    * No check is made for @ch being a valid Unicode character; if you pass in
    * invalid character, the result is undefined.
    *
    * Note that while the return type of this function is declared as
    * `PangoScript`, as of Pango 1.18, this function simply returns the return
    * value of [func@GLib.unichar_get_script]. Callers must be prepared to
    * handle unknown values.
    */
  def scriptForUnichar(
      ch: CUnsignedInt /* Some(_root_.sn.gnome.glib.internal.gunichar) */
  ): Script /* Some(PangoScript) */ =
    Script.fromRaw(pango_script_for_unichar(gunichar(guint32(ch))))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finds a language tag that is reasonably representative of @script.
    *
    * The language will usually be the most widely spoken or used language
    * written in that script: for instance, the sample language for
    * %PANGO_SCRIPT_CYRILLIC is ru (Russian), the sample language for
    * %PANGO_SCRIPT_ARABIC is ar.
    *
    * For some scripts, no sample language will be returned because there is no
    * language that is sufficiently representative. The best example of this is
    * %PANGO_SCRIPT_HAN, where various different variants of written Chinese,
    * Japanese, and Korean all use significantly different sets of Han
    * characters and forms of shared characters. No sample language can be
    * provided for many historical scripts as well.
    *
    * As of 1.18, this function checks the environment variables
    * `PANGO_LANGUAGE` and `LANGUAGE` (checked in that order) first. If one of
    * them is set, it is parsed as a list of language tags separated by colons
    * or other separators. This function will return the first language in the
    * parsed list that Pango believes may use @script for writing. This last
    * predicate is tested using [method@Pango.Language.includes_script]. This
    * can be used to control Pango's font selection for non-primary languages.
    * For example, a `PANGO_LANGUAGE` enviroment variable set to "en:fa" makes
    * Pango choose fonts suitable for Persian (fa) instead of Arabic (ar) when a
    * segment of Arabic text is found in an otherwise non-Arabic text. The same
    * trick can be used to choose a default language for %PANGO_SCRIPT_HAN when
    * setting context language is not feasible.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Language), @type -> DataRecord(PangoLanguage*)))"
  )
  def scriptGetSampleLanguage() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convert the characters in @text into glyphs.
    *
    * Given a segment of text and the corresponding `PangoAnalysis` structure
    * returned from [func@Pango.itemize], convert the characters into glyphs.
    * You may also pass in only a substring of the item from
    * [func@Pango.itemize].
    *
    * It is recommended that you use [func@Pango.shape_full] instead, since that
    * API allows for shaping interaction happening across text item boundaries.
    *
    * Some aspects of hyphen insertion and text transformation (in particular,
    * capitalization) require log attrs, and thus can only be handled by
    * [func@Pango.shape_item].
    *
    * Note that the extra attributes in the @analyis that is returned from
    * [func@Pango.itemize] have indices that are relative to the entire
    * paragraph, so you need to subtract the item offset from their indices
    * before calling [func@Pango.shape].
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Analysis), @type -> DataRecord(const PangoAnalysis*)))"
  )
  def shape() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convert the characters in @text into glyphs.
    *
    * Given a segment of text and the corresponding `PangoAnalysis` structure
    * returned from [func@Pango.itemize], convert the characters into glyphs.
    * You may also pass in only a substring of the item from
    * [func@Pango.itemize].
    *
    * This is similar to [func@Pango.shape], except it also can optionally take
    * the full paragraph text as input, which will then be used to perform
    * certain cross-item shaping interactions. If you have access to the broader
    * text of which @item_text is part of, provide the broader text as
    * @paragraph_text.
    *   If @paragraph_text is %NULL, item text is used instead.
    *
    * Some aspects of hyphen insertion and text transformation (in particular,
    * capitalization) require log attrs, and thus can only be handled by
    * [func@Pango.shape_item].
    *
    * Note that the extra attributes in the @analyis that is returned from
    * [func@Pango.itemize] have indices that are relative to the entire
    * paragraph, so you do not pass the full paragraph text as @paragraph_text,
    * you need to subtract the item offset from their indices before calling
    * [func@Pango.shape_full].
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Analysis), @type -> DataRecord(const PangoAnalysis*)))"
  )
  def shapeFull() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convert the characters in @item into glyphs.
    *
    * This is similar to [func@Pango.shape_with_flags], except it takes a
    * `PangoItem` instead of separate @item_text and @analysis arguments.
    *
    * It also takes @log_attrs, which are needed for implementing some aspects
    * of hyphen insertion and text transforms (in particular, capitalization).
    *
    * Note that the extra attributes in the @analyis that is returned from
    * [func@Pango.itemize] have indices that are relative to the entire
    * paragraph, so you do not pass the full paragraph text as @paragraph_text,
    * you need to subtract the item offset from their indices before calling
    * [func@Pango.shape_with_flags].
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Item), @type -> DataRecord(PangoItem*)))"
  )
  def shapeItem() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convert the characters in @text into glyphs.
    *
    * Given a segment of text and the corresponding `PangoAnalysis` structure
    * returned from [func@Pango.itemize], convert the characters into glyphs.
    * You may also pass in only a substring of the item from
    * [func@Pango.itemize].
    *
    * This is similar to [func@Pango.shape_full], except it also takes flags
    * that can influence the shaping process.
    *
    * Some aspects of hyphen insertion and text transformation (in particular,
    * capitalization) require log attrs, and thus can only be handled by
    * [func@Pango.shape_item].
    *
    * Note that the extra attributes in the @analyis that is returned from
    * [func@Pango.itemize] have indices that are relative to the entire
    * paragraph, so you do not pass the full paragraph text as @paragraph_text,
    * you need to subtract the item offset from their indices before calling
    * [func@Pango.shape_with_flags].
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Analysis), @type -> DataRecord(const PangoAnalysis*)))"
  )
  def shapeWithFlags() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Skips 0 or more characters of white space.
    */
  @annotation.compileTimeOnly(
    "Function skip_space contains an INOUT parameter, which is not supported yet"
  )
  def skipSpace() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Splits a %G_SEARCHPATH_SEPARATOR-separated list of files, stripping white
    * space and substituting ~/ with $HOME/.
    */
  def splitFileList(str: String | CString /* Some(CString) */ )(using
      Zone
  ): Array[String] /* Some(Ptr[CString]) */ = __decode_nullable_ptrs(
    pango_split_file_list(__sn_extract_string(str))
  ).map(fromCString(_))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Deserializes a `PangoTabArray` from a string.
    *
    * This is the counterpart to [method@Pango.TabArray.to_string]. See that
    * functions for details about the format.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TabArray), @type -> DataRecord(PangoTabArray*)))"
  )
  def tabArrayFromString() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Apply language-specific tailoring to the breaks in @attrs.
    *
    * The line breaks are assumed to have been produced by
    * [func@Pango.default_break].
    *
    * If @offset is not -1, it is used to apply attributes from @analysis that
    * are relevant to line breaking.
    *
    * Note that it is better to pass -1 for @offset and use
    * [func@Pango.attr_break] to apply attributes to the whole paragraph.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Analysis), @type -> DataRecord(PangoAnalysis*)))"
  )
  def tailorBreak() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Trims leading and trailing whitespace from a string.
    */
  def trimString(
      str: String | CString /* Some(CString) */
  )(using Zone): String /* Some(CString) */ = fromCString(
    pango_trim_string(__sn_extract_string(str)).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines the inherent direction of a character.
    *
    * The inherent direction is either `PANGO_DIRECTION_LTR`,
    * `PANGO_DIRECTION_RTL`, or `PANGO_DIRECTION_NEUTRAL`.
    *
    * This function is useful to categorize characters into left-to-right
    * letters, right-to-left letters, and everything else. If full Unicode
    * bidirectional type of a character is needed,
    * [func@Pango.BidiType.for_unichar] can be used instead.
    */
  def unicharDirection(
      ch: CUnsignedInt /* Some(_root_.sn.gnome.glib.internal.gunichar) */
  ): Direction /* Some(PangoDirection) */ =
    Direction.fromRaw(pango_unichar_direction(gunichar(guint32(ch))))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts a floating-point number to Pango units.
    *
    * The conversion is done by multiplying @d by %PANGO_SCALE and rounding the
    * result to nearest integer.
    */
  def unitsFromDouble(d: Double /* Some(Double) */ ): Int /* Some(CInt) */ =
    pango_units_from_double(d)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts a number in Pango units to floating-point.
    *
    * The conversion is done by dividing @i by %PANGO_SCALE.
    */
  def unitsToDouble(i: Int /* Some(CInt) */ ): Double /* Some(Double) */ =
    pango_units_to_double(i)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the encoded version of Pango available at run-time.
    *
    * This is similar to the macro %PANGO_VERSION except that the macro returns
    * the encoded version available at compile-time. A version number can be
    * encoded into an integer using PANGO_VERSION_ENCODE().
    */
  def version(): Int /* Some(CInt) */ = pango_version()

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks that the Pango library in use is compatible with the given version.
    *
    * Generally you would pass in the constants %PANGO_VERSION_MAJOR,
    * %PANGO_VERSION_MINOR, %PANGO_VERSION_MICRO as the three arguments to this
    * function; that produces a check that the library in use at run-time is
    * compatible with the version of Pango the application or module was
    * compiled against.
    *
    * Compatibility is defined by two things: first the version of the running
    * library is newer than the version
    * @required_major.required_minor.@required_micro.
    *   Second the running library must be binary compatible with the version @required_major.required_minor.@required_micro
    *   (same major version.)
    *
    * For compile-time version checking use PANGO_VERSION_CHECK().
    */
  def versionCheck(
      required_major: Int /* Some(CInt) */,
      required_minor: Int /* Some(CInt) */,
      required_micro: Int /* Some(CInt) */
  )(using Zone): String /* Some(CString) */ = fromCString(
    pango_version_check(
      required_major,
      required_minor,
      required_micro
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the version of Pango available at run-time.
    *
    * This is similar to the macro %PANGO_VERSION_STRING except that the macro
    * returns the version available at compile-time.
    */
  def versionString()(using Zone): String /* Some(CString) */ = fromCString(
    pango_version_string().asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string

  private inline def __decode_nullable_ptrs[T](p: Ptr[Ptr[T]])(using
      ptag: Tag[T]
  ): Array[Ptr[T]] =
    val ab = Array.newBuilder[Ptr[T]]
    var offset = 0
    val tg = Tag.materializePtrTag(ptag)
    while p(offset)(using tg) != null do
      ab += p(offset)(using tg)
      offset += 1
    end while
    ab.result()
  end __decode_nullable_ptrs
end Pango
