package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkPaintableFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags about a paintable object.
  *
  * Implementations use these for optimizations such as caching.
  */
class PaintableFlags private (val raw: GdkPaintableFlags):
  def is(kv: PaintableFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[PaintableFlags.KnownValue]
    PaintableFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"PaintableFlags(${sb.result().mkString(", ")})"
end PaintableFlags

object PaintableFlags:
  export KnownValue.*

  def fromRaw(raw: GdkPaintableFlags) = new PaintableFlags(raw)

  extension (af: PaintableFlags)
    def &(other: PaintableFlags) =
      PaintableFlags(af.raw & other.raw)
    def |(other: PaintableFlags) =
      PaintableFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags about a paintable object.
    *
    * Implementations use these for optimizations such as caching.
    */
  enum KnownValue(override val raw: GdkPaintableFlags, name: String)
      extends PaintableFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The size is immutable. The [signal@Gdk.Paintable::invalidate-size]
      * signal will never be emitted.
      */
    case SIZE
        extends KnownValue(GdkPaintableFlags.GDK_PAINTABLE_STATIC_SIZE, "SIZE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The content is immutable. The
      * [signal@Gdk.Paintable::invalidate-contents] signal will never be
      * emitted.
      */
    case CONTENTS
        extends KnownValue(
          GdkPaintableFlags.GDK_PAINTABLE_STATIC_CONTENTS,
          "CONTENTS"
        )
  end KnownValue
end PaintableFlags
