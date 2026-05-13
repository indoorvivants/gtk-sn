package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{LayoutChild, SizeRequestMode, Widget}
import sn.gnome.gtk4.internal.GtkLayoutManager

/** Layout managers are delegate classes that handle the preferred size and the
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class LayoutManager private[gnome] (raw: Ptr[GtkLayoutManager])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Assigns the given @width, @height, and @baseline to a @widget, and
    * computes the position and sizes of the children of the @widget using the
    * layout management policy of @manager.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def allocate(
      widget: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */,
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */,
      baseline: Int /* Some(CInt) */
  )(using Runtime): Unit /* None */ =
    gtk_layout_manager_allocate(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLayoutManager]],
      widget.getUnsafeRawPointer().asInstanceOf,
      width,
      height,
      baseline
    )
  end allocate

  /** Retrieves a `GtkLayoutChild` instance for the `GtkLayoutManager`, creating
    * one if necessary.
    *
    * The @child widget must be a child of the widget using @manager.
    *
    * The `GtkLayoutChild` instance is owned by the `GtkLayoutManager`, and is
    * guaranteed to exist as long as @child is a child of the `GtkWidget` using
    * the given `GtkLayoutManager`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLayoutChild(
      child: sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): sn.gnome.gtk4.fluent.LayoutChild /* None */ =
    sn.gnome.gtk4.fluent.LayoutChild.applyUnsafe(
      gtk_layout_manager_get_layout_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLayoutManager]],
        child.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end getLayoutChild

  /** Retrieves the request mode of @manager.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRequestMode(): SizeRequestMode /* None */ =
    SizeRequestMode.fromRaw(
      gtk_layout_manager_get_request_mode(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLayoutManager]]
      )
    )
  end getRequestMode

  /** Retrieves the `GtkWidget` using the given `GtkLayoutManager`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWidget()(using Runtime): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_layout_manager_get_widget(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLayoutManager]]
      ).asInstanceOf
    )
  end getWidget

  /** Queues a resize on the `GtkWidget` using @manager, if any.
    *
    * This function should be called by subclasses of `GtkLayoutManager` in
    * response to changes to their layout management policies.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def layoutChanged(): Unit /* None */ =
    gtk_layout_manager_layout_changed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLayoutManager]]
    )
  end layoutChanged

  /** Measures the size of the @widget using @manager, for the given @orientation
    * and size.
    *
    * See the [class@Gtk.Widget] documentation on layout management for more
    * details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method measure]: Method measure contains an OUT parameter, which is not supported yet"
  )
  private def measure__ = ???

end LayoutManager

object LayoutManager:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkLayoutManager])(using Runtime) =
    summon[Runtime].getOrCreate[LayoutManager](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new LayoutManager(ptr)
    )

end LayoutManager
