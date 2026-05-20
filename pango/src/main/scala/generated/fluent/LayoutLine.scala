package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.SList
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.runtime.*
import sn.gnome.pango.{Direction, Layout, LayoutLine}
import sn.gnome.pango.internal.PangoLayoutLine

/** A `PangoLayoutLine` represents one of the lines resulting from laying out a
  * paragraph via `PangoLayout`.
  *
  * `PangoLayoutLine` structures are obtained by calling
  * [method@Pango.Layout.get_line] and are only valid until the text,
  * attributes, or settings of the parent `PangoLayout` are modified.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class LayoutLine private[gnome] (raw: Ptr[PangoLayoutLine]):

  def getUnsafeRawPointer(): Ptr[PangoLayoutLine] = this.raw

  /** the layout this line belongs to, might be %NULL
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def layout(using Runtime): sn.gnome.pango.Layout /* None */ =
    (!raw).layout.asInstanceOf[Ptr[PangoLayout]]

  /** the layout this line belongs to, might be %NULL
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def layout_=(value: sn.gnome.pango.Layout /* None */ )(using Runtime): Unit =
    (!raw).layout_=(
      value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[PangoLayout]]
    )

  /** start of line as byte index into layout->text
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def startIndex: Int /* None */ =
    (!raw).start_index.asInstanceOf[_root_.sn.gnome.glib.internal.gint]

  /** start of line as byte index into layout->text
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def startIndex_=(value: Int /* None */ ): Unit = (!raw).start_index_=(
    gint(value).asInstanceOf[_root_.sn.gnome.glib.internal.gint]
  )

  /** length of line in bytes
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def length: Int /* None */ =
    (!raw).length.asInstanceOf[_root_.sn.gnome.glib.internal.gint]

  /** length of line in bytes
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def length_=(value: Int /* None */ ): Unit = (!raw).length_=(
    gint(value).asInstanceOf[_root_.sn.gnome.glib.internal.gint]
  )

  /** list of runs in the line, from left to right
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def runs: sn.gnome.glib.SList /* None */ =
    (!raw).runs.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSList]]

  /** list of runs in the line, from left to right
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def runs_=(value: sn.gnome.glib.SList /* None */ ): Unit = (!raw).runs_=(
    value
      .getUnsafeRawPointer()
      .asInstanceOf
      .asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSList]]
  )

  /** #TRUE if this is the first line of the paragraph
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isParagraphStart: UInt /* None */ =
    (!raw).is_paragraph_start.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** #TRUE if this is the first line of the paragraph
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isParagraphStart_=(value: UInt /* None */ ): Unit =
    (!raw).is_paragraph_start_=(
      guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
    )

  /** #Resolved PangoDirection of line
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def resolvedDir: UInt /* None */ =
    (!raw).resolved_dir.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** #Resolved PangoDirection of line
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def resolvedDir_=(value: UInt /* None */ ): Unit = (!raw).resolved_dir_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )

  /** Computes the logical and ink extents of a layout line.
    *
    * See [method@Pango.Font.get_glyph_extents] for details about the
    * interpretation of the rectangles.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_extents]: Method get_extents contains an OUT parameter, which is not supported yet"
  )
  private def getExtents__ = ???

  /** Computes the height of the line, as the maximum of the heights of fonts
    * used in this line.
    *
    * Note that the actual baseline-to-baseline distance between lines of text
    * is influenced by other factors, such as [method@Pango.Layout.set_spacing]
    * and [method@Pango.Layout.set_line_spacing].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_height]: Method get_height contains an OUT parameter, which is not supported yet"
  )
  private def getHeight__ = ???

  /** Returns the length of the line, in bytes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLength(): Int /* None */ =
    pango_layout_line_get_length(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayoutLine]]
    )
  end getLength

  /** Computes the logical and ink extents of @layout_line in device units.
    *
    * This function just calls [method@Pango.LayoutLine.get_extents] followed by
    * two [func@extents_to_pixels] calls, rounding @ink_rect and @logical_rect
    * such that the rounded rectangles fully contain the unrounded one (that is,
    * passes them as first argument to [func@extents_to_pixels]).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_pixel_extents]: Method get_pixel_extents contains an OUT parameter, which is not supported yet"
  )
  private def getPixelExtents__ = ???

  /** Returns the resolved direction of the line.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getResolvedDirection(): sn.gnome.pango.Direction /* None */ =
    sn.gnome.pango.Direction.fromRaw(
      pango_layout_line_get_resolved_direction(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayoutLine]]
      )
    )
  end getResolvedDirection

  /** Returns the start index of the line, as byte index into the text of the
    * layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStartIndex(): Int /* None */ =
    pango_layout_line_get_start_index(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayoutLine]]
    )
  end getStartIndex

  /** Gets a list of visual ranges corresponding to a given logical range.
    *
    * This list is not necessarily minimal - there may be consecutive ranges
    * which are adjacent. The ranges will be sorted from left to right. The
    * ranges are with respect to the left edge of the entire layout, not with
    * respect to the line.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_x_ranges]: Method get_x_ranges contains an OUT parameter, which is not supported yet"
  )
  private def getXRanges__ = ???

  /** Converts an index within a line to a X position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method index_to_x]: Method index_to_x contains an OUT parameter, which is not supported yet"
  )
  private def indexToX__ = ???

  /** Returns whether this is the first line of the paragraph.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isParagraphStart(): Boolean /* None */ =
    pango_layout_line_is_paragraph_start(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayoutLine]]
    ).value.!=(0)
  end isParagraphStart

  /** Increase the reference count of a `PangoLayoutLine` by one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.pango.LayoutLine /* None */ =
    sn.gnome.pango.LayoutLine.fromRaw(
      pango_layout_line_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayoutLine]]
      )
    )
  end ref

  /** Decrease the reference count of a `PangoLayoutLine` by one.
    *
    * If the result is zero, the line and all associated memory will be freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    pango_layout_line_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayoutLine]]
    )
  end unref

  /** Converts from x offset to the byte index of the corresponding character
    * within the text of the layout.
    *
    * If @x_pos is outside the line, @index_ and @trailing will point to the
    * very first or very last position in the line. This determination is based
    * on the resolved direction of the paragraph; for example, if the resolved
    * direction is right-to-left, then an X position to the right of the line
    * (after it) results in 0 being stored in @index_ and @trailing. An X
    * position to the left of the line results in @index_ pointing to the
    * (logical) last grapheme in the line and @trailing being set to the number
    * of characters in that grapheme. The reverse is true for a left-to-right
    * line.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method x_to_index]: Method x_to_index contains an OUT parameter, which is not supported yet"
  )
  private def xToIndex__ = ???

end LayoutLine

object LayoutLine:
  def fromRaw(ptr: Ptr[PangoLayoutLine]): LayoutLine = new LayoutLine(ptr)
end LayoutLine
