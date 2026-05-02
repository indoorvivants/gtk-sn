package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkAspectFrame

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkAspectFrame` preserves the aspect ratio of its child.
  *
  * The frame can respect the aspect ratio of the child widget, or use its own
  * aspect ratio.
  *
  * # CSS nodes
  *
  * `GtkAspectFrame` uses a CSS node with name `frame`.
  *
  * # Accessibility
  *
  * Until GTK 4.10, `GtkAspectFrame` used the `GTK_ACCESSIBLE_ROLE_GROUP` role.
  *
  * Starting from GTK 4.12, `GtkAspectFrame` uses the
  * `GTK_ACCESSIBLE_ROLE_GENERIC` role.
  */
class AspectFrame(raw: Ptr[GtkAspectFrame])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child widget of @self.
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_aspect_frame_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the child's size request should override the set aspect
    * ratio of the `GtkAspectFrame`.
    */
  def getObeyChild(): Boolean /* None */ =
    gtk_aspect_frame_get_obey_child(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the desired aspect ratio of the child.
    */
  def getRatio(): Float /* None */ = gtk_aspect_frame_get_ratio(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the horizontal alignment of the child within the allocation of the
    * `GtkAspectFrame`.
    */
  def getXalign(): Float /* None */ = gtk_aspect_frame_get_xalign(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the vertical alignment of the child within the allocation of the
    * `GtkAspectFrame`.
    */
  def getYalign(): Float /* None */ = gtk_aspect_frame_get_yalign(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the child widget of @self.
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_aspect_frame_set_child(
    this.raw.asInstanceOf,
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the aspect ratio of the child's size request should override
    * the set aspect ratio of the `GtkAspectFrame`.
    */
  def setObeyChild(
      obey_child: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_aspect_frame_set_obey_child(
    this.raw.asInstanceOf,
    gboolean(gint((if obey_child == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the desired aspect ratio of the child.
    */
  def setRatio(ratio: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_aspect_frame_set_ratio(this.raw.asInstanceOf, ratio.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the horizontal alignment of the child within the allocation of the
    * `GtkAspectFrame`.
    */
  def setXalign(xalign: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_aspect_frame_set_xalign(this.raw.asInstanceOf, xalign.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the vertical alignment of the child within the allocation of the
    * `GtkAspectFrame`.
    */
  def setYalign(yalign: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_aspect_frame_set_yalign(this.raw.asInstanceOf, yalign.asInstanceOf)

end AspectFrame

object AspectFrame:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new `GtkAspectFrame`.
    */
  def apply(
      xalign: Float /* Some(Float) */,
      yalign: Float /* Some(Float) */,
      ratio: Float /* Some(Float) */,
      obey_child: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): AspectFrame = new AspectFrame(
    gtk_aspect_frame_new(
      xalign.asInstanceOf,
      yalign.asInstanceOf,
      ratio.asInstanceOf,
      gboolean(gint((if obey_child == true then 1 else 0)))
    ).asInstanceOf
  )
end AspectFrame
