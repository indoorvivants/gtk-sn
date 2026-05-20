package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.internal.GClosureNotifyData

class ClosureNotifyData private[gnome] (raw: Ptr[GClosureNotifyData]):

  def getUnsafeRawPointer(): Ptr[GClosureNotifyData] = this.raw

  def data: Ptr[Byte] /* None */ =
    (!raw).data.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
  def data_=(value: Ptr[Byte] /* None */ ): Unit = (!raw).data_=(
    gpointer(value).asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
  )
  @annotation.compileTimeOnly(
    "[field notify]: Field notify has no target types"
  )
  private def notify__ = ???
end ClosureNotifyData

object ClosureNotifyData:
  def fromRaw(ptr: Ptr[GClosureNotifyData]): ClosureNotifyData =
    new ClosureNotifyData(ptr)
end ClosureNotifyData
