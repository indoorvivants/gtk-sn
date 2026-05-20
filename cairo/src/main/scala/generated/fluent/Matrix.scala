package sn.gnome.cairo

import _root_.sn.gnome.cairo.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.internal.cairo_matrix_t

class Matrix private[gnome] (raw: Ptr[cairo_matrix_t]):

  def getUnsafeRawPointer(): Ptr[cairo_matrix_t] = this.raw
end Matrix

object Matrix:
  def fromRaw(ptr: Ptr[cairo_matrix_t]): Matrix = new Matrix(ptr)
end Matrix
