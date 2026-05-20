package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GSettingsPrivate

class SettingsPrivate private[gnome] (raw: Ptr[GSettingsPrivate]):

  def getUnsafeRawPointer(): Ptr[GSettingsPrivate] = this.raw
end SettingsPrivate

object SettingsPrivate:
  def fromRaw(ptr: Ptr[GSettingsPrivate]): SettingsPrivate =
    new SettingsPrivate(ptr)
end SettingsPrivate
