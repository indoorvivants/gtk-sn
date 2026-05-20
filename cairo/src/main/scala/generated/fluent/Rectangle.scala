package sn.gnome.cairo

import _root_.sn.gnome.cairo.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.internal.cairo_rectangle_t
import sn.gnome.glib.internal.gdouble

class Rectangle private[gnome] (raw: Ptr[cairo_rectangle_t]):

  def getUnsafeRawPointer(): Ptr[cairo_rectangle_t] = this.raw

  def x: Double /* None */ = (!raw).x.asInstanceOf[Double]
  def x_=(value: Double /* None */ ): Unit =
    (!raw).x_=(gdouble(value).asInstanceOf[Double])

  def y: Double /* None */ = (!raw).y.asInstanceOf[Double]
  def y_=(value: Double /* None */ ): Unit =
    (!raw).y_=(gdouble(value).asInstanceOf[Double])

  def width: Double /* None */ = (!raw).width.asInstanceOf[Double]
  def width_=(value: Double /* None */ ): Unit =
    (!raw).width_=(gdouble(value).asInstanceOf[Double])

  def height: Double /* None */ = (!raw).height.asInstanceOf[Double]
  def height_=(value: Double /* None */ ): Unit =
    (!raw).height_=(gdouble(value).asInstanceOf[Double])
end Rectangle

object Rectangle:
  def fromRaw(ptr: Ptr[cairo_rectangle_t]): Rectangle = new Rectangle(ptr)
end Rectangle
