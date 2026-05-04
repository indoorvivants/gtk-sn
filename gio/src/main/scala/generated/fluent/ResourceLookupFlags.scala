package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GResourceLookupFlags

/** GResourceLookupFlags determine how resource path lookups are handled.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ResourceLookupFlags private (val raw: GResourceLookupFlags):
  def is(kv: ResourceLookupFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[ResourceLookupFlags.KnownValue]
    ResourceLookupFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"ResourceLookupFlags(${sb.result().mkString(", ")})"
end ResourceLookupFlags

object ResourceLookupFlags:
  export KnownValue.*

  def fromRaw(raw: GResourceLookupFlags) = new ResourceLookupFlags(raw)

  extension (af: ResourceLookupFlags)
    def &(other: ResourceLookupFlags) =
      ResourceLookupFlags(af.raw & other.raw)
    def |(other: ResourceLookupFlags) =
      ResourceLookupFlags(af.raw | other.raw)

  /** GResourceLookupFlags determine how resource path lookups are handled.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GResourceLookupFlags, name: String)
      extends ResourceLookupFlags(raw):
    override def toString(): String = this.name

    /** No flags set.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(
          GResourceLookupFlags.G_RESOURCE_LOOKUP_FLAGS_NONE,
          "NONE"
        )
  end KnownValue
end ResourceLookupFlags
