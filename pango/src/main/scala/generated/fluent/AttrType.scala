package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoAttrType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `PangoAttrType` distinguishes between different types of attributes.
  *
  * Along with the predefined values, it is possible to allocate additional
  * values for custom attributes using [func@AttrType.register]. The predefined
  * values are given below. The type of structure used to store the attribute is
  * listed in parentheses after the description.
  */
enum AttrType(val raw: PangoAttrType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * does not happen
    */
  case INVALID extends AttrType(PangoAttrType.PANGO_ATTR_INVALID)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * language ([struct@Pango.AttrLanguage])
    */
  case LANGUAGE extends AttrType(PangoAttrType.PANGO_ATTR_LANGUAGE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * font family name list ([struct@Pango.AttrString])
    */
  case FAMILY extends AttrType(PangoAttrType.PANGO_ATTR_FAMILY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * font slant style ([struct@Pango.AttrInt])
    */
  case STYLE extends AttrType(PangoAttrType.PANGO_ATTR_STYLE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * font weight ([struct@Pango.AttrInt])
    */
  case WEIGHT extends AttrType(PangoAttrType.PANGO_ATTR_WEIGHT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * font variant (normal or small caps) ([struct@Pango.AttrInt])
    */
  case VARIANT extends AttrType(PangoAttrType.PANGO_ATTR_VARIANT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * font stretch ([struct@Pango.AttrInt])
    */
  case STRETCH extends AttrType(PangoAttrType.PANGO_ATTR_STRETCH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * font size in points scaled by %PANGO_SCALE ([struct@Pango.AttrInt])
    */
  case SIZE extends AttrType(PangoAttrType.PANGO_ATTR_SIZE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * font description ([struct@Pango.AttrFontDesc])
    */
  case FONT_DESC extends AttrType(PangoAttrType.PANGO_ATTR_FONT_DESC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * foreground color ([struct@Pango.AttrColor])
    */
  case FOREGROUND extends AttrType(PangoAttrType.PANGO_ATTR_FOREGROUND)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * background color ([struct@Pango.AttrColor])
    */
  case BACKGROUND extends AttrType(PangoAttrType.PANGO_ATTR_BACKGROUND)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * whether the text has an underline ([struct@Pango.AttrInt])
    */
  case UNDERLINE extends AttrType(PangoAttrType.PANGO_ATTR_UNDERLINE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * whether the text is struck-through ([struct@Pango.AttrInt])
    */
  case STRIKETHROUGH extends AttrType(PangoAttrType.PANGO_ATTR_STRIKETHROUGH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * baseline displacement ([struct@Pango.AttrInt])
    */
  case RISE extends AttrType(PangoAttrType.PANGO_ATTR_RISE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * shape ([struct@Pango.AttrShape])
    */
  case SHAPE extends AttrType(PangoAttrType.PANGO_ATTR_SHAPE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * font size scale factor ([struct@Pango.AttrFloat])
    */
  case SCALE extends AttrType(PangoAttrType.PANGO_ATTR_SCALE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * whether fallback is enabled ([struct@Pango.AttrInt])
    */
  case FALLBACK extends AttrType(PangoAttrType.PANGO_ATTR_FALLBACK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * letter spacing ([struct@PangoAttrInt])
    */
  case LETTER_SPACING extends AttrType(PangoAttrType.PANGO_ATTR_LETTER_SPACING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * underline color ([struct@Pango.AttrColor])
    */
  case UNDERLINE_COLOR
      extends AttrType(PangoAttrType.PANGO_ATTR_UNDERLINE_COLOR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * strikethrough color ([struct@Pango.AttrColor])
    */
  case STRIKETHROUGH_COLOR
      extends AttrType(PangoAttrType.PANGO_ATTR_STRIKETHROUGH_COLOR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * font size in pixels scaled by %PANGO_SCALE ([struct@Pango.AttrInt])
    */
  case ABSOLUTE_SIZE extends AttrType(PangoAttrType.PANGO_ATTR_ABSOLUTE_SIZE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * base text gravity ([struct@Pango.AttrInt])
    */
  case GRAVITY extends AttrType(PangoAttrType.PANGO_ATTR_GRAVITY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * gravity hint ([struct@Pango.AttrInt])
    */
  case GRAVITY_HINT extends AttrType(PangoAttrType.PANGO_ATTR_GRAVITY_HINT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * OpenType font features ([struct@Pango.AttrFontFeatures]). Since 1.38
    */
  case FONT_FEATURES extends AttrType(PangoAttrType.PANGO_ATTR_FONT_FEATURES)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * foreground alpha ([struct@Pango.AttrInt]). Since 1.38
    */
  case FOREGROUND_ALPHA
      extends AttrType(PangoAttrType.PANGO_ATTR_FOREGROUND_ALPHA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * background alpha ([struct@Pango.AttrInt]). Since 1.38
    */
  case BACKGROUND_ALPHA
      extends AttrType(PangoAttrType.PANGO_ATTR_BACKGROUND_ALPHA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * whether breaks are allowed ([struct@Pango.AttrInt]). Since 1.44
    */
  case ALLOW_BREAKS extends AttrType(PangoAttrType.PANGO_ATTR_ALLOW_BREAKS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * how to render invisible characters ([struct@Pango.AttrInt]). Since 1.44
    */
  case SHOW extends AttrType(PangoAttrType.PANGO_ATTR_SHOW)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * whether to insert hyphens at intra-word line breaks
    * ([struct@Pango.AttrInt]). Since 1.44
    */
  case INSERT_HYPHENS extends AttrType(PangoAttrType.PANGO_ATTR_INSERT_HYPHENS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * whether the text has an overline ([struct@Pango.AttrInt]). Since 1.46
    */
  case OVERLINE extends AttrType(PangoAttrType.PANGO_ATTR_OVERLINE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * overline color ([struct@Pango.AttrColor]). Since 1.46
    */
  case OVERLINE_COLOR extends AttrType(PangoAttrType.PANGO_ATTR_OVERLINE_COLOR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * line height factor ([struct@Pango.AttrFloat]). Since: 1.50
    */
  case LINE_HEIGHT extends AttrType(PangoAttrType.PANGO_ATTR_LINE_HEIGHT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * line height ([struct@Pango.AttrInt]). Since: 1.50
    */
  case ABSOLUTE_LINE_HEIGHT
      extends AttrType(PangoAttrType.PANGO_ATTR_ABSOLUTE_LINE_HEIGHT)
  case TEXT_TRANSFORM extends AttrType(PangoAttrType.PANGO_ATTR_TEXT_TRANSFORM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * override segmentation to classify the range of the attribute as a single
    * word ([struct@Pango.AttrInt]). Since 1.50
    */
  case WORD extends AttrType(PangoAttrType.PANGO_ATTR_WORD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * override segmentation to classify the range of the attribute as a single
    * sentence ([struct@Pango.AttrInt]). Since 1.50
    */
  case SENTENCE extends AttrType(PangoAttrType.PANGO_ATTR_SENTENCE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * baseline displacement ([struct@Pango.AttrInt]). Since 1.50
    */
  case BASELINE_SHIFT extends AttrType(PangoAttrType.PANGO_ATTR_BASELINE_SHIFT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * font-relative size change ([struct@Pango.AttrInt]). Since 1.50
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
