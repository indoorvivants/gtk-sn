package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GThreadedSocketServicePrivate

class ThreadedSocketServicePrivate private[gnome] (
    raw: Ptr[GThreadedSocketServicePrivate]
):

  def getUnsafeRawPointer(): Ptr[GThreadedSocketServicePrivate] = this.raw
end ThreadedSocketServicePrivate

object ThreadedSocketServicePrivate:
  def fromRaw(
      ptr: Ptr[GThreadedSocketServicePrivate]
  ): ThreadedSocketServicePrivate = new ThreadedSocketServicePrivate(ptr)
end ThreadedSocketServicePrivate
