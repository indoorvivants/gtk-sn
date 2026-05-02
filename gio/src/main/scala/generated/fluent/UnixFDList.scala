package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GUnixFDList
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A #GUnixFDList contains a list of file descriptors. It owns the file
  * descriptors that it contains, closing them when finalized.
  *
  * It may be wrapped in a #GUnixFDMessage and sent over a #GSocket in the
  * %G_SOCKET_FAMILY_UNIX family by using g_socket_send_message() and received
  * using g_socket_receive_message().
  *
  * Before 2.74, `<gio/gunixfdlist.h>` belonged to the UNIX-specific GIO
  * interfaces, thus you had to use the `gio-unix-2.0.pc` pkg-config file when
  * using it.
  *
  * Since 2.74, the API is available for Windows.
  */
class UnixFDList(raw: Ptr[GUnixFDList]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a file descriptor to @list.
    *
    * The file descriptor is duplicated using dup(). You keep your copy of the
    * descriptor and the copy contained in @list will be closed when @list is
    * finalized.
    *
    * A possible cause of failure is exceeding the per-process or system-wide
    * file descriptor limit.
    *
    * The index of the file descriptor in the list is returned. If you use this
    * index with g_unix_fd_list_get() then you will receive back a duplicated
    * copy of the same file descriptor.
    */
  def append(
      fd: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): GResult[Int /* None */ ] = GResult.wrap(__errorPtr =>
    g_unix_fd_list_append(this.raw.asInstanceOf, gint(fd), __errorPtr).value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a file descriptor out of @list.
    *
    * @index_
    *   specifies the index of the file descriptor to get. It is a programmer
    *   error for @index_ to be out of range; see g_unix_fd_list_get_length().
    *
    * The file descriptor is duplicated using dup() and set as close-on-exec
    * before being returned. You must call close() on it when you are done.
    *
    * A possible cause of failure is exceeding the per-process or system-wide
    * file descriptor limit.
    */
  def get(
      `index_`: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): GResult[Int /* None */ ] = GResult.wrap(__errorPtr =>
    g_unix_fd_list_get(this.raw.asInstanceOf, gint(`index_`), __errorPtr).value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the length of @list (ie: the number of file descriptors contained
    * within).
    */
  def getLength(): Int /* None */ = g_unix_fd_list_get_length(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the array of file descriptors that is contained in this object.
    *
    * After this call, the descriptors remain the property of @list. The caller
    * must not close them and must not free the array. The array is valid only
    * until @list is changed in any way.
    *
    * If @length is non-%NULL then it is set to the number of file descriptors
    * in the returned array. The returned array is also terminated with -1.
    *
    * This function never returns %NULL. In case there are no file descriptors
    * contained in @list, an empty array is returned.
    */
  @annotation.compileTimeOnly(
    "Method peek_fds contains an OUT parameter, which is not supported yet"
  )
  private def peekFds__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the array of file descriptors that is contained in this object.
    *
    * After this call, the descriptors are no longer contained in
    * @list.
    *   Further calls will return an empty list (unless more descriptors have
    *   been added).
    *
    * The return result of this function must be freed with g_free(). The caller
    * is also responsible for closing all of the file descriptors. The file
    * descriptors in the array are set to close-on-exec.
    *
    * If @length is non-%NULL then it is set to the number of file descriptors
    * in the returned array. The returned array is also terminated with -1.
    *
    * This function never returns %NULL. In case there are no file descriptors
    * contained in @list, an empty array is returned.
    */
  @annotation.compileTimeOnly(
    "Method steal_fds contains an OUT parameter, which is not supported yet"
  )
  private def stealFds__ = ???

end UnixFDList

object UnixFDList:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GUnixFDList containing no file descriptors.
    */
  def apply(): UnixFDList = new UnixFDList(g_unix_fd_list_new().asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GUnixFDList containing the file descriptors given in
    * @fds.
    *   The file descriptors become the property of the new list and may no
    *   longer be used by the caller. The array itself is owned by the caller.
    *
    * Each file descriptor in the array should be set to close-on-exec.
    *
    * If @n_fds is -1 then @fds must be terminated with -1.
    */
  def fromArray(
      fds: Ptr[Int] /* Some(Ptr[_root_.sn.gnome.glib.internal.gint]) */,
      n_fds: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): UnixFDList = new UnixFDList(
    g_unix_fd_list_new_from_array(fds.asInstanceOf, gint(n_fds)).asInstanceOf
  )
end UnixFDList
