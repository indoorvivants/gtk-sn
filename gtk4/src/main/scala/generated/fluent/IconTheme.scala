package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.Display
import sn.gnome.gio.Icon
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{IconLookupFlags, IconPaintable, IconTheme, TextDirection}
import sn.gnome.gtk4.internal.GtkIconTheme
import sn.gnome.runtime.*

/** `GtkIconTheme` provides a facility for loading themed icons.
  *
  * The main reason for using a name rather than simply providing a filename is
  * to allow different icons to be used depending on what “icon theme” is
  * selected by the user. The operation of icon themes on Linux and Unix follows
  * the [Icon Theme
  * Specification](http://www.freedesktop.org/Standards/icon-theme-spec) There
  * is a fallback icon theme, named `hicolor`, where applications should install
  * their icons, but additional icon themes can be installed as operating system
  * vendors and users choose.
  *
  * In many cases, named themes are used indirectly, via [class@Gtk.Image]
  * rather than directly, but looking up icons directly is also simple. The
  * `GtkIconTheme` object acts as a database of all the icons in the current
  * theme. You can create new `GtkIconTheme` objects, but it’s much more
  * efficient to use the standard icon theme of the `GtkWidget` so that the icon
  * information is shared with other people looking up icons.
  *
  * ```c
  * GtkIconTheme *icon_theme;
  * GtkIconPaintable *icon;
  * GdkPaintable *paintable;
  *
  * icon_theme = gtk_icon_theme_get_for_display (gtk_widget_get_display (my_widget));
  * icon = gtk_icon_theme_lookup_icon (icon_theme,
  *                                    "my-icon-name", // icon name
  *                                    48, // icon size
  *                                    1,  // scale
  *                                    0,  // flags);
  * paintable = GDK_PAINTABLE (icon);
  * // Use the paintable
  * g_object_unref (icon);
  * ```
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class IconTheme private[gnome] (raw: Ptr[GtkIconTheme])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a resource path that will be looked at when looking for icons,
    * similar to search paths.
    *
    * See [method@Gtk.IconTheme.set_resource_path].
    *
    * This function should be used to make application-specific icons available
    * as part of the icon theme.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addResourcePath(
      path: String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_icon_theme_add_resource_path(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkIconTheme]],
      summon[Runtime].inZone(toCString(path))
    )
  end addResourcePath

  /** Appends a directory to the search path.
    *
    * See [method@Gtk.IconTheme.set_search_path].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addSearchPath(
      path: String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_icon_theme_add_search_path(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkIconTheme]],
      summon[Runtime].inZone(toCString(path))
    )
  end addSearchPath

  /** Returns the display that the `GtkIconTheme` object was created for.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDisplay()(using Runtime): sn.gnome.gdk4.Display /* None */ =
    sn.gnome.gdk4.Display.applyUnsafe(
      gtk_icon_theme_get_display(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkIconTheme]]
      ).asInstanceOf
    )
  end getDisplay

  /** Lists the names of icons in the current icon theme.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIconNames()(using Runtime): Array[String] /* None */ =
    MemoryRead
      .nullTerminatedPointerArray(
        gtk_icon_theme_get_icon_names(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkIconTheme]]
        )
      )
      .map(fromCString(_))
  end getIconNames

  /** Returns an array of integers describing the sizes at which the icon is
    * available without scaling.
    *
    * A size of -1 means that the icon is available in a scalable format. The
    * array is zero-terminated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_icon_sizes/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gint), @type -> DataRecord(int)))),ListMap(@type -> DataRecord(int*)))"
  )
  private def getIconSizes__ = ???

  /** Gets the current resource path.
    *
    * See [method@Gtk.IconTheme.set_resource_path].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getResourcePath()(using Runtime): Array[String] /* None */ =
    MemoryRead
      .nullTerminatedPointerArray(
        gtk_icon_theme_get_resource_path(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkIconTheme]]
        )
      )
      .map(fromCString(_))
  end getResourcePath

  /** Gets the current search path.
    *
    * See [method@Gtk.IconTheme.set_search_path].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSearchPath()(using Runtime): Array[String] /* None */ =
    MemoryRead
      .nullTerminatedPointerArray(
        gtk_icon_theme_get_search_path(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkIconTheme]]
        )
      )
      .map(fromCString(_))
  end getSearchPath

  /** Gets the current icon theme name.
    *
    * Returns (transfer full): the current icon theme name,
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getThemeName(): String /* None */ =
    fromCString(
      gtk_icon_theme_get_theme_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkIconTheme]]
      ).asInstanceOf
    )
  end getThemeName

  /** Checks whether an icon theme includes an icon for a particular `GIcon`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasGicon(
      gicon: Icon /* Some(Ptr[_root_.sn.gnome.gio.internal.GIcon]) */
  ): Boolean /* None */ =
    gtk_icon_theme_has_gicon(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkIconTheme]],
      gicon.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end hasGicon

  /** Checks whether an icon theme includes an icon for a particular name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasIcon(
      icon_name: String /* Some(CString) */
  )(using Runtime): Boolean /* None */ =
    gtk_icon_theme_has_icon(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkIconTheme]],
      summon[Runtime].inZone(toCString(icon_name))
    ).value.!=(0)
  end hasIcon

  /** Looks up a icon for a desired size and window scale.
    *
    * The icon can then be rendered by using it as a `GdkPaintable`, or you can
    * get information such as the filename and size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lookupByGicon(
      icon: Icon /* Some(Ptr[_root_.sn.gnome.gio.internal.GIcon]) */,
      size: Int /* Some(CInt) */,
      scale: Int /* Some(CInt) */,
      direction: TextDirection /* Some(GtkTextDirection) */,
      flags: IconLookupFlags /* Some(GtkIconLookupFlags) */
  )(using Runtime): sn.gnome.gtk4.IconPaintable /* None */ =
    sn.gnome.gtk4.IconPaintable.applyUnsafe(
      gtk_icon_theme_lookup_by_gicon(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkIconTheme]],
        icon.getUnsafeRawPointer().asInstanceOf,
        size,
        scale,
        direction.raw,
        flags.raw
      ).asInstanceOf
    )
  end lookupByGicon

  /** Looks up a named icon for a desired size and window scale, returning a
    * `GtkIconPaintable`.
    *
    * The icon can then be rendered by using it as a `GdkPaintable`, or you can
    * get information such as the filename and size.
    *
    * If the available @icon_name is not available and @fallbacks are provided,
    * they will be tried in order.
    *
    * If no matching icon is found, then a paintable that renders the "missing
    * icon" icon is returned. If you need to do something else for missing icons
    * you need to use [method@Gtk.IconTheme.has_icon].
    *
    * Note that you probably want to listen for icon theme changes and update
    * the icon. This is usually done by overriding the
    * GtkWidgetClass.css-changed() function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lookupIcon(
      icon_name: String /* Some(CString) */,
      fallbacks: Option[Array[String] /* Some(Ptr[CString]) */ ],
      size: Int /* Some(CInt) */,
      scale: Int /* Some(CInt) */,
      direction: TextDirection /* Some(GtkTextDirection) */,
      flags: IconLookupFlags /* Some(GtkIconLookupFlags) */
  )(using Runtime): sn.gnome.gtk4.IconPaintable /* None */ =
    sn.gnome.gtk4.IconPaintable.applyUnsafe(
      gtk_icon_theme_lookup_icon(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkIconTheme]],
        summon[Runtime].inZone(toCString(icon_name)),
        fallbacks
          .map[Ptr[CString]](o =>
            summon[Runtime].inZone(MemoryWrite.nullTerminatedStringArray(o))
          )
          .getOrElse(null.asInstanceOf[Ptr[CString]]),
        size,
        scale,
        direction.raw,
        flags.raw
      ).asInstanceOf
    )
  end lookupIcon

  /** Sets the resource paths that will be looked at when looking for icons,
    * similar to search paths.
    *
    * The resources are considered as part of the hicolor icon theme and must be
    * located in subdirectories that are defined in the hicolor icon theme, such
    * as `@path/16x16/actions/run.png` or `@path/scalable/actions/run.svg`.
    *
    * Icons that are directly placed in the resource path instead of a
    * subdirectory are also considered as ultimate fallback, but they are
    * treated like unthemed icons.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_resource_path/<method parameters>/path]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const char* const*)))"
  )
  private def setResourcePath__ = ???

  /** Sets the search path for the icon theme object.
    *
    * When looking for an icon theme, GTK will search for a subdirectory of one
    * or more of the directories in @path with the same name as the icon theme
    * containing an index.theme file. (Themes from multiple of the path elements
    * are combined to allow themes to be extended by adding icons in the user’s
    * home directory.)
    *
    * In addition if an icon found isn’t found either in the current icon theme
    * or the default icon theme, and an image file with the right name is found
    * directly in one of the elements of
    * @path,
    *   then that image will be used for the icon name. (This is legacy feature,
    *   and new icons should be put into the fallback icon theme, which is
    *   called hicolor, rather than directly on the icon path.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_search_path/<method parameters>/path]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(filename)))),ListMap(@type -> DataRecord(const char* const*)))"
  )
  private def setSearchPath__ = ???

  /** Sets the name of the icon theme that the `GtkIconTheme` object uses
    * overriding system configuration.
    *
    * This function cannot be called on the icon theme objects returned from
    * [func@Gtk.IconTheme.get_for_display].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setThemeName(theme_name: Option[String /* Some(CString) */ ])(using
      Runtime
  ): Unit /* None */ =
    gtk_icon_theme_set_theme_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkIconTheme]],
      theme_name
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setThemeName

  /** Emitted when the icon theme changes.
    *
    * This can happen because current icon theme is switched or because GTK
    * detects that a change has occurred in the contents of the current icon
    * theme.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onChanged(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkIconTheme],
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
end IconTheme

object IconTheme:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkIconTheme])(using Runtime) =
    summon[Runtime].getOrCreate[IconTheme](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new IconTheme(ptr)
    )

  /** Creates a new icon theme object.
    *
    * Icon theme objects are used to lookup up an icon by name in a particular
    * icon theme. Usually, you’ll want to use
    * [func@Gtk.IconTheme.get_for_display] rather than creating a new icon theme
    * object for scratch.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): IconTheme =
    val raw: Ptr[Byte] = gtk_icon_theme_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[IconTheme](raw, r => IconTheme.applyUnsafe(r.asInstanceOf))
  end apply

  /** Gets the icon theme object associated with @display.
    *
    * If this function has not previously been called for the given display, a
    * new icon theme object will be created and associated with the display.
    * Icon theme objects are fairly expensive to create, so using this function
    * is usually a better choice than calling [ctor@Gtk.IconTheme.new] and
    * setting the display yourself; by using this function a single icon theme
    * object will be shared between users.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getForDisplay(
      display: sn.gnome.gdk4.Display /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDisplay]) */
  )(using Runtime): sn.gnome.gtk4.IconTheme /* Some(Ptr[GtkIconTheme]) */ =
    sn.gnome.gtk4.IconTheme.applyUnsafe(
      gtk_icon_theme_get_for_display(
        display.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

end IconTheme
