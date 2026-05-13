package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GResourceFlags

/** GResourceFlags give information about a particular file inside a resource
  * bundle.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ResourceFlags private (val raw: GResourceFlags):
  def is(kv: ResourceFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[ResourceFlags.KnownValue]
    ResourceFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"ResourceFlags(${sb.result().mkString(", ")})"
end ResourceFlags

object ResourceFlags:
  export KnownValue.*

  def fromRaw(raw: GResourceFlags) = new ResourceFlags(raw)

  extension (af: ResourceFlags)
    def &(other: ResourceFlags) =
      ResourceFlags(af.raw & other.raw)
    def |(other: ResourceFlags) =
      ResourceFlags(af.raw | other.raw)

  /** GResourceFlags give information about a particular file inside a resource
    * bundle.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GResourceFlags, name: String)
      extends ResourceFlags(raw):
    override def toString(): String = this.name

    /** No flags set.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE extends KnownValue(GResourceFlags.G_RESOURCE_FLAGS_NONE, "NONE")

    /** The file is compressed.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case COMPRESSED
        extends KnownValue(
          GResourceFlags.G_RESOURCE_FLAGS_COMPRESSED,
          "COMPRESSED"
        )
  end KnownValue
end ResourceFlags
