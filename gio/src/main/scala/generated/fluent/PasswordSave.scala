package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GPasswordSave

/** #GPasswordSave is used to indicate the lifespan of a saved password.
  *
  * #Gvfs stores passwords in the Gnome keyring when this flag allows it to, and
  * later retrieves it again from there.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum PasswordSave(val raw: GPasswordSave):
  /** never save a password.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NEVER extends PasswordSave(GPasswordSave.G_PASSWORD_SAVE_NEVER)

  /** save a password for the session.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FOR_SESSION
      extends PasswordSave(GPasswordSave.G_PASSWORD_SAVE_FOR_SESSION)

  /** save a password permanently.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PERMANENTLY
      extends PasswordSave(GPasswordSave.G_PASSWORD_SAVE_PERMANENTLY)
end PasswordSave

object PasswordSave:
  def fromRaw(raw: GPasswordSave): PasswordSave =
    raw match
      case GPasswordSave.G_PASSWORD_SAVE_NEVER       => PasswordSave.NEVER
      case GPasswordSave.G_PASSWORD_SAVE_FOR_SESSION => PasswordSave.FOR_SESSION
      case GPasswordSave.G_PASSWORD_SAVE_PERMANENTLY => PasswordSave.PERMANENTLY
  end fromRaw
end PasswordSave
