package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkShortcutManagerInterface

/** The list of functions that can be implemented for the `GtkShortcutManager`
  * interface.
  *
  * Note that no function is mandatory to implement, the default implementation
  * will work fine.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ShortcutManagerInterface private[gnome] (
    raw: Ptr[GtkShortcutManagerInterface]
):

  def getUnsafeRawPointer(): Ptr[GtkShortcutManagerInterface] = this.raw

  @annotation.compileTimeOnly("[field add_controller]: Field is missing <type>")
  private def addController__ = ???
  @annotation.compileTimeOnly(
    "[field remove_controller]: Field is missing <type>"
  )
  private def removeController__ = ???
end ShortcutManagerInterface

object ShortcutManagerInterface:
  def fromRaw(ptr: Ptr[GtkShortcutManagerInterface]): ShortcutManagerInterface =
    new ShortcutManagerInterface(ptr)
end ShortcutManagerInterface
