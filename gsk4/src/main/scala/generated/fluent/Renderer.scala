package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.Surface
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.internal.GskRenderer

/** `GskRenderer` is a class that renders a scene graph defined via a tree of
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Renderer private[gnome] (raw: Ptr[GskRenderer])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the `GdkSurface` set using gsk_enderer_realize().
    *
    * If the renderer has not been realized yet, %NULL will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSurface()(using Runtime): sn.gnome.gdk4.Surface /* None */ =
    sn.gnome.gdk4.Surface.applyUnsafe(
      gsk_renderer_get_surface(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderer]]
      ).asInstanceOf
    )
  end getSurface

  /** Checks whether the @renderer is realized or not.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isRealized(): Boolean /* None */ =
    gsk_renderer_is_realized(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderer]]
    ).value.!=(0)
  end isRealized

  /** Creates the resources needed by the @renderer to render the scene graph.
    *
    * Since GTK 4.6, the surface may be `NULL`, which allows using renderers
    * without having to create a surface.
    *
    * Note that it is mandatory to call [method@Gsk.Renderer.unrealize] before
    * destroying the renderer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def realize(
      surface: Option[
        sn.gnome.gdk4.Surface /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkSurface]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      gsk_renderer_realize(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderer]],
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
  end realize

  /** Renders the scene graph, described by a tree of `GskRenderNode` instances
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method render/<method parameters>/region]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(cairo.Region), @type -> DataRecord(const cairo_region_t*)))"
  )
  private def render__ = ???

  /** Renders the scene graph, described by a tree of `GskRenderNode` instances,
    * to a `GdkTexture`.
    *
    * The @renderer will acquire a reference on the `GskRenderNode` tree while
    * the rendering is in progress.
    *
    * If you want to apply any transformations to @root, you should put it into
    * a transform node and pass that node instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method render_texture/<method parameters>/viewport]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  private def renderTexture__ = ???

  /** Releases all the resources created by gsk_renderer_realize().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unrealize(): Unit /* None */ =
    gsk_renderer_unrealize(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderer]]
    )
  end unrealize

end Renderer

object Renderer:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskRenderer])(using Runtime) = summon[Runtime]
    .getOrCreate[Renderer](ptr.asInstanceOf[Ptr[Byte]], p => new Renderer(ptr))

  /** Creates an appropriate `GskRenderer` instance for the given @surface.
    *
    * If the `GSK_RENDERER` environment variable is set, GSK will try that
    * renderer first, before trying the backend-specific default. The ultimate
    * fallback is the cairo renderer.
    *
    * The renderer will be realized before it is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forSurface(
      surface: sn.gnome.gdk4.Surface /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkSurface]) */
  )(using Runtime): Renderer =
    val raw: Ptr[Byte] = gsk_renderer_new_for_surface(
      surface.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Renderer](raw, r => Renderer.applyUnsafe(r.asInstanceOf))
  end forSurface
end Renderer
