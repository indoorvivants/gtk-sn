package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.GDateTime
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkCalendar

class Calendar(raw: Ptr[GtkCalendar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def clearMarks(): Unit = gtk_calendar_clear_marks(this.raw.asInstanceOf)

  def getDate(): Ptr[GDateTime] = gtk_calendar_get_date(this.raw.asInstanceOf)

  def getDayIsMarked(day: UInt): Boolean =
    gtk_calendar_get_day_is_marked(this.raw.asInstanceOf, guint(day)).value
      .!=(0)

  def getShowDayNames(): Boolean =
    gtk_calendar_get_show_day_names(this.raw.asInstanceOf).value.!=(0)

  def getShowHeading(): Boolean =
    gtk_calendar_get_show_heading(this.raw.asInstanceOf).value.!=(0)

  def getShowWeekNumbers(): Boolean =
    gtk_calendar_get_show_week_numbers(this.raw.asInstanceOf).value.!=(0)

  def markDay(day: UInt): Unit =
    gtk_calendar_mark_day(this.raw.asInstanceOf, guint(day))

  def selectDay(date: Ptr[GDateTime]): Unit =
    gtk_calendar_select_day(this.raw.asInstanceOf, date)

  def setShowDayNames(value: Boolean): Unit = gtk_calendar_set_show_day_names(
    this.raw.asInstanceOf,
    gboolean(gint((if value == true then 1 else 0)))
  )

  def setShowHeading(value: Boolean): Unit = gtk_calendar_set_show_heading(
    this.raw.asInstanceOf,
    gboolean(gint((if value == true then 1 else 0)))
  )

  def setShowWeekNumbers(value: Boolean): Unit =
    gtk_calendar_set_show_week_numbers(
      this.raw.asInstanceOf,
      gboolean(gint((if value == true then 1 else 0)))
    )

  def unmarkDay(day: UInt): Unit =
    gtk_calendar_unmark_day(this.raw.asInstanceOf, guint(day))

end Calendar

object Calendar:
  def apply(): Calendar = new Calendar(gtk_calendar_new().asInstanceOf)
end Calendar
