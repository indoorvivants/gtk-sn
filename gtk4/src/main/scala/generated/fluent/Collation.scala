package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkCollation

/** Describes how a [class@Gtk.StringSorter] turns strings into sort keys to
  * compare them.
  *
  * Note that the result of sorting will in general depend on the current locale
  * unless the mode is @GTK_COLLATION_NONE.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Collation(val raw: GtkCollation):
  /** Don't do any collation
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends Collation(GtkCollation.GTK_COLLATION_NONE)

  /** Use [func@GLib.utf8_collate_key]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNICODE extends Collation(GtkCollation.GTK_COLLATION_UNICODE)

  /** Use [func@GLib.utf8_collate_key_for_filename]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FILENAME extends Collation(GtkCollation.GTK_COLLATION_FILENAME)
end Collation

object Collation:
  def fromRaw(raw: GtkCollation): Collation =
    raw match
      case GtkCollation.GTK_COLLATION_NONE     => Collation.NONE
      case GtkCollation.GTK_COLLATION_UNICODE  => Collation.UNICODE
      case GtkCollation.GTK_COLLATION_FILENAME => Collation.FILENAME
  end fromRaw
end Collation
