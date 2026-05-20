package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.{Paintable, RGBA, Texture}
import sn.gnome.glib.Bytes
import sn.gnome.gobject.runtime.*
import sn.gnome.graphene.{Matrix, Point, Point3D, Rect, Size, Vec3, Vec4}
import sn.gnome.gsk4.{
  BlendMode,
  FillRule,
  GLShader,
  MaskMode,
  Path,
  RenderNode,
  RoundedRect,
  ScalingFilter,
  Stroke,
  Transform
}
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
  def appendColor(
      color: sn.gnome.gdk4.RGBA /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkRGBA]) */,
      bounds: sn.gnome.graphene.Rect /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */
  ): Unit /* None */ =
    gtk_snapshot_append_color(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      color.getUnsafeRawPointer().asInstanceOf,
      bounds.getUnsafeRawPointer().asInstanceOf
    )
  end appendColor

  /** Appends a conic gradient node with the given stops to @snapshot.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method append_conic_gradient/<method parameters>/stops]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Gsk.ColorStop), @type -> DataRecord(GskColorStop)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(4), @type -> DataRecord(const GskColorStop*)))"
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
  def appendFill(
      path: sn.gnome.gsk4.Path /* Some(Ptr[_root_.sn.gnome.gsk4.internal.GskPath]) */,
      fill_rule: sn.gnome.gsk4.FillRule /* Some(_root_.sn.gnome.gsk4.internal.GskFillRule) */,
      color: sn.gnome.gdk4.RGBA /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkRGBA]) */
  ): Unit /* None */ =
    gtk_snapshot_append_fill(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      path.getUnsafeRawPointer().asInstanceOf,
      fill_rule.raw,
      color.getUnsafeRawPointer().asInstanceOf
    )
  end appendFill

  /** Appends an inset shadow into the box given by @outline.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendInsetShadow(
      outline: sn.gnome.gsk4.RoundedRect /* Some(Ptr[_root_.sn.gnome.gsk4.internal.GskRoundedRect]) */,
      color: sn.gnome.gdk4.RGBA /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkRGBA]) */,
      dx: Float /* Some(Float) */,
      dy: Float /* Some(Float) */,
      spread: Float /* Some(Float) */,
      blur_radius: Float /* Some(Float) */
  ): Unit /* None */ =
    gtk_snapshot_append_inset_shadow(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      outline.getUnsafeRawPointer().asInstanceOf,
      color.getUnsafeRawPointer().asInstanceOf,
      dx.asInstanceOf,
      dy.asInstanceOf,
      spread.asInstanceOf,
      blur_radius.asInstanceOf
    )
  end appendInsetShadow

  def appendLayout(
      layout: sn.gnome.pango.Layout /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoLayout]) */,
      color: sn.gnome.gdk4.RGBA /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkRGBA]) */
  )(using Runtime): Unit /* None */ =
    gtk_snapshot_append_layout(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      layout.getUnsafeRawPointer().asInstanceOf,
      color.getUnsafeRawPointer().asInstanceOf
    )
  end appendLayout

  /** Appends a linear gradient node with the given stops to @snapshot.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method append_linear_gradient/<method parameters>/stops]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Gsk.ColorStop), @type -> DataRecord(GskColorStop)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(4), @type -> DataRecord(const GskColorStop*)))"
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
  def appendOutsetShadow(
      outline: sn.gnome.gsk4.RoundedRect /* Some(Ptr[_root_.sn.gnome.gsk4.internal.GskRoundedRect]) */,
      color: sn.gnome.gdk4.RGBA /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkRGBA]) */,
      dx: Float /* Some(Float) */,
      dy: Float /* Some(Float) */,
      spread: Float /* Some(Float) */,
      blur_radius: Float /* Some(Float) */
  ): Unit /* None */ =
    gtk_snapshot_append_outset_shadow(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      outline.getUnsafeRawPointer().asInstanceOf,
      color.getUnsafeRawPointer().asInstanceOf,
      dx.asInstanceOf,
      dy.asInstanceOf,
      spread.asInstanceOf,
      blur_radius.asInstanceOf
    )
  end appendOutsetShadow

  /** Appends a radial gradient node with the given stops to @snapshot.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method append_radial_gradient/<method parameters>/stops]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Gsk.ColorStop), @type -> DataRecord(GskColorStop)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(7), @type -> DataRecord(const GskColorStop*)))"
  )
  private def appendRadialGradient__ = ???

  /** Appends a repeating linear gradient node with the given stops to @snapshot.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method append_repeating_linear_gradient/<method parameters>/stops]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Gsk.ColorStop), @type -> DataRecord(GskColorStop)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(4), @type -> DataRecord(const GskColorStop*)))"
  )
  private def appendRepeatingLinearGradient__ = ???

  /** Appends a repeating radial gradient node with the given stops to @snapshot.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method append_repeating_radial_gradient/<method parameters>/stops]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Gsk.ColorStop), @type -> DataRecord(GskColorStop)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(7), @type -> DataRecord(const GskColorStop*)))"
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
  def appendScaledTexture(
      texture: sn.gnome.gdk4.Texture /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkTexture]) */,
      filter: sn.gnome.gsk4.ScalingFilter /* Some(_root_.sn.gnome.gsk4.internal.GskScalingFilter) */,
      bounds: sn.gnome.graphene.Rect /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */
  )(using Runtime): Unit /* None */ =
    gtk_snapshot_append_scaled_texture(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      texture.getUnsafeRawPointer().asInstanceOf,
      filter.raw,
      bounds.getUnsafeRawPointer().asInstanceOf
    )
  end appendScaledTexture

  /** A convenience method to stroke a path with a color.
    *
    * See [method@Gtk.Snapshot.push_stroke] if you need to stroke a path with
    * more complex content than a color.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendStroke(
      path: sn.gnome.gsk4.Path /* Some(Ptr[_root_.sn.gnome.gsk4.internal.GskPath]) */,
      stroke: sn.gnome.gsk4.Stroke /* Some(Ptr[_root_.sn.gnome.gsk4.internal.GskStroke]) */,
      color: sn.gnome.gdk4.RGBA /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkRGBA]) */
  ): Unit /* None */ =
    gtk_snapshot_append_stroke(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      path.getUnsafeRawPointer().asInstanceOf,
      stroke.getUnsafeRawPointer().asInstanceOf,
      color.getUnsafeRawPointer().asInstanceOf
    )
  end appendStroke

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
  def appendTexture(
      texture: sn.gnome.gdk4.Texture /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkTexture]) */,
      bounds: sn.gnome.graphene.Rect /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */
  )(using Runtime): Unit /* None */ =
    gtk_snapshot_append_texture(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      texture.getUnsafeRawPointer().asInstanceOf,
      bounds.getUnsafeRawPointer().asInstanceOf
    )
  end appendTexture

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
  def freeToPaintable(
      size: Option[
        sn.gnome.graphene.Size /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_size_t]) */
      ]
  ): sn.gnome.gdk4.Paintable /* None */ =
    new Paintable.Abstract(
      gtk_snapshot_free_to_paintable(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
        size
          .map[Ptr[_root_.sn.gnome.graphene.internal.graphene_size_t]](o =>
            o.getUnsafeRawPointer().asInstanceOf
          )
          .getOrElse(
            null.asInstanceOf[Ptr[
              _root_.sn.gnome.graphene.internal.graphene_size_t
            ]]
          )
      ).asInstanceOf
    )
  end freeToPaintable

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
      blend_mode: sn.gnome.gsk4.BlendMode /* Some(_root_.sn.gnome.gsk4.internal.GskBlendMode) */
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
  def pushClip(
      bounds: sn.gnome.graphene.Rect /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */
  ): Unit /* None */ =
    gtk_snapshot_push_clip(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      bounds.getUnsafeRawPointer().asInstanceOf
    )
  end pushClip

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
  def pushColorMatrix(
      color_matrix: sn.gnome.graphene.Matrix /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_matrix_t]) */,
      color_offset: sn.gnome.graphene.Vec4 /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_vec4_t]) */
  ): Unit /* None */ =
    gtk_snapshot_push_color_matrix(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      color_matrix.getUnsafeRawPointer().asInstanceOf,
      color_offset.getUnsafeRawPointer().asInstanceOf
    )
  end pushColorMatrix

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
  def pushFill(
      path: sn.gnome.gsk4.Path /* Some(Ptr[_root_.sn.gnome.gsk4.internal.GskPath]) */,
      fill_rule: sn.gnome.gsk4.FillRule /* Some(_root_.sn.gnome.gsk4.internal.GskFillRule) */
  ): Unit /* None */ =
    gtk_snapshot_push_fill(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      path.getUnsafeRawPointer().asInstanceOf,
      fill_rule.raw
    )
  end pushFill

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
  def pushGlShader(
      shader: sn.gnome.gsk4.GLShader /* Some(Ptr[_root_.sn.gnome.gsk4.internal.GskGLShader]) */,
      bounds: sn.gnome.graphene.Rect /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */,
      take_args: sn.gnome.glib.Bytes /* Some(Ptr[_root_.sn.gnome.glib.internal.GBytes]) */
  )(using Runtime): Unit /* None */ =
    gtk_snapshot_push_gl_shader(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      shader.getUnsafeRawPointer().asInstanceOf,
      bounds.getUnsafeRawPointer().asInstanceOf,
      take_args.getUnsafeRawPointer().asInstanceOf
    )
  end pushGlShader

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
      mask_mode: sn.gnome.gsk4.MaskMode /* Some(_root_.sn.gnome.gsk4.internal.GskMaskMode) */
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
  def pushRepeat(
      bounds: sn.gnome.graphene.Rect /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */,
      child_bounds: Option[
        sn.gnome.graphene.Rect /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */
      ]
  ): Unit /* None */ =
    gtk_snapshot_push_repeat(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      bounds.getUnsafeRawPointer().asInstanceOf,
      child_bounds
        .map[Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[
            _root_.sn.gnome.graphene.internal.graphene_rect_t
          ]]
        )
    )
  end pushRepeat

  /** Clips an image to a rounded rectangle.
    *
    * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pushRoundedClip(
      bounds: sn.gnome.gsk4.RoundedRect /* Some(Ptr[_root_.sn.gnome.gsk4.internal.GskRoundedRect]) */
  ): Unit /* None */ =
    gtk_snapshot_push_rounded_clip(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      bounds.getUnsafeRawPointer().asInstanceOf
    )
  end pushRoundedClip

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
  def pushStroke(
      path: sn.gnome.gsk4.Path /* Some(Ptr[_root_.sn.gnome.gsk4.internal.GskPath]) */,
      stroke: sn.gnome.gsk4.Stroke /* Some(Ptr[_root_.sn.gnome.gsk4.internal.GskStroke]) */
  ): Unit /* None */ =
    gtk_snapshot_push_stroke(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      path.getUnsafeRawPointer().asInstanceOf,
      stroke.getUnsafeRawPointer().asInstanceOf
    )
  end pushStroke

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
      direction: sn.gnome.pango.Direction /* Some(_root_.sn.gnome.pango.internal.PangoDirection) */
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
  def rotate3d(
      angle: Float /* Some(Float) */,
      axis: sn.gnome.graphene.Vec3 /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_vec3_t]) */
  ): Unit /* None */ =
    gtk_snapshot_rotate_3d(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      angle.asInstanceOf,
      axis.getUnsafeRawPointer().asInstanceOf
    )
  end rotate3d

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
  def toPaintable(
      size: Option[
        sn.gnome.graphene.Size /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_size_t]) */
      ]
  ): sn.gnome.gdk4.Paintable /* None */ =
    new Paintable.Abstract(
      gtk_snapshot_to_paintable(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
        size
          .map[Ptr[_root_.sn.gnome.graphene.internal.graphene_size_t]](o =>
            o.getUnsafeRawPointer().asInstanceOf
          )
          .getOrElse(
            null.asInstanceOf[Ptr[
              _root_.sn.gnome.graphene.internal.graphene_size_t
            ]]
          )
      ).asInstanceOf
    )
  end toPaintable

  /** Transforms @snapshot's coordinate system with the given @transform.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def transform(
      transform: Option[
        sn.gnome.gsk4.Transform /* Some(Ptr[_root_.sn.gnome.gsk4.internal.GskTransform]) */
      ]
  ): Unit /* None */ =
    gtk_snapshot_transform(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      transform
        .map[Ptr[_root_.sn.gnome.gsk4.internal.GskTransform]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gsk4.internal.GskTransform]]
        )
    )
  end transform

  /** Transforms @snapshot's coordinate system with the given @matrix.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def transformMatrix(
      matrix: sn.gnome.graphene.Matrix /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_matrix_t]) */
  ): Unit /* None */ =
    gtk_snapshot_transform_matrix(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      matrix.getUnsafeRawPointer().asInstanceOf
    )
  end transformMatrix

  /** Translates @snapshot's coordinate system by @point in 2-dimensional space.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def translate(
      point: sn.gnome.graphene.Point /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_point_t]) */
  ): Unit /* None */ =
    gtk_snapshot_translate(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      point.getUnsafeRawPointer().asInstanceOf
    )
  end translate

  /** Translates @snapshot's coordinate system by @point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def translate3d(
      point: sn.gnome.graphene.Point3D /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_point3d_t]) */
  ): Unit /* None */ =
    gtk_snapshot_translate_3d(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSnapshot]],
      point.getUnsafeRawPointer().asInstanceOf
    )
  end translate3d

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
