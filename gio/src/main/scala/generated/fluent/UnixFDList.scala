package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GUnixFDList
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** A #GUnixFDList contains a list of file descriptors. It owns the file
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class UnixFDList private[gnome] (raw: Ptr[GUnixFDList])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a file descriptor to @list.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def append(
      fd: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): GResult[Int /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_unix_fd_list_append(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GUnixFDList]],
        gint(fd),
        __errorPtr
      ).value
    )
  end append

  /** Gets a file descriptor out of @list.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def get(
      `index_`: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): GResult[Int /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_unix_fd_list_get(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GUnixFDList]],
        gint(`index_`),
        __errorPtr
      ).value
    )
  end get

  /** Gets the length of @list (ie: the number of file descriptors contained
    * within).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLength(): Int /* None */ =
    g_unix_fd_list_get_length(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GUnixFDList]]
    ).value
  end getLength

  /** Returns the array of file descriptors that is contained in this object.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method peek_fds]: Method peek_fds contains an OUT parameter, which is not supported yet"
  )
  private def peekFds__ = ???

  /** Returns the array of file descriptors that is contained in this object.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method steal_fds]: Method steal_fds contains an OUT parameter, which is not supported yet"
  )
  private def stealFds__ = ???

end UnixFDList

object UnixFDList:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GUnixFDList])(using Runtime) =
    summon[Runtime].getOrCreate[UnixFDList](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new UnixFDList(ptr)
    )

  /** Creates a new #GUnixFDList containing no file descriptors.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): UnixFDList =
    val raw: Ptr[Byte] = g_unix_fd_list_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[UnixFDList](raw, r => UnixFDList.applyUnsafe(r.asInstanceOf))
  end apply

  /** Creates a new #GUnixFDList containing the file descriptors given in
    * @fds.
    *   The file descriptors become the property of the new list and may no
    *   longer be used by the caller. The array itself is owned by the caller.
    *
    * Each file descriptor in the array should be set to close-on-exec.
    *
    * If @n_fds is -1 then @fds must be terminated with -1.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new_from_array/fds]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gint), @type -> DataRecord(gint)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const gint*)))"
  )
  private def fromArray() = ???

end UnixFDList
