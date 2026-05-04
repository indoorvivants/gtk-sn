package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.GskPathForeachFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags that can be passed to gsk_path_foreach() to influence what kinds of
  * operations the path is decomposed into.
  *
  * By default, [method@Gsk.Path.foreach] will only emit a path with all
  * operations flattened to straight lines to allow for maximum compatibility.
  * The only operations emitted will be `GSK_PATH_MOVE`, `GSK_PATH_LINE` and
  * `GSK_PATH_CLOSE`.
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags that can be passed to gsk_path_foreach() to influence what kinds of
    * operations the path is decomposed into.
    *
    * By default, [method@Gsk.Path.foreach] will only emit a path with all
    * operations flattened to straight lines to allow for maximum compatibility.
    * The only operations emitted will be `GSK_PATH_MOVE`, `GSK_PATH_LINE` and
    * `GSK_PATH_CLOSE`.
    */
  enum KnownValue(override val raw: GskPathForeachFlags, name: String)
      extends PathForeachFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The default behavior, only allow lines.
      */
    case ONLY_LINES
        extends KnownValue(
          GskPathForeachFlags.GSK_PATH_FOREACH_ALLOW_ONLY_LINES,
          "ONLY_LINES"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Allow emission of `GSK_PATH_QUAD` operations
      */
    case QUAD
        extends KnownValue(
          GskPathForeachFlags.GSK_PATH_FOREACH_ALLOW_QUAD,
          "QUAD"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Allow emission of `GSK_PATH_CUBIC` operations.
      */
    case CUBIC
        extends KnownValue(
          GskPathForeachFlags.GSK_PATH_FOREACH_ALLOW_CUBIC,
          "CUBIC"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Allow emission of `GSK_PATH_CONIC` operations.
      */
    case CONIC
        extends KnownValue(
          GskPathForeachFlags.GSK_PATH_FOREACH_ALLOW_CONIC,
          "CONIC"
        )
  end KnownValue
end PathForeachFlags
