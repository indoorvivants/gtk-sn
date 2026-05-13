package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.{BlendMode, MaskMode, RenderNode}
import sn.gnome.gtk4.StyleContext
import sn.gnome.gtk4.internal.GtkSnapshot
import sn.gnome.pango.{Direction, Layout}
import sn.gnome.gdk4.Snapshot as _Snapshot

/** `GtkSnapshot` assists in creating [class@Gsk.RenderNode]s for widgets.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Snapshot private[gnome] (raw: Ptr[GtkSnapshot])
    extends _Snapshot(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Appends a stroked border rectangle inside the given @outline.
    *
    * The four sides of the border can have different widths and colors.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method append_border]: Method append_border is weird: non NULL-terminated arrays require special handling"
  )
  private def appendBorder__ = ???

  /** Creates a new [class@Gsk.CairoNode] and appends it to the current render
    * node of @snapshot, without changing the current node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method append_cairo]: Method append_cairo is weird: non NULL-terminated arrays require special handling"
  )
  private def appendCairo__ = ???

  /** Creates a new render node drawing the @color into the given @bounds and
    * appends it to the current render node of @snapshot.
    *
    * You should try to avoid calling this function if
    * @color
    *   is transparent.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method append_color/<method parameters>/color]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))"
  )
  private def appendColor__ = ???

  /** Appends a conic gradient node with the given stops to @snapshot.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method append_conic_gradient/<method parameters>/bounds]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  private def appendConicGradient__ = ???

  /** A convenience method to fill a path with a color.
    *
    * See [method@Gtk.Snapshot.push_fill] if you need to fill a path with more
    * complex content than a color.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method append_fill/<method parameters>/path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gsk.Path), @type -> DataRecord(GskPath*)))"
  )
  private def appendFill__ = ???

  /** Appends an inset shadow into the box given by @outline.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method append_inset_shadow/<method parameters>/outline]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gsk.RoundedRect), @type -> DataRecord(const GskRoundedRect*)))"
  )
  private def appendInsetShadow__ = ???

  @annotation.compileTimeOnly(
    "[method append_layout/<method parameters>/color]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))"
  )
  private def appendLayout__ = ???

  /** Appends a linear gradient node with the given stops to @snapshot.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method append_linear_gradient/<method parameters>/bounds]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  private def appendLinearGradient__ = ???

  /** Appends @node to the current render node of @snapshot, without changing
    * the current node.
    *
    * If @snapshot does not have a current node yet, @node will become the
    * initial node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendNode(
      node: sn.gnome.gsk4.RenderNode /* Some(Ptr[_root_.sn.gnome.gsk4.internal.GskRenderNode]) */
  )(using Runtime): Unit /* None */ =
    gtk_snapshot_append_node(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      node.getUnsafeRawPointer().asInstanceOf
    )
  end appendNode

  /** Appends an outset shadow node around the box given by @outline.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method append_outset_shadow/<method parameters>/outline]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gsk.RoundedRect), @type -> DataRecord(const GskRoundedRect*)))"
  )
  private def appendOutsetShadow__ = ???

  /** Appends a radial gradient node with the given stops to @snapshot.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method append_radial_gradient/<method parameters>/bounds]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  private def appendRadialGradient__ = ???

  /** Appends a repeating linear gradient node with the given stops to @snapshot.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method append_repeating_linear_gradient/<method parameters>/bounds]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  private def appendRepeatingLinearGradient__ = ???

  /** Appends a repeating radial gradient node with the given stops to @snapshot.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method append_repeating_radial_gradient/<method parameters>/bounds]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  private def appendRepeatingRadialGradient__ = ???

  /** Creates a new render node drawing the @texture into the given @bounds and
    * appends it to the current render node of @snapshot.
    *
    * In contrast to [method@Gtk.Snapshot.append_texture], this function
    * provides control about how the filter that is used when scaling.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method append_scaled_texture/<method parameters>/bounds]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  private def appendScaledTexture__ = ???

  /** A convenience method to stroke a path with a color.
    *
    * See [method@Gtk.Snapshot.push_stroke] if you need to stroke a path with
    * more complex content than a color.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method append_stroke/<method parameters>/path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gsk.Path), @type -> DataRecord(GskPath*)))"
  )
  private def appendStroke__ = ???

  /** Creates a new render node drawing the @texture into the given @bounds and
    * appends it to the current render node of @snapshot.
    *
    * If the texture needs to be scaled to fill @bounds, linear filtering is
    * used. See [method@Gtk.Snapshot.append_scaled_texture] if you need other
    * filtering, such as nearest-neighbour.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method append_texture/<method parameters>/bounds]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  private def appendTexture__ = ???

  /** Returns the node that was constructed by @snapshot and frees @snapshot.
    *
    * See also [method@Gtk.Snapshot.to_node].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def freeToNode()(using Runtime): sn.gnome.gsk4.RenderNode /* None */ =
    sn.gnome.gsk4.RenderNode.applyUnsafe(
      gtk_snapshot_free_to_node(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]]
      ).asInstanceOf
    )
  end freeToNode

  /** Returns a paintable for the node that was constructed by @snapshot and
    * frees @snapshot.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method free_to_paintable/<method parameters>/size]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Size), @type -> DataRecord(const graphene_size_t*)))"
  )
  private def freeToPaintable__ = ???

  /** Removes the top element from the stack of render nodes and adds it to the
    * nearest [class@Gsk.GLShaderNode] below it.
    *
    * This must be called the same number of times as the number of textures is
    * needed for the shader in [method@Gtk.Snapshot.push_gl_shader].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def glShaderPopTexture(): Unit /* None */ =
    gtk_snapshot_gl_shader_pop_texture(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]]
    )
  end glShaderPopTexture

  /** Applies a perspective projection transform.
    *
    * See [method@Gsk.Transform.perspective] for a discussion on the details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def perspective(depth: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_snapshot_perspective(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      depth.asInstanceOf
    )
  end perspective

  /** Removes the top element from the stack of render nodes, and appends it to
    * the node underneath it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pop(): Unit /* None */ =
    gtk_snapshot_pop(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]])
  end pop

  /** Blends together two images with the given blend mode.
    *
    * Until the first call to [method@Gtk.Snapshot.pop], the bottom image for
    * the blend operation will be recorded. After that call, the top image to be
    * blended will be recorded until the second call to
    * [method@Gtk.Snapshot.pop].
    *
    * Calling this function requires two subsequent calls to
    * [method@Gtk.Snapshot.pop].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pushBlend(
      blend_mode: BlendMode /* Some(_root_.sn.gnome.gsk4.internal.GskBlendMode) */
  ): Unit /* None */ =
    gtk_snapshot_push_blend(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      blend_mode.raw
    )
  end pushBlend

  /** Blurs an image.
    *
    * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pushBlur(radius: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_snapshot_push_blur(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      radius
    )
  end pushBlur

  /** Clips an image to a rectangle.
    *
    * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method push_clip/<method parameters>/bounds]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  private def pushClip__ = ???

  /** Modifies the colors of an image by applying an affine transformation in
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method push_color_matrix/<method parameters>/color_matrix]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Matrix), @type -> DataRecord(const graphene_matrix_t*)))"
  )
  private def pushColorMatrix__ = ???

  /** Snapshots a cross-fade operation between two images with the given @progress.
    *
    * Until the first call to [method@Gtk.Snapshot.pop], the start image will be
    * snapshot. After that call, the end image will be recorded until the second
    * call to [method@Gtk.Snapshot.pop].
    *
    * Calling this function requires two subsequent calls to
    * [method@Gtk.Snapshot.pop].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pushCrossFade(progress: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_snapshot_push_cross_fade(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      progress
    )
  end pushCrossFade

  /** Inserts a debug node with a message.
    *
    * Debug nodes don't affect the rendering at all, but can be helpful in
    * identifying parts of a render node tree dump, for example in the GTK
    * inspector.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method push_debug/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def pushDebug__ = ???

  /** Fills the area given by @path and @fill_rule with an image and discards
    * everything outside of it.
    *
    * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
    *
    * If you want to fill the path with a color,
    * [method@Gtk.Snapshot.append_fill] may be more convenient.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method push_fill/<method parameters>/path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gsk.Path), @type -> DataRecord(GskPath*)))"
  )
  private def pushFill__ = ???

  /** Push a [class@Gsk.GLShaderNode].
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method push_gl_shader/<method parameters>/bounds]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  private def pushGlShader__ = ???

  /** Until the first call to [method@Gtk.Snapshot.pop], the mask image for the
    * mask operation will be recorded.
    *
    * After that call, the source image will be recorded until the second call
    * to [method@Gtk.Snapshot.pop].
    *
    * Calling this function requires 2 subsequent calls to gtk_snapshot_pop().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pushMask(
      mask_mode: MaskMode /* Some(_root_.sn.gnome.gsk4.internal.GskMaskMode) */
  ): Unit /* None */ =
    gtk_snapshot_push_mask(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      mask_mode.raw
    )
  end pushMask

  /** Modifies the opacity of an image.
    *
    * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pushOpacity(opacity: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_snapshot_push_opacity(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      opacity
    )
  end pushOpacity

  /** Creates a node that repeats the child node.
    *
    * The child is recorded until the next call to [method@Gtk.Snapshot.pop].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method push_repeat/<method parameters>/bounds]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  private def pushRepeat__ = ???

  /** Clips an image to a rounded rectangle.
    *
    * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method push_rounded_clip/<method parameters>/bounds]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gsk.RoundedRect), @type -> DataRecord(const GskRoundedRect*)))"
  )
  private def pushRoundedClip__ = ???

  /** Applies a shadow to an image.
    *
    * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method push_shadow/<method parameters>/shadow]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Gsk.Shadow), @type -> DataRecord(GskShadow)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const GskShadow*)))"
  )
  private def pushShadow__ = ???

  /** Strokes the given @path with the attributes given by @stroke and an image.
    *
    * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
    *
    * Note that the strokes are subject to the same transformation as everything
    * else, so uneven scaling will cause horizontal and vertical strokes to have
    * different widths.
    *
    * If you want to stroke the path with a color,
    * [method@Gtk.Snapshot.append_stroke] may be more convenient.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method push_stroke/<method parameters>/path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gsk.Path), @type -> DataRecord(GskPath*)))"
  )
  private def pushStroke__ = ???

  /** Creates a render node for the CSS background according to @context, and
    * appends it to the current node of @snapshot, without changing the current
    * node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def renderBackground(
      context: sn.gnome.gtk4.StyleContext /* Some(Ptr[GtkStyleContext]) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */,
      width: Double /* Some(Double) */,
      height: Double /* Some(Double) */
  )(using Runtime): Unit /* None */ =
    gtk_snapshot_render_background(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      context.getUnsafeRawPointer().asInstanceOf,
      x,
      y,
      width,
      height
    )
  end renderBackground

  /** Creates a render node for the focus outline according to @context, and
    * appends it to the current node of @snapshot, without changing the current
    * node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def renderFocus(
      context: sn.gnome.gtk4.StyleContext /* Some(Ptr[GtkStyleContext]) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */,
      width: Double /* Some(Double) */,
      height: Double /* Some(Double) */
  )(using Runtime): Unit /* None */ =
    gtk_snapshot_render_focus(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      context.getUnsafeRawPointer().asInstanceOf,
      x,
      y,
      width,
      height
    )
  end renderFocus

  /** Creates a render node for the CSS border according to @context, and
    * appends it to the current node of @snapshot, without changing the current
    * node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def renderFrame(
      context: sn.gnome.gtk4.StyleContext /* Some(Ptr[GtkStyleContext]) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */,
      width: Double /* Some(Double) */,
      height: Double /* Some(Double) */
  )(using Runtime): Unit /* None */ =
    gtk_snapshot_render_frame(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      context.getUnsafeRawPointer().asInstanceOf,
      x,
      y,
      width,
      height
    )
  end renderFrame

  /** Draws a text caret using @snapshot at the specified index of @layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def renderInsertionCursor(
      context: sn.gnome.gtk4.StyleContext /* Some(Ptr[GtkStyleContext]) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */,
      layout: sn.gnome.pango.Layout /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoLayout]) */,
      index: Int /* Some(CInt) */,
      direction: Direction /* Some(_root_.sn.gnome.pango.internal.PangoDirection) */
  )(using Runtime): Unit /* None */ =
    gtk_snapshot_render_insertion_cursor(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      context.getUnsafeRawPointer().asInstanceOf,
      x,
      y,
      layout.getUnsafeRawPointer().asInstanceOf,
      index,
      direction.raw
    )
  end renderInsertionCursor

  /** Creates a render node for rendering @layout according to the style
    * information in @context, and appends it to the current node of @snapshot,
    * without changing the current node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def renderLayout(
      context: sn.gnome.gtk4.StyleContext /* Some(Ptr[GtkStyleContext]) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */,
      layout: sn.gnome.pango.Layout /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoLayout]) */
  )(using Runtime): Unit /* None */ =
    gtk_snapshot_render_layout(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      context.getUnsafeRawPointer().asInstanceOf,
      x,
      y,
      layout.getUnsafeRawPointer().asInstanceOf
    )
  end renderLayout

  /** Restores @snapshot to the state saved by a preceding call to
    * [method@Snapshot.save] and removes that state from the stack of saved
    * states.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def restore(): Unit /* None */ =
    gtk_snapshot_restore(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]]
    )
  end restore

  /** Rotates @@snapshot's coordinate system by @angle degrees in 2D space - or
    * in 3D speak, rotates around the Z axis. The rotation happens around the
    * origin point of (0, 0) in the @snapshot's current coordinate system.
    *
    * To rotate around axes other than the Z axis, use
    * [method@Gsk.Transform.rotate_3d].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def rotate(angle: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_snapshot_rotate(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      angle.asInstanceOf
    )
  end rotate

  /** Rotates @snapshot's coordinate system by @angle degrees around @axis.
    *
    * For a rotation in 2D space, use [method@Gsk.Transform.rotate].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method rotate_3d/<method parameters>/axis]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Vec3), @type -> DataRecord(const graphene_vec3_t*)))"
  )
  private def rotate3d__ = ???

  /** Makes a copy of the current state of @snapshot and saves it on an internal
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def save(): Unit /* None */ =
    gtk_snapshot_save(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]])
  end save

  /** Scales @snapshot's coordinate system in 2-dimensional space by the given
    * factors.
    *
    * Use [method@Gtk.Snapshot.scale_3d] to scale in all 3 dimensions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scale(
      factor_x: Float /* Some(Float) */,
      factor_y: Float /* Some(Float) */
  ): Unit /* None */ =
    gtk_snapshot_scale(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      factor_x.asInstanceOf,
      factor_y.asInstanceOf
    )
  end scale

  /** Scales @snapshot's coordinate system by the given factors.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scale3d(
      factor_x: Float /* Some(Float) */,
      factor_y: Float /* Some(Float) */,
      factor_z: Float /* Some(Float) */
  ): Unit /* None */ =
    gtk_snapshot_scale_3d(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      factor_x.asInstanceOf,
      factor_y.asInstanceOf,
      factor_z.asInstanceOf
    )
  end scale3d

  /** Returns the render node that was constructed by @snapshot.
    *
    * Note that this function may return %NULL if nothing has been added to the
    * snapshot or if its content does not produce pixels to be rendered.
    *
    * After calling this function, it is no longer possible to add more nodes to @snapshot.
    * The only function that should be called after this is
    * [method@GObject.Object.unref].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toNode()(using Runtime): sn.gnome.gsk4.RenderNode /* None */ =
    sn.gnome.gsk4.RenderNode.applyUnsafe(
      gtk_snapshot_to_node(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]]
      ).asInstanceOf
    )
  end toNode

  /** Returns a paintable encapsulating the render node that was constructed by @snapshot.
    *
    * After calling this function, it is no longer possible to add more nodes to @snapshot.
    * The only function that should be called after this is
    * [method@GObject.Object.unref].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method to_paintable/<method parameters>/size]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Size), @type -> DataRecord(const graphene_size_t*)))"
  )
  private def toPaintable__ = ???

  /** Transforms @snapshot's coordinate system with the given @transform.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method transform/<method parameters>/transform]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gsk.Transform), @type -> DataRecord(GskTransform*)))"
  )
  private def transform__ = ???

  /** Transforms @snapshot's coordinate system with the given @matrix.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method transform_matrix/<method parameters>/matrix]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Matrix), @type -> DataRecord(const graphene_matrix_t*)))"
  )
  private def transformMatrix__ = ???

  /** Translates @snapshot's coordinate system by @point in 2-dimensional space.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method translate/<method parameters>/point]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Point), @type -> DataRecord(const graphene_point_t*)))"
  )
  private def translate__ = ???

  /** Translates @snapshot's coordinate system by @point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method translate_3d/<method parameters>/point]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Point3D), @type -> DataRecord(const graphene_point3d_t*)))"
  )
  private def translate3d__ = ???

end Snapshot

object Snapshot:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkSnapshot])(using Runtime) = summon[Runtime]
    .getOrCreate[Snapshot](ptr.asInstanceOf[Ptr[Byte]], p => new Snapshot(ptr))

  /** Creates a new `GtkSnapshot`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): Snapshot =
    val raw: Ptr[Byte] = gtk_snapshot_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[Snapshot](raw, r => Snapshot.applyUnsafe(r.asInstanceOf))
  end apply
end Snapshot
