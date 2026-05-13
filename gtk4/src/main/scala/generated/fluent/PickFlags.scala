package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkPickFlags

/** Flags that influence the behavior of [method@Widget.pick].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PickFlags private (val raw: GtkPickFlags):
  def is(kv: PickFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[PickFlags.KnownValue]
    PickFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"PickFlags(${sb.result().mkString(", ")})"
end PickFlags

object PickFlags:
  export KnownValue.*

  def fromRaw(raw: GtkPickFlags) = new PickFlags(raw)

  extension (af: PickFlags)
    def &(other: PickFlags) =
      PickFlags(af.raw & other.raw)
    def |(other: PickFlags) =
      PickFlags(af.raw | other.raw)

  /** Flags that influence the behavior of [method@Widget.pick].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GtkPickFlags, name: String)
      extends PickFlags(raw):
    override def toString(): String = this.name

    /** The default behavior, include widgets that are receiving events
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DEFAULT extends KnownValue(GtkPickFlags.GTK_PICK_DEFAULT, "DEFAULT")

    /** Include widgets that are insensitive
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case INSENSITIVE
        extends KnownValue(GtkPickFlags.GTK_PICK_INSENSITIVE, "INSENSITIVE")

    /** Include widgets that are marked as non-targetable. See
      * [property@Widget:can-target]
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NON_TARGETABLE
        extends KnownValue(
          GtkPickFlags.GTK_PICK_NON_TARGETABLE,
          "NON_TARGETABLE"
        )
  end KnownValue
end PickFlags
