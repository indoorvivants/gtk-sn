package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GUnixCredentialsMessagePrivate

class UnixCredentialsMessagePrivate private[gnome] (
    raw: Ptr[GUnixCredentialsMessagePrivate]
):

  def getUnsafeRawPointer(): Ptr[GUnixCredentialsMessagePrivate] = this.raw
end UnixCredentialsMessagePrivate

object UnixCredentialsMessagePrivate:
  def fromRaw(
      ptr: Ptr[GUnixCredentialsMessagePrivate]
  ): UnixCredentialsMessagePrivate = new UnixCredentialsMessagePrivate(ptr)
end UnixCredentialsMessagePrivate
