package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  BaselinePosition,
  Buildable,
  ConstraintTarget,
  Orientable,
  Widget
}
import sn.gnome.gtk4.internal.GtkCenterBox

/** `GtkCenterBox` arranges three children in a row, keeping the middle child
  * centered as well as possible.
  *
  * ![An example GtkCenterBox](centerbox.png)
  *
  * To add children to `GtkCenterBox`, use
  * [method@Gtk.CenterBox.set_start_widget],
  * [method@Gtk.CenterBox.set_center_widget] and
  * [method@Gtk.CenterBox.set_end_widget].
  *
  * The sizing and positioning of children can be influenced with the align and
  * expand properties of the children.
  *
  * # GtkCenterBox as GtkBuildable
  *
  * The `GtkCenterBox` implementation of the `GtkBuildable` interface supports
  * placing children in the 3 positions by specifying “start”, “center” or “end”
  * as the “type” attribute of a `<child>` element.
  *
  * # CSS nodes
  *
  * `GtkCenterBox` uses a single CSS node with the name “box”,
  *
  * The first child of the `GtkCenterBox` will be allocated depending on the
  * text direction, i.e. in left-to-right layouts it will be allocated on the
  * left and in right-to-left layouts on the right.
  *
  * In vertical orientation, the nodes of the children are arranged from top to
  * bottom.
  *
  * # Accessibility
  *
  * Until GTK 4.10, `GtkCenterBox` used the `GTK_ACCESSIBLE_ROLE_GROUP` role.
  *
  * Starting from GTK 4.12, `GtkCenterBox` uses the
  * `GTK_ACCESSIBLE_ROLE_GENERIC` role.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CenterBox private[gnome] (raw: Ptr[GtkCenterBox])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the value set by gtk_center_box_set_baseline_position().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBaselinePosition(): BaselinePosition /* None */ =
    BaselinePosition.fromRaw(
      gtk_center_box_get_baseline_position(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCenterBox]]
      )
    )
  end getBaselinePosition

  /** Gets the center widget, or %NULL if there is none.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCenterWidget()(using Runtime): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_center_box_get_center_widget(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCenterBox]]
      ).asInstanceOf
    )
  end getCenterWidget

  /** Gets the end widget, or %NULL if there is none.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEndWidget()(using Runtime): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_center_box_get_end_widget(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCenterBox]]
      ).asInstanceOf
    )
  end getEndWidget

  /** Gets whether @self shrinks the center widget after other children.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShrinkCenterLast(): Boolean /* None */ =
    gtk_center_box_get_shrink_center_last(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCenterBox]]
    ).value.!=(0)
  end getShrinkCenterLast

  /** Gets the start widget, or %NULL if there is none.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStartWidget()(using Runtime): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_center_box_get_start_widget(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCenterBox]]
      ).asInstanceOf
    )
  end getStartWidget

  /** Sets the baseline position of a center box.
    *
    * This affects only horizontal boxes with at least one baseline aligned
    * child. If there is more vertical space available than requested, and the
    * baseline is not allocated by the parent then
    * @position
    *   is used to allocate the baseline wrt. the extra space available.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBaselinePosition(
      position: BaselinePosition /* Some(GtkBaselinePosition) */
  ): Unit /* None */ =
    gtk_center_box_set_baseline_position(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCenterBox]],
      position.raw
    )
  end setBaselinePosition

  /** Sets the center widget.
    *
    * To remove the existing center widget, pass %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCenterWidget(
      child: Option[sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_center_box_set_center_widget(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCenterBox]],
      child
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setCenterWidget

  /** Sets the end widget.
    *
    * To remove the existing end widget, pass %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEndWidget(
      child: Option[sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_center_box_set_end_widget(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCenterBox]],
      child
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setEndWidget

  /** Sets whether to shrink the center widget after other children.
    *
    * By default, when there's no space to give all three children their natural
    * widths, the start and end widgets start shrinking and the center child
    * keeps natural width until they reach minimum width.
    *
    * If set to `FALSE`, start and end widgets keep natural width and the center
    * widget starts shrinking instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShrinkCenterLast(
      shrink_center_last: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_center_box_set_shrink_center_last(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCenterBox]],
      gboolean(gint((if shrink_center_last == true then 1 else 0)))
    )
  end setShrinkCenterLast

  /** Sets the start widget.
    *
    * To remove the existing start widget, pass %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setStartWidget(
      child: Option[sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_center_box_set_start_widget(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCenterBox]],
      child
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setStartWidget

end CenterBox

object CenterBox:
  def applyUnsafe(ptr: Ptr[GtkCenterBox])(using Runtime) =
    summon[Runtime].getOrCreate[CenterBox](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new CenterBox(ptr)
    )

  /** Creates a new `GtkCenterBox`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): CenterBox =
    val raw: Ptr[Byte] = gtk_center_box_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[CenterBox](raw, r => CenterBox.applyUnsafe(r.asInstanceOf))
  end apply
end CenterBox
