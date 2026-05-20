package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.Transform
import sn.gnome.gtk4.LayoutChild
import sn.gnome.gtk4.internal.GtkFixedLayoutChild

/** `GtkLayoutChild` subclass for children in a `GtkFixedLayout`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FixedLayoutChild private[gnome] (raw: Ptr[GtkFixedLayoutChild])
    extends LayoutChild(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the transformation of the child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTransform(): sn.gnome.gsk4.Transform /* None */ =
    sn.gnome.gsk4.Transform.fromRaw(
      gtk_fixed_layout_child_get_transform(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFixedLayoutChild]]
      )
    )
  end getTransform

  /** Sets the transformation of the child of a `GtkFixedLayout`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTransform(
      transform: sn.gnome.gsk4.Transform /* Some(Ptr[_root_.sn.gnome.gsk4.internal.GskTransform]) */
  ): Unit /* None */ =
    gtk_fixed_layout_child_set_transform(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFixedLayoutChild]],
      transform.getUnsafeRawPointer().asInstanceOf
    )
  end setTransform

end FixedLayoutChild

object FixedLayoutChild:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkFixedLayoutChild])(using Runtime) =
    summon[Runtime].getOrCreate[FixedLayoutChild](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new FixedLayoutChild(ptr)
    )

end FixedLayoutChild
