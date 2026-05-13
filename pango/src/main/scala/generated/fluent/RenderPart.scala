package sn.gnome.pango

import _root_.sn.gnome.pango.internal.PangoRenderPart

/** `PangoRenderPart` defines different items to render for such purposes as
  * setting colors.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum RenderPart(val raw: PangoRenderPart):
  /** the text itself
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FOREGROUND
      extends RenderPart(PangoRenderPart.PANGO_RENDER_PART_FOREGROUND)

  /** the area behind the text
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BACKGROUND
      extends RenderPart(PangoRenderPart.PANGO_RENDER_PART_BACKGROUND)

  /** underlines
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNDERLINE extends RenderPart(PangoRenderPart.PANGO_RENDER_PART_UNDERLINE)

  /** strikethrough lines
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STRIKETHROUGH
      extends RenderPart(PangoRenderPart.PANGO_RENDER_PART_STRIKETHROUGH)

  /** overlines
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OVERLINE extends RenderPart(PangoRenderPart.PANGO_RENDER_PART_OVERLINE)
end RenderPart

object RenderPart:
  def fromRaw(raw: PangoRenderPart): RenderPart =
    raw match
      case PangoRenderPart.PANGO_RENDER_PART_FOREGROUND => RenderPart.FOREGROUND
      case PangoRenderPart.PANGO_RENDER_PART_BACKGROUND => RenderPart.BACKGROUND
      case PangoRenderPart.PANGO_RENDER_PART_UNDERLINE  => RenderPart.UNDERLINE
      case PangoRenderPart.PANGO_RENDER_PART_STRIKETHROUGH =>
        RenderPart.STRIKETHROUGH
      case PangoRenderPart.PANGO_RENDER_PART_OVERLINE => RenderPart.OVERLINE
  end fromRaw
end RenderPart
