package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.{BlendMode, MaskMode, RenderNode}
import sn.gnome.gtk4.fluent.StyleContext
import sn.gnome.gtk4.internal.GtkSnapshot
import sn.gnome.pango.fluent.{Direction, Layout}
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
  def appendBorder__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new [class@Gsk.CairoNode] and appends it to the current render
    * node of @snapshot, without changing the current node.
    */
  @annotation.compileTimeOnly(
    "Method append_cairo is weird: non NULL-terminated arrays require special handling"
  )
  def appendCairo__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new render node drawing the @color into the given @bounds and
    * appends it to the current render node of @snapshot.
    *
    * You should try to avoid calling this function if
    * @color
    *   is transparent.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))"
  )
  def appendColor__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends a conic gradient node with the given stops to @snapshot.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  def appendConicGradient__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A convenience method to fill a path with a color.
    *
    * See [method@Gtk.Snapshot.push_fill] if you need to fill a path with more
    * complex content than a color.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gsk.Path), @type -> DataRecord(GskPath*)))"
  )
  def appendFill__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends an inset shadow into the box given by @outline.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gsk.RoundedRect), @type -> DataRecord(const GskRoundedRect*)))"
  )
  def appendInsetShadow__ = ???

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))"
  )
  def appendLayout__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends a linear gradient node with the given stops to @snapshot.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  def appendLinearGradient__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends @node to the current render node of @snapshot, without changing
    * the current node.
    *
    * If @snapshot does not have a current node yet, @node will become the
    * initial node.
    */
  def appendNode(
      node: RenderNode /* Some(Ptr[_root_.sn.gnome.gsk4.internal.GskRenderNode]) */
  ): Unit /* None */ = gtk_snapshot_append_node(
    this.raw.asInstanceOf[Ptr[GtkSnapshot]],
    node.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends an outset shadow node around the box given by @outline.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gsk.RoundedRect), @type -> DataRecord(const GskRoundedRect*)))"
  )
  def appendOutsetShadow__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends a radial gradient node with the given stops to @snapshot.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  def appendRadialGradient__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends a repeating linear gradient node with the given stops to @snapshot.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  def appendRepeatingLinearGradient__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends a repeating radial gradient node with the given stops to @snapshot.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  def appendRepeatingRadialGradient__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new render node drawing the @texture into the given @bounds and
    * appends it to the current render node of @snapshot.
    *
    * In contrast to [method@Gtk.Snapshot.append_texture], this function
    * provides control about how the filter that is used when scaling.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  def appendScaledTexture__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A convenience method to stroke a path with a color.
    *
    * See [method@Gtk.Snapshot.push_stroke] if you need to stroke a path with
    * more complex content than a color.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gsk.Path), @type -> DataRecord(GskPath*)))"
  )
  def appendStroke__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new render node drawing the @texture into the given @bounds and
    * appends it to the current render node of @snapshot.
    *
    * If the texture needs to be scaled to fill @bounds, linear filtering is
    * used. See [method@Gtk.Snapshot.append_scaled_texture] if you need other
    * filtering, such as nearest-neighbour.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  def appendTexture__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the node that was constructed by @snapshot and frees @snapshot.
    *
    * See also [method@Gtk.Snapshot.to_node].
    */
  def freeToNode(): RenderNode /* None */ = new RenderNode(
    gtk_snapshot_free_to_node(
      this.raw.asInstanceOf[Ptr[GtkSnapshot]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a paintable for the node that was constructed by @snapshot and
    * frees @snapshot.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Size), @type -> DataRecord(const graphene_size_t*)))"
  )
  def freeToPaintable__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes the top element from the stack of render nodes and adds it to the
    * nearest [class@Gsk.GLShaderNode] below it.
    *
    * This must be called the same number of times as the number of textures is
    * needed for the shader in [method@Gtk.Snapshot.push_gl_shader].
    */
  def glShaderPopTexture(): Unit /* None */ =
    gtk_snapshot_gl_shader_pop_texture(this.raw.asInstanceOf[Ptr[GtkSnapshot]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Applies a perspective projection transform.
    *
    * See [method@Gsk.Transform.perspective] for a discussion on the details.
    */
  def perspective(depth: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_snapshot_perspective(
      this.raw.asInstanceOf[Ptr[GtkSnapshot]],
      depth.asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes the top element from the stack of render nodes, and appends it to
    * the node underneath it.
    */
  def pop(): Unit /* None */ = gtk_snapshot_pop(
    this.raw.asInstanceOf[Ptr[GtkSnapshot]]
  )

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
  def pushBlend(
      blend_mode: BlendMode /* Some(_root_.sn.gnome.gsk4.internal.GskBlendMode) */
  ): Unit /* None */ = gtk_snapshot_push_blend(
    this.raw.asInstanceOf[Ptr[GtkSnapshot]],
    blend_mode.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Blurs an image.
    *
    * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
    */
  def pushBlur(radius: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_snapshot_push_blur(this.raw.asInstanceOf[Ptr[GtkSnapshot]], radius)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Clips an image to a rectangle.
    *
    * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  def pushClip__ = ???

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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Matrix), @type -> DataRecord(const graphene_matrix_t*)))"
  )
  def pushColorMatrix__ = ???

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
  def pushCrossFade(progress: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_snapshot_push_cross_fade(
      this.raw.asInstanceOf[Ptr[GtkSnapshot]],
      progress
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts a debug node with a message.
    *
    * Debug nodes don't affect the rendering at all, but can be helpful in
    * identifying parts of a render node tree dump, for example in the GTK
    * inspector.
    */
  inline def pushDebug(
      message: String | CString /* Some(CString) */,
      args: Any*
  )(using Zone): Unit /* None */ = gtk_snapshot_push_debug(
    this.raw.asInstanceOf[Ptr[GtkSnapshot]],
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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gsk.Path), @type -> DataRecord(GskPath*)))"
  )
  def pushFill__ = ???

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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  def pushGlShader__ = ???

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
  def pushMask(
      mask_mode: MaskMode /* Some(_root_.sn.gnome.gsk4.internal.GskMaskMode) */
  ): Unit /* None */ = gtk_snapshot_push_mask(
    this.raw.asInstanceOf[Ptr[GtkSnapshot]],
    mask_mode.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Modifies the opacity of an image.
    *
    * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
    */
  def pushOpacity(opacity: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_snapshot_push_opacity(this.raw.asInstanceOf[Ptr[GtkSnapshot]], opacity)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a node that repeats the child node.
    *
    * The child is recorded until the next call to [method@Gtk.Snapshot.pop].
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  def pushRepeat__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Clips an image to a rounded rectangle.
    *
    * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gsk.RoundedRect), @type -> DataRecord(const GskRoundedRect*)))"
  )
  def pushRoundedClip__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Applies a shadow to an image.
    *
    * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Gsk.Shadow), @type -> DataRecord(GskShadow)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const GskShadow*)))"
  )
  def pushShadow__ = ???

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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gsk.Path), @type -> DataRecord(GskPath*)))"
  )
  def pushStroke__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a render node for the CSS background according to @context, and
    * appends it to the current node of @snapshot, without changing the current
    * node.
    */
  def renderBackground(
      context: StyleContext /* Some(Ptr[GtkStyleContext]) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */,
      width: Double /* Some(Double) */,
      height: Double /* Some(Double) */
  ): Unit /* None */ = gtk_snapshot_render_background(
    this.raw.asInstanceOf[Ptr[GtkSnapshot]],
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
      context: StyleContext /* Some(Ptr[GtkStyleContext]) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */,
      width: Double /* Some(Double) */,
      height: Double /* Some(Double) */
  ): Unit /* None */ = gtk_snapshot_render_focus(
    this.raw.asInstanceOf[Ptr[GtkSnapshot]],
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
      context: StyleContext /* Some(Ptr[GtkStyleContext]) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */,
      width: Double /* Some(Double) */,
      height: Double /* Some(Double) */
  ): Unit /* None */ = gtk_snapshot_render_frame(
    this.raw.asInstanceOf[Ptr[GtkSnapshot]],
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
      context: StyleContext /* Some(Ptr[GtkStyleContext]) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */,
      layout: Layout /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoLayout]) */,
      index: Int /* Some(CInt) */,
      direction: Direction /* Some(_root_.sn.gnome.pango.internal.PangoDirection) */
  ): Unit /* None */ = gtk_snapshot_render_insertion_cursor(
    this.raw.asInstanceOf[Ptr[GtkSnapshot]],
    context.getUnsafeRawPointer().asInstanceOf,
    x,
    y,
    layout.getUnsafeRawPointer().asInstanceOf,
    index,
    direction.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a render node for rendering @layout according to the style
    * information in @context, and appends it to the current node of @snapshot,
    * without changing the current node.
    */
  def renderLayout(
      context: StyleContext /* Some(Ptr[GtkStyleContext]) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */,
      layout: Layout /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoLayout]) */
  ): Unit /* None */ = gtk_snapshot_render_layout(
    this.raw.asInstanceOf[Ptr[GtkSnapshot]],
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
  def restore(): Unit /* None */ = gtk_snapshot_restore(
    this.raw.asInstanceOf[Ptr[GtkSnapshot]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Rotates @@snapshot's coordinate system by @angle degrees in 2D space - or
    * in 3D speak, rotates around the Z axis. The rotation happens around the
    * origin point of (0, 0) in the @snapshot's current coordinate system.
    *
    * To rotate around axes other than the Z axis, use
    * [method@Gsk.Transform.rotate_3d].
    */
  def rotate(angle: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_snapshot_rotate(
      this.raw.asInstanceOf[Ptr[GtkSnapshot]],
      angle.asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Rotates @snapshot's coordinate system by @angle degrees around @axis.
    *
    * For a rotation in 2D space, use [method@Gsk.Transform.rotate].
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Vec3), @type -> DataRecord(const graphene_vec3_t*)))"
  )
  def rotate3d__ = ???

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
  def save(): Unit /* None */ = gtk_snapshot_save(
    this.raw.asInstanceOf[Ptr[GtkSnapshot]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scales @snapshot's coordinate system in 2-dimensional space by the given
    * factors.
    *
    * Use [method@Gtk.Snapshot.scale_3d] to scale in all 3 dimensions.
    */
  def scale(
      factor_x: Float /* Some(Float) */,
      factor_y: Float /* Some(Float) */
  ): Unit /* None */ = gtk_snapshot_scale(
    this.raw.asInstanceOf[Ptr[GtkSnapshot]],
    factor_x.asInstanceOf,
    factor_y.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scales @snapshot's coordinate system by the given factors.
    */
  def scale3d(
      factor_x: Float /* Some(Float) */,
      factor_y: Float /* Some(Float) */,
      factor_z: Float /* Some(Float) */
  ): Unit /* None */ = gtk_snapshot_scale_3d(
    this.raw.asInstanceOf[Ptr[GtkSnapshot]],
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
  def toNode(): RenderNode /* None */ = new RenderNode(
    gtk_snapshot_to_node(this.raw.asInstanceOf[Ptr[GtkSnapshot]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a paintable encapsulating the render node that was constructed by @snapshot.
    *
    * After calling this function, it is no longer possible to add more nodes to @snapshot.
    * The only function that should be called after this is
    * [method@GObject.Object.unref].
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Size), @type -> DataRecord(const graphene_size_t*)))"
  )
  def toPaintable__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Transforms @snapshot's coordinate system with the given @transform.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gsk.Transform), @type -> DataRecord(GskTransform*)))"
  )
  def transform__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Transforms @snapshot's coordinate system with the given @matrix.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Matrix), @type -> DataRecord(const graphene_matrix_t*)))"
  )
  def transformMatrix__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Translates @snapshot's coordinate system by @point in 2-dimensional space.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Point), @type -> DataRecord(const graphene_point_t*)))"
  )
  def translate__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Translates @snapshot's coordinate system by @point.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Point3D), @type -> DataRecord(const graphene_point3d_t*)))"
  )
  def translate3d__ = ???

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
