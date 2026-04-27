package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GUnixFDList
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

class UnixFDList(raw: Ptr[GUnixFDList]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def append(fd: Int): GResult[Int] = GResult.wrap(__errorPtr =>
    g_unix_fd_list_append(this.raw.asInstanceOf, gint(fd), __errorPtr).value
  )

  def get(`index_`: Int): GResult[Int] = GResult.wrap(__errorPtr =>
    g_unix_fd_list_get(this.raw.asInstanceOf, gint(`index_`), __errorPtr).value
  )

  def getLength(): Int = g_unix_fd_list_get_length(this.raw.asInstanceOf).value

  // Method peek_fds contains an OUT parameter, which is not supported yet

  // Method steal_fds contains an OUT parameter, which is not supported yet

end UnixFDList

object UnixFDList:
  def apply(): UnixFDList = new UnixFDList(g_unix_fd_list_new().asInstanceOf)
  def fromArray(fds: Ptr[Int], n_fds: Int): UnixFDList = new UnixFDList(
    g_unix_fd_list_new_from_array(fds.asInstanceOf, gint(n_fds)).asInstanceOf
  )
end UnixFDList
