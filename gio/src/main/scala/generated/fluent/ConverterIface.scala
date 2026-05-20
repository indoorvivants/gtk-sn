package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GConverterIface
import sn.gnome.gobject.TypeInterface

/** Provides an interface for converting data from one type to another type. The
  * conversion can be stateful and may fail at any place.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ConverterIface private[gnome] (raw: Ptr[GConverterIface]):

  def getUnsafeRawPointer(): Ptr[GConverterIface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field convert]: Field is missing <type>")
  private def convert__ = ???
  @annotation.compileTimeOnly("[field reset]: Field is missing <type>")
  private def reset__ = ???
end ConverterIface

object ConverterIface:
  def fromRaw(ptr: Ptr[GConverterIface]): ConverterIface = new ConverterIface(
    ptr
  )
end ConverterIface
