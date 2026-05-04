package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{File, ListModel}
import sn.gnome.glib.internal.{gboolean, gint}
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
  def getAttributes()(using Zone): String /* None */ = fromCString(
    gtk_directory_list_get_attributes(
      this.raw.asInstanceOf[Ptr[GtkDirectoryList]]
    ).asInstanceOf
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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(const GError*)))"
  )
  def getError__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the file whose children are currently enumerated.
    */
  def getFile(): File /* None */ = new File.Abstract(
    gtk_directory_list_get_file(
      this.raw.asInstanceOf[Ptr[GtkDirectoryList]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the IO priority set via gtk_directory_list_set_io_priority().
    */
  def getIoPriority(): Int /* None */ = gtk_directory_list_get_io_priority(
    this.raw.asInstanceOf[Ptr[GtkDirectoryList]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the directory list is monitoring the directory for
    * changes.
    */
  def getMonitored(): Boolean /* None */ = gtk_directory_list_get_monitored(
    this.raw.asInstanceOf[Ptr[GtkDirectoryList]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if the children enumeration is currently in progress.
    *
    * Files will be added to @self from time to time while loading is going on.
    * The order in which are added is undefined and may change in between runs.
    */
  def isLoading(): Boolean /* None */ = gtk_directory_list_is_loading(
    this.raw.asInstanceOf[Ptr[GtkDirectoryList]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the @attributes to be enumerated and starts the enumeration.
    *
    * If @attributes is %NULL, the list of file infos will still be created, it
    * will just not contain any extra attributes.
    */
  def setAttributes(
      attributes: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_directory_list_set_attributes(
    this.raw.asInstanceOf[Ptr[GtkDirectoryList]],
    attributes
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the @file to be enumerated and starts the enumeration.
    *
    * If @file is %NULL, the result will be an empty list.
    */
  def setFile(
      file: Option[File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */ ]
  ): Unit /* None */ = gtk_directory_list_set_file(
    this.raw.asInstanceOf[Ptr[GtkDirectoryList]],
    file
      .map[Ptr[_root_.sn.gnome.gio.internal.GFile]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GFile]])
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
  def setIoPriority(io_priority: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_directory_list_set_io_priority(
      this.raw.asInstanceOf[Ptr[GtkDirectoryList]],
      io_priority
    )

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
  def setMonitored(
      monitored: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_directory_list_set_monitored(
    this.raw.asInstanceOf[Ptr[GtkDirectoryList]],
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
  def apply(
      attributes: Option[String | CString /* Some(CString) */ ],
      file: Option[File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */ ]
  )(using Zone): DirectoryList = new DirectoryList(
    gtk_directory_list_new(
      attributes
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString]),
      file
        .map[Ptr[_root_.sn.gnome.gio.internal.GFile]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GFile]])
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
