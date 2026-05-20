package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.Path
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.graphene.{Point, Rect}
import sn.gnome.gsk4.{Path, PathBuilder, PathPoint, RoundedRect}
import sn.gnome.gsk4.internal.GskPathBuilder
import sn.gnome.pango.Layout

/**  `GskPathBuilder` is an auxiliary object for constructing
  *  `GskPath` objects.
  *
  *  A path is constructed like this:
  *
  *  |[<!-- language="C" -->
  *  GskPath *
  *  construct_path (void)
  *  {
  *    GskPathBuilder *builder;
  *
  *    builder = gsk_path_builder_new ();
  *
  *    // add contours to the path here
  *
  *    return gsk_path_builder_free_to_path (builder);
  *  ]|
  *
  *  Adding contours to the path can be done in two ways.
  *  The easiest option is to use the `gsk_path_builder_add_*` group
  *  of functions that add predefined contours to the current path,
  *  either common shapes like [method@Gsk.PathBuilder.add_circle]
  *  or by adding from other paths like [method@Gsk.PathBuilder.add_path].
  *
  *  The `gsk_path_builder_add_*` methods always add complete contours,
  *  and do not use or modify the current point.
  *
  *  The other option is to define each line and curve manually with
  *  the `gsk_path_builder_*_to` group of functions. You start with
  *  a call to [method@Gsk.PathBuilder.move_to] to set the starting point
  *  and then use multiple calls to any of the drawing functions to
  *  move the pen along the plane. Once you are done, you can call
  *  [method@Gsk.PathBuilder.close] to close the path by connecting it
  *  back with a line to the starting point.
  *
  *  This is similar to how paths are drawn in Cairo.
  *
  *  Note that `GskPathBuilder` will reduce the degree of added Bézier
  *  curves as much as possible, to simplify rendering.
  *
  *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
  */
