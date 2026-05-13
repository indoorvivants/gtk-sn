package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{Adjustment, ScrollablePolicy}

trait Scrollable:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Returns the size of a non-scrolling border around the outside of the
    * scrollable.
    *
    * An example for this would be treeview headers. GTK can use this
    * information to display overlaid graphics, like the overshoot indication,
    * at the right position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_border]: Method get_border contains an OUT parameter, which is not supported yet"
  )
  private def getBorder__ = ???

  /** Retrieves the `GtkAdjustment` used for horizontal scrolling.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHadjustment()(using Runtime): sn.gnome.gtk4.Adjustment /* None */ =
    sn.gnome.gtk4.Adjustment.applyUnsafe(
      gtk_scrollable_get_hadjustment(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrollable]]
      ).asInstanceOf
    )
  end getHadjustment

  /** Gets the horizontal `GtkScrollablePolicy`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHscrollPolicy(): ScrollablePolicy /* None */ =
    ScrollablePolicy.fromRaw(
      gtk_scrollable_get_hscroll_policy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrollable]]
      )
    )
  end getHscrollPolicy

  /** Retrieves the `GtkAdjustment` used for vertical scrolling.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVadjustment()(using Runtime): sn.gnome.gtk4.Adjustment /* None */ =
    sn.gnome.gtk4.Adjustment.applyUnsafe(
      gtk_scrollable_get_vadjustment(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrollable]]
      ).asInstanceOf
    )
  end getVadjustment

  /** Gets the vertical `GtkScrollablePolicy`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVscrollPolicy(): ScrollablePolicy /* None */ =
    ScrollablePolicy.fromRaw(
      gtk_scrollable_get_vscroll_policy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrollable]]
      )
    )
  end getVscrollPolicy

  /** Sets the horizontal adjustment of the `GtkScrollable`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHadjustment(
      hadjustment: Option[
        sn.gnome.gtk4.Adjustment /* Some(Ptr[GtkAdjustment]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_scrollable_set_hadjustment(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrollable]],
      hadjustment
        .map[Ptr[GtkAdjustment]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkAdjustment]])
    )
  end setHadjustment

  /** Sets the `GtkScrollablePolicy`.
    *
    * The policy determines whether horizontal scrolling should start below the
    * minimum width or below the natural width.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHscrollPolicy(
      policy: ScrollablePolicy /* Some(GtkScrollablePolicy) */
  ): Unit /* None */ =
    gtk_scrollable_set_hscroll_policy(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrollable]],
      policy.raw
    )
  end setHscrollPolicy

  /** Sets the vertical adjustment of the `GtkScrollable`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVadjustment(
      vadjustment: Option[
        sn.gnome.gtk4.Adjustment /* Some(Ptr[GtkAdjustment]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_scrollable_set_vadjustment(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrollable]],
      vadjustment
        .map[Ptr[GtkAdjustment]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkAdjustment]])
    )
  end setVadjustment

  /** Sets the `GtkScrollablePolicy`.
    *
    * The policy determines whether vertical scrolling should start below the
    * minimum height or below the natural height.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVscrollPolicy(
      policy: ScrollablePolicy /* Some(GtkScrollablePolicy) */
  ): Unit /* None */ =
    gtk_scrollable_set_vscroll_policy(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrollable]],
      policy.raw
    )
  end setVscrollPolicy

end Scrollable

object Scrollable:
  class Abstract(raw: Ptr[Byte]) extends Scrollable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Scrollable
