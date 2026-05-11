package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.RecentManager
import sn.gnome.gtk4.internal.GtkRecentManager
import sn.gnome.runtime.*

/** `GtkRecentManager` manages and looks up recently used files.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class RecentManager private[gnome] (raw: Ptr[GtkRecentManager])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a new resource, pointed by @uri, into the recently used resources
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_full/<method parameters>/recent_data]: Cannot render type Type(List(),ListMap(@name -> DataRecord(RecentData), @type -> DataRecord(const GtkRecentData*)))"
  )
  private def addFull__ = ???

  /** Adds a new resource, pointed by @uri, into the recently used resources
    * list.
    *
    * This function automatically retrieves some of the needed metadata and
    * setting other metadata to common default values; it then feeds the data to
    * [method@Gtk.RecentManager.add_full].
    *
    * See [method@Gtk.RecentManager.add_full] if you want to explicitly define
    * the metadata for the resource pointed by @uri.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addItem(
      uri: String /* Some(CString) */
  )(using Zone): Boolean /* None */ =
    gtk_recent_manager_add_item(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentManager]],
      toCString(uri)
    ).value.!=(0)
  end addItem

  /** Gets the list of recently used resources.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_items/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(RecentInfo))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def getItems__ = ???

  /** Checks whether there is a recently used resource registered with @uri
    * inside the recent manager.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasItem(
      uri: String /* Some(CString) */
  )(using Zone): Boolean /* None */ =
    gtk_recent_manager_has_item(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentManager]],
      toCString(uri)
    ).value.!=(0)
  end hasItem

  /** Searches for a URI inside the recently used resources list, and returns a
    * `GtkRecentInfo` containing information about the resource like its MIME
    * type, or its display name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup_item/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(RecentInfo), @type -> DataRecord(GtkRecentInfo*)))"
  )
  private def lookupItem__ = ???

  /** Changes the location of a recently used resource from @uri to @new_uri.
    *
    * Please note that this function will not affect the resource pointed by the
    * URIs, but only the URI used in the recently used resources list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def moveItem(
      uri: String /* Some(CString) */,
      new_uri: Option[String /* Some(CString) */ ]
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      gtk_recent_manager_move_item(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentManager]],
        toCString(uri),
        new_uri
          .map[CString](o => toCString(o))
          .getOrElse(null.asInstanceOf[CString]),
        __errorPtr
      ).value.!=(0)
    )
  end moveItem

  /** Purges every item from the recently used resources list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def purgeItems(): GResult[Int /* None */ ] =
    GResult.wrap(__errorPtr =>
      gtk_recent_manager_purge_items(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentManager]],
        __errorPtr
      )
    )
  end purgeItems

  /** Removes a resource pointed by @uri from the recently used resources list
    * handled by a recent manager.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeItem(
      uri: String /* Some(CString) */
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      gtk_recent_manager_remove_item(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRecentManager]],
        toCString(uri),
        __errorPtr
      ).value.!=(0)
    )
  end removeItem

  /** Emitted when the current recently used resources manager changes its
    * contents.
    *
    * This can happen either by calling [method@Gtk.RecentManager.add_item] or
    * by another application.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onChanged(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkRecentManager],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"changed"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onChanged
end RecentManager

object RecentManager:
  def applyUnsafe(ptr: Ptr[GtkRecentManager])(using Runtime) =
    summon[Runtime].getOrCreate[RecentManager](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new RecentManager(ptr)
    )

  /** Creates a new recent manager object.
    *
    * Recent manager objects are used to handle the list of recently used
    * resources. A `GtkRecentManager` object monitors the recently used
    * resources list, and emits the [signal@Gtk.RecentManager::changed] signal
    * each time something inside the list changes.
    *
    * `GtkRecentManager` objects are expensive: be sure to create them only when
    * needed. You should use [func@Gtk.RecentManager.get_default] instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): RecentManager =
    val raw: Ptr[Byte] = gtk_recent_manager_new().asInstanceOf
    summon[Runtime].getOrCreate[RecentManager](
      raw,
      r => RecentManager.applyUnsafe(r.asInstanceOf)
    )
  end apply

  /** Gets a unique instance of `GtkRecentManager` that you can share in your
    * application without caring about memory management.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefault()(using
      Runtime
  ): sn.gnome.gtk4.fluent.RecentManager /* Some(Ptr[GtkRecentManager]) */ =
    sn.gnome.gtk4.fluent.RecentManager
      .applyUnsafe(gtk_recent_manager_get_default().asInstanceOf)

end RecentManager
