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

class Inscription(raw: Ptr[GtkInscription])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAttributes(): Ptr[PangoAttrList] = gtk_inscription_get_attributes(
    this.raw.asInstanceOf
  )

  def getMinChars(): UInt = gtk_inscription_get_min_chars(
    this.raw.asInstanceOf
  ).value

  def getMinLines(): UInt = gtk_inscription_get_min_lines(
    this.raw.asInstanceOf
  ).value

  def getNatChars(): UInt = gtk_inscription_get_nat_chars(
    this.raw.asInstanceOf
  ).value

  def getNatLines(): UInt = gtk_inscription_get_nat_lines(
    this.raw.asInstanceOf
  ).value

  def getText()(using Zone): String = fromCString(
    gtk_inscription_get_text(this.raw.asInstanceOf).asInstanceOf
  )

  def getTextOverflow(): GtkInscriptionOverflow =
    gtk_inscription_get_text_overflow(this.raw.asInstanceOf)

  def getWrapMode(): PangoWrapMode = gtk_inscription_get_wrap_mode(
    this.raw.asInstanceOf
  )

  def getXalign(): Float = gtk_inscription_get_xalign(this.raw.asInstanceOf)

  def getYalign(): Float = gtk_inscription_get_yalign(this.raw.asInstanceOf)

  def setAttributes(attrs: Ptr[PangoAttrList]): Unit =
    gtk_inscription_set_attributes(this.raw.asInstanceOf, attrs)

  def setMarkup(markup: String | CString)(using Zone): Unit =
    gtk_inscription_set_markup(
      this.raw.asInstanceOf,
      __sn_extract_string(markup)
    )

  def setMinChars(min_chars: UInt): Unit =
    gtk_inscription_set_min_chars(this.raw.asInstanceOf, guint(min_chars))

  def setMinLines(min_lines: UInt): Unit =
    gtk_inscription_set_min_lines(this.raw.asInstanceOf, guint(min_lines))

  def setNatChars(nat_chars: UInt): Unit =
    gtk_inscription_set_nat_chars(this.raw.asInstanceOf, guint(nat_chars))

  def setNatLines(nat_lines: UInt): Unit =
    gtk_inscription_set_nat_lines(this.raw.asInstanceOf, guint(nat_lines))

  def setText(text: String | CString)(using Zone): Unit =
    gtk_inscription_set_text(this.raw.asInstanceOf, __sn_extract_string(text))

  def setTextOverflow(overflow: GtkInscriptionOverflow): Unit =
    gtk_inscription_set_text_overflow(this.raw.asInstanceOf, overflow)

  def setWrapMode(wrap_mode: PangoWrapMode): Unit =
    gtk_inscription_set_wrap_mode(this.raw.asInstanceOf, wrap_mode)

  def setXalign(xalign: Float): Unit =
    gtk_inscription_set_xalign(this.raw.asInstanceOf, xalign.asInstanceOf)

  def setYalign(yalign: Float): Unit =
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
  def apply(text: String | CString)(using Zone): Inscription = new Inscription(
    gtk_inscription_new(__sn_extract_string(text)).asInstanceOf
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
