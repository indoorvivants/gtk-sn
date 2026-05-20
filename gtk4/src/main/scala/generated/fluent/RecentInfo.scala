package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{AppInfo, Icon}
import sn.gnome.glib.{DateTime, GResult}
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.RecentInfo
import sn.gnome.gtk4.internal.GtkRecentInfo

/** `GtkRecentInfo` contains the metadata associated with an item in the
  * recently used files list.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class RecentInfo private[gnome] (raw: Ptr[GtkRecentInfo]):

  def getUnsafeRawPointer(): Ptr[GtkRecentInfo] = this.raw

  /** Creates a `GAppInfo` for the specified `GtkRecentInfo`
    *
    * In case of error, @error will be set either with a
    * %GTK_RECENT_MANAGER_ERROR or a %G_IO_ERROR
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def createAppInfo(
      app_name: Option[scala.Predef.String /* Some(CString) */ ]
  )(using Zone): GResult[sn.gnome.gio.AppInfo /* None */ ] =
    GResult.wrap(__errorPtr =>
      new AppInfo.Abstract(
        gtk_recent_info_create_app_info(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentInfo]],
          app_name
            .map[CString](o => toCString(o))
            .getOrElse(null.asInstanceOf[CString]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end createAppInfo

  /** Checks whether the resource pointed by @info still exists. At the moment
    * this check is done only on resources pointing to local files.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def exists(): Boolean /* None */ =
    gtk_recent_info_exists(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentInfo]]
    ).value.!=(0)
  end exists

  /** Gets the time when the resource was added to the recently used resources
    * list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAdded(): sn.gnome.glib.DateTime /* None */ =
    sn.gnome.glib.DateTime.fromRaw(
      gtk_recent_info_get_added(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentInfo]]
      )
    )
  end getAdded

  /** Gets the number of days elapsed since the last update of the resource
    * pointed by @info.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAge(): Int /* None */ =
    gtk_recent_info_get_age(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentInfo]]
    )
  end getAge

  /** Gets the data regarding the application that has registered the resource
    * pointed by @info.
    *
    * If the command line contains any escape characters defined inside the
    * storage specification, they will be expanded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_application_info]: Method get_application_info contains an OUT parameter, which is not supported yet"
  )
  private def getApplicationInfo__ = ???

  /** Retrieves the list of applications that have registered this resource.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_applications]: Method get_applications contains an OUT parameter, which is not supported yet"
  )
  private def getApplications__ = ???

  /** Gets the (short) description of the resource.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDescription(): scala.Predef.String /* None */ =
    fromCString(
      gtk_recent_info_get_description(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentInfo]]
      ).asInstanceOf
    )
  end getDescription

  /** Gets the name of the resource.
    *
    * If none has been defined, the basename of the resource is obtained.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDisplayName(): scala.Predef.String /* None */ =
    fromCString(
      gtk_recent_info_get_display_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentInfo]]
      ).asInstanceOf
    )
  end getDisplayName

  /** Retrieves the icon associated to the resource MIME type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getGicon(): sn.gnome.gio.Icon /* None */ =
    new Icon.Abstract(
      gtk_recent_info_get_gicon(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentInfo]]
      ).asInstanceOf
    )
  end getGicon

  /** Returns all groups registered for the recently used item @info.
    *
    * The array of returned group names will be %NULL terminated, so length
    * might optionally be %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_groups]: Method get_groups contains an OUT parameter, which is not supported yet"
  )
  private def getGroups__ = ???

  /** Gets the MIME type of the resource.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMimeType(): scala.Predef.String /* None */ =
    fromCString(
      gtk_recent_info_get_mime_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentInfo]]
      ).asInstanceOf
    )
  end getMimeType

  /** Gets the time when the meta-data for the resource was last modified.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModified(): sn.gnome.glib.DateTime /* None */ =
    sn.gnome.glib.DateTime.fromRaw(
      gtk_recent_info_get_modified(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentInfo]]
      )
    )
  end getModified

  /** Gets the value of the “private” flag.
    *
    * Resources in the recently used list that have this flag set to %TRUE
    * should only be displayed by the applications that have registered them.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPrivateHint(): Boolean /* None */ =
    gtk_recent_info_get_private_hint(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentInfo]]
    ).value.!=(0)
  end getPrivateHint

  /** Computes a valid UTF-8 string that can be used as the name of the item in
    * a menu or list.
    *
    * For example, calling this function on an item that refers to
    * “file:///foo/bar.txt” will yield “bar.txt”.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShortName(): scala.Predef.String /* None */ =
    fromCString(
      gtk_recent_info_get_short_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentInfo]]
      ).asInstanceOf
    )
  end getShortName

  /** Gets the URI of the resource.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUri(): scala.Predef.String /* None */ =
    fromCString(
      gtk_recent_info_get_uri(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentInfo]]
      ).asInstanceOf
    )
  end getUri

  /** Gets a displayable version of the resource’s URI.
    *
    * If the resource is local, it returns a local path; if the resource is not
    * local, it returns the UTF-8 encoded content of
    * [method@Gtk.RecentInfo.get_uri].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUriDisplay(): scala.Predef.String /* None */ =
    fromCString(
      gtk_recent_info_get_uri_display(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentInfo]]
      ).asInstanceOf
    )
  end getUriDisplay

  /** Gets the time when the meta-data for the resource was last visited.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVisited(): sn.gnome.glib.DateTime /* None */ =
    sn.gnome.glib.DateTime.fromRaw(
      gtk_recent_info_get_visited(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentInfo]]
      )
    )
  end getVisited

  /** Checks whether an application registered this resource using @app_name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasApplication(
      app_name: scala.Predef.String /* Some(CString) */
  )(using Zone): Boolean /* None */ =
    gtk_recent_info_has_application(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentInfo]],
      toCString(app_name)
    ).value.!=(0)
  end hasApplication

  /** Checks whether @group_name appears inside the groups registered for the
    * recently used item @info.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasGroup(
      group_name: scala.Predef.String /* Some(CString) */
  )(using Zone): Boolean /* None */ =
    gtk_recent_info_has_group(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentInfo]],
      toCString(group_name)
    ).value.!=(0)
  end hasGroup

  /** Checks whether the resource is local or not by looking at the scheme of
    * its URI.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isLocal(): Boolean /* None */ =
    gtk_recent_info_is_local(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentInfo]]
    ).value.!=(0)
  end isLocal

  /** Gets the name of the last application that have registered the recently
    * used resource represented by @info.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lastApplication(): scala.Predef.String /* None */ =
    fromCString(
      gtk_recent_info_last_application(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentInfo]]
      ).asInstanceOf
    )
  end lastApplication

  /** Checks whether two `GtkRecentInfo` point to the same resource.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def `match`(
      info_b: sn.gnome.gtk4.RecentInfo /* Some(Ptr[GtkRecentInfo]) */
  ): Boolean /* None */ =
    gtk_recent_info_match(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentInfo]],
      info_b.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end `match`

  /** Increases the reference count of @recent_info by one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gtk4.RecentInfo /* None */ =
    sn.gnome.gtk4.RecentInfo.fromRaw(
      gtk_recent_info_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentInfo]]
      )
    )
  end ref

  /** Decreases the reference count of @info by one.
    *
    * If the reference count reaches zero, @info is deallocated, and the memory
    * freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    gtk_recent_info_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentInfo]]
    )
  end unref

end RecentInfo

object RecentInfo:
  def fromRaw(ptr: Ptr[GtkRecentInfo]): RecentInfo = new RecentInfo(ptr)
end RecentInfo
