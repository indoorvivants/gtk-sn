package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.{
  GResult,
  IOChannel,
  IOCondition,
  IOError,
  IOFlags,
  IOStatus,
  SeekType
}
import sn.gnome.glib.internal.{
  GIOChannel,
  gboolean,
  gchar,
  gint,
  gint64,
  gsize,
  guint32,
  gunichar
}

/** A data structure representing an IO Channel. The fields should be considered
  * private and should only be accessed with the following functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class IOChannel private[gnome] (raw: Ptr[GIOChannel]):

  def getUnsafeRawPointer(): Ptr[GIOChannel] = this.raw

  /** Close an IO channel. Any pending data to be written will be flushed,
    * ignoring errors. The channel will not be freed until the last reference is
    * dropped using g_io_channel_unref().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def close(): Unit /* None */ =
    g_io_channel_close(this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOChannel]])
  end close

  /** Flushes the write buffer for the GIOChannel.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flush(): GResult[sn.gnome.glib.IOStatus /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.glib.IOStatus.fromRaw(
        g_io_channel_flush(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOChannel]],
          __errorPtr
        )
      )
    )
  end flush

  /** This function returns a #GIOCondition depending on whether there is data
    * to be read/space to write data in the internal buffers in the #GIOChannel.
    * Only the flags %G_IO_IN and %G_IO_OUT may be set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBufferCondition(): sn.gnome.glib.IOCondition /* None */ =
    sn.gnome.glib.IOCondition.fromRaw(
      g_io_channel_get_buffer_condition(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOChannel]]
      )
    )
  end getBufferCondition

  /** Gets the buffer size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBufferSize(): CUnsignedLongInt /* None */ =
    g_io_channel_get_buffer_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOChannel]]
    ).value
  end getBufferSize

  /** Returns whether @channel is buffered.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBuffered(): Boolean /* None */ =
    g_io_channel_get_buffered(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOChannel]]
    ).value.!=(0)
  end getBuffered

  /** Returns whether the file/socket/whatever associated with @channel will be
    * closed when @channel receives its final unref and is destroyed. The
    * default value of this is %TRUE for channels created by
    * g_io_channel_new_file (), and %FALSE for all other channels.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCloseOnUnref(): Boolean /* None */ =
    g_io_channel_get_close_on_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOChannel]]
    ).value.!=(0)
  end getCloseOnUnref

  /** Gets the encoding for the input/output of the channel. The internal
    * encoding is always UTF-8. The encoding %NULL makes the channel safe for
    * binary data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEncoding(): scala.Predef.String /* None */ =
    fromCString(
      g_io_channel_get_encoding(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOChannel]]
      ).asInstanceOf
    )
  end getEncoding

  /** Gets the current flags for a #GIOChannel, including read-only flags such
    * as %G_IO_FLAG_IS_READABLE.
    *
    * The values of the flags %G_IO_FLAG_IS_READABLE and %G_IO_FLAG_IS_WRITABLE
    * are cached for internal use by the channel when it is created. If they
    * should change at some later point (e.g. partial shutdown of a socket with
    * the UNIX shutdown() function), the user should immediately call
    * g_io_channel_get_flags() to update the internal values of these flags.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFlags(): sn.gnome.glib.IOFlags /* None */ =
    sn.gnome.glib.IOFlags.fromRaw(
      g_io_channel_get_flags(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOChannel]]
      )
    )
  end getFlags

  /** This returns the string that #GIOChannel uses to determine where in the
    * file a line break occurs. A value of %NULL indicates autodetection.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_line_term]: Method get_line_term contains an OUT parameter, which is not supported yet"
  )
  private def getLineTerm__ = ???

  /** Initializes a #GIOChannel struct.
    *
    * This is called by each of the above functions when creating a #GIOChannel,
    * and so is not often needed by the application programmer (unless you are
    * creating a new type of #GIOChannel).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def init(): Unit /* None */ =
    g_io_channel_init(this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOChannel]])
  end init

  /** Reads data from a #GIOChannel.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read/<method parameters>/bytes_read]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gsize), @type -> DataRecord(gsize*)))"
  )
  private def read__ = ???

  /** Replacement for g_io_channel_read() with the new API.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_chars]: Method read_chars contains an OUT parameter, which is not supported yet"
  )
  private def readChars__ = ???

  /** Reads a line, including the terminating character(s), from a #GIOChannel
    * into a newly-allocated string.
    * @str_return
    *   will contain allocated memory if the return is %G_IO_STATUS_NORMAL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_line]: Method read_line contains an OUT parameter, which is not supported yet"
  )
  private def readLine__ = ???

  /** Reads a line from a #GIOChannel, using a #GString as a buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_line_string/<method parameters>/terminator_pos]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gsize), @type -> DataRecord(gsize*)))"
  )
  private def readLineString__ = ???

  /** Reads all the remaining data from the file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_to_end]: Method read_to_end contains an OUT parameter, which is not supported yet"
  )
  private def readToEnd__ = ???

  /** Reads a Unicode character from @channel. This function cannot be called on
    * a channel with %NULL encoding.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_unichar]: Method read_unichar contains an OUT parameter, which is not supported yet"
  )
  private def readUnichar__ = ???

  /** Increments the reference count of a #GIOChannel.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.glib.IOChannel /* None */ =
    sn.gnome.glib.IOChannel.fromRaw(
      g_io_channel_ref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOChannel]])
    )
  end ref

  /** Sets the current position in the #GIOChannel, similar to the standard
    * library function fseek().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def seek(
      offset: CLongInt /* Some(gint64) */,
      `type`: sn.gnome.glib.SeekType /* Some(GSeekType) */
  ): sn.gnome.glib.IOError /* None */ =
    sn.gnome.glib.IOError.fromRaw(
      g_io_channel_seek(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOChannel]],
        gint64(offset),
        `type`.raw
      )
    )
  end seek

  /** Replacement for g_io_channel_seek() with the new API.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def seekPosition(
      offset: CLongInt /* Some(gint64) */,
      `type`: sn.gnome.glib.SeekType /* Some(GSeekType) */
  ): GResult[sn.gnome.glib.IOStatus /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.glib.IOStatus.fromRaw(
        g_io_channel_seek_position(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOChannel]],
          gint64(offset),
          `type`.raw,
          __errorPtr
        )
      )
    )
  end seekPosition

  /** Sets the buffer size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBufferSize(
      size: CUnsignedLongInt /* Some(gsize) */
  ): Unit /* None */ =
    g_io_channel_set_buffer_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOChannel]],
      gsize(size)
    )
  end setBufferSize

  /** The buffering state can only be set if the channel's encoding is %NULL.
    * For any other encoding, the channel must be buffered.
    *
    * A buffered channel can only be set unbuffered if the channel's internal
    * buffers have been flushed. Newly created channels or channels which have
    * returned %G_IO_STATUS_EOF not require such a flush. For write-only
    * channels, a call to g_io_channel_flush () is sufficient. For all other
    * channels, the buffers may be flushed by a call to
    * g_io_channel_seek_position (). This includes the possibility of seeking
    * with seek type %G_SEEK_CUR and an offset of zero. Note that this means
    * that socket-based channels cannot be set unbuffered once they have had
    * data read from them.
    *
    * On unbuffered channels, it is safe to mix read and write calls from the
    * new and old APIs, if this is necessary for maintaining old code.
    *
    * The default state of the channel is buffered.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBuffered(buffered: Boolean /* Some(gboolean) */ ): Unit /* None */ =
    g_io_channel_set_buffered(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOChannel]],
      gboolean(gint((if buffered == true then 1 else 0)))
    )
  end setBuffered

  /** Whether to close the channel on the final unref of the #GIOChannel data
    * structure. The default value of this is %TRUE for channels created by
    * g_io_channel_new_file (), and %FALSE for all other channels.
    *
    * Setting this flag to %TRUE for a channel you have already closed can cause
    * problems when the final reference to the #GIOChannel is dropped.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCloseOnUnref(
      do_close: Boolean /* Some(gboolean) */
  ): Unit /* None */ =
    g_io_channel_set_close_on_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOChannel]],
      gboolean(gint((if do_close == true then 1 else 0)))
    )
  end setCloseOnUnref

  /** Sets the encoding for the input/output of the channel. The internal
    * encoding is always UTF-8. The default encoding for the external file is
    * UTF-8.
    *
    * The encoding %NULL is safe to use with binary data.
    *
    * The encoding can only be set if one of the following conditions is true:
    *
    *   - The channel was just created, and has not been written to or read from
    *     yet.
    *   - The channel is write-only.
    *   - The channel is a file, and the file pointer was just repositioned by a
    *     call to g_io_channel_seek_position(). (This flushes all the internal
    *     buffers.)
    *   - The current encoding is %NULL or UTF-8.
    *   - One of the (new API) read functions has just returned %G_IO_STATUS_EOF
    *     (or, in the case of g_io_channel_read_to_end(), %G_IO_STATUS_NORMAL).
    *   - One of the functions g_io_channel_read_chars() or
    *     g_io_channel_read_unichar() has returned %G_IO_STATUS_AGAIN or
    *     %G_IO_STATUS_ERROR. This may be useful in the case of
    *     %G_CONVERT_ERROR_ILLEGAL_SEQUENCE. Returning one of these statuses
    *     from g_io_channel_read_line(), g_io_channel_read_line_string(), or
    *     g_io_channel_read_to_end() does not guarantee that the encoding can be
    *     changed.
    *
    * Channels which do not meet one of the above conditions cannot call
    * g_io_channel_seek_position() with an offset of %G_SEEK_CUR, and, if they
    * are "seekable", cannot call g_io_channel_write_chars() after calling one
    * of the API "read" functions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEncoding(
      encoding: Option[scala.Predef.String /* Some(Ptr[gchar]) */ ]
  )(using Zone): GResult[sn.gnome.glib.IOStatus /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.glib.IOStatus.fromRaw(
        g_io_channel_set_encoding(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOChannel]],
          encoding
            .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
            .getOrElse(null.asInstanceOf[Ptr[gchar]]),
          __errorPtr
        )
      )
    )
  end setEncoding

  /** Sets the (writeable) flags in @channel to (@flags & %G_IO_FLAG_SET_MASK).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFlags(
      flags: sn.gnome.glib.IOFlags /* Some(GIOFlags) */
  ): GResult[sn.gnome.glib.IOStatus /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.glib.IOStatus.fromRaw(
        g_io_channel_set_flags(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOChannel]],
          flags.raw,
          __errorPtr
        )
      )
    )
  end setFlags

  /** This sets the string that #GIOChannel uses to determine where in the file
    * a line break occurs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLineTerm(
      line_term: Option[scala.Predef.String /* Some(Ptr[gchar]) */ ],
      length: Int /* Some(gint) */
  )(using Zone): Unit /* None */ =
    g_io_channel_set_line_term(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOChannel]],
      line_term
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]]),
      gint(length)
    )
  end setLineTerm

  /** Close an IO channel. Any pending data to be written will be flushed if @flush
    * is %TRUE. The channel will not be freed until the last reference is
    * dropped using g_io_channel_unref().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def shutdown(
      flush: Boolean /* Some(gboolean) */
  ): GResult[sn.gnome.glib.IOStatus /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.glib.IOStatus.fromRaw(
        g_io_channel_shutdown(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOChannel]],
          gboolean(gint((if flush == true then 1 else 0))),
          __errorPtr
        )
      )
    )
  end shutdown

  /** Returns the file descriptor of the #GIOChannel.
    *
    * On Windows this function returns the file descriptor or socket of the
    * #GIOChannel.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unixGetFd(): Int /* None */ =
    g_io_channel_unix_get_fd(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOChannel]]
    ).value
  end unixGetFd

  /** Decrements the reference count of a #GIOChannel.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_io_channel_unref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOChannel]])
  end unref

  /** Writes data to a #GIOChannel.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method write/<method parameters>/bytes_written]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gsize), @type -> DataRecord(gsize*)))"
  )
  private def write__ = ???

  /** Replacement for g_io_channel_write() with the new API.
    *
    * On seekable channels with encodings other than %NULL or UTF-8, generic
    * mixing of reading and writing is not allowed. A call to
    * g_io_channel_write_chars () may only be made on a channel from which data
    * has been read in the cases described in the documentation for
    * g_io_channel_set_encoding ().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method write_chars]: Method write_chars contains an OUT parameter, which is not supported yet"
  )
  private def writeChars__ = ???

  /** Writes a Unicode character to @channel. This function cannot be called on
    * a channel with %NULL encoding.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def writeUnichar(
      thechar: CUnsignedInt /* Some(gunichar) */
  ): GResult[sn.gnome.glib.IOStatus /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.glib.IOStatus.fromRaw(
        g_io_channel_write_unichar(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOChannel]],
          gunichar(guint32(thechar)),
          __errorPtr
        )
      )
    )
  end writeUnichar

end IOChannel

object IOChannel:
  def fromRaw(ptr: Ptr[GIOChannel]): IOChannel = new IOChannel(ptr)
end IOChannel
