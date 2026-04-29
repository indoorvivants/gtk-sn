package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.LayoutChild
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkLayoutManager
import sn.gnome.gtk4.internal.GtkSizeRequestMode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Layout managers are delegate classes that handle the preferred size and the
  * allocation of a widget.
  *
  * You typically subclass `GtkLayoutManager` if you want to implement a layout
  * policy for the children of a widget, or if you want to determine the size of
  * a widget depending on its contents.
  *
  * Each `GtkWidget` can only have a `GtkLayoutManager` instance associated to
  * it at any given time; it is possible, though, to replace the layout manager
  * instance using [method@Gtk.Widget.set_layout_manager].
  *
  * ## Layout properties
  *
  * A layout manager can expose properties for controlling the layout of each
  * child, by creating an object type derived from [class@Gtk.LayoutChild] and
  * installing the properties on it as normal `GObject` properties.
  *
  * Each `GtkLayoutChild` instance storing the layout properties for a specific
  * child is created through the [method@Gtk.LayoutManager.get_layout_child]
  * method; a `GtkLayoutManager` controls the creation of its `GtkLayoutChild`
  * instances by overriding the GtkLayoutManagerClass.create_layout_child()
  * virtual function. The typical implementation should look like:
  *
  * ```c
  * static GtkLayoutChild *
  * create_layout_child (GtkLayoutManager *manager,
  *                      GtkWidget        *container,
  *                      GtkWidget        *child)
  * {
  *   return g_object_new (your_layout_child_get_type (),
  *                        "layout-manager", manager,
  *                        "child-widget", child,
  *                        NULL);
  * }
  * ```
  *
  * The [property@Gtk.LayoutChild:layout-manager] and
  * [property@Gtk.LayoutChild:child-widget] properties on the newly created
  * `GtkLayoutChild` instance are mandatory. The `GtkLayoutManager` will cache
  * the newly created `GtkLayoutChild` instance until the widget is removed from
  * its parent, or the parent removes the layout manager.
  *
  * Each `GtkLayoutManager` instance creating a `GtkLayoutChild` should use
  * [method@Gtk.LayoutManager.get_layout_child] every time it needs to query the
  * layout properties; each `GtkLayoutChild` instance should call
  * [method@Gtk.LayoutManager.layout_changed] every time a property is updated,
  * in order to queue a new size measuring and allocation.
  */
class LayoutManager(raw: Ptr[GtkLayoutManager])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Assigns the given @width, @height, and @baseline to a @widget, and
    * computes the position and sizes of the children of the @widget using the
    * layout management policy of @manager.
    */
  def allocate(widget: Widget, width: Int, height: Int, baseline: Int): Unit =
    gtk_layout_manager_allocate(
      this.raw.asInstanceOf,
      widget.getUnsafeRawPointer().asInstanceOf,
      width,
      height,
      baseline
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves a `GtkLayoutChild` instance for the `GtkLayoutManager`, creating
    * one if necessary.
    *
    * The @child widget must be a child of the widget using @manager.
    *
    * The `GtkLayoutChild` instance is owned by the `GtkLayoutManager`, and is
    * guaranteed to exist as long as @child is a child of the `GtkWidget` using
    * the given `GtkLayoutManager`.
    */
  def getLayoutChild(child: Widget): LayoutChild = new LayoutChild(
    gtk_layout_manager_get_layout_child(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the request mode of @manager.
    */
  def getRequestMode(): GtkSizeRequestMode =
    gtk_layout_manager_get_request_mode(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the `GtkWidget` using the given `GtkLayoutManager`.
    */
  def getWidget(): Widget = new Widget(
    gtk_layout_manager_get_widget(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Queues a resize on the `GtkWidget` using @manager, if any.
    *
    * This function should be called by subclasses of `GtkLayoutManager` in
    * response to changes to their layout management policies.
    */
  def layoutChanged(): Unit = gtk_layout_manager_layout_changed(
    this.raw.asInstanceOf
  )

  @annotation.compileTimeOnly(
    "Method measure contains an OUT parameter, which is not supported yet"
  )
  def measure(using DummyImplicit) = ???

end LayoutManager
