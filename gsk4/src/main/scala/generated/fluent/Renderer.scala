package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Surface
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gsk4.internal.GskRenderer

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GskRenderer` is a class that renders a scene graph defined via a tree of
  * [class@Gsk.RenderNode] instances.
  *
  * Typically you will use a `GskRenderer` instance to repeatedly call
  * [method@Gsk.Renderer.render] to update the contents of its associated
  * [class@Gdk.Surface].
  *
  * It is necessary to realize a `GskRenderer` instance using
  * [method@Gsk.Renderer.realize] before calling [method@Gsk.Renderer.render],
  * in order to create the appropriate windowing system resources needed to
  * render the scene.
  */
class Renderer(raw: Ptr[GskRenderer]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the `GdkSurface` set using gsk_enderer_realize().
    *
    * If the renderer has not been realized yet, %NULL will be returned.
    */
  def getSurface(): Surface /* None */ = new Surface(
    gsk_renderer_get_surface(
      this.raw.asInstanceOf[Ptr[GskRenderer]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the @renderer is realized or not.
    */
  def isRealized(): Boolean /* None */ = gsk_renderer_is_realized(
    this.raw.asInstanceOf[Ptr[GskRenderer]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates the resources needed by the @renderer to render the scene graph.
    *
    * Since GTK 4.6, the surface may be `NULL`, which allows using renderers
    * without having to create a surface.
    *
    * Note that it is mandatory to call [method@Gsk.Renderer.unrealize] before
    * destroying the renderer.
    */
  def realize(
      surface: Option[
        Surface /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkSurface]) */
      ]
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    gsk_renderer_realize(
      this.raw.asInstanceOf[Ptr[GskRenderer]],
      surface
        .map[Ptr[_root_.sn.gnome.gdk4.internal.GdkSurface]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gdk4.internal.GdkSurface]]
        ),
      __errorPtr
    ).value.!=(0)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Renders the scene graph, described by a tree of `GskRenderNode` instances
    * to the renderer's surface, ensuring that the given @region gets redrawn.
    *
    * If the renderer has no associated surface, this function does nothing.
    *
    * Renderers must ensure that changes of the contents given by the @root node
    * as well as the area given by @region are redrawn. They are however free to
    * not redraw any pixel outside of @region if they can guarantee that it
    * didn't change.
    *
    * The @renderer will acquire a reference on the `GskRenderNode` tree while
    * the rendering is in progress.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Region), @type -> DataRecord(const cairo_region_t*)))"
  )
  def render__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Renders the scene graph, described by a tree of `GskRenderNode` instances,
    * to a `GdkTexture`.
    *
    * The @renderer will acquire a reference on the `GskRenderNode` tree while
    * the rendering is in progress.
    *
    * If you want to apply any transformations to @root, you should put it into
    * a transform node and pass that node instead.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  def renderTexture__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Releases all the resources created by gsk_renderer_realize().
    */
  def unrealize(): Unit /* None */ = gsk_renderer_unrealize(
    this.raw.asInstanceOf[Ptr[GskRenderer]]
  )

end Renderer

object Renderer:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates an appropriate `GskRenderer` instance for the given @surface.
    *
    * If the `GSK_RENDERER` environment variable is set, GSK will try that
    * renderer first, before trying the backend-specific default. The ultimate
    * fallback is the cairo renderer.
    *
    * The renderer will be realized before it is returned.
    */
  def forSurface(
      surface: Surface /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkSurface]) */
  ): Renderer = new Renderer(
    gsk_renderer_new_for_surface(
      surface.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end Renderer
