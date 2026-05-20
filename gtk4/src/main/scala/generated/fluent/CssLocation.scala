package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gsize
import sn.gnome.gtk4.internal.GtkCssLocation

class CssLocation private[gnome] (raw: Ptr[GtkCssLocation]):

  def getUnsafeRawPointer(): Ptr[GtkCssLocation] = this.raw

  def bytes: CUnsignedLongInt /* None */ =
    (!raw).bytes.asInstanceOf[_root_.sn.gnome.glib.internal.gsize]
  def bytes_=(value: CUnsignedLongInt /* None */ ): Unit = (!raw).bytes_=(
    gsize(value).asInstanceOf[_root_.sn.gnome.glib.internal.gsize]
  )

  def chars: CUnsignedLongInt /* None */ =
    (!raw).chars.asInstanceOf[_root_.sn.gnome.glib.internal.gsize]
  def chars_=(value: CUnsignedLongInt /* None */ ): Unit = (!raw).chars_=(
    gsize(value).asInstanceOf[_root_.sn.gnome.glib.internal.gsize]
  )

  def lines: CUnsignedLongInt /* None */ =
    (!raw).lines.asInstanceOf[_root_.sn.gnome.glib.internal.gsize]
  def lines_=(value: CUnsignedLongInt /* None */ ): Unit = (!raw).lines_=(
    gsize(value).asInstanceOf[_root_.sn.gnome.glib.internal.gsize]
  )

  def lineBytes: CUnsignedLongInt /* None */ =
    (!raw).line_bytes.asInstanceOf[_root_.sn.gnome.glib.internal.gsize]
  def lineBytes_=(value: CUnsignedLongInt /* None */ ): Unit =
    (!raw).line_bytes_=(
      gsize(value).asInstanceOf[_root_.sn.gnome.glib.internal.gsize]
    )

  def lineChars: CUnsignedLongInt /* None */ =
    (!raw).line_chars.asInstanceOf[_root_.sn.gnome.glib.internal.gsize]
  def lineChars_=(value: CUnsignedLongInt /* None */ ): Unit =
    (!raw).line_chars_=(
      gsize(value).asInstanceOf[_root_.sn.gnome.glib.internal.gsize]
    )
end CssLocation

object CssLocation:
  def fromRaw(ptr: Ptr[GtkCssLocation]): CssLocation = new CssLocation(ptr)
end CssLocation
