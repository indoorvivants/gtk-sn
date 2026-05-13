package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait SymbolicPaintable:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Snapshots the paintable with the given colors.
    *
    * If less than 4 colors are provided, GTK will pad the array with default
    * colors.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method snapshot_symbolic/<method parameters>/colors]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(GdkRGBA)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(4), @type -> DataRecord(const GdkRGBA*)))"
  )
  private def snapshotSymbolic__ = ???

end SymbolicPaintable

object SymbolicPaintable:
  class Abstract(raw: Ptr[Byte]) extends SymbolicPaintable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end SymbolicPaintable
