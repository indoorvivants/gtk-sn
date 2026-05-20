package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GAppLaunchContextPrivate

class AppLaunchContextPrivate private[gnome] (
    raw: Ptr[GAppLaunchContextPrivate]
):

  def getUnsafeRawPointer(): Ptr[GAppLaunchContextPrivate] = this.raw
end AppLaunchContextPrivate

object AppLaunchContextPrivate:
  def fromRaw(ptr: Ptr[GAppLaunchContextPrivate]): AppLaunchContextPrivate =
    new AppLaunchContextPrivate(ptr)
end AppLaunchContextPrivate