class PathBuilder private[gnome] (raw: Ptr[GskPathBuilder]):

  def getUnsafeRawPointer(): Ptr[GskPathBuilder] = this.raw

  /** Adds a Cairo path to the builder.
    *
    * You can use cairo_copy_path() to access the path from a Cairo context.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addCairoPath(
      path: sn.gnome.cairo.Path /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_path_t]) */
  ): Unit /* None */ =
    gsk_path_builder_add_cairo_path(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      path.getUnsafeRawPointer().asInstanceOf
    )
  end addCairoPath

  /** Adds a circle with the @center and @radius.
    *
    * The path is going around the circle in clockwise direction.
    *
    * If @radius is zero, the contour will be a closed point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addCircle(
      center: sn.gnome.graphene.Point /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_point_t]) */,
      radius: Float /* Some(Float) */
  ): Unit /* None */ =
    gsk_path_builder_add_circle(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      center.getUnsafeRawPointer().asInstanceOf,
      radius.asInstanceOf
    )
  end addCircle

  /** Adds the outlines for the glyphs in @layout to the builder.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addLayout(
      layout: sn.gnome.pango.Layout /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoLayout]) */
  )(using Runtime): Unit /* None */ =
    gsk_path_builder_add_layout(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      layout.getUnsafeRawPointer().asInstanceOf
    )
  end addLayout

  /** Appends all of @path to the builder.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addPath(
      path: sn.gnome.gsk4.Path /* Some(Ptr[GskPath]) */
  ): Unit /* None */ =
    gsk_path_builder_add_path(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      path.getUnsafeRawPointer().asInstanceOf
    )
  end addPath

  /** Adds @rect as a new contour to the path built by the builder.
    *
    * The path is going around the rectangle in clockwise direction.
    *
    * If the the width or height are 0, the path will be a closed horizontal or
    * vertical line. If both are 0, it'll be a closed dot.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addRect(
      rect: sn.gnome.graphene.Rect /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_rect_t]) */
  ): Unit /* None */ =
    gsk_path_builder_add_rect(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      rect.getUnsafeRawPointer().asInstanceOf
    )
  end addRect

  /** Appends all of @path to the builder, in reverse order.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addReversePath(
      path: sn.gnome.gsk4.Path /* Some(Ptr[GskPath]) */
  ): Unit /* None */ =
    gsk_path_builder_add_reverse_path(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      path.getUnsafeRawPointer().asInstanceOf
    )
  end addReversePath

  /** Adds @rect as a new contour to the path built in @self.
    *
    * The path is going around the rectangle in clockwise direction.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addRoundedRect(
      rect: sn.gnome.gsk4.RoundedRect /* Some(Ptr[GskRoundedRect]) */
  ): Unit /* None */ =
    gsk_path_builder_add_rounded_rect(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      rect.getUnsafeRawPointer().asInstanceOf
    )
  end addRoundedRect

  /** Adds to @self the segment of @path from @start to @end.
    *
    * If @start is equal to or after @end, the path will first add the segment
    * from @start to the end of the path, and then add the segment from the
    * beginning to @end. If the path is closed, these segments will be
    * connected.
    *
    * Note that this method always adds a path with the given start point and
    * end point. To add a closed path, use [method@Gsk.PathBuilder.add_path].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addSegment(
      path: sn.gnome.gsk4.Path /* Some(Ptr[GskPath]) */,
      start: sn.gnome.gsk4.PathPoint /* Some(Ptr[GskPathPoint]) */,
      end: sn.gnome.gsk4.PathPoint /* Some(Ptr[GskPathPoint]) */
  ): Unit /* None */ =
    gsk_path_builder_add_segment(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      path.getUnsafeRawPointer().asInstanceOf,
      start.getUnsafeRawPointer().asInstanceOf,
      end.getUnsafeRawPointer().asInstanceOf
    )
  end addSegment

  /** Adds an elliptical arc from the current point to @x3, @y3 with @x1, @y1
    * determining the tangent directions.
    *
    * After this, @x3, @y3 will be the new current point.
    *
    * Note: Two points and their tangents do not determine a unique ellipse, so
    * GSK just picks one. If you need more precise control, use
    * [method@Gsk.PathBuilder.conic_to] or [method@Gsk.PathBuilder.svg_arc_to].
    *
    * <picture> <source srcset="arc-dark.png" media="(prefers-color-scheme:
    * dark)"> <img alt="Arc To" src="arc-light.png"> </picture>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def arcTo(
      x1: Float /* Some(Float) */,
      y1: Float /* Some(Float) */,
      x2: Float /* Some(Float) */,
      y2: Float /* Some(Float) */
  ): Unit /* None */ =
    gsk_path_builder_arc_to(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      x1.asInstanceOf,
      y1.asInstanceOf,
      x2.asInstanceOf,
      y2.asInstanceOf
    )
  end arcTo

  /** Ends the current contour with a line back to the start point.
    *
    * Note that this is different from calling [method@Gsk.PathBuilder.line_to]
    * with the start point in that the contour will be closed. A closed contour
    * behaves differently from an open one. When stroking, its start and end
    * point are considered connected, so they will be joined via the line join,
    * and not ended with line caps.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def close(): Unit /* None */ =
    gsk_path_builder_close(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]]
    )
  end close

  /** Adds a [conic
    * curve](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) from
    * the current point to @x2, @y2 with the given @weight and @x1, @y1 as the
    * control point.
    *
    * The weight determines how strongly the curve is pulled towards the control
    * point. A conic with weight 1 is identical to a quadratic Bézier curve with
    * the same points.
    *
    * Conic curves can be used to draw ellipses and circles. They are also known
    * as rational quadratic Bézier curves.
    *
    * After this, @x2, @y2 will be the new current point.
    *
    * <picture> <source srcset="conic-dark.png" media="(prefers-color-scheme:
    * dark)"> <img alt="Conic To" src="conic-light.png"> </picture>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def conicTo(
      x1: Float /* Some(Float) */,
      y1: Float /* Some(Float) */,
      x2: Float /* Some(Float) */,
      y2: Float /* Some(Float) */,
      weight: Float /* Some(Float) */
  ): Unit /* None */ =
    gsk_path_builder_conic_to(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      x1.asInstanceOf,
      y1.asInstanceOf,
      x2.asInstanceOf,
      y2.asInstanceOf,
      weight.asInstanceOf
    )
  end conicTo

  /** Adds a [cubic Bézier
    * curve](https://en.wikipedia.org/wiki/B%C3%A9zier_curve) from the current
    * point to @x3, @y3 with @x1, @y1 and @x2, @y2 as the control points.
    *
    * After this, @x3, @y3 will be the new current point.
    *
    * <picture> <source srcset="cubic-dark.png" media="(prefers-color-scheme:
    * dark)"> <img alt="Cubic To" src="cubic-light.png"> </picture>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def cubicTo(
      x1: Float /* Some(Float) */,
      y1: Float /* Some(Float) */,
      x2: Float /* Some(Float) */,
      y2: Float /* Some(Float) */,
      x3: Float /* Some(Float) */,
      y3: Float /* Some(Float) */
  ): Unit /* None */ =
    gsk_path_builder_cubic_to(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      x1.asInstanceOf,
      y1.asInstanceOf,
      x2.asInstanceOf,
      y2.asInstanceOf,
      x3.asInstanceOf,
      y3.asInstanceOf
    )
  end cubicTo

  /** Creates a new `GskPath` from the current state of the given builder, and
    * unrefs the @builder instance.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def freeToPath(): sn.gnome.gsk4.Path /* None */ =
    sn.gnome.gsk4.Path.fromRaw(
      gsk_path_builder_free_to_path(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]]
      )
    )
  end freeToPath

  /** Gets the current point.
    *
    * The current point is used for relative drawing commands and updated after
    * every operation.
    *
    * When the builder is created, the default current point is set to `0, 0`.
    * Note that this is different from cairo, which starts out without a current
    * point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCurrentPoint(): sn.gnome.graphene.Point /* None */ =
    sn.gnome.graphene.Point.fromRaw(
      gsk_path_builder_get_current_point(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]]
      )
    )
  end getCurrentPoint

  /**  Implements arc-to according to the HTML Canvas spec.
    *
    *  A convenience function that implements the
    *  [HTML arc_to](https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-arcto-dev)
    *  functionality.
    *
    *  After this, the current point will be the point where
    *  the circle with the given radius touches the line from
    *  @x1, @y1 to @x2, @y2.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def htmlArcTo(
      x1: Float /* Some(Float) */,
      y1: Float /* Some(Float) */,
      x2: Float /* Some(Float) */,
      y2: Float /* Some(Float) */,
      radius: Float /* Some(Float) */
  ): Unit /* None */ =
    gsk_path_builder_html_arc_to(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      x1.asInstanceOf,
      y1.asInstanceOf,
      x2.asInstanceOf,
      y2.asInstanceOf,
      radius.asInstanceOf
    )
  end htmlArcTo

  /** Draws a line from the current point to @x, @y and makes it the new current
    * point.
    *
    * <picture> <source srcset="line-dark.png" media="(prefers-color-scheme:
    * dark)"> <img alt="Line To" src="line-light.png"> </picture>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lineTo(
      x: Float /* Some(Float) */,
      y: Float /* Some(Float) */
  ): Unit /* None */ =
    gsk_path_builder_line_to(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      x.asInstanceOf,
      y.asInstanceOf
    )
  end lineTo

  /** Starts a new contour by placing the pen at @x, @y.
    *
    * If this function is called twice in succession, the first call will result
    * in a contour made up of a single point. The second call will start a new
    * contour.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def moveTo(
      x: Float /* Some(Float) */,
      y: Float /* Some(Float) */
  ): Unit /* None */ =
    gsk_path_builder_move_to(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      x.asInstanceOf,
      y.asInstanceOf
    )
  end moveTo

  /** Adds a [quadratic Bézier
    * curve](https://en.wikipedia.org/wiki/B%C3%A9zier_curve) from the current
    * point to @x2, @y2 with @x1, @y1 as the control point.
    *
    * After this, @x2, @y2 will be the new current point.
    *
    * <picture> <source srcset="quad-dark.png" media="(prefers-color-scheme:
    * dark)"> <img alt="Quad To" src="quad-light.png"> </picture>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def quadTo(
      x1: Float /* Some(Float) */,
      y1: Float /* Some(Float) */,
      x2: Float /* Some(Float) */,
      y2: Float /* Some(Float) */
  ): Unit /* None */ =
    gsk_path_builder_quad_to(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      x1.asInstanceOf,
      y1.asInstanceOf,
      x2.asInstanceOf,
      y2.asInstanceOf
    )
  end quadTo

  /** Acquires a reference on the given builder.
    *
    * This function is intended primarily for language bindings.
    * `GskPathBuilder` objects should not be kept around.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gsk4.PathBuilder /* None */ =
    sn.gnome.gsk4.PathBuilder.fromRaw(
      gsk_path_builder_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]]
      )
    )
  end ref

  /** Adds an elliptical arc from the current point to @x3, @y3 with @x1, @y1
    * determining the tangent directions.
    *
    * All coordinates are given relative to the current point.
    *
    * This is the relative version of [method@Gsk.PathBuilder.arc_to].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def relArcTo(
      x1: Float /* Some(Float) */,
      y1: Float /* Some(Float) */,
      x2: Float /* Some(Float) */,
      y2: Float /* Some(Float) */
  ): Unit /* None */ =
    gsk_path_builder_rel_arc_to(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      x1.asInstanceOf,
      y1.asInstanceOf,
      x2.asInstanceOf,
      y2.asInstanceOf
    )
  end relArcTo

  /** Adds a [conic
    * curve](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) from
    * the current point to @x2, @y2 with the given @weight and @x1, @y1 as the
    * control point.
    *
    * All coordinates are given relative to the current point.
    *
    * This is the relative version of [method@Gsk.PathBuilder.conic_to].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def relConicTo(
      x1: Float /* Some(Float) */,
      y1: Float /* Some(Float) */,
      x2: Float /* Some(Float) */,
      y2: Float /* Some(Float) */,
      weight: Float /* Some(Float) */
  ): Unit /* None */ =
    gsk_path_builder_rel_conic_to(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      x1.asInstanceOf,
      y1.asInstanceOf,
      x2.asInstanceOf,
      y2.asInstanceOf,
      weight.asInstanceOf
    )
  end relConicTo

  /** Adds a [cubic Bézier
    * curve](https://en.wikipedia.org/wiki/B%C3%A9zier_curve) from the current
    * point to @x3, @y3 with @x1, @y1 and @x2, @y2 as the control points.
    *
    * All coordinates are given relative to the current point.
    *
    * This is the relative version of [method@Gsk.PathBuilder.cubic_to].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def relCubicTo(
      x1: Float /* Some(Float) */,
      y1: Float /* Some(Float) */,
      x2: Float /* Some(Float) */,
      y2: Float /* Some(Float) */,
      x3: Float /* Some(Float) */,
      y3: Float /* Some(Float) */
  ): Unit /* None */ =
    gsk_path_builder_rel_cubic_to(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      x1.asInstanceOf,
      y1.asInstanceOf,
      x2.asInstanceOf,
      y2.asInstanceOf,
      x3.asInstanceOf,
      y3.asInstanceOf
    )
  end relCubicTo

  /** Implements arc-to according to the HTML Canvas spec.
    *
    * All coordinates are given relative to the current point.
    *
    * This is the relative version of [method@Gsk.PathBuilder.html_arc_to].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def relHtmlArcTo(
      x1: Float /* Some(Float) */,
      y1: Float /* Some(Float) */,
      x2: Float /* Some(Float) */,
      y2: Float /* Some(Float) */,
      radius: Float /* Some(Float) */
  ): Unit /* None */ =
    gsk_path_builder_rel_html_arc_to(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      x1.asInstanceOf,
      y1.asInstanceOf,
      x2.asInstanceOf,
      y2.asInstanceOf,
      radius.asInstanceOf
    )
  end relHtmlArcTo

  /** Draws a line from the current point to a point offset from it by @x, @y
    * and makes it the new current point.
    *
    * This is the relative version of [method@Gsk.PathBuilder.line_to].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def relLineTo(
      x: Float /* Some(Float) */,
      y: Float /* Some(Float) */
  ): Unit /* None */ =
    gsk_path_builder_rel_line_to(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      x.asInstanceOf,
      y.asInstanceOf
    )
  end relLineTo

  /** Starts a new contour by placing the pen at @x, @y relative to the current
    * point.
    *
    * This is the relative version of [method@Gsk.PathBuilder.move_to].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def relMoveTo(
      x: Float /* Some(Float) */,
      y: Float /* Some(Float) */
  ): Unit /* None */ =
    gsk_path_builder_rel_move_to(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      x.asInstanceOf,
      y.asInstanceOf
    )
  end relMoveTo

  /** Adds a [quadratic Bézier
    * curve](https://en.wikipedia.org/wiki/B%C3%A9zier_curve) from the current
    * point to @x2, @y2 with @x1, @y1 the control point.
    *
    * All coordinates are given relative to the current point.
    *
    * This is the relative version of [method@Gsk.PathBuilder.quad_to].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def relQuadTo(
      x1: Float /* Some(Float) */,
      y1: Float /* Some(Float) */,
      x2: Float /* Some(Float) */,
      y2: Float /* Some(Float) */
  ): Unit /* None */ =
    gsk_path_builder_rel_quad_to(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      x1.asInstanceOf,
      y1.asInstanceOf,
      x2.asInstanceOf,
      y2.asInstanceOf
    )
  end relQuadTo

  /** Implements arc-to according to the SVG spec.
    *
    * All coordinates are given relative to the current point.
    *
    * This is the relative version of [method@Gsk.PathBuilder.svg_arc_to].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def relSvgArcTo(
      rx: Float /* Some(Float) */,
      ry: Float /* Some(Float) */,
      x_axis_rotation: Float /* Some(Float) */,
      large_arc: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      positive_sweep: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      x: Float /* Some(Float) */,
      y: Float /* Some(Float) */
  ): Unit /* None */ =
    gsk_path_builder_rel_svg_arc_to(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      rx.asInstanceOf,
      ry.asInstanceOf,
      x_axis_rotation.asInstanceOf,
      gboolean(gint((if large_arc == true then 1 else 0))),
      gboolean(gint((if positive_sweep == true then 1 else 0))),
      x.asInstanceOf,
      y.asInstanceOf
    )
  end relSvgArcTo

  /** Implements arc-to according to the SVG spec.
    *
    * A convenience function that implements the [SVG
    * arc_to](https://www.w3.org/TR/SVG11/paths.html#PathDataEllipticalArcCommands)
    * functionality.
    *
    * After this, @x, @y will be the new current point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def svgArcTo(
      rx: Float /* Some(Float) */,
      ry: Float /* Some(Float) */,
      x_axis_rotation: Float /* Some(Float) */,
      large_arc: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      positive_sweep: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      x: Float /* Some(Float) */,
      y: Float /* Some(Float) */
  ): Unit /* None */ =
    gsk_path_builder_svg_arc_to(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]],
      rx.asInstanceOf,
      ry.asInstanceOf,
      x_axis_rotation.asInstanceOf,
      gboolean(gint((if large_arc == true then 1 else 0))),
      gboolean(gint((if positive_sweep == true then 1 else 0))),
      x.asInstanceOf,
      y.asInstanceOf
    )
  end svgArcTo

  /** Creates a new `GskPath` from the given builder.
    *
    * The given `GskPathBuilder` is reset once this function returns; you cannot
    * call this function multiple times on the same builder instance.
    *
    * This function is intended primarily for language bindings. C code should
    * use [method@Gsk.PathBuilder.free_to_path].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toPath(): sn.gnome.gsk4.Path /* None */ =
    sn.gnome.gsk4.Path.fromRaw(
      gsk_path_builder_to_path(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]]
      )
    )
  end toPath

  /** Releases a reference on the given builder.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    gsk_path_builder_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskPathBuilder]]
    )
  end unref

end PathBuilder

object PathBuilder:
  def fromRaw(ptr: Ptr[GskPathBuilder]): PathBuilder = new PathBuilder(ptr)
end PathBuilder
