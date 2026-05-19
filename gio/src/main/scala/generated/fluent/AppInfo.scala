package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{AppInfo, AsyncResult, Icon}
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

trait AppInfo:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Adds a content type to the application information to indicate the
    * application is capable of opening files with the given content type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addSupportsType(
      content_type: String /* Some(CString) */
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_app_info_add_supports_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GAppInfo]],
        summon[Runtime].inZone(toCString(content_type)),
        __errorPtr
      ).value.!=(0)
    )
  end addSupportsType

  /** Obtains the information whether the #GAppInfo can be deleted. See
    * g_app_info_delete().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def canDelete(): Boolean /* None */ =
    g_app_info_can_delete(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAppInfo]]
    ).value.!=(0)
  end canDelete

  /** Checks if a supported content type can be removed from an application.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def canRemoveSupportsType(): Boolean /* None */ =
    g_app_info_can_remove_supports_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAppInfo]]
    ).value.!=(0)
  end canRemoveSupportsType

  /** Tries to delete a #GAppInfo.
    *
    * On some platforms, there may be a difference between user-defined
    * #GAppInfos which can be deleted, and system-wide ones which cannot. See
    * g_app_info_can_delete().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def delete(): Boolean /* None */ =
    g_app_info_delete(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAppInfo]]
    ).value.!=(0)
  end delete

  /** Creates a duplicate of a #GAppInfo.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dup(): AppInfo /* None */ =
    new AppInfo.Abstract(
      g_app_info_dup(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GAppInfo]]
      ).asInstanceOf
    )
  end dup

  /** Checks if two #GAppInfos are equal.
    *
    * Note that the check *may not* compare each individual field, and only does
    * an identity check. In case detecting changes in the contents is needed,
    * program code must additionally compare relevant fields.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(appinfo2: AppInfo /* Some(Ptr[GAppInfo]) */ ): Boolean /* None */ =
    g_app_info_equal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAppInfo]],
      appinfo2.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end equal

  /** Gets the commandline with which the application will be started.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCommandline(): String /* None */ =
    fromCString(
      g_app_info_get_commandline(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GAppInfo]]
      ).asInstanceOf
    )
  end getCommandline

  /** Gets a human-readable description of an installed application.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDescription(): String /* None */ =
    fromCString(
      g_app_info_get_description(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GAppInfo]]
      ).asInstanceOf
    )
  end getDescription

  /** Gets the display name of the application. The display name is often more
    * descriptive to the user than the name itself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDisplayName(): String /* None */ =
    fromCString(
      g_app_info_get_display_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GAppInfo]]
      ).asInstanceOf
    )
  end getDisplayName

  /** Gets the executable's name for the installed application.
    *
    * This is intended to be used for debugging or labelling what program is
    * going to be run. To launch the executable, use g_app_info_launch() and
    * related functions, rather than spawning the return value from this
    * function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExecutable(): String /* None */ =
    fromCString(
      g_app_info_get_executable(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GAppInfo]]
      ).asInstanceOf
    )
  end getExecutable

  /** Gets the icon for the application.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIcon(): Icon /* None */ =
    new Icon.Abstract(
      g_app_info_get_icon(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GAppInfo]]
      ).asInstanceOf
    )
  end getIcon

  /** Gets the ID of an application. An id is a string that identifies the
    * application. The exact format of the id is platform dependent. For
    * instance, on Unix this is the desktop file id from the xdg menu
    * specification.
    *
    * Note that the returned ID may be %NULL, depending on how the @appinfo has
    * been constructed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getId(): String /* None */ =
    fromCString(
      g_app_info_get_id(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GAppInfo]]
      ).asInstanceOf
    )
  end getId

  /** Gets the installed name of the application.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName(): String /* None */ =
    fromCString(
      g_app_info_get_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GAppInfo]]
      ).asInstanceOf
    )
  end getName

  /** Retrieves the list of content types that @app_info claims to support. If
    * this information is not provided by the environment, this function will
    * return %NULL. This function does not take in consideration associations
    * added with g_app_info_add_supports_type(), but only those exported
    * directly by the application.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSupportedTypes()(using Runtime): Array[String] /* None */ =
    MemoryRead
      .nullTerminatedPointerArray(
        g_app_info_get_supported_types(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GAppInfo]]
        )
      )
      .map(fromCString(_))
  end getSupportedTypes

  /** Launches the application. Passes @files to the launched application as
    * arguments, using the optional @context to get information about the
    * details of the launcher (like what screen it is on). On error, @error will
    * be set accordingly.
    *
    * To launch the application without arguments pass a %NULL @files list.
    *
    * Note that even if the launch is successful the application launched can
    * fail to start if it runs into problems during startup. There is no way to
    * detect this.
    *
    * Some URIs can be changed when passed through a GFile (for instance
    * unsupported URIs with strange formats like mailto:), so if you have a
    * textual URI you want to pass in as argument, consider using
    * g_app_info_launch_uris() instead.
    *
    * The launched application inherits the environment of the launching
    * process, but it can be modified with g_app_launch_context_setenv() and
    * g_app_launch_context_unsetenv().
    *
    * On UNIX, this function sets the `GIO_LAUNCHED_DESKTOP_FILE` environment
    * variable with the path of the launched desktop file and
    * `GIO_LAUNCHED_DESKTOP_FILE_PID` to the process id of the launched process.
    * This can be used to ignore `GIO_LAUNCHED_DESKTOP_FILE`, should it be
    * inherited by further processes. The `DISPLAY`, `XDG_ACTIVATION_TOKEN` and
    * `DESKTOP_STARTUP_ID` environment variables are also set, based on
    * information provided in @context.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method launch/<method parameters>/files]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(File))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def launch__ = ???

  /** Launches the application. This passes the @uris to the launched
    * application as arguments, using the optional @context to get information
    * about the details of the launcher (like what screen it is on). On error, @error
    * will be set accordingly. If the application only supports one URI per
    * invocation as part of their command-line, multiple instances of the
    * application will be spawned.
    *
    * To launch the application without arguments pass a %NULL @uris list.
    *
    * Note that even if the launch is successful the application launched can
    * fail to start if it runs into problems during startup. There is no way to
    * detect this.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method launch_uris/<method parameters>/uris]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def launchUris__ = ???

  /** Async version of g_app_info_launch_uris().
    *
    * The @callback is invoked immediately after the application launch, but it
    * waits for activation in case of D-Bus–activated applications and also
    * provides extended error information for sandboxed applications, see notes
    * for g_app_info_launch_default_for_uri_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method launch_uris_async/<method parameters>/uris]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def launchUrisAsync__ = ???

  /** Finishes a g_app_info_launch_uris_async() operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def launchUrisFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_app_info_launch_uris_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GAppInfo]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end launchUrisFinish

  /** Removes a supported type from an application, if possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeSupportsType(
      content_type: String /* Some(CString) */
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_app_info_remove_supports_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GAppInfo]],
        summon[Runtime].inZone(toCString(content_type)),
        __errorPtr
      ).value.!=(0)
    )
  end removeSupportsType

  /** Sets the application as the default handler for the given file extension.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAsDefaultForExtension(
      extension: String /* Some(CString) */
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_app_info_set_as_default_for_extension(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GAppInfo]],
        summon[Runtime].inZone(toCString(extension)),
        __errorPtr
      ).value.!=(0)
    )
  end setAsDefaultForExtension

  /** Sets the application as the default handler for a given type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAsDefaultForType(
      content_type: String /* Some(CString) */
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_app_info_set_as_default_for_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GAppInfo]],
        summon[Runtime].inZone(toCString(content_type)),
        __errorPtr
      ).value.!=(0)
    )
  end setAsDefaultForType

  /** Sets the application as the last used application for a given type. This
    * will make the application appear as first in the list returned by
    * g_app_info_get_recommended_for_type(), regardless of the default
    * application for that content type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAsLastUsedForType(
      content_type: String /* Some(CString) */
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_app_info_set_as_last_used_for_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GAppInfo]],
        summon[Runtime].inZone(toCString(content_type)),
        __errorPtr
      ).value.!=(0)
    )
  end setAsLastUsedForType

  /** Checks if the application info should be shown in menus that list
    * available applications.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def shouldShow(): Boolean /* None */ =
    g_app_info_should_show(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAppInfo]]
    ).value.!=(0)
  end shouldShow

  /** Checks if the application accepts files as arguments.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def supportsFiles(): Boolean /* None */ =
    g_app_info_supports_files(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAppInfo]]
    ).value.!=(0)
  end supportsFiles

  /** Checks if the application supports reading files and directories from
    * URIs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def supportsUris(): Boolean /* None */ =
    g_app_info_supports_uris(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAppInfo]]
    ).value.!=(0)
  end supportsUris

end AppInfo

object AppInfo:
  class Abstract(raw: Ptr[Byte]) extends AppInfo:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end AppInfo
