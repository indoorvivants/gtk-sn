package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.IOExtension
import sn.gnome.gio.internal.GIOExtensionPoint
import sn.gnome.glib.List
import sn.gnome.gobject.internal.GType

/** #GIOExtensionPoint is an opaque data structure and can only be accessed
  * using the following functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class IOExtensionPoint private[gnome] (raw: Ptr[GIOExtensionPoint]):

  def getUnsafeRawPointer(): Ptr[GIOExtensionPoint] = this.raw

  /** Finds a #GIOExtension for an extension point by name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExtensionByName(
      name: scala.Predef.String /* Some(CString) */
  )(using Zone): sn.gnome.gio.IOExtension /* None */ =
    sn.gnome.gio.IOExtension.fromRaw(
      g_io_extension_point_get_extension_by_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOExtensionPoint]],
        toCString(name)
      )
    )
  end getExtensionByName

  /** Gets a list of all extensions that implement this extension point. The
    * list is sorted by priority, beginning with the highest priority.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExtensions(): sn.gnome.glib.List /* None */ =
    sn.gnome.glib.List.fromRaw(
      g_io_extension_point_get_extensions(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOExtensionPoint]]
      )
    )
  end getExtensions

  /** Gets the required type for @extension_point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRequiredType(): GType /* None */ =
    g_io_extension_point_get_required_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOExtensionPoint]]
    )
  end getRequiredType

  /** Sets the required type for @extension_point to @type. All implementations
    * must henceforth have this type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRequiredType(
      `type`: GType /* Some(_root_.sn.gnome.gobject.internal.GType) */
  ): Unit /* None */ =
    g_io_extension_point_set_required_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOExtensionPoint]],
      `type`
    )
  end setRequiredType

end IOExtensionPoint

object IOExtensionPoint:
  def fromRaw(ptr: Ptr[GIOExtensionPoint]): IOExtensionPoint =
    new IOExtensionPoint(ptr)
end IOExtensionPoint
