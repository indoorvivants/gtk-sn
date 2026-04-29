package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.File
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.GError
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.internal.GtkDirectoryList

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkDirectoryList` is a list model that wraps
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
  */
class DirectoryList(raw: Ptr[GtkDirectoryList])
    extends Object(raw.asInstanceOf),
      ListModel:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the attributes queried on the children.
    */
  def getAttributes()(using Zone): String = fromCString(
    gtk_directory_list_get_attributes(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the loading error, if any.
    *
    * If an error occurs during the loading process, the loading process will
    * finish and this property allows querying the error that happened. This
    * error will persist until a file is loaded again.
    *
    * An error being set does not mean that no files were loaded, and all
    * successfully queried files will remain in the list.
    */
  def getError(): Ptr[GError] = gtk_directory_list_get_error(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the file whose children are currently enumerated.
    */
  def getFile(): File = new File.Abstract(
    gtk_directory_list_get_file(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the IO priority set via gtk_directory_list_set_io_priority().
    */
  def getIoPriority(): Int = gtk_directory_list_get_io_priority(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the directory list is monitoring the directory for
    * changes.
    */
  def getMonitored(): Boolean =
    gtk_directory_list_get_monitored(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if the children enumeration is currently in progress.
    *
    * Files will be added to @self from time to time while loading is going on.
    * The order in which are added is undefined and may change in between runs.
    */
  def isLoading(): Boolean =
    gtk_directory_list_is_loading(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the @attributes to be enumerated and starts the enumeration.
    *
    * If @attributes is %NULL, the list of file infos will still be created, it
    * will just not contain any extra attributes.
    */
  def setAttributes(attributes: String | CString)(using Zone): Unit =
    gtk_directory_list_set_attributes(
      this.raw.asInstanceOf,
      __sn_extract_string(attributes)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the @file to be enumerated and starts the enumeration.
    *
    * If @file is %NULL, the result will be an empty list.
    */
  def setFile(file: File): Unit = gtk_directory_list_set_file(
    this.raw.asInstanceOf,
    file.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the IO priority to use while loading directories.
    *
    * Setting the priority while @self is loading will reprioritize the ongoing
    * load as soon as possible.
    *
    * The default IO priority is %G_PRIORITY_DEFAULT, which is higher than the
    * GTK redraw priority. If you are loading a lot of directories in parallel,
    * lowering it to something like %G_PRIORITY_DEFAULT_IDLE may increase
    * responsiveness.
    */
  def setIoPriority(io_priority: Int): Unit =
    gtk_directory_list_set_io_priority(this.raw.asInstanceOf, io_priority)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the directory list will monitor the directory for changes.
    *
    * If monitoring is enabled, the ::items-changed signal will be emitted when
    * the directory contents change.
    *
    * When monitoring is turned on after the initial creation of the directory
    * list, the directory is reloaded to avoid missing files that appeared
    * between the initial loading and when monitoring was turned on.
    */
  def setMonitored(monitored: Boolean): Unit = gtk_directory_list_set_monitored(
    this.raw.asInstanceOf,
    gboolean(gint((if monitored == true then 1 else 0)))
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DirectoryList

object DirectoryList:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkDirectoryList`.
    *
    * The `GtkDirectoryList` is querying the given @file with the given @attributes.
    */
  def apply(attributes: String | CString, file: File)(using
      Zone
  ): DirectoryList = new DirectoryList(
    gtk_directory_list_new(
      __sn_extract_string(attributes),
      file.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DirectoryList
