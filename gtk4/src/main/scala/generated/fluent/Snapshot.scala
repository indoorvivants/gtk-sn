package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gdk4.fluent.Texture
import sn.gnome.gdk4.internal.GdkRGBA
import sn.gnome.glib.internal.GBytes
import sn.gnome.glib.internal.gsize
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
import sn.gnome.gsk4.internal.GskColorStop
import sn.gnome.gsk4.internal.GskFillRule
import sn.gnome.gsk4.internal.GskMaskMode
import sn.gnome.gsk4.internal.GskPath
import sn.gnome.gsk4.internal.GskRoundedRect
import sn.gnome.gsk4.internal.GskScalingFilter
import sn.gnome.gsk4.internal.GskShadow
import sn.gnome.gsk4.internal.GskStroke
import sn.gnome.gsk4.internal.GskTransform
import sn.gnome.gtk4.fluent.StyleContext
import sn.gnome.gtk4.internal.GtkSnapshot
import sn.gnome.pango.fluent.Layout
import sn.gnome.pango.internal.PangoDirection
import sn.gnome.gdk4.fluent.Snapshot as _Snapshot

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkSnapshot` assists in creating [class@Gsk.RenderNode]s for widgets.
  *
  * It functions in a similar way to a cairo context, and maintains a stack of
  * render nodes and their associated transformations.
  *
  * The node at the top of the stack is the one that `gtk_snapshot_append_…()`
  * functions operate on. Use the `gtk_snapshot_push_…()` functions and
  * [method@Snapshot.pop] to change the current node.
  *
  * The typical way to obtain a `GtkSnapshot` object is as an argument to the
  * [vfunc@Gtk.Widget.snapshot] vfunc. If you need to create your own
  * `GtkSnapshot`, use [ctor@Gtk.Snapshot.new].
  */
class Snapshot(raw: Ptr[GtkSnapshot]) extends _Snapshot(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends a stroked border rectangle inside the given @outline.
    *
    * The four sides of the border can have different widths and colors.
    */
  @annotation.compileTimeOnly(
    "Method append_border is weird: non NULL-terminated arrays require special handling"
  )
  def appendBorder(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new [class@Gsk.CairoNode] and appends it to the current render
    * node of @snapshot, without changing the current node.
    */
  @annotation.compileTimeOnly(
    "Method append_cairo is weird: non NULL-terminated arrays require special handling"
  )
  def appendCairo(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new render node drawing the @color into the given @bounds and
    * appends it to the current render node of @snapshot.
    *
    * You should try to avoid calling this function if
    * @color
    *   is transparent.
    */
  def appendColor(color: Ptr[GdkRGBA], bounds: Ptr[graphene_rect_t]): Unit =
    gtk_snapshot_append_color(this.raw.asInstanceOf, color, bounds)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends a conic gradient node with the given stops to @snapshot.
    */
  def appendConicGradient(
      bounds: Ptr[graphene_rect_t],
      center: Ptr[graphene_point_t],
      rotation: Float,
      stops: Ptr[GskColorStop],
      n_stops: CUnsignedLongInt
  ): Unit = gtk_snapshot_append_conic_gradient(
    this.raw.asInstanceOf,
    bounds,
    center,
    rotation.asInstanceOf,
    stops,
    gsize(n_stops)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A convenience method to fill a path with a color.
    *
    * See [method@Gtk.Snapshot.push_fill] if you need to fill a path with more
    * complex content than a color.
    */
  def appendFill(
      path: Ptr[GskPath],
      fill_rule: GskFillRule,
      color: Ptr[GdkRGBA]
  ): Unit =
    gtk_snapshot_append_fill(this.raw.asInstanceOf, path, fill_rule, color)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends an inset shadow into the box given by @outline.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends a linear gradient node with the given stops to @snapshot.
    */
  def appendLinearGradient(
      bounds: Ptr[graphene_rect_t],
      start_point: Ptr[graphene_point_t],
      end_point: Ptr[graphene_point_t],
      stops: Ptr[GskColorStop],
      n_stops: CUnsignedLongInt
  ): Unit = gtk_snapshot_append_linear_gradient(
    this.raw.asInstanceOf,
    bounds,
    start_point,
    end_point,
    stops,
    gsize(n_stops)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends @node to the current render node of @snapshot, without changing
    * the current node.
    *
    * If @snapshot does not have a current node yet, @node will become the
    * initial node.
    */
  def appendNode(node: RenderNode): Unit = gtk_snapshot_append_node(
    this.raw.asInstanceOf,
    node.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends an outset shadow node around the box given by @outline.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends a radial gradient node with the given stops to @snapshot.
    */
  def appendRadialGradient(
      bounds: Ptr[graphene_rect_t],
      center: Ptr[graphene_point_t],
      hradius: Float,
      vradius: Float,
      start: Float,
      end: Float,
      stops: Ptr[GskColorStop],
      n_stops: CUnsignedLongInt
  ): Unit = gtk_snapshot_append_radial_gradient(
    this.raw.asInstanceOf,
    bounds,
    center,
    hradius.asInstanceOf,
    vradius.asInstanceOf,
    start.asInstanceOf,
    end.asInstanceOf,
    stops,
    gsize(n_stops)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends a repeating linear gradient node with the given stops to @snapshot.
    */
  def appendRepeatingLinearGradient(
      bounds: Ptr[graphene_rect_t],
      start_point: Ptr[graphene_point_t],
      end_point: Ptr[graphene_point_t],
      stops: Ptr[GskColorStop],
      n_stops: CUnsignedLongInt
  ): Unit = gtk_snapshot_append_repeating_linear_gradient(
    this.raw.asInstanceOf,
    bounds,
    start_point,
    end_point,
    stops,
    gsize(n_stops)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends a repeating radial gradient node with the given stops to @snapshot.
    */
  def appendRepeatingRadialGradient(
      bounds: Ptr[graphene_rect_t],
      center: Ptr[graphene_point_t],
      hradius: Float,
      vradius: Float,
      start: Float,
      end: Float,
      stops: Ptr[GskColorStop],
      n_stops: CUnsignedLongInt
  ): Unit = gtk_snapshot_append_repeating_radial_gradient(
    this.raw.asInstanceOf,
    bounds,
    center,
    hradius.asInstanceOf,
    vradius.asInstanceOf,
    start.asInstanceOf,
    end.asInstanceOf,
    stops,
    gsize(n_stops)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new render node drawing the @texture into the given @bounds and
    * appends it to the current render node of @snapshot.
    *
    * In contrast to [method@Gtk.Snapshot.append_texture], this function
    * provides control about how the filter that is used when scaling.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A convenience method to stroke a path with a color.
    *
    * See [method@Gtk.Snapshot.push_stroke] if you need to stroke a path with
    * more complex content than a color.
    */
  def appendStroke(
      path: Ptr[GskPath],
      stroke: Ptr[GskStroke],
      color: Ptr[GdkRGBA]
  ): Unit =
    gtk_snapshot_append_stroke(this.raw.asInstanceOf, path, stroke, color)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new render node drawing the @texture into the given @bounds and
    * appends it to the current render node of @snapshot.
    *
    * If the texture needs to be scaled to fill @bounds, linear filtering is
    * used. See [method@Gtk.Snapshot.append_scaled_texture] if you need other
    * filtering, such as nearest-neighbour.
    */
  def appendTexture(texture: Texture, bounds: Ptr[graphene_rect_t]): Unit =
    gtk_snapshot_append_texture(
      this.raw.asInstanceOf,
      texture.getUnsafeRawPointer().asInstanceOf,
      bounds
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the node that was constructed by @snapshot and frees @snapshot.
    *
    * See also [method@Gtk.Snapshot.to_node].
    */
  def freeToNode(): RenderNode = new RenderNode(
    gtk_snapshot_free_to_node(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a paintable for the node that was constructed by @snapshot and
    * frees @snapshot.
    */
  def freeToPaintable(size: Ptr[graphene_size_t]): Paintable =
    new Paintable.Abstract(
      gtk_snapshot_free_to_paintable(this.raw.asInstanceOf, size).asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes the top element from the stack of render nodes and adds it to the
    * nearest [class@Gsk.GLShaderNode] below it.
    *
    * This must be called the same number of times as the number of textures is
    * needed for the shader in [method@Gtk.Snapshot.push_gl_shader].
    */
  def glShaderPopTexture(): Unit = gtk_snapshot_gl_shader_pop_texture(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Applies a perspective projection transform.
    *
    * See [method@Gsk.Transform.perspective] for a discussion on the details.
    */
  def perspective(depth: Float): Unit =
    gtk_snapshot_perspective(this.raw.asInstanceOf, depth.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes the top element from the stack of render nodes, and appends it to
    * the node underneath it.
    */
  def pop(): Unit = gtk_snapshot_pop(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Blends together two images with the given blend mode.
    *
    * Until the first call to [method@Gtk.Snapshot.pop], the bottom image for
    * the blend operation will be recorded. After that call, the top image to be
    * blended will be recorded until the second call to
    * [method@Gtk.Snapshot.pop].
    *
    * Calling this function requires two subsequent calls to
    * [method@Gtk.Snapshot.pop].
    */
  def pushBlend(blend_mode: GskBlendMode): Unit =
    gtk_snapshot_push_blend(this.raw.asInstanceOf, blend_mode)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Blurs an image.
    *
    * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
    */
  def pushBlur(radius: Double): Unit =
    gtk_snapshot_push_blur(this.raw.asInstanceOf, radius)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Clips an image to a rectangle.
    *
    * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
    */
  def pushClip(bounds: Ptr[graphene_rect_t]): Unit =
    gtk_snapshot_push_clip(this.raw.asInstanceOf, bounds)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Modifies the colors of an image by applying an affine transformation in
    * RGB space.
    *
    * In particular, the colors will be transformed by applying
    *
    * pixel = transpose(color_matrix) * pixel + color_offset
    *
    * for every pixel. The transformation operates on unpremultiplied colors,
    * with color components ordered R, G, B, A.
    *
    * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
    */
  def pushColorMatrix(
      color_matrix: Ptr[graphene_matrix_t],
      color_offset: Ptr[graphene_vec4_t]
  ): Unit = gtk_snapshot_push_color_matrix(
    this.raw.asInstanceOf,
    color_matrix,
    color_offset
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Snapshots a cross-fade operation between two images with the given @progress.
    *
    * Until the first call to [method@Gtk.Snapshot.pop], the start image will be
    * snapshot. After that call, the end image will be recorded until the second
    * call to [method@Gtk.Snapshot.pop].
    *
    * Calling this function requires two subsequent calls to
    * [method@Gtk.Snapshot.pop].
    */
  def pushCrossFade(progress: Double): Unit =
    gtk_snapshot_push_cross_fade(this.raw.asInstanceOf, progress)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts a debug node with a message.
    *
    * Debug nodes don't affect the rendering at all, but can be helpful in
    * identifying parts of a render node tree dump, for example in the GTK
    * inspector.
    */
  inline def pushDebug(message: String | CString, args: Any*)(using
      Zone
  ): Unit = gtk_snapshot_push_debug(
    this.raw.asInstanceOf,
    __sn_extract_string(message),
    args*
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fills the area given by @path and @fill_rule with an image and discards
    * everything outside of it.
    *
    * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
    *
    * If you want to fill the path with a color,
    * [method@Gtk.Snapshot.append_fill] may be more convenient.
    */
  def pushFill(path: Ptr[GskPath], fill_rule: GskFillRule): Unit =
    gtk_snapshot_push_fill(this.raw.asInstanceOf, path, fill_rule)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Push a [class@Gsk.GLShaderNode].
    *
    * The node uses the given [class@Gsk.GLShader] and uniform values
    * Additionally this takes a list of @n_children other nodes which will be
    * passed to the [class@Gsk.GLShaderNode].
    *
    * The @take_args argument is a block of data to use for uniform arguments,
    * as per types and offsets defined by the @shader. Normally this is
    * generated by [method@Gsk.GLShader.format_args] or
    * [struct@Gsk.ShaderArgsBuilder].
    *
    * The snapshotter takes ownership of @take_args, so the caller should not
    * free it after this.
    *
    * If the renderer doesn't support GL shaders, or if there is any problem
    * when compiling the shader, then the node will draw pink. You should use
    * [method@Gsk.GLShader.compile] to ensure the @shader will work for the
    * renderer before using it.
    *
    * If the shader requires textures (see
    * [method@Gsk.GLShader.get_n_textures]), then it is expected that you call
    * [method@Gtk.Snapshot.gl_shader_pop_texture] the number of times that are
    * required. Each of these calls will generate a node that is added as a
    * child to the `GskGLShaderNode`, which in turn will render these offscreen
    * and pass as a texture to the shader.
    *
    * Once all textures (if any) are pop:ed, you must call the regular
    * [method@Gtk.Snapshot.pop].
    *
    * If you want to use pre-existing textures as input to the shader rather
    * than rendering new ones, use [method@Gtk.Snapshot.append_texture] to push
    * a texture node. These will be used directly rather than being re-rendered.
    *
    * For details on how to write shaders, see [class@Gsk.GLShader].
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Until the first call to [method@Gtk.Snapshot.pop], the mask image for the
    * mask operation will be recorded.
    *
    * After that call, the source image will be recorded until the second call
    * to [method@Gtk.Snapshot.pop].
    *
    * Calling this function requires 2 subsequent calls to gtk_snapshot_pop().
    */
  def pushMask(mask_mode: GskMaskMode): Unit =
    gtk_snapshot_push_mask(this.raw.asInstanceOf, mask_mode)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Modifies the opacity of an image.
    *
    * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
    */
  def pushOpacity(opacity: Double): Unit =
    gtk_snapshot_push_opacity(this.raw.asInstanceOf, opacity)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a node that repeats the child node.
    *
    * The child is recorded until the next call to [method@Gtk.Snapshot.pop].
    */
  def pushRepeat(
      bounds: Ptr[graphene_rect_t],
      child_bounds: Ptr[graphene_rect_t]
  ): Unit =
    gtk_snapshot_push_repeat(this.raw.asInstanceOf, bounds, child_bounds)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Clips an image to a rounded rectangle.
    *
    * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
    */
  def pushRoundedClip(bounds: Ptr[GskRoundedRect]): Unit =
    gtk_snapshot_push_rounded_clip(this.raw.asInstanceOf, bounds)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Applies a shadow to an image.
    *
    * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
    */
  def pushShadow(shadow: Ptr[GskShadow], n_shadows: CUnsignedLongInt): Unit =
    gtk_snapshot_push_shadow(this.raw.asInstanceOf, shadow, gsize(n_shadows))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Strokes the given @path with the attributes given by @stroke and an image.
    *
    * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
    *
    * Note that the strokes are subject to the same transformation as everything
    * else, so uneven scaling will cause horizontal and vertical strokes to have
    * different widths.
    *
    * If you want to stroke the path with a color,
    * [method@Gtk.Snapshot.append_stroke] may be more convenient.
    */
  def pushStroke(path: Ptr[GskPath], stroke: Ptr[GskStroke]): Unit =
    gtk_snapshot_push_stroke(this.raw.asInstanceOf, path, stroke)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a render node for the CSS background according to @context, and
    * appends it to the current node of @snapshot, without changing the current
    * node.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a render node for the focus outline according to @context, and
    * appends it to the current node of @snapshot, without changing the current
    * node.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a render node for the CSS border according to @context, and
    * appends it to the current node of @snapshot, without changing the current
    * node.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Draws a text caret using @snapshot at the specified index of @layout.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a render node for rendering @layout according to the style
    * information in @context, and appends it to the current node of @snapshot,
    * without changing the current node.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Restores @snapshot to the state saved by a preceding call to
    * [method@Snapshot.save] and removes that state from the stack of saved
    * states.
    */
  def restore(): Unit = gtk_snapshot_restore(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Rotates @@snapshot's coordinate system by @angle degrees in 2D space - or
    * in 3D speak, rotates around the Z axis. The rotation happens around the
    * origin point of (0, 0) in the @snapshot's current coordinate system.
    *
    * To rotate around axes other than the Z axis, use
    * [method@Gsk.Transform.rotate_3d].
    */
  def rotate(angle: Float): Unit =
    gtk_snapshot_rotate(this.raw.asInstanceOf, angle.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Rotates @snapshot's coordinate system by @angle degrees around @axis.
    *
    * For a rotation in 2D space, use [method@Gsk.Transform.rotate].
    */
  def rotate3d(angle: Float, axis: Ptr[graphene_vec3_t]): Unit =
    gtk_snapshot_rotate_3d(this.raw.asInstanceOf, angle.asInstanceOf, axis)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makes a copy of the current state of @snapshot and saves it on an internal
    * stack.
    *
    * When [method@Gtk.Snapshot.restore] is called, @snapshot will be restored
    * to the saved state. Multiple calls to [method@Snapshot.save] and
    * [class@Snapshot.restore] can be nested; each call to
    * `gtk_snapshot_restore()` restores the state from the matching paired
    * `gtk_snapshot_save()`.
    *
    * It is necessary to clear all saved states with corresponding calls to
    * `gtk_snapshot_restore()`.
    */
  def save(): Unit = gtk_snapshot_save(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scales @snapshot's coordinate system in 2-dimensional space by the given
    * factors.
    *
    * Use [method@Gtk.Snapshot.scale_3d] to scale in all 3 dimensions.
    */
  def scale(factor_x: Float, factor_y: Float): Unit = gtk_snapshot_scale(
    this.raw.asInstanceOf,
    factor_x.asInstanceOf,
    factor_y.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scales @snapshot's coordinate system by the given factors.
    */
  def scale3d(factor_x: Float, factor_y: Float, factor_z: Float): Unit =
    gtk_snapshot_scale_3d(
      this.raw.asInstanceOf,
      factor_x.asInstanceOf,
      factor_y.asInstanceOf,
      factor_z.asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the render node that was constructed by @snapshot.
    *
    * Note that this function may return %NULL if nothing has been added to the
    * snapshot or if its content does not produce pixels to be rendered.
    *
    * After calling this function, it is no longer possible to add more nodes to @snapshot.
    * The only function that should be called after this is
    * [method@GObject.Object.unref].
    */
  def toNode(): RenderNode = new RenderNode(
    gtk_snapshot_to_node(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a paintable encapsulating the render node that was constructed by @snapshot.
    *
    * After calling this function, it is no longer possible to add more nodes to @snapshot.
    * The only function that should be called after this is
    * [method@GObject.Object.unref].
    */
  def toPaintable(size: Ptr[graphene_size_t]): Paintable =
    new Paintable.Abstract(
      gtk_snapshot_to_paintable(this.raw.asInstanceOf, size).asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Transforms @snapshot's coordinate system with the given @transform.
    */
  def transform(transform: Ptr[GskTransform]): Unit =
    gtk_snapshot_transform(this.raw.asInstanceOf, transform)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Transforms @snapshot's coordinate system with the given @matrix.
    */
  def transformMatrix(matrix: Ptr[graphene_matrix_t]): Unit =
    gtk_snapshot_transform_matrix(this.raw.asInstanceOf, matrix)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Translates @snapshot's coordinate system by @point in 2-dimensional space.
    */
  def translate(point: Ptr[graphene_point_t]): Unit =
    gtk_snapshot_translate(this.raw.asInstanceOf, point)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Translates @snapshot's coordinate system by @point.
    */
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkSnapshot`.
    */
  def apply(): Snapshot = new Snapshot(gtk_snapshot_new().asInstanceOf)
end Snapshot
