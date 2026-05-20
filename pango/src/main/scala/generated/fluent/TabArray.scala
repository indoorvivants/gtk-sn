package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint, guint32, gunichar}
import sn.gnome.pango.{TabAlign, TabArray}
import sn.gnome.pango.internal.PangoTabArray

/** A `PangoTabArray` contains an array of tab stops.
  *
  * `PangoTabArray` can be used to set tab stops in a `PangoLayout`. Each tab
  * stop has an alignment, a position, and optionally a character to use as
  * decimal point.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TabArray private[gnome] (raw: Ptr[PangoTabArray]):

  def getUnsafeRawPointer(): Ptr[PangoTabArray] = this.raw

  /** Copies a `PangoTabArray`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.pango.TabArray /* None */ =
    sn.gnome.pango.TabArray.fromRaw(
      pango_tab_array_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoTabArray]]
      )
    )
  end copy

  /** Frees a tab array and associated resources.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    pango_tab_array_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoTabArray]]
    )
  end free

  /** Gets the Unicode character to use as decimal point.
    *
    * This is only relevant for tabs with %PANGO_TAB_DECIMAL alignment, which
    * align content at the first occurrence of the decimal point character.
    *
    * The default value of 0 means that Pango will use the decimal point
    * according to the current locale.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDecimalPoint(
      tab_index: Int /* Some(CInt) */
  ): CUnsignedInt /* None */ =
    pango_tab_array_get_decimal_point(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoTabArray]],
      tab_index
    ).value
  end getDecimalPoint

  /** Returns %TRUE if the tab positions are in pixels, %FALSE if they are in
    * Pango units.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPositionsInPixels(): Boolean /* None */ =
    pango_tab_array_get_positions_in_pixels(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoTabArray]]
    ).value.!=(0)
  end getPositionsInPixels

  /** Gets the number of tab stops in @tab_array.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSize(): Int /* None */ =
    pango_tab_array_get_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoTabArray]]
    ).value
  end getSize

  /** Gets the alignment and position of a tab stop.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_tab]: Method get_tab contains an OUT parameter, which is not supported yet"
  )
  private def getTab__ = ???

  /** If non-%NULL, @alignments and @locations are filled with allocated arrays.
    *
    * The arrays are of length [method@Pango.TabArray.get_size]. You must free
    * the returned array.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_tabs]: Method get_tabs contains an OUT parameter, which is not supported yet"
  )
  private def getTabs__ = ???

  /** Resizes a tab array.
    *
    * You must subsequently initialize any tabs that were added as a result of
    * growing the array.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def resize(
      new_size: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): Unit /* None */ =
    pango_tab_array_resize(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoTabArray]],
      gint(new_size)
    )
  end resize

  /** Sets the Unicode character to use as decimal point.
    *
    * This is only relevant for tabs with %PANGO_TAB_DECIMAL alignment, which
    * align content at the first occurrence of the decimal point character.
    *
    * By default, Pango uses the decimal point according to the current locale.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDecimalPoint(
      tab_index: Int /* Some(CInt) */,
      decimal_point: CUnsignedInt /* Some(_root_.sn.gnome.glib.internal.gunichar) */
  ): Unit /* None */ =
    pango_tab_array_set_decimal_point(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoTabArray]],
      tab_index,
      gunichar(guint32(decimal_point))
    )
  end setDecimalPoint

  /** Sets whether positions in this array are specified in pixels.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPositionsInPixels(
      positions_in_pixels: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    pango_tab_array_set_positions_in_pixels(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoTabArray]],
      gboolean(gint((if positions_in_pixels == true then 1 else 0)))
    )
  end setPositionsInPixels

  /** Sets the alignment and location of a tab stop.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTab(
      tab_index: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      alignment: sn.gnome.pango.TabAlign /* Some(PangoTabAlign) */,
      location: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): Unit /* None */ =
    pango_tab_array_set_tab(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoTabArray]],
      gint(tab_index),
      alignment.raw,
      gint(location)
    )
  end setTab

  /** Utility function to ensure that the tab stops are in increasing order.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def sort(): Unit /* None */ =
    pango_tab_array_sort(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoTabArray]]
    )
  end sort

  /** Serializes a `PangoTabArray` to a string.
    *
    * No guarantees are made about the format of the string, it may change
    * between Pango versions.
    *
    * The intended use of this function is testing and debugging. The format is
    * not meant as a permanent storage format.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def _toString(): scala.Predef.String /* None */ =
    fromCString(
      pango_tab_array_to_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoTabArray]]
      ).asInstanceOf
    )
  end _toString

end TabArray

object TabArray:
  def fromRaw(ptr: Ptr[PangoTabArray]): TabArray = new TabArray(ptr)
end TabArray
