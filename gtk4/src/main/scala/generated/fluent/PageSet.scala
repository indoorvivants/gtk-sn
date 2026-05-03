package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPageSet

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * See also gtk_print_job_set_page_set().
  */
enum PageSet(val raw: GtkPageSet):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * All pages.
    */
  case ALL extends PageSet(GtkPageSet.GTK_PAGE_SET_ALL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Even pages.
    */
  case EVEN extends PageSet(GtkPageSet.GTK_PAGE_SET_EVEN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Odd pages.
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
