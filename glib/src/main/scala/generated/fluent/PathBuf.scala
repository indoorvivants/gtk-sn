package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.PathBuf
import sn.gnome.glib.internal.{GPathBuf, gboolean, gint}

/**  `GPathBuf` is a helper type that allows you to easily build paths from
  *  individual elements, using the platform specific conventions for path
  *  separators.
  *
  *  |[<!-- language="C" -->
  *  g_auto (GPathBuf) path;
  *
  *  g_path_buf_init (&path);
  *
  *  g_path_buf_push (&path, "usr");
  *  g_path_buf_push (&path, "bin");
  *  g_path_buf_push (&path, "echo");
  *
  *  g_autofree char *echo = g_path_buf_to_path (&path);
  *  g_assert_cmpstr (echo, ==, "/usr/bin/echo");
  *  ]|
  *
  *  You can also load a full path and then operate on its components:
  *
  *  |[<!-- language="C" -->
  *  g_auto (GPathBuf) path;
  *
  *  g_path_buf_init_from_path (&path, "/usr/bin/echo");
  *
  *  g_path_buf_pop (&path);
  *  g_path_buf_push (&path, "sh");
  *
  *  g_autofree char *sh = g_path_buf_to_path (&path);
  *  g_assert_cmpstr (sh, ==, "/usr/bin/sh");
  *  ]|
  *
  *  `GPathBuf` is available since GLib 2.76.
  *
  *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
  */
