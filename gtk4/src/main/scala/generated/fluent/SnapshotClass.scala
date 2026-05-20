package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkSnapshotClass

class SnapshotClass private[gnome] (raw: Ptr[GtkSnapshotClass]):

  def getUnsafeRawPointer(): Ptr[GtkSnapshotClass] = this.raw
end SnapshotClass

object SnapshotClass:
  def fromRaw(ptr: Ptr[GtkSnapshotClass]): SnapshotClass = new SnapshotClass(
    ptr
  )
end SnapshotClass
