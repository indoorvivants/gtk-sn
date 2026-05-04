package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gtk4.fluent.{Accessible, Buildable, ConstraintTarget, Widget}
import sn.gnome.gtk4.internal.GtkCalendar

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkCalendar` is a widget that displays a Gregorian calendar, one month at a
  * time.
  *
  * ![An example GtkCalendar](calendar.png)
  *
  * A `GtkCalendar` can be created with [ctor@Gtk.Calendar.new].
  *
  * The date that is currently displayed can be altered with
  * [method@Gtk.Calendar.select_day].
  *
  * To place a visual marker on a particular day, use
  * [method@Gtk.Calendar.mark_day] and to remove the marker,
  * [method@Gtk.Calendar.unmark_day]. Alternative, all marks can be cleared with
  * [method@Gtk.Calendar.clear_marks].
  *
  * The selected date can be retrieved from a `GtkCalendar` using
  * [method@Gtk.Calendar.get_date].
  *
  * Users should be aware that, although the Gregorian calendar is the legal
  * calendar in most countries, it was adopted progressively between 1582 and
  * 1929. Display before these dates is likely to be historically incorrect.
  *
  * # CSS nodes
  *
  * ```
  * calendar.view
  * ├── header
  * │   ├── button
  * │   ├── stack.month
  * │   ├── button
  * │   ├── button
  * │   ├── label.year
  * │   ╰── button
  * ╰── grid
  *     ╰── label[.day-name][.week-number][.day-number][.other-month][.today]
  * ```
  *
  * `GtkCalendar` has a main node with name calendar. It contains a subnode
  * called header containing the widgets for switching between years and months.
  *
  * The grid subnode contains all day labels, including week numbers on the left
  * (marked with the .week-number css class) and day names on top (marked with
  * the .day-name css class).
  *
  * Day labels that belong to the previous or next month get the .other-month
  * style class. The label of the current day get the .today style class.
  *
  * Marked day labels get the :selected state assigned.
  */
class Calendar(raw: Ptr[GtkCalendar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Remove all visual markers.
    */
  def clearMarks(): Unit /* None */ = gtk_calendar_clear_marks(
    this.raw.asInstanceOf[Ptr[GtkCalendar]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a `GDateTime` representing the shown year, month and the selected
    * day.
    *
    * The returned date is in the local time zone.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))"
  )
  def getDate__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns if the @day of the @calendar is already marked.
    */
  def getDayIsMarked(
      day: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Boolean /* None */ = gtk_calendar_get_day_is_marked(
    this.raw.asInstanceOf[Ptr[GtkCalendar]],
    guint(day)
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether @self is currently showing the names of the week days.
    *
    * This is the value of the [property@Gtk.Calendar:show-day-names] property.
    */
  def getShowDayNames(): Boolean /* None */ = gtk_calendar_get_show_day_names(
    this.raw.asInstanceOf[Ptr[GtkCalendar]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether @self is currently showing the heading.
    *
    * This is the value of the [property@Gtk.Calendar:show-heading] property.
    */
  def getShowHeading(): Boolean /* None */ = gtk_calendar_get_show_heading(
    this.raw.asInstanceOf[Ptr[GtkCalendar]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether @self is showing week numbers right now.
    *
    * This is the value of the [property@Gtk.Calendar:show-week-numbers]
    * property.
    */
  def getShowWeekNumbers(): Boolean /* None */ =
    gtk_calendar_get_show_week_numbers(
      this.raw.asInstanceOf[Ptr[GtkCalendar]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Places a visual marker on a particular day of the current month.
    */
  def markDay(
      day: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_calendar_mark_day(this.raw.asInstanceOf[Ptr[GtkCalendar]], guint(day))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Switches to @date's year and month and select its day.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))"
  )
  def selectDay__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the calendar shows day names.
    */
  def setShowDayNames(
      value: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_calendar_set_show_day_names(
    this.raw.asInstanceOf[Ptr[GtkCalendar]],
    gboolean(gint((if value == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the calendar should show a heading.
    *
    * The heading contains the current year and month as well as buttons for
    * changing both.
    */
  def setShowHeading(
      value: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_calendar_set_show_heading(
    this.raw.asInstanceOf[Ptr[GtkCalendar]],
    gboolean(gint((if value == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether week numbers are shown in the calendar.
    */
  def setShowWeekNumbers(
      value: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_calendar_set_show_week_numbers(
    this.raw.asInstanceOf[Ptr[GtkCalendar]],
    gboolean(gint((if value == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes the visual marker from a particular day.
    */
  def unmarkDay(
      day: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_calendar_unmark_day(this.raw.asInstanceOf[Ptr[GtkCalendar]], guint(day))

end Calendar

object Calendar:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new calendar, with the current date being selected.
    */
  def apply(): Calendar = new Calendar(gtk_calendar_new().asInstanceOf)
end Calendar
