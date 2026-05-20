package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.TypeInterface
import sn.gnome.gtk4.internal.GtkOrientableIface

class OrientableIface private[gnome] (raw: Ptr[GtkOrientableIface]):

  def getUnsafeRawPointer(): Ptr[GtkOrientableIface] = this.raw

  def baseIface: sn.gnome.gobject.TypeInterface /* None */ = (!raw).base_iface
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
end OrientableIface

object OrientableIface:
  def fromRaw(ptr: Ptr[GtkOrientableIface]): OrientableIface =
    new OrientableIface(ptr)
end OrientableIface
