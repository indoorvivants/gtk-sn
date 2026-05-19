package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.{
  AppInfo,
  AsyncResult,
  Cancellable,
  File,
  FileAttributeType,
  FileCopyFlags,
  FileCreateFlags,
  FileEnumerator,
  FileIOStream,
  FileInfo,
  FileInputStream,
  FileMonitor,
  FileMonitorFlags,
  FileOutputStream,
  FileQueryInfoFlags,
  FileType,
  Mount
}
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{
  gboolean,
  gint,
  gint32,
  gint64,
  gpointer,
  guint,
  guint32,
  guint64
}
import sn.gnome.gobject.runtime.*

trait File:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Gets an output stream for appending data to the file. If the file doesn't
    * already exist it is created.
    *
    * By default files created are generally readable by everyone, but if you
    * pass %G_FILE_CREATE_PRIVATE in @flags the file will be made readable only
    * to the current user, to the level that is supported on the target
    * filesystem.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * Some file systems don't allow all file names, and may return an
    * %G_IO_ERROR_INVALID_FILENAME error. If the file is a directory the
    * %G_IO_ERROR_IS_DIRECTORY error will be returned. Other errors are possible
    * too, and depend on what kind of filesystem the file is on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendTo(
      flags: FileCreateFlags /* Some(GFileCreateFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[sn.gnome.gio.FileOutputStream /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileOutputStream.applyUnsafe(
        g_file_append_to(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          flags.raw,
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end appendTo

  /** Asynchronously opens @file for appending.
    *
    * For more details, see g_file_append_to() which is the synchronous version
    * of this call.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_file_append_to_finish() to get the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method append_to_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def appendToAsync__ = ???

  /** Finishes an asynchronous file append operation started with
    * g_file_append_to_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendToFinish(
      res: AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.gio.FileOutputStream /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileOutputStream.applyUnsafe(
        g_file_append_to_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          res.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end appendToFinish

  /** Prepares the file attribute query string for copying to @file.
    *
    * This function prepares an attribute query string to be passed to
    * g_file_query_info() to get a list of attributes normally copied with the
    * file (see g_file_copy_attributes() for the detailed description). This
    * function is used by the implementation of g_file_copy_attributes() and is
    * useful when one needs to query and set the attributes in two stages (e.g.,
    * for recursive move of a directory).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def buildAttributeListForCopy(
      flags: FileCopyFlags /* Some(GFileCopyFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[String /* None */ ] =
    GResult.wrap(__errorPtr =>
      fromCString(
        g_file_build_attribute_list_for_copy(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          flags.raw,
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end buildAttributeListForCopy

  /** Copies the file @source to the location specified by @destination. Can not
    * handle recursive copies of directories.
    *
    * If the flag %G_FILE_COPY_OVERWRITE is specified an already existing @destination
    * file is overwritten.
    *
    * If the flag %G_FILE_COPY_NOFOLLOW_SYMLINKS is specified then symlinks will
    * be copied as symlinks, otherwise the target of the
    * @source
    *   symlink will be copied.
    *
    * If the flag %G_FILE_COPY_ALL_METADATA is specified then all the metadata
    * that is possible to copy is copied, not just the default subset (which,
    * for instance, does not include the owner, see #GFileInfo).
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * If @progress_callback is not %NULL, then the operation can be monitored by
    * setting this to a #GFileProgressCallback function.
    * @progress_callback_data
    *   will be passed to this function. It is guaranteed that this callback
    *   will be called after all data has been transferred with the total number
    *   of bytes copied during the operation.
    *
    * If the @source file does not exist, then the %G_IO_ERROR_NOT_FOUND error
    * is returned, independent on the status of the @destination.
    *
    * If %G_FILE_COPY_OVERWRITE is not specified and the target exists, then the
    * error %G_IO_ERROR_EXISTS is returned.
    *
    * If trying to overwrite a file over a directory, the
    * %G_IO_ERROR_IS_DIRECTORY error is returned. If trying to overwrite a
    * directory with a directory the %G_IO_ERROR_WOULD_MERGE error is returned.
    *
    * If the source is a directory and the target does not exist, or
    * %G_FILE_COPY_OVERWRITE is specified and the target is a file, then the
    * %G_IO_ERROR_WOULD_RECURSE error is returned.
    *
    * If you are interested in copying the #GFile object itself (not the on-disk
    * file), see g_file_dup().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method copy/<method parameters>/progress_callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FileProgressCallback), @type -> DataRecord(GFileProgressCallback)))"
  )
  private def copy__ = ???

  /** Copies the file @source to the location specified by @destination
    * asynchronously. For details of the behaviour, see g_file_copy().
    *
    * If @progress_callback is not %NULL, then that function that will be called
    * just like in g_file_copy(). The callback will run in the default main
    * context of the thread calling g_file_copy_async() — the same context as @callback
    * is run in.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_file_copy_finish() to get the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method copy_async/<method parameters>/progress_callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FileProgressCallback), @type -> DataRecord(GFileProgressCallback)))"
  )
  private def copyAsync__ = ???

  /** Copies the file attributes from @source to @destination.
    *
    * Normally only a subset of the file attributes are copied, those that are
    * copies in a normal file copy operation (which for instance does not
    * include e.g. owner). However if %G_FILE_COPY_ALL_METADATA is specified in @flags,
    * then all the metadata that is possible to copy is copied. This is useful
    * when implementing move by copy + delete source.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copyAttributes(
      destination: File /* Some(Ptr[GFile]) */,
      flags: FileCopyFlags /* Some(GFileCopyFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_copy_attributes(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        destination.getUnsafeRawPointer().asInstanceOf,
        flags.raw,
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end copyAttributes

  /** Finishes copying the file started with g_file_copy_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copyFinish(
      res: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_copy_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        res.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end copyFinish

  /** Creates a new file and returns an output stream for writing to it. The
    * file must not already exist.
    *
    * By default files created are generally readable by everyone, but if you
    * pass %G_FILE_CREATE_PRIVATE in @flags the file will be made readable only
    * to the current user, to the level that is supported on the target
    * filesystem.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * If a file or directory with this name already exists the
    * %G_IO_ERROR_EXISTS error will be returned. Some file systems don't allow
    * all file names, and may return an %G_IO_ERROR_INVALID_FILENAME error, and
    * if the name is to long %G_IO_ERROR_FILENAME_TOO_LONG will be returned.
    * Other errors are possible too, and depend on what kind of filesystem the
    * file is on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def create(
      flags: FileCreateFlags /* Some(GFileCreateFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[sn.gnome.gio.FileOutputStream /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileOutputStream.applyUnsafe(
        g_file_create(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          flags.raw,
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end create

  /** Asynchronously creates a new file and returns an output stream for writing
    * to it. The file must not already exist.
    *
    * For more details, see g_file_create() which is the synchronous version of
    * this call.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_file_create_finish() to get the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method create_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def createAsync__ = ???

  /** Finishes an asynchronous file create operation started with
    * g_file_create_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def createFinish(
      res: AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.gio.FileOutputStream /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileOutputStream.applyUnsafe(
        g_file_create_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          res.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end createFinish

  /** Creates a new file and returns a stream for reading and writing to it. The
    * file must not already exist.
    *
    * By default files created are generally readable by everyone, but if you
    * pass %G_FILE_CREATE_PRIVATE in @flags the file will be made readable only
    * to the current user, to the level that is supported on the target
    * filesystem.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * If a file or directory with this name already exists, the
    * %G_IO_ERROR_EXISTS error will be returned. Some file systems don't allow
    * all file names, and may return an %G_IO_ERROR_INVALID_FILENAME error, and
    * if the name is too long, %G_IO_ERROR_FILENAME_TOO_LONG will be returned.
    * Other errors are possible too, and depend on what kind of filesystem the
    * file is on.
    *
    * Note that in many non-local file cases read and write streams are not
    * supported, so make sure you really need to do read and write streaming,
    * rather than just opening for reading or writing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def createReadwrite(
      flags: FileCreateFlags /* Some(GFileCreateFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[sn.gnome.gio.FileIOStream /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileIOStream.applyUnsafe(
        g_file_create_readwrite(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          flags.raw,
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end createReadwrite

  /** Asynchronously creates a new file and returns a stream for reading and
    * writing to it. The file must not already exist.
    *
    * For more details, see g_file_create_readwrite() which is the synchronous
    * version of this call.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_file_create_readwrite_finish() to get the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method create_readwrite_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def createReadwriteAsync__ = ???

  /** Finishes an asynchronous file create operation started with
    * g_file_create_readwrite_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def createReadwriteFinish(
      res: AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.gio.FileIOStream /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileIOStream.applyUnsafe(
        g_file_create_readwrite_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          res.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end createReadwriteFinish

  /**  Deletes a file. If the @file is a directory, it will only be
    *  deleted if it is empty. This has the same semantics as g_unlink().
    *
    *  If @file doesn’t exist, %G_IO_ERROR_NOT_FOUND will be returned. This allows
    *  for deletion to be implemented avoiding
    *  [time-of-check to time-of-use races](https://en.wikipedia.org/wiki/Time-of-check_to_time-of-use):
    *  |[
    *  g_autoptr(GError) local_error = NULL;
    *  if (!g_file_delete (my_file, my_cancellable, &local_error) &&
    *      !g_error_matches (local_error, G_IO_ERROR, G_IO_ERROR_NOT_FOUND))
    *    {
    *      // deletion failed for some reason other than the file not existing:
    *      // so report the error
    *      g_warning ("Failed to delete %s: %s",
    *                 g_file_peek_path (my_file), local_error->message);
    *    }
    *  ]|
    *
    *  If @cancellable is not %NULL, then the operation can be cancelled by
    *  triggering the cancellable object from another thread. If the operation
    *  was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def delete(
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_delete(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end delete

  /** Asynchronously delete a file. If the @file is a directory, it will only be
    * deleted if it is empty. This has the same semantics as g_unlink().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method delete_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def deleteAsync__ = ???

  /** Finishes deleting a file started with g_file_delete_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def deleteFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_delete_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end deleteFinish

  /** Duplicates a #GFile handle. This operation does not duplicate the actual
    * file or directory represented by the #GFile; see g_file_copy() if
    * attempting to copy a file.
    *
    * g_file_dup() is useful when a second handle is needed to the same
    * underlying file, for use in a separate thread (#GFile is not thread-safe).
    * For use within the same thread, use g_object_ref() to increment the
    * existing object’s reference count.
    *
    * This call does no blocking I/O.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dup(): File /* None */ =
    new File.Abstract(
      g_file_dup(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]]
      ).asInstanceOf
    )
  end dup

  /** Starts an asynchronous eject on a mountable. When this operation has
    * completed, @callback will be called with
    * @user_user
    *   data, and the operation can be finalized with
    *   g_file_eject_mountable_finish().
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method eject_mountable/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def ejectMountable__ = ???

  /** Finishes an asynchronous eject operation started by
    * g_file_eject_mountable().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ejectMountableFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_eject_mountable_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end ejectMountableFinish

  /** Starts an asynchronous eject on a mountable. When this operation has
    * completed, @callback will be called with
    * @user_user
    *   data, and the operation can be finalized with
    *   g_file_eject_mountable_with_operation_finish().
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method eject_mountable_with_operation/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def ejectMountableWithOperation__ = ???

  /** Finishes an asynchronous eject operation started by
    * g_file_eject_mountable_with_operation().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ejectMountableWithOperationFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_eject_mountable_with_operation_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end ejectMountableWithOperationFinish

  /** Gets the requested information about the files in a directory. The result
    * is a #GFileEnumerator object that will give out #GFileInfo objects for all
    * the files in the directory.
    *
    * The @attributes value is a string that specifies the file attributes that
    * should be gathered. It is not an error if it's not possible to read a
    * particular requested attribute from a file - it just won't be set. @attributes
    * should be a comma-separated list of attributes or attribute wildcards. The
    * wildcard "*" means all attributes, and a wildcard like "standard::*" means
    * all attributes in the standard namespace. An example attribute query be
    * "standard::*,owner::user". The standard attributes are available as
    * defines, like %G_FILE_ATTRIBUTE_STANDARD_NAME.
    * %G_FILE_ATTRIBUTE_STANDARD_NAME should always be specified if you plan to
    * call g_file_enumerator_get_child() or g_file_enumerator_iterate() on the
    * returned enumerator.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * If the file does not exist, the %G_IO_ERROR_NOT_FOUND error will be
    * returned. If the file is not a directory, the %G_IO_ERROR_NOT_DIRECTORY
    * error will be returned. Other errors are possible too.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def enumerateChildren(
      attributes: String /* Some(CString) */,
      flags: FileQueryInfoFlags /* Some(GFileQueryInfoFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[sn.gnome.gio.FileEnumerator /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileEnumerator.applyUnsafe(
        g_file_enumerate_children(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          summon[Runtime].inZone(toCString(attributes)),
          flags.raw,
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end enumerateChildren

  /** Asynchronously gets the requested information about the files in a
    * directory. The result is a #GFileEnumerator object that will give out
    * #GFileInfo objects for all the files in the directory.
    *
    * For more details, see g_file_enumerate_children() which is the synchronous
    * version of this call.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_file_enumerate_children_finish() to get the result of the
    * operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method enumerate_children_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def enumerateChildrenAsync__ = ???

  /** Finishes an async enumerate children operation. See
    * g_file_enumerate_children_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def enumerateChildrenFinish(
      res: AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.gio.FileEnumerator /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileEnumerator.applyUnsafe(
        g_file_enumerate_children_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          res.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end enumerateChildrenFinish

  /** Checks if the two given #GFiles refer to the same file.
    *
    * Note that two #GFiles that differ can still refer to the same file on the
    * filesystem due to various forms of filename aliasing.
    *
    * This call does no blocking I/O.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(file2: File /* Some(Ptr[GFile]) */ ): Boolean /* None */ =
    g_file_equal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
      file2.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end equal

  /** Gets a #GMount for the #GFile.
    *
    * #GMount is returned only for user interesting locations, see
    * #GVolumeMonitor. If the #GFileIface for @file does not have a #mount,
    * @error
    *   will be set to %G_IO_ERROR_NOT_FOUND and %NULL #will be returned.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def findEnclosingMount(
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Mount /* None */ ] =
    GResult.wrap(__errorPtr =>
      new Mount.Abstract(
        g_file_find_enclosing_mount(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end findEnclosingMount

  /** Asynchronously gets the mount for the file.
    *
    * For more details, see g_file_find_enclosing_mount() which is the
    * synchronous version of this call.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_file_find_enclosing_mount_finish() to get the result of the
    * operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method find_enclosing_mount_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def findEnclosingMountAsync__ = ???

  /** Finishes an asynchronous find mount request. See
    * g_file_find_enclosing_mount_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def findEnclosingMountFinish(
      res: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Mount /* None */ ] =
    GResult.wrap(__errorPtr =>
      new Mount.Abstract(
        g_file_find_enclosing_mount_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          res.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end findEnclosingMountFinish

  /** Gets the base name (the last component of the path) for a given #GFile.
    *
    * If called for the top level of a system (such as the filesystem root or a
    * uri like sftp://host/) it will return a single directory separator (and on
    * Windows, possibly a drive letter).
    *
    * The base name is a byte string (not UTF-8). It has no defined encoding or
    * rules other than it may not contain zero bytes. If you want to use
    * filenames in a user interface you should use the display name that you can
    * get by requesting the %G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME attribute
    * with g_file_query_info().
    *
    * This call does no blocking I/O.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBasename(): String /* None */ =
    fromCString(
      g_file_get_basename(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]]
      ).asInstanceOf
    )
  end getBasename

  /** Gets a child of @file with basename equal to @name.
    *
    * Note that the file with that specific name might not exist, but you can
    * still have a #GFile that points to it. You can use this for instance to
    * create that file.
    *
    * This call does no blocking I/O.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild(
      name: String /* Some(CString) */
  )(using Runtime): File /* None */ =
    new File.Abstract(
      g_file_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        summon[Runtime].inZone(toCString(name))
      ).asInstanceOf
    )
  end getChild

  /** Gets the child of @file for a given @display_name (i.e. a UTF-8 version of
    * the name). If this function fails, it returns %NULL and @error will be
    * set. This is very useful when constructing a #GFile for a new file and the
    * user entered the filename in the user interface, for instance when you
    * select a directory and type a filename in the file selector.
    *
    * This call does no blocking I/O.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChildForDisplayName(
      display_name: String /* Some(CString) */
  )(using Runtime): GResult[File /* None */ ] =
    GResult.wrap(__errorPtr =>
      new File.Abstract(
        g_file_get_child_for_display_name(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          summon[Runtime].inZone(toCString(display_name)),
          __errorPtr
        ).asInstanceOf
      )
    )
  end getChildForDisplayName

  /** Gets the parent directory for the @file. If the @file represents the root
    * directory of the file system, then %NULL will be returned.
    *
    * This call does no blocking I/O.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getParent(): File /* None */ =
    new File.Abstract(
      g_file_get_parent(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]]
      ).asInstanceOf
    )
  end getParent

  /** Gets the parse name of the @file. A parse name is a UTF-8 string that
    * describes the file such that one can get the #GFile back using
    * g_file_parse_name().
    *
    * This is generally used to show the #GFile as a nice full-pathname kind of
    * string in a user interface, like in a location entry.
    *
    * For local files with names that can safely be converted to UTF-8 the
    * pathname is used, otherwise the IRI is used (a form of URI that allows
    * UTF-8 characters unescaped).
    *
    * This call does no blocking I/O.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getParseName(): String /* None */ =
    fromCString(
      g_file_get_parse_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]]
      ).asInstanceOf
    )
  end getParseName

  /** Gets the local pathname for #GFile, if one exists. If non-%NULL, this is
    * guaranteed to be an absolute, canonical path. It might contain symlinks.
    *
    * This call does no blocking I/O.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPath(): String /* None */ =
    fromCString(
      g_file_get_path(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]]
      ).asInstanceOf
    )
  end getPath

  /** Gets the path for @descendant relative to @parent.
    *
    * This call does no blocking I/O.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRelativePath(
      descendant: File /* Some(Ptr[GFile]) */
  ): String /* None */ =
    fromCString(
      g_file_get_relative_path(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        descendant.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end getRelativePath

  /** Gets the URI for the @file.
    *
    * This call does no blocking I/O.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUri(): String /* None */ =
    fromCString(
      g_file_get_uri(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]]
      ).asInstanceOf
    )
  end getUri

  /**  Gets the URI scheme for a #GFile.
    *  RFC 3986 decodes the scheme as:
    *  |[
    *  URI = scheme ":" hier-part [ "?" query ] [ "#" fragment ]
    *  ]|
    *  Common schemes include "file", "http", "ftp", etc.
    *
    *  The scheme can be different from the one used to construct the #GFile,
    *  in that it might be replaced with one that is logically equivalent to the #GFile.
    *
    *  This call does no blocking I/O.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def getUriScheme(): String /* None */ =
    fromCString(
      g_file_get_uri_scheme(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]]
      ).asInstanceOf
    )
  end getUriScheme

  /** Checks if @file has a parent, and optionally, if it is @parent.
    *
    * If @parent is %NULL then this function returns %TRUE if @file has any
    * parent at all. If @parent is non-%NULL then %TRUE is only returned if @file
    * is an immediate child of @parent.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasParent(
      parent: Option[File /* Some(Ptr[GFile]) */ ]
  ): Boolean /* None */ =
    g_file_has_parent(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
      parent
        .map[Ptr[GFile]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GFile]])
    ).value.!=(0)
  end hasParent

  /** Checks whether @file has the prefix specified by @prefix.
    *
    * In other words, if the names of initial elements of @file's pathname match @prefix.
    * Only full pathname elements are matched, so a path like /foo is not
    * considered a prefix of /foobar, only of /foo/bar.
    *
    * A #GFile is not a prefix of itself. If you want to check for equality, use
    * g_file_equal().
    *
    * This call does no I/O, as it works purely on names. As such it can
    * sometimes return %FALSE even if @file is inside a @prefix (from a
    * filesystem point of view), because the prefix of @file is an alias of @prefix.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasPrefix(prefix: File /* Some(Ptr[GFile]) */ ): Boolean /* None */ =
    g_file_has_prefix(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
      prefix.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end hasPrefix

  /** Checks to see if a #GFile has a given URI scheme.
    *
    * This call does no blocking I/O.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasUriScheme(
      uri_scheme: String /* Some(CString) */
  )(using Runtime): Boolean /* None */ =
    g_file_has_uri_scheme(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
      summon[Runtime].inZone(toCString(uri_scheme))
    ).value.!=(0)
  end hasUriScheme

  /** Creates a hash value for a #GFile.
    *
    * This call does no blocking I/O.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hash(): UInt /* None */ =
    g_file_hash(
      this
        .getUnsafeRawPointer()
        .asInstanceOf[_root_.sn.gnome.glib.internal.gconstpointer]
    ).value
  end hash

  /** Checks to see if a file is native to the platform.
    *
    * A native file is one expressed in the platform-native filename format,
    * e.g. "C:\Windows" or "/usr/bin/". This does not mean the file is local, as
    * it might be on a locally mounted remote filesystem.
    *
    * On some systems non-native files may be available using the native
    * filesystem via a userspace filesystem (FUSE), in these cases this call
    * will return %FALSE, but g_file_get_path() will still return a native path.
    *
    * This call does no blocking I/O.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isNative(): Boolean /* None */ =
    g_file_is_native(this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]]).value
      .!=(0)
  end isNative

  /** Loads the contents of @file and returns it as #GBytes.
    *
    * If @file is a resource:// based URI, the resulting bytes will reference
    * the embedded resource instead of a copy. Otherwise, this is equivalent to
    * calling g_file_load_contents() and g_bytes_new_take().
    *
    * For resources, @etag_out will be set to %NULL.
    *
    * The data contained in the resulting #GBytes is always zero-terminated, but
    * this is not included in the #GBytes length. The resulting #GBytes should
    * be freed with g_bytes_unref() when no longer in use.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method load_bytes]: Method load_bytes contains an OUT parameter, which is not supported yet"
  )
  private def loadBytes__ = ???

  /** Asynchronously loads the contents of @file as #GBytes.
    *
    * If @file is a resource:// based URI, the resulting bytes will reference
    * the embedded resource instead of a copy. Otherwise, this is equivalent to
    * calling g_file_load_contents_async() and g_bytes_new_take().
    *
    * @callback
    *   should call g_file_load_bytes_finish() to get the result of this
    *   asynchronous operation.
    *
    * See g_file_load_bytes() for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method load_bytes_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def loadBytesAsync__ = ???

  /** Completes an asynchronous request to g_file_load_bytes_async().
    *
    * For resources, @etag_out will be set to %NULL.
    *
    * The data contained in the resulting #GBytes is always zero-terminated, but
    * this is not included in the #GBytes length. The resulting #GBytes should
    * be freed with g_bytes_unref() when no longer in use.
    *
    * See g_file_load_bytes() for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method load_bytes_finish]: Method load_bytes_finish contains an OUT parameter, which is not supported yet"
  )
  private def loadBytesFinish__ = ???

  /** Loads the content of the file into memory. The data is always
    * zero-terminated, but this is not included in the resultant @length. The
    * returned @contents should be freed with g_free() when no longer needed.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method load_contents]: Method load_contents contains an OUT parameter, which is not supported yet"
  )
  private def loadContents__ = ???

  /** Starts an asynchronous load of the @file's contents.
    *
    * For more details, see g_file_load_contents() which is the synchronous
    * version of this call.
    *
    * When the load operation has completed, @callback will be called with @user
    * data. To finish the operation, call g_file_load_contents_finish() with the
    * #GAsyncResult returned by the @callback.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method load_contents_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def loadContentsAsync__ = ???

  /** Finishes an asynchronous load of the @file's contents. The contents are
    * placed in @contents, and @length is set to the size of the @contents
    * string. The @contents should be freed with g_free() when no longer needed.
    * If @etag_out is present, it will be set to the new entity tag for the @file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method load_contents_finish]: Method load_contents_finish contains an OUT parameter, which is not supported yet"
  )
  private def loadContentsFinish__ = ???

  /** Reads the partial contents of a file. A #GFileReadMoreCallback should be
    * used to stop reading from the file when appropriate, else this function
    * will behave exactly as g_file_load_contents_async(). This operation can be
    * finished by g_file_load_partial_contents_finish().
    *
    * Users of this function should be aware that @user_data is passed to both
    * the @read_more_callback and the @callback.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method load_partial_contents_async/<method parameters>/read_more_callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FileReadMoreCallback), @type -> DataRecord(GFileReadMoreCallback)))"
  )
  private def loadPartialContentsAsync__ = ???

  /** Finishes an asynchronous partial load operation that was started with
    * g_file_load_partial_contents_async(). The data is always zero-terminated,
    * but this is not included in the resultant @length. The returned @contents
    * should be freed with g_free() when no longer needed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method load_partial_contents_finish]: Method load_partial_contents_finish contains an OUT parameter, which is not supported yet"
  )
  private def loadPartialContentsFinish__ = ???

  /** Creates a directory. Note that this will only create a child directory of
    * the immediate parent directory of the path or URI given by the #GFile. To
    * recursively create directories, see g_file_make_directory_with_parents().
    * This function will fail if the parent directory does not exist, setting
    * @error
    *   to %G_IO_ERROR_NOT_FOUND. If the file system doesn't support creating
    *   directories, this function will fail, setting @error to
    *   %G_IO_ERROR_NOT_SUPPORTED.
    *
    * For a local #GFile the newly created directory will have the default
    * (current) ownership and permissions of the current process.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def makeDirectory(
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_make_directory(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end makeDirectory

  /** Asynchronously creates a directory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method make_directory_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def makeDirectoryAsync__ = ???

  /** Finishes an asynchronous directory creation, started with
    * g_file_make_directory_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def makeDirectoryFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_make_directory_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end makeDirectoryFinish

  /** Creates a directory and any parent directories that may not exist similar
    * to 'mkdir -p'. If the file system does not support creating directories,
    * this function will fail, setting @error to %G_IO_ERROR_NOT_SUPPORTED. If
    * the directory itself already exists, this function will fail setting @error
    * to %G_IO_ERROR_EXISTS, unlike the similar g_mkdir_with_parents().
    *
    * For a local #GFile the newly created directories will have the default
    * (current) ownership and permissions of the current process.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def makeDirectoryWithParents(
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_make_directory_with_parents(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end makeDirectoryWithParents

  /** Creates a symbolic link named @file which contains the string
    * @symlink_value.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def makeSymbolicLink(
      symlink_value: String /* Some(CString) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_make_symbolic_link(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        summon[Runtime].inZone(toCString(symlink_value)),
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end makeSymbolicLink

  /** Asynchronously creates a symbolic link named @file which contains the
    * string @symlink_value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method make_symbolic_link_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def makeSymbolicLinkAsync__ = ???

  /** Finishes an asynchronous symbolic link creation, started with
    * g_file_make_symbolic_link_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def makeSymbolicLinkFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_make_symbolic_link_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end makeSymbolicLinkFinish

  /** Recursively measures the disk usage of @file.
    *
    * This is essentially an analog of the 'du' command, but it also reports the
    * number of directories and non-directory files encountered (including
    * things like symbolic links).
    *
    * By default, errors are only reported against the toplevel file itself.
    * Errors found while recursing are silently ignored, unless
    * %G_FILE_MEASURE_REPORT_ANY_ERROR is given in @flags.
    *
    * The returned size, @disk_usage, is in bytes and should be formatted with
    * g_format_size() in order to get something reasonable for showing in a user
    * interface.
    *
    * @progress_callback
    *   and @progress_data can be given to request periodic progress updates
    *   while scanning. See the documentation for #GFileMeasureProgressCallback
    *   for information about when and how the callback will be invoked.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method measure_disk_usage]: Method measure_disk_usage contains an OUT parameter, which is not supported yet"
  )
  private def measureDiskUsage__ = ???

  /** Recursively measures the disk usage of @file.
    *
    * This is the asynchronous version of g_file_measure_disk_usage(). See there
    * for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method measure_disk_usage_async/<method parameters>/progress_callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FileMeasureProgressCallback), @type -> DataRecord(GFileMeasureProgressCallback)))"
  )
  private def measureDiskUsageAsync__ = ???

  /** Collects the results from an earlier call to
    * g_file_measure_disk_usage_async(). See g_file_measure_disk_usage() for
    * more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method measure_disk_usage_finish]: Method measure_disk_usage_finish contains an OUT parameter, which is not supported yet"
  )
  private def measureDiskUsageFinish__ = ???

  /** Obtains a file or directory monitor for the given file, depending on the
    * type of the file.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def monitor(
      flags: FileMonitorFlags /* Some(GFileMonitorFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[sn.gnome.gio.FileMonitor /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileMonitor.applyUnsafe(
        g_file_monitor(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          flags.raw,
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end monitor

  /** Obtains a directory monitor for the given file. This may fail if directory
    * monitoring is not supported.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * It does not make sense for @flags to contain
    * %G_FILE_MONITOR_WATCH_HARD_LINKS, since hard links can not be made to
    * directories. It is not possible to monitor all the files in a directory
    * for changes made via hard links; if you want to do this then you must
    * register individual watches with g_file_monitor().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def monitorDirectory(
      flags: FileMonitorFlags /* Some(GFileMonitorFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[sn.gnome.gio.FileMonitor /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileMonitor.applyUnsafe(
        g_file_monitor_directory(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          flags.raw,
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end monitorDirectory

  /** Obtains a file monitor for the given file. If no file notification
    * mechanism exists, then regular polling of the file is used.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * If @flags contains %G_FILE_MONITOR_WATCH_HARD_LINKS then the monitor will
    * also attempt to report changes made to the file via another filename (ie,
    * a hard link). Without this flag, you can only rely on changes made through
    * the filename contained in @file to be reported. Using this flag may result
    * in an increase in resource usage, and may not have any effect depending on
    * the #GFileMonitor backend and/or filesystem type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def monitorFile(
      flags: FileMonitorFlags /* Some(GFileMonitorFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[sn.gnome.gio.FileMonitor /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileMonitor.applyUnsafe(
        g_file_monitor_file(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          flags.raw,
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end monitorFile

  /** Starts a @mount_operation, mounting the volume that contains the file @location.
    *
    * When this operation has completed, @callback will be called with
    * @user_user
    *   data, and the operation can be finalized with
    *   g_file_mount_enclosing_volume_finish().
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method mount_enclosing_volume/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def mountEnclosingVolume__ = ???

  /** Finishes a mount operation started by g_file_mount_enclosing_volume().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def mountEnclosingVolumeFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_mount_enclosing_volume_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end mountEnclosingVolumeFinish

  /** Mounts a file of type G_FILE_TYPE_MOUNTABLE. Using @mount_operation, you
    * can request callbacks when, for instance, passwords are needed during
    * authentication.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_file_mount_mountable_finish() to get the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method mount_mountable/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def mountMountable__ = ???

  /** Finishes a mount operation. See g_file_mount_mountable() for details.
    *
    * Finish an asynchronous mount operation that was started with
    * g_file_mount_mountable().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def mountMountableFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[File /* None */ ] =
    GResult.wrap(__errorPtr =>
      new File.Abstract(
        g_file_mount_mountable_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end mountMountableFinish

  /** Tries to move the file or directory @source to the location specified by @destination.
    * If native move operations are supported then this is used, otherwise a
    * copy + delete fallback is used. The native implementation may support
    * moving directories (for instance on moves inside the same filesystem), but
    * the fallback code does not.
    *
    * If the flag %G_FILE_COPY_OVERWRITE is specified an already existing @destination
    * file is overwritten.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * If @progress_callback is not %NULL, then the operation can be monitored by
    * setting this to a #GFileProgressCallback function.
    * @progress_callback_data
    *   will be passed to this function. It is guaranteed that this callback
    *   will be called after all data has been transferred with the total number
    *   of bytes copied during the operation.
    *
    * If the @source file does not exist, then the %G_IO_ERROR_NOT_FOUND error
    * is returned, independent on the status of the @destination.
    *
    * If %G_FILE_COPY_OVERWRITE is not specified and the target exists, then the
    * error %G_IO_ERROR_EXISTS is returned.
    *
    * If trying to overwrite a file over a directory, the
    * %G_IO_ERROR_IS_DIRECTORY error is returned. If trying to overwrite a
    * directory with a directory the %G_IO_ERROR_WOULD_MERGE error is returned.
    *
    * If the source is a directory and the target does not exist, or
    * %G_FILE_COPY_OVERWRITE is specified and the target is a file, then the
    * %G_IO_ERROR_WOULD_RECURSE error may be returned (if the native move
    * operation isn't available).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method move/<method parameters>/progress_callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FileProgressCallback), @type -> DataRecord(GFileProgressCallback)))"
  )
  private def move__ = ???

  /** Asynchronously moves a file @source to the location of @destination. For
    * details of the behaviour, see g_file_move().
    *
    * If @progress_callback is not %NULL, then that function that will be called
    * just like in g_file_move(). The callback will run in the default main
    * context of the thread calling g_file_move_async() — the same context as @callback
    * is run in.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_file_move_finish() to get the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method move_async/<method parameters>/progress_callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FileProgressCallback), @type -> DataRecord(GFileProgressCallback)))"
  )
  private def moveAsync__ = ???

  /** Finishes an asynchronous file movement, started with g_file_move_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def moveFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_move_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end moveFinish

  /** Opens an existing file for reading and writing. The result is a
    * #GFileIOStream that can be used to read and write the contents of the
    * file.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * If the file does not exist, the %G_IO_ERROR_NOT_FOUND error will be
    * returned. If the file is a directory, the %G_IO_ERROR_IS_DIRECTORY error
    * will be returned. Other errors are possible too, and depend on what kind
    * of filesystem the file is on. Note that in many non-local file cases read
    * and write streams are not supported, so make sure you really need to do
    * read and write streaming, rather than just opening for reading or writing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def openReadwrite(
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[sn.gnome.gio.FileIOStream /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileIOStream.applyUnsafe(
        g_file_open_readwrite(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end openReadwrite

  /** Asynchronously opens @file for reading and writing.
    *
    * For more details, see g_file_open_readwrite() which is the synchronous
    * version of this call.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_file_open_readwrite_finish() to get the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method open_readwrite_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def openReadwriteAsync__ = ???

  /** Finishes an asynchronous file read operation started with
    * g_file_open_readwrite_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def openReadwriteFinish(
      res: AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.gio.FileIOStream /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileIOStream.applyUnsafe(
        g_file_open_readwrite_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          res.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end openReadwriteFinish

  /** Exactly like g_file_get_path(), but caches the result via
    * g_object_set_qdata_full(). This is useful for example in C applications
    * which mix `g_file_*` APIs with native ones. It also avoids an extra
    * duplicated string when possible, so will be generally more efficient.
    *
    * This call does no blocking I/O.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def peekPath(): String /* None */ =
    fromCString(
      g_file_peek_path(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]]
      ).asInstanceOf
    )
  end peekPath

  /** Polls a file of type %G_FILE_TYPE_MOUNTABLE.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_file_mount_mountable_finish() to get the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method poll_mountable/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def pollMountable__ = ???

  /** Finishes a poll operation. See g_file_poll_mountable() for details.
    *
    * Finish an asynchronous poll operation that was polled with
    * g_file_poll_mountable().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pollMountableFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_poll_mountable_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end pollMountableFinish

  /** Returns the #GAppInfo that is registered as the default application to
    * handle the file specified by @file.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def queryDefaultHandler(
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[AppInfo /* None */ ] =
    GResult.wrap(__errorPtr =>
      new AppInfo.Abstract(
        g_file_query_default_handler(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end queryDefaultHandler

  /** Async version of g_file_query_default_handler().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method query_default_handler_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def queryDefaultHandlerAsync__ = ???

  /** Finishes a g_file_query_default_handler_async() operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def queryDefaultHandlerFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[AppInfo /* None */ ] =
    GResult.wrap(__errorPtr =>
      new AppInfo.Abstract(
        g_file_query_default_handler_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end queryDefaultHandlerFinish

  /** Utility function to check if a particular file exists. This is implemented
    * using g_file_query_info() and as such does blocking I/O.
    *
    * Note that in many cases it is [racy to first check for file
    * existence](https://en.wikipedia.org/wiki/Time_of_check_to_time_of_use) and
    * then execute something based on the outcome of that, because the file
    * might have been created or removed in between the operations. The general
    * approach to handling that is to not check, but just do the operation and
    * handle the errors as they come.
    *
    * As an example of race-free checking, take the case of reading a file, and
    * if it doesn't exist, creating it. There are two racy versions: read it,
    * and on error create it; and: check if it exists, if not create it. These
    * can both result in two processes creating the file (with perhaps a
    * partially written file as the result). The correct approach is to always
    * try to create the file with g_file_create() which will either atomically
    * create the file or fail with a %G_IO_ERROR_EXISTS error.
    *
    * However, in many cases an existence check is useful in a user interface,
    * for instance to make a menu item sensitive/insensitive, so that you don't
    * have to fool users that something is possible and then just show an error
    * dialog. If you do this, you should make sure to also handle the errors
    * that can happen due to races when you execute the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def queryExists(
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): Boolean /* None */ =
    g_file_query_exists(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]])
    ).value.!=(0)
  end queryExists

  /** Utility function to inspect the #GFileType of a file. This is implemented
    * using g_file_query_info() and as such does blocking I/O.
    *
    * The primary use case of this method is to check if a file is a regular
    * file, directory, or symlink.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def queryFileType(
      flags: FileQueryInfoFlags /* Some(GFileQueryInfoFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): FileType /* None */ =
    FileType.fromRaw(
      g_file_query_file_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        flags.raw,
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]])
      )
    )
  end queryFileType

  /** Similar to g_file_query_info(), but obtains information about the
    * filesystem the @file is on, rather than the file itself. For instance the
    * amount of space available and the type of the filesystem.
    *
    * The @attributes value is a string that specifies the attributes that
    * should be gathered. It is not an error if it's not possible to read a
    * particular requested attribute from a file - it just won't be set. @attributes
    * should be a comma-separated list of attributes or attribute wildcards. The
    * wildcard "*" means all attributes, and a wildcard like "filesystem::*"
    * means all attributes in the filesystem namespace. The standard namespace
    * for filesystem attributes is "filesystem". Common attributes of interest
    * are %G_FILE_ATTRIBUTE_FILESYSTEM_SIZE (the total size of the filesystem in
    * bytes), %G_FILE_ATTRIBUTE_FILESYSTEM_FREE (number of bytes available), and
    * %G_FILE_ATTRIBUTE_FILESYSTEM_TYPE (type of the filesystem).
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * If the file does not exist, the %G_IO_ERROR_NOT_FOUND error will be
    * returned. Other errors are possible too, and depend on what kind of
    * filesystem the file is on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def queryFilesystemInfo(
      attributes: String /* Some(CString) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[sn.gnome.gio.FileInfo /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileInfo.applyUnsafe(
        g_file_query_filesystem_info(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          summon[Runtime].inZone(toCString(attributes)),
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end queryFilesystemInfo

  /** Asynchronously gets the requested information about the filesystem that
    * the specified @file is on. The result is a #GFileInfo object that contains
    * key-value attributes (such as type or size for the file).
    *
    * For more details, see g_file_query_filesystem_info() which is the
    * synchronous version of this call.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_file_query_info_finish() to get the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method query_filesystem_info_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def queryFilesystemInfoAsync__ = ???

  /** Finishes an asynchronous filesystem info query. See
    * g_file_query_filesystem_info_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def queryFilesystemInfoFinish(
      res: AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.gio.FileInfo /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileInfo.applyUnsafe(
        g_file_query_filesystem_info_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          res.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end queryFilesystemInfoFinish

  /** Gets the requested information about specified @file. The result is a
    * #GFileInfo object that contains key-value attributes (such as the type or
    * size of the file).
    *
    * The @attributes value is a string that specifies the file attributes that
    * should be gathered. It is not an error if it's not possible to read a
    * particular requested attribute from a file - it just won't be set. @attributes
    * should be a comma-separated list of attributes or attribute wildcards. The
    * wildcard "*" means all attributes, and a wildcard like "standard::*" means
    * all attributes in the standard namespace. An example attribute query be
    * "standard::*,owner::user". The standard attributes are available as
    * defines, like %G_FILE_ATTRIBUTE_STANDARD_NAME.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * For symlinks, normally the information about the target of the symlink is
    * returned, rather than information about the symlink itself. However if you
    * pass %G_FILE_QUERY_INFO_NOFOLLOW_SYMLINKS in @flags the information about
    * the symlink itself will be returned. Also, for symlinks that point to
    * non-existing files the information about the symlink itself will be
    * returned.
    *
    * If the file does not exist, the %G_IO_ERROR_NOT_FOUND error will be
    * returned. Other errors are possible too, and depend on what kind of
    * filesystem the file is on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def queryInfo(
      attributes: String /* Some(CString) */,
      flags: FileQueryInfoFlags /* Some(GFileQueryInfoFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[sn.gnome.gio.FileInfo /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileInfo.applyUnsafe(
        g_file_query_info(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          summon[Runtime].inZone(toCString(attributes)),
          flags.raw,
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end queryInfo

  /** Asynchronously gets the requested information about specified @file. The
    * result is a #GFileInfo object that contains key-value attributes (such as
    * type or size for the file).
    *
    * For more details, see g_file_query_info() which is the synchronous version
    * of this call.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_file_query_info_finish() to get the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method query_info_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def queryInfoAsync__ = ???

  /** Finishes an asynchronous file info query. See g_file_query_info_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def queryInfoFinish(
      res: AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.gio.FileInfo /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileInfo.applyUnsafe(
        g_file_query_info_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          res.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end queryInfoFinish

  /** Obtain the list of settable attributes for the file.
    *
    * Returns the type and full attribute name of all the attributes that can be
    * set on this file. This doesn't mean setting it will always succeed though,
    * you might get an access failure, or some specific file may not support a
    * specific attribute.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method query_settable_attributes/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(FileAttributeInfoList), @type -> DataRecord(GFileAttributeInfoList*)))"
  )
  private def querySettableAttributes__ = ???

  /** Obtain the list of attribute namespaces where new attributes can be
    * created by a user. An example of this is extended attributes (in the
    * "xattr" namespace).
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method query_writable_namespaces/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(FileAttributeInfoList), @type -> DataRecord(GFileAttributeInfoList*)))"
  )
  private def queryWritableNamespaces__ = ???

  /** Opens a file for reading. The result is a #GFileInputStream that can be
    * used to read the contents of the file.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * If the file does not exist, the %G_IO_ERROR_NOT_FOUND error will be
    * returned. If the file is a directory, the %G_IO_ERROR_IS_DIRECTORY error
    * will be returned. Other errors are possible too, and depend on what kind
    * of filesystem the file is on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def read(
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[sn.gnome.gio.FileInputStream /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileInputStream.applyUnsafe(
        g_file_read(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end read

  /** Asynchronously opens @file for reading.
    *
    * For more details, see g_file_read() which is the synchronous version of
    * this call.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_file_read_finish() to get the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def readAsync__ = ???

  /** Finishes an asynchronous file read operation started with
    * g_file_read_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def readFinish(
      res: AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.gio.FileInputStream /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileInputStream.applyUnsafe(
        g_file_read_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          res.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end readFinish

  /** Returns an output stream for overwriting the file, possibly creating a
    * backup copy of the file first. If the file doesn't exist, it will be
    * created.
    *
    * This will try to replace the file in the safest way possible so that any
    * errors during the writing will not affect an already existing copy of the
    * file. For instance, for local files it may write to a temporary file and
    * then atomically rename over the destination when the stream is closed.
    *
    * By default files created are generally readable by everyone, but if you
    * pass %G_FILE_CREATE_PRIVATE in @flags the file will be made readable only
    * to the current user, to the level that is supported on the target
    * filesystem.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * If you pass in a non-%NULL @etag value and @file already exists, then this
    * value is compared to the current entity tag of the file, and if they
    * differ an %G_IO_ERROR_WRONG_ETAG error is returned. This generally means
    * that the file has been changed since you last read it. You can get the new
    * etag from g_file_output_stream_get_etag() after you've finished writing
    * and closed the #GFileOutputStream. When you load a new file you can use
    * g_file_input_stream_query_info() to get the etag of the file.
    *
    * If @make_backup is %TRUE, this function will attempt to make a backup of
    * the current file before overwriting it. If this fails a
    * %G_IO_ERROR_CANT_CREATE_BACKUP error will be returned. If you want to
    * replace anyway, try again with @make_backup set to %FALSE.
    *
    * If the file is a directory the %G_IO_ERROR_IS_DIRECTORY error will be
    * returned, and if the file is some other form of non-regular file then a
    * %G_IO_ERROR_NOT_REGULAR_FILE error will be returned. Some file systems
    * don't allow all file names, and may return an %G_IO_ERROR_INVALID_FILENAME
    * error, and if the name is to long %G_IO_ERROR_FILENAME_TOO_LONG will be
    * returned. Other errors are possible too, and depend on what kind of
    * filesystem the file is on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def replace(
      etag: Option[String /* Some(CString) */ ],
      make_backup: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      flags: FileCreateFlags /* Some(GFileCreateFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[sn.gnome.gio.FileOutputStream /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileOutputStream.applyUnsafe(
        g_file_replace(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          etag
            .map[CString](o => summon[Runtime].inZone(toCString(o)))
            .getOrElse(null.asInstanceOf[CString]),
          gboolean(gint((if make_backup == true then 1 else 0))),
          flags.raw,
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end replace

  /** Asynchronously overwrites the file, replacing the contents, possibly
    * creating a backup copy of the file first.
    *
    * For more details, see g_file_replace() which is the synchronous version of
    * this call.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_file_replace_finish() to get the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method replace_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def replaceAsync__ = ???

  /** Replaces the contents of @file with @contents of @length bytes.
    *
    * If @etag is specified (not %NULL), any existing file must have that etag,
    * or the error %G_IO_ERROR_WRONG_ETAG will be returned.
    *
    * If @make_backup is %TRUE, this function will attempt to make a backup of @file.
    * Internally, it uses g_file_replace(), so will try to replace the file
    * contents in the safest way possible. For example, atomic renames are used
    * when replacing local files’ contents.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * The returned @new_etag can be used to verify that the file hasn't changed
    * the next time it is saved over.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method replace_contents]: Method replace_contents contains an OUT parameter, which is not supported yet"
  )
  private def replaceContents__ = ???

  /** Starts an asynchronous replacement of @file with the given
    * @contents
    *   of @length bytes. @etag will replace the document's current entity tag.
    *
    * When this operation has completed, @callback will be called with
    * @user_user
    *   data, and the operation can be finalized with
    *   g_file_replace_contents_finish().
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * If @make_backup is %TRUE, this function will attempt to make a backup of @file.
    *
    * Note that no copy of @contents will be made, so it must stay valid until @callback
    * is called. See g_file_replace_contents_bytes_async() for a #GBytes version
    * that will automatically hold a reference to the contents (without copying)
    * for the duration of the call.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method replace_contents_async/<method parameters>/contents]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const char*)))"
  )
  private def replaceContentsAsync__ = ???

  /** Same as g_file_replace_contents_async() but takes a #GBytes input instead.
    * This function will keep a ref on @contents until the operation is done.
    * Unlike g_file_replace_contents_async() this allows forgetting about the
    * content without waiting for the callback.
    *
    * When this operation has completed, @callback will be called with
    * @user_user
    *   data, and the operation can be finalized with
    *   g_file_replace_contents_finish().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method replace_contents_bytes_async/<method parameters>/contents]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def replaceContentsBytesAsync__ = ???

  /** Finishes an asynchronous replace of the given @file. See
    * g_file_replace_contents_async(). Sets @new_etag to the new entity tag for
    * the document, if present.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method replace_contents_finish]: Method replace_contents_finish contains an OUT parameter, which is not supported yet"
  )
  private def replaceContentsFinish__ = ???

  /** Finishes an asynchronous file replace operation started with
    * g_file_replace_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def replaceFinish(
      res: AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.gio.FileOutputStream /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileOutputStream.applyUnsafe(
        g_file_replace_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          res.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end replaceFinish

  /** Returns an output stream for overwriting the file in readwrite mode,
    * possibly creating a backup copy of the file first. If the file doesn't
    * exist, it will be created.
    *
    * For details about the behaviour, see g_file_replace() which does the same
    * thing but returns an output stream only.
    *
    * Note that in many non-local file cases read and write streams are not
    * supported, so make sure you really need to do read and write streaming,
    * rather than just opening for reading or writing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def replaceReadwrite(
      etag: Option[String /* Some(CString) */ ],
      make_backup: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      flags: FileCreateFlags /* Some(GFileCreateFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[sn.gnome.gio.FileIOStream /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileIOStream.applyUnsafe(
        g_file_replace_readwrite(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          etag
            .map[CString](o => summon[Runtime].inZone(toCString(o)))
            .getOrElse(null.asInstanceOf[CString]),
          gboolean(gint((if make_backup == true then 1 else 0))),
          flags.raw,
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end replaceReadwrite

  /** Asynchronously overwrites the file in read-write mode, replacing the
    * contents, possibly creating a backup copy of the file first.
    *
    * For more details, see g_file_replace_readwrite() which is the synchronous
    * version of this call.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_file_replace_readwrite_finish() to get the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method replace_readwrite_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def replaceReadwriteAsync__ = ???

  /** Finishes an asynchronous file replace operation started with
    * g_file_replace_readwrite_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def replaceReadwriteFinish(
      res: AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.gio.FileIOStream /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.FileIOStream.applyUnsafe(
        g_file_replace_readwrite_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          res.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end replaceReadwriteFinish

  /** Resolves a relative path for @file to an absolute path.
    *
    * This call does no blocking I/O.
    *
    * If the @relative_path is an absolute path name, the resolution is done
    * absolutely (without taking @file path as base).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def resolveRelativePath(
      relative_path: String /* Some(CString) */
  )(using Runtime): File /* None */ =
    new File.Abstract(
      g_file_resolve_relative_path(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        summon[Runtime].inZone(toCString(relative_path))
      ).asInstanceOf
    )
  end resolveRelativePath

  /** Sets an attribute in the file with attribute name @attribute to @value_p.
    *
    * Some attributes can be unset by setting @type to
    * %G_FILE_ATTRIBUTE_TYPE_INVALID and @value_p to %NULL.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttribute(
      attribute: String /* Some(CString) */,
      `type`: FileAttributeType /* Some(GFileAttributeType) */,
      value_p: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      flags: FileQueryInfoFlags /* Some(GFileQueryInfoFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_set_attribute(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        summon[Runtime].inZone(toCString(attribute)),
        `type`.raw,
        value_p
          .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
          .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
        flags.raw,
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end setAttribute

  /** Sets @attribute of type %G_FILE_ATTRIBUTE_TYPE_BYTE_STRING to @value. If @attribute
    * is of a different type, this operation will fail, returning %FALSE.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeByteString(
      attribute: String /* Some(CString) */,
      value: String /* Some(CString) */,
      flags: FileQueryInfoFlags /* Some(GFileQueryInfoFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_set_attribute_byte_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        summon[Runtime].inZone(toCString(attribute)),
        summon[Runtime].inZone(toCString(value)),
        flags.raw,
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end setAttributeByteString

  /** Sets @attribute of type %G_FILE_ATTRIBUTE_TYPE_INT32 to @value. If @attribute
    * is of a different type, this operation will fail.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeInt32(
      attribute: String /* Some(CString) */,
      value: CInt /* Some(_root_.sn.gnome.glib.internal.gint32) */,
      flags: FileQueryInfoFlags /* Some(GFileQueryInfoFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_set_attribute_int32(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        summon[Runtime].inZone(toCString(attribute)),
        gint32(value),
        flags.raw,
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end setAttributeInt32

  /** Sets @attribute of type %G_FILE_ATTRIBUTE_TYPE_INT64 to @value. If @attribute
    * is of a different type, this operation will fail.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeInt64(
      attribute: String /* Some(CString) */,
      value: CLongInt /* Some(_root_.sn.gnome.glib.internal.gint64) */,
      flags: FileQueryInfoFlags /* Some(GFileQueryInfoFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_set_attribute_int64(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        summon[Runtime].inZone(toCString(attribute)),
        gint64(value),
        flags.raw,
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end setAttributeInt64

  /** Sets @attribute of type %G_FILE_ATTRIBUTE_TYPE_STRING to @value. If @attribute
    * is of a different type, this operation will fail.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeString(
      attribute: String /* Some(CString) */,
      value: String /* Some(CString) */,
      flags: FileQueryInfoFlags /* Some(GFileQueryInfoFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_set_attribute_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        summon[Runtime].inZone(toCString(attribute)),
        summon[Runtime].inZone(toCString(value)),
        flags.raw,
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end setAttributeString

  /** Sets @attribute of type %G_FILE_ATTRIBUTE_TYPE_UINT32 to @value. If @attribute
    * is of a different type, this operation will fail.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeUint32(
      attribute: String /* Some(CString) */,
      value: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */,
      flags: FileQueryInfoFlags /* Some(GFileQueryInfoFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_set_attribute_uint32(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        summon[Runtime].inZone(toCString(attribute)),
        guint32(value),
        flags.raw,
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end setAttributeUint32

  /** Sets @attribute of type %G_FILE_ATTRIBUTE_TYPE_UINT64 to @value. If @attribute
    * is of a different type, this operation will fail.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeUint64(
      attribute: String /* Some(CString) */,
      value: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.guint64) */,
      flags: FileQueryInfoFlags /* Some(GFileQueryInfoFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_set_attribute_uint64(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        summon[Runtime].inZone(toCString(attribute)),
        guint64(value),
        flags.raw,
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end setAttributeUint64

  /** Asynchronously sets the attributes of @file with @info.
    *
    * For more details, see g_file_set_attributes_from_info(), which is the
    * synchronous version of this call.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_file_set_attributes_finish() to get the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_attributes_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def setAttributesAsync__ = ???

  /** Finishes setting an attribute started in g_file_set_attributes_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_attributes_finish]: Method set_attributes_finish contains an OUT parameter, which is not supported yet"
  )
  private def setAttributesFinish__ = ???

  /** Tries to set all attributes in the #GFileInfo on the target values, not
    * stopping on the first error.
    *
    * If there is any error during this operation then @error will be set to the
    * first error. Error on particular fields are flagged by setting the
    * "status" field in the attribute value to
    * %G_FILE_ATTRIBUTE_STATUS_ERROR_SETTING, which means you can also detect
    * further errors.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributesFromInfo(
      info: sn.gnome.gio.FileInfo /* Some(Ptr[GFileInfo]) */,
      flags: FileQueryInfoFlags /* Some(GFileQueryInfoFlags) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_set_attributes_from_info(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        info.getUnsafeRawPointer().asInstanceOf,
        flags.raw,
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end setAttributesFromInfo

  /** Renames @file to the specified display name.
    *
    * The display name is converted from UTF-8 to the correct encoding for the
    * target filesystem if possible and the @file is renamed to this.
    *
    * If you want to implement a rename operation in the user interface the edit
    * name (%G_FILE_ATTRIBUTE_STANDARD_EDIT_NAME) should be used as the initial
    * value in the rename widget, and then the result after editing should be
    * passed to g_file_set_display_name().
    *
    * On success the resulting converted filename is returned.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDisplayName(
      display_name: String /* Some(CString) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[File /* None */ ] =
    GResult.wrap(__errorPtr =>
      new File.Abstract(
        g_file_set_display_name(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          summon[Runtime].inZone(toCString(display_name)),
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end setDisplayName

  /** Asynchronously sets the display name for a given #GFile.
    *
    * For more details, see g_file_set_display_name() which is the synchronous
    * version of this call.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_file_set_display_name_finish() to get the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_display_name_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def setDisplayNameAsync__ = ???

  /** Finishes setting a display name started with
    * g_file_set_display_name_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDisplayNameFinish(
      res: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[File /* None */ ] =
    GResult.wrap(__errorPtr =>
      new File.Abstract(
        g_file_set_display_name_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
          res.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end setDisplayNameFinish

  /** Starts a file of type %G_FILE_TYPE_MOUNTABLE. Using @start_operation, you
    * can request callbacks when, for instance, passwords are needed during
    * authentication.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_file_mount_mountable_finish() to get the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method start_mountable/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def startMountable__ = ???

  /** Finishes a start operation. See g_file_start_mountable() for details.
    *
    * Finish an asynchronous start operation that was started with
    * g_file_start_mountable().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def startMountableFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_start_mountable_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end startMountableFinish

  /** Stops a file of type %G_FILE_TYPE_MOUNTABLE.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_file_stop_mountable_finish() to get the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method stop_mountable/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def stopMountable__ = ???

  /** Finishes a stop operation, see g_file_stop_mountable() for details.
    *
    * Finish an asynchronous stop operation that was started with
    * g_file_stop_mountable().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def stopMountableFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_stop_mountable_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end stopMountableFinish

  /** Checks if @file supports [thread-default
    * contexts][g-main-context-push-thread-default-context]. If this returns
    * %FALSE, you cannot perform asynchronous operations on
    * @file
    *   in a thread that has a thread-default context.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def supportsThreadContexts(): Boolean /* None */ =
    g_file_supports_thread_contexts(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]]
    ).value.!=(0)
  end supportsThreadContexts

  /** Sends @file to the "Trashcan", if possible. This is similar to deleting
    * it, but the user can recover it before emptying the trashcan. Not all file
    * systems support trashing, so this call can return the
    * %G_IO_ERROR_NOT_SUPPORTED error. Since GLib 2.66, the `x-gvfs-notrash`
    * unix mount option can be used to disable g_file_trash() support for
    * certain mounts, the %G_IO_ERROR_NOT_SUPPORTED error will be returned in
    * that case.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def trash(
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_trash(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end trash

  /** Asynchronously sends @file to the Trash location, if possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method trash_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def trashAsync__ = ???

  /** Finishes an asynchronous file trashing operation, started with
    * g_file_trash_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def trashFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_trash_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end trashFinish

  /** Unmounts a file of type G_FILE_TYPE_MOUNTABLE.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_file_unmount_mountable_finish() to get the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method unmount_mountable/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def unmountMountable__ = ???

  /** Finishes an unmount operation, see g_file_unmount_mountable() for details.
    *
    * Finish an asynchronous unmount operation that was started with
    * g_file_unmount_mountable().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unmountMountableFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_unmount_mountable_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end unmountMountableFinish

  /** Unmounts a file of type %G_FILE_TYPE_MOUNTABLE.
    *
    * If @cancellable is not %NULL, then the operation can be cancelled by
    * triggering the cancellable object from another thread. If the operation
    * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_file_unmount_mountable_finish() to get the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method unmount_mountable_with_operation/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def unmountMountableWithOperation__ = ???

  /** Finishes an unmount operation, see
    * g_file_unmount_mountable_with_operation() for details.
    *
    * Finish an asynchronous unmount operation that was started with
    * g_file_unmount_mountable_with_operation().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unmountMountableWithOperationFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_file_unmount_mountable_with_operation_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFile]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end unmountMountableWithOperationFinish

end File

object File:
  class Abstract(raw: Ptr[Byte]) extends File:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end File
