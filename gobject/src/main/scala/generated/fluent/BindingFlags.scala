package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.GBindingFlags

/** Flags to be passed to g_object_bind_property() or
  * g_object_bind_property_full().
  *
  * This enumeration can be extended at later date.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class BindingFlags private (val raw: GBindingFlags):
  def is(kv: BindingFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[BindingFlags.KnownValue]
    BindingFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"BindingFlags(${sb.result().mkString(", ")})"
end BindingFlags

object BindingFlags:
  export KnownValue.*

  def fromRaw(raw: GBindingFlags) = new BindingFlags(raw)

  extension (af: BindingFlags)
    def &(other: BindingFlags) =
      BindingFlags(af.raw & other.raw)
    def |(other: BindingFlags) =
      BindingFlags(af.raw | other.raw)

  /** Flags to be passed to g_object_bind_property() or
    * g_object_bind_property_full().
    *
    * This enumeration can be extended at later date.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GBindingFlags, name: scala.Predef.String)
      extends BindingFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** The default binding; if the source property changes, the target property
      * is updated with its value.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DEFAULT extends KnownValue(GBindingFlags.G_BINDING_DEFAULT, "DEFAULT")

    /** Bidirectional binding; if either the property of the source or the
      * property of the target changes, the other is updated.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case BIDIRECTIONAL
        extends KnownValue(
          GBindingFlags.G_BINDING_BIDIRECTIONAL,
          "BIDIRECTIONAL"
        )

    /** Synchronize the values of the source and target properties when creating
      * the binding; the direction of the synchronization is always from the
      * source to the target.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SYNC_CREATE
        extends KnownValue(GBindingFlags.G_BINDING_SYNC_CREATE, "SYNC_CREATE")

    /** If the two properties being bound are booleans, setting one to %TRUE
      * will result in the other being set to %FALSE and vice versa. This flag
      * will only work for boolean properties, and cannot be used when passing
      * custom transformation functions to g_object_bind_property_full().
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case INVERT_BOOLEAN
        extends KnownValue(
          GBindingFlags.G_BINDING_INVERT_BOOLEAN,
          "INVERT_BOOLEAN"
        )
  end KnownValue
end BindingFlags
