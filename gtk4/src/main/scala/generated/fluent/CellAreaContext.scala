package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.CellArea
import sn.gnome.gtk4.internal.GtkCellAreaContext

/** Stores geometrical information for a series of rows in a GtkCellArea
  *
  * The `GtkCellAreaContext` object is created by a given `GtkCellArea`
  * implementation via its `GtkCellAreaClass.create_context()` virtual method
  * and is used to store cell sizes and alignments for a series of
  * `GtkTreeModel` rows that are requested and rendered in the same context.
  *
  * `GtkCellLayout` widgets can create any number of contexts in which to
  * request and render groups of data rows. However, it’s important that the
  * same context which was used to request sizes for a given `GtkTreeModel` row
  * also be used for the same row when calling other `GtkCellArea` APIs such as
  * gtk_cell_area_render() and gtk_cell_area_event().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CellAreaContext(raw: Ptr[GtkCellAreaContext])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Allocates a width and/or a height for all rows which are to be rendered
    * with @context.
    *
    * Usually allocation is performed only horizontally or sometimes vertically
    * since a group of rows are usually rendered side by side vertically or
    * horizontally and share either the same width or the same height. Sometimes
    * they are allocated in both horizontal and vertical orientations producing
    * a homogeneous effect of the rows. This is generally the case for
    * `GtkTreeView` when `GtkTreeView:fixed-height-mode` is enabled.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def allocate(
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  ): Unit /* None */ = gtk_cell_area_context_allocate(
    this.raw.asInstanceOf[Ptr[GtkCellAreaContext]],
    width,
    height
  )

  /** Fetches the current allocation size for @context.
    *
    * If the context was not allocated in width or height, or if the context was
    * recently reset with gtk_cell_area_context_reset(), the returned value will
    * be -1.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_allocation]: Method get_allocation contains an OUT parameter, which is not supported yet"
  )
  private def getAllocation__ = ???

  /** Fetches the `GtkCellArea` this @context was created by.
    *
    * This is generally unneeded by layouting widgets; however, it is important
    * for the context implementation itself to fetch information about the area
    * it is being used for.
    *
    * For instance at `GtkCellAreaContextClass.allocate()` time it’s important
    * to know details about any cell spacing that the `GtkCellArea` is
    * configured with in order to compute a proper allocation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getArea(): CellArea /* None */ = new CellArea(
    gtk_cell_area_context_get_area(
      this.raw.asInstanceOf[Ptr[GtkCellAreaContext]]
    ).asInstanceOf
  )

  /** Gets the accumulative preferred height for all rows which have been
    * requested with this context.
    *
    * After gtk_cell_area_context_reset() is called and/or before ever
    * requesting the size of a `GtkCellArea`, the returned values are 0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_preferred_height]: Method get_preferred_height contains an OUT parameter, which is not supported yet"
  )
  private def getPreferredHeight__ = ???

  /** Gets the accumulative preferred height for @width for all rows which have
    * been requested for the same said @width with this context.
    *
    * After gtk_cell_area_context_reset() is called and/or before ever
    * requesting the size of a `GtkCellArea`, the returned values are -1.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_preferred_height_for_width]: Method get_preferred_height_for_width contains an OUT parameter, which is not supported yet"
  )
  private def getPreferredHeightForWidth__ = ???

  /** Gets the accumulative preferred width for all rows which have been
    * requested with this context.
    *
    * After gtk_cell_area_context_reset() is called and/or before ever
    * requesting the size of a `GtkCellArea`, the returned values are 0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_preferred_width]: Method get_preferred_width contains an OUT parameter, which is not supported yet"
  )
  private def getPreferredWidth__ = ???

  /** Gets the accumulative preferred width for @height for all rows which have
    * been requested for the same said @height with this context.
    *
    * After gtk_cell_area_context_reset() is called and/or before ever
    * requesting the size of a `GtkCellArea`, the returned values are -1.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_preferred_width_for_height]: Method get_preferred_width_for_height contains an OUT parameter, which is not supported yet"
  )
  private def getPreferredWidthForHeight__ = ???

  /** Causes the minimum and/or natural height to grow if the new proposed sizes
    * exceed the current minimum and natural height.
    *
    * This is used by `GtkCellAreaContext` implementations during the request
    * process over a series of `GtkTreeModel` rows to progressively push the
    * requested height over a series of gtk_cell_area_get_preferred_height()
    * requests.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pushPreferredHeight(
      minimum_height: Int /* Some(CInt) */,
      natural_height: Int /* Some(CInt) */
  ): Unit /* None */ = gtk_cell_area_context_push_preferred_height(
    this.raw.asInstanceOf[Ptr[GtkCellAreaContext]],
    minimum_height,
    natural_height
  )

  /** Causes the minimum and/or natural width to grow if the new proposed sizes
    * exceed the current minimum and natural width.
    *
    * This is used by `GtkCellAreaContext` implementations during the request
    * process over a series of `GtkTreeModel` rows to progressively push the
    * requested width over a series of gtk_cell_area_get_preferred_width()
    * requests.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pushPreferredWidth(
      minimum_width: Int /* Some(CInt) */,
      natural_width: Int /* Some(CInt) */
  ): Unit /* None */ = gtk_cell_area_context_push_preferred_width(
    this.raw.asInstanceOf[Ptr[GtkCellAreaContext]],
    minimum_width,
    natural_width
  )

  /** Resets any previously cached request and allocation data.
    *
    * When underlying `GtkTreeModel` data changes its important to reset the
    * context if the content size is allowed to shrink. If the content size is
    * only allowed to grow (this is usually an option for views rendering large
    * data stores as a measure of optimization), then only the row that changed
    * or was inserted needs to be (re)requested with
    * gtk_cell_area_get_preferred_width().
    *
    * When the new overall size of the context requires that the allocated size
    * changes (or whenever this allocation changes at all), the variable row
    * sizes need to be re-requested for every row.
    *
    * For instance, if the rows are displayed all with the same width from top
    * to bottom then a change in the allocated width necessitates a
    * recalculation of all the displayed row heights using
    * gtk_cell_area_get_preferred_height_for_width().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def reset(): Unit /* None */ = gtk_cell_area_context_reset(
    this.raw.asInstanceOf[Ptr[GtkCellAreaContext]]
  )

end CellAreaContext