class PathBuf private[gnome] (raw: Ptr[GPathBuf]):

  def getUnsafeRawPointer(): Ptr[GPathBuf] = this.raw

  /** Clears the contents of the path buffer.
    *
    * This function should be use to free the resources in a stack-allocated
    * `GPathBuf` initialized using g_path_buf_init() or
    * g_path_buf_init_from_path().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clear(): Unit /* None */ =
    g_path_buf_clear(this.getUnsafeRawPointer().asInstanceOf[Ptr[GPathBuf]])
  end clear

  /** Clears the contents of the path buffer and returns the built path.
    *
    * This function returns `NULL` if the `GPathBuf` is empty.
    *
    * See also: g_path_buf_to_path()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clearToPath(): scala.Predef.String /* None */ =
    fromCString(
      g_path_buf_clear_to_path(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GPathBuf]]
      ).asInstanceOf
    )
  end clearToPath

  /** Copies the contents of a path buffer into a new `GPathBuf`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.glib.PathBuf /* None */ =
    sn.gnome.glib.PathBuf.fromRaw(
      g_path_buf_copy(this.getUnsafeRawPointer().asInstanceOf[Ptr[GPathBuf]])
    )
  end copy

  /** Frees a `GPathBuf` allocated by g_path_buf_new().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_path_buf_free(this.getUnsafeRawPointer().asInstanceOf[Ptr[GPathBuf]])
  end free

  /** Frees a `GPathBuf` allocated by g_path_buf_new(), and returns the path
    * inside the buffer.
    *
    * This function returns `NULL` if the `GPathBuf` is empty.
    *
    * See also: g_path_buf_to_path()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def freeToPath(): scala.Predef.String /* None */ =
    fromCString(
      g_path_buf_free_to_path(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GPathBuf]]
      ).asInstanceOf
    )
  end freeToPath

  /** Initializes a `GPathBuf` instance.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def init(): sn.gnome.glib.PathBuf /* None */ =
    sn.gnome.glib.PathBuf.fromRaw(
      g_path_buf_init(this.getUnsafeRawPointer().asInstanceOf[Ptr[GPathBuf]])
    )
  end init

  /** Initializes a `GPathBuf` instance with the given path.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def initFromPath(
      path: Option[scala.Predef.String /* Some(CString) */ ]
  )(using Zone): sn.gnome.glib.PathBuf /* None */ =
    sn.gnome.glib.PathBuf.fromRaw(
      g_path_buf_init_from_path(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GPathBuf]],
        path
          .map[CString](o => toCString(o))
          .getOrElse(null.asInstanceOf[CString])
      )
    )
  end initFromPath

  /**  Removes the last element of the path buffer.
    *
    *  If there is only one element in the path buffer (for example, `/` on
    *  Unix-like operating systems or the drive on Windows systems), it will
    *  not be removed and %FALSE will be returned instead.
    *
    *  |[<!-- language="C" -->
    *  GPathBuf buf, cmp;
    *
    *  g_path_buf_init_from_path (&buf, "/bin/sh");
    *
    *  g_path_buf_pop (&buf);
    *  g_path_buf_init_from_path (&cmp, "/bin");
    *  g_assert_true (g_path_buf_equal (&buf, &cmp));
    *  g_path_buf_clear (&cmp);
    *
    *  g_path_buf_pop (&buf);
    *  g_path_buf_init_from_path (&cmp, "/");
    *  g_assert_true (g_path_buf_equal (&buf, &cmp));
    *  g_path_buf_clear (&cmp);
    *
    *  g_path_buf_clear (&buf);
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def pop(): Boolean /* None */ =
    g_path_buf_pop(this.getUnsafeRawPointer().asInstanceOf[Ptr[GPathBuf]]).value
      .!=(0)
  end pop

  /**  Extends the given path buffer with @path.
    *
    *  If @path is absolute, it replaces the current path.
    *
    *  If @path contains a directory separator, the buffer is extended by
    *  as many elements the path provides.
    *
    *  On Windows, both forward slashes and backslashes are treated as
    *  directory separators. On other platforms, %G_DIR_SEPARATOR_S is the
    *  only directory separator.
    *
    *  |[<!-- language="C" -->
    *  GPathBuf buf, cmp;
    *
    *  g_path_buf_init_from_path (&buf, "/tmp");
    *  g_path_buf_push (&buf, ".X11-unix/X0");
    *  g_path_buf_init_from_path (&cmp, "/tmp/.X11-unix/X0");
    *  g_assert_true (g_path_buf_equal (&buf, &cmp));
    *  g_path_buf_clear (&cmp);
    *
    *  g_path_buf_push (&buf, "/etc/locale.conf");
    *  g_path_buf_init_from_path (&cmp, "/etc/locale.conf");
    *  g_assert_true (g_path_buf_equal (&buf, &cmp));
    *  g_path_buf_clear (&cmp);
    *
    *  g_path_buf_clear (&buf);
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def push(
      path: scala.Predef.String /* Some(CString) */
  )(using Zone): sn.gnome.glib.PathBuf /* None */ =
    sn.gnome.glib.PathBuf.fromRaw(
      g_path_buf_push(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GPathBuf]],
        toCString(path)
      )
    )
  end push

  /** Adds an extension to the file name in the path buffer.
    *
    * If @extension is `NULL`, the extension will be unset.
    *
    * If the path buffer does not have a file name set, this function returns
    * `FALSE` and leaves the path buffer unmodified.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setExtension(
      extension: Option[scala.Predef.String /* Some(CString) */ ]
  )(using Zone): Boolean /* None */ =
    g_path_buf_set_extension(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GPathBuf]],
      extension
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString])
    ).value.!=(0)
  end setExtension

  /**  Sets the file name of the path.
    *
    *  If the path buffer is empty, the filename is left unset and this
    *  function returns `FALSE`.
    *
    *  If the path buffer only contains the root element (on Unix-like operating
    *  systems) or the drive (on Windows), this is the equivalent of pushing
    *  the new @file_name.
    *
    *  If the path buffer contains a path, this is the equivalent of
    *  popping the path buffer and pushing @file_name, creating a
    *  sibling of the original path.
    *
    *  |[<!-- language="C" -->
    *  GPathBuf buf, cmp;
    *
    *  g_path_buf_init_from_path (&buf, "/");
    *
    *  g_path_buf_set_filename (&buf, "bar");
    *  g_path_buf_init_from_path (&cmp, "/bar");
    *  g_assert_true (g_path_buf_equal (&buf, &cmp));
    *  g_path_buf_clear (&cmp);
    *
    *  g_path_buf_set_filename (&buf, "baz.txt");
    *  g_path_buf_init_from_path (&cmp, "/baz.txt");
    *  g_assert_true (g_path_buf_equal (&buf, &cmp);
    *  g_path_buf_clear (&cmp);
    *
    *  g_path_buf_clear (&buf);
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def setFilename(
      file_name: scala.Predef.String /* Some(CString) */
  )(using Zone): Boolean /* None */ =
    g_path_buf_set_filename(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GPathBuf]],
      toCString(file_name)
    ).value.!=(0)
  end setFilename

  /** Retrieves the built path from the path buffer.
    *
    * On Windows, the result contains backslashes as directory separators, even
    * if forward slashes were used in input.
    *
    * If the path buffer is empty, this function returns `NULL`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toPath(): scala.Predef.String /* None */ =
    fromCString(
      g_path_buf_to_path(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GPathBuf]]
      ).asInstanceOf
    )
  end toPath

end PathBuf

object PathBuf:
  def fromRaw(ptr: Ptr[GPathBuf]): PathBuf = new PathBuf(ptr)
end PathBuf
