package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.{List, MarkupParseContext}
import sn.gnome.glib.internal.{
  gboolean,
  gchar,
  gint,
  guint16,
  guint32,
  gunichar
}
import sn.gnome.gobject.runtime.*
import sn.gnome.pango.{
  Analysis,
  AttrIterator,
  AttrList,
  AttrType,
  Attribute,
  BidiType,
  Context,
  Direction,
  FontDescription,
  FontScale,
  GlyphString,
  Gravity,
  GravityHint,
  Item,
  Language,
  LogAttr,
  Matrix,
  Overline,
  Rectangle,
  Script,
  ShapeFlags,
  ShowFlags,
  Stretch,
  Style,
  TabArray,
  TextTransform,
  Underline,
  Variant,
  Weight
}
import sn.gnome.runtime.*

object Pango:
  /** Create a new allow-breaks attribute.
    *
    * If breaks are disabled, the range will be kept in a single run, as far as
    * possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrAllowBreaksNew(
      allow_breaks: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(
      pango_attr_allow_breaks_new(
        gboolean(gint((if allow_breaks == true then 1 else 0)))
      )
    )

  /** Create a new background alpha attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrBackgroundAlphaNew(
      alpha: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute
      .fromRaw(pango_attr_background_alpha_new(guint16(alpha)))

  /** Create a new background color attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrBackgroundNew(
      red: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */,
      green: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */,
      blue: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(
      pango_attr_background_new(guint16(red), guint16(green), guint16(blue))
    )

  /** Create a new baseline displacement attribute.
    *
    * The effect of this attribute is to shift the baseline of a run, relative
    * to the run of preceding run.
    *
    * <picture> <source srcset="baseline-shift-dark.png"
    * media="(prefers-color-scheme: dark)"> <img alt="Baseline Shift"
    * src="baseline-shift-light.png"> </picture>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrBaselineShiftNew(
      shift: Int /* Some(CInt) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(pango_attr_baseline_shift_new(shift))

  /** Apply customization from attributes to the breaks in @attrs.
    *
    * The line breaks are assumed to have been produced by
    * [func@Pango.default_break] and [func@Pango.tailor_break].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[attr_break:/<function parameters>/attrs]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(LogAttr), @type -> DataRecord(PangoLogAttr)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(5), @type -> DataRecord(PangoLogAttr*)))"
  )
  private def attrBreak() = ???

  /** Create a new font fallback attribute.
    *
    * If fallback is disabled, characters will only be used from the closest
    * matching font on the system. No fallback will be done to other fonts on
    * the system that might contain the characters in the text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrFallbackNew(
      enable_fallback: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(
      pango_attr_fallback_new(
        gboolean(gint((if enable_fallback == true then 1 else 0)))
      )
    )

  /** Create a new font family attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrFamilyNew(
      family: scala.Predef.String /* Some(CString) */
  )(using Runtime): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute
      .fromRaw(pango_attr_family_new(summon[Runtime].inZone(toCString(family))))

  /** Create a new font description attribute.
    *
    * This attribute allows setting family, style, weight, variant, stretch, and
    * size simultaneously.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrFontDescNew(
      desc: sn.gnome.pango.FontDescription /* Some(Ptr[PangoFontDescription]) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(
      pango_attr_font_desc_new(desc.getUnsafeRawPointer().asInstanceOf)
    )

  /** Create a new font features tag attribute.
    *
    * You can use this attribute to select OpenType font features like
    * small-caps, alternative glyphs, ligatures, etc. for fonts that support
    * them.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrFontFeaturesNew(
      features: scala.Predef.String /* Some(CString) */
  )(using Runtime): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(
      pango_attr_font_features_new(summon[Runtime].inZone(toCString(features)))
    )

  /** Create a new font scale attribute.
    *
    * The effect of this attribute is to change the font size of a run, relative
    * to the size of preceding run.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrFontScaleNew(
      scale: sn.gnome.pango.FontScale /* Some(PangoFontScale) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(pango_attr_font_scale_new(scale.raw))

  /** Create a new foreground alpha attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrForegroundAlphaNew(
      alpha: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute
      .fromRaw(pango_attr_foreground_alpha_new(guint16(alpha)))

  /** Create a new foreground color attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrForegroundNew(
      red: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */,
      green: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */,
      blue: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(
      pango_attr_foreground_new(guint16(red), guint16(green), guint16(blue))
    )

  /** Create a new gravity hint attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrGravityHintNew(
      hint: sn.gnome.pango.GravityHint /* Some(PangoGravityHint) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(pango_attr_gravity_hint_new(hint.raw))

  /** Create a new gravity attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrGravityNew(
      gravity: sn.gnome.pango.Gravity /* Some(PangoGravity) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(pango_attr_gravity_new(gravity.raw))

  /** Create a new insert-hyphens attribute.
    *
    * Pango will insert hyphens when breaking lines in the middle of a word.
    * This attribute can be used to suppress the hyphen.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrInsertHyphensNew(
      insert_hyphens: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(
      pango_attr_insert_hyphens_new(
        gboolean(gint((if insert_hyphens == true then 1 else 0)))
      )
    )

  /** Create a new language tag attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrLanguageNew(
      language: sn.gnome.pango.Language /* Some(Ptr[PangoLanguage]) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(
      pango_attr_language_new(language.getUnsafeRawPointer().asInstanceOf)
    )

  /** Create a new letter-spacing attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrLetterSpacingNew(
      letter_spacing: Int /* Some(CInt) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute
      .fromRaw(pango_attr_letter_spacing_new(letter_spacing))

  /** Modify the height of logical line extents by a factor.
    *
    * This affects the values returned by [method@Pango.LayoutLine.get_extents],
    * [method@Pango.LayoutLine.get_pixel_extents] and
    * [method@Pango.LayoutIter.get_line_extents].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrLineHeightNew(
      factor: Double /* Some(Double) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(pango_attr_line_height_new(factor))

  /** Override the height of logical line extents to be @height.
    *
    * This affects the values returned by [method@Pango.LayoutLine.get_extents],
    * [method@Pango.LayoutLine.get_pixel_extents] and
    * [method@Pango.LayoutIter.get_line_extents].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrLineHeightNewAbsolute(
      height: Int /* Some(CInt) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute
      .fromRaw(pango_attr_line_height_new_absolute(height))

  /** Deserializes a `PangoAttrList` from a string.
    *
    * This is the counterpart to [method@Pango.AttrList.to_string]. See that
    * functions for details about the format.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrListFromString(
      text: scala.Predef.String /* Some(CString) */
  )(using Runtime): sn.gnome.pango.AttrList /* Some(Ptr[PangoAttrList]) */ =
    sn.gnome.pango.AttrList.fromRaw(
      pango_attr_list_from_string(summon[Runtime].inZone(toCString(text)))
    )

  /** Create a new overline color attribute.
    *
    * This attribute modifies the color of overlines. If not set, overlines will
    * use the foreground color.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrOverlineColorNew(
      red: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */,
      green: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */,
      blue: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(
      pango_attr_overline_color_new(guint16(red), guint16(green), guint16(blue))
    )

  /** Create a new overline-style attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrOverlineNew(
      overline: sn.gnome.pango.Overline /* Some(PangoOverline) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(pango_attr_overline_new(overline.raw))

  /** Create a new baseline displacement attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrRiseNew(
      rise: Int /* Some(CInt) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(pango_attr_rise_new(rise))

  /** Create a new font size scale attribute.
    *
    * The base font for the affected text will have its size multiplied by @scale_factor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrScaleNew(
      scale_factor: Double /* Some(Double) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(pango_attr_scale_new(scale_factor))

  /** Marks the range of the attribute as a single sentence.
    *
    * Note that this may require adjustments to word and sentence classification
    * around the range.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrSentenceNew()
      : sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(pango_attr_sentence_new())

  /** Create a new shape attribute.
    *
    * A shape is used to impose a particular ink and logical rectangle on the
    * result of shaping a particular glyph. This might be used, for instance,
    * for embedding a picture or a widget inside a `PangoLayout`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrShapeNew(
      ink_rect: sn.gnome.pango.Rectangle /* Some(Ptr[PangoRectangle]) */,
      logical_rect: sn.gnome.pango.Rectangle /* Some(Ptr[PangoRectangle]) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(
      pango_attr_shape_new(
        ink_rect.getUnsafeRawPointer().asInstanceOf,
        logical_rect.getUnsafeRawPointer().asInstanceOf
      )
    )

  /** Creates a new shape attribute.
    *
    * Like [func@Pango.AttrShape.new], but a user data pointer is also provided;
    * this pointer can be accessed when later rendering the glyph.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[attr_shape_new_with_data:/<function parameters>/copy_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AttrDataCopyFunc), @type -> DataRecord(PangoAttrDataCopyFunc)))"
  )
  private def attrShapeNewWithData() = ???

  /** Create a new attribute that influences how invisible characters are
    * rendered.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrShowNew(
      flags: sn.gnome.pango.ShowFlags /* Some(PangoShowFlags) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(pango_attr_show_new(flags.raw))

  /** Create a new font-size attribute in fractional points.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrSizeNew(
      size: Int /* Some(CInt) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(pango_attr_size_new(size))

  /** Create a new font-size attribute in device units.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrSizeNewAbsolute(
      size: Int /* Some(CInt) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(pango_attr_size_new_absolute(size))

  /** Create a new font stretch attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrStretchNew(
      stretch: sn.gnome.pango.Stretch /* Some(PangoStretch) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(pango_attr_stretch_new(stretch.raw))

  /** Create a new strikethrough color attribute.
    *
    * This attribute modifies the color of strikethrough lines. If not set,
    * strikethrough lines will use the foreground color.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrStrikethroughColorNew(
      red: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */,
      green: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */,
      blue: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(
      pango_attr_strikethrough_color_new(
        guint16(red),
        guint16(green),
        guint16(blue)
      )
    )

  /** Create a new strike-through attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrStrikethroughNew(
      strikethrough: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(
      pango_attr_strikethrough_new(
        gboolean(gint((if strikethrough == true then 1 else 0)))
      )
    )

  /** Create a new font slant style attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrStyleNew(
      style: sn.gnome.pango.Style /* Some(PangoStyle) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(pango_attr_style_new(style.raw))

  /** Create a new attribute that influences how characters are transformed
    * during shaping.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrTextTransformNew(
      transform: sn.gnome.pango.TextTransform /* Some(PangoTextTransform) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute
      .fromRaw(pango_attr_text_transform_new(transform.raw))

  /** Fetches the attribute type name.
    *
    * The attribute type name is the string passed in when registering the type
    * using [func@Pango.AttrType.register].
    *
    * The returned value is an interned string (see g_intern_string() for what
    * that means) that should not be modified or freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrTypeGetName(
      `type`: sn.gnome.pango.AttrType /* Some(PangoAttrType) */
  ): scala.Predef.String /* Some(CString) */ = fromCString(
    pango_attr_type_get_name(`type`.raw).asInstanceOf
  )

  /** Allocate a new attribute type ID.
    *
    * The attribute type name can be accessed later by using
    * [func@Pango.AttrType.get_name].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrTypeRegister(name: scala.Predef.String /* Some(CString) */ )(using
      Runtime
  ): sn.gnome.pango.AttrType /* Some(PangoAttrType) */ = sn.gnome.pango.AttrType
    .fromRaw(pango_attr_type_register(summon[Runtime].inZone(toCString(name))))

  /** Create a new underline color attribute.
    *
    * This attribute modifies the color of underlines. If not set, underlines
    * will use the foreground color.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrUnderlineColorNew(
      red: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */,
      green: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */,
      blue: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(
      pango_attr_underline_color_new(
        guint16(red),
        guint16(green),
        guint16(blue)
      )
    )

  /** Create a new underline-style attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrUnderlineNew(
      underline: sn.gnome.pango.Underline /* Some(PangoUnderline) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(pango_attr_underline_new(underline.raw))

  /** Create a new font variant attribute (normal or small caps).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrVariantNew(
      variant: sn.gnome.pango.Variant /* Some(PangoVariant) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(pango_attr_variant_new(variant.raw))

  /** Create a new font weight attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrWeightNew(
      weight: sn.gnome.pango.Weight /* Some(PangoWeight) */
  ): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(pango_attr_weight_new(weight.raw))

  /** Marks the range of the attribute as a single word.
    *
    * Note that this may require adjustments to word and sentence classification
    * around the range.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attrWordNew(): sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */ =
    sn.gnome.pango.Attribute.fromRaw(pango_attr_word_new())

  /** Determines the bidirectional type of a character.
    *
    * The bidirectional type is specified in the Unicode Character Database.
    *
    * A simplified version of this function is available as
    * [func@unichar_direction].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def bidiTypeForUnichar(
      ch: CUnsignedInt /* Some(_root_.sn.gnome.glib.internal.gunichar) */
  ): sn.gnome.pango.BidiType /* Some(PangoBidiType) */ = sn.gnome.pango.BidiType
    .fromRaw(pango_bidi_type_for_unichar(gunichar(guint32(ch))))

  /** Determines possible line, word, and character breaks for a string of
    * Unicode text with a single analysis.
    *
    * For most purposes you may want to use [func@Pango.get_log_attrs].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[break:/<function parameters>/attrs]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(LogAttr), @type -> DataRecord(PangoLogAttr)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(4), @type -> DataRecord(PangoLogAttr*)))"
  )
  private def break() = ???

  /** This is the default break algorithm.
    *
    * It applies rules from the [Unicode Line Breaking
    * Algorithm](http://www.unicode.org/unicode/reports/tr14/) without
    * language-specific tailoring, therefore the @analyis argument is unused and
    * can be %NULL.
    *
    * See [func@Pango.tailor_break] for language-specific breaks.
    *
    * See [func@Pango.attr_break] for attribute-based customization.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def defaultBreak(
      text: scala.Predef.String /* Some(CString) */,
      length: Int /* Some(CInt) */,
      analysis: Option[sn.gnome.pango.Analysis /* Some(Ptr[PangoAnalysis]) */ ],
      attrs: sn.gnome.pango.LogAttr /* Some(Ptr[PangoLogAttr]) */,
      attrs_len: Int /* Some(CInt) */
  )(using Runtime): Unit /* Some(Unit) */ = pango_default_break(
    summon[Runtime].inZone(toCString(text)),
    length,
    analysis
      .map[Ptr[PangoAnalysis]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[PangoAnalysis]]),
    attrs.getUnsafeRawPointer().asInstanceOf,
    attrs_len
  )

  /** Converts extents from Pango units to device units.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def extentsToPixels(
      inclusive: Option[
        sn.gnome.pango.Rectangle /* Some(Ptr[PangoRectangle]) */
      ],
      nearest: Option[sn.gnome.pango.Rectangle /* Some(Ptr[PangoRectangle]) */ ]
  ): Unit /* Some(Unit) */ = pango_extents_to_pixels(
    inclusive
      .map[Ptr[PangoRectangle]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[PangoRectangle]]),
    nearest
      .map[Ptr[PangoRectangle]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[PangoRectangle]])
  )

  /** Searches a string the first character that has a strong direction,
    * according to the Unicode bidirectional algorithm.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def findBaseDir(
      text: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      length: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  )(using Runtime): sn.gnome.pango.Direction /* Some(PangoDirection) */ =
    sn.gnome.pango.Direction.fromRaw(
      pango_find_base_dir(
        summon[Runtime].inZone(toCString(text)).asInstanceOf[Ptr[gchar]],
        gint(length)
      )
    )

  /** Locates a paragraph boundary in @text.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[find_paragraph_boundary:]: Function find_paragraph_boundary contains an OUT parameter, which is not supported yet"
  )
  private def findParagraphBoundary() = ???

  /** Creates a new font description from a string representation.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fontDescriptionFromString(str: scala.Predef.String /* Some(CString) */ )(
      using Runtime
  ): sn.gnome.pango.FontDescription /* Some(Ptr[PangoFontDescription]) */ =
    sn.gnome.pango.FontDescription.fromRaw(
      pango_font_description_from_string(summon[Runtime].inZone(toCString(str)))
    )

  /** Computes a `PangoLogAttr` for each character in @text.
    *
    * The @attrs array must have one `PangoLogAttr` for each position in @text;
    * if @text contains N characters, it has N+1 positions, including the last
    * position at the end of the text. @text should be an entire paragraph;
    * logical attributes can't be computed without context (for example you need
    * to see spaces on either side of a word to know the word is a word).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_log_attrs:/<function parameters>/attrs]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(LogAttr), @type -> DataRecord(PangoLogAttr)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(5), @type -> DataRecord(PangoLogAttr*)))"
  )
  private def getLogAttrs() = ???

  /** Returns the mirrored character of a Unicode character.
    *
    * Mirror characters are determined by the Unicode mirrored property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_mirror_char:/<function parameters>/mirrored_ch]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gunichar), @type -> DataRecord(gunichar*)))"
  )
  private def getMirrorChar() = ???

  /** Finds the gravity that best matches the rotation component in a
    * `PangoMatrix`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gravityGetForMatrix(
      matrix: Option[sn.gnome.pango.Matrix /* Some(Ptr[PangoMatrix]) */ ]
  ): sn.gnome.pango.Gravity /* Some(PangoGravity) */ =
    sn.gnome.pango.Gravity.fromRaw(
      pango_gravity_get_for_matrix(
        matrix
          .map[Ptr[PangoMatrix]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[PangoMatrix]])
      )
    )

  /** Returns the gravity to use in laying out a `PangoItem`.
    *
    * The gravity is determined based on the script, base gravity, and hint.
    *
    * If @base_gravity is %PANGO_GRAVITY_AUTO, it is first replaced with the
    * preferred gravity of @script. To get the preferred gravity of a script,
    * pass %PANGO_GRAVITY_AUTO and %PANGO_GRAVITY_HINT_STRONG in.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gravityGetForScript(
      script: sn.gnome.pango.Script /* Some(PangoScript) */,
      base_gravity: sn.gnome.pango.Gravity /* Some(PangoGravity) */,
      hint: sn.gnome.pango.GravityHint /* Some(PangoGravityHint) */
  ): sn.gnome.pango.Gravity /* Some(PangoGravity) */ =
    sn.gnome.pango.Gravity.fromRaw(
      pango_gravity_get_for_script(script.raw, base_gravity.raw, hint.raw)
    )

  /** Returns the gravity to use in laying out a single character or
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gravityGetForScriptAndWidth(
      script: sn.gnome.pango.Script /* Some(PangoScript) */,
      wide: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      base_gravity: sn.gnome.pango.Gravity /* Some(PangoGravity) */,
      hint: sn.gnome.pango.GravityHint /* Some(PangoGravityHint) */
  ): sn.gnome.pango.Gravity /* Some(PangoGravity) */ =
    sn.gnome.pango.Gravity.fromRaw(
      pango_gravity_get_for_script_and_width(
        script.raw,
        gboolean(gint((if wide == true then 1 else 0))),
        base_gravity.raw,
        hint.raw
      )
    )

  /** Converts a `PangoGravity` value to its natural rotation in radians.
    *
    * Note that [method@Pango.Matrix.rotate] takes angle in degrees, not
    * radians. So, to call [method@Pango.Matrix,rotate] with the output of this
    * function you should multiply it by (180. / G_PI).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gravityToRotation(
      gravity: sn.gnome.pango.Gravity /* Some(PangoGravity) */
  ): Double /* Some(Double) */ = pango_gravity_to_rotation(gravity.raw)

  /** Checks if a character that should not be normally rendered.
    *
    * This includes all Unicode characters with "ZERO WIDTH" in their name, as
    * well as *bidi* formatting characters, and a few other ones.
    *
    * This is totally different from [func@GLib.unichar_iszerowidth] and is at
    * best misnamed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isZeroWidth(
      ch: CUnsignedInt /* Some(_root_.sn.gnome.glib.internal.gunichar) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    pango_is_zero_width(gunichar(guint32(ch))).value.!=(0)

  /** Breaks a piece of text into segments with consistent directional level and
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def itemize(
      context: sn.gnome.pango.Context /* Some(Ptr[PangoContext]) */,
      text: scala.Predef.String /* Some(CString) */,
      start_index: Int /* Some(CInt) */,
      length: Int /* Some(CInt) */,
      attrs: sn.gnome.pango.AttrList /* Some(Ptr[PangoAttrList]) */,
      cached_iter: Option[
        sn.gnome.pango.AttrIterator /* Some(Ptr[PangoAttrIterator]) */
      ]
  )(using
      Runtime
  ): sn.gnome.glib.List /* Some(Ptr[_root_.sn.gnome.glib.internal.GList]) */ =
    sn.gnome.glib.List.fromRaw(
      pango_itemize(
        context.getUnsafeRawPointer().asInstanceOf,
        summon[Runtime].inZone(toCString(text)),
        start_index,
        length,
        attrs.getUnsafeRawPointer().asInstanceOf,
        cached_iter
          .map[Ptr[PangoAttrIterator]](o =>
            o.getUnsafeRawPointer().asInstanceOf
          )
          .getOrElse(null.asInstanceOf[Ptr[PangoAttrIterator]])
      )
    )

  /** Like `pango_itemize()`, but with an explicitly specified base direction.
    *
    * The base direction is used when computing bidirectional levels.
    * [func@itemize] gets the base direction from the `PangoContext` (see
    * [method@Pango.Context.set_base_dir]).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def itemizeWithBaseDir(
      context: sn.gnome.pango.Context /* Some(Ptr[PangoContext]) */,
      base_dir: sn.gnome.pango.Direction /* Some(PangoDirection) */,
      text: scala.Predef.String /* Some(CString) */,
      start_index: Int /* Some(CInt) */,
      length: Int /* Some(CInt) */,
      attrs: sn.gnome.pango.AttrList /* Some(Ptr[PangoAttrList]) */,
      cached_iter: Option[
        sn.gnome.pango.AttrIterator /* Some(Ptr[PangoAttrIterator]) */
      ]
  )(using
      Runtime
  ): sn.gnome.glib.List /* Some(Ptr[_root_.sn.gnome.glib.internal.GList]) */ =
    sn.gnome.glib.List.fromRaw(
      pango_itemize_with_base_dir(
        context.getUnsafeRawPointer().asInstanceOf,
        base_dir.raw,
        summon[Runtime].inZone(toCString(text)),
        start_index,
        length,
        attrs.getUnsafeRawPointer().asInstanceOf,
        cached_iter
          .map[Ptr[PangoAttrIterator]](o =>
            o.getUnsafeRawPointer().asInstanceOf
          )
          .getOrElse(null.asInstanceOf[Ptr[PangoAttrIterator]])
      )
    )

  /** Convert a language tag to a `PangoLanguage`.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def languageFromString(
      language: Option[scala.Predef.String /* Some(CString) */ ]
  )(using Runtime): sn.gnome.pango.Language /* Some(Ptr[PangoLanguage]) */ =
    sn.gnome.pango.Language.fromRaw(
      pango_language_from_string(
        language
          .map[CString](o => summon[Runtime].inZone(toCString(o)))
          .getOrElse(null.asInstanceOf[CString])
      )
    )

  /** Returns the `PangoLanguage` for the current locale of the process.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def languageGetDefault()
      : sn.gnome.pango.Language /* Some(Ptr[PangoLanguage]) */ =
    sn.gnome.pango.Language.fromRaw(pango_language_get_default())

  /** Returns the list of languages that the user prefers.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[language_get_preferred:/<return type>]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Language), @type -> DataRecord(PangoLanguage*)))),ListMap(@type -> DataRecord(PangoLanguage**)))"
  )
  private def languageGetPreferred() = ???

  @annotation.compileTimeOnly(
    "[layout_deserialize_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def layoutDeserializeErrorQuark() = ???

  /** Return the bidirectional embedding levels of the input paragraph.
    *
    * The bidirectional embedding levels are defined by the [Unicode
    * Bidirectional Algorithm](http://www.unicode.org/reports/tr9/).
    *
    * If the input base direction is a weak direction, the direction of the
    * characters in the text will determine the final resolved direction.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[log2vis_get_embedding_levels:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guint8*)))"
  )
  private def log2visGetEmbeddingLevels() = ???

  /** Finishes parsing markup.
    *
    * After feeding a Pango markup parser some data with
    * [method@GLib.MarkupParseContext.parse], use this function to get the list
    * of attributes and text out of the markup. This function will not free @context,
    * use [method@GLib.MarkupParseContext.free] to do so.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[markup_parser_finish:]: Function markup_parser_finish contains an OUT parameter, which is not supported yet"
  )
  private def markupParserFinish() = ???

  /** Incrementally parses marked-up text to create a plain-text string and an
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def markupParserNew(
      accel_marker: CUnsignedInt /* Some(_root_.sn.gnome.glib.internal.gunichar) */
  ): sn.gnome.glib.MarkupParseContext /* Some(Ptr[_root_.sn.gnome.glib.internal.GMarkupParseContext]) */ =
    sn.gnome.glib.MarkupParseContext
      .fromRaw(pango_markup_parser_new(gunichar(guint32(accel_marker))))

  /** Parses an enum type and stores the result in @value.
    *
    * If @str does not match the nick name of any of the possible values for the
    * enum and is not an integer, %FALSE is returned, a warning is issued if @warn
    * is %TRUE, and a string representing the list of possible values is stored
    * in @possible_values. The list is slash-separated, eg.
    * "none/start/middle/end".
    *
    * If failed and @possible_values is not %NULL, returned string should be
    * freed using g_free().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[parse_enum:]: Function parse_enum contains an OUT parameter, which is not supported yet"
  )
  private def parseEnum() = ???

  /** Parses marked-up text to create a plain-text string and an attribute list.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[parse_markup:]: Function parse_markup contains an OUT parameter, which is not supported yet"
  )
  private def parseMarkup() = ???

  /** Parses a font stretch.
    *
    * The allowed values are "ultra_condensed", "extra_condensed", "condensed",
    * "semi_condensed", "normal", "semi_expanded", "expanded", "extra_expanded"
    * and "ultra_expanded". Case variations are ignored and the '_' characters
    * may be omitted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[parse_stretch:]: Function parse_stretch contains an OUT parameter, which is not supported yet"
  )
  private def parseStretch() = ???

  /** Parses a font style.
    *
    * The allowed values are "normal", "italic" and "oblique", case variations
    * being ignored.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[parse_style:]: Function parse_style contains an OUT parameter, which is not supported yet"
  )
  private def parseStyle() = ???

  /** Parses a font variant.
    *
    * The allowed values are "normal", "small-caps", "all-small-caps",
    * "petite-caps", "all-petite-caps", "unicase" and "title-caps", case
    * variations being ignored.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[parse_variant:]: Function parse_variant contains an OUT parameter, which is not supported yet"
  )
  private def parseVariant() = ???

  /** Parses a font weight.
    *
    * The allowed values are "heavy", "ultrabold", "bold", "normal", "light",
    * "ultraleight" and integers. Case variations are ignored.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[parse_weight:]: Function parse_weight contains an OUT parameter, which is not supported yet"
  )
  private def parseWeight() = ???

  /** Quantizes the thickness and position of a line to whole device pixels.
    *
    * This is typically used for underline or strikethrough. The purpose of this
    * function is to avoid such lines looking blurry.
    *
    * Care is taken to make sure @thickness is at least one pixel when this
    * function returns, but returned @position may become zero as a result of
    * rounding.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[quantize_line_geometry:]: Function quantize_line_geometry contains an INOUT parameter, which is not supported yet"
  )
  private def quantizeLineGeometry() = ???

  /** Reads an entire line from a file into a buffer.
    *
    * Lines may be delimited with '\n', '\r', '\n\r', or '\r\n'. The delimiter
    * is not written into the buffer. Text after a '#' character is treated as a
    * comment and skipped. '\' can be used to escape a # character. '\'
    * proceeding a line delimiter combines adjacent lines. A '\' proceeding any
    * other character is ignored and written into the output buffer unmodified.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[read_line:/<function parameters>/stream]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(FILE*)))"
  )
  private def readLine() = ???

  /** Reorder items from logical order to visual order.
    *
    * The visual order is determined from the associated directional levels of
    * the items. The original list is unmodified.
    *
    * (Please open a bug if you use this function. It is not a particularly
    * convenient interface, and the code is duplicated elsewhere in Pango for
    * that reason.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def reorderItems(
      items: sn.gnome.glib.List /* Some(Ptr[_root_.sn.gnome.glib.internal.GList]) */
  ): sn.gnome.glib.List /* Some(Ptr[_root_.sn.gnome.glib.internal.GList]) */ =
    sn.gnome.glib.List
      .fromRaw(pango_reorder_items(items.getUnsafeRawPointer().asInstanceOf))

  /** Scans an integer.
    *
    * Leading white space is skipped.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[scan_int:]: Function scan_int contains an OUT parameter, which is not supported yet"
  )
  private def scanInt() = ???

  /** Scans a string into a `GString` buffer.
    *
    * The string may either be a sequence of non-white-space characters, or a
    * quoted string with '"'. Instead a quoted string, '\"' represents a literal
    * quote. Leading white space outside of quotes is skipped.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[scan_string:]: Function scan_string contains an INOUT parameter, which is not supported yet"
  )
  private def scanString() = ???

  /** Scans a word into a `GString` buffer.
    *
    * A word consists of [A-Za-z_] followed by zero or more [A-Za-z_0-9].
    * Leading white space is skipped.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[scan_word:]: Function scan_word contains an INOUT parameter, which is not supported yet"
  )
  private def scanWord() = ???

  /** Looks up the script for a particular character.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scriptForUnichar(
      ch: CUnsignedInt /* Some(_root_.sn.gnome.glib.internal.gunichar) */
  ): sn.gnome.pango.Script /* Some(PangoScript) */ = sn.gnome.pango.Script
    .fromRaw(pango_script_for_unichar(gunichar(guint32(ch))))

  /** Finds a language tag that is reasonably representative of @script.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scriptGetSampleLanguage(
      script: sn.gnome.pango.Script /* Some(PangoScript) */
  ): sn.gnome.pango.Language /* Some(Ptr[PangoLanguage]) */ =
    sn.gnome.pango.Language
      .fromRaw(pango_script_get_sample_language(script.raw))

  /** Convert the characters in @text into glyphs.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def shape(
      text: scala.Predef.String /* Some(CString) */,
      length: Int /* Some(CInt) */,
      analysis: sn.gnome.pango.Analysis /* Some(Ptr[PangoAnalysis]) */,
      glyphs: sn.gnome.pango.GlyphString /* Some(Ptr[PangoGlyphString]) */
  )(using Runtime): Unit /* Some(Unit) */ = pango_shape(
    summon[Runtime].inZone(toCString(text)),
    length,
    analysis.getUnsafeRawPointer().asInstanceOf,
    glyphs.getUnsafeRawPointer().asInstanceOf
  )

  /** Convert the characters in @text into glyphs.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def shapeFull(
      item_text: scala.Predef.String /* Some(CString) */,
      item_length: Int /* Some(CInt) */,
      paragraph_text: Option[scala.Predef.String /* Some(CString) */ ],
      paragraph_length: Int /* Some(CInt) */,
      analysis: sn.gnome.pango.Analysis /* Some(Ptr[PangoAnalysis]) */,
      glyphs: sn.gnome.pango.GlyphString /* Some(Ptr[PangoGlyphString]) */
  )(using Runtime): Unit /* Some(Unit) */ = pango_shape_full(
    summon[Runtime].inZone(toCString(item_text)),
    item_length,
    paragraph_text
      .map[CString](o => summon[Runtime].inZone(toCString(o)))
      .getOrElse(null.asInstanceOf[CString]),
    paragraph_length,
    analysis.getUnsafeRawPointer().asInstanceOf,
    glyphs.getUnsafeRawPointer().asInstanceOf
  )

  /** Convert the characters in @item into glyphs.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def shapeItem(
      item: sn.gnome.pango.Item /* Some(Ptr[PangoItem]) */,
      paragraph_text: Option[scala.Predef.String /* Some(CString) */ ],
      paragraph_length: Int /* Some(CInt) */,
      log_attrs: Option[sn.gnome.pango.LogAttr /* Some(Ptr[PangoLogAttr]) */ ],
      glyphs: sn.gnome.pango.GlyphString /* Some(Ptr[PangoGlyphString]) */,
      flags: sn.gnome.pango.ShapeFlags /* Some(PangoShapeFlags) */
  )(using Runtime): Unit /* Some(Unit) */ = pango_shape_item(
    item.getUnsafeRawPointer().asInstanceOf,
    paragraph_text
      .map[CString](o => summon[Runtime].inZone(toCString(o)))
      .getOrElse(null.asInstanceOf[CString]),
    paragraph_length,
    log_attrs
      .map[Ptr[PangoLogAttr]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[PangoLogAttr]]),
    glyphs.getUnsafeRawPointer().asInstanceOf,
    flags.raw
  )

  /** Convert the characters in @text into glyphs.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def shapeWithFlags(
      item_text: scala.Predef.String /* Some(CString) */,
      item_length: Int /* Some(CInt) */,
      paragraph_text: Option[scala.Predef.String /* Some(CString) */ ],
      paragraph_length: Int /* Some(CInt) */,
      analysis: sn.gnome.pango.Analysis /* Some(Ptr[PangoAnalysis]) */,
      glyphs: sn.gnome.pango.GlyphString /* Some(Ptr[PangoGlyphString]) */,
      flags: sn.gnome.pango.ShapeFlags /* Some(PangoShapeFlags) */
  )(using Runtime): Unit /* Some(Unit) */ = pango_shape_with_flags(
    summon[Runtime].inZone(toCString(item_text)),
    item_length,
    paragraph_text
      .map[CString](o => summon[Runtime].inZone(toCString(o)))
      .getOrElse(null.asInstanceOf[CString]),
    paragraph_length,
    analysis.getUnsafeRawPointer().asInstanceOf,
    glyphs.getUnsafeRawPointer().asInstanceOf,
    flags.raw
  )

  /** Skips 0 or more characters of white space.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[skip_space:]: Function skip_space contains an INOUT parameter, which is not supported yet"
  )
  private def skipSpace() = ???

  /** Splits a %G_SEARCHPATH_SEPARATOR-separated list of files, stripping white
    * space and substituting ~/ with $HOME/.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def splitFileList(str: scala.Predef.String /* Some(CString) */ )(using
      Runtime
  ): scala.Array[scala.Predef.String] /* Some(Ptr[CString]) */ = MemoryRead
    .nullTerminatedPointerArray(
      pango_split_file_list(summon[Runtime].inZone(toCString(str)))
    )
    .map(fromCString(_))

  /** Deserializes a `PangoTabArray` from a string.
    *
    * This is the counterpart to [method@Pango.TabArray.to_string]. See that
    * functions for details about the format.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def tabArrayFromString(
      text: scala.Predef.String /* Some(CString) */
  )(using Runtime): sn.gnome.pango.TabArray /* Some(Ptr[PangoTabArray]) */ =
    sn.gnome.pango.TabArray.fromRaw(
      pango_tab_array_from_string(summon[Runtime].inZone(toCString(text)))
    )

  /** Apply language-specific tailoring to the breaks in @attrs.
    *
    * The line breaks are assumed to have been produced by
    * [func@Pango.default_break].
    *
    * If @offset is not -1, it is used to apply attributes from @analysis that
    * are relevant to line breaking.
    *
    * Note that it is better to pass -1 for @offset and use
    * [func@Pango.attr_break] to apply attributes to the whole paragraph.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[tailor_break:/<function parameters>/attrs]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(LogAttr), @type -> DataRecord(PangoLogAttr)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(5), @type -> DataRecord(PangoLogAttr*)))"
  )
  private def tailorBreak() = ???

  /** Trims leading and trailing whitespace from a string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def trimString(
      str: scala.Predef.String /* Some(CString) */
  )(using Runtime): scala.Predef.String /* Some(CString) */ = fromCString(
    pango_trim_string(summon[Runtime].inZone(toCString(str))).asInstanceOf
  )

  /** Determines the inherent direction of a character.
    *
    * The inherent direction is either `PANGO_DIRECTION_LTR`,
    * `PANGO_DIRECTION_RTL`, or `PANGO_DIRECTION_NEUTRAL`.
    *
    * This function is useful to categorize characters into left-to-right
    * letters, right-to-left letters, and everything else. If full Unicode
    * bidirectional type of a character is needed,
    * [func@Pango.BidiType.for_unichar] can be used instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharDirection(
      ch: CUnsignedInt /* Some(_root_.sn.gnome.glib.internal.gunichar) */
  ): sn.gnome.pango.Direction /* Some(PangoDirection) */ =
    sn.gnome.pango.Direction
      .fromRaw(pango_unichar_direction(gunichar(guint32(ch))))

  /** Converts a floating-point number to Pango units.
    *
    * The conversion is done by multiplying @d by %PANGO_SCALE and rounding the
    * result to nearest integer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unitsFromDouble(d: Double /* Some(Double) */ ): Int /* Some(CInt) */ =
    pango_units_from_double(d)

  /** Converts a number in Pango units to floating-point.
    *
    * The conversion is done by dividing @i by %PANGO_SCALE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unitsToDouble(i: Int /* Some(CInt) */ ): Double /* Some(Double) */ =
    pango_units_to_double(i)

  /** Returns the encoded version of Pango available at run-time.
    *
    * This is similar to the macro %PANGO_VERSION except that the macro returns
    * the encoded version available at compile-time. A version number can be
    * encoded into an integer using PANGO_VERSION_ENCODE().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def version(): Int /* Some(CInt) */ = pango_version()

  /** Checks that the Pango library in use is compatible with the given version.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def versionCheck(
      required_major: Int /* Some(CInt) */,
      required_minor: Int /* Some(CInt) */,
      required_micro: Int /* Some(CInt) */
  ): scala.Predef.String /* Some(CString) */ = fromCString(
    pango_version_check(
      required_major,
      required_minor,
      required_micro
    ).asInstanceOf
  )

  /** Returns the version of Pango available at run-time.
    *
    * This is similar to the macro %PANGO_VERSION_STRING except that the macro
    * returns the version available at compile-time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def versionString(): scala.Predef.String /* Some(CString) */ = fromCString(
    pango_version_string().asInstanceOf
  )

  /** Whether the segment should be shifted to center around the baseline.
    *
    * This is mainly used in vertical writing directions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val ANALYSIS_FLAG_CENTERED_BASELINE: Int = 1

  /** Whether this run holds ellipsized text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val ANALYSIS_FLAG_IS_ELLIPSIS: Int = 2

  /** Whether to add a hyphen at the end of the run during shaping.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val ANALYSIS_FLAG_NEED_HYPHEN: Int = 4

  /** Value for @start_index in `PangoAttribute` that indicates the beginning of
    * the text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val ATTR_INDEX_FROM_TEXT_BEGINNING: UInt = 0L.toUInt

  /** Value for @end_index in `PangoAttribute` that indicates the end of the
    * text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val ATTR_INDEX_TO_TEXT_END: UInt = 4294967295L.toUInt

  /** A `PangoGlyph` value that indicates a zero-width empty glpyh.
    *
    * This is useful for example in shaper modules, to use as the glyph for
    * various zero-width Unicode characters (those passing
    * [func@is_zero_width]).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[GLYPH_EMPTY:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(Glyph), @type -> DataRecord(PangoGlyph))) with raw value `268435455`"
  )
  private def GLYPH_EMPTY() = ???

  /** A `PangoGlyph` value for invalid input.
    *
    * `PangoLayout` produces one such glyph per invalid input UTF-8 byte and
    * such a glyph is rendered as a crossed box.
    *
    * Note that this value is defined such that it has the
    * %PANGO_GLYPH_UNKNOWN_FLAG set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[GLYPH_INVALID_INPUT:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(Glyph), @type -> DataRecord(PangoGlyph))) with raw value `4294967295`"
  )
  private def GLYPH_INVALID_INPUT() = ???

  /** Flag used in `PangoGlyph` to turn a `gunichar` value of a valid Unicode
    * character into an unknown-character glyph for that `gunichar`.
    *
    * Such unknown-character glyphs may be rendered as a 'hex box'.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[GLYPH_UNKNOWN_FLAG:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(Glyph), @type -> DataRecord(PangoGlyph))) with raw value `268435456`"
  )
  private def GLYPH_UNKNOWN_FLAG() = ???

  /** The scale between dimensions used for Pango distances and device units.
    *
    * The definition of device units is dependent on the output device; it will
    * typically be pixels for a screen, and points for a printer. %PANGO_SCALE
    * is currently 1024, but this may be changed in the future.
    *
    * When setting font sizes, device units are always considered to be points
    * (as in "12 point font"), rather than pixels.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val SCALE: Int = 1024

  /** The major component of the version of Pango available at compile-time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val VERSION_MAJOR: Int = 1

  /** The micro component of the version of Pango available at compile-time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val VERSION_MICRO: Int = 0

  /** The minor component of the version of Pango available at compile-time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val VERSION_MINOR: Int = 51

  /** A string literal containing the version of Pango available at
    * compile-time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val VERSION_STRING: scala.Predef.String = "1.51.0"
end Pango
