package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPackType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Represents the packing location of a children in its parent.
  *
  * See [class@WindowControls] for example.
  */
enum PackType(val raw: GtkPackType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The child is packed into the start of the widget
    */
  case START extends PackType(GtkPackType.GTK_PACK_START)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The child is packed into the end of the widget
    */
  case END extends PackType(GtkPackType.GTK_PACK_END)
end PackType

object PackType:
  def fromRaw(raw: GtkPackType): PackType =
    raw match
      case GtkPackType.GTK_PACK_START => PackType.START
      case GtkPackType.GTK_PACK_END   => PackType.END
  end fromRaw
end PackType
