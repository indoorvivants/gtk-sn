package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.runtime.*
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
class Inscription private[gnome] (raw: Ptr[GtkInscription])
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
    "[method get_attributes/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.AttrList), @type -> DataRecord(PangoAttrList*)))"
  )
  private def getAttributes__ = ???

  /** Gets the `min-chars` of the inscription.
    *
    * See the [property@Gtk.Inscription:min-chars] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMinChars(): UInt /* None */ =
    gtk_inscription_get_min_chars(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInscription]]
    ).value
  end getMinChars

  /** Gets the `min-lines` of the inscription.
    *
    * See the [property@Gtk.Inscription:min-lines] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMinLines(): UInt /* None */ =
    gtk_inscription_get_min_lines(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInscription]]
    ).value
  end getMinLines

  /** Gets the `nat-chars` of the inscription.
    *
    * See the [property@Gtk.Inscription:nat-chars] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNatChars(): UInt /* None */ =
    gtk_inscription_get_nat_chars(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInscription]]
    ).value
  end getNatChars

  /** Gets the `nat-lines` of the inscription.
    *
    * See the [property@Gtk.Inscription:nat-lines] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNatLines(): UInt /* None */ =
    gtk_inscription_get_nat_lines(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInscription]]
    ).value
  end getNatLines

  /** Gets the text that is displayed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getText()(using Zone): String /* None */ =
    fromCString(
      gtk_inscription_get_text(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInscription]]
      ).asInstanceOf
    )
  end getText

  /** Gets the inscription's overflow method.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTextOverflow(): InscriptionOverflow /* None */ =
    InscriptionOverflow.fromRaw(
      gtk_inscription_get_text_overflow(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInscription]]
      )
    )
  end getTextOverflow

  /** Returns line wrap mode used by the inscription.
    *
    * See [method@Gtk.Inscription.set_wrap_mode].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWrapMode(): WrapMode /* None */ =
    WrapMode.fromRaw(
      gtk_inscription_get_wrap_mode(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInscription]]
      )
    )
  end getWrapMode

  /** Gets the `xalign` of the inscription.
    *
    * See the [property@Gtk.Inscription:xalign] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getXalign(): Float /* None */ =
    gtk_inscription_get_xalign(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInscription]]
    )
  end getXalign

  /** Gets the `yalign` of the inscription.
    *
    * See the [property@Gtk.Inscription:yalign] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getYalign(): Float /* None */ =
    gtk_inscription_get_yalign(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInscription]]
    )
  end getYalign

  /** Apply attributes to the inscription text.
    *
    * These attributes will not be evaluated for sizing the inscription.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_attributes/<method parameters>/attrs]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.AttrList), @type -> DataRecord(PangoAttrList*)))"
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
      markup: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* None */ =
    gtk_inscription_set_markup(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInscription]],
      markup
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setMarkup

  /** Sets the `min-chars` of the inscription.
    *
    * See the [property@Gtk.Inscription:min-chars] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMinChars(
      min_chars: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_inscription_set_min_chars(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInscription]],
      guint(min_chars)
    )
  end setMinChars

  /** Sets the `min-lines` of the inscription.
    *
    * See the [property@Gtk.Inscription:min-lines] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMinLines(
      min_lines: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_inscription_set_min_lines(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInscription]],
      guint(min_lines)
    )
  end setMinLines

  /** Sets the `nat-chars` of the inscription.
    *
    * See the [property@Gtk.Inscription:nat-chars] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setNatChars(
      nat_chars: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_inscription_set_nat_chars(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInscription]],
      guint(nat_chars)
    )
  end setNatChars

  /** Sets the `nat-lines` of the inscription.
    *
    * See the [property@Gtk.Inscription:nat-lines] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setNatLines(
      nat_lines: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_inscription_set_nat_lines(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInscription]],
      guint(nat_lines)
    )
  end setNatLines

  /** Sets the text to be displayed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setText(
      text: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* None */ =
    gtk_inscription_set_text(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInscription]],
      text.map[CString](o => toCString(o)).getOrElse(null.asInstanceOf[CString])
    )
  end setText

  /** Sets what to do when the text doesn't fit.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTextOverflow(
      overflow: InscriptionOverflow /* Some(GtkInscriptionOverflow) */
  ): Unit /* None */ =
    gtk_inscription_set_text_overflow(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInscription]],
      overflow.raw
    )
  end setTextOverflow

  /** Controls how line wrapping is done.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setWrapMode(
      wrap_mode: WrapMode /* Some(_root_.sn.gnome.pango.internal.PangoWrapMode) */
  ): Unit /* None */ =
    gtk_inscription_set_wrap_mode(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInscription]],
      wrap_mode.raw
    )
  end setWrapMode

  /** Sets the `xalign` of the inscription.
    *
    * See the [property@Gtk.Inscription:xalign] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setXalign(xalign: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_inscription_set_xalign(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInscription]],
      xalign.asInstanceOf
    )
  end setXalign

  /** Sets the `yalign` of the inscription.
    *
    * See the [property@Gtk.Inscription:yalign] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setYalign(yalign: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_inscription_set_yalign(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInscription]],
      yalign.asInstanceOf
    )
  end setYalign

end Inscription

object Inscription:
  def applyUnsafe(ptr: Ptr[GtkInscription])(using Runtime) =
    summon[Runtime].getOrCreate[Inscription](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new Inscription(ptr)
    )

  /** Creates a new `GtkInscription` with the given text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      text: Option[String /* Some(CString) */ ]
  )(using Zone, Runtime): Inscription =
    val raw: Ptr[Byte] = gtk_inscription_new(
      text.map[CString](o => toCString(o)).getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
    summon[Runtime].getOrCreate[Inscription](
      raw,
      r => Inscription.applyUnsafe(r.asInstanceOf)
    )
  end apply
end Inscription
