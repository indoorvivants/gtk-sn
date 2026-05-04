package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gconstpointer, gint}

object Gsk:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This is a convenience function that constructs a `GskPath` from a
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
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Path), @type -> DataRecord(GskPath*)))"
  )
  def pathParse() = ???

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def serializationErrorQuark() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if 2 strokes are identical.
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Parses the given @string into a transform and puts it in
    * @out_transform.
    *
    * Strings printed via [method@Gsk.Transform.to_string] can be read in again
    * successfully using this function.
    *
    * If @string does not describe a valid transform, %FALSE is returned and
    * %NULL is put in @out_transform.
    */
  @annotation.compileTimeOnly(
    "Function transform_parse contains an OUT parameter, which is not supported yet"
  )
  def transformParse() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the `GskRenderNode` stored inside the given `value`, and
    * acquires a reference to it.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(const GValue*)))"
  )
  def valueDupRenderNode() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the `GskRenderNode` stored inside the given `value`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(const GValue*)))"
  )
  def valueGetRenderNode() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Stores the given `GskRenderNode` inside `value`.
    *
    * The [struct@GObject.Value] will acquire a reference to the `node`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(GValue*)))"
  )
  def valueSetRenderNode() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Stores the given `GskRenderNode` inside `value`.
    *
    * This function transfers the ownership of the `node` to the `GValue`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(GValue*)))"
  )
  def valueTakeRenderNode() = ???

end Gsk
