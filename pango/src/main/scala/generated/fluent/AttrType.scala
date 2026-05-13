package sn.gnome.pango

import _root_.sn.gnome.pango.internal.PangoAttrType

/** The `PangoAttrType` distinguishes between different types of attributes.
  *
  * Along with the predefined values, it is possible to allocate additional
  * values for custom attributes using [func@AttrType.register]. The predefined
  * values are given below. The type of structure used to store the attribute is
  * listed in parentheses after the description.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum AttrType(val raw: PangoAttrType):
  /** does not happen
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID extends AttrType(PangoAttrType.PANGO_ATTR_INVALID)

  /** language ([struct@Pango.AttrLanguage])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LANGUAGE extends AttrType(PangoAttrType.PANGO_ATTR_LANGUAGE)

  /** font family name list ([struct@Pango.AttrString])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FAMILY extends AttrType(PangoAttrType.PANGO_ATTR_FAMILY)

  /** font slant style ([struct@Pango.AttrInt])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STYLE extends AttrType(PangoAttrType.PANGO_ATTR_STYLE)

  /** font weight ([struct@Pango.AttrInt])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WEIGHT extends AttrType(PangoAttrType.PANGO_ATTR_WEIGHT)

  /** font variant (normal or small caps) ([struct@Pango.AttrInt])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VARIANT extends AttrType(PangoAttrType.PANGO_ATTR_VARIANT)

  /** font stretch ([struct@Pango.AttrInt])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STRETCH extends AttrType(PangoAttrType.PANGO_ATTR_STRETCH)

  /** font size in points scaled by %PANGO_SCALE ([struct@Pango.AttrInt])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SIZE extends AttrType(PangoAttrType.PANGO_ATTR_SIZE)

  /** font description ([struct@Pango.AttrFontDesc])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FONT_DESC extends AttrType(PangoAttrType.PANGO_ATTR_FONT_DESC)

  /** foreground color ([struct@Pango.AttrColor])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FOREGROUND extends AttrType(PangoAttrType.PANGO_ATTR_FOREGROUND)

  /** background color ([struct@Pango.AttrColor])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BACKGROUND extends AttrType(PangoAttrType.PANGO_ATTR_BACKGROUND)

  /** whether the text has an underline ([struct@Pango.AttrInt])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNDERLINE extends AttrType(PangoAttrType.PANGO_ATTR_UNDERLINE)

  /** whether the text is struck-through ([struct@Pango.AttrInt])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STRIKETHROUGH extends AttrType(PangoAttrType.PANGO_ATTR_STRIKETHROUGH)

  /** baseline displacement ([struct@Pango.AttrInt])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RISE extends AttrType(PangoAttrType.PANGO_ATTR_RISE)

  /** shape ([struct@Pango.AttrShape])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SHAPE extends AttrType(PangoAttrType.PANGO_ATTR_SHAPE)

  /** font size scale factor ([struct@Pango.AttrFloat])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SCALE extends AttrType(PangoAttrType.PANGO_ATTR_SCALE)

  /** whether fallback is enabled ([struct@Pango.AttrInt])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FALLBACK extends AttrType(PangoAttrType.PANGO_ATTR_FALLBACK)

  /** letter spacing ([struct@PangoAttrInt])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LETTER_SPACING extends AttrType(PangoAttrType.PANGO_ATTR_LETTER_SPACING)

  /** underline color ([struct@Pango.AttrColor])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNDERLINE_COLOR
      extends AttrType(PangoAttrType.PANGO_ATTR_UNDERLINE_COLOR)

  /** strikethrough color ([struct@Pango.AttrColor])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STRIKETHROUGH_COLOR
      extends AttrType(PangoAttrType.PANGO_ATTR_STRIKETHROUGH_COLOR)

  /** font size in pixels scaled by %PANGO_SCALE ([struct@Pango.AttrInt])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ABSOLUTE_SIZE extends AttrType(PangoAttrType.PANGO_ATTR_ABSOLUTE_SIZE)

  /** base text gravity ([struct@Pango.AttrInt])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GRAVITY extends AttrType(PangoAttrType.PANGO_ATTR_GRAVITY)

  /** gravity hint ([struct@Pango.AttrInt])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GRAVITY_HINT extends AttrType(PangoAttrType.PANGO_ATTR_GRAVITY_HINT)

  /** OpenType font features ([struct@Pango.AttrFontFeatures]). Since 1.38
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FONT_FEATURES extends AttrType(PangoAttrType.PANGO_ATTR_FONT_FEATURES)

  /** foreground alpha ([struct@Pango.AttrInt]). Since 1.38
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FOREGROUND_ALPHA
      extends AttrType(PangoAttrType.PANGO_ATTR_FOREGROUND_ALPHA)

  /** background alpha ([struct@Pango.AttrInt]). Since 1.38
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BACKGROUND_ALPHA
      extends AttrType(PangoAttrType.PANGO_ATTR_BACKGROUND_ALPHA)

  /** whether breaks are allowed ([struct@Pango.AttrInt]). Since 1.44
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ALLOW_BREAKS extends AttrType(PangoAttrType.PANGO_ATTR_ALLOW_BREAKS)

  /** how to render invisible characters ([struct@Pango.AttrInt]). Since 1.44
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SHOW extends AttrType(PangoAttrType.PANGO_ATTR_SHOW)

  /** whether to insert hyphens at intra-word line breaks
    * ([struct@Pango.AttrInt]). Since 1.44
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INSERT_HYPHENS extends AttrType(PangoAttrType.PANGO_ATTR_INSERT_HYPHENS)

  /** whether the text has an overline ([struct@Pango.AttrInt]). Since 1.46
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OVERLINE extends AttrType(PangoAttrType.PANGO_ATTR_OVERLINE)

  /** overline color ([struct@Pango.AttrColor]). Since 1.46
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OVERLINE_COLOR extends AttrType(PangoAttrType.PANGO_ATTR_OVERLINE_COLOR)

  /** line height factor ([struct@Pango.AttrFloat]). Since: 1.50
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LINE_HEIGHT extends AttrType(PangoAttrType.PANGO_ATTR_LINE_HEIGHT)

  /** line height ([struct@Pango.AttrInt]). Since: 1.50
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ABSOLUTE_LINE_HEIGHT
      extends AttrType(PangoAttrType.PANGO_ATTR_ABSOLUTE_LINE_HEIGHT)
  case TEXT_TRANSFORM extends AttrType(PangoAttrType.PANGO_ATTR_TEXT_TRANSFORM)

  /** override segmentation to classify the range of the attribute as a single
    * word ([struct@Pango.AttrInt]). Since 1.50
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WORD extends AttrType(PangoAttrType.PANGO_ATTR_WORD)

  /** override segmentation to classify the range of the attribute as a single
    * sentence ([struct@Pango.AttrInt]). Since 1.50
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SENTENCE extends AttrType(PangoAttrType.PANGO_ATTR_SENTENCE)

  /** baseline displacement ([struct@Pango.AttrInt]). Since 1.50
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BASELINE_SHIFT extends AttrType(PangoAttrType.PANGO_ATTR_BASELINE_SHIFT)

  /** font-relative size change ([struct@Pango.AttrInt]). Since 1.50
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FONT_SCALE extends AttrType(PangoAttrType.PANGO_ATTR_FONT_SCALE)
end AttrType

object AttrType:
  def fromRaw(raw: PangoAttrType): AttrType =
    raw match
      case PangoAttrType.PANGO_ATTR_INVALID         => AttrType.INVALID
      case PangoAttrType.PANGO_ATTR_LANGUAGE        => AttrType.LANGUAGE
      case PangoAttrType.PANGO_ATTR_FAMILY          => AttrType.FAMILY
      case PangoAttrType.PANGO_ATTR_STYLE           => AttrType.STYLE
      case PangoAttrType.PANGO_ATTR_WEIGHT          => AttrType.WEIGHT
      case PangoAttrType.PANGO_ATTR_VARIANT         => AttrType.VARIANT
      case PangoAttrType.PANGO_ATTR_STRETCH         => AttrType.STRETCH
      case PangoAttrType.PANGO_ATTR_SIZE            => AttrType.SIZE
      case PangoAttrType.PANGO_ATTR_FONT_DESC       => AttrType.FONT_DESC
      case PangoAttrType.PANGO_ATTR_FOREGROUND      => AttrType.FOREGROUND
      case PangoAttrType.PANGO_ATTR_BACKGROUND      => AttrType.BACKGROUND
      case PangoAttrType.PANGO_ATTR_UNDERLINE       => AttrType.UNDERLINE
      case PangoAttrType.PANGO_ATTR_STRIKETHROUGH   => AttrType.STRIKETHROUGH
      case PangoAttrType.PANGO_ATTR_RISE            => AttrType.RISE
      case PangoAttrType.PANGO_ATTR_SHAPE           => AttrType.SHAPE
      case PangoAttrType.PANGO_ATTR_SCALE           => AttrType.SCALE
      case PangoAttrType.PANGO_ATTR_FALLBACK        => AttrType.FALLBACK
      case PangoAttrType.PANGO_ATTR_LETTER_SPACING  => AttrType.LETTER_SPACING
      case PangoAttrType.PANGO_ATTR_UNDERLINE_COLOR => AttrType.UNDERLINE_COLOR
      case PangoAttrType.PANGO_ATTR_STRIKETHROUGH_COLOR =>
        AttrType.STRIKETHROUGH_COLOR
      case PangoAttrType.PANGO_ATTR_ABSOLUTE_SIZE    => AttrType.ABSOLUTE_SIZE
      case PangoAttrType.PANGO_ATTR_GRAVITY          => AttrType.GRAVITY
      case PangoAttrType.PANGO_ATTR_GRAVITY_HINT     => AttrType.GRAVITY_HINT
      case PangoAttrType.PANGO_ATTR_FONT_FEATURES    => AttrType.FONT_FEATURES
      case PangoAttrType.PANGO_ATTR_FOREGROUND_ALPHA =>
        AttrType.FOREGROUND_ALPHA
      case PangoAttrType.PANGO_ATTR_BACKGROUND_ALPHA =>
        AttrType.BACKGROUND_ALPHA
      case PangoAttrType.PANGO_ATTR_ALLOW_BREAKS   => AttrType.ALLOW_BREAKS
      case PangoAttrType.PANGO_ATTR_SHOW           => AttrType.SHOW
      case PangoAttrType.PANGO_ATTR_INSERT_HYPHENS => AttrType.INSERT_HYPHENS
      case PangoAttrType.PANGO_ATTR_OVERLINE       => AttrType.OVERLINE
      case PangoAttrType.PANGO_ATTR_OVERLINE_COLOR => AttrType.OVERLINE_COLOR
      case PangoAttrType.PANGO_ATTR_LINE_HEIGHT    => AttrType.LINE_HEIGHT
      case PangoAttrType.PANGO_ATTR_ABSOLUTE_LINE_HEIGHT =>
        AttrType.ABSOLUTE_LINE_HEIGHT
      case PangoAttrType.PANGO_ATTR_TEXT_TRANSFORM => AttrType.TEXT_TRANSFORM
      case PangoAttrType.PANGO_ATTR_WORD           => AttrType.WORD
      case PangoAttrType.PANGO_ATTR_SENTENCE       => AttrType.SENTENCE
      case PangoAttrType.PANGO_ATTR_BASELINE_SHIFT => AttrType.BASELINE_SHIFT
      case PangoAttrType.PANGO_ATTR_FONT_SCALE     => AttrType.FONT_SCALE
  end fromRaw
end AttrType
