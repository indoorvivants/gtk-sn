package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.File
import sn.gnome.glib.internal.gssize
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.StyleProvider
import sn.gnome.gtk4.internal.GtkCssProvider

/** `GtkCssProvider` is an object implementing the `GtkStyleProvider` interface
  * for CSS.
  *
  * It is able to parse CSS-like input in order to style widgets.
  *
  * An application can make GTK parse a specific CSS style sheet by calling
  * [method@Gtk.CssProvider.load_from_file] or
  * [method@Gtk.CssProvider.load_from_resource] and adding the provider with
  * [method@Gtk.StyleContext.add_provider] or
  * [func@Gtk.StyleContext.add_provider_for_display].
  *
  * In addition, certain files will be read when GTK is initialized. First, the
  * file `$XDG_CONFIG_HOME/gtk-4.0/gtk.css` is loaded if it exists. Then, GTK
  * loads the first existing file among
  * `XDG_DATA_HOME/themes/THEME/gtk-VERSION/gtk-VARIANT.css`,
  * `$HOME/.themes/THEME/gtk-VERSION/gtk-VARIANT.css`,
  * `$XDG_DATA_DIRS/themes/THEME/gtk-VERSION/gtk-VARIANT.css` and
  * `DATADIR/share/themes/THEME/gtk-VERSION/gtk-VARIANT.css`, where `THEME` is
  * the name of the current theme (see the
  * [property@Gtk.Settings:gtk-theme-name] setting), `VARIANT` is the variant to
  * load (see the [property@Gtk.Settings:gtk-application-prefer-dark-theme]
  * setting), `DATADIR` is the prefix configured when GTK was compiled (unless
  * overridden by the `GTK_DATA_PREFIX` environment variable), and `VERSION` is
  * the GTK version number. If no file is found for the current version, GTK
  * tries older versions all the way back to 4.0.
  *
  * To track errors while loading CSS, connect to the
  * [signal@Gtk.CssProvider::parsing-error] signal.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CssProvider(raw: Ptr[GtkCssProvider])
    extends Object(raw.asInstanceOf),
      StyleProvider:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Loads @data into @css_provider.
    *
    * This clears any previously loaded information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method load_from_bytes/<method parameters>/data]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def loadFromBytes__ = ???

  /** Loads @data into @css_provider.
    *
    * This clears any previously loaded information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def loadFromData(
      data: String | CString /* Some(CString) */,
      length: CLongInt /* Some(_root_.sn.gnome.glib.internal.gssize) */
  )(using Zone): Unit /* None */ = gtk_css_provider_load_from_data(
    this.raw.asInstanceOf[Ptr[GtkCssProvider]],
    __sn_extract_string(data),
    gssize(length)
  )

  /** Loads the data contained in @file into @css_provider.
    *
    * This clears any previously loaded information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def loadFromFile(
      file: File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */
  ): Unit /* None */ = gtk_css_provider_load_from_file(
    this.raw.asInstanceOf[Ptr[GtkCssProvider]],
    file.getUnsafeRawPointer().asInstanceOf
  )

  /** Loads the data contained in @path into @css_provider.
    *
    * This clears any previously loaded information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def loadFromPath(
      path: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_css_provider_load_from_path(
    this.raw.asInstanceOf[Ptr[GtkCssProvider]],
    __sn_extract_string(path)
  )

  /** Loads the data contained in the resource at @resource_path into the @css_provider.
    *
    * This clears any previously loaded information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def loadFromResource(
      resource_path: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_css_provider_load_from_resource(
    this.raw.asInstanceOf[Ptr[GtkCssProvider]],
    __sn_extract_string(resource_path)
  )

  /** Loads @string into @css_provider.
    *
    * This clears any previously loaded information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def loadFromString(
      string: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_css_provider_load_from_string(
    this.raw.asInstanceOf[Ptr[GtkCssProvider]],
    __sn_extract_string(string)
  )

  /** Loads a theme from the usual theme paths.
    *
    * The actual process of finding the theme might change between releases, but
    * it is guaranteed that this function uses the same mechanism to load the
    * theme that GTK uses for loading its own theme.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def loadNamed(
      name: String | CString /* Some(CString) */,
      variant: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_css_provider_load_named(
    this.raw.asInstanceOf[Ptr[GtkCssProvider]],
    __sn_extract_string(name),
    variant
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Converts the @provider into a string representation in CSS format.
    *
    * Using [method@Gtk.CssProvider.load_from_data] with the return value from
    * this function on a new provider created with [ctor@Gtk.CssProvider.new]
    * will basically create a duplicate of this @provider.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toString()(using Zone): String /* None */ = fromCString(
    gtk_css_provider_to_string(
      this.raw.asInstanceOf[Ptr[GtkCssProvider]]
    ).asInstanceOf
  )

  /** Signals that a parsing error occurred.
    *
    * The @path, @line and @position describe the actual location of the error
    * as accurately as possible.
    *
    * Parsing errors are never fatal, so the parsing will resume after the
    * error. Errors may however cause parts of the given data or even all of it
    * to not be parsed at all. So it is a useful idea to check that the parsing
    * succeeds by connecting to this signal.
    *
    * Note that this signal may be emitted at any time as the css provider may
    * opt to defer parsing parts or all of the input to a later time than when a
    * loading function was called.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal parsing-error]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(CssSection)))"
  )
  private def onParsingError = ???

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end CssProvider

object CssProvider:
  /** Returns a newly created `GtkCssProvider`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): CssProvider = new CssProvider(
    gtk_css_provider_new().asInstanceOf
  )
end CssProvider
