package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GAppInfoCreateFlags

/** Flags used when creating a #GAppInfo.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AppInfoCreateFlags private (val raw: GAppInfoCreateFlags):
  def is(kv: AppInfoCreateFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[AppInfoCreateFlags.KnownValue]
    AppInfoCreateFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"AppInfoCreateFlags(${sb.result().mkString(", ")})"
end AppInfoCreateFlags

object AppInfoCreateFlags:
  export KnownValue.*

  def fromRaw(raw: GAppInfoCreateFlags) = new AppInfoCreateFlags(raw)

  extension (af: AppInfoCreateFlags)
    def &(other: AppInfoCreateFlags) =
      AppInfoCreateFlags(af.raw & other.raw)
    def |(other: AppInfoCreateFlags) =
      AppInfoCreateFlags(af.raw | other.raw)

  /** Flags used when creating a #GAppInfo.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GAppInfoCreateFlags, name: String)
      extends AppInfoCreateFlags(raw):
    override def toString(): String = this.name

    /** No flags.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(GAppInfoCreateFlags.G_APP_INFO_CREATE_NONE, "NONE")

    /** Application opens in a terminal window.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NEEDS_TERMINAL
        extends KnownValue(
          GAppInfoCreateFlags.G_APP_INFO_CREATE_NEEDS_TERMINAL,
          "NEEDS_TERMINAL"
        )

    /** Application supports URI arguments.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SUPPORTS_URIS
        extends KnownValue(
          GAppInfoCreateFlags.G_APP_INFO_CREATE_SUPPORTS_URIS,
          "SUPPORTS_URIS"
        )

    /** Application supports startup notification. Since 2.26
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SUPPORTS_STARTUP_NOTIFICATION
        extends KnownValue(
          GAppInfoCreateFlags.G_APP_INFO_CREATE_SUPPORTS_STARTUP_NOTIFICATION,
          "SUPPORTS_STARTUP_NOTIFICATION"
        )
  end KnownValue
end AppInfoCreateFlags
