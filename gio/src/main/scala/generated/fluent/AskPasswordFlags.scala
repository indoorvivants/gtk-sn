package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GAskPasswordFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GAskPasswordFlags are used to request specific information from the user,
  * or to notify the user of their choices in an authentication situation.
  */
class AskPasswordFlags private (val raw: GAskPasswordFlags):
  def is(kv: AskPasswordFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[AskPasswordFlags.KnownValue]
    AskPasswordFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"AskPasswordFlags(${sb.result().mkString(", ")})"
end AskPasswordFlags

object AskPasswordFlags:
  export KnownValue.*

  def fromRaw(raw: GAskPasswordFlags) = new AskPasswordFlags(raw)

  extension (af: AskPasswordFlags)
    def &(other: AskPasswordFlags) =
      AskPasswordFlags(af.raw & other.raw)
    def |(other: AskPasswordFlags) =
      AskPasswordFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * #GAskPasswordFlags are used to request specific information from the user,
    * or to notify the user of their choices in an authentication situation.
    */
  enum KnownValue(override val raw: GAskPasswordFlags, name: String)
      extends AskPasswordFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * operation requires a password.
      */
    case NEED_PASSWORD
        extends KnownValue(
          GAskPasswordFlags.G_ASK_PASSWORD_NEED_PASSWORD,
          "NEED_PASSWORD"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * operation requires a username.
      */
    case NEED_USERNAME
        extends KnownValue(
          GAskPasswordFlags.G_ASK_PASSWORD_NEED_USERNAME,
          "NEED_USERNAME"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * operation requires a domain.
      */
    case NEED_DOMAIN
        extends KnownValue(
          GAskPasswordFlags.G_ASK_PASSWORD_NEED_DOMAIN,
          "NEED_DOMAIN"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * operation supports saving settings.
      */
    case SAVING_SUPPORTED
        extends KnownValue(
          GAskPasswordFlags.G_ASK_PASSWORD_SAVING_SUPPORTED,
          "SAVING_SUPPORTED"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * operation supports anonymous users.
      */
    case ANONYMOUS_SUPPORTED
        extends KnownValue(
          GAskPasswordFlags.G_ASK_PASSWORD_ANONYMOUS_SUPPORTED,
          "ANONYMOUS_SUPPORTED"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * operation takes TCRYPT parameters (Since: 2.58)
      */
    case TCRYPT
        extends KnownValue(GAskPasswordFlags.G_ASK_PASSWORD_TCRYPT, "TCRYPT")
  end KnownValue
end AskPasswordFlags
