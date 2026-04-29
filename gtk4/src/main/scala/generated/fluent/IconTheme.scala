package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Display
import sn.gnome.gio.fluent.Icon
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.IconPaintable
import sn.gnome.gtk4.internal.GtkIconLookupFlags
import sn.gnome.gtk4.internal.GtkIconTheme
import sn.gnome.gtk4.internal.GtkTextDirection

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkIconTheme` provides a facility for loading themed icons.
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
  */
class IconTheme(raw: Ptr[GtkIconTheme]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a resource path that will be looked at when looking for icons,
    * similar to search paths.
    *
    * See [method@Gtk.IconTheme.set_resource_path].
    *
    * This function should be used to make application-specific icons available
    * as part of the icon theme.
    */
  def addResourcePath(path: String | CString)(using Zone): Unit =
    gtk_icon_theme_add_resource_path(
      this.raw.asInstanceOf,
      __sn_extract_string(path)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends a directory to the search path.
    *
    * See [method@Gtk.IconTheme.set_search_path].
    */
  def addSearchPath(path: String | CString)(using Zone): Unit =
    gtk_icon_theme_add_search_path(
      this.raw.asInstanceOf,
      __sn_extract_string(path)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the display that the `GtkIconTheme` object was created for.
    */
  def getDisplay(): Display = new Display(
    gtk_icon_theme_get_display(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Lists the names of icons in the current icon theme.
    */
  def getIconNames()(using Zone): Array[String] = __decode_nullable_ptrs(
    gtk_icon_theme_get_icon_names(this.raw.asInstanceOf)
  ).map(fromCString(_))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns an array of integers describing the sizes at which the icon is
    * available without scaling.
    *
    * A size of -1 means that the icon is available in a scalable format. The
    * array is zero-terminated.
    */
  def getIconSizes(icon_name: String | CString)(using Zone): Ptr[Int] =
    gtk_icon_theme_get_icon_sizes(
      this.raw.asInstanceOf,
      __sn_extract_string(icon_name)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the current resource path.
    *
    * See [method@Gtk.IconTheme.set_resource_path].
    */
  def getResourcePath()(using Zone): Array[String] = __decode_nullable_ptrs(
    gtk_icon_theme_get_resource_path(this.raw.asInstanceOf)
  ).map(fromCString(_))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the current search path.
    *
    * See [method@Gtk.IconTheme.set_search_path].
    */
  def getSearchPath()(using Zone): Array[String] = __decode_nullable_ptrs(
    gtk_icon_theme_get_search_path(this.raw.asInstanceOf)
  ).map(fromCString(_))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the current icon theme name.
    *
    * Returns (transfer full): the current icon theme name,
    */
  def getThemeName()(using Zone): String = fromCString(
    gtk_icon_theme_get_theme_name(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether an icon theme includes an icon for a particular `GIcon`.
    */
  def hasGicon(gicon: Icon): Boolean = gtk_icon_theme_has_gicon(
    this.raw.asInstanceOf,
    gicon.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether an icon theme includes an icon for a particular name.
    */
  def hasIcon(icon_name: String | CString)(using Zone): Boolean =
    gtk_icon_theme_has_icon(
      this.raw.asInstanceOf,
      __sn_extract_string(icon_name)
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks up a icon for a desired size and window scale.
    *
    * The icon can then be rendered by using it as a `GdkPaintable`, or you can
    * get information such as the filename and size.
    */
  def lookupByGicon(
      icon: Icon,
      size: Int,
      scale: Int,
      direction: GtkTextDirection,
      flags: GtkIconLookupFlags
  ): IconPaintable = new IconPaintable(
    gtk_icon_theme_lookup_by_gicon(
      this.raw.asInstanceOf,
      icon.getUnsafeRawPointer().asInstanceOf,
      size,
      scale,
      direction,
      flags
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks up a named icon for a desired size and window scale, returning a
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
    */
  def lookupIcon(
      icon_name: String | CString,
      fallbacks: Ptr[CString],
      size: Int,
      scale: Int,
      direction: GtkTextDirection,
      flags: GtkIconLookupFlags
  )(using Zone): IconPaintable = new IconPaintable(
    gtk_icon_theme_lookup_icon(
      this.raw.asInstanceOf,
      __sn_extract_string(icon_name),
      fallbacks,
      size,
      scale,
      direction,
      flags
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the name of the icon theme that the `GtkIconTheme` object uses
    * overriding system configuration.
    *
    * This function cannot be called on the icon theme objects returned from
    * [func@Gtk.IconTheme.get_for_display].
    */
  def setThemeName(theme_name: String | CString)(using Zone): Unit =
    gtk_icon_theme_set_theme_name(
      this.raw.asInstanceOf,
      __sn_extract_string(theme_name)
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string

  private inline def __decode_nullable_ptrs[T](p: Ptr[Ptr[T]])(using
      ptag: Tag[T]
  ): Array[Ptr[T]] =
    val ab = Array.newBuilder[Ptr[T]]
    var offset = 0
    val tg = Tag.materializePtrTag(ptag)
    while p(offset)(using tg) != null do
      ab += p(offset)(using tg)
      offset += 1
    end while
    ab.result()
  end __decode_nullable_ptrs
end IconTheme

object IconTheme:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new icon theme object.
    *
    * Icon theme objects are used to lookup up an icon by name in a particular
    * icon theme. Usually, you’ll want to use
    * [func@Gtk.IconTheme.get_for_display] rather than creating a new icon theme
    * object for scratch.
    */
  def apply(): IconTheme = new IconTheme(gtk_icon_theme_new().asInstanceOf)
end IconTheme
