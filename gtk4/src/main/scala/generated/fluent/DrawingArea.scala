package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gchar, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{Accessible, Buildable, ConstraintTarget, Widget}
import sn.gnome.gtk4.internal.GtkDrawingArea
import sn.gnome.runtime.*

/** `GtkDrawingArea` is a widget that allows drawing with cairo.
  *
  * ![An example GtkDrawingArea](drawingarea.png)
  *
  * It’s essentially a blank widget; you can draw on it. After creating a
  * drawing area, the application may want to connect to:
  *
  *   - The [signal@Gtk.Widget::realize] signal to take any necessary actions
  *     when the widget is instantiated on a particular display. (Create GDK
  *     resources in response to this signal.)
  *   - The [signal@Gtk.DrawingArea::resize] signal to take any necessary
  *     actions when the widget changes size.
  *   - Call [method@Gtk.DrawingArea.set_draw_func] to handle redrawing the
  *     contents of the widget.
  *
  * The following code portion demonstrates using a drawing area to display a
  * circle in the normal widget foreground color.
  *
  * ## Simple GtkDrawingArea usage
  *
  * ```c
  * static void
  * draw_function (GtkDrawingArea *area,
  *                cairo_t        *cr,
  *                int             width,
  *                int             height,
  *                gpointer        data)
  * {
  *   GdkRGBA color;
  *
  *   cairo_arc (cr,
  *              width / 2.0, height / 2.0,
  *              MIN (width, height) / 2.0,
  *              0, 2 * G_PI);
  *
  *   gtk_widget_get_color (GTK_WIDGET (area),
  *                         &color);
  *   gdk_cairo_set_source_rgba (cr, &color);
  *
  *   cairo_fill (cr);
  * }
  *
  * int
  * main (int argc, char **argv)
  * {
  *   gtk_init ();
  *
  *   GtkWidget *area = gtk_drawing_area_new ();
  *   gtk_drawing_area_set_content_width (GTK_DRAWING_AREA (area), 100);
  *   gtk_drawing_area_set_content_height (GTK_DRAWING_AREA (area), 100);
  *   gtk_drawing_area_set_draw_func (GTK_DRAWING_AREA (area),
  *                                   draw_function,
  *                                   NULL, NULL);
  *   return 0;
  * }
  * ```
  *
  * The draw function is normally called when a drawing area first comes
  * onscreen, or when it’s covered by another window and then uncovered. You can
  * also force a redraw by adding to the “damage region” of the drawing area’s
  * window using [method@Gtk.Widget.queue_draw]. This will cause the drawing
  * area to call the draw function again.
  *
  * The available routines for drawing are documented in the [Cairo
  * documentation](https://www.cairographics.org/manual/); GDK offers additional
  * API to integrate with Cairo, like [func@Gdk.cairo_set_source_rgba] or
  * [func@Gdk.cairo_set_source_pixbuf].
  *
  * To receive mouse events on a drawing area, you will need to use event
  * controllers. To receive keyboard events, you will need to set the
  * “can-focus” property on the drawing area, and you should probably draw some
  * user-visible indication that the drawing area is focused.
  *
  * If you need more complex control over your widget, you should consider
  * creating your own `GtkWidget` subclass.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DrawingArea private[gnome] (raw: Ptr[GtkDrawingArea])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the content height of the `GtkDrawingArea`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getContentHeight(): Int /* None */ =
    gtk_drawing_area_get_content_height(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDrawingArea]]
    )
  end getContentHeight

  /** Retrieves the content width of the `GtkDrawingArea`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getContentWidth(): Int /* None */ =
    gtk_drawing_area_get_content_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDrawingArea]]
    )
  end getContentWidth

  /** Sets the desired height of the contents of the drawing area.
    *
    * Note that because widgets may be allocated larger sizes than they
    * requested, it is possible that the actual height passed to your draw
    * function is larger than the height set here. You can use
    * [method@Gtk.Widget.set_valign] to avoid that.
    *
    * If the height is set to 0 (the default), the drawing area may disappear.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setContentHeight(height: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_drawing_area_set_content_height(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDrawingArea]],
      height
    )
  end setContentHeight

  /** Sets the desired width of the contents of the drawing area.
    *
    * Note that because widgets may be allocated larger sizes than they
    * requested, it is possible that the actual width passed to your draw
    * function is larger than the width set here. You can use
    * [method@Gtk.Widget.set_halign] to avoid that.
    *
    * If the width is set to 0 (the default), the drawing area may disappear.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setContentWidth(width: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_drawing_area_set_content_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDrawingArea]],
      width
    )
  end setContentWidth

  /** Setting a draw function is the main thing you want to do when using a
    * drawing area.
    *
    * The draw function is called whenever GTK needs to draw the contents of the
    * drawing area to the screen.
    *
    * The draw function will be called during the drawing stage of GTK. In the
    * drawing stage it is not allowed to change properties of any GTK widgets or
    * call any functions that would cause any properties to be changed. You
    * should restrict yourself exclusively to drawing your contents in the draw
    * function.
    *
    * If what you are drawing does change, call [method@Gtk.Widget.queue_draw]
    * on the drawing area. This will cause a redraw and will call @draw_func
    * again.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_draw_func/<method parameters>/draw_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DrawingAreaDrawFunc), @type -> DataRecord(GtkDrawingAreaDrawFunc)))"
  )
  private def setDrawFunc__ = ???

  /** Emitted once when the widget is realized, and then each time the widget is
    * changed while realized.
    *
    * This is useful in order to keep state up to date with the widget size,
    * like for instance a backing surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onResize(handler: ((width: Int, height: Int)) => Unit)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (width: Int, height: Int), Unit]
    val c_handler = CFuncPtr4.fromScalaFunction {
      (
          self: Ptr[GtkDrawingArea],
          width: Int /* param */,
          height: Int /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((width = width, height = height))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"resize"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onResize
end DrawingArea

object DrawingArea:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkDrawingArea])(using Runtime) =
    summon[Runtime].getOrCreate[DrawingArea](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new DrawingArea(ptr)
    )

  /** Creates a new drawing area.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): DrawingArea =
    val raw: Ptr[Byte] = gtk_drawing_area_new().asInstanceOf
    summon[Runtime].getOrCreate[DrawingArea](
      raw,
      r => DrawingArea.applyUnsafe(r.asInstanceOf)
    )
  end apply
end DrawingArea
