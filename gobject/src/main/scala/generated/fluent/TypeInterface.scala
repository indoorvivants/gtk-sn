package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.TypeInterface
import sn.gnome.gobject.internal.GTypeInterface

/** An opaque structure used as the base of all interface types.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TypeInterface private[gnome] (raw: Ptr[GTypeInterface]):

  def getUnsafeRawPointer(): Ptr[GTypeInterface] = this.raw

  /** Returns the corresponding #GTypeInterface structure of the parent type of
    * the instance type to which @g_iface belongs. This is useful when deriving
    * the implementation of an interface from the parent type and then possibly
    * overriding some methods.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def peekParent(): sn.gnome.gobject.TypeInterface /* None */ =
    sn.gnome.gobject.TypeInterface.fromRaw(
      g_type_interface_peek_parent(
        this
          .getUnsafeRawPointer()
          .asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
      )
    )
  end peekParent

end TypeInterface

object TypeInterface:
  def fromRaw(ptr: Ptr[GTypeInterface]): TypeInterface = new TypeInterface(ptr)
end TypeInterface
