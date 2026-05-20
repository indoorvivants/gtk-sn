package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GSettingsBackendPrivate

class SettingsBackendPrivate private[gnome] (raw: Ptr[GSettingsBackendPrivate]):

  def getUnsafeRawPointer(): Ptr[GSettingsBackendPrivate] = this.raw

end SettingsBackendPrivate
object SettingsBackendPrivate:
  def fromRaw(ptr: Ptr[GSettingsBackendPrivate]): SettingsBackendPrivate =
    new SettingsBackendPrivate(ptr)
end SettingsBackendPrivate
