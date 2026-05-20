package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.internal.{GType, GTypeInstance}

/** An opaque structure used as the base of all type instances.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TypeInstance private[gnome] (raw: Ptr[GTypeInstance]):

  def getUnsafeRawPointer(): Ptr[GTypeInstance] = this.raw

  def getPrivate(private_type: GType /* Some(GType) */ ): Ptr[Byte] /* None */ =
    g_type_instance_get_private(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTypeInstance]],
      private_type
    ).value
  end getPrivate

end TypeInstance

object TypeInstance:
  def fromRaw(ptr: Ptr[GTypeInstance]): TypeInstance = new TypeInstance(ptr)
end TypeInstance
