package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  GTKUnit,
  NumberUpLayout,
  PageOrientation,
  PageSet,
  PrintDuplex,
  PrintPages,
  PrintQuality,
  PrintSettings
}
import sn.gnome.gtk4.internal.GtkPrintSettings

/** A `GtkPrintSettings` object represents the settings of a print dialog in a
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PrintSettings(raw: Ptr[GtkPrintSettings])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Copies a `GtkPrintSettings` object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): PrintSettings /* None */ = new PrintSettings(
    gtk_print_settings_copy(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
    ).asInstanceOf
  )

  /** Calls @func for each key-value pair of @settings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method foreach/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PrintSettingsFunc), @type -> DataRecord(GtkPrintSettingsFunc)))"
  )
  private def foreach__ = ???

  /** Looks up the string value associated with @key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def get(
      key: String | CString /* Some(CString) */
  )(using Zone): String /* None */ = fromCString(
    gtk_print_settings_get(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
      __sn_extract_string(key)
    ).asInstanceOf
  )

  /** Returns the boolean represented by the value that is associated with @key.
    *
    * The string “true” represents %TRUE, any other string %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBool(
      key: String | CString /* Some(CString) */
  )(using Zone): Boolean /* None */ = gtk_print_settings_get_bool(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(key)
  ).value.!=(0)

  /** Gets the value of %GTK_PRINT_SETTINGS_COLLATE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCollate(): Boolean /* None */ = gtk_print_settings_get_collate(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
  ).value.!=(0)

  /** Gets the value of %GTK_PRINT_SETTINGS_DEFAULT_SOURCE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefaultSource()(using Zone): String /* None */ = fromCString(
    gtk_print_settings_get_default_source(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
    ).asInstanceOf
  )

  /** Gets the value of %GTK_PRINT_SETTINGS_DITHER.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDither()(using Zone): String /* None */ = fromCString(
    gtk_print_settings_get_dither(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
    ).asInstanceOf
  )

  /** Returns the double value associated with @key, or 0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDouble(
      key: String | CString /* Some(CString) */
  )(using Zone): Double /* None */ = gtk_print_settings_get_double(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(key)
  )

  /** Returns the floating point number represented by the value that is
    * associated with @key, or @default_val if the value does not represent a
    * floating point number.
    *
    * Floating point numbers are parsed with g_ascii_strtod().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDoubleWithDefault(
      key: String | CString /* Some(CString) */,
      `def`: Double /* Some(Double) */
  )(using Zone): Double /* None */ = gtk_print_settings_get_double_with_default(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(key),
    `def`
  )

  /** Gets the value of %GTK_PRINT_SETTINGS_DUPLEX.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDuplex(): PrintDuplex /* None */ = PrintDuplex.fromRaw(
    gtk_print_settings_get_duplex(this.raw.asInstanceOf[Ptr[GtkPrintSettings]])
  )

  /** Gets the value of %GTK_PRINT_SETTINGS_FINISHINGS.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFinishings()(using Zone): String /* None */ = fromCString(
    gtk_print_settings_get_finishings(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
    ).asInstanceOf
  )

  /** Returns the integer value of @key, or 0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInt(
      key: String | CString /* Some(CString) */
  )(using Zone): Int /* None */ = gtk_print_settings_get_int(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(key)
  )

  /** Returns the value of @key, interpreted as an integer, or the default
    * value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIntWithDefault(
      key: String | CString /* Some(CString) */,
      `def`: Int /* Some(CInt) */
  )(using Zone): Int /* None */ = gtk_print_settings_get_int_with_default(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(key),
    `def`
  )

  /** Returns the value associated with @key, interpreted as a length.
    *
    * The returned value is converted to @units.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLength(
      key: String | CString /* Some(CString) */,
      unit: GTKUnit /* Some(GtkUnit) */
  )(using Zone): Double /* None */ = gtk_print_settings_get_length(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(key),
    unit.raw
  )

  /** Gets the value of %GTK_PRINT_SETTINGS_MEDIA_TYPE.
    *
    * The set of media types is defined in PWG 5101.1-2002 PWG.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMediaType()(using Zone): String /* None */ = fromCString(
    gtk_print_settings_get_media_type(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
    ).asInstanceOf
  )

  /** Gets the value of %GTK_PRINT_SETTINGS_N_COPIES.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNCopies(): Int /* None */ = gtk_print_settings_get_n_copies(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
  )

  /** Gets the value of %GTK_PRINT_SETTINGS_NUMBER_UP.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNumberUp(): Int /* None */ = gtk_print_settings_get_number_up(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
  )

  /** Gets the value of %GTK_PRINT_SETTINGS_NUMBER_UP_LAYOUT.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNumberUpLayout(): NumberUpLayout /* None */ = NumberUpLayout.fromRaw(
    gtk_print_settings_get_number_up_layout(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
    )
  )

  /** Get the value of %GTK_PRINT_SETTINGS_ORIENTATION, converted to a
    * `GtkPageOrientation`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getOrientation(): PageOrientation /* None */ = PageOrientation.fromRaw(
    gtk_print_settings_get_orientation(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
    )
  )

  /** Gets the value of %GTK_PRINT_SETTINGS_OUTPUT_BIN.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getOutputBin()(using Zone): String /* None */ = fromCString(
    gtk_print_settings_get_output_bin(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
    ).asInstanceOf
  )

  /** Gets the value of %GTK_PRINT_SETTINGS_PAGE_RANGES.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_page_ranges]: Method get_page_ranges contains an OUT parameter, which is not supported yet"
  )
  private def getPageRanges__ = ???

  /** Gets the value of %GTK_PRINT_SETTINGS_PAGE_SET.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPageSet(): PageSet /* None */ = PageSet.fromRaw(
    gtk_print_settings_get_page_set(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
    )
  )

  /** Gets the value of %GTK_PRINT_SETTINGS_PAPER_HEIGHT, converted to @unit.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPaperHeight(unit: GTKUnit /* Some(GtkUnit) */ ): Double /* None */ =
    gtk_print_settings_get_paper_height(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
      unit.raw
    )

  /** Gets the value of %GTK_PRINT_SETTINGS_PAPER_FORMAT, converted to a
    * `GtkPaperSize`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_paper_size/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PaperSize), @type -> DataRecord(GtkPaperSize*)))"
  )
  private def getPaperSize__ = ???

  /** Gets the value of %GTK_PRINT_SETTINGS_PAPER_WIDTH, converted to @unit.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPaperWidth(unit: GTKUnit /* Some(GtkUnit) */ ): Double /* None */ =
    gtk_print_settings_get_paper_width(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
      unit.raw
    )

  /** Gets the value of %GTK_PRINT_SETTINGS_PRINT_PAGES.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPrintPages(): PrintPages /* None */ = PrintPages.fromRaw(
    gtk_print_settings_get_print_pages(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
    )
  )

  /** Convenience function to obtain the value of %GTK_PRINT_SETTINGS_PRINTER.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPrinter()(using Zone): String /* None */ = fromCString(
    gtk_print_settings_get_printer(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
    ).asInstanceOf
  )

  /** Gets the value of %GTK_PRINT_SETTINGS_PRINTER_LPI.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPrinterLpi(): Double /* None */ = gtk_print_settings_get_printer_lpi(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
  )

  /** Gets the value of %GTK_PRINT_SETTINGS_QUALITY.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getQuality(): PrintQuality /* None */ = PrintQuality.fromRaw(
    gtk_print_settings_get_quality(this.raw.asInstanceOf[Ptr[GtkPrintSettings]])
  )

  /** Gets the value of %GTK_PRINT_SETTINGS_RESOLUTION.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getResolution(): Int /* None */ = gtk_print_settings_get_resolution(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
  )

  /** Gets the value of %GTK_PRINT_SETTINGS_RESOLUTION_X.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getResolutionX(): Int /* None */ = gtk_print_settings_get_resolution_x(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
  )

  /** Gets the value of %GTK_PRINT_SETTINGS_RESOLUTION_Y.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getResolutionY(): Int /* None */ = gtk_print_settings_get_resolution_y(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
  )

  /** Gets the value of %GTK_PRINT_SETTINGS_REVERSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getReverse(): Boolean /* None */ = gtk_print_settings_get_reverse(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
  ).value.!=(0)

  /** Gets the value of %GTK_PRINT_SETTINGS_SCALE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getScale(): Double /* None */ = gtk_print_settings_get_scale(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
  )

  /** Gets the value of %GTK_PRINT_SETTINGS_USE_COLOR.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUseColor(): Boolean /* None */ = gtk_print_settings_get_use_color(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]]
  ).value.!=(0)

  /** Returns %TRUE, if a value is associated with @key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasKey(
      key: String | CString /* Some(CString) */
  )(using Zone): Boolean /* None */ = gtk_print_settings_has_key(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(key)
  ).value.!=(0)

  /** Reads the print settings from @file_name.
    *
    * If the file could not be loaded then error is set to either a `GFileError`
    * or `GKeyFileError`.
    *
    * See [method@Gtk.PrintSettings.to_file].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

  /** Reads the print settings from the group @group_name in @key_file.
    *
    * If the file could not be loaded then error is set to either a `GFileError`
    * or `GKeyFileError`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method load_key_file/<method parameters>/key_file]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.KeyFile), @type -> DataRecord(GKeyFile*)))"
  )
  private def loadKeyFile__ = ???

  /** Associates @value with @key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

  /** Sets @key to a boolean value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBool(
      key: String | CString /* Some(CString) */,
      value: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Zone): Unit /* None */ = gtk_print_settings_set_bool(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(key),
    gboolean(gint((if value == true then 1 else 0)))
  )

  /** Sets the value of %GTK_PRINT_SETTINGS_COLLATE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCollate(
      collate: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_print_settings_set_collate(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    gboolean(gint((if collate == true then 1 else 0)))
  )

  /** Sets the value of %GTK_PRINT_SETTINGS_DEFAULT_SOURCE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDefaultSource(
      default_source: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_print_settings_set_default_source(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(default_source)
  )

  /** Sets the value of %GTK_PRINT_SETTINGS_DITHER.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDither(
      dither: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_print_settings_set_dither(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(dither)
  )

  /** Sets @key to a double value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDouble(
      key: String | CString /* Some(CString) */,
      value: Double /* Some(Double) */
  )(using Zone): Unit /* None */ = gtk_print_settings_set_double(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(key),
    value
  )

  /** Sets the value of %GTK_PRINT_SETTINGS_DUPLEX.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDuplex(
      duplex: PrintDuplex /* Some(GtkPrintDuplex) */
  ): Unit /* None */ = gtk_print_settings_set_duplex(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    duplex.raw
  )

  /** Sets the value of %GTK_PRINT_SETTINGS_FINISHINGS.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFinishings(
      finishings: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_print_settings_set_finishings(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(finishings)
  )

  /** Sets @key to an integer value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInt(
      key: String | CString /* Some(CString) */,
      value: Int /* Some(CInt) */
  )(using Zone): Unit /* None */ = gtk_print_settings_set_int(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(key),
    value
  )

  /** Associates a length in units of @unit with @key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

  /** Sets the value of %GTK_PRINT_SETTINGS_MEDIA_TYPE.
    *
    * The set of media types is defined in PWG 5101.1-2002 PWG.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMediaType(
      media_type: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_print_settings_set_media_type(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(media_type)
  )

  /** Sets the value of %GTK_PRINT_SETTINGS_N_COPIES.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setNCopies(num_copies: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_print_settings_set_n_copies(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
      num_copies
    )

  /** Sets the value of %GTK_PRINT_SETTINGS_NUMBER_UP.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setNumberUp(number_up: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_print_settings_set_number_up(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
      number_up
    )

  /** Sets the value of %GTK_PRINT_SETTINGS_NUMBER_UP_LAYOUT.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setNumberUpLayout(
      number_up_layout: NumberUpLayout /* Some(GtkNumberUpLayout) */
  ): Unit /* None */ = gtk_print_settings_set_number_up_layout(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    number_up_layout.raw
  )

  /** Sets the value of %GTK_PRINT_SETTINGS_ORIENTATION.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setOrientation(
      orientation: PageOrientation /* Some(GtkPageOrientation) */
  ): Unit /* None */ = gtk_print_settings_set_orientation(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    orientation.raw
  )

  /** Sets the value of %GTK_PRINT_SETTINGS_OUTPUT_BIN.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setOutputBin(
      output_bin: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_print_settings_set_output_bin(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(output_bin)
  )

  /** Sets the value of %GTK_PRINT_SETTINGS_PAGE_RANGES.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_page_ranges/<method parameters>/page_ranges]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(PageRange), @type -> DataRecord(GtkPageRange)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(GtkPageRange*)))"
  )
  private def setPageRanges__ = ???

  /** Sets the value of %GTK_PRINT_SETTINGS_PAGE_SET.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPageSet(page_set: PageSet /* Some(GtkPageSet) */ ): Unit /* None */ =
    gtk_print_settings_set_page_set(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
      page_set.raw
    )

  /** Sets the value of %GTK_PRINT_SETTINGS_PAPER_HEIGHT.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPaperHeight(
      height: Double /* Some(Double) */,
      unit: GTKUnit /* Some(GtkUnit) */
  ): Unit /* None */ = gtk_print_settings_set_paper_height(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    height,
    unit.raw
  )

  /** Sets the value of %GTK_PRINT_SETTINGS_PAPER_FORMAT,
    * %GTK_PRINT_SETTINGS_PAPER_WIDTH and %GTK_PRINT_SETTINGS_PAPER_HEIGHT.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_paper_size/<method parameters>/paper_size]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PaperSize), @type -> DataRecord(GtkPaperSize*)))"
  )
  private def setPaperSize__ = ???

  /** Sets the value of %GTK_PRINT_SETTINGS_PAPER_WIDTH.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPaperWidth(
      width: Double /* Some(Double) */,
      unit: GTKUnit /* Some(GtkUnit) */
  ): Unit /* None */ = gtk_print_settings_set_paper_width(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    width,
    unit.raw
  )

  /** Sets the value of %GTK_PRINT_SETTINGS_PRINT_PAGES.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPrintPages(
      pages: PrintPages /* Some(GtkPrintPages) */
  ): Unit /* None */ = gtk_print_settings_set_print_pages(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    pages.raw
  )

  /** Convenience function to set %GTK_PRINT_SETTINGS_PRINTER to @printer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPrinter(
      printer: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_print_settings_set_printer(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    __sn_extract_string(printer)
  )

  /** Sets the value of %GTK_PRINT_SETTINGS_PRINTER_LPI.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPrinterLpi(lpi: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_print_settings_set_printer_lpi(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
      lpi
    )

  /** Sets the value of %GTK_PRINT_SETTINGS_QUALITY.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setQuality(
      quality: PrintQuality /* Some(GtkPrintQuality) */
  ): Unit /* None */ = gtk_print_settings_set_quality(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    quality.raw
  )

  /** Sets the values of %GTK_PRINT_SETTINGS_RESOLUTION,
    * %GTK_PRINT_SETTINGS_RESOLUTION_X and %GTK_PRINT_SETTINGS_RESOLUTION_Y.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setResolution(resolution: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_print_settings_set_resolution(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
      resolution
    )

  /** Sets the values of %GTK_PRINT_SETTINGS_RESOLUTION,
    * %GTK_PRINT_SETTINGS_RESOLUTION_X and %GTK_PRINT_SETTINGS_RESOLUTION_Y.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setResolutionXy(
      resolution_x: Int /* Some(CInt) */,
      resolution_y: Int /* Some(CInt) */
  ): Unit /* None */ = gtk_print_settings_set_resolution_xy(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    resolution_x,
    resolution_y
  )

  /** Sets the value of %GTK_PRINT_SETTINGS_REVERSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setReverse(
      reverse: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_print_settings_set_reverse(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    gboolean(gint((if reverse == true then 1 else 0)))
  )

  /** Sets the value of %GTK_PRINT_SETTINGS_SCALE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setScale(scale: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_print_settings_set_scale(
      this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
      scale
    )

  /** Sets the value of %GTK_PRINT_SETTINGS_USE_COLOR.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUseColor(
      use_color: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_print_settings_set_use_color(
    this.raw.asInstanceOf[Ptr[GtkPrintSettings]],
    gboolean(gint((if use_color == true then 1 else 0)))
  )

  /** This function saves the print settings from @settings to @file_name.
    *
    * If the file could not be written then error is set to either a
    * `GFileError` or `GKeyFileError`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

  /** Serialize print settings to an a{sv} variant.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method to_gvariant/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def toGvariant__ = ???

  /** This function adds the print settings from @settings to @key_file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method to_key_file/<method parameters>/key_file]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.KeyFile), @type -> DataRecord(GKeyFile*)))"
  )
  private def toKeyFile__ = ???

  /** Removes any value associated with @key.
    *
    * This has the same effect as setting the value to %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
  /** Creates a new `GtkPrintSettings` object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): PrintSettings =
    val raw: Ptr[Byte] = gtk_print_settings_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[PrintSettings](raw, r => new PrintSettings(r.asInstanceOf))
  end apply

  /** Reads the print settings from @file_name.
    *
    * Returns a new `GtkPrintSettings` object with the restored settings, or
    * %NULL if an error occurred. If the file could not be loaded then error is
    * set to either a `GFileError` or `GKeyFileError`.
    *
    * See [method@Gtk.PrintSettings.to_file].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromFile(file_name: String | CString /* Some(CString) */ )(using
      Zone
  )(using Runtime): GResult[PrintSettings] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] = gtk_print_settings_new_from_file(
        __sn_extract_string(file_name),
        __errorPtr
      ).asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime].getOrCreate[PrintSettings](
          raw,
          r => new PrintSettings(r.asInstanceOf)
        )

  end fromFile

  /** Deserialize print settings from an a{sv} variant.
    *
    * The variant must be in the format produced by
    * [method@Gtk.PrintSettings.to_gvariant].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[variant]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def new_from_gvariant() = ???

  /** Reads the print settings from the group @group_name in @key_file.
    *
    * Returns a new `GtkPrintSettings` object with the restored settings, or
    * %NULL if an error occurred. If the file could not be loaded then error is
    * set to either `GFileError` or `GKeyFileError`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[key_file]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.KeyFile), @type -> DataRecord(GKeyFile*)))"
  )
  private def new_from_key_file() = ???

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end PrintSettings
