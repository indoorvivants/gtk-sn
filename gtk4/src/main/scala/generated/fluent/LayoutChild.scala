package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{LayoutManager, Widget}
import sn.gnome.gtk4.internal.GtkLayoutChild

/** `GtkLayoutChild` is the base class for objects that are meant to hold layout
  * properties.
  *
  * If a `GtkLayoutManager` has per-child properties, like their packing type,
  * or the horizontal and vertical span, or the icon name, then the layout
  * manager should use a `GtkLayoutChild` implementation to store those
  * properties.
  *
  * A `GtkLayoutChild` instance is only ever valid while a widget is part of a
  * layout.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class LayoutChild private[gnome] (raw: Ptr[GtkLayoutChild])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the `GtkWidget` associated to the given @layout_child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChildWidget()(using Runtime): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_layout_child_get_child_widget(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLayoutChild]]
      ).asInstanceOf
    )
  end getChildWidget

  /** Retrieves the `GtkLayoutManager` instance that created the given @layout_child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLayoutManager()(using
      Runtime
  ): sn.gnome.gtk4.fluent.LayoutManager /* None */ =
    sn.gnome.gtk4.fluent.LayoutManager.applyUnsafe(
      gtk_layout_child_get_layout_manager(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLayoutChild]]
      ).asInstanceOf
    )
  end getLayoutManager

end LayoutChild

object LayoutChild:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkLayoutChild])(using Runtime) =
    summon[Runtime].getOrCreate[LayoutChild](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new LayoutChild(ptr)
    )

end LayoutChild
