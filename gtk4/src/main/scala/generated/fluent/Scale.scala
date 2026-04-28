package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.AccessibleRange
import sn.gnome.gtk4.fluent.Adjustment
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.fluent.Range
import sn.gnome.gtk4.internal.GtkOrientation
import sn.gnome.gtk4.internal.GtkPositionType
import sn.gnome.gtk4.internal.GtkScale
import sn.gnome.gtk4.internal.GtkScaleFormatValueFunc
import sn.gnome.pango.fluent.Layout

class Scale(raw: Ptr[GtkScale])
    extends Range(raw.asInstanceOf),
      Accessible,
      AccessibleRange,
      Buildable,
      ConstraintTarget,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addMark(
      value: Double,
      position: GtkPositionType,
      markup: String | CString
  )(using Zone): Unit = gtk_scale_add_mark(
    this.raw.asInstanceOf,
    value,
    position,
    __sn_extract_string(markup)
  )

  def clearMarks(): Unit = gtk_scale_clear_marks(this.raw.asInstanceOf)

  def getDigits(): Int = gtk_scale_get_digits(this.raw.asInstanceOf)

  def getDrawValue(): Boolean =
    gtk_scale_get_draw_value(this.raw.asInstanceOf).value.!=(0)

  def getHasOrigin(): Boolean =
    gtk_scale_get_has_origin(this.raw.asInstanceOf).value.!=(0)

  def getLayout(): Layout = new Layout(
    gtk_scale_get_layout(this.raw.asInstanceOf).asInstanceOf
  )

  // Method get_layout_offsets contains an OUT parameter, which is not supported yet

  def getValuePos(): GtkPositionType = gtk_scale_get_value_pos(
    this.raw.asInstanceOf
  )

  def setDigits(digits: Int): Unit =
    gtk_scale_set_digits(this.raw.asInstanceOf, digits)

  def setDrawValue(draw_value: Boolean): Unit = gtk_scale_set_draw_value(
    this.raw.asInstanceOf,
    gboolean(gint((if draw_value == true then 1 else 0)))
  )

  def setFormatValueFunc(
      func: GtkScaleFormatValueFunc,
      user_data: Ptr[Byte],
      destroy_notify: GDestroyNotify
  ): Unit = gtk_scale_set_format_value_func(
    this.raw.asInstanceOf,
    func,
    gpointer(user_data),
    destroy_notify
  )

  def setHasOrigin(has_origin: Boolean): Unit = gtk_scale_set_has_origin(
    this.raw.asInstanceOf,
    gboolean(gint((if has_origin == true then 1 else 0)))
  )

  def setValuePos(pos: GtkPositionType): Unit =
    gtk_scale_set_value_pos(this.raw.asInstanceOf, pos)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Scale

object Scale:
  def apply(orientation: GtkOrientation, adjustment: Adjustment): Scale =
    new Scale(
      gtk_scale_new(
        orientation,
        adjustment.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  def withRange(
      orientation: GtkOrientation,
      min: Double,
      max: Double,
      step: Double
  ): Scale = new Scale(
    gtk_scale_new_with_range(orientation, min, max, step).asInstanceOf
  )
end Scale
