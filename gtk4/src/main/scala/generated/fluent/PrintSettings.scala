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
import sn.gnome.gtk4.internal.GtkPageSet
import sn.gnome.gtk4.internal.GtkPaperSize
import sn.gnome.gtk4.internal.GtkPrintDuplex
import sn.gnome.gtk4.internal.GtkPrintPages
import sn.gnome.gtk4.internal.GtkPrintQuality
import sn.gnome.gtk4.internal.GtkPrintSettings
import sn.gnome.gtk4.internal.GtkPrintSettingsFunc
import sn.gnome.gtk4.internal.GtkUnit

class PrintSettings(raw: Ptr[GtkPrintSettings])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def copy(): PrintSettings = new PrintSettings(
    gtk_print_settings_copy(this.raw.asInstanceOf).asInstanceOf
  )

  def foreach(func: GtkPrintSettingsFunc, user_data: Ptr[Byte]): Unit =
    gtk_print_settings_foreach(this.raw.asInstanceOf, func, gpointer(user_data))

  def get(key: String | CString)(using Zone): String = fromCString(
    gtk_print_settings_get(
      this.raw.asInstanceOf,
      __sn_extract_string(key)
    ).asInstanceOf
  )

  def getBool(key: String | CString)(using Zone): Boolean =
    gtk_print_settings_get_bool(
      this.raw.asInstanceOf,
      __sn_extract_string(key)
    ).value.!=(0)

  def getCollate(): Boolean =
    gtk_print_settings_get_collate(this.raw.asInstanceOf).value.!=(0)

  def getDefaultSource()(using Zone): String = fromCString(
    gtk_print_settings_get_default_source(this.raw.asInstanceOf).asInstanceOf
  )

  def getDither()(using Zone): String = fromCString(
    gtk_print_settings_get_dither(this.raw.asInstanceOf).asInstanceOf
  )

  def getDouble(key: String | CString)(using Zone): Double =
    gtk_print_settings_get_double(
      this.raw.asInstanceOf,
      __sn_extract_string(key)
    )

  def getDoubleWithDefault(key: String | CString, `def`: Double)(using
      Zone
  ): Double = gtk_print_settings_get_double_with_default(
    this.raw.asInstanceOf,
    __sn_extract_string(key),
    `def`
  )

  def getDuplex(): GtkPrintDuplex = gtk_print_settings_get_duplex(
    this.raw.asInstanceOf
  )

  def getFinishings()(using Zone): String = fromCString(
    gtk_print_settings_get_finishings(this.raw.asInstanceOf).asInstanceOf
  )

  def getInt(key: String | CString)(using Zone): Int =
    gtk_print_settings_get_int(this.raw.asInstanceOf, __sn_extract_string(key))

  def getIntWithDefault(key: String | CString, `def`: Int)(using Zone): Int =
    gtk_print_settings_get_int_with_default(
      this.raw.asInstanceOf,
      __sn_extract_string(key),
      `def`
    )

  def getLength(key: String | CString, unit: GtkUnit)(using Zone): Double =
    gtk_print_settings_get_length(
      this.raw.asInstanceOf,
      __sn_extract_string(key),
      unit
    )

  def getMediaType()(using Zone): String = fromCString(
    gtk_print_settings_get_media_type(this.raw.asInstanceOf).asInstanceOf
  )

  def getNCopies(): Int = gtk_print_settings_get_n_copies(this.raw.asInstanceOf)

  def getNumberUp(): Int = gtk_print_settings_get_number_up(
    this.raw.asInstanceOf
  )

  def getNumberUpLayout(): GtkNumberUpLayout =
    gtk_print_settings_get_number_up_layout(this.raw.asInstanceOf)

  def getOrientation(): GtkPageOrientation = gtk_print_settings_get_orientation(
    this.raw.asInstanceOf
  )

  def getOutputBin()(using Zone): String = fromCString(
    gtk_print_settings_get_output_bin(this.raw.asInstanceOf).asInstanceOf
  )

  // Method get_page_ranges contains an OUT parameter, which is not supported yet

  def getPageSet(): GtkPageSet = gtk_print_settings_get_page_set(
    this.raw.asInstanceOf
  )

  def getPaperHeight(unit: GtkUnit): Double =
    gtk_print_settings_get_paper_height(this.raw.asInstanceOf, unit)

  def getPaperSize(): Ptr[GtkPaperSize] = gtk_print_settings_get_paper_size(
    this.raw.asInstanceOf
  )

  def getPaperWidth(unit: GtkUnit): Double =
    gtk_print_settings_get_paper_width(this.raw.asInstanceOf, unit)

  def getPrintPages(): GtkPrintPages = gtk_print_settings_get_print_pages(
    this.raw.asInstanceOf
  )

  def getPrinter()(using Zone): String = fromCString(
    gtk_print_settings_get_printer(this.raw.asInstanceOf).asInstanceOf
  )

  def getPrinterLpi(): Double = gtk_print_settings_get_printer_lpi(
    this.raw.asInstanceOf
  )

  def getQuality(): GtkPrintQuality = gtk_print_settings_get_quality(
    this.raw.asInstanceOf
  )

  def getResolution(): Int = gtk_print_settings_get_resolution(
    this.raw.asInstanceOf
  )

  def getResolutionX(): Int = gtk_print_settings_get_resolution_x(
    this.raw.asInstanceOf
  )

  def getResolutionY(): Int = gtk_print_settings_get_resolution_y(
    this.raw.asInstanceOf
  )

  def getReverse(): Boolean =
    gtk_print_settings_get_reverse(this.raw.asInstanceOf).value.!=(0)

  def getScale(): Double = gtk_print_settings_get_scale(this.raw.asInstanceOf)

  def getUseColor(): Boolean =
    gtk_print_settings_get_use_color(this.raw.asInstanceOf).value.!=(0)

  def hasKey(key: String | CString)(using Zone): Boolean =
    gtk_print_settings_has_key(
      this.raw.asInstanceOf,
      __sn_extract_string(key)
    ).value.!=(0)

  def loadFile(file_name: String | CString)(using Zone): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      gtk_print_settings_load_file(
        this.raw.asInstanceOf,
        __sn_extract_string(file_name),
        __errorPtr
      ).value.!=(0)
    )

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

  def set(key: String | CString, value: String | CString)(using Zone): Unit =
    gtk_print_settings_set(
      this.raw.asInstanceOf,
      __sn_extract_string(key),
      __sn_extract_string(value)
    )

  def setBool(key: String | CString, value: Boolean)(using Zone): Unit =
    gtk_print_settings_set_bool(
      this.raw.asInstanceOf,
      __sn_extract_string(key),
      gboolean(gint((if value == true then 1 else 0)))
    )

  def setCollate(collate: Boolean): Unit = gtk_print_settings_set_collate(
    this.raw.asInstanceOf,
    gboolean(gint((if collate == true then 1 else 0)))
  )

  def setDefaultSource(default_source: String | CString)(using Zone): Unit =
    gtk_print_settings_set_default_source(
      this.raw.asInstanceOf,
      __sn_extract_string(default_source)
    )

  def setDither(dither: String | CString)(using Zone): Unit =
    gtk_print_settings_set_dither(
      this.raw.asInstanceOf,
      __sn_extract_string(dither)
    )

  def setDouble(key: String | CString, value: Double)(using Zone): Unit =
    gtk_print_settings_set_double(
      this.raw.asInstanceOf,
      __sn_extract_string(key),
      value
    )

  def setDuplex(duplex: GtkPrintDuplex): Unit =
    gtk_print_settings_set_duplex(this.raw.asInstanceOf, duplex)

  def setFinishings(finishings: String | CString)(using Zone): Unit =
    gtk_print_settings_set_finishings(
      this.raw.asInstanceOf,
      __sn_extract_string(finishings)
    )

  def setInt(key: String | CString, value: Int)(using Zone): Unit =
    gtk_print_settings_set_int(
      this.raw.asInstanceOf,
      __sn_extract_string(key),
      value
    )

  def setLength(key: String | CString, value: Double, unit: GtkUnit)(using
      Zone
  ): Unit = gtk_print_settings_set_length(
    this.raw.asInstanceOf,
    __sn_extract_string(key),
    value,
    unit
  )

  def setMediaType(media_type: String | CString)(using Zone): Unit =
    gtk_print_settings_set_media_type(
      this.raw.asInstanceOf,
      __sn_extract_string(media_type)
    )

  def setNCopies(num_copies: Int): Unit =
    gtk_print_settings_set_n_copies(this.raw.asInstanceOf, num_copies)

  def setNumberUp(number_up: Int): Unit =
    gtk_print_settings_set_number_up(this.raw.asInstanceOf, number_up)

  def setNumberUpLayout(number_up_layout: GtkNumberUpLayout): Unit =
    gtk_print_settings_set_number_up_layout(
      this.raw.asInstanceOf,
      number_up_layout
    )

  def setOrientation(orientation: GtkPageOrientation): Unit =
    gtk_print_settings_set_orientation(this.raw.asInstanceOf, orientation)

  def setOutputBin(output_bin: String | CString)(using Zone): Unit =
    gtk_print_settings_set_output_bin(
      this.raw.asInstanceOf,
      __sn_extract_string(output_bin)
    )

  // Method set_page_ranges contains an array parameter, which is not supported yet

  def setPageSet(page_set: GtkPageSet): Unit =
    gtk_print_settings_set_page_set(this.raw.asInstanceOf, page_set)

  def setPaperHeight(height: Double, unit: GtkUnit): Unit =
    gtk_print_settings_set_paper_height(this.raw.asInstanceOf, height, unit)

  def setPaperSize(paper_size: Ptr[GtkPaperSize]): Unit =
    gtk_print_settings_set_paper_size(this.raw.asInstanceOf, paper_size)

  def setPaperWidth(width: Double, unit: GtkUnit): Unit =
    gtk_print_settings_set_paper_width(this.raw.asInstanceOf, width, unit)

  def setPrintPages(pages: GtkPrintPages): Unit =
    gtk_print_settings_set_print_pages(this.raw.asInstanceOf, pages)

  def setPrinter(printer: String | CString)(using Zone): Unit =
    gtk_print_settings_set_printer(
      this.raw.asInstanceOf,
      __sn_extract_string(printer)
    )

  def setPrinterLpi(lpi: Double): Unit =
    gtk_print_settings_set_printer_lpi(this.raw.asInstanceOf, lpi)

  def setQuality(quality: GtkPrintQuality): Unit =
    gtk_print_settings_set_quality(this.raw.asInstanceOf, quality)

  def setResolution(resolution: Int): Unit =
    gtk_print_settings_set_resolution(this.raw.asInstanceOf, resolution)

  def setResolutionXy(resolution_x: Int, resolution_y: Int): Unit =
    gtk_print_settings_set_resolution_xy(
      this.raw.asInstanceOf,
      resolution_x,
      resolution_y
    )

  def setReverse(reverse: Boolean): Unit = gtk_print_settings_set_reverse(
    this.raw.asInstanceOf,
    gboolean(gint((if reverse == true then 1 else 0)))
  )

  def setScale(scale: Double): Unit =
    gtk_print_settings_set_scale(this.raw.asInstanceOf, scale)

  def setUseColor(use_color: Boolean): Unit = gtk_print_settings_set_use_color(
    this.raw.asInstanceOf,
    gboolean(gint((if use_color == true then 1 else 0)))
  )

  def toFile(file_name: String | CString)(using Zone): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      gtk_print_settings_to_file(
        this.raw.asInstanceOf,
        __sn_extract_string(file_name),
        __errorPtr
      ).value.!=(0)
    )

  def toGvariant(): Ptr[GVariant] = gtk_print_settings_to_gvariant(
    this.raw.asInstanceOf
  )

  def toKeyFile(key_file: Ptr[GKeyFile], group_name: String | CString)(using
      Zone
  ): Unit = gtk_print_settings_to_key_file(
    this.raw.asInstanceOf,
    key_file,
    __sn_extract_string(group_name)
  )

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
  def apply(): PrintSettings = new PrintSettings(
    gtk_print_settings_new().asInstanceOf
  )
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
  def fromGvariant(variant: Ptr[GVariant]): PrintSettings = new PrintSettings(
    gtk_print_settings_new_from_gvariant(variant).asInstanceOf
  )
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
