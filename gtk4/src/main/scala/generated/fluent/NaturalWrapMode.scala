package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkNaturalWrapMode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Options for selecting a different wrap mode for natural size requests.
  *
  * See for example the [property@Gtk.Label:natural-wrap-mode] property.
  */
enum NaturalWrapMode(val raw: GtkNaturalWrapMode):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inherit the minimum size request. In particular, this should be used with
    * %PANGO_WRAP_CHAR.
    */
  case INHERIT
      extends NaturalWrapMode(GtkNaturalWrapMode.GTK_NATURAL_WRAP_INHERIT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Try not to wrap the text. This mode is the closest to GTK3's behavior but
    * can lead to a wide label leaving lots of empty space below the text.
    */
  case NONE extends NaturalWrapMode(GtkNaturalWrapMode.GTK_NATURAL_WRAP_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attempt to wrap at word boundaries. This is useful in particular when
    * using %PANGO_WRAP_WORD_CHAR as the wrap mode.
    */
  case WORD extends NaturalWrapMode(GtkNaturalWrapMode.GTK_NATURAL_WRAP_WORD)
end NaturalWrapMode

object NaturalWrapMode:
  def fromRaw(raw: GtkNaturalWrapMode): NaturalWrapMode =
    raw match
      case GtkNaturalWrapMode.GTK_NATURAL_WRAP_INHERIT =>
        NaturalWrapMode.INHERIT
      case GtkNaturalWrapMode.GTK_NATURAL_WRAP_NONE => NaturalWrapMode.NONE
      case GtkNaturalWrapMode.GTK_NATURAL_WRAP_WORD => NaturalWrapMode.WORD
  end fromRaw
end NaturalWrapMode
