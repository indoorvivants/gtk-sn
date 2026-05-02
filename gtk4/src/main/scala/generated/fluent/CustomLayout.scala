package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.LayoutManager
import sn.gnome.gtk4.internal.GtkCustomAllocateFunc
import sn.gnome.gtk4.internal.GtkCustomLayout
import sn.gnome.gtk4.internal.GtkCustomMeasureFunc
import sn.gnome.gtk4.internal.GtkCustomRequestModeFunc

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkCustomLayout` uses closures for size negotiation.
  *
  * A `GtkCustomLayout `uses closures matching to the old `GtkWidget` virtual
  * functions for size negotiation, as a convenience API to ease the porting
  * towards the corresponding `GtkLayoutManager virtual functions.
  */
class CustomLayout(raw: Ptr[GtkCustomLayout])
    extends LayoutManager(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CustomLayout

object CustomLayout:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new legacy layout manager.
    *
    * Legacy layout managers map to the old `GtkWidget` size negotiation virtual
    * functions, and are meant to be used during the transition from layout
    * containers to layout manager delegates.
    */
  def apply(
      request_mode: Option[
        GtkCustomRequestModeFunc /* Some(GtkCustomRequestModeFunc) */
      ],
      measure: GtkCustomMeasureFunc /* Some(GtkCustomMeasureFunc) */,
      allocate: GtkCustomAllocateFunc /* Some(GtkCustomAllocateFunc) */
  ): CustomLayout = new CustomLayout(
    gtk_custom_layout_new(
      request_mode
        .map[GtkCustomRequestModeFunc](o => o)
        .getOrElse(null.asInstanceOf[GtkCustomRequestModeFunc]),
      measure,
      allocate
    ).asInstanceOf
  )
end CustomLayout
