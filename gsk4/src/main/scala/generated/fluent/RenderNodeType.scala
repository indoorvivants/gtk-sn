package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.GskRenderNodeType

/** The type of a node determines what the node is rendering.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum RenderNodeType(val raw: GskRenderNodeType):
  /** Error type. No node will ever have this type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_A_RENDER_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_NOT_A_RENDER_NODE)

  /** A node containing a stack of children
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CONTAINER_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_CONTAINER_NODE)

  /** A node drawing a `cairo_surface_t`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CAIRO_NODE extends RenderNodeType(GskRenderNodeType.GSK_CAIRO_NODE)

  /** A node drawing a single color rectangle
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COLOR_NODE extends RenderNodeType(GskRenderNodeType.GSK_COLOR_NODE)

  /** A node drawing a linear gradient
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LINEAR_GRADIENT_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_LINEAR_GRADIENT_NODE)

  /** A node drawing a repeating linear gradient
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case REPEATING_LINEAR_GRADIENT_NODE
      extends RenderNodeType(
        GskRenderNodeType.GSK_REPEATING_LINEAR_GRADIENT_NODE
      )

  /** A node drawing a radial gradient
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RADIAL_GRADIENT_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_RADIAL_GRADIENT_NODE)

  /** A node drawing a repeating radial gradient
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case REPEATING_RADIAL_GRADIENT_NODE
      extends RenderNodeType(
        GskRenderNodeType.GSK_REPEATING_RADIAL_GRADIENT_NODE
      )

  /** A node drawing a conic gradient
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CONIC_GRADIENT_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_CONIC_GRADIENT_NODE)

  /** A node stroking a border around an area
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BORDER_NODE extends RenderNodeType(GskRenderNodeType.GSK_BORDER_NODE)

  /** A node drawing a `GdkTexture`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TEXTURE_NODE extends RenderNodeType(GskRenderNodeType.GSK_TEXTURE_NODE)

  /** A node drawing an inset shadow
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INSET_SHADOW_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_INSET_SHADOW_NODE)

  /** A node drawing an outset shadow
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OUTSET_SHADOW_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_OUTSET_SHADOW_NODE)

  /** A node that renders its child after applying a matrix transform
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TRANSFORM_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_TRANSFORM_NODE)

  /** A node that changes the opacity of its child
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OPACITY_NODE extends RenderNodeType(GskRenderNodeType.GSK_OPACITY_NODE)

  /** A node that applies a color matrix to every pixel
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COLOR_MATRIX_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_COLOR_MATRIX_NODE)

  /** A node that repeats the child's contents
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case REPEAT_NODE extends RenderNodeType(GskRenderNodeType.GSK_REPEAT_NODE)

  /** A node that clips its child to a rectangular area
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CLIP_NODE extends RenderNodeType(GskRenderNodeType.GSK_CLIP_NODE)

  /** A node that clips its child to a rounded rectangle
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ROUNDED_CLIP_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_ROUNDED_CLIP_NODE)

  /** A node that draws a shadow below its child
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SHADOW_NODE extends RenderNodeType(GskRenderNodeType.GSK_SHADOW_NODE)

  /** A node that blends two children together
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BLEND_NODE extends RenderNodeType(GskRenderNodeType.GSK_BLEND_NODE)

  /** A node that cross-fades between two children
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CROSS_FADE_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_CROSS_FADE_NODE)

  /** A node containing a glyph string
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TEXT_NODE extends RenderNodeType(GskRenderNodeType.GSK_TEXT_NODE)

  /** A node that applies a blur
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BLUR_NODE extends RenderNodeType(GskRenderNodeType.GSK_BLUR_NODE)

  /** Debug information that does not affect the rendering
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DEBUG_NODE extends RenderNodeType(GskRenderNodeType.GSK_DEBUG_NODE)

  /** A node that uses OpenGL fragment shaders to render
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GL_SHADER_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_GL_SHADER_NODE)

  /** A node drawing a `GdkTexture` scaled and filtered (Since: 4.10)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TEXTURE_SCALE_NODE
      extends RenderNodeType(GskRenderNodeType.GSK_TEXTURE_SCALE_NODE)

  /** A node that masks one child with another (Since: 4.10)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MASK_NODE extends RenderNodeType(GskRenderNodeType.GSK_MASK_NODE)

  /** A node that fills a path
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FILL_NODE extends RenderNodeType(GskRenderNodeType.GSK_FILL_NODE)

  /** A node that strokes a path
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
