package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GUserDirectory

/** These are logical ids for special directories which are defined depending on
  * the platform used. You should use g_get_user_special_dir() to retrieve the
  * full path associated to the logical id.
  *
  * The #GUserDirectory enumeration can be extended at later date. Not every
  * platform has a directory for every logical id in this enumeration.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum UserDirectory(val raw: GUserDirectory):
  /** the user's Desktop directory
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DIRECTORY_DESKTOP
      extends UserDirectory(GUserDirectory.G_USER_DIRECTORY_DESKTOP)

  /** the user's Documents directory
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DIRECTORY_DOCUMENTS
      extends UserDirectory(GUserDirectory.G_USER_DIRECTORY_DOCUMENTS)

  /** the user's Downloads directory
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DIRECTORY_DOWNLOAD
      extends UserDirectory(GUserDirectory.G_USER_DIRECTORY_DOWNLOAD)

  /** the user's Music directory
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DIRECTORY_MUSIC
      extends UserDirectory(GUserDirectory.G_USER_DIRECTORY_MUSIC)

  /** the user's Pictures directory
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DIRECTORY_PICTURES
      extends UserDirectory(GUserDirectory.G_USER_DIRECTORY_PICTURES)

  /** the user's shared directory
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DIRECTORY_PUBLIC_SHARE
      extends UserDirectory(GUserDirectory.G_USER_DIRECTORY_PUBLIC_SHARE)

  /** the user's Templates directory
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DIRECTORY_TEMPLATES
      extends UserDirectory(GUserDirectory.G_USER_DIRECTORY_TEMPLATES)

  /** the user's Movies directory
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DIRECTORY_VIDEOS
      extends UserDirectory(GUserDirectory.G_USER_DIRECTORY_VIDEOS)

  /** the number of enum values
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case N_DIRECTORIES extends UserDirectory(GUserDirectory.G_USER_N_DIRECTORIES)
end UserDirectory

object UserDirectory:
  def fromRaw(raw: GUserDirectory): UserDirectory =
    raw match
      case GUserDirectory.G_USER_DIRECTORY_DESKTOP =>
        UserDirectory.DIRECTORY_DESKTOP
      case GUserDirectory.G_USER_DIRECTORY_DOCUMENTS =>
        UserDirectory.DIRECTORY_DOCUMENTS
      case GUserDirectory.G_USER_DIRECTORY_DOWNLOAD =>
        UserDirectory.DIRECTORY_DOWNLOAD
      case GUserDirectory.G_USER_DIRECTORY_MUSIC =>
        UserDirectory.DIRECTORY_MUSIC
      case GUserDirectory.G_USER_DIRECTORY_PICTURES =>
        UserDirectory.DIRECTORY_PICTURES
      case GUserDirectory.G_USER_DIRECTORY_PUBLIC_SHARE =>
        UserDirectory.DIRECTORY_PUBLIC_SHARE
      case GUserDirectory.G_USER_DIRECTORY_TEMPLATES =>
        UserDirectory.DIRECTORY_TEMPLATES
      case GUserDirectory.G_USER_DIRECTORY_VIDEOS =>
        UserDirectory.DIRECTORY_VIDEOS
      case GUserDirectory.G_USER_N_DIRECTORIES => UserDirectory.N_DIRECTORIES
  end fromRaw
end UserDirectory
