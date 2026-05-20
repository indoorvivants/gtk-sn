package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.TypeInterface
import sn.gnome.gtk4.internal.GtkAccessibleInterface

/** The common interface for accessible objects.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AccessibleInterface private[gnome] (raw: Ptr[GtkAccessibleInterface]):

  def getUnsafeRawPointer(): Ptr[GtkAccessibleInterface] = this.raw

  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field get_at_context]: Field is missing <type>")
  private def getAtContext__ = ???
  @annotation.compileTimeOnly(
    "[field get_platform_state]: Field is missing <type>"
  )
  private def getPlatformState__ = ???
  @annotation.compileTimeOnly(
    "[field get_accessible_parent]: Field is missing <type>"
  )
  private def getAccessibleParent__ = ???
  @annotation.compileTimeOnly(
    "[field get_first_accessible_child]: Field is missing <type>"
  )
  private def getFirstAccessibleChild__ = ???
  @annotation.compileTimeOnly(
    "[field get_next_accessible_sibling]: Field is missing <type>"
  )
  private def getNextAccessibleSibling__ = ???
  @annotation.compileTimeOnly("[field get_bounds]: Field is missing <type>")
  private def getBounds__ = ???
end AccessibleInterface

object AccessibleInterface:
  def fromRaw(ptr: Ptr[GtkAccessibleInterface]): AccessibleInterface =
    new AccessibleInterface(ptr)
end AccessibleInterface
