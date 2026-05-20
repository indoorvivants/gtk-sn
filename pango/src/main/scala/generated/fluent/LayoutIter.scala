package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.pango.{Layout, LayoutIter, LayoutLine}
import sn.gnome.pango.internal.PangoLayoutIter

/** A `PangoLayoutIter` can be used to iterate over the visual extents of a
  * `PangoLayout`.
  *
  * To obtain a `PangoLayoutIter`, use [method@Pango.Layout.get_iter].
  *
  * The `PangoLayoutIter` structure is opaque, and has no user-visible fields.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class LayoutIter private[gnome] (raw: Ptr[PangoLayoutIter]):

  def getUnsafeRawPointer(): Ptr[PangoLayoutIter] = this.raw

  /** Determines whether @iter is on the last line of the layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def atLastLine(): Boolean /* None */ =
    pango_layout_iter_at_last_line(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayoutIter]]
    ).value.!=(0)
  end atLastLine

  /** Copies a `PangoLayoutIter`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.pango.LayoutIter /* None */ =
    sn.gnome.pango.LayoutIter.fromRaw(
      pango_layout_iter_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayoutIter]]
      )
    )
  end copy

  /** Frees an iterator that's no longer in use.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    pango_layout_iter_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayoutIter]]
    )
  end free

  /** Gets the Y position of the current line's baseline, in layout coordinates.
    *
    * Layout coordinates have the origin at the top left of the entire layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBaseline(): Int /* None */ =
    pango_layout_iter_get_baseline(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayoutIter]]
    )
  end getBaseline

  /** Gets the extents of the current character, in layout coordinates.
    *
    * Layout coordinates have the origin at the top left of the entire layout.
    *
    * Only logical extents can sensibly be obtained for characters; ink extents
    * make sense only down to the level of clusters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_char_extents]: Method get_char_extents contains an OUT parameter, which is not supported yet"
  )
  private def getCharExtents__ = ???

  /** Gets the extents of the current cluster, in layout coordinates.
    *
    * Layout coordinates have the origin at the top left of the entire layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_cluster_extents]: Method get_cluster_extents contains an OUT parameter, which is not supported yet"
  )
  private def getClusterExtents__ = ???

  /** Gets the current byte index.
    *
    * Note that iterating forward by char moves in visual order, not logical
    * order, so indexes may not be sequential. Also, the index may be equal to
    * the length of the text in the layout, if on the %NULL run (see
    * [method@Pango.LayoutIter.get_run]).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIndex(): Int /* None */ =
    pango_layout_iter_get_index(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayoutIter]]
    )
  end getIndex

  /** Gets the layout associated with a `PangoLayoutIter`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLayout()(using Runtime): sn.gnome.pango.Layout /* None */ =
    sn.gnome.pango.Layout.applyUnsafe(
      pango_layout_iter_get_layout(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayoutIter]]
      ).asInstanceOf
    )
  end getLayout

  /** Obtains the extents of the `PangoLayout` being iterated over.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_layout_extents]: Method get_layout_extents contains an OUT parameter, which is not supported yet"
  )
  private def getLayoutExtents__ = ???

  /** Gets the current line.
    *
    * Use the faster [method@Pango.LayoutIter.get_line_readonly] if you do not
    * plan to modify the contents of the line (glyphs, glyph widths, etc.).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLine(): sn.gnome.pango.LayoutLine /* None */ =
    sn.gnome.pango.LayoutLine.fromRaw(
      pango_layout_iter_get_line(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayoutIter]]
      )
    )
  end getLine

  /** Obtains the extents of the current line.
    *
    * Extents are in layout coordinates (origin is the top-left corner of the
    * entire `PangoLayout`). Thus the extents returned by this function will be
    * the same width/height but not at the same x/y as the extents returned from
    * [method@Pango.LayoutLine.get_extents].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_line_extents]: Method get_line_extents contains an OUT parameter, which is not supported yet"
  )
  private def getLineExtents__ = ???

  /** Gets the current line for read-only access.
    *
    * This is a faster alternative to [method@Pango.LayoutIter.get_line], but
    * the user is not expected to modify the contents of the line (glyphs, glyph
    * widths, etc.).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLineReadonly(): sn.gnome.pango.LayoutLine /* None */ =
    sn.gnome.pango.LayoutLine.fromRaw(
      pango_layout_iter_get_line_readonly(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayoutIter]]
      )
    )
  end getLineReadonly

  /** Divides the vertical space in the `PangoLayout` being iterated over
    * between the lines in the layout, and returns the space belonging to the
    * current line.
    *
    * A line's range includes the line's logical extents. plus half of the
    * spacing above and below the line, if [method@Pango.Layout.set_spacing] has
    * been called to set layout spacing. The Y positions are in layout
    * coordinates (origin at top left of the entire layout).
    *
    * Note: Since 1.44, Pango uses line heights for placing lines, and there may
    * be gaps between the ranges returned by this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_line_yrange]: Method get_line_yrange contains an OUT parameter, which is not supported yet"
  )
  private def getLineYrange__ = ???

  /** Gets the current run.
    *
    * When iterating by run, at the end of each line, there's a position with a
    * %NULL run, so this function can return %NULL. The %NULL run at the end of
    * each line ensures that all lines have at least one run, even lines
    * consisting of only a newline.
    *
    * Use the faster [method@Pango.LayoutIter.get_run_readonly] if you do not
    * plan to modify the contents of the run (glyphs, glyph widths, etc.).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_run/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(LayoutRun), @type -> DataRecord(PangoLayoutRun*)))"
  )
  private def getRun__ = ???

  /** Gets the Y position of the current run's baseline, in layout coordinates.
    *
    * Layout coordinates have the origin at the top left of the entire layout.
    *
    * The run baseline can be different from the line baseline, for example due
    * to superscript or subscript positioning.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRunBaseline(): Int /* None */ =
    pango_layout_iter_get_run_baseline(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayoutIter]]
    )
  end getRunBaseline

  /** Gets the extents of the current run in layout coordinates.
    *
    * Layout coordinates have the origin at the top left of the entire layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_run_extents]: Method get_run_extents contains an OUT parameter, which is not supported yet"
  )
  private def getRunExtents__ = ???

  /** Gets the current run for read-only access.
    *
    * When iterating by run, at the end of each line, there's a position with a
    * %NULL run, so this function can return %NULL. The %NULL run at the end of
    * each line ensures that all lines have at least one run, even lines
    * consisting of only a newline.
    *
    * This is a faster alternative to [method@Pango.LayoutIter.get_run], but the
    * user is not expected to modify the contents of the run (glyphs, glyph
    * widths, etc.).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_run_readonly/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(LayoutRun), @type -> DataRecord(PangoLayoutRun*)))"
  )
  private def getRunReadonly__ = ???

  /** Moves @iter forward to the next character in visual order.
    *
    * If @iter was already at the end of the layout, returns %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nextChar(): Boolean /* None */ =
    pango_layout_iter_next_char(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayoutIter]]
    ).value.!=(0)
  end nextChar

  /** Moves @iter forward to the next cluster in visual order.
    *
    * If @iter was already at the end of the layout, returns %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nextCluster(): Boolean /* None */ =
    pango_layout_iter_next_cluster(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayoutIter]]
    ).value.!=(0)
  end nextCluster

  /** Moves @iter forward to the start of the next line.
    *
    * If @iter is already on the last line, returns %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nextLine(): Boolean /* None */ =
    pango_layout_iter_next_line(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayoutIter]]
    ).value.!=(0)
  end nextLine

  /** Moves @iter forward to the next run in visual order.
    *
    * If @iter was already at the end of the layout, returns %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nextRun(): Boolean /* None */ =
    pango_layout_iter_next_run(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayoutIter]]
    ).value.!=(0)
  end nextRun

end LayoutIter

object LayoutIter:
  def fromRaw(ptr: Ptr[PangoLayoutIter]): LayoutIter = new LayoutIter(ptr)
end LayoutIter
