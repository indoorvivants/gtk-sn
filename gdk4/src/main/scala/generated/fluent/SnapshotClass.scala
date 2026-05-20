package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkSnapshotClass

class SnapshotClass private[gnome] (raw: Ptr[GdkSnapshotClass]):

  def getUnsafeRawPointer(): Ptr[GdkSnapshotClass] = this.raw
end SnapshotClass

object SnapshotClass:
  def fromRaw(ptr: Ptr[GdkSnapshotClass]): SnapshotClass = new SnapshotClass(
    ptr
  )
end SnapshotClass
