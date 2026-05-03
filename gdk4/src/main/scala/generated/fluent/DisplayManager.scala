package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Display
import sn.gnome.gdk4.fluent.DisplayManager
import sn.gnome.gdk4.internal.GdkDisplayManager
import sn.gnome.glib.internal.GSList
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A singleton object that offers notification when displays appear or
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
  */
class DisplayManager(raw: Ptr[GdkDisplayManager])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the default `GdkDisplay`.
    */
  def getDefaultDisplay(): Display /* None */ = new Display(
    gdk_display_manager_get_default_display(
      this.raw.asInstanceOf[Ptr[GdkDisplayManager]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * List all currently open displays.
    */
  def listDisplays(): Ptr[GSList] /* None */ =
    gdk_display_manager_list_displays(
      this.raw.asInstanceOf[Ptr[GdkDisplayManager]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Opens a display.
    */
  def openDisplay(
      name: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Display /* None */ = new Display(
    gdk_display_manager_open_display(
      this.raw.asInstanceOf[Ptr[GdkDisplayManager]],
      name
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @display as the default display.
    */
  def setDefaultDisplay(
      display: Display /* Some(Ptr[GdkDisplay]) */
  ): Unit /* None */ = gdk_display_manager_set_default_display(
    this.raw.asInstanceOf[Ptr[GdkDisplayManager]],
    display.getUnsafeRawPointer().asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DisplayManager

object DisplayManager:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the singleton `GdkDisplayManager` object.
    *
    * When called for the first time, this function consults the `GDK_BACKEND`
    * environment variable to find out which of the supported GDK backends to
    * use (in case GDK has been compiled with multiple backends).
    *
    * Applications can use [func@set_allowed_backends] to limit what backends
    * will be used.
    */
  def get(): DisplayManager /* None */ = new DisplayManager(
    gdk_display_manager_get().asInstanceOf
  )

end DisplayManager
