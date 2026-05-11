package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.internal.GtkUriLauncher

/** A `GtkUriLauncher` object collects the arguments that are needed to open a
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class UriLauncher private[gnome] (raw: Ptr[GtkUriLauncher])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the uri that will be opened.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUri()(using Zone): String /* None */ =
    fromCString(
      gtk_uri_launcher_get_uri(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkUriLauncher]]
      ).asInstanceOf
    )
  end getUri

  /** Launch an application to open the uri.
    *
    * This may present an app chooser dialog to the user.
    *
    * The @callback will be called when the operation is completed. It should
    * call [method@Gtk.UriLauncher.launch_finish] to obtain the result.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method launch/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def launch__ = ???

  /** Finishes the [method@Gtk.UriLauncher.launch] call and returns the result.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def launchFinish(
      result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      gtk_uri_launcher_launch_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkUriLauncher]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end launchFinish

  /** Sets the uri that will be opened.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUri(
      uri: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* None */ =
    gtk_uri_launcher_set_uri(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkUriLauncher]],
      uri.map[CString](o => toCString(o)).getOrElse(null.asInstanceOf[CString])
    )
  end setUri

end UriLauncher

object UriLauncher:
  def applyUnsafe(ptr: Ptr[GtkUriLauncher])(using Runtime) =
    summon[Runtime].getOrCreate[UriLauncher](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new UriLauncher(ptr)
    )

  /** Creates a new `GtkUriLauncher` object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      uri: Option[String /* Some(CString) */ ]
  )(using Zone, Runtime): UriLauncher =
    val raw: Ptr[Byte] = gtk_uri_launcher_new(
      uri.map[CString](o => toCString(o)).getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
    summon[Runtime].getOrCreate[UriLauncher](
      raw,
      r => UriLauncher.applyUnsafe(r.asInstanceOf)
    )
  end apply
end UriLauncher
