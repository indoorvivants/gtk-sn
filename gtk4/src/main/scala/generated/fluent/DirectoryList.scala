package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{File, ListModel}
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.internal.GtkDirectoryList

/** `GtkDirectoryList` is a list model that wraps
  * g_file_enumerate_children_async().
  *
  * It presents a `GListModel` and fills it asynchronously with the `GFileInfo`s
  * returned from that function.
  *
  * Enumeration will start automatically when a the
  * [property@Gtk.DirectoryList:file] property is set.
  *
  * While the `GtkDirectoryList` is being filled, the
  * [property@Gtk.DirectoryList:loading] property will be set to %TRUE. You can
  * listen to that property if you want to show information like a `GtkSpinner`
  * or a "Loading..." text.
  *
  * If loading fails at any point, the [property@Gtk.DirectoryList:error]
  * property will be set to give more indication about the failure.
  *
  * The `GFileInfo`s returned from a `GtkDirectoryList` have the
  * "standard::file" attribute set to the `GFile` they refer to. This way you
  * can get at the file that is referred to in the same way you would via
  * g_file_enumerator_get_child(). This means you do not need access to the
  * `GtkDirectoryList`, but can access the `GFile` directly from the `GFileInfo`
  * when operating with a `GtkListView` or similar.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DirectoryList private[gnome] (raw: Ptr[GtkDirectoryList])
    extends Object(raw.asInstanceOf),
      ListModel:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the attributes queried on the children.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributes(): String /* None */ =
    fromCString(
      gtk_directory_list_get_attributes(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDirectoryList]]
      ).asInstanceOf
    )
  end getAttributes

  /** Gets the loading error, if any.
    *
    * If an error occurs during the loading process, the loading process will
    * finish and this property allows querying the error that happened. This
    * error will persist until a file is loaded again.
    *
    * An error being set does not mean that no files were loaded, and all
    * successfully queried files will remain in the list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_error/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(const GError*)))"
  )
  private def getError__ = ???

  /** Gets the file whose children are currently enumerated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFile(): File /* None */ =
    new File.Abstract(
      gtk_directory_list_get_file(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDirectoryList]]
      ).asInstanceOf
    )
  end getFile

  /** Gets the IO priority set via gtk_directory_list_set_io_priority().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIoPriority(): Int /* None */ =
    gtk_directory_list_get_io_priority(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDirectoryList]]
    )
  end getIoPriority

  /** Returns whether the directory list is monitoring the directory for
    * changes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMonitored(): Boolean /* None */ =
    gtk_directory_list_get_monitored(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDirectoryList]]
    ).value.!=(0)
  end getMonitored

  /** Returns %TRUE if the children enumeration is currently in progress.
    *
    * Files will be added to @self from time to time while loading is going on.
    * The order in which are added is undefined and may change in between runs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isLoading(): Boolean /* None */ =
    gtk_directory_list_is_loading(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDirectoryList]]
    ).value.!=(0)
  end isLoading

  /** Sets the @attributes to be enumerated and starts the enumeration.
    *
    * If @attributes is %NULL, the list of file infos will still be created, it
    * will just not contain any extra attributes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributes(attributes: Option[String /* Some(CString) */ ])(using
      Runtime
  ): Unit /* None */ =
    gtk_directory_list_set_attributes(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDirectoryList]],
      attributes
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setAttributes

  /** Sets the @file to be enumerated and starts the enumeration.
    *
    * If @file is %NULL, the result will be an empty list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFile(
      file: Option[File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */ ]
  ): Unit /* None */ =
    gtk_directory_list_set_file(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDirectoryList]],
      file
        .map[Ptr[_root_.sn.gnome.gio.internal.GFile]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GFile]])
    )
  end setFile

  /** Sets the IO priority to use while loading directories.
    *
    * Setting the priority while @self is loading will reprioritize the ongoing
    * load as soon as possible.
    *
    * The default IO priority is %G_PRIORITY_DEFAULT, which is higher than the
    * GTK redraw priority. If you are loading a lot of directories in parallel,
    * lowering it to something like %G_PRIORITY_DEFAULT_IDLE may increase
    * responsiveness.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIoPriority(io_priority: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_directory_list_set_io_priority(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDirectoryList]],
      io_priority
    )
  end setIoPriority

  /** Sets whether the directory list will monitor the directory for changes.
    *
    * If monitoring is enabled, the ::items-changed signal will be emitted when
    * the directory contents change.
    *
    * When monitoring is turned on after the initial creation of the directory
    * list, the directory is reloaded to avoid missing files that appeared
    * between the initial loading and when monitoring was turned on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMonitored(
      monitored: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_directory_list_set_monitored(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDirectoryList]],
      gboolean(gint((if monitored == true then 1 else 0)))
    )
  end setMonitored

end DirectoryList

object DirectoryList:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkDirectoryList])(using Runtime) =
    summon[Runtime].getOrCreate[DirectoryList](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new DirectoryList(ptr)
    )

  /** Creates a new `GtkDirectoryList`.
    *
    * The `GtkDirectoryList` is querying the given @file with the given @attributes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      attributes: Option[String /* Some(CString) */ ],
      file: Option[File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */ ]
  )(using Runtime): DirectoryList =
    val raw: Ptr[Byte] = gtk_directory_list_new(
      attributes
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString]),
      file
        .map[Ptr[_root_.sn.gnome.gio.internal.GFile]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GFile]])
    ).asInstanceOf
    summon[Runtime].getOrCreate[DirectoryList](
      raw,
      r => DirectoryList.applyUnsafe(r.asInstanceOf)
    )
  end apply
end DirectoryList
