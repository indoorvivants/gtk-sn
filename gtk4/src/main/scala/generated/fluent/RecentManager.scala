package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.RecentManager
import sn.gnome.gtk4.internal.GtkRecentManager

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkRecentManager` manages and looks up recently used files.
  *
  * Each recently used file is identified by its URI, and has meta-data
  * associated to it, like the names and command lines of the applications that
  * have registered it, the number of time each application has registered the
  * same file, the mime type of the file and whether the file should be
  * displayed only by the applications that have registered it.
  *
  * The recently used files list is per user.
  *
  * `GtkRecentManager` acts like a database of all the recently used files. You
  * can create new `GtkRecentManager` objects, but it is more efficient to use
  * the default manager created by GTK.
  *
  * Adding a new recently used file is as simple as:
  *
  * ```c
  * GtkRecentManager *manager;
  *
  * manager = gtk_recent_manager_get_default ();
  * gtk_recent_manager_add_item (manager, file_uri);
  * ```
  *
  * The `GtkRecentManager` will try to gather all the needed information from
  * the file itself through GIO.
  *
  * Looking up the meta-data associated with a recently used file given its URI
  * requires calling [method@Gtk.RecentManager.lookup_item]:
  *
  * ```c
  * GtkRecentManager *manager;
  * GtkRecentInfo *info;
  * GError *error = NULL;
  *
  * manager = gtk_recent_manager_get_default ();
  * info = gtk_recent_manager_lookup_item (manager, file_uri, &error);
  * if (error)
  *   {
  *     g_warning ("Could not find the file: %s", error->message);
  *     g_error_free (error);
  *   }
  * else
  *  {
  *    // Use the info object
  *    gtk_recent_info_unref (info);
  *  }
  * ```
  *
  * In order to retrieve the list of recently used files, you can use
  * [method@Gtk.RecentManager.get_items], which returns a list of
  * [struct@Gtk.RecentInfo].
  *
  * Note that the maximum age of the recently used files list is controllable
  * through the [property@Gtk.Settings:gtk-recent-files-max-age] property.
  */
class RecentManager(raw: Ptr[GtkRecentManager])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a new resource, pointed by @uri, into the recently used resources
    * list, using the metadata specified inside the `GtkRecentData` passed in @recent_data.
    *
    * The passed URI will be used to identify this resource inside the list.
    *
    * In order to register the new recently used resource, metadata about the
    * resource must be passed as well as the URI; the metadata is stored in a
    * `GtkRecentData`, which must contain the MIME type of the resource pointed
    * by the URI; the name of the application that is registering the item, and
    * a command line to be used when launching the item.
    *
    * Optionally, a `GtkRecentData` might contain a UTF-8 string to be used when
    * viewing the item instead of the last component of the URI; a short
    * description of the item; whether the item should be considered private -
    * that is, should be displayed only by the applications that have registered
    * it.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(RecentData), @type -> DataRecord(const GtkRecentData*)))"
  )
  def addFull__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a new resource, pointed by @uri, into the recently used resources
    * list.
    *
    * This function automatically retrieves some of the needed metadata and
    * setting other metadata to common default values; it then feeds the data to
    * [method@Gtk.RecentManager.add_full].
    *
    * See [method@Gtk.RecentManager.add_full] if you want to explicitly define
    * the metadata for the resource pointed by @uri.
    */
  def addItem(
      uri: String | CString /* Some(CString) */
  )(using Zone): Boolean /* None */ = gtk_recent_manager_add_item(
    this.raw.asInstanceOf[Ptr[GtkRecentManager]],
    __sn_extract_string(uri)
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the list of recently used resources.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(RecentInfo))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  def getItems__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether there is a recently used resource registered with @uri
    * inside the recent manager.
    */
  def hasItem(
      uri: String | CString /* Some(CString) */
  )(using Zone): Boolean /* None */ = gtk_recent_manager_has_item(
    this.raw.asInstanceOf[Ptr[GtkRecentManager]],
    __sn_extract_string(uri)
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Searches for a URI inside the recently used resources list, and returns a
    * `GtkRecentInfo` containing information about the resource like its MIME
    * type, or its display name.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(RecentInfo), @type -> DataRecord(GtkRecentInfo*)))"
  )
  def lookupItem__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Changes the location of a recently used resource from @uri to @new_uri.
    *
    * Please note that this function will not affect the resource pointed by the
    * URIs, but only the URI used in the recently used resources list.
    */
  def moveItem(
      uri: String | CString /* Some(CString) */,
      new_uri: Option[String | CString /* Some(CString) */ ]
  )(using Zone): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    gtk_recent_manager_move_item(
      this.raw.asInstanceOf[Ptr[GtkRecentManager]],
      __sn_extract_string(uri),
      new_uri
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString]),
      __errorPtr
    ).value.!=(0)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Purges every item from the recently used resources list.
    */
  def purgeItems(): GResult[Int /* None */ ] = GResult.wrap(__errorPtr =>
    gtk_recent_manager_purge_items(
      this.raw.asInstanceOf[Ptr[GtkRecentManager]],
      __errorPtr
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a resource pointed by @uri from the recently used resources list
    * handled by a recent manager.
    */
  def removeItem(
      uri: String | CString /* Some(CString) */
  )(using Zone): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    gtk_recent_manager_remove_item(
      this.raw.asInstanceOf[Ptr[GtkRecentManager]],
      __sn_extract_string(uri),
      __errorPtr
    ).value.!=(0)
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end RecentManager

object RecentManager:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new recent manager object.
    *
    * Recent manager objects are used to handle the list of recently used
    * resources. A `GtkRecentManager` object monitors the recently used
    * resources list, and emits the [signal@Gtk.RecentManager::changed] signal
    * each time something inside the list changes.
    *
    * `GtkRecentManager` objects are expensive: be sure to create them only when
    * needed. You should use [func@Gtk.RecentManager.get_default] instead.
    */
  def apply(): RecentManager = new RecentManager(
    gtk_recent_manager_new().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a unique instance of `GtkRecentManager` that you can share in your
    * application without caring about memory management.
    */
  def getDefault(): RecentManager /* Some(Ptr[GtkRecentManager]) */ =
    new RecentManager(gtk_recent_manager_get_default().asInstanceOf)

end RecentManager
