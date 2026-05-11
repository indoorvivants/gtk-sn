package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.{Display, DisplayManager}
import sn.gnome.gdk4.internal.{GdkDisplay, GdkDisplayManager}
import sn.gnome.glib.internal.{gchar, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** A singleton object that offers notification when displays appear or
  * disappear.
  *
  * You can use [func@Gdk.DisplayManager.get] to obtain the `GdkDisplayManager`
  * singleton, but that should be rarely necessary. Typically, initializing GTK
  * opens a display that you can work with without ever accessing the
  * `GdkDisplayManager`.
  *
  * The GDK library can be built with support for multiple backends. The
  * `GdkDisplayManager` object determines which backend is used at runtime.
  *
  * In the rare case that you need to influence which of the backends is being
  * used, you can use [func@Gdk.set_allowed_backends]. Note that you need to
  * call this function before initializing GTK.
  *
  * ## Backend-specific code
  *
  * When writing backend-specific code that is supposed to work with multiple
  * GDK backends, you have to consider both compile time and runtime. At compile
  * time, use the `GDK_WINDOWING_X11`, `GDK_WINDOWING_WIN32` macros, etc. to
  * find out which backends are present in the GDK library you are building your
  * application against. At runtime, use type-check macros like
  * GDK_IS_X11_DISPLAY() to find out which backend is in use:
  *
  * ```c
  * #ifdef GDK_WINDOWING_X11
  *   if (GDK_IS_X11_DISPLAY (display))
  *     {
  *       // make X11-specific calls here
  *     }
  *   else
  * #endif
  * #ifdef GDK_WINDOWING_MACOS
  *   if (GDK_IS_MACOS_DISPLAY (display))
  *     {
  *       // make Quartz-specific calls here
  *     }
  *   else
  * #endif
  *   g_error ("Unsupported GDK backend");
  * ```
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DisplayManager private[gnome] (raw: Ptr[GdkDisplayManager])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the default `GdkDisplay`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefaultDisplay()(using
      Runtime
  ): sn.gnome.gdk4.fluent.Display /* None */ =
    sn.gnome.gdk4.fluent.Display.applyUnsafe(
      gdk_display_manager_get_default_display(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplayManager]]
      ).asInstanceOf
    )
  end getDefaultDisplay

  /** List all currently open displays.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method list_displays/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Display))))),ListMap(@name -> DataRecord(GLib.SList), @type -> DataRecord(GSList*)))"
  )
  private def listDisplays__ = ???

  /** Opens a display.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def openDisplay(
      name: Option[String /* Some(CString) */ ]
  )(using Zone, Runtime): sn.gnome.gdk4.fluent.Display /* None */ =
    sn.gnome.gdk4.fluent.Display.applyUnsafe(
      gdk_display_manager_open_display(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplayManager]],
        name
          .map[CString](o => toCString(o))
          .getOrElse(null.asInstanceOf[CString])
      ).asInstanceOf
    )
  end openDisplay

  /** Sets @display as the default display.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDefaultDisplay(
      display: sn.gnome.gdk4.fluent.Display /* Some(Ptr[GdkDisplay]) */
  )(using Runtime): Unit /* None */ =
    gdk_display_manager_set_default_display(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplayManager]],
      display.getUnsafeRawPointer().asInstanceOf
    )
  end setDefaultDisplay

  /** Emitted when a display is opened.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onDisplayOpened(handler: ((display: Display)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (display: Display), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GdkDisplayManager],
          display: Ptr[GdkDisplay] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (display = sr.runtime.get[Display](display.asInstanceOf[Ptr[Byte]]))
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"display-opened"
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
  end onDisplayOpened
end DisplayManager

object DisplayManager:
  def applyUnsafe(ptr: Ptr[GdkDisplayManager])(using Runtime) =
    summon[Runtime].getOrCreate[DisplayManager](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new DisplayManager(ptr)
    )

  /** Gets the singleton `GdkDisplayManager` object.
    *
    * When called for the first time, this function consults the `GDK_BACKEND`
    * environment variable to find out which of the supported GDK backends to
    * use (in case GDK has been compiled with multiple backends).
    *
    * Applications can use [func@set_allowed_backends] to limit what backends
    * will be used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def get()(using
      Runtime
  ): sn.gnome.gdk4.fluent.DisplayManager /* Some(Ptr[GdkDisplayManager]) */ =
    sn.gnome.gdk4.fluent.DisplayManager
      .applyUnsafe(gdk_display_manager_get().asInstanceOf)

end DisplayManager
