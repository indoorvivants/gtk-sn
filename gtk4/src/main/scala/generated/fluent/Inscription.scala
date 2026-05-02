package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkInscription
import sn.gnome.gtk4.internal.GtkInscriptionOverflow
import sn.gnome.pango.internal.PangoAttrList
import sn.gnome.pango.internal.PangoWrapMode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkInscription` is a widget to show text in a predefined area.
  *
  * You likely want to use `GtkLabel` instead as this widget is intended only
  * for a small subset of use cases. The main scenario envisaged is inside lists
  * such as `GtkColumnView`.
  *
  * While a `GtkLabel` sizes itself depending on the text that is displayed,
  * `GtkInscription` is given a size and inscribes the given text into that
  * space as well as it can.
  *
  * Users of this widget should take care to plan behaviour for the common case
  * where the text doesn't fit exactly in the allocated space.
  */
class Inscription(raw: Ptr[GtkInscription])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the inscription's attribute list.
    */
  def getAttributes(): Ptr[PangoAttrList] /* None */ =
    gtk_inscription_get_attributes(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `min-chars` of the inscription.
    *
    * See the [property@Gtk.Inscription:min-chars] property.
    */
  def getMinChars(): UInt /* None */ = gtk_inscription_get_min_chars(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `min-lines` of the inscription.
    *
    * See the [property@Gtk.Inscription:min-lines] property.
    */
  def getMinLines(): UInt /* None */ = gtk_inscription_get_min_lines(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `nat-chars` of the inscription.
    *
    * See the [property@Gtk.Inscription:nat-chars] property.
    */
  def getNatChars(): UInt /* None */ = gtk_inscription_get_nat_chars(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `nat-lines` of the inscription.
    *
    * See the [property@Gtk.Inscription:nat-lines] property.
    */
  def getNatLines(): UInt /* None */ = gtk_inscription_get_nat_lines(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the text that is displayed.
    */
  def getText()(using Zone): String /* None */ = fromCString(
    gtk_inscription_get_text(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the inscription's overflow method.
    */
  def getTextOverflow(): GtkInscriptionOverflow /* None */ =
    gtk_inscription_get_text_overflow(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns line wrap mode used by the inscription.
    *
    * See [method@Gtk.Inscription.set_wrap_mode].
    */
  def getWrapMode(): PangoWrapMode /* None */ = gtk_inscription_get_wrap_mode(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `xalign` of the inscription.
    *
    * See the [property@Gtk.Inscription:xalign] property.
    */
  def getXalign(): Float /* None */ = gtk_inscription_get_xalign(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `yalign` of the inscription.
    *
    * See the [property@Gtk.Inscription:yalign] property.
    */
  def getYalign(): Float /* None */ = gtk_inscription_get_yalign(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Apply attributes to the inscription text.
    *
    * These attributes will not be evaluated for sizing the inscription.
    */
  def setAttributes(
      attrs: Option[Ptr[
        PangoAttrList
      ] /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoAttrList]) */ ]
  ): Unit /* None */ = gtk_inscription_set_attributes(
    this.raw.asInstanceOf,
    attrs
      .map[Ptr[_root_.sn.gnome.pango.internal.PangoAttrList]](o => o)
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.pango.internal.PangoAttrList]]
      )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Utility function to set the text and attributes to be displayed.
    *
    * See the [property@Gtk.Inscription:markup] property.
    */
  def setMarkup(
      markup: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_inscription_set_markup(
    this.raw.asInstanceOf,
    markup
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `min-chars` of the inscription.
    *
    * See the [property@Gtk.Inscription:min-chars] property.
    */
  def setMinChars(
      min_chars: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_inscription_set_min_chars(this.raw.asInstanceOf, guint(min_chars))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `min-lines` of the inscription.
    *
    * See the [property@Gtk.Inscription:min-lines] property.
    */
  def setMinLines(
      min_lines: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_inscription_set_min_lines(this.raw.asInstanceOf, guint(min_lines))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `nat-chars` of the inscription.
    *
    * See the [property@Gtk.Inscription:nat-chars] property.
    */
  def setNatChars(
      nat_chars: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_inscription_set_nat_chars(this.raw.asInstanceOf, guint(nat_chars))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `nat-lines` of the inscription.
    *
    * See the [property@Gtk.Inscription:nat-lines] property.
    */
  def setNatLines(
      nat_lines: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_inscription_set_nat_lines(this.raw.asInstanceOf, guint(nat_lines))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the text to be displayed.
    */
  def setText(
      text: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_inscription_set_text(
    this.raw.asInstanceOf,
    text
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets what to do when the text doesn't fit.
    */
  def setTextOverflow(
      overflow: GtkInscriptionOverflow /* Some(GtkInscriptionOverflow) */
  ): Unit /* None */ =
    gtk_inscription_set_text_overflow(this.raw.asInstanceOf, overflow)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Controls how line wrapping is done.
    */
  def setWrapMode(
      wrap_mode: PangoWrapMode /* Some(_root_.sn.gnome.pango.internal.PangoWrapMode) */
  ): Unit /* None */ =
    gtk_inscription_set_wrap_mode(this.raw.asInstanceOf, wrap_mode)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `xalign` of the inscription.
    *
    * See the [property@Gtk.Inscription:xalign] property.
    */
  def setXalign(xalign: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_inscription_set_xalign(this.raw.asInstanceOf, xalign.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `yalign` of the inscription.
    *
    * See the [property@Gtk.Inscription:yalign] property.
    */
  def setYalign(yalign: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_inscription_set_yalign(this.raw.asInstanceOf, yalign.asInstanceOf)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Inscription

object Inscription:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkInscription` with the given text.
    */
  def apply(
      text: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Inscription = new Inscription(
    gtk_inscription_new(
      text
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
end Inscription
