package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GAppInfoCreateFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags used when creating a #GAppInfo.
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags used when creating a #GAppInfo.
    */
  enum KnownValue(override val raw: GAppInfoCreateFlags, name: String)
      extends AppInfoCreateFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags.
      */
    case NONE
        extends KnownValue(GAppInfoCreateFlags.G_APP_INFO_CREATE_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Application opens in a terminal window.
      */
    case NEEDS_TERMINAL
        extends KnownValue(
          GAppInfoCreateFlags.G_APP_INFO_CREATE_NEEDS_TERMINAL,
          "NEEDS_TERMINAL"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Application supports URI arguments.
      */
    case SUPPORTS_URIS
        extends KnownValue(
          GAppInfoCreateFlags.G_APP_INFO_CREATE_SUPPORTS_URIS,
          "SUPPORTS_URIS"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Application supports startup notification. Since 2.26
      */
    case SUPPORTS_STARTUP_NOTIFICATION
        extends KnownValue(
          GAppInfoCreateFlags.G_APP_INFO_CREATE_SUPPORTS_STARTUP_NOTIFICATION,
          "SUPPORTS_STARTUP_NOTIFICATION"
        )
  end KnownValue
end AppInfoCreateFlags
