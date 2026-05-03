package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkCollation

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Describes how a [class@Gtk.StringSorter] turns strings into sort keys to
  * compare them.
  *
  * Note that the result of sorting will in general depend on the current locale
  * unless the mode is @GTK_COLLATION_NONE.
  */
enum Collation(val raw: GtkCollation):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Don't do any collation
    */
  case NONE extends Collation(GtkCollation.GTK_COLLATION_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Use [func@GLib.utf8_collate_key]
    */
  case UNICODE extends Collation(GtkCollation.GTK_COLLATION_UNICODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Use [func@GLib.utf8_collate_key_for_filename]
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
