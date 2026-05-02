package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkUriLauncher

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkUriLauncher` object collects the arguments that are needed to open a
  * uri with an application.
  *
  * Depending on system configuration, user preferences and available APIs, this
  * may or may not show an app chooser dialog or launch the default application
  * right away.
  *
  * The operation is started with the [method@Gtk.UriLauncher.launch] function.
  * This API follows the GIO async pattern, and the result can be obtained by
  * calling [method@Gtk.UriLauncher.launch_finish].
  *
  * To launch a file, use [class@Gtk.FileLauncher].
  */
class UriLauncher(raw: Ptr[GtkUriLauncher]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the uri that will be opened.
    */
  def getUri()(using Zone): String /* None */ = fromCString(
    gtk_uri_launcher_get_uri(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Launch an application to open the uri.
    *
    * This may present an app chooser dialog to the user.
    *
    * The @callback will be called when the operation is completed. It should
    * call [method@Gtk.UriLauncher.launch_finish] to obtain the result.
    */
  def launch(
      parent: Option[Window /* Some(Ptr[GtkWindow]) */ ],
      cancellable: Option[
        Cancellable /* Some(Ptr[_root_.sn.gnome.gio.internal.GCancellable]) */
      ],
      callback: Option[
        GAsyncReadyCallback /* Some(_root_.sn.gnome.gio.internal.GAsyncReadyCallback) */
      ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = gtk_uri_launcher_launch(
    this.raw.asInstanceOf,
    parent
      .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
    cancellable
      .map[Ptr[_root_.sn.gnome.gio.internal.GCancellable]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GCancellable]]
      ),
    callback
      .map[_root_.sn.gnome.gio.internal.GAsyncReadyCallback](o => o)
      .getOrElse(
        null.asInstanceOf[_root_.sn.gnome.gio.internal.GAsyncReadyCallback]
      ),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes the [method@Gtk.UriLauncher.launch] call and returns the result.
    */
  def launchFinish(
      result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    gtk_uri_launcher_launch_finish(
      this.raw.asInstanceOf,
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value.!=(0)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the uri that will be opened.
    */
  def setUri(
      uri: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_uri_launcher_set_uri(
    this.raw.asInstanceOf,
    uri
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end UriLauncher

object UriLauncher:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkUriLauncher` object.
    */
  def apply(
      uri: Option[String | CString /* Some(CString) */ ]
  )(using Zone): UriLauncher = new UriLauncher(
    gtk_uri_launcher_new(
      uri
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString])
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
end UriLauncher
