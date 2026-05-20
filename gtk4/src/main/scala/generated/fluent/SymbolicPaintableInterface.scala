package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkSymbolicPaintableInterface

/** The list of virtual functions for the `GtkSymbolicPaintable` interface. No
  * function must be implemented, default implementations exist for each one.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SymbolicPaintableInterface private[gnome] (
    raw: Ptr[GtkSymbolicPaintableInterface]
):

  def getUnsafeRawPointer(): Ptr[GtkSymbolicPaintableInterface] = this.raw

  @annotation.compileTimeOnly(
    "[field snapshot_symbolic]: Field is missing <type>"
  )
  private def snapshotSymbolic__ = ???
end SymbolicPaintableInterface

object SymbolicPaintableInterface:
  def fromRaw(
      ptr: Ptr[GtkSymbolicPaintableInterface]
  ): SymbolicPaintableInterface = new SymbolicPaintableInterface(ptr)
end SymbolicPaintableInterface
