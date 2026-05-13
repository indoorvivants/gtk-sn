package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.{Display, Drag, Paintable}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ConstraintTarget,
  Native,
  Root,
  Widget
}
import sn.gnome.gtk4.internal.{GtkDragIcon, GtkWidget}

/** `GtkDragIcon` is a `GtkRoot` implementation for drag icons.
  *
  * A drag icon moves with the pointer during a Drag-and-Drop operation and is
  * destroyed when the drag ends.
  *
  * To set up a drag icon and associate it with an ongoing drag operation, use
  * [func@Gtk.DragIcon.get_for_drag] to get the icon for a drag. You can then
  * use it like any other widget and use [method@Gtk.DragIcon.set_child] to set
  * whatever widget should be used for the drag icon.
  *
  * Keep in mind that drag icons do not allow user input.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DragIcon private[gnome] (raw: Ptr[GtkDragIcon])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      Root:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the widget currently used as drag icon.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_drag_icon_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDragIcon]]
      ).asInstanceOf
    )
  end getChild

  /** Get the `GdkDisplay` for the toplevel window associated with this widget.
    *
    * This function can only be called after the widget has been added to a
    * widget hierarchy with a `GtkWindow` at the top.
    *
    * In general, you should only create display specific resources when a
    * widget has been realized, and you should free those resources when the
    * widget is unrealized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getDisplay()(using
      Runtime
  ): sn.gnome.gdk4.fluent.Display /* None */ =
    sn.gnome.gdk4.fluent.Display.applyUnsafe(
      gtk_widget_get_display(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getDisplay

  /** Creates the GDK resources associated with a widget.
    *
    * Normally realization happens implicitly; if you show a widget and all its
    * parent containers, then the widget will be realized and mapped
    * automatically.
    *
    * Realizing a widget requires all the widget’s parent widgets to be
    * realized; calling this function realizes the widget’s parents in addition
    * to @widget itself. If a widget is not yet inside a toplevel window when
    * you realize it, bad things will happen.
    *
    * This function is primarily used in widget implementations, and isn’t very
    * useful otherwise. Many times when you think you might need it, a better
    * approach is to connect to a signal that will be called after the widget is
    * realized automatically, such as [signal@Gtk.Widget::realize].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def realize(): Unit /* None */ =
    gtk_widget_realize(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]])
  end realize

  /** Sets the widget to display as the drag icon.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChild(
      child: Option[sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_drag_icon_set_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDragIcon]],
      child
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setChild

  /** Causes a widget to be unrealized (frees all GDK resources associated with
    * the widget).
    *
    * This function is only useful in widget implementations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def unrealize(): Unit /* None */ =
    gtk_widget_unrealize(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    )
  end unrealize

end DragIcon

object DragIcon:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkDragIcon])(using Runtime) = summon[Runtime]
    .getOrCreate[DragIcon](ptr.asInstanceOf[Ptr[Byte]], p => new DragIcon(ptr))

  /** Creates a widget that can be used as a drag icon for the given
    * @value.
    *
    * Supported types include strings, `GdkRGBA` and `GtkTextBuffer`. If GTK
    * does not know how to create a widget for a given value, it will return
    * %NULL.
    *
    * This method is used to set the default drag icon on drag-and-drop
    * operations started by `GtkDragSource`, so you don't need to set a drag
    * icon using this function there.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[<function parameters>/value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(const GValue*)))"
  )
  private def createWidgetForValue() = ???

  /** Gets the `GtkDragIcon` in use with @drag.
    *
    * If no drag icon exists yet, a new one will be created and shown.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getForDrag(
      drag: sn.gnome.gdk4.fluent.Drag /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDrag]) */
  )(using Runtime): sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_drag_icon_get_for_drag(
        drag.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

  /** Creates a `GtkDragIcon` that shows @paintable, and associates it with the
    * drag operation.
    *
    * The hotspot position on the paintable is aligned with the hotspot of the
    * cursor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFromPaintable(
      drag: sn.gnome.gdk4.fluent.Drag /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDrag]) */,
      paintable: Paintable /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]) */,
      hot_x: Int /* Some(CInt) */,
      hot_y: Int /* Some(CInt) */
  )(using Runtime): Unit /* Some(Unit) */ = gtk_drag_icon_set_from_paintable(
    drag.getUnsafeRawPointer().asInstanceOf,
    paintable.getUnsafeRawPointer().asInstanceOf,
    hot_x,
    hot_y
  )

end DragIcon
