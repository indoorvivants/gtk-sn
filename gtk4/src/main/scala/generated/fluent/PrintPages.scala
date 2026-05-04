package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPrintPages

/** See also gtk_print_job_set_pages()
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum PrintPages(val raw: GtkPrintPages):
  /** All pages.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ALL extends PrintPages(GtkPrintPages.GTK_PRINT_PAGES_ALL)

  /** Current page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CURRENT extends PrintPages(GtkPrintPages.GTK_PRINT_PAGES_CURRENT)

  /** Range of pages.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RANGES extends PrintPages(GtkPrintPages.GTK_PRINT_PAGES_RANGES)

  /** Selected pages.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
