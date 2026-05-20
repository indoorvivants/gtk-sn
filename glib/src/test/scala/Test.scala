import sn.gnome.gio.internal.GAsyncReadyCallback

class AsyncReadyCallback(raw: GAsyncReadyCallback)

object AsyncReadyCallback:
  def apply(f: (gobject: sn.gnome.gobject.Object, res: sn.gnome.gio.AsyncResult) => Unit)(using Runtime) =
    ???

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*
