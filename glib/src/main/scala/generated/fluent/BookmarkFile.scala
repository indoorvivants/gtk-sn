package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.{BookmarkFile, DateTime, GResult}
import sn.gnome.glib.internal.{GBookmarkFile, gboolean, gchar, gint}

/** GBookmarkFile lets you parse, edit or create files containing bookmarks to
  * URI, along with some meta-data about the resource pointed by the URI like
  * its MIME type, the application that is registering the bookmark and the icon
  * that should be used to represent the bookmark. The data is stored using the
  * [Desktop Bookmark
  * Specification](http://www.gnome.org/~ebassi/bookmark-spec).
  *
  * The syntax of the bookmark files is described in detail inside the Desktop
  * Bookmark Specification, here is a quick summary: bookmark files use a
  * sub-class of the XML Bookmark Exchange Language specification, consisting of
  * valid UTF-8 encoded XML, under the <xbel> root element; each bookmark is
  * stored inside a <bookmark> element, using its URI: no relative paths can be
  * used inside a bookmark file. The bookmark may have a user defined title and
  * description, to be used instead of the URI. Under the <metadata> element,
  * with its owner attribute set to `http://freedesktop.org`, is stored the
  * meta-data about a resource pointed by its URI. The meta-data consists of the
  * resource's MIME type; the applications that have registered a bookmark; the
  * groups to which a bookmark belongs to; a visibility flag, used to set the
  * bookmark as "private" to the applications and groups that has it registered;
  * the URI and MIME type of an icon, to be used when displaying the bookmark
  * inside a GUI.
  *
  * Here is an example of a bookmark file:
  * [bookmarks.xbel](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/glib/tests/bookmarks.xbel)
  *
  * A bookmark file might contain more than one bookmark; each bookmark is
  * accessed through its URI.
  *
  * The important caveat of bookmark files is that when you add a new bookmark
  * you must also add the application that is registering it, using
  * g_bookmark_file_add_application() or g_bookmark_file_set_application_info().
  * If a bookmark has no applications then it won't be dumped when creating the
  * on disk representation, using g_bookmark_file_to_data() or
  * g_bookmark_file_to_file().
  *
  * The #GBookmarkFile parser was added in GLib 2.12.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class BookmarkFile private[gnome] (raw: Ptr[GBookmarkFile]):

  def getUnsafeRawPointer(): Ptr[GBookmarkFile] = this.raw

  /** Adds the application with @name and @exec to the list of applications that
    * have registered a bookmark for @uri into
    * @bookmark.
    *
    * Every bookmark inside a #GBookmarkFile must have at least an application
    * registered. Each application must provide a name, a command line useful
    * for launching the bookmark, the number of times the bookmark has been
    * registered by the application and the last time the application registered
    * this bookmark.
    *
    * If @name is %NULL, the name of the application will be the same returned
    * by g_get_application_name(); if @exec is %NULL, the command line will be a
    * composition of the program name as returned by g_get_prgname() and the
    * "\%u" modifier, which will be expanded to the bookmark's URI.
    *
    * This function will automatically take care of updating the registrations
    * count and timestamping in case an application with the same @name had
    * already registered a bookmark for
    * @uri
    *   inside @bookmark.
    *
    * If no bookmark for @uri is found, one is created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addApplication(
      uri: scala.Predef.String /* Some(Ptr[gchar]) */,
      name: Option[scala.Predef.String /* Some(Ptr[gchar]) */ ],
      exec: Option[scala.Predef.String /* Some(Ptr[gchar]) */ ]
  )(using Zone): Unit /* None */ =
    g_bookmark_file_add_application(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
      toCString(uri).asInstanceOf[Ptr[gchar]],
      name
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]]),
      exec
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]])
    )
  end addApplication

  /** Adds @group to the list of groups to which the bookmark for @uri belongs
    * to.
    *
    * If no bookmark for @uri is found then it is created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addGroup(
      uri: scala.Predef.String /* Some(Ptr[gchar]) */,
      group: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): Unit /* None */ =
    g_bookmark_file_add_group(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
      toCString(uri).asInstanceOf[Ptr[gchar]],
      toCString(group).asInstanceOf[Ptr[gchar]]
    )
  end addGroup

  /** Deeply copies a @bookmark #GBookmarkFile object to a new one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.glib.BookmarkFile /* None */ =
    sn.gnome.glib.BookmarkFile.fromRaw(
      g_bookmark_file_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]]
      )
    )
  end copy

  /** Frees a #GBookmarkFile.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_bookmark_file_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]]
    )
  end free

  /** Gets the time the bookmark for @uri was added to @bookmark
    *
    * In the event the URI cannot be found, -1 is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_added/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(glong), @type -> DataRecord(time_t)))"
  )
  private def getAdded__ = ???

  /** Gets the time the bookmark for @uri was added to @bookmark
    *
    * In the event the URI cannot be found, %NULL is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAddedDateTime(
      uri: scala.Predef.String /* Some(CString) */
  )(using Zone): GResult[sn.gnome.glib.DateTime /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.glib.DateTime.fromRaw(
        g_bookmark_file_get_added_date_time(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
          toCString(uri),
          __errorPtr
        )
      )
    )
  end getAddedDateTime

  /** Gets the registration information of @app_name for the bookmark for
    * @uri.
    *   See g_bookmark_file_set_application_info() for more information about
    *   the returned data.
    *
    * The string returned in @app_exec must be freed.
    *
    * In the event the URI cannot be found, %FALSE is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND. In the event that no
    *   application with name @app_name has registered a bookmark for @uri,
    *   %FALSE is returned and error is set to
    *   %G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED. In the event that unquoting
    *   the command line fails, an error of the %G_SHELL_ERROR domain is set and
    *   %FALSE is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_app_info]: Method get_app_info contains an OUT parameter, which is not supported yet"
  )
  private def getAppInfo__ = ???

  /** Gets the registration information of @app_name for the bookmark for
    * @uri.
    *   See g_bookmark_file_set_application_info() for more information about
    *   the returned data.
    *
    * The string returned in @app_exec must be freed.
    *
    * In the event the URI cannot be found, %FALSE is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND. In the event that no
    *   application with name @app_name has registered a bookmark for @uri,
    *   %FALSE is returned and error is set to
    *   %G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED. In the event that unquoting
    *   the command line fails, an error of the %G_SHELL_ERROR domain is set and
    *   %FALSE is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_application_info]: Method get_application_info contains an OUT parameter, which is not supported yet"
  )
  private def getApplicationInfo__ = ???

  /** Retrieves the names of the applications that have registered the bookmark
    * for @uri.
    *
    * In the event the URI cannot be found, %NULL is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_applications]: Method get_applications contains an OUT parameter, which is not supported yet"
  )
  private def getApplications__ = ???

  /** Retrieves the description of the bookmark for @uri.
    *
    * In the event the URI cannot be found, %NULL is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDescription(
      uri: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): GResult[scala.Predef.String /* None */ ] =
    GResult.wrap(__errorPtr =>
      fromCString(
        g_bookmark_file_get_description(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
          toCString(uri).asInstanceOf[Ptr[gchar]],
          __errorPtr
        ).asInstanceOf
      )
    )
  end getDescription

  /** Retrieves the list of group names of the bookmark for @uri.
    *
    * In the event the URI cannot be found, %NULL is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
    *
    * The returned array is %NULL terminated, so @length may optionally be
    * %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_groups]: Method get_groups contains an OUT parameter, which is not supported yet"
  )
  private def getGroups__ = ???

  /** Gets the icon of the bookmark for @uri.
    *
    * In the event the URI cannot be found, %FALSE is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_icon]: Method get_icon contains an OUT parameter, which is not supported yet"
  )
  private def getIcon__ = ???

  /** Gets whether the private flag of the bookmark for @uri is set.
    *
    * In the event the URI cannot be found, %FALSE is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND. In the event that the
    *   private flag cannot be found, %FALSE is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_INVALID_VALUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsPrivate(
      uri: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_bookmark_file_get_is_private(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
        toCString(uri).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).value.!=(0)
    )
  end getIsPrivate

  /** Retrieves the MIME type of the resource pointed by @uri.
    *
    * In the event the URI cannot be found, %NULL is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND. In the event that the
    *   MIME type cannot be found, %NULL is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_INVALID_VALUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMimeType(
      uri: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): GResult[scala.Predef.String /* None */ ] =
    GResult.wrap(__errorPtr =>
      fromCString(
        g_bookmark_file_get_mime_type(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
          toCString(uri).asInstanceOf[Ptr[gchar]],
          __errorPtr
        ).asInstanceOf
      )
    )
  end getMimeType

  /** Gets the time when the bookmark for @uri was last modified.
    *
    * In the event the URI cannot be found, -1 is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_modified/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(glong), @type -> DataRecord(time_t)))"
  )
  private def getModified__ = ???

  /** Gets the time when the bookmark for @uri was last modified.
    *
    * In the event the URI cannot be found, %NULL is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModifiedDateTime(
      uri: scala.Predef.String /* Some(CString) */
  )(using Zone): GResult[sn.gnome.glib.DateTime /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.glib.DateTime.fromRaw(
        g_bookmark_file_get_modified_date_time(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
          toCString(uri),
          __errorPtr
        )
      )
    )
  end getModifiedDateTime

  /** Gets the number of bookmarks inside @bookmark.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSize(): Int /* None */ =
    g_bookmark_file_get_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]]
    ).value
  end getSize

  /** Returns the title of the bookmark for @uri.
    *
    * If @uri is %NULL, the title of @bookmark is returned.
    *
    * In the event the URI cannot be found, %NULL is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTitle(
      uri: Option[scala.Predef.String /* Some(Ptr[gchar]) */ ]
  )(using Zone): GResult[scala.Predef.String /* None */ ] =
    GResult.wrap(__errorPtr =>
      fromCString(
        g_bookmark_file_get_title(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
          uri
            .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
            .getOrElse(null.asInstanceOf[Ptr[gchar]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end getTitle

  /** Returns all URIs of the bookmarks in the bookmark file @bookmark. The
    * array of returned URIs will be %NULL-terminated, so @length may optionally
    * be %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_uris]: Method get_uris contains an OUT parameter, which is not supported yet"
  )
  private def getUris__ = ???

  /** Gets the time the bookmark for @uri was last visited.
    *
    * In the event the URI cannot be found, -1 is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_visited/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(glong), @type -> DataRecord(time_t)))"
  )
  private def getVisited__ = ???

  /** Gets the time the bookmark for @uri was last visited.
    *
    * In the event the URI cannot be found, %NULL is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVisitedDateTime(
      uri: scala.Predef.String /* Some(CString) */
  )(using Zone): GResult[sn.gnome.glib.DateTime /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.glib.DateTime.fromRaw(
        g_bookmark_file_get_visited_date_time(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
          toCString(uri),
          __errorPtr
        )
      )
    )
  end getVisitedDateTime

  /** Checks whether the bookmark for @uri inside @bookmark has been registered
    * by application @name.
    *
    * In the event the URI cannot be found, %FALSE is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasApplication(
      uri: scala.Predef.String /* Some(Ptr[gchar]) */,
      name: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_bookmark_file_has_application(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
        toCString(uri).asInstanceOf[Ptr[gchar]],
        toCString(name).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).value.!=(0)
    )
  end hasApplication

  /** Checks whether @group appears in the list of groups to which the bookmark
    * for @uri belongs to.
    *
    * In the event the URI cannot be found, %FALSE is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasGroup(
      uri: scala.Predef.String /* Some(Ptr[gchar]) */,
      group: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_bookmark_file_has_group(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
        toCString(uri).asInstanceOf[Ptr[gchar]],
        toCString(group).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).value.!=(0)
    )
  end hasGroup

  /** Looks whether the desktop bookmark has an item with its URI set to @uri.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasItem(
      uri: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): Boolean /* None */ =
    g_bookmark_file_has_item(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
      toCString(uri).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)
  end hasItem

  /** Loads a bookmark file from memory into an empty #GBookmarkFile structure.
    * If the object cannot be created then @error is set to a
    * #GBookmarkFileError.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method load_from_data/<method parameters>/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const gchar*)))"
  )
  private def loadFromData__ = ???

  /** This function looks for a desktop bookmark file named @file in the paths
    * returned from g_get_user_data_dir() and g_get_system_data_dirs(), loads
    * the file into @bookmark and returns the file's full path in
    * @full_path.
    *   If the file could not be loaded then @error is set to either a
    *   #GFileError or #GBookmarkFileError.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method load_from_data_dirs]: Method load_from_data_dirs contains an OUT parameter, which is not supported yet"
  )
  private def loadFromDataDirs__ = ???

  /** Loads a desktop bookmark file into an empty #GBookmarkFile structure. If
    * the file could not be loaded then @error is set to either a #GFileError or
    * #GBookmarkFileError.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def loadFromFile(
      filename: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_bookmark_file_load_from_file(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
        toCString(filename).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).value.!=(0)
    )
  end loadFromFile

  /** Changes the URI of a bookmark item from @old_uri to @new_uri. Any existing
    * bookmark for @new_uri will be overwritten. If @new_uri is %NULL, then the
    * bookmark is removed.
    *
    * In the event the URI cannot be found, %FALSE is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def moveItem(
      old_uri: scala.Predef.String /* Some(Ptr[gchar]) */,
      new_uri: Option[scala.Predef.String /* Some(Ptr[gchar]) */ ]
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_bookmark_file_move_item(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
        toCString(old_uri).asInstanceOf[Ptr[gchar]],
        new_uri
          .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
          .getOrElse(null.asInstanceOf[Ptr[gchar]]),
        __errorPtr
      ).value.!=(0)
    )
  end moveItem

  /** Removes application registered with @name from the list of applications
    * that have registered a bookmark for @uri inside @bookmark.
    *
    * In the event the URI cannot be found, %FALSE is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND. In the event that no
    *   application with name @app_name has registered a bookmark for @uri,
    *   %FALSE is returned and error is set to
    *   %G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeApplication(
      uri: scala.Predef.String /* Some(Ptr[gchar]) */,
      name: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_bookmark_file_remove_application(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
        toCString(uri).asInstanceOf[Ptr[gchar]],
        toCString(name).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).value.!=(0)
    )
  end removeApplication

  /** Removes @group from the list of groups to which the bookmark for @uri
    * belongs to.
    *
    * In the event the URI cannot be found, %FALSE is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND. In the event no group
    *   was defined, %FALSE is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_INVALID_VALUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeGroup(
      uri: scala.Predef.String /* Some(Ptr[gchar]) */,
      group: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_bookmark_file_remove_group(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
        toCString(uri).asInstanceOf[Ptr[gchar]],
        toCString(group).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).value.!=(0)
    )
  end removeGroup

  /** Removes the bookmark for @uri from the bookmark file @bookmark.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeItem(
      uri: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_bookmark_file_remove_item(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
        toCString(uri).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).value.!=(0)
    )
  end removeItem

  /** Sets the time the bookmark for @uri was added into @bookmark.
    *
    * If no bookmark for @uri is found then it is created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_added/<method parameters>/added]: Cannot render type Type(List(),ListMap(@name -> DataRecord(glong), @type -> DataRecord(time_t)))"
  )
  private def setAdded__ = ???

  /** Sets the time the bookmark for @uri was added into @bookmark.
    *
    * If no bookmark for @uri is found then it is created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAddedDateTime(
      uri: scala.Predef.String /* Some(CString) */,
      added: sn.gnome.glib.DateTime /* Some(Ptr[GDateTime]) */
  )(using Zone): Unit /* None */ =
    g_bookmark_file_set_added_date_time(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
      toCString(uri),
      added.getUnsafeRawPointer().asInstanceOf
    )
  end setAddedDateTime

  /** Sets the meta-data of application @name inside the list of applications
    * that have registered a bookmark for @uri inside
    * @bookmark.
    *
    * You should rarely use this function; use g_bookmark_file_add_application()
    * and g_bookmark_file_remove_application() instead.
    *
    * @name
    *   can be any UTF-8 encoded string used to identify an application.
    * @exec
    *   can have one of these two modifiers: "\%f", which will be expanded as
    *   the local file name retrieved from the bookmark's URI; "\%u", which will
    *   be expanded as the bookmark's URI. The expansion is done automatically
    *   when retrieving the stored command line using the
    *   g_bookmark_file_get_application_info() function.
    * @count
    *   is the number of times the application has registered the bookmark; if
    *   is < 0, the current registration count will be increased by one, if is
    *   0, the application with @name will be removed from the list of
    *   registered applications.
    * @stamp
    *   is the Unix time of the last registration; if it is -1, the current time
    *   will be used.
    *
    * If you try to remove an application by setting its registration count to
    * zero, and no bookmark for @uri is found, %FALSE is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND; similarly, in the event
    *   that no application @name has registered a bookmark for @uri, %FALSE is
    *   returned and error is set to %G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED.
    *   Otherwise, if no bookmark for @uri is found, one is created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_app_info/<method parameters>/stamp]: Cannot render type Type(List(),ListMap(@name -> DataRecord(glong), @type -> DataRecord(time_t)))"
  )
  private def setAppInfo__ = ???

  /** Sets the meta-data of application @name inside the list of applications
    * that have registered a bookmark for @uri inside
    * @bookmark.
    *
    * You should rarely use this function; use g_bookmark_file_add_application()
    * and g_bookmark_file_remove_application() instead.
    *
    * @name
    *   can be any UTF-8 encoded string used to identify an application.
    * @exec
    *   can have one of these two modifiers: "\%f", which will be expanded as
    *   the local file name retrieved from the bookmark's URI; "\%u", which will
    *   be expanded as the bookmark's URI. The expansion is done automatically
    *   when retrieving the stored command line using the
    *   g_bookmark_file_get_application_info() function.
    * @count
    *   is the number of times the application has registered the bookmark; if
    *   is < 0, the current registration count will be increased by one, if is
    *   0, the application with @name will be removed from the list of
    *   registered applications.
    * @stamp
    *   is the Unix time of the last registration.
    *
    * If you try to remove an application by setting its registration count to
    * zero, and no bookmark for @uri is found, %FALSE is returned and
    * @error
    *   is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND; similarly, in the event
    *   that no application @name has registered a bookmark for @uri, %FALSE is
    *   returned and error is set to %G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED.
    *   Otherwise, if no bookmark for @uri is found, one is created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setApplicationInfo(
      uri: scala.Predef.String /* Some(CString) */,
      name: scala.Predef.String /* Some(CString) */,
      exec: scala.Predef.String /* Some(CString) */,
      count: Int /* Some(CInt) */,
      stamp: Option[sn.gnome.glib.DateTime /* Some(Ptr[GDateTime]) */ ]
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_bookmark_file_set_application_info(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
        toCString(uri),
        toCString(name),
        toCString(exec),
        count,
        stamp
          .map[Ptr[GDateTime]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GDateTime]]),
        __errorPtr
      ).value.!=(0)
    )
  end setApplicationInfo

  /** Sets @description as the description of the bookmark for @uri.
    *
    * If @uri is %NULL, the description of @bookmark is set.
    *
    * If a bookmark for @uri cannot be found then it is created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDescription(
      uri: Option[scala.Predef.String /* Some(Ptr[gchar]) */ ],
      description: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): Unit /* None */ =
    g_bookmark_file_set_description(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
      uri
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]]),
      toCString(description).asInstanceOf[Ptr[gchar]]
    )
  end setDescription

  /** Sets a list of group names for the item with URI @uri. Each previously set
    * group name list is removed.
    *
    * If @uri cannot be found then an item for it is created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_groups/<method parameters>/groups]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(const gchar**)))"
  )
  private def setGroups__ = ???

  /** Sets the icon for the bookmark for @uri. If @href is %NULL, unsets the
    * currently set icon. @href can either be a full URL for the icon file or
    * the icon name following the Icon Naming specification.
    *
    * If no bookmark for @uri is found one is created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIcon(
      uri: scala.Predef.String /* Some(Ptr[gchar]) */,
      href: Option[scala.Predef.String /* Some(Ptr[gchar]) */ ],
      mime_type: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): Unit /* None */ =
    g_bookmark_file_set_icon(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
      toCString(uri).asInstanceOf[Ptr[gchar]],
      href
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]]),
      toCString(mime_type).asInstanceOf[Ptr[gchar]]
    )
  end setIcon

  /** Sets the private flag of the bookmark for @uri.
    *
    * If a bookmark for @uri cannot be found then it is created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIsPrivate(
      uri: scala.Predef.String /* Some(Ptr[gchar]) */,
      is_private: Boolean /* Some(gboolean) */
  )(using Zone): Unit /* None */ =
    g_bookmark_file_set_is_private(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
      toCString(uri).asInstanceOf[Ptr[gchar]],
      gboolean(gint((if is_private == true then 1 else 0)))
    )
  end setIsPrivate

  /** Sets @mime_type as the MIME type of the bookmark for @uri.
    *
    * If a bookmark for @uri cannot be found then it is created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMimeType(
      uri: scala.Predef.String /* Some(Ptr[gchar]) */,
      mime_type: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): Unit /* None */ =
    g_bookmark_file_set_mime_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
      toCString(uri).asInstanceOf[Ptr[gchar]],
      toCString(mime_type).asInstanceOf[Ptr[gchar]]
    )
  end setMimeType

  /** Sets the last time the bookmark for @uri was last modified.
    *
    * If no bookmark for @uri is found then it is created.
    *
    * The "modified" time should only be set when the bookmark's meta-data was
    * actually changed. Every function of #GBookmarkFile that modifies a
    * bookmark also changes the modification time, except for
    * g_bookmark_file_set_visited_date_time().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_modified/<method parameters>/modified]: Cannot render type Type(List(),ListMap(@name -> DataRecord(glong), @type -> DataRecord(time_t)))"
  )
  private def setModified__ = ???

  /** Sets the last time the bookmark for @uri was last modified.
    *
    * If no bookmark for @uri is found then it is created.
    *
    * The "modified" time should only be set when the bookmark's meta-data was
    * actually changed. Every function of #GBookmarkFile that modifies a
    * bookmark also changes the modification time, except for
    * g_bookmark_file_set_visited_date_time().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModifiedDateTime(
      uri: scala.Predef.String /* Some(CString) */,
      modified: sn.gnome.glib.DateTime /* Some(Ptr[GDateTime]) */
  )(using Zone): Unit /* None */ =
    g_bookmark_file_set_modified_date_time(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
      toCString(uri),
      modified.getUnsafeRawPointer().asInstanceOf
    )
  end setModifiedDateTime

  /** Sets @title as the title of the bookmark for @uri inside the bookmark file @bookmark.
    *
    * If @uri is %NULL, the title of @bookmark is set.
    *
    * If a bookmark for @uri cannot be found then it is created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTitle(
      uri: Option[scala.Predef.String /* Some(Ptr[gchar]) */ ],
      title: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): Unit /* None */ =
    g_bookmark_file_set_title(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
      uri
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]]),
      toCString(title).asInstanceOf[Ptr[gchar]]
    )
  end setTitle

  /** Sets the time the bookmark for @uri was last visited.
    *
    * If no bookmark for @uri is found then it is created.
    *
    * The "visited" time should only be set if the bookmark was launched, either
    * using the command line retrieved by g_bookmark_file_get_application_info()
    * or by the default application for the bookmark's MIME type, retrieved
    * using g_bookmark_file_get_mime_type(). Changing the "visited" time does
    * not affect the "modified" time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_visited/<method parameters>/visited]: Cannot render type Type(List(),ListMap(@name -> DataRecord(glong), @type -> DataRecord(time_t)))"
  )
  private def setVisited__ = ???

  /** Sets the time the bookmark for @uri was last visited.
    *
    * If no bookmark for @uri is found then it is created.
    *
    * The "visited" time should only be set if the bookmark was launched, either
    * using the command line retrieved by g_bookmark_file_get_application_info()
    * or by the default application for the bookmark's MIME type, retrieved
    * using g_bookmark_file_get_mime_type(). Changing the "visited" time does
    * not affect the "modified" time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVisitedDateTime(
      uri: scala.Predef.String /* Some(CString) */,
      visited: sn.gnome.glib.DateTime /* Some(Ptr[GDateTime]) */
  )(using Zone): Unit /* None */ =
    g_bookmark_file_set_visited_date_time(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
      toCString(uri),
      visited.getUnsafeRawPointer().asInstanceOf
    )
  end setVisitedDateTime

  /** This function outputs @bookmark as a string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method to_data]: Method to_data contains an OUT parameter, which is not supported yet"
  )
  private def toData__ = ???

  /** This function outputs @bookmark into a file. The write process is
    * guaranteed to be atomic by using g_file_set_contents() internally.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toFile(
      filename: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_bookmark_file_to_file(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GBookmarkFile]],
        toCString(filename).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).value.!=(0)
    )
  end toFile

end BookmarkFile

object BookmarkFile:
  def fromRaw(ptr: Ptr[GBookmarkFile]): BookmarkFile = new BookmarkFile(ptr)
end BookmarkFile
