package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkNumberUpLayout

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Used to determine the layout of pages on a sheet when printing multiple
  * pages per sheet.
  */
enum NumberUpLayout(val raw: GtkNumberUpLayout):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * ![](layout-lrtb.png)
    */
  case LRTB
      extends NumberUpLayout(
        GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_TOP_TO_BOTTOM
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * ![](layout-lrbt.png)
    */
  case LRBT
      extends NumberUpLayout(
        GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_BOTTOM_TO_TOP
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * ![](layout-rltb.png)
    */
  case RLTB
      extends NumberUpLayout(
        GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_TOP_TO_BOTTOM
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * ![](layout-rlbt.png)
    */
  case RLBT
      extends NumberUpLayout(
        GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_BOTTOM_TO_TOP
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * ![](layout-tblr.png)
    */
  case TBLR
      extends NumberUpLayout(
        GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_LEFT_TO_RIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * ![](layout-tbrl.png)
    */
  case TBRL
      extends NumberUpLayout(
        GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_RIGHT_TO_LEFT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * ![](layout-btlr.png)
    */
  case BTLR
      extends NumberUpLayout(
        GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_LEFT_TO_RIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * ![](layout-btrl.png)
    */
  case BTRL
      extends NumberUpLayout(
        GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_RIGHT_TO_LEFT
      )
end NumberUpLayout

object NumberUpLayout:
  def fromRaw(raw: GtkNumberUpLayout): NumberUpLayout =
    raw match
      case GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_TOP_TO_BOTTOM =>
        NumberUpLayout.LRTB
      case GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_BOTTOM_TO_TOP =>
        NumberUpLayout.LRBT
      case GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_TOP_TO_BOTTOM =>
        NumberUpLayout.RLTB
      case GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_BOTTOM_TO_TOP =>
        NumberUpLayout.RLBT
      case GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_LEFT_TO_RIGHT =>
        NumberUpLayout.TBLR
      case GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_RIGHT_TO_LEFT =>
        NumberUpLayout.TBRL
      case GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_LEFT_TO_RIGHT =>
        NumberUpLayout.BTLR
      case GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_RIGHT_TO_LEFT =>
        NumberUpLayout.BTRL
  end fromRaw
end NumberUpLayout
