package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{Accessible, Buildable, ConstraintTarget, Widget}
import sn.gnome.gtk4.internal.GtkAspectFrame

/** `GtkAspectFrame` preserves the aspect ratio of its child.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AspectFrame(raw: Ptr[GtkAspectFrame])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the child widget of @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_aspect_frame_get_child(
      this.raw.asInstanceOf[Ptr[GtkAspectFrame]]
    ).asInstanceOf
  )

  /** Returns whether the child's size request should override the set aspect
    * ratio of the `GtkAspectFrame`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getObeyChild(): Boolean /* None */ = gtk_aspect_frame_get_obey_child(
    this.raw.asInstanceOf[Ptr[GtkAspectFrame]]
  ).value.!=(0)

  /** Returns the desired aspect ratio of the child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRatio(): Float /* None */ = gtk_aspect_frame_get_ratio(
    this.raw.asInstanceOf[Ptr[GtkAspectFrame]]
  )

  /** Returns the horizontal alignment of the child within the allocation of the
    * `GtkAspectFrame`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getXalign(): Float /* None */ = gtk_aspect_frame_get_xalign(
    this.raw.asInstanceOf[Ptr[GtkAspectFrame]]
  )

  /** Returns the vertical alignment of the child within the allocation of the
    * `GtkAspectFrame`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getYalign(): Float /* None */ = gtk_aspect_frame_get_yalign(
    this.raw.asInstanceOf[Ptr[GtkAspectFrame]]
  )

  /** Sets the child widget of @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_aspect_frame_set_child(
    this.raw.asInstanceOf[Ptr[GtkAspectFrame]],
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** Sets whether the aspect ratio of the child's size request should override
    * the set aspect ratio of the `GtkAspectFrame`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setObeyChild(
      obey_child: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_aspect_frame_set_obey_child(
    this.raw.asInstanceOf[Ptr[GtkAspectFrame]],
    gboolean(gint((if obey_child == true then 1 else 0)))
  )

  /** Sets the desired aspect ratio of the child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRatio(ratio: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_aspect_frame_set_ratio(
      this.raw.asInstanceOf[Ptr[GtkAspectFrame]],
      ratio.asInstanceOf
    )

  /** Sets the horizontal alignment of the child within the allocation of the
    * `GtkAspectFrame`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setXalign(xalign: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_aspect_frame_set_xalign(
      this.raw.asInstanceOf[Ptr[GtkAspectFrame]],
      xalign.asInstanceOf
    )

  /** Sets the vertical alignment of the child within the allocation of the
    * `GtkAspectFrame`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setYalign(yalign: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_aspect_frame_set_yalign(
      this.raw.asInstanceOf[Ptr[GtkAspectFrame]],
      yalign.asInstanceOf
    )

end AspectFrame

object AspectFrame:
  /** Create a new `GtkAspectFrame`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      xalign: Float /* Some(Float) */,
      yalign: Float /* Some(Float) */,
      ratio: Float /* Some(Float) */,
      obey_child: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Runtime): AspectFrame =
    val raw: Ptr[Byte] = gtk_aspect_frame_new(
      xalign.asInstanceOf,
      yalign.asInstanceOf,
      ratio.asInstanceOf,
      gboolean(gint((if obey_child == true then 1 else 0)))
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[AspectFrame](raw, r => new AspectFrame(r.asInstanceOf))
  end apply
end AspectFrame
