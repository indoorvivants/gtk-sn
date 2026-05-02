package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.pango.fluent.Context
import sn.gnome.pango.fluent.Font
import sn.gnome.pango.fluent.FontFamily
import sn.gnome.pango.fluent.Fontset
import sn.gnome.pango.internal.PangoFontDescription
import sn.gnome.pango.internal.PangoFontMap
import sn.gnome.pango.internal.PangoLanguage

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `PangoFontMap` represents the set of fonts available for a particular
  * rendering system.
  *
  * This is a virtual object with implementations being specific to particular
  * rendering systems.
  */
class FontMap(raw: Ptr[PangoFontMap])
    extends Object(raw.asInstanceOf),
      ListModel:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Forces a change in the context, which will cause any `PangoContext` using
    * this fontmap to change.
    *
    * This function is only useful when implementing a new backend for Pango,
    * something applications won't do. Backends should call this function if
    * they have attached extra data to the context and such data is changed.
    */
  def changed(): Unit /* None */ = pango_font_map_changed(
    this.raw.asInstanceOf[Ptr[PangoFontMap]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `PangoContext` connected to @fontmap.
    *
    * This is equivalent to [ctor@Pango.Context.new] followed by
    * [method@Pango.Context.set_font_map].
    *
    * If you are using Pango as part of a higher-level system, that system may
    * have it's own way of create a `PangoContext`. For instance, the GTK
    * toolkit has, among others, gtk_widget_get_pango_context(). Use those
    * instead.
    */
  def createContext(): Context /* None */ = new Context(
    pango_font_map_create_context(
      this.raw.asInstanceOf[Ptr[PangoFontMap]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a font family by name.
    */
  def getFamily(
      name: String | CString /* Some(CString) */
  )(using Zone): FontFamily /* None */ = new FontFamily(
    pango_font_map_get_family(
      this.raw.asInstanceOf[Ptr[PangoFontMap]],
      __sn_extract_string(name)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the current serial number of @fontmap.
    *
    * The serial number is initialized to an small number larger than zero when
    * a new fontmap is created and is increased whenever the fontmap is changed.
    * It may wrap, but will never have the value 0. Since it can wrap, never
    * compare it with "less than", always use "not equals".
    *
    * The fontmap can only be changed using backend-specific API, like changing
    * fontmap resolution.
    *
    * This can be used to automatically detect changes to a `PangoFontMap`, like
    * in `PangoContext`.
    */
  def getSerial(): UInt /* None */ = pango_font_map_get_serial(
    this.raw.asInstanceOf[Ptr[PangoFontMap]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * List all families for a fontmap.
    *
    * Note that the returned families are not in any particular order.
    *
    * `PangoFontMap` also implemented the [iface@Gio.ListModel] interface for
    * enumerating families.
    */
  @annotation.compileTimeOnly(
    "Method list_families contains an OUT parameter, which is not supported yet"
  )
  private def listFamilies__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Load the font in the fontmap that is the closest match for @desc.
    */
  def loadFont(
      context: Context /* Some(Ptr[PangoContext]) */,
      desc: Ptr[PangoFontDescription] /* Some(Ptr[PangoFontDescription]) */
  ): Font /* None */ = new Font(
    pango_font_map_load_font(
      this.raw.asInstanceOf[Ptr[PangoFontMap]],
      context.getUnsafeRawPointer().asInstanceOf,
      desc
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Load a set of fonts in the fontmap that can be used to render a font
    * matching @desc.
    */
  def loadFontset(
      context: Context /* Some(Ptr[PangoContext]) */,
      desc: Ptr[PangoFontDescription] /* Some(Ptr[PangoFontDescription]) */,
      language: Ptr[PangoLanguage] /* Some(Ptr[PangoLanguage]) */
  ): Fontset /* None */ = new Fontset(
    pango_font_map_load_fontset(
      this.raw.asInstanceOf[Ptr[PangoFontMap]],
      context.getUnsafeRawPointer().asInstanceOf,
      desc,
      language
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
end FontMap
