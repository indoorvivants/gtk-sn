package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.GskRenderNodeType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The type of a node determines what the node is rendering.
  */
enum RenderNodeType(val raw: GskRenderNodeType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Error type. No node will ever have this type.
    */
  case NOT_A_RENDER_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_NOT_A_RENDER_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node containing a stack of children
    */
  case CONTAINER_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_CONTAINER_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node drawing a `cairo_surface_t`
    */
  case CAIRO_NODE extends RenderNodeType(GskRenderNodeType.GSK_CAIRO_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node drawing a single color rectangle
    */
  case COLOR_NODE extends RenderNodeType(GskRenderNodeType.GSK_COLOR_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node drawing a linear gradient
    */
  case LINEAR_GRADIENT_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_LINEAR_GRADIENT_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node drawing a repeating linear gradient
    */
  case REPEATING_LINEAR_GRADIENT_NODE
      extends RenderNodeType(
        GskRenderNodeType.GSK_REPEATING_LINEAR_GRADIENT_NODE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node drawing a radial gradient
    */
  case RADIAL_GRADIENT_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_RADIAL_GRADIENT_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node drawing a repeating radial gradient
    */
  case REPEATING_RADIAL_GRADIENT_NODE
      extends RenderNodeType(
        GskRenderNodeType.GSK_REPEATING_RADIAL_GRADIENT_NODE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node drawing a conic gradient
    */
  case CONIC_GRADIENT_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_CONIC_GRADIENT_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node stroking a border around an area
    */
  case BORDER_NODE extends RenderNodeType(GskRenderNodeType.GSK_BORDER_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node drawing a `GdkTexture`
    */
  case TEXTURE_NODE extends RenderNodeType(GskRenderNodeType.GSK_TEXTURE_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node drawing an inset shadow
    */
  case INSET_SHADOW_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_INSET_SHADOW_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node drawing an outset shadow
    */
  case OUTSET_SHADOW_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_OUTSET_SHADOW_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node that renders its child after applying a matrix transform
    */
  case TRANSFORM_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_TRANSFORM_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node that changes the opacity of its child
    */
  case OPACITY_NODE extends RenderNodeType(GskRenderNodeType.GSK_OPACITY_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node that applies a color matrix to every pixel
    */
  case COLOR_MATRIX_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_COLOR_MATRIX_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node that repeats the child's contents
    */
  case REPEAT_NODE extends RenderNodeType(GskRenderNodeType.GSK_REPEAT_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node that clips its child to a rectangular area
    */
  case CLIP_NODE extends RenderNodeType(GskRenderNodeType.GSK_CLIP_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node that clips its child to a rounded rectangle
    */
  case ROUNDED_CLIP_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_ROUNDED_CLIP_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node that draws a shadow below its child
    */
  case SHADOW_NODE extends RenderNodeType(GskRenderNodeType.GSK_SHADOW_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node that blends two children together
    */
  case BLEND_NODE extends RenderNodeType(GskRenderNodeType.GSK_BLEND_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node that cross-fades between two children
    */
  case CROSS_FADE_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_CROSS_FADE_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node containing a glyph string
    */
  case TEXT_NODE extends RenderNodeType(GskRenderNodeType.GSK_TEXT_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node that applies a blur
    */
  case BLUR_NODE extends RenderNodeType(GskRenderNodeType.GSK_BLUR_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Debug information that does not affect the rendering
    */
  case DEBUG_NODE extends RenderNodeType(GskRenderNodeType.GSK_DEBUG_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node that uses OpenGL fragment shaders to render
    */
  case GL_SHADER_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_GL_SHADER_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node drawing a `GdkTexture` scaled and filtered (Since: 4.10)
    */
  case TEXTURE_SCALE_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_TEXTURE_SCALE_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node that masks one child with another (Since: 4.10)
    */
  case MASK_NODE extends RenderNodeType(GskRenderNodeType.GSK_MASK_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node that fills a path
    */
  case FILL_NODE extends RenderNodeType(GskRenderNodeType.GSK_FILL_NODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A node that strokes a path
    */
  case STROKE_NODE extends RenderNodeType(GskRenderNodeType.GSK_STROKE_NODE)
end RenderNodeType

object RenderNodeType:
  def fromRaw(raw: GskRenderNodeType): RenderNodeType =
    raw match
      case GskRenderNodeType.GSK_NOT_A_RENDER_NODE =>
        RenderNodeType.NOT_A_RENDER_NODE
      case GskRenderNodeType.GSK_CONTAINER_NODE => RenderNodeType.CONTAINER_NODE
      case GskRenderNodeType.GSK_CAIRO_NODE     => RenderNodeType.CAIRO_NODE
      case GskRenderNodeType.GSK_COLOR_NODE     => RenderNodeType.COLOR_NODE
      case GskRenderNodeType.GSK_LINEAR_GRADIENT_NODE =>
        RenderNodeType.LINEAR_GRADIENT_NODE
      case GskRenderNodeType.GSK_REPEATING_LINEAR_GRADIENT_NODE =>
        RenderNodeType.REPEATING_LINEAR_GRADIENT_NODE
      case GskRenderNodeType.GSK_RADIAL_GRADIENT_NODE =>
        RenderNodeType.RADIAL_GRADIENT_NODE
      case GskRenderNodeType.GSK_REPEATING_RADIAL_GRADIENT_NODE =>
        RenderNodeType.REPEATING_RADIAL_GRADIENT_NODE
      case GskRenderNodeType.GSK_CONIC_GRADIENT_NODE =>
        RenderNodeType.CONIC_GRADIENT_NODE
      case GskRenderNodeType.GSK_BORDER_NODE  => RenderNodeType.BORDER_NODE
      case GskRenderNodeType.GSK_TEXTURE_NODE => RenderNodeType.TEXTURE_NODE
      case GskRenderNodeType.GSK_INSET_SHADOW_NODE =>
        RenderNodeType.INSET_SHADOW_NODE
      case GskRenderNodeType.GSK_OUTSET_SHADOW_NODE =>
        RenderNodeType.OUTSET_SHADOW_NODE
      case GskRenderNodeType.GSK_TRANSFORM_NODE => RenderNodeType.TRANSFORM_NODE
      case GskRenderNodeType.GSK_OPACITY_NODE   => RenderNodeType.OPACITY_NODE
      case GskRenderNodeType.GSK_COLOR_MATRIX_NODE =>
        RenderNodeType.COLOR_MATRIX_NODE
      case GskRenderNodeType.GSK_REPEAT_NODE       => RenderNodeType.REPEAT_NODE
      case GskRenderNodeType.GSK_CLIP_NODE         => RenderNodeType.CLIP_NODE
      case GskRenderNodeType.GSK_ROUNDED_CLIP_NODE =>
        RenderNodeType.ROUNDED_CLIP_NODE
      case GskRenderNodeType.GSK_SHADOW_NODE     => RenderNodeType.SHADOW_NODE
      case GskRenderNodeType.GSK_BLEND_NODE      => RenderNodeType.BLEND_NODE
      case GskRenderNodeType.GSK_CROSS_FADE_NODE =>
        RenderNodeType.CROSS_FADE_NODE
      case GskRenderNodeType.GSK_TEXT_NODE      => RenderNodeType.TEXT_NODE
      case GskRenderNodeType.GSK_BLUR_NODE      => RenderNodeType.BLUR_NODE
      case GskRenderNodeType.GSK_DEBUG_NODE     => RenderNodeType.DEBUG_NODE
      case GskRenderNodeType.GSK_GL_SHADER_NODE => RenderNodeType.GL_SHADER_NODE
      case GskRenderNodeType.GSK_TEXTURE_SCALE_NODE =>
        RenderNodeType.TEXTURE_SCALE_NODE
      case GskRenderNodeType.GSK_MASK_NODE   => RenderNodeType.MASK_NODE
      case GskRenderNodeType.GSK_FILL_NODE   => RenderNodeType.FILL_NODE
      case GskRenderNodeType.GSK_STROKE_NODE => RenderNodeType.STROKE_NODE
  end fromRaw
end RenderNodeType
