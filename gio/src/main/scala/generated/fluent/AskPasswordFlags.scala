package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GAskPasswordFlags

/** #GAskPasswordFlags are used to request specific information from the user,
  * or to notify the user of their choices in an authentication situation.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
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

  /** #GAskPasswordFlags are used to request specific information from the user,
    * or to notify the user of their choices in an authentication situation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GAskPasswordFlags, name: String)
      extends AskPasswordFlags(raw):
    override def toString(): String = this.name

    /** operation requires a password.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NEED_PASSWORD
        extends KnownValue(
          GAskPasswordFlags.G_ASK_PASSWORD_NEED_PASSWORD,
          "NEED_PASSWORD"
        )

    /** operation requires a username.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NEED_USERNAME
        extends KnownValue(
          GAskPasswordFlags.G_ASK_PASSWORD_NEED_USERNAME,
          "NEED_USERNAME"
        )

    /** operation requires a domain.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NEED_DOMAIN
        extends KnownValue(
          GAskPasswordFlags.G_ASK_PASSWORD_NEED_DOMAIN,
          "NEED_DOMAIN"
        )

    /** operation supports saving settings.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SAVING_SUPPORTED
        extends KnownValue(
          GAskPasswordFlags.G_ASK_PASSWORD_SAVING_SUPPORTED,
          "SAVING_SUPPORTED"
        )

    /** operation supports anonymous users.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ANONYMOUS_SUPPORTED
        extends KnownValue(
          GAskPasswordFlags.G_ASK_PASSWORD_ANONYMOUS_SUPPORTED,
          "ANONYMOUS_SUPPORTED"
        )

    /** operation takes TCRYPT parameters (Since: 2.58)
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case TCRYPT
        extends KnownValue(GAskPasswordFlags.G_ASK_PASSWORD_TCRYPT, "TCRYPT")
  end KnownValue
end AskPasswordFlags
