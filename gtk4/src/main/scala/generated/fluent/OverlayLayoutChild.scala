package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.LayoutChild
import sn.gnome.gtk4.internal.GtkOverlayLayoutChild

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkLayoutChild` subclass for children in a `GtkOverlayLayout`.
  */
class OverlayLayoutChild(raw: Ptr[GtkOverlayLayoutChild])
    extends LayoutChild(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves whether the child is clipped.
    */
  def getClipOverlay(): Boolean /* None */ =
    gtk_overlay_layout_child_get_clip_overlay(
      this.raw.asInstanceOf[Ptr[GtkOverlayLayoutChild]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves whether the child is measured.
    */
  def getMeasure(): Boolean /* None */ = gtk_overlay_layout_child_get_measure(
    this.raw.asInstanceOf[Ptr[GtkOverlayLayoutChild]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether to clip this child.
    */
  def setClipOverlay(
      clip_overlay: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_overlay_layout_child_set_clip_overlay(
    this.raw.asInstanceOf[Ptr[GtkOverlayLayoutChild]],
    gboolean(gint((if clip_overlay == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether to measure this child.
    */
  def setMeasure(
      measure: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_overlay_layout_child_set_measure(
    this.raw.asInstanceOf[Ptr[GtkOverlayLayoutChild]],
    gboolean(gint((if measure == true then 1 else 0)))
  )

end OverlayLayoutChild
