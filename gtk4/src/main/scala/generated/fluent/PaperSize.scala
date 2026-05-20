package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.{KeyFile, Variant}
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.{GTKUnit, PaperSize}
import sn.gnome.gtk4.internal.GtkPaperSize

/** `GtkPaperSize` handles paper sizes.
  *
  * It uses the standard called [PWG 5101.1-2002 PWG: Standard for Media
  * Standardized Names](http://www.pwg.org/standards.html) to name the paper
  * sizes (and to get the data for the page sizes). In addition to standard
  * paper sizes, `GtkPaperSize` allows to construct custom paper sizes with
  * arbitrary dimensions.
  *
  * The `GtkPaperSize` object stores not only the dimensions (width and height)
  * of a paper size and its name, it also provides default print margins.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PaperSize private[gnome] (raw: Ptr[GtkPaperSize]):

  def getUnsafeRawPointer(): Ptr[GtkPaperSize] = this.raw

  /** Copies an existing `GtkPaperSize`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.gtk4.PaperSize /* None */ =
    sn.gnome.gtk4.PaperSize.fromRaw(
      gtk_paper_size_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaperSize]]
      )
    )
  end copy

  /** Free the given `GtkPaperSize` object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    gtk_paper_size_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaperSize]]
    )
  end free

  /** Gets the default bottom margin for the `GtkPaperSize`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefaultBottomMargin(
      unit: sn.gnome.gtk4.GTKUnit /* Some(GtkUnit) */
  ): Double /* None */ =
    gtk_paper_size_get_default_bottom_margin(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaperSize]],
      unit.raw
    )
  end getDefaultBottomMargin

  /** Gets the default left margin for the `GtkPaperSize`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefaultLeftMargin(
      unit: sn.gnome.gtk4.GTKUnit /* Some(GtkUnit) */
  ): Double /* None */ =
    gtk_paper_size_get_default_left_margin(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaperSize]],
      unit.raw
    )
  end getDefaultLeftMargin

  /** Gets the default right margin for the `GtkPaperSize`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefaultRightMargin(
      unit: sn.gnome.gtk4.GTKUnit /* Some(GtkUnit) */
  ): Double /* None */ =
    gtk_paper_size_get_default_right_margin(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaperSize]],
      unit.raw
    )
  end getDefaultRightMargin

  /** Gets the default top margin for the `GtkPaperSize`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefaultTopMargin(
      unit: sn.gnome.gtk4.GTKUnit /* Some(GtkUnit) */
  ): Double /* None */ =
    gtk_paper_size_get_default_top_margin(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaperSize]],
      unit.raw
    )
  end getDefaultTopMargin

  /** Gets the human-readable name of the `GtkPaperSize`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDisplayName(): scala.Predef.String /* None */ =
    fromCString(
      gtk_paper_size_get_display_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaperSize]]
      ).asInstanceOf
    )
  end getDisplayName

  /** Gets the paper height of the `GtkPaperSize`, in units of @unit.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHeight(
      unit: sn.gnome.gtk4.GTKUnit /* Some(GtkUnit) */
  ): Double /* None */ =
    gtk_paper_size_get_height(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaperSize]],
      unit.raw
    )
  end getHeight

  /** Gets the name of the `GtkPaperSize`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName(): scala.Predef.String /* None */ =
    fromCString(
      gtk_paper_size_get_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaperSize]]
      ).asInstanceOf
    )
  end getName

  /** Gets the PPD name of the `GtkPaperSize`, which may be %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPpdName(): scala.Predef.String /* None */ =
    fromCString(
      gtk_paper_size_get_ppd_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaperSize]]
      ).asInstanceOf
    )
  end getPpdName

  /** Gets the paper width of the `GtkPaperSize`, in units of @unit.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWidth(
      unit: sn.gnome.gtk4.GTKUnit /* Some(GtkUnit) */
  ): Double /* None */ =
    gtk_paper_size_get_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaperSize]],
      unit.raw
    )
  end getWidth

  /** Returns %TRUE if @size is not a standard paper size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isCustom(): Boolean /* None */ =
    gtk_paper_size_is_custom(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaperSize]]
    ).value.!=(0)
  end isCustom

  /** Compares two `GtkPaperSize` objects.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isEqual(
      size2: sn.gnome.gtk4.PaperSize /* Some(Ptr[GtkPaperSize]) */
  ): Boolean /* None */ =
    gtk_paper_size_is_equal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaperSize]],
      size2.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end isEqual

  /** Returns %TRUE if @size is an IPP standard paper size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isIpp(): Boolean /* None */ =
    gtk_paper_size_is_ipp(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaperSize]]
    ).value.!=(0)
  end isIpp

  /** Changes the dimensions of a @size to @width x @height.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSize(
      width: Double /* Some(Double) */,
      height: Double /* Some(Double) */,
      unit: sn.gnome.gtk4.GTKUnit /* Some(GtkUnit) */
  ): Unit /* None */ =
    gtk_paper_size_set_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaperSize]],
      width,
      height,
      unit.raw
    )
  end setSize

  /** Serialize a paper size to an `a{sv}` variant.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toGvariant(): sn.gnome.glib.Variant /* None */ =
    sn.gnome.glib.Variant.fromRaw(
      gtk_paper_size_to_gvariant(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaperSize]]
      )
    )
  end toGvariant

  /** This function adds the paper size from @size to @key_file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toKeyFile(
      key_file: sn.gnome.glib.KeyFile /* Some(Ptr[_root_.sn.gnome.glib.internal.GKeyFile]) */,
      group_name: scala.Predef.String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_paper_size_to_key_file(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPaperSize]],
      key_file.getUnsafeRawPointer().asInstanceOf,
      toCString(group_name)
    )
  end toKeyFile

end PaperSize

object PaperSize:
  def fromRaw(ptr: Ptr[GtkPaperSize]): PaperSize = new PaperSize(ptr)
end PaperSize
