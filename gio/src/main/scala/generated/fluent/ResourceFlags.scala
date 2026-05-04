package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GResourceFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * GResourceFlags give information about a particular file inside a resource
  * bundle.
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * GResourceFlags give information about a particular file inside a resource
    * bundle.
    */
  enum KnownValue(override val raw: GResourceFlags, name: String)
      extends ResourceFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE extends KnownValue(GResourceFlags.G_RESOURCE_FLAGS_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The file is compressed.
      */
    case COMPRESSED
        extends KnownValue(
          GResourceFlags.G_RESOURCE_FLAGS_COMPRESSED,
          "COMPRESSED"
        )
  end KnownValue
end ResourceFlags
