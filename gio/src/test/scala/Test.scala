import sn.gnome.gio.internal.GAsyncReadyCallback

class AsyncReadyCallback(raw: GAsyncReadyCallback)

object AsyncReadyCallback:
  def apply(f: (gobject: sn.gnome.gobject.Object, res: sn.gnome.gio.AsyncResult) => Unit)(using Runtime) =
    ???
