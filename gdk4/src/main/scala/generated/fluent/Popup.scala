package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.{Gravity, Surface}
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*

trait Popup:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Returns whether this popup is set to hide on outside clicks.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAutohide(): Boolean /* None */ =
    gdk_popup_get_autohide(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPopup]]
    ).value.!=(0)
  end getAutohide

  /** Returns the parent surface of a popup.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getParent()(using Runtime): sn.gnome.gdk4.fluent.Surface /* None */ =
    sn.gnome.gdk4.fluent.Surface.applyUnsafe(
      gdk_popup_get_parent(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPopup]]
      ).asInstanceOf
    )
  end getParent

  /** Obtains the position of the popup relative to its parent.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPositionX(): Int /* None */ =
    gdk_popup_get_position_x(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPopup]]
    )
  end getPositionX

  /** Obtains the position of the popup relative to its parent.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPositionY(): Int /* None */ =
    gdk_popup_get_position_y(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPopup]]
    )
  end getPositionY

  /** Gets the current popup rectangle anchor.
    *
    * The value returned may change after calling [method@Gdk.Popup.present], or
    * after the [signal@Gdk.Surface::layout] signal is emitted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRectAnchor(): Gravity /* None */ =
    Gravity.fromRaw(
      gdk_popup_get_rect_anchor(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPopup]]
      )
    )
  end getRectAnchor

  /** Gets the current popup surface anchor.
    *
    * The value returned may change after calling [method@Gdk.Popup.present], or
    * after the [signal@Gdk.Surface::layout] signal is emitted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSurfaceAnchor(): Gravity /* None */ =
    Gravity.fromRaw(
      gdk_popup_get_surface_anchor(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPopup]]
      )
    )
  end getSurfaceAnchor

  /** Present @popup after having processed the `GdkPopupLayout` rules.
    *
    * If the popup was previously now showing, it will be showed, otherwise it
    * will change position according to @layout.
    *
    * After calling this function, the result should be handled in response to
    * the [signal@Gdk.Surface::layout] signal being emitted. The resulting popup
    * position can be queried using [method@Gdk.Popup.get_position_x],
    * [method@Gdk.Popup.get_position_y], and the resulting size will be sent as
    * parameters in the layout signal. Use [method@Gdk.Popup.get_rect_anchor]
    * and [method@Gdk.Popup.get_surface_anchor] to get the resulting anchors.
    *
    * Presenting may fail, for example if the @popup is set to autohide and is
    * immediately hidden upon being presented. If presenting failed, the
    * [signal@Gdk.Surface::layout] signal will not me emitted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method present/<method parameters>/layout]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PopupLayout), @type -> DataRecord(GdkPopupLayout*)))"
  )
  private def present__ = ???

end Popup

object Popup:
  class Abstract(raw: Ptr[Byte]) extends Popup:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Popup
