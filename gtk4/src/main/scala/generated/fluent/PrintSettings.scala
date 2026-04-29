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
import sn.gnome.gtk4.fluent.PrintSettings
import sn.gnome.gtk4.internal.GtkNumberUpLayout
import sn.gnome.gtk4.internal.GtkPageOrientation
import sn.gnome.gtk4.internal.GtkPageRange
import sn.gnome.gtk4.internal.GtkPageSet
import sn.gnome.gtk4.internal.GtkPaperSize
import sn.gnome.gtk4.internal.GtkPrintDuplex
import sn.gnome.gtk4.internal.GtkPrintPages
import sn.gnome.gtk4.internal.GtkPrintQuality
import sn.gnome.gtk4.internal.GtkPrintSettings
import sn.gnome.gtk4.internal.GtkPrintSettingsFunc
import sn.gnome.gtk4.internal.GtkUnit

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
  def copy(): PrintSettings = new PrintSettings(
    gtk_print_settings_copy(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Calls @func for each key-value pair of @settings.
    */
  def foreach(func: GtkPrintSettingsFunc, user_data: Ptr[Byte]): Unit =
    gtk_print_settings_foreach(this.raw.asInstanceOf, func, gpointer(user_data))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks up the string value associated with @key.
    */
  def get(key: String | CString)(using Zone): String = fromCString(
    gtk_print_settings_get(
      this.raw.asInstanceOf,
      __sn_extract_string(key)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the boolean represented by the value that is associated with @key.
    *
    * The string “true” represents %TRUE, any other string %FALSE.
    */
  def getBool(key: String | CString)(using Zone): Boolean =
    gtk_print_settings_get_bool(
      this.raw.asInstanceOf,
      __sn_extract_string(key)
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_COLLATE.
    */
  def getCollate(): Boolean =
    gtk_print_settings_get_collate(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_DEFAULT_SOURCE.
    */
  def getDefaultSource()(using Zone): String = fromCString(
    gtk_print_settings_get_default_source(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_DITHER.
    */
  def getDither()(using Zone): String = fromCString(
    gtk_print_settings_get_dither(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the double value associated with @key, or 0.
    */
  def getDouble(key: String | CString)(using Zone): Double =
    gtk_print_settings_get_double(
      this.raw.asInstanceOf,
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
  def getDoubleWithDefault(key: String | CString, `def`: Double)(using
      Zone
  ): Double = gtk_print_settings_get_double_with_default(
    this.raw.asInstanceOf,
    __sn_extract_string(key),
    `def`
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_DUPLEX.
    */
  def getDuplex(): GtkPrintDuplex = gtk_print_settings_get_duplex(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_FINISHINGS.
    */
  def getFinishings()(using Zone): String = fromCString(
    gtk_print_settings_get_finishings(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the integer value of @key, or 0.
    */
  def getInt(key: String | CString)(using Zone): Int =
    gtk_print_settings_get_int(this.raw.asInstanceOf, __sn_extract_string(key))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the value of @key, interpreted as an integer, or the default
    * value.
    */
  def getIntWithDefault(key: String | CString, `def`: Int)(using Zone): Int =
    gtk_print_settings_get_int_with_default(
      this.raw.asInstanceOf,
      __sn_extract_string(key),
      `def`
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the value associated with @key, interpreted as a length.
    *
    * The returned value is converted to @units.
    */
  def getLength(key: String | CString, unit: GtkUnit)(using Zone): Double =
    gtk_print_settings_get_length(
      this.raw.asInstanceOf,
      __sn_extract_string(key),
      unit
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_MEDIA_TYPE.
    *
    * The set of media types is defined in PWG 5101.1-2002 PWG.
    */
  def getMediaType()(using Zone): String = fromCString(
    gtk_print_settings_get_media_type(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_N_COPIES.
    */
  def getNCopies(): Int = gtk_print_settings_get_n_copies(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_NUMBER_UP.
    */
  def getNumberUp(): Int = gtk_print_settings_get_number_up(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_NUMBER_UP_LAYOUT.
    */
  def getNumberUpLayout(): GtkNumberUpLayout =
    gtk_print_settings_get_number_up_layout(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get the value of %GTK_PRINT_SETTINGS_ORIENTATION, converted to a
    * `GtkPageOrientation`.
    */
  def getOrientation(): GtkPageOrientation = gtk_print_settings_get_orientation(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_OUTPUT_BIN.
    */
  def getOutputBin()(using Zone): String = fromCString(
    gtk_print_settings_get_output_bin(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_PAGE_RANGES.
    */
  @annotation.compileTimeOnly(
    "Method get_page_ranges contains an OUT parameter, which is not supported yet"
  )
  def getPageRanges(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_PAGE_SET.
    */
  def getPageSet(): GtkPageSet = gtk_print_settings_get_page_set(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_PAPER_HEIGHT, converted to @unit.
    */
  def getPaperHeight(unit: GtkUnit): Double =
    gtk_print_settings_get_paper_height(this.raw.asInstanceOf, unit)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_PAPER_FORMAT, converted to a
    * `GtkPaperSize`.
    */
  def getPaperSize(): Ptr[GtkPaperSize] = gtk_print_settings_get_paper_size(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_PAPER_WIDTH, converted to @unit.
    */
  def getPaperWidth(unit: GtkUnit): Double =
    gtk_print_settings_get_paper_width(this.raw.asInstanceOf, unit)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_PRINT_PAGES.
    */
  def getPrintPages(): GtkPrintPages = gtk_print_settings_get_print_pages(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience function to obtain the value of %GTK_PRINT_SETTINGS_PRINTER.
    */
  def getPrinter()(using Zone): String = fromCString(
    gtk_print_settings_get_printer(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_PRINTER_LPI.
    */
  def getPrinterLpi(): Double = gtk_print_settings_get_printer_lpi(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_QUALITY.
    */
  def getQuality(): GtkPrintQuality = gtk_print_settings_get_quality(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_RESOLUTION.
    */
  def getResolution(): Int = gtk_print_settings_get_resolution(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_RESOLUTION_X.
    */
  def getResolutionX(): Int = gtk_print_settings_get_resolution_x(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_RESOLUTION_Y.
    */
  def getResolutionY(): Int = gtk_print_settings_get_resolution_y(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_REVERSE.
    */
  def getReverse(): Boolean =
    gtk_print_settings_get_reverse(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_SCALE.
    */
  def getScale(): Double = gtk_print_settings_get_scale(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of %GTK_PRINT_SETTINGS_USE_COLOR.
    */
  def getUseColor(): Boolean =
    gtk_print_settings_get_use_color(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE, if a value is associated with @key.
    */
  def hasKey(key: String | CString)(using Zone): Boolean =
    gtk_print_settings_has_key(
      this.raw.asInstanceOf,
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
  def loadFile(file_name: String | CString)(using Zone): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      gtk_print_settings_load_file(
        this.raw.asInstanceOf,
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
  def loadKeyFile(key_file: Ptr[GKeyFile], group_name: String | CString)(using
      Zone
  ): GResult[Boolean] = GResult.wrap(__errorPtr =>
    gtk_print_settings_load_key_file(
      this.raw.asInstanceOf,
      key_file,
      __sn_extract_string(group_name),
      __errorPtr
    ).value.!=(0)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Associates @value with @key.
    */
  def set(key: String | CString, value: String | CString)(using Zone): Unit =
    gtk_print_settings_set(
      this.raw.asInstanceOf,
      __sn_extract_string(key),
      __sn_extract_string(value)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @key to a boolean value.
    */
  def setBool(key: String | CString, value: Boolean)(using Zone): Unit =
    gtk_print_settings_set_bool(
      this.raw.asInstanceOf,
      __sn_extract_string(key),
      gboolean(gint((if value == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_COLLATE.
    */
  def setCollate(collate: Boolean): Unit = gtk_print_settings_set_collate(
    this.raw.asInstanceOf,
    gboolean(gint((if collate == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_DEFAULT_SOURCE.
    */
  def setDefaultSource(default_source: String | CString)(using Zone): Unit =
    gtk_print_settings_set_default_source(
      this.raw.asInstanceOf,
      __sn_extract_string(default_source)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_DITHER.
    */
  def setDither(dither: String | CString)(using Zone): Unit =
    gtk_print_settings_set_dither(
      this.raw.asInstanceOf,
      __sn_extract_string(dither)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @key to a double value.
    */
  def setDouble(key: String | CString, value: Double)(using Zone): Unit =
    gtk_print_settings_set_double(
      this.raw.asInstanceOf,
      __sn_extract_string(key),
      value
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_DUPLEX.
    */
  def setDuplex(duplex: GtkPrintDuplex): Unit =
    gtk_print_settings_set_duplex(this.raw.asInstanceOf, duplex)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_FINISHINGS.
    */
  def setFinishings(finishings: String | CString)(using Zone): Unit =
    gtk_print_settings_set_finishings(
      this.raw.asInstanceOf,
      __sn_extract_string(finishings)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @key to an integer value.
    */
  def setInt(key: String | CString, value: Int)(using Zone): Unit =
    gtk_print_settings_set_int(
      this.raw.asInstanceOf,
      __sn_extract_string(key),
      value
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Associates a length in units of @unit with @key.
    */
  def setLength(key: String | CString, value: Double, unit: GtkUnit)(using
      Zone
  ): Unit = gtk_print_settings_set_length(
    this.raw.asInstanceOf,
    __sn_extract_string(key),
    value,
    unit
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_MEDIA_TYPE.
    *
    * The set of media types is defined in PWG 5101.1-2002 PWG.
    */
  def setMediaType(media_type: String | CString)(using Zone): Unit =
    gtk_print_settings_set_media_type(
      this.raw.asInstanceOf,
      __sn_extract_string(media_type)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_N_COPIES.
    */
  def setNCopies(num_copies: Int): Unit =
    gtk_print_settings_set_n_copies(this.raw.asInstanceOf, num_copies)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_NUMBER_UP.
    */
  def setNumberUp(number_up: Int): Unit =
    gtk_print_settings_set_number_up(this.raw.asInstanceOf, number_up)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_NUMBER_UP_LAYOUT.
    */
  def setNumberUpLayout(number_up_layout: GtkNumberUpLayout): Unit =
    gtk_print_settings_set_number_up_layout(
      this.raw.asInstanceOf,
      number_up_layout
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_ORIENTATION.
    */
  def setOrientation(orientation: GtkPageOrientation): Unit =
    gtk_print_settings_set_orientation(this.raw.asInstanceOf, orientation)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_OUTPUT_BIN.
    */
  def setOutputBin(output_bin: String | CString)(using Zone): Unit =
    gtk_print_settings_set_output_bin(
      this.raw.asInstanceOf,
      __sn_extract_string(output_bin)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_PAGE_RANGES.
    */
  def setPageRanges(page_ranges: Ptr[GtkPageRange], num_ranges: Int): Unit =
    gtk_print_settings_set_page_ranges(
      this.raw.asInstanceOf,
      page_ranges,
      num_ranges
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_PAGE_SET.
    */
  def setPageSet(page_set: GtkPageSet): Unit =
    gtk_print_settings_set_page_set(this.raw.asInstanceOf, page_set)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_PAPER_HEIGHT.
    */
  def setPaperHeight(height: Double, unit: GtkUnit): Unit =
    gtk_print_settings_set_paper_height(this.raw.asInstanceOf, height, unit)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_PAPER_FORMAT,
    * %GTK_PRINT_SETTINGS_PAPER_WIDTH and %GTK_PRINT_SETTINGS_PAPER_HEIGHT.
    */
  def setPaperSize(paper_size: Ptr[GtkPaperSize]): Unit =
    gtk_print_settings_set_paper_size(this.raw.asInstanceOf, paper_size)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_PAPER_WIDTH.
    */
  def setPaperWidth(width: Double, unit: GtkUnit): Unit =
    gtk_print_settings_set_paper_width(this.raw.asInstanceOf, width, unit)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_PRINT_PAGES.
    */
  def setPrintPages(pages: GtkPrintPages): Unit =
    gtk_print_settings_set_print_pages(this.raw.asInstanceOf, pages)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience function to set %GTK_PRINT_SETTINGS_PRINTER to @printer.
    */
  def setPrinter(printer: String | CString)(using Zone): Unit =
    gtk_print_settings_set_printer(
      this.raw.asInstanceOf,
      __sn_extract_string(printer)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_PRINTER_LPI.
    */
  def setPrinterLpi(lpi: Double): Unit =
    gtk_print_settings_set_printer_lpi(this.raw.asInstanceOf, lpi)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_QUALITY.
    */
  def setQuality(quality: GtkPrintQuality): Unit =
    gtk_print_settings_set_quality(this.raw.asInstanceOf, quality)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the values of %GTK_PRINT_SETTINGS_RESOLUTION,
    * %GTK_PRINT_SETTINGS_RESOLUTION_X and %GTK_PRINT_SETTINGS_RESOLUTION_Y.
    */
  def setResolution(resolution: Int): Unit =
    gtk_print_settings_set_resolution(this.raw.asInstanceOf, resolution)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the values of %GTK_PRINT_SETTINGS_RESOLUTION,
    * %GTK_PRINT_SETTINGS_RESOLUTION_X and %GTK_PRINT_SETTINGS_RESOLUTION_Y.
    */
  def setResolutionXy(resolution_x: Int, resolution_y: Int): Unit =
    gtk_print_settings_set_resolution_xy(
      this.raw.asInstanceOf,
      resolution_x,
      resolution_y
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_REVERSE.
    */
  def setReverse(reverse: Boolean): Unit = gtk_print_settings_set_reverse(
    this.raw.asInstanceOf,
    gboolean(gint((if reverse == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_SCALE.
    */
  def setScale(scale: Double): Unit =
    gtk_print_settings_set_scale(this.raw.asInstanceOf, scale)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of %GTK_PRINT_SETTINGS_USE_COLOR.
    */
  def setUseColor(use_color: Boolean): Unit = gtk_print_settings_set_use_color(
    this.raw.asInstanceOf,
    gboolean(gint((if use_color == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function saves the print settings from @settings to @file_name.
    *
    * If the file could not be written then error is set to either a
    * `GFileError` or `GKeyFileError`.
    */
  def toFile(file_name: String | CString)(using Zone): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      gtk_print_settings_to_file(
        this.raw.asInstanceOf,
        __sn_extract_string(file_name),
        __errorPtr
      ).value.!=(0)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Serialize print settings to an a{sv} variant.
    */
  def toGvariant(): Ptr[GVariant] = gtk_print_settings_to_gvariant(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function adds the print settings from @settings to @key_file.
    */
  def toKeyFile(key_file: Ptr[GKeyFile], group_name: String | CString)(using
      Zone
  ): Unit = gtk_print_settings_to_key_file(
    this.raw.asInstanceOf,
    key_file,
    __sn_extract_string(group_name)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes any value associated with @key.
    *
    * This has the same effect as setting the value to %NULL.
    */
  def unset(key: String | CString)(using Zone): Unit =
    gtk_print_settings_unset(this.raw.asInstanceOf, __sn_extract_string(key))

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
      file_name: String | CString
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
  def fromGvariant(variant: Ptr[GVariant]): PrintSettings = new PrintSettings(
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
  def fromKeyFile(key_file: Ptr[GKeyFile], group_name: String | CString)(using
      Zone
  ): GResult[PrintSettings] = GResult.wrap(__errorPtr =>
    new PrintSettings(
      gtk_print_settings_new_from_key_file(
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
end PrintSettings
