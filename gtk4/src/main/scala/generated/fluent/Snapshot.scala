package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.internal.cairo_t
import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gdk4.fluent.Texture
import sn.gnome.gdk4.internal.GdkRGBA
import sn.gnome.glib.internal.GBytes
import sn.gnome.graphene.internal.graphene_matrix_t
import sn.gnome.graphene.internal.graphene_point3d_t
import sn.gnome.graphene.internal.graphene_point_t
import sn.gnome.graphene.internal.graphene_rect_t
import sn.gnome.graphene.internal.graphene_size_t
import sn.gnome.graphene.internal.graphene_vec3_t
import sn.gnome.graphene.internal.graphene_vec4_t
import sn.gnome.gsk4.fluent.GLShader
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskBlendMode
import sn.gnome.gsk4.internal.GskFillRule
import sn.gnome.gsk4.internal.GskMaskMode
import sn.gnome.gsk4.internal.GskPath
import sn.gnome.gsk4.internal.GskRoundedRect
import sn.gnome.gsk4.internal.GskScalingFilter
import sn.gnome.gsk4.internal.GskStroke
import sn.gnome.gsk4.internal.GskTransform
import sn.gnome.gtk4.fluent.StyleContext
import sn.gnome.gtk4.internal.GtkSnapshot
import sn.gnome.pango.fluent.Layout
import sn.gnome.pango.internal.PangoDirection
import sn.gnome.gdk4.fluent.Snapshot as _Snapshot

