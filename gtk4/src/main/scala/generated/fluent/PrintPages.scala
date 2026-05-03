package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPrintPages

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * See also gtk_print_job_set_pages()
  */
enum PrintPages(val raw: GtkPrintPages):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * All pages.
    */
  case ALL extends PrintPages(GtkPrintPages.GTK_PRINT_PAGES_ALL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Current page.
    */
  case CURRENT extends PrintPages(GtkPrintPages.GTK_PRINT_PAGES_CURRENT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Range of pages.
    */
  case RANGES extends PrintPages(GtkPrintPages.GTK_PRINT_PAGES_RANGES)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selected pages.
    */
  case SELECTION extends PrintPages(GtkPrintPages.GTK_PRINT_PAGES_SELECTION)
end PrintPages

object PrintPages:
  def fromRaw(raw: GtkPrintPages): PrintPages =
    raw match
      case GtkPrintPages.GTK_PRINT_PAGES_ALL       => PrintPages.ALL
      case GtkPrintPages.GTK_PRINT_PAGES_CURRENT   => PrintPages.CURRENT
      case GtkPrintPages.GTK_PRINT_PAGES_RANGES    => PrintPages.RANGES
      case GtkPrintPages.GTK_PRINT_PAGES_SELECTION => PrintPages.SELECTION
  end fromRaw
end PrintPages
