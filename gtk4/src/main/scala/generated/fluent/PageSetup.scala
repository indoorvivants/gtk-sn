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

class PageSetup(raw: Ptr[GtkPageSetup]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def copy(): PageSetup = new PageSetup(
    gtk_page_setup_copy(this.raw.asInstanceOf).asInstanceOf
  )

  def getBottomMargin(unit: GtkUnit): Double =
    gtk_page_setup_get_bottom_margin(this.raw.asInstanceOf, unit)

  def getLeftMargin(unit: GtkUnit): Double =
    gtk_page_setup_get_left_margin(this.raw.asInstanceOf, unit)

  def getOrientation(): GtkPageOrientation = gtk_page_setup_get_orientation(
    this.raw.asInstanceOf
  )

  def getPageHeight(unit: GtkUnit): Double =
    gtk_page_setup_get_page_height(this.raw.asInstanceOf, unit)

  def getPageWidth(unit: GtkUnit): Double =
    gtk_page_setup_get_page_width(this.raw.asInstanceOf, unit)

  def getPaperHeight(unit: GtkUnit): Double =
    gtk_page_setup_get_paper_height(this.raw.asInstanceOf, unit)

  def getPaperSize(): Ptr[GtkPaperSize] = gtk_page_setup_get_paper_size(
    this.raw.asInstanceOf
  )

  def getPaperWidth(unit: GtkUnit): Double =
    gtk_page_setup_get_paper_width(this.raw.asInstanceOf, unit)

  def getRightMargin(unit: GtkUnit): Double =
    gtk_page_setup_get_right_margin(this.raw.asInstanceOf, unit)

  def getTopMargin(unit: GtkUnit): Double =
    gtk_page_setup_get_top_margin(this.raw.asInstanceOf, unit)

  def loadFile(file_name: String | CString)(using Zone): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      gtk_page_setup_load_file(
        this.raw.asInstanceOf,
        __sn_extract_string(file_name),
        __errorPtr
      ).value.!=(0)
    )

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

  def setBottomMargin(margin: Double, unit: GtkUnit): Unit =
    gtk_page_setup_set_bottom_margin(this.raw.asInstanceOf, margin, unit)

  def setLeftMargin(margin: Double, unit: GtkUnit): Unit =
    gtk_page_setup_set_left_margin(this.raw.asInstanceOf, margin, unit)

  def setOrientation(orientation: GtkPageOrientation): Unit =
    gtk_page_setup_set_orientation(this.raw.asInstanceOf, orientation)

  def setPaperSize(size: Ptr[GtkPaperSize]): Unit =
    gtk_page_setup_set_paper_size(this.raw.asInstanceOf, size)

  def setPaperSizeAndDefaultMargins(size: Ptr[GtkPaperSize]): Unit =
    gtk_page_setup_set_paper_size_and_default_margins(
      this.raw.asInstanceOf,
      size
    )

  def setRightMargin(margin: Double, unit: GtkUnit): Unit =
    gtk_page_setup_set_right_margin(this.raw.asInstanceOf, margin, unit)

  def setTopMargin(margin: Double, unit: GtkUnit): Unit =
    gtk_page_setup_set_top_margin(this.raw.asInstanceOf, margin, unit)

  def toFile(file_name: String | CString)(using Zone): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      gtk_page_setup_to_file(
        this.raw.asInstanceOf,
        __sn_extract_string(file_name),
        __errorPtr
      ).value.!=(0)
    )

  def toGvariant(): Ptr[GVariant] = gtk_page_setup_to_gvariant(
    this.raw.asInstanceOf
  )

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
  def apply(): PageSetup = new PageSetup(gtk_page_setup_new().asInstanceOf)
  def fromFile(file_name: String | CString)(using Zone): GResult[PageSetup] =
    GResult.wrap(__errorPtr =>
      new PageSetup(
        gtk_page_setup_new_from_file(
          __sn_extract_string(file_name),
          __errorPtr
        ).asInstanceOf
      )
    )
  def fromGvariant(variant: Ptr[GVariant]): PageSetup = new PageSetup(
    gtk_page_setup_new_from_gvariant(variant).asInstanceOf
  )
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
