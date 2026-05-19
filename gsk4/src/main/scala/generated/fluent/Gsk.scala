package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gconstpointer, gint}
import sn.gnome.gobject.Value
import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.RenderNode
import sn.gnome.runtime.*

object Gsk:
  /** This is a convenience function that constructs a `GskPath` from a
    * serialized form.
    *
    * The string is expected to be in (a superset of) [SVG path
    * syntax](https://www.w3.org/TR/SVG11/paths.html#PathData), as e.g. produced
    * by [method@Gsk.Path.to_string].
    *
    * A high-level summary of the syntax:
    *
    *   - `M x y` Move to `(x, y)`
    *   - `L x y` Add a line from the current point to `(x, y)`
    *   - `Q x1 y1 x2 y2` Add a quadratic Bézier from the current point to
    *     `(x2, y2)`, with control point `(x1, y1)`
    *   - `C x1 y1 x2 y2 x3 y3` Add a cubic Bézier from the current point to
    *     `(x3, y3)`, with control points `(x1, y1)` and `(x2, y2)`
    *   - `Z` Close the contour by drawing a line back to the start point
    *   - `H x` Add a horizontal line from the current point to the given x
    *     value
    *   - `V y` Add a vertical line from the current point to the given y value
    *   - `T x2 y2` Add a quadratic Bézier, using the reflection of the previous
    *     segments' control point as control point
    *   - `S x2 y2 x3 y3` Add a cubic Bézier, using the reflection of the
    *     previous segments' second control point as first control point
    *   - `A rx ry r l s x y` Add an elliptical arc from the current point to
    *     `(x, y)` with radii rx and ry. See the SVG documentation for how the
    *     other parameters influence the arc.
    *   - `O x1 y1 x2 y2 w` Add a rational quadratic Bézier from the current
    *     point to `(x2, y2)` with control point `(x1, y1)` and weight `w`.
    *
    * All the commands have lowercase variants that interpret coordinates
    * relative to the current point.
    *
    * The `O` command is an extension that is not supported in SVG.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[path_parse:/<return type>]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Path), @type -> DataRecord(GskPath*)))"
  )
  private def pathParse() = ???

  @annotation.compileTimeOnly(
    "[serialization_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def serializationErrorQuark() = ???

  /** Checks if 2 strokes are identical.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strokeEqual(
      stroke1: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gconstpointer) */
      ],
      stroke2: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gconstpointer) */
      ]
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    gsk_stroke_equal(
      stroke1
        .map[_root_.sn.gnome.glib.internal.gconstpointer](o => gconstpointer(o))
        .getOrElse(
          null.asInstanceOf[_root_.sn.gnome.glib.internal.gconstpointer]
        ),
      stroke2
        .map[_root_.sn.gnome.glib.internal.gconstpointer](o => gconstpointer(o))
        .getOrElse(
          null.asInstanceOf[_root_.sn.gnome.glib.internal.gconstpointer]
        )
    ).value.!=(0)

  /** Parses the given @string into a transform and puts it in
    * @out_transform.
    *
    * Strings printed via [method@Gsk.Transform.to_string] can be read in again
    * successfully using this function.
    *
    * If @string does not describe a valid transform, %FALSE is returned and
    * %NULL is put in @out_transform.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[transform_parse:]: Function transform_parse contains an OUT parameter, which is not supported yet"
  )
  private def transformParse() = ???

  /** Retrieves the `GskRenderNode` stored inside the given `value`, and
    * acquires a reference to it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def valueDupRenderNode(
      value: Value /* Some(Ptr[_root_.sn.gnome.gobject.internal.GValue]) */
  )(using Runtime): sn.gnome.gsk4.RenderNode /* Some(Ptr[GskRenderNode]) */ =
    sn.gnome.gsk4.RenderNode.applyUnsafe(
      gsk_value_dup_render_node(value.getUnsafeRawPointer()).asInstanceOf
    )

  /** Retrieves the `GskRenderNode` stored inside the given `value`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def valueGetRenderNode(
      value: Value /* Some(Ptr[_root_.sn.gnome.gobject.internal.GValue]) */
  )(using Runtime): sn.gnome.gsk4.RenderNode /* Some(Ptr[GskRenderNode]) */ =
    sn.gnome.gsk4.RenderNode.applyUnsafe(
      gsk_value_get_render_node(value.getUnsafeRawPointer()).asInstanceOf
    )

  /** Stores the given `GskRenderNode` inside `value`.
    *
    * The [struct@GObject.Value] will acquire a reference to the `node`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def valueSetRenderNode(
      value: Value /* Some(Ptr[_root_.sn.gnome.gobject.internal.GValue]) */,
      node: sn.gnome.gsk4.RenderNode /* Some(Ptr[GskRenderNode]) */
  )(using Runtime): Unit /* Some(Unit) */ = gsk_value_set_render_node(
    value.getUnsafeRawPointer(),
    node.getUnsafeRawPointer().asInstanceOf
  )

  /** Stores the given `GskRenderNode` inside `value`.
    *
    * This function transfers the ownership of the `node` to the `GValue`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def valueTakeRenderNode(
      value: Value /* Some(Ptr[_root_.sn.gnome.gobject.internal.GValue]) */,
      node: Option[sn.gnome.gsk4.RenderNode /* Some(Ptr[GskRenderNode]) */ ]
  )(using Runtime): Unit /* Some(Unit) */ = gsk_value_take_render_node(
    value.getUnsafeRawPointer(),
    node
      .map[Ptr[GskRenderNode]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GskRenderNode]])
  )

end Gsk
