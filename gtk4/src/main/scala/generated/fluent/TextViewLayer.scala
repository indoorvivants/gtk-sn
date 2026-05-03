package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkTextViewLayer

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Used to reference the layers of `GtkTextView` for the purpose of customized
  * drawing with the ::snapshot_layer vfunc.
  */
enum TextViewLayer(val raw: GtkTextViewLayer):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The layer rendered below the text (but above the background).
    */
  case BELOW_TEXT
      extends TextViewLayer(GtkTextViewLayer.GTK_TEXT_VIEW_LAYER_BELOW_TEXT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The layer rendered above the text.
    */
  case ABOVE_TEXT
      extends TextViewLayer(GtkTextViewLayer.GTK_TEXT_VIEW_LAYER_ABOVE_TEXT)
end TextViewLayer

object TextViewLayer:
  def fromRaw(raw: GtkTextViewLayer): TextViewLayer =
    raw match
      case GtkTextViewLayer.GTK_TEXT_VIEW_LAYER_BELOW_TEXT =>
        TextViewLayer.BELOW_TEXT
      case GtkTextViewLayer.GTK_TEXT_VIEW_LAYER_ABOVE_TEXT =>
        TextViewLayer.ABOVE_TEXT
  end fromRaw
end TextViewLayer
