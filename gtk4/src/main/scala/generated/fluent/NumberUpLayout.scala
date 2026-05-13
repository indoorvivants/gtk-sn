package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkNumberUpLayout

/** Used to determine the layout of pages on a sheet when printing multiple
  * pages per sheet.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum NumberUpLayout(val raw: GtkNumberUpLayout):
  /** ![](layout-lrtb.png)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LRTB
      extends NumberUpLayout(
        GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_TOP_TO_BOTTOM
      )

  /** ![](layout-lrbt.png)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LRBT
      extends NumberUpLayout(
        GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_BOTTOM_TO_TOP
      )

  /** ![](layout-rltb.png)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RLTB
      extends NumberUpLayout(
        GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_TOP_TO_BOTTOM
      )

  /** ![](layout-rlbt.png)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RLBT
      extends NumberUpLayout(
        GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_BOTTOM_TO_TOP
      )

  /** ![](layout-tblr.png)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TBLR
      extends NumberUpLayout(
        GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_LEFT_TO_RIGHT
      )

  /** ![](layout-tbrl.png)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TBRL
      extends NumberUpLayout(
        GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_RIGHT_TO_LEFT
      )

  /** ![](layout-btlr.png)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BTLR
      extends NumberUpLayout(
        GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_LEFT_TO_RIGHT
      )

  /** ![](layout-btrl.png)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
