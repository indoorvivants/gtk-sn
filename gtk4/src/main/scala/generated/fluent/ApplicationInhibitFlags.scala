package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkApplicationInhibitFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Types of user actions that may be blocked by `GtkApplication`.
  *
  * See [method@Gtk.Application.inhibit].
  */
class ApplicationInhibitFlags private (val raw: GtkApplicationInhibitFlags):
  def is(kv: ApplicationInhibitFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[ApplicationInhibitFlags.KnownValue]
    ApplicationInhibitFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"ApplicationInhibitFlags(${sb.result().mkString(", ")})"
end ApplicationInhibitFlags

object ApplicationInhibitFlags:
  export KnownValue.*

  def fromRaw(raw: GtkApplicationInhibitFlags) = new ApplicationInhibitFlags(
    raw
  )

  extension (af: ApplicationInhibitFlags)
    def &(other: ApplicationInhibitFlags) =
      ApplicationInhibitFlags(af.raw & other.raw)
    def |(other: ApplicationInhibitFlags) =
      ApplicationInhibitFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Types of user actions that may be blocked by `GtkApplication`.
    *
    * See [method@Gtk.Application.inhibit].
    */
  enum KnownValue(override val raw: GtkApplicationInhibitFlags, name: String)
      extends ApplicationInhibitFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Inhibit ending the user session by logging out or by shutting down the
      * computer
      */
    case LOGOUT
        extends KnownValue(
          GtkApplicationInhibitFlags.GTK_APPLICATION_INHIBIT_LOGOUT,
          "LOGOUT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Inhibit user switching
      */
    case SWITCH
        extends KnownValue(
          GtkApplicationInhibitFlags.GTK_APPLICATION_INHIBIT_SWITCH,
          "SWITCH"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Inhibit suspending the session or computer
      */
    case SUSPEND
        extends KnownValue(
          GtkApplicationInhibitFlags.GTK_APPLICATION_INHIBIT_SUSPEND,
          "SUSPEND"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Inhibit the session being marked as idle (and possibly locked)
      */
    case IDLE
        extends KnownValue(
          GtkApplicationInhibitFlags.GTK_APPLICATION_INHIBIT_IDLE,
          "IDLE"
        )
  end KnownValue
end ApplicationInhibitFlags
