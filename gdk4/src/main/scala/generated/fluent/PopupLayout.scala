package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.{AnchorHints, Gravity, PopupLayout, Rectangle}
import sn.gnome.gdk4.internal.GdkPopupLayout
import sn.gnome.glib.internal.{gboolean, gint}

/** The `GdkPopupLayout` struct contains information that is necessary position
  * a [iface@Gdk.Popup] relative to its parent.
  *
  * The positioning requires a negotiation with the windowing system, since it
  * depends on external constraints, such as the position of the parent surface,
  * and the screen dimensions.
  *
  * The basic ingredients are a rectangle on the parent surface, and the anchor
  * on both that rectangle and the popup. The anchors specify a side or corner
  * to place next to each other.
  *
  * ![Popup anchors](popup-anchors.png)
  *
  * For cases where placing the anchors next to each other would make the popup
  * extend offscreen, the layout includes some hints for how to resolve this
  * problem. The hints may suggest to flip the anchor position to the other
  * side, or to 'slide' the popup along a side, or to resize it.
  *
  * ![Flipping popups](popup-flip.png)
  *
  * ![Sliding popups](popup-slide.png)
  *
  * These hints may be combined.
  *
  * Ultimatively, it is up to the windowing system to determine the position and
  * size of the popup. You can learn about the result by calling
  * [method@Gdk.Popup.get_position_x], [method@Gdk.Popup.get_position_y],
  * [method@Gdk.Popup.get_rect_anchor] and [method@Gdk.Popup.get_surface_anchor]
  * after the popup has been presented. This can be used to adjust the
  * rendering. For example, [class@Gtk.Popover] changes its arrow position
  * accordingly. But you have to be careful avoid changing the size of the
  * popover, or it has to be presented again.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PopupLayout private[gnome] (raw: Ptr[GdkPopupLayout]):

  def getUnsafeRawPointer(): Ptr[GdkPopupLayout] = this.raw

  /** Makes a copy of @layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.gdk4.PopupLayout /* None */ =
    sn.gnome.gdk4.PopupLayout.fromRaw(
      gdk_popup_layout_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPopupLayout]]
      )
    )
  end copy

  /** Check whether @layout and @other has identical layout properties.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(
      other: sn.gnome.gdk4.PopupLayout /* Some(Ptr[GdkPopupLayout]) */
  ): Boolean /* None */ =
    gdk_popup_layout_equal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPopupLayout]],
      other.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end equal

  /** Get the `GdkAnchorHints`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAnchorHints(): sn.gnome.gdk4.AnchorHints /* None */ =
    sn.gnome.gdk4.AnchorHints.fromRaw(
      gdk_popup_layout_get_anchor_hints(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPopupLayout]]
      )
    )
  end getAnchorHints

  /** Get the anchor rectangle.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAnchorRect(): sn.gnome.gdk4.Rectangle /* None */ =
    sn.gnome.gdk4.Rectangle.fromRaw(
      gdk_popup_layout_get_anchor_rect(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPopupLayout]]
      )
    )
  end getAnchorRect

  /** Retrieves the offset for the anchor rectangle.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_offset]: Method get_offset contains an OUT parameter, which is not supported yet"
  )
  private def getOffset__ = ???

  /** Returns the anchor position on the anchor rectangle.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRectAnchor(): sn.gnome.gdk4.Gravity /* None */ =
    sn.gnome.gdk4.Gravity.fromRaw(
      gdk_popup_layout_get_rect_anchor(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPopupLayout]]
      )
    )
  end getRectAnchor

  /** Obtains the shadow widths of this layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_shadow_width]: Method get_shadow_width contains an OUT parameter, which is not supported yet"
  )
  private def getShadowWidth__ = ???

  /** Returns the anchor position on the popup surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSurfaceAnchor(): sn.gnome.gdk4.Gravity /* None */ =
    sn.gnome.gdk4.Gravity.fromRaw(
      gdk_popup_layout_get_surface_anchor(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPopupLayout]]
      )
    )
  end getSurfaceAnchor

  /** Increases the reference count of @value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gdk4.PopupLayout /* None */ =
    sn.gnome.gdk4.PopupLayout.fromRaw(
      gdk_popup_layout_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPopupLayout]]
      )
    )
  end ref

  /** Set new anchor hints.
    *
    * The set @anchor_hints determines how @surface will be moved if the anchor
    * points cause it to move off-screen. For example, %GDK_ANCHOR_FLIP_X will
    * replace %GDK_GRAVITY_NORTH_WEST with %GDK_GRAVITY_NORTH_EAST and vice
    * versa if @surface extends beyond the left or right edges of the monitor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAnchorHints(
      anchor_hints: sn.gnome.gdk4.AnchorHints /* Some(GdkAnchorHints) */
  ): Unit /* None */ =
    gdk_popup_layout_set_anchor_hints(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPopupLayout]],
      anchor_hints.raw
    )
  end setAnchorHints

  /** Set the anchor rectangle.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAnchorRect(
      anchor_rect: sn.gnome.gdk4.Rectangle /* Some(Ptr[GdkRectangle]) */
  ): Unit /* None */ =
    gdk_popup_layout_set_anchor_rect(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPopupLayout]],
      anchor_rect.getUnsafeRawPointer().asInstanceOf
    )
  end setAnchorRect

  /** Offset the position of the anchor rectangle with the given delta.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setOffset(
      dx: Int /* Some(CInt) */,
      dy: Int /* Some(CInt) */
  ): Unit /* None */ =
    gdk_popup_layout_set_offset(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPopupLayout]],
      dx,
      dy
    )
  end setOffset

  /** Set the anchor on the anchor rectangle.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRectAnchor(
      anchor: sn.gnome.gdk4.Gravity /* Some(GdkGravity) */
  ): Unit /* None */ =
    gdk_popup_layout_set_rect_anchor(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPopupLayout]],
      anchor.raw
    )
  end setRectAnchor

  /** Sets the shadow width of the popup.
    *
    * The shadow width corresponds to the part of the computed surface size that
    * would consist of the shadow margin surrounding the window, would there be
    * any.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShadowWidth(
      left: Int /* Some(CInt) */,
      right: Int /* Some(CInt) */,
      top: Int /* Some(CInt) */,
      bottom: Int /* Some(CInt) */
  ): Unit /* None */ =
    gdk_popup_layout_set_shadow_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPopupLayout]],
      left,
      right,
      top,
      bottom
    )
  end setShadowWidth

  /** Set the anchor on the popup surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSurfaceAnchor(
      anchor: sn.gnome.gdk4.Gravity /* Some(GdkGravity) */
  ): Unit /* None */ =
    gdk_popup_layout_set_surface_anchor(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPopupLayout]],
      anchor.raw
    )
  end setSurfaceAnchor

  /** Decreases the reference count of @value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    gdk_popup_layout_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPopupLayout]]
    )
  end unref

end PopupLayout

object PopupLayout:
  def fromRaw(ptr: Ptr[GdkPopupLayout]): PopupLayout = new PopupLayout(ptr)
end PopupLayout
