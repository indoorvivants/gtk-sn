package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoRenderPart

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `PangoRenderPart` defines different items to render for such purposes as
  * setting colors.
  */
enum RenderPart(val raw: PangoRenderPart):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the text itself
    */
  case FOREGROUND
      extends RenderPart(PangoRenderPart.PANGO_RENDER_PART_FOREGROUND)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the area behind the text
    */
  case BACKGROUND
      extends RenderPart(PangoRenderPart.PANGO_RENDER_PART_BACKGROUND)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * underlines
    */
  case UNDERLINE extends RenderPart(PangoRenderPart.PANGO_RENDER_PART_UNDERLINE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * strikethrough lines
    */
  case STRIKETHROUGH
      extends RenderPart(PangoRenderPart.PANGO_RENDER_PART_STRIKETHROUGH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * overlines
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
