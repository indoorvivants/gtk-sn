package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPickFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags that influence the behavior of [method@Widget.pick].
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags that influence the behavior of [method@Widget.pick].
    */
  enum KnownValue(override val raw: GtkPickFlags, name: String)
      extends PickFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The default behavior, include widgets that are receiving events
      */
    case DEFAULT extends KnownValue(GtkPickFlags.GTK_PICK_DEFAULT, "DEFAULT")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Include widgets that are insensitive
      */
    case INSENSITIVE
        extends KnownValue(GtkPickFlags.GTK_PICK_INSENSITIVE, "INSENSITIVE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Include widgets that are marked as non-targetable. See
      * [property@Widget:can-target]
      */
    case NON_TARGETABLE
        extends KnownValue(
          GtkPickFlags.GTK_PICK_NON_TARGETABLE,
          "NON_TARGETABLE"
        )
  end KnownValue
end PickFlags
