package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GIOExtension
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.TypeClass
import sn.gnome.gobject.internal.GType

/** #GIOExtension is an opaque data structure and can only be accessed using the
  * following functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class IOExtension private[gnome] (raw: Ptr[GIOExtension]):

  def getUnsafeRawPointer(): Ptr[GIOExtension] = this.raw

  /** Gets the name under which @extension was registered.
    *
    * Note that the same type may be registered as extension for multiple
    * extension points, under different names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName(): scala.Predef.String /* None */ =
    fromCString(
      g_io_extension_get_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOExtension]]
      ).asInstanceOf
    )
  end getName

  /** Gets the priority with which @extension was registered.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPriority(): Int /* None */ =
    g_io_extension_get_priority(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOExtension]]
    ).value
  end getPriority

  /** Gets the type associated with @extension.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getType(): GType /* None */ =
    g_io_extension_get_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOExtension]]
    )
  end getType

  /** Gets a reference to the class for the type that is associated with @extension.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def refClass(): sn.gnome.gobject.TypeClass /* None */ =
    sn.gnome.gobject.TypeClass.fromRaw(
      g_io_extension_ref_class(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOExtension]]
      )
    )
  end refClass

end IOExtension

object IOExtension:
  def fromRaw(ptr: Ptr[GIOExtension]): IOExtension = new IOExtension(ptr)
end IOExtension
