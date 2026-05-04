package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.fluent.LayoutChild
import sn.gnome.gtk4.internal.GtkOverlayLayoutChild

/** `GtkLayoutChild` subclass for children in a `GtkOverlayLayout`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class OverlayLayoutChild(raw: Ptr[GtkOverlayLayoutChild])
    extends LayoutChild(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves whether the child is clipped.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getClipOverlay(): Boolean /* None */ =
    gtk_overlay_layout_child_get_clip_overlay(
      this.raw.asInstanceOf[Ptr[GtkOverlayLayoutChild]]
    ).value.!=(0)

  /** Retrieves whether the child is measured.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMeasure(): Boolean /* None */ = gtk_overlay_layout_child_get_measure(
    this.raw.asInstanceOf[Ptr[GtkOverlayLayoutChild]]
  ).value.!=(0)

  /** Sets whether to clip this child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setClipOverlay(
      clip_overlay: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_overlay_layout_child_set_clip_overlay(
    this.raw.asInstanceOf[Ptr[GtkOverlayLayoutChild]],
    gboolean(gint((if clip_overlay == true then 1 else 0)))
  )

  /** Sets whether to measure this child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMeasure(
      measure: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_overlay_layout_child_set_measure(
    this.raw.asInstanceOf[Ptr[GtkOverlayLayoutChild]],
    gboolean(gint((if measure == true then 1 else 0)))
  )

end OverlayLayoutChild
