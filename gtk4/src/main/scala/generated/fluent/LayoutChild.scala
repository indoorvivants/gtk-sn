package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.LayoutManager
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkLayoutChild

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkLayoutChild` is the base class for objects that are meant to hold layout
  * properties.
  *
  * If a `GtkLayoutManager` has per-child properties, like their packing type,
  * or the horizontal and vertical span, or the icon name, then the layout
  * manager should use a `GtkLayoutChild` implementation to store those
  * properties.
  *
  * A `GtkLayoutChild` instance is only ever valid while a widget is part of a
  * layout.
  */
class LayoutChild(raw: Ptr[GtkLayoutChild]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the `GtkWidget` associated to the given @layout_child.
    */
  def getChildWidget(): Widget /* None */ = new Widget(
    gtk_layout_child_get_child_widget(
      this.raw.asInstanceOf[Ptr[GtkLayoutChild]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the `GtkLayoutManager` instance that created the given @layout_child.
    */
  def getLayoutManager(): LayoutManager /* None */ = new LayoutManager(
    gtk_layout_child_get_layout_manager(
      this.raw.asInstanceOf[Ptr[GtkLayoutChild]]
    ).asInstanceOf
  )

end LayoutChild
