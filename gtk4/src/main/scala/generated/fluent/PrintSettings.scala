package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GKeyFile
import sn.gnome.glib.internal.GVariant
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.GTKUnit
import sn.gnome.gtk4.fluent.NumberUpLayout
import sn.gnome.gtk4.fluent.PageOrientation
import sn.gnome.gtk4.fluent.PageSet
import sn.gnome.gtk4.fluent.PrintDuplex
import sn.gnome.gtk4.fluent.PrintPages
import sn.gnome.gtk4.fluent.PrintQuality
import sn.gnome.gtk4.fluent.PrintSettings
import sn.gnome.gtk4.internal.GtkPageRange
import sn.gnome.gtk4.internal.GtkPaperSize
import sn.gnome.gtk4.internal.GtkPrintSettings
import sn.gnome.gtk4.internal.GtkPrintSettingsFunc

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkPrintSettings` object represents the settings of a print dialog in a
  * system-independent way.
  *
  * The main use for this object is that once you’ve printed you can get a
  * settings object that represents the settings the user chose, and the next
  * time you print you can pass that object in so that the user doesn’t have to
  * re-set all his settings.
  *
  * Its also possible to enumerate the settings so that you can easily save the
  * settings for the next time your app runs, or even store them in a document.
  * The predefined keys try to use shared values as much as possible so that
  * moving such a document between systems still works.
  */
class PrintSettings(raw: Ptr[GtkPrintSettings])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Copies a `GtkPrintSettings` object.
    */
  def copy(): PrintSettings /* None */ = new PrintSettings(
    gtk_print_settings_copy(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Calls @func for each key-value pair of @settings.
    */
  def foreach(
      func: GtkPrintSettingsFunc /* Some(GtkPrintSettingsFunc) */,
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = gtk_print_settings_foreach(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    func,
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks up the string value associated with @key.
    */
  def get(
      key: String | CString /* Some(CString) */
  )(using Zone): String /* None */ = fromCString(
    gtk_print_settings_get(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
      __sn_extract_string(key)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the boolean represented by the value that is associated with @key.
    *
    * The string “true” represents %TRUE, any other string %FALSE.
    */
  def getBool(
      key: String | CString /* Some(CString) */
  )(using Zone): Boolean /* None */ = gtk_print_settings_get_bool(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(key)
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_COLLATE.
    */
  def getCollate(): Boolean /* None */ = gtk_print_settings_get_collate(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_DEFAULT_SOURCE.
    */
  def getDefaultSource()(using Zone): String /* None */ = fromCString(
    gtk_print_settings_get_default_source(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_DITHER.
    */
  def getDither()(using Zone): String /* None */ = fromCString(
    gtk_print_settings_get_dither(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the double value associated with @key, or 0.
    */
  def getDouble(
      key: String | CString /* Some(CString) */
  )(using Zone): Double /* None */ = gtk_print_settings_get_double(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(key)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the floating point number represented by the value that is
    * associated with @key, or @default_val if the value does not represent a
    * floating point number.
    *
    * Floating point numbers are parsed with g_ascii_strtod().
    */
  def getDoubleWithDefault(
      key: String | CString /* Some(CString) */,
      `def`: Double /* Some(Double) */
  )(using Zone): Double /* None */ = gtk_print_settings_get_double_with_default(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(key),
    `def`
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_DUPLEX.
    */
  def getDuplex(): PrintDuplex /* None */ = PrintDuplex.fromRaw(
    gtk_print_settings_get_duplex(this.raw.asInstanceOf[Ptr[GtkPrintSettings]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_FINISHINGS.
    */
  def getFinishings()(using Zone): String /* None */ = fromCString(
    gtk_print_settings_get_finishings(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the integer value of @key, or 0.
    */
  def getInt(
      key: String | CString /* Some(CString) */
  )(using Zone): Int /* None */ = gtk_print_settings_get_int(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(key)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the value of @key, interpreted as an integer, or the default
    * value.
    */
  def getIntWithDefault(
      key: String | CString /* Some(CString) */,
      `def`: Int /* Some(CInt) */
  )(using Zone): Int /* None */ = gtk_print_settings_get_int_with_default(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(key),
    `def`
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the value associated with @key, interpreted as a length.
    *
    * The returned value is converted to @units.
    */
  def getLength(
      key: String | CString /* Some(CString) */,
      unit: GTKUnit /* Some(GtkUnit) */
  )(using Zone): Double /* None */ = gtk_print_settings_get_length(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(key),
    unit.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_MEDIA_TYPE.
    *
    * The set of media types is defined in PWG 5101.1-2002 PWG.
    */
  def getMediaType()(using Zone): String /* None */ = fromCString(
    gtk_print_settings_get_media_type(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_N_COPIES.
    */
  def getNCopies(): Int /* None */ = gtk_print_settings_get_n_copies(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_NUMBER_UP.
    */
  def getNumberUp(): Int /* None */ = gtk_print_settings_get_number_up(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_NUMBER_UP_LAYOUT.
    */
  def getNumberUpLayout(): NumberUpLayout /* None */ = NumberUpLayout.fromRaw(
    gtk_print_settings_get_number_up_layout(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get the value of %GTK_PRINT_SETTINGS_ORIENTATION, converted to a
    * `GtkPageOrientation`.
    */
  def getOrientation(): PageOrientation /* None */ = PageOrientation.fromRaw(
    gtk_print_settings_get_orientation(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_OUTPUT_BIN.
    */
  def getOutputBin()(using Zone): String /* None */ = fromCString(
    gtk_print_settings_get_output_bin(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_PAGE_RANGES.
    */
  @annotation.compileTimeOnly(
    "Method get_page_ranges contains an OUT parameter, which is not supported yet"
  )
  private def getPageRanges__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_PAGE_SET.
    */
  def getPageSet(): PageSet /* None */ = PageSet.fromRaw(
    gtk_print_settings_get_page_set(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_PAPER_HEIGHT, converted to @unit.
    */
  def getPaperHeight(unit: GTKUnit /* Some(GtkUnit) */ ): Double /* None */ =
    gtk_print_settings_get_paper_height(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
      unit.raw
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_PAPER_FORMAT, converted to a
    * `GtkPaperSize`.
    */
  def getPaperSize(): Ptr[GtkPaperSize] /* None */ =
    gtk_print_settings_get_paper_size(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_PAPER_WIDTH, converted to @unit.
    */
  def getPaperWidth(unit: GTKUnit /* Some(GtkUnit) */ ): Double /* None */ =
    gtk_print_settings_get_paper_width(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
      unit.raw
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_PRINT_PAGES.
    */
  def getPrintPages(): PrintPages /* None */ = PrintPages.fromRaw(
    gtk_print_settings_get_print_pages(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience function to obtain the value of %GTK_PRINT_SETTINGS_PRINTER.
    */
  def getPrinter()(using Zone): String /* None */ = fromCString(
    gtk_print_settings_get_printer(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_PRINTER_LPI.
    */
  def getPrinterLpi(): Double /* None */ = gtk_print_settings_get_printer_lpi(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_QUALITY.
    */
  def getQuality(): PrintQuality /* None */ = PrintQuality.fromRaw(
    gtk_print_settings_get_quality(this.raw.asInstanceOf[Ptr[GtkPrintSettings]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_RESOLUTION.
    */
  def getResolution(): Int /* None */ = gtk_print_settings_get_resolution(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_RESOLUTION_X.
    */
  def getResolutionX(): Int /* None */ = gtk_print_settings_get_resolution_x(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_RESOLUTION_Y.
    */
  def getResolutionY(): Int /* None */ = gtk_print_settings_get_resolution_y(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_REVERSE.
    */
  def getReverse(): Boolean /* None */ = gtk_print_settings_get_reverse(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_SCALE.
    */
  def getScale(): Double /* None */ = gtk_print_settings_get_scale(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_USE_COLOR.
    */
  def getUseColor(): Boolean /* None */ = gtk_print_settings_get_use_color(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE, if a value is associated with @key.
    */
  def hasKey(
      key: String | CString /* Some(CString) */
  )(using Zone): Boolean /* None */ = gtk_print_settings_has_key(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(key)
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reads the print settings from @file_name.
    *
    * If the file could not be loaded then error is set to either a `GFileError`
    * or `GKeyFileError`.
    *
    * See [method@Gtk.PrintSettings.to_file].
    */
  def loadFile(
      file_name: String | CString /* Some(CString) */
  )(using Zone): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    gtk_print_settings_load_file(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
      __sn_extract_string(file_name),
      __errorPtr
    ).value.!=(0)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reads the print settings from the group @group_name in @key_file.
    *
    * If the file could not be loaded then error is set to either a `GFileError`
    * or `GKeyFileError`.
    */
  def loadKeyFile(
      key_file: Ptr[
        GKeyFile
      ] /* Some(Ptr[_root_.sn.gnome.glib.internal.GKeyFile]) */,
      group_name: Option[String | CString /* Some(CString) */ ]
  )(using Zone): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    gtk_print_settings_load_key_file(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
      key_file,
      group_name
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString]),
      __errorPtr
    ).value.!=(0)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Associates @value with @key.
    */
  def set(
      key: String | CString /* Some(CString) */,
      value: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_print_settings_set(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(key),
    value
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @key to a boolean value.
    */
  def setBool(
      key: String | CString /* Some(CString) */,
      value: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Zone): Unit /* None */ = gtk_print_settings_set_bool(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(key),
    gboolean(gint((if value == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_COLLATE.
    */
  def setCollate(
      collate: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_print_settings_set_collate(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    gboolean(gint((if collate == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_DEFAULT_SOURCE.
    */
  def setDefaultSource(
      default_source: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_print_settings_set_default_source(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(default_source)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_DITHER.
    */
  def setDither(
      dither: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_print_settings_set_dither(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(dither)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @key to a double value.
    */
  def setDouble(
      key: String | CString /* Some(CString) */,
      value: Double /* Some(Double) */
  )(using Zone): Unit /* None */ = gtk_print_settings_set_double(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(key),
    value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_DUPLEX.
    */
  def setDuplex(
      duplex: PrintDuplex /* Some(GtkPrintDuplex) */
  ): Unit /* None */ = gtk_print_settings_set_duplex(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    duplex.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_FINISHINGS.
    */
  def setFinishings(
      finishings: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_print_settings_set_finishings(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(finishings)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @key to an integer value.
    */
  def setInt(
      key: String | CString /* Some(CString) */,
      value: Int /* Some(CInt) */
  )(using Zone): Unit /* None */ = gtk_print_settings_set_int(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(key),
    value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Associates a length in units of @unit with @key.
    */
  def setLength(
      key: String | CString /* Some(CString) */,
      value: Double /* Some(Double) */,
      unit: GTKUnit /* Some(GtkUnit) */
  )(using Zone): Unit /* None */ = gtk_print_settings_set_length(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(key),
    value,
    unit.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_MEDIA_TYPE.
    *
    * The set of media types is defined in PWG 5101.1-2002 PWG.
    */
  def setMediaType(
      media_type: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_print_settings_set_media_type(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(media_type)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_N_COPIES.
    */
  def setNCopies(num_copies: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_print_settings_set_n_copies(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
      num_copies
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_NUMBER_UP.
    */
  def setNumberUp(number_up: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_print_settings_set_number_up(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
      number_up
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_NUMBER_UP_LAYOUT.
    */
  def setNumberUpLayout(
      number_up_layout: NumberUpLayout /* Some(GtkNumberUpLayout) */
  ): Unit /* None */ = gtk_print_settings_set_number_up_layout(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    number_up_layout.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_ORIENTATION.
    */
  def setOrientation(
      orientation: PageOrientation /* Some(GtkPageOrientation) */
  ): Unit /* None */ = gtk_print_settings_set_orientation(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    orientation.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_OUTPUT_BIN.
    */
  def setOutputBin(
      output_bin: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_print_settings_set_output_bin(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(output_bin)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_PAGE_RANGES.
    */
  def setPageRanges(
      page_ranges: Ptr[GtkPageRange /* None */ ] /* Some(Ptr[GtkPageRange]) */,
      num_ranges: Int /* Some(CInt) */
  ): Unit /* None */ = gtk_print_settings_set_page_ranges(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    page_ranges,
    num_ranges
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_PAGE_SET.
    */
  def setPageSet(page_set: PageSet /* Some(GtkPageSet) */ ): Unit /* None */ =
    gtk_print_settings_set_page_set(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
      page_set.raw
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_PAPER_HEIGHT.
    */
  def setPaperHeight(
      height: Double /* Some(Double) */,
      unit: GTKUnit /* Some(GtkUnit) */
  ): Unit /* None */ = gtk_print_settings_set_paper_height(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    height,
    unit.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_PAPER_FORMAT,
    * %GTK_PRINT_SETTINGS_PAPER_WIDTH and %GTK_PRINT_SETTINGS_PAPER_HEIGHT.
    */
  def setPaperSize(
      paper_size: Ptr[GtkPaperSize] /* Some(Ptr[GtkPaperSize]) */
  ): Unit /* None */ = gtk_print_settings_set_paper_size(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    paper_size
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_PAPER_WIDTH.
    */
  def setPaperWidth(
      width: Double /* Some(Double) */,
      unit: GTKUnit /* Some(GtkUnit) */
  ): Unit /* None */ = gtk_print_settings_set_paper_width(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    width,
    unit.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_PRINT_PAGES.
    */
  def setPrintPages(
      pages: PrintPages /* Some(GtkPrintPages) */
  ): Unit /* None */ = gtk_print_settings_set_print_pages(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    pages.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience function to set %GTK_PRINT_SETTINGS_PRINTER to @printer.
    */
  def setPrinter(
      printer: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_print_settings_set_printer(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(printer)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_PRINTER_LPI.
    */
  def setPrinterLpi(lpi: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_print_settings_set_printer_lpi(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
      lpi
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_QUALITY.
    */
  def setQuality(
      quality: PrintQuality /* Some(GtkPrintQuality) */
  ): Unit /* None */ = gtk_print_settings_set_quality(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    quality.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the values of %GTK_PRINT_SETTINGS_RESOLUTION,
    * %GTK_PRINT_SETTINGS_RESOLUTION_X and %GTK_PRINT_SETTINGS_RESOLUTION_Y.
    */
  def setResolution(resolution: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_print_settings_set_resolution(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
      resolution
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the values of %GTK_PRINT_SETTINGS_RESOLUTION,
    * %GTK_PRINT_SETTINGS_RESOLUTION_X and %GTK_PRINT_SETTINGS_RESOLUTION_Y.
    */
  def setResolutionXy(
      resolution_x: Int /* Some(CInt) */,
      resolution_y: Int /* Some(CInt) */
  ): Unit /* None */ = gtk_print_settings_set_resolution_xy(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    resolution_x,
    resolution_y
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_REVERSE.
    */
  def setReverse(
      reverse: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_print_settings_set_reverse(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    gboolean(gint((if reverse == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_SCALE.
    */
  def setScale(scale: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_print_settings_set_scale(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
      scale
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_USE_COLOR.
    */
  def setUseColor(
      use_color: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_print_settings_set_use_color(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    gboolean(gint((if use_color == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function saves the print settings from @settings to @file_name.
    *
    * If the file could not be written then error is set to either a
    * `GFileError` or `GKeyFileError`.
    */
  def toFile(
      file_name: String | CString /* Some(CString) */
  )(using Zone): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    gtk_print_settings_to_file(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
      __sn_extract_string(file_name),
      __errorPtr
    ).value.!=(0)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Serialize print settings to an a{sv} variant.
    */
  def toGvariant(): Ptr[GVariant] /* None */ = gtk_print_settings_to_gvariant(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function adds the print settings from @settings to @key_file.
    */
  def toKeyFile(
      key_file: Ptr[
        GKeyFile
      ] /* Some(Ptr[_root_.sn.gnome.glib.internal.GKeyFile]) */,
      group_name: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_print_settings_to_key_file(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    key_file,
    group_name
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes any value associated with @key.
    *
    * This has the same effect as setting the value to %NULL.
    */
  def unset(
      key: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_print_settings_unset(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(key)
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end PrintSettings

object PrintSettings:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkPrintSettings` object.
    */
  def apply(): PrintSettings = new PrintSettings(
    gtk_print_settings_new().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reads the print settings from @file_name.
    *
    * Returns a new `GtkPrintSettings` object with the restored settings, or
    * %NULL if an error occurred. If the file could not be loaded then error is
    * set to either a `GFileError` or `GKeyFileError`.
    *
    * See [method@Gtk.PrintSettings.to_file].
    */
  def fromFile(
      file_name: String | CString /* Some(CString) */
  )(using Zone): GResult[PrintSettings] = GResult.wrap(__errorPtr =>
    new PrintSettings(
      gtk_print_settings_new_from_file(
        __sn_extract_string(file_name),
        __errorPtr
      ).asInstanceOf
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Deserialize print settings from an a{sv} variant.
    *
    * The variant must be in the format produced by
    * [method@Gtk.PrintSettings.to_gvariant].
    */
  def fromGvariant(
      variant: Ptr[
        GVariant
      ] /* Some(Ptr[_root_.sn.gnome.glib.internal.GVariant]) */
  ): PrintSettings = new PrintSettings(
    gtk_print_settings_new_from_gvariant(variant).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reads the print settings from the group @group_name in @key_file.
    *
    * Returns a new `GtkPrintSettings` object with the restored settings, or
    * %NULL if an error occurred. If the file could not be loaded then error is
    * set to either `GFileError` or `GKeyFileError`.
    */
  def fromKeyFile(
      key_file: Ptr[
        GKeyFile
      ] /* Some(Ptr[_root_.sn.gnome.glib.internal.GKeyFile]) */,
      group_name: Option[String | CString /* Some(CString) */ ]
  )(using Zone): GResult[PrintSettings] = GResult.wrap(__errorPtr =>
    new PrintSettings(
      gtk_print_settings_new_from_key_file(
        key_file,
        group_name
          .map[CString](o => __sn_extract_string(o))
          .getOrElse(null.asInstanceOf[CString]),
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
end PrintSettings
