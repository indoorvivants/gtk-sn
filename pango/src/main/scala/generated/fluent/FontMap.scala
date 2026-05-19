package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.ListModel
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.pango.{Context, FontFamily}
import sn.gnome.pango.internal.PangoFontMap

/** A `PangoFontMap` represents the set of fonts available for a particular
  * rendering system.
  *
  * This is a virtual object with implementations being specific to particular
  * rendering systems.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FontMap private[gnome] (raw: Ptr[PangoFontMap])
    extends Object(raw.asInstanceOf),
      ListModel:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Forces a change in the context, which will cause any `PangoContext` using
    * this fontmap to change.
    *
    * This function is only useful when implementing a new backend for Pango,
    * something applications won't do. Backends should call this function if
    * they have attached extra data to the context and such data is changed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def changed(): Unit /* None */ =
    pango_font_map_changed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontMap]]
    )
  end changed

  /** Creates a `PangoContext` connected to @fontmap.
    *
    * This is equivalent to [ctor@Pango.Context.new] followed by
    * [method@Pango.Context.set_font_map].
    *
    * If you are using Pango as part of a higher-level system, that system may
    * have it's own way of create a `PangoContext`. For instance, the GTK
    * toolkit has, among others, gtk_widget_get_pango_context(). Use those
    * instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def createContext()(using Runtime): sn.gnome.pango.Context /* None */ =
    sn.gnome.pango.Context.applyUnsafe(
      pango_font_map_create_context(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontMap]]
      ).asInstanceOf
    )
  end createContext

  /** Gets a font family by name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFamily(
      name: String /* Some(CString) */
  )(using Runtime): sn.gnome.pango.FontFamily /* None */ =
    sn.gnome.pango.FontFamily.applyUnsafe(
      pango_font_map_get_family(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontMap]],
        summon[Runtime].inZone(toCString(name))
      ).asInstanceOf
    )
  end getFamily

  /** Returns the current serial number of @fontmap.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSerial(): UInt /* None */ =
    pango_font_map_get_serial(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontMap]]
    ).value
  end getSerial

  /** List all families for a fontmap.
    *
    * Note that the returned families are not in any particular order.
    *
    * `PangoFontMap` also implemented the [iface@Gio.ListModel] interface for
    * enumerating families.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method list_families]: Method list_families contains an OUT parameter, which is not supported yet"
  )
  private def listFamilies__ = ???

  /** Load the font in the fontmap that is the closest match for @desc.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method load_font/<method parameters>/desc]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(const PangoFontDescription*)))"
  )
  private def loadFont__ = ???

  /** Load a set of fonts in the fontmap that can be used to render a font
    * matching @desc.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method load_fontset/<method parameters>/desc]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(const PangoFontDescription*)))"
  )
  private def loadFontset__ = ???

end FontMap

object FontMap:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[PangoFontMap])(using Runtime) = summon[Runtime]
    .getOrCreate[FontMap](ptr.asInstanceOf[Ptr[Byte]], p => new FontMap(ptr))

end FontMap
