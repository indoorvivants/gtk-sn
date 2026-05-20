package sn.gnome.cairo

import _root_.sn.gnome.cairo.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.internal.cairo_rectangle_int_t
import sn.gnome.glib.internal.gint

class RectangleInt private[gnome] (raw: Ptr[cairo_rectangle_int_t]):

  def getUnsafeRawPointer(): Ptr[cairo_rectangle_int_t] = this.raw

  def x: Int /* None */ = (!raw).x.asInstanceOf[CInt]
  def x_=(value: Int /* None */ ): Unit =
    (!raw).x_=(gint(value).asInstanceOf[CInt])

  def y: Int /* None */ = (!raw).y.asInstanceOf[CInt]
  def y_=(value: Int /* None */ ): Unit =
    (!raw).y_=(gint(value).asInstanceOf[CInt])

  def width: Int /* None */ = (!raw).width.asInstanceOf[CInt]
  def width_=(value: Int /* None */ ): Unit =
    (!raw).width_=(gint(value).asInstanceOf[CInt])

  def height: Int /* None */ = (!raw).height.asInstanceOf[CInt]
  def height_=(value: Int /* None */ ): Unit =
    (!raw).height_=(gint(value).asInstanceOf[CInt])
end RectangleInt

object RectangleInt:
  def fromRaw(ptr: Ptr[cairo_rectangle_int_t]): RectangleInt = new RectangleInt(
    ptr
  )
end RectangleInt
