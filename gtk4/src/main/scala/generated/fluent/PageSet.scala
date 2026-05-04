package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPageSet

/** See also gtk_print_job_set_page_set().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum PageSet(val raw: GtkPageSet):
  /** All pages.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ALL extends PageSet(GtkPageSet.GTK_PAGE_SET_ALL)

  /** Even pages.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EVEN extends PageSet(GtkPageSet.GTK_PAGE_SET_EVEN)

  /** Odd pages.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ODD extends PageSet(GtkPageSet.GTK_PAGE_SET_ODD)
end PageSet

object PageSet:
  def fromRaw(raw: GtkPageSet): PageSet =
    raw match
      case GtkPageSet.GTK_PAGE_SET_ALL  => PageSet.ALL
      case GtkPageSet.GTK_PAGE_SET_EVEN => PageSet.EVEN
      case GtkPageSet.GTK_PAGE_SET_ODD  => PageSet.ODD
  end fromRaw
end PageSet
