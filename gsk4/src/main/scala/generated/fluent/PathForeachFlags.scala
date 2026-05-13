package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.GskPathForeachFlags

/** Flags that can be passed to gsk_path_foreach() to influence what kinds of
  * operations the path is decomposed into.
  *
  * By default, [method@Gsk.Path.foreach] will only emit a path with all
  * operations flattened to straight lines to allow for maximum compatibility.
  * The only operations emitted will be `GSK_PATH_MOVE`, `GSK_PATH_LINE` and
  * `GSK_PATH_CLOSE`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PathForeachFlags private (val raw: GskPathForeachFlags):
  def is(kv: PathForeachFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[PathForeachFlags.KnownValue]
    PathForeachFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"PathForeachFlags(${sb.result().mkString(", ")})"
end PathForeachFlags

object PathForeachFlags:
  export KnownValue.*

  def fromRaw(raw: GskPathForeachFlags) = new PathForeachFlags(raw)

  extension (af: PathForeachFlags)
    def &(other: PathForeachFlags) =
      PathForeachFlags(af.raw & other.raw)
    def |(other: PathForeachFlags) =
      PathForeachFlags(af.raw | other.raw)

  /** Flags that can be passed to gsk_path_foreach() to influence what kinds of
    * operations the path is decomposed into.
    *
    * By default, [method@Gsk.Path.foreach] will only emit a path with all
    * operations flattened to straight lines to allow for maximum compatibility.
    * The only operations emitted will be `GSK_PATH_MOVE`, `GSK_PATH_LINE` and
    * `GSK_PATH_CLOSE`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GskPathForeachFlags, name: String)
      extends PathForeachFlags(raw):
    override def toString(): String = this.name

    /** The default behavior, only allow lines.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ONLY_LINES
        extends KnownValue(
          GskPathForeachFlags.GSK_PATH_FOREACH_ALLOW_ONLY_LINES,
          "ONLY_LINES"
        )

    /** Allow emission of `GSK_PATH_QUAD` operations
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case QUAD
        extends KnownValue(
          GskPathForeachFlags.GSK_PATH_FOREACH_ALLOW_QUAD,
          "QUAD"
        )

    /** Allow emission of `GSK_PATH_CUBIC` operations.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CUBIC
        extends KnownValue(
          GskPathForeachFlags.GSK_PATH_FOREACH_ALLOW_CUBIC,
          "CUBIC"
        )

    /** Allow emission of `GSK_PATH_CONIC` operations.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CONIC
        extends KnownValue(
          GskPathForeachFlags.GSK_PATH_FOREACH_ALLOW_CONIC,
          "CONIC"
        )
  end KnownValue
end PathForeachFlags
