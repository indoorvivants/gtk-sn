package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkWidgetPaintable

/** `GtkWidgetPaintable` is a `GdkPaintable` that displays the contents of a
  * widget.
  *
  * `GtkWidgetPaintable` will also take care of the widget not being in a state
  * where it can be drawn (like when it isn't shown) and just draw nothing or
  * where it does not have a size (like when it is hidden) and report no size in
  * that case.
  *
  * Of course, `GtkWidgetPaintable` allows you to monitor widgets for size
  * changes by emitting the [signal@Gdk.Paintable::invalidate-size] signal
  * whenever the size of the widget changes as well as for visual changes by
  * emitting the [signal@Gdk.Paintable::invalidate-contents] signal whenever the
  * widget changes.
  *
  * You can use a `GtkWidgetPaintable` everywhere a `GdkPaintable` is allowed,
  * including using it on a `GtkPicture` (or one of its parents) that it was set
  * on itself via gtk_picture_set_paintable(). The paintable will take care of
  * recursion when this happens. If you do this however, ensure that the
  * [property@Gtk.Picture:can-shrink] property is set to %TRUE or you might end
  * up with an infinitely growing widget.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class WidgetPaintable private[gnome] (raw: Ptr[GtkWidgetPaintable])
    extends Object(raw.asInstanceOf),
      Paintable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the widget that is observed or %NULL if none.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWidget()(using Runtime): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_widget_paintable_get_widget(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidgetPaintable]]
      ).asInstanceOf
    )
  end getWidget

  /** Sets the widget that should be observed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setWidget(
      widget: Option[sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_widget_paintable_set_widget(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidgetPaintable]],
      widget
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setWidget

end WidgetPaintable

object WidgetPaintable:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkWidgetPaintable])(using Runtime) =
    summon[Runtime].getOrCreate[WidgetPaintable](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new WidgetPaintable(ptr)
    )

  /** Creates a new widget paintable observing the given widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      widget: Option[sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): WidgetPaintable =
    val raw: Ptr[Byte] = gtk_widget_paintable_new(
      widget
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    ).asInstanceOf
    summon[Runtime].getOrCreate[WidgetPaintable](
      raw,
      r => WidgetPaintable.applyUnsafe(r.asInstanceOf)
    )
  end apply
end WidgetPaintable
