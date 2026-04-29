package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GKeyFile
import sn.gnome.glib.internal.GVariant
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.PageSetup
import sn.gnome.gtk4.internal.GtkPageOrientation
import sn.gnome.gtk4.internal.GtkPageSetup
import sn.gnome.gtk4.internal.GtkPaperSize
import sn.gnome.gtk4.internal.GtkUnit

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkPageSetup` object stores the page size, orientation and margins.
  *
  * The idea is that you can get one of these from the page setup dialog and
  * then pass it to the `GtkPrintOperation` when printing. The benefit of
  * splitting this out of the `GtkPrintSettings` is that these affect the actual
  * layout of the page, and thus need to be set long before user prints.
  *
  * ## Margins
  *
  * The margins specified in this object are the “print margins”, i.e. the parts
  * of the page that the printer cannot print on. These are different from the
  * layout margins that a word processor uses; they are typically used to
  * determine the minimal size for the layout margins.
  *
  * To obtain a `GtkPageSetup` use [ctor@Gtk.PageSetup.new] to get the defaults,
  * or use [func@Gtk.print_run_page_setup_dialog] to show the page setup dialog
  * and receive the resulting page setup.
  *
  * ## A page setup dialog
  *
  * ```c
  * static GtkPrintSettings *settings = NULL;
  * static GtkPageSetup *page_setup = NULL;
  *
  * static void
  * do_page_setup (void)
  * {
  *   GtkPageSetup *new_page_setup;
  *
  *   if (settings == NULL)
  *     settings = gtk_print_settings_new ();
  *
  *   new_page_setup = gtk_print_run_page_setup_dialog (GTK_WINDOW (main_window),
  *                                                     page_setup, settings);
  *
  *   if (page_setup)
  *     g_object_unref (page_setup);
  *
  *   page_setup = new_page_setup;
  * }
  * ```
  */
class PageSetup(raw: Ptr[GtkPageSetup]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Copies a `GtkPageSetup`.
    */
  def copy(): PageSetup = new PageSetup(
    gtk_page_setup_copy(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the bottom margin in units of @unit.
    */
  def getBottomMargin(unit: GtkUnit): Double =
    gtk_page_setup_get_bottom_margin(this.raw.asInstanceOf, unit)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the left margin in units of @unit.
    */
  def getLeftMargin(unit: GtkUnit): Double =
    gtk_page_setup_get_left_margin(this.raw.asInstanceOf, unit)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the page orientation of the `GtkPageSetup`.
    */
  def getOrientation(): GtkPageOrientation = gtk_page_setup_get_orientation(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the page height in units of @unit.
    *
    * Note that this function takes orientation and margins into consideration.
    * See [method@Gtk.PageSetup.get_paper_height].
    */
  def getPageHeight(unit: GtkUnit): Double =
    gtk_page_setup_get_page_height(this.raw.asInstanceOf, unit)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the page width in units of @unit.
    *
    * Note that this function takes orientation and margins into consideration.
    * See [method@Gtk.PageSetup.get_paper_width].
    */
  def getPageWidth(unit: GtkUnit): Double =
    gtk_page_setup_get_page_width(this.raw.asInstanceOf, unit)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the paper height in units of @unit.
    *
    * Note that this function takes orientation, but not margins into
    * consideration. See [method@Gtk.PageSetup.get_page_height].
    */
  def getPaperHeight(unit: GtkUnit): Double =
    gtk_page_setup_get_paper_height(this.raw.asInstanceOf, unit)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the paper size of the `GtkPageSetup`.
    */
  def getPaperSize(): Ptr[GtkPaperSize] = gtk_page_setup_get_paper_size(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the paper width in units of @unit.
    *
    * Note that this function takes orientation, but not margins into
    * consideration. See [method@Gtk.PageSetup.get_page_width].
    */
  def getPaperWidth(unit: GtkUnit): Double =
    gtk_page_setup_get_paper_width(this.raw.asInstanceOf, unit)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the right margin in units of @unit.
    */
  def getRightMargin(unit: GtkUnit): Double =
    gtk_page_setup_get_right_margin(this.raw.asInstanceOf, unit)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the top margin in units of @unit.
    */
  def getTopMargin(unit: GtkUnit): Double =
    gtk_page_setup_get_top_margin(this.raw.asInstanceOf, unit)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reads the page setup from the file @file_name.
    *
    * See [method@Gtk.PageSetup.to_file].
    */
  def loadFile(file_name: String | CString)(using Zone): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      gtk_page_setup_load_file(
        this.raw.asInstanceOf,
        __sn_extract_string(file_name),
        __errorPtr
      ).value.!=(0)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reads the page setup from the group @group_name in the key file
    * @key_file.
    */
  def loadKeyFile(key_file: Ptr[GKeyFile], group_name: String | CString)(using
      Zone
  ): GResult[Boolean] = GResult.wrap(__errorPtr =>
    gtk_page_setup_load_key_file(
      this.raw.asInstanceOf,
      key_file,
      __sn_extract_string(group_name),
      __errorPtr
    ).value.!=(0)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the bottom margin of the `GtkPageSetup`.
    */
  def setBottomMargin(margin: Double, unit: GtkUnit): Unit =
    gtk_page_setup_set_bottom_margin(this.raw.asInstanceOf, margin, unit)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the left margin of the `GtkPageSetup`.
    */
  def setLeftMargin(margin: Double, unit: GtkUnit): Unit =
    gtk_page_setup_set_left_margin(this.raw.asInstanceOf, margin, unit)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the page orientation of the `GtkPageSetup`.
    */
  def setOrientation(orientation: GtkPageOrientation): Unit =
    gtk_page_setup_set_orientation(this.raw.asInstanceOf, orientation)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the paper size of the `GtkPageSetup` without changing the margins.
    *
    * See [method@Gtk.PageSetup.set_paper_size_and_default_margins].
    */
  def setPaperSize(size: Ptr[GtkPaperSize]): Unit =
    gtk_page_setup_set_paper_size(this.raw.asInstanceOf, size)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the paper size of the `GtkPageSetup` and modifies the margins
    * according to the new paper size.
    */
  def setPaperSizeAndDefaultMargins(size: Ptr[GtkPaperSize]): Unit =
    gtk_page_setup_set_paper_size_and_default_margins(
      this.raw.asInstanceOf,
      size
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the right margin of the `GtkPageSetup`.
    */
  def setRightMargin(margin: Double, unit: GtkUnit): Unit =
    gtk_page_setup_set_right_margin(this.raw.asInstanceOf, margin, unit)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the top margin of the `GtkPageSetup`.
    */
  def setTopMargin(margin: Double, unit: GtkUnit): Unit =
    gtk_page_setup_set_top_margin(this.raw.asInstanceOf, margin, unit)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function saves the information from @setup to @file_name.
    */
  def toFile(file_name: String | CString)(using Zone): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      gtk_page_setup_to_file(
        this.raw.asInstanceOf,
        __sn_extract_string(file_name),
        __errorPtr
      ).value.!=(0)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Serialize page setup to an a{sv} variant.
    */
  def toGvariant(): Ptr[GVariant] = gtk_page_setup_to_gvariant(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function adds the page setup from @setup to @key_file.
    */
  def toKeyFile(key_file: Ptr[GKeyFile], group_name: String | CString)(using
      Zone
  ): Unit = gtk_page_setup_to_key_file(
    this.raw.asInstanceOf,
    key_file,
    __sn_extract_string(group_name)
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end PageSetup

object PageSetup:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkPageSetup`.
    */
  def apply(): PageSetup = new PageSetup(gtk_page_setup_new().asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reads the page setup from the file @file_name.
    *
    * Returns a new `GtkPageSetup` object with the restored page setup, or %NULL
    * if an error occurred. See [method@Gtk.PageSetup.to_file].
    */
  def fromFile(file_name: String | CString)(using Zone): GResult[PageSetup] =
    GResult.wrap(__errorPtr =>
      new PageSetup(
        gtk_page_setup_new_from_file(
          __sn_extract_string(file_name),
          __errorPtr
        ).asInstanceOf
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Desrialize a page setup from an a{sv} variant.
    *
    * The variant must be in the format produced by
    * [method@Gtk.PageSetup.to_gvariant].
    */
  def fromGvariant(variant: Ptr[GVariant]): PageSetup = new PageSetup(
    gtk_page_setup_new_from_gvariant(variant).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reads the page setup from the group @group_name in the key file
    * @key_file.
    *
    * Returns a new `GtkPageSetup` object with the restored page setup, or %NULL
    * if an error occurred.
    */
  def fromKeyFile(key_file: Ptr[GKeyFile], group_name: String | CString)(using
      Zone
  ): GResult[PageSetup] = GResult.wrap(__errorPtr =>
    new PageSetup(
      gtk_page_setup_new_from_key_file(
        key_file,
        __sn_extract_string(group_name),
        __errorPtr
      ).asInstanceOf
    )
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end PageSetup
