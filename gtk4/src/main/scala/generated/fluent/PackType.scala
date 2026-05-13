package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkPackType

/** Represents the packing location of a children in its parent.
  *
  * See [class@WindowControls] for example.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum PackType(val raw: GtkPackType):
  /** The child is packed into the start of the widget
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case START extends PackType(GtkPackType.GTK_PACK_START)

  /** The child is packed into the end of the widget
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
