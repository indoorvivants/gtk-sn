package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.AccessibleRange
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkProgressBar
import sn.gnome.pango.internal.PangoEllipsizeMode

class ProgressBar(raw: Ptr[GtkProgressBar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      AccessibleRange,
      Buildable,
      ConstraintTarget,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getEllipsize(): PangoEllipsizeMode = gtk_progress_bar_get_ellipsize(
    this.raw.asInstanceOf
  )

  def getFraction(): Double = gtk_progress_bar_get_fraction(
    this.raw.asInstanceOf
  )

  def getInverted(): Boolean =
    gtk_progress_bar_get_inverted(this.raw.asInstanceOf).value.!=(0)

  def getPulseStep(): Double = gtk_progress_bar_get_pulse_step(
    this.raw.asInstanceOf
  )

  def getShowText(): Boolean =
    gtk_progress_bar_get_show_text(this.raw.asInstanceOf).value.!=(0)

  def getText()(using Zone): String = fromCString(
    gtk_progress_bar_get_text(this.raw.asInstanceOf).asInstanceOf
  )

  def pulse(): Unit = gtk_progress_bar_pulse(this.raw.asInstanceOf)

  def setEllipsize(mode: PangoEllipsizeMode): Unit =
    gtk_progress_bar_set_ellipsize(this.raw.asInstanceOf, mode)

  def setFraction(fraction: Double): Unit =
    gtk_progress_bar_set_fraction(this.raw.asInstanceOf, fraction)

  def setInverted(inverted: Boolean): Unit = gtk_progress_bar_set_inverted(
    this.raw.asInstanceOf,
    gboolean(gint((if inverted == true then 1 else 0)))
  )

  def setPulseStep(fraction: Double): Unit =
    gtk_progress_bar_set_pulse_step(this.raw.asInstanceOf, fraction)

  def setShowText(show_text: Boolean): Unit = gtk_progress_bar_set_show_text(
    this.raw.asInstanceOf,
    gboolean(gint((if show_text == true then 1 else 0)))
  )

  def setText(text: String | CString)(using Zone): Unit =
    gtk_progress_bar_set_text(this.raw.asInstanceOf, __sn_extract_string(text))

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ProgressBar

object ProgressBar:
  def apply(): ProgressBar = new ProgressBar(
    gtk_progress_bar_new().asInstanceOf
  )
end ProgressBar
