package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ConstraintTarget,
  InscriptionOverflow,
  Widget
}
import sn.gnome.gtk4.internal.GtkInscription
import sn.gnome.pango.fluent.WrapMode

/** `GtkInscription` is a widget to show text in a predefined area.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Inscription(raw: Ptr[GtkInscription])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the inscription's attribute list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_attributes/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.AttrList), @type -> DataRecord(PangoAttrList*)))"
  )
  private def getAttributes__ = ???

  /** Gets the `min-chars` of the inscription.
    *
    * See the [property@Gtk.Inscription:min-chars] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMinChars(): UInt /* None */ = gtk_inscription_get_min_chars(
    this.raw.asInstanceOf[Ptr[GtkInscription]]
  ).value

  /** Gets the `min-lines` of the inscription.
    *
    * See the [property@Gtk.Inscription:min-lines] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMinLines(): UInt /* None */ = gtk_inscription_get_min_lines(
    this.raw.asInstanceOf[Ptr[GtkInscription]]
  ).value

  /** Gets the `nat-chars` of the inscription.
    *
    * See the [property@Gtk.Inscription:nat-chars] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNatChars(): UInt /* None */ = gtk_inscription_get_nat_chars(
    this.raw.asInstanceOf[Ptr[GtkInscription]]
  ).value

  /** Gets the `nat-lines` of the inscription.
    *
    * See the [property@Gtk.Inscription:nat-lines] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNatLines(): UInt /* None */ = gtk_inscription_get_nat_lines(
    this.raw.asInstanceOf[Ptr[GtkInscription]]
  ).value

  /** Gets the text that is displayed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getText()(using Zone): String /* None */ = fromCString(
    gtk_inscription_get_text(
      this.raw.asInstanceOf[Ptr[GtkInscription]]
    ).asInstanceOf
  )

  /** Gets the inscription's overflow method.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTextOverflow(): InscriptionOverflow /* None */ =
    InscriptionOverflow.fromRaw(
      gtk_inscription_get_text_overflow(
        this.raw.asInstanceOf[Ptr[GtkInscription]]
      )
    )

  /** Returns line wrap mode used by the inscription.
    *
    * See [method@Gtk.Inscription.set_wrap_mode].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWrapMode(): WrapMode /* None */ = WrapMode.fromRaw(
    gtk_inscription_get_wrap_mode(this.raw.asInstanceOf[Ptr[GtkInscription]])
  )

  /** Gets the `xalign` of the inscription.
    *
    * See the [property@Gtk.Inscription:xalign] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getXalign(): Float /* None */ = gtk_inscription_get_xalign(
    this.raw.asInstanceOf[Ptr[GtkInscription]]
  )

  /** Gets the `yalign` of the inscription.
    *
    * See the [property@Gtk.Inscription:yalign] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getYalign(): Float /* None */ = gtk_inscription_get_yalign(
    this.raw.asInstanceOf[Ptr[GtkInscription]]
  )

  /** Apply attributes to the inscription text.
    *
    * These attributes will not be evaluated for sizing the inscription.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_attributes/<method parameters>/attrs]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.AttrList), @type -> DataRecord(PangoAttrList*)))"
  )
  private def setAttributes__ = ???

  /** Utility function to set the text and attributes to be displayed.
    *
    * See the [property@Gtk.Inscription:markup] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMarkup(
      markup: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_inscription_set_markup(
    this.raw.asInstanceOf[Ptr[GtkInscription]],
    markup
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets the `min-chars` of the inscription.
    *
    * See the [property@Gtk.Inscription:min-chars] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMinChars(
      min_chars: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_inscription_set_min_chars(
    this.raw.asInstanceOf[Ptr[GtkInscription]],
    guint(min_chars)
  )

  /** Sets the `min-lines` of the inscription.
    *
    * See the [property@Gtk.Inscription:min-lines] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMinLines(
      min_lines: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_inscription_set_min_lines(
    this.raw.asInstanceOf[Ptr[GtkInscription]],
    guint(min_lines)
  )

  /** Sets the `nat-chars` of the inscription.
    *
    * See the [property@Gtk.Inscription:nat-chars] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setNatChars(
      nat_chars: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_inscription_set_nat_chars(
    this.raw.asInstanceOf[Ptr[GtkInscription]],
    guint(nat_chars)
  )

  /** Sets the `nat-lines` of the inscription.
    *
    * See the [property@Gtk.Inscription:nat-lines] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setNatLines(
      nat_lines: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_inscription_set_nat_lines(
    this.raw.asInstanceOf[Ptr[GtkInscription]],
    guint(nat_lines)
  )

  /** Sets the text to be displayed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setText(
      text: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_inscription_set_text(
    this.raw.asInstanceOf[Ptr[GtkInscription]],
    text
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets what to do when the text doesn't fit.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTextOverflow(
      overflow: InscriptionOverflow /* Some(GtkInscriptionOverflow) */
  ): Unit /* None */ = gtk_inscription_set_text_overflow(
    this.raw.asInstanceOf[Ptr[GtkInscription]],
    overflow.raw
  )

  /** Controls how line wrapping is done.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setWrapMode(
      wrap_mode: WrapMode /* Some(_root_.sn.gnome.pango.internal.PangoWrapMode) */
  ): Unit /* None */ = gtk_inscription_set_wrap_mode(
    this.raw.asInstanceOf[Ptr[GtkInscription]],
    wrap_mode.raw
  )

  /** Sets the `xalign` of the inscription.
    *
    * See the [property@Gtk.Inscription:xalign] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setXalign(xalign: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_inscription_set_xalign(
      this.raw.asInstanceOf[Ptr[GtkInscription]],
      xalign.asInstanceOf
    )

  /** Sets the `yalign` of the inscription.
    *
    * See the [property@Gtk.Inscription:yalign] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setYalign(yalign: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_inscription_set_yalign(
      this.raw.asInstanceOf[Ptr[GtkInscription]],
      yalign.asInstanceOf
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

object Inscription:
  /** Creates a new `GtkInscription` with the given text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
