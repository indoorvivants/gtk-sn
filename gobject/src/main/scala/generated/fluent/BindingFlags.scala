package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.GBindingFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags to be passed to g_object_bind_property() or
  * g_object_bind_property_full().
  *
  * This enumeration can be extended at later date.
  */
class BindingFlags private (val raw: GBindingFlags):
  def is(kv: BindingFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[BindingFlags.KnownValue]
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags to be passed to g_object_bind_property() or
    * g_object_bind_property_full().
    *
    * This enumeration can be extended at later date.
    */
  enum KnownValue(override val raw: GBindingFlags, name: String)
      extends BindingFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The default binding; if the source property changes, the target property
      * is updated with its value.
      */
    case DEFAULT extends KnownValue(GBindingFlags.G_BINDING_DEFAULT, "DEFAULT")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Bidirectional binding; if either the property of the source or the
      * property of the target changes, the other is updated.
      */
    case BIDIRECTIONAL
        extends KnownValue(
          GBindingFlags.G_BINDING_BIDIRECTIONAL,
          "BIDIRECTIONAL"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Synchronize the values of the source and target properties when creating
      * the binding; the direction of the synchronization is always from the
      * source to the target.
      */
    case SYNC_CREATE
        extends KnownValue(GBindingFlags.G_BINDING_SYNC_CREATE, "SYNC_CREATE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * If the two properties being bound are booleans, setting one to %TRUE
      * will result in the other being set to %FALSE and vice versa. This flag
      * will only work for boolean properties, and cannot be used when passing
      * custom transformation functions to g_object_bind_property_full().
      */
    case INVERT_BOOLEAN
        extends KnownValue(
          GBindingFlags.G_BINDING_INVERT_BOOLEAN,
          "INVERT_BOOLEAN"
        )
  end KnownValue
end BindingFlags
