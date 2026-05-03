package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GPasswordSave

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GPasswordSave is used to indicate the lifespan of a saved password.
  *
  * #Gvfs stores passwords in the Gnome keyring when this flag allows it to, and
  * later retrieves it again from there.
  */
enum PasswordSave(val raw: GPasswordSave):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * never save a password.
    */
  case NEVER extends PasswordSave(GPasswordSave.G_PASSWORD_SAVE_NEVER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * save a password for the session.
    */
  case FOR_SESSION
      extends PasswordSave(GPasswordSave.G_PASSWORD_SAVE_FOR_SESSION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * save a password permanently.
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