class Snapshot(raw: Ptr[GtkSnapshot]) extends _Snapshot(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  // Method append_border contains an array parameter, which is not supported yet

  def appendCairo(bounds: Ptr[graphene_rect_t]): Ptr[cairo_t] =
    gtk_snapshot_append_cairo(this.raw.asInstanceOf, bounds)

  def appendColor(color: Ptr[GdkRGBA], bounds: Ptr[graphene_rect_t]): Unit =
    gtk_snapshot_append_color(this.raw.asInstanceOf, color, bounds)

  // Method append_conic_gradient contains an array parameter, which is not supported yet

  def appendFill(
      path: Ptr[GskPath],
      fill_rule: GskFillRule,
      color: Ptr[GdkRGBA]
  ): Unit =
    gtk_snapshot_append_fill(this.raw.asInstanceOf, path, fill_rule, color)

  def appendInsetShadow(
      outline: Ptr[GskRoundedRect],
      color: Ptr[GdkRGBA],
      dx: Float,
      dy: Float,
      spread: Float,
      blur_radius: Float
  ): Unit = gtk_snapshot_append_inset_shadow(
    this.raw.asInstanceOf,
    outline,
    color,
    dx.asInstanceOf,
    dy.asInstanceOf,
    spread.asInstanceOf,
    blur_radius.asInstanceOf
  )

  def appendLayout(layout: Layout, color: Ptr[GdkRGBA]): Unit =
    gtk_snapshot_append_layout(
      this.raw.asInstanceOf,
      layout.getUnsafeRawPointer().asInstanceOf,
      color
    )

  // Method append_linear_gradient contains an array parameter, which is not supported yet

  def appendNode(node: RenderNode): Unit = gtk_snapshot_append_node(
    this.raw.asInstanceOf,
    node.getUnsafeRawPointer().asInstanceOf
  )

  def appendOutsetShadow(
      outline: Ptr[GskRoundedRect],
      color: Ptr[GdkRGBA],
      dx: Float,
      dy: Float,
      spread: Float,
      blur_radius: Float
  ): Unit = gtk_snapshot_append_outset_shadow(
    this.raw.asInstanceOf,
    outline,
    color,
    dx.asInstanceOf,
    dy.asInstanceOf,
    spread.asInstanceOf,
    blur_radius.asInstanceOf
  )

  // Method append_radial_gradient contains an array parameter, which is not supported yet

  // Method append_repeating_linear_gradient contains an array parameter, which is not supported yet

  // Method append_repeating_radial_gradient contains an array parameter, which is not supported yet

  def appendScaledTexture(
      texture: Texture,
      filter: GskScalingFilter,
      bounds: Ptr[graphene_rect_t]
  ): Unit = gtk_snapshot_append_scaled_texture(
    this.raw.asInstanceOf,
    texture.getUnsafeRawPointer().asInstanceOf,
    filter,
    bounds
  )

  def appendStroke(
      path: Ptr[GskPath],
      stroke: Ptr[GskStroke],
      color: Ptr[GdkRGBA]
  ): Unit =
    gtk_snapshot_append_stroke(this.raw.asInstanceOf, path, stroke, color)

  def appendTexture(texture: Texture, bounds: Ptr[graphene_rect_t]): Unit =
    gtk_snapshot_append_texture(
      this.raw.asInstanceOf,
      texture.getUnsafeRawPointer().asInstanceOf,
      bounds
    )

  def freeToNode(): RenderNode = new RenderNode(
    gtk_snapshot_free_to_node(this.raw.asInstanceOf).asInstanceOf
  )

  def freeToPaintable(size: Ptr[graphene_size_t]): Paintable =
    new Paintable.Abstract(
      gtk_snapshot_free_to_paintable(this.raw.asInstanceOf, size).asInstanceOf
    )

  def glShaderPopTexture(): Unit = gtk_snapshot_gl_shader_pop_texture(
    this.raw.asInstanceOf
  )

  def perspective(depth: Float): Unit =
    gtk_snapshot_perspective(this.raw.asInstanceOf, depth.asInstanceOf)

  def pop(): Unit = gtk_snapshot_pop(this.raw.asInstanceOf)

  def pushBlend(blend_mode: GskBlendMode): Unit =
    gtk_snapshot_push_blend(this.raw.asInstanceOf, blend_mode)

  def pushBlur(radius: Double): Unit =
    gtk_snapshot_push_blur(this.raw.asInstanceOf, radius)

  def pushClip(bounds: Ptr[graphene_rect_t]): Unit =
    gtk_snapshot_push_clip(this.raw.asInstanceOf, bounds)

  def pushColorMatrix(
      color_matrix: Ptr[graphene_matrix_t],
      color_offset: Ptr[graphene_vec4_t]
  ): Unit = gtk_snapshot_push_color_matrix(
    this.raw.asInstanceOf,
    color_matrix,
    color_offset
  )

  def pushCrossFade(progress: Double): Unit =
    gtk_snapshot_push_cross_fade(this.raw.asInstanceOf, progress)

  inline def pushDebug(message: String | CString, args: Any*)(using
      Zone
  ): Unit = gtk_snapshot_push_debug(
    this.raw.asInstanceOf,
    __sn_extract_string(message),
    args*
  )

  def pushFill(path: Ptr[GskPath], fill_rule: GskFillRule): Unit =
    gtk_snapshot_push_fill(this.raw.asInstanceOf, path, fill_rule)

  def pushGlShader(
      shader: GLShader,
      bounds: Ptr[graphene_rect_t],
      take_args: Ptr[GBytes]
  ): Unit = gtk_snapshot_push_gl_shader(
    this.raw.asInstanceOf,
    shader.getUnsafeRawPointer().asInstanceOf,
    bounds,
    take_args
  )

  def pushMask(mask_mode: GskMaskMode): Unit =
    gtk_snapshot_push_mask(this.raw.asInstanceOf, mask_mode)

  def pushOpacity(opacity: Double): Unit =
    gtk_snapshot_push_opacity(this.raw.asInstanceOf, opacity)

  def pushRepeat(
      bounds: Ptr[graphene_rect_t],
      child_bounds: Ptr[graphene_rect_t]
  ): Unit =
    gtk_snapshot_push_repeat(this.raw.asInstanceOf, bounds, child_bounds)

  def pushRoundedClip(bounds: Ptr[GskRoundedRect]): Unit =
    gtk_snapshot_push_rounded_clip(this.raw.asInstanceOf, bounds)

  // Method push_shadow contains an array parameter, which is not supported yet

  def pushStroke(path: Ptr[GskPath], stroke: Ptr[GskStroke]): Unit =
    gtk_snapshot_push_stroke(this.raw.asInstanceOf, path, stroke)

  def renderBackground(
      context: StyleContext,
      x: Double,
      y: Double,
      width: Double,
      height: Double
  ): Unit = gtk_snapshot_render_background(
    this.raw.asInstanceOf,
    context.getUnsafeRawPointer().asInstanceOf,
    x,
    y,
    width,
    height
  )

  def renderFocus(
      context: StyleContext,
      x: Double,
      y: Double,
      width: Double,
      height: Double
  ): Unit = gtk_snapshot_render_focus(
    this.raw.asInstanceOf,
    context.getUnsafeRawPointer().asInstanceOf,
    x,
    y,
    width,
    height
  )

  def renderFrame(
      context: StyleContext,
      x: Double,
      y: Double,
      width: Double,
      height: Double
  ): Unit = gtk_snapshot_render_frame(
    this.raw.asInstanceOf,
    context.getUnsafeRawPointer().asInstanceOf,
    x,
    y,
    width,
    height
  )

  def renderInsertionCursor(
      context: StyleContext,
      x: Double,
      y: Double,
      layout: Layout,
      index: Int,
      direction: PangoDirection
  ): Unit = gtk_snapshot_render_insertion_cursor(
    this.raw.asInstanceOf,
    context.getUnsafeRawPointer().asInstanceOf,
    x,
    y,
    layout.getUnsafeRawPointer().asInstanceOf,
    index,
    direction
  )

  def renderLayout(
      context: StyleContext,
      x: Double,
      y: Double,
      layout: Layout
  ): Unit = gtk_snapshot_render_layout(
    this.raw.asInstanceOf,
    context.getUnsafeRawPointer().asInstanceOf,
    x,
    y,
    layout.getUnsafeRawPointer().asInstanceOf
  )

  def restore(): Unit = gtk_snapshot_restore(this.raw.asInstanceOf)

  def rotate(angle: Float): Unit =
    gtk_snapshot_rotate(this.raw.asInstanceOf, angle.asInstanceOf)

  def rotate3d(angle: Float, axis: Ptr[graphene_vec3_t]): Unit =
    gtk_snapshot_rotate_3d(this.raw.asInstanceOf, angle.asInstanceOf, axis)

  def save(): Unit = gtk_snapshot_save(this.raw.asInstanceOf)

  def scale(factor_x: Float, factor_y: Float): Unit = gtk_snapshot_scale(
    this.raw.asInstanceOf,
    factor_x.asInstanceOf,
    factor_y.asInstanceOf
  )

  def scale3d(factor_x: Float, factor_y: Float, factor_z: Float): Unit =
    gtk_snapshot_scale_3d(
      this.raw.asInstanceOf,
      factor_x.asInstanceOf,
      factor_y.asInstanceOf,
      factor_z.asInstanceOf
    )

  def toNode(): RenderNode = new RenderNode(
    gtk_snapshot_to_node(this.raw.asInstanceOf).asInstanceOf
  )

  def toPaintable(size: Ptr[graphene_size_t]): Paintable =
    new Paintable.Abstract(
      gtk_snapshot_to_paintable(this.raw.asInstanceOf, size).asInstanceOf
    )

  def transform(transform: Ptr[GskTransform]): Unit =
    gtk_snapshot_transform(this.raw.asInstanceOf, transform)

  def transformMatrix(matrix: Ptr[graphene_matrix_t]): Unit =
    gtk_snapshot_transform_matrix(this.raw.asInstanceOf, matrix)

  def translate(point: Ptr[graphene_point_t]): Unit =
    gtk_snapshot_translate(this.raw.asInstanceOf, point)

  def translate3d(point: Ptr[graphene_point3d_t]): Unit =
    gtk_snapshot_translate_3d(this.raw.asInstanceOf, point)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Snapshot

object Snapshot:
  def apply(): Snapshot = new Snapshot(gtk_snapshot_new().asInstanceOf)
end Snapshot
