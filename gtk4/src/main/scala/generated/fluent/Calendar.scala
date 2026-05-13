package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer, guint}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{Accessible, Buildable, ConstraintTarget, Widget}
import sn.gnome.gtk4.internal.GtkCalendar
import sn.gnome.runtime.*

/** `GtkCalendar` is a widget that displays a Gregorian calendar, one month at a
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Calendar private[gnome] (raw: Ptr[GtkCalendar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Remove all visual markers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clearMarks(): Unit /* None */ =
    gtk_calendar_clear_marks(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCalendar]]
    )
  end clearMarks

  /** Returns a `GDateTime` representing the shown year, month and the selected
    * day.
    *
    * The returned date is in the local time zone.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_date/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))"
  )
  private def getDate__ = ???

  /** Returns if the @day of the @calendar is already marked.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDayIsMarked(
      day: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Boolean /* None */ =
    gtk_calendar_get_day_is_marked(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCalendar]],
      guint(day)
    ).value.!=(0)
  end getDayIsMarked

  /** Returns whether @self is currently showing the names of the week days.
    *
    * This is the value of the [property@Gtk.Calendar:show-day-names] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShowDayNames(): Boolean /* None */ =
    gtk_calendar_get_show_day_names(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCalendar]]
    ).value.!=(0)
  end getShowDayNames

  /** Returns whether @self is currently showing the heading.
    *
    * This is the value of the [property@Gtk.Calendar:show-heading] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShowHeading(): Boolean /* None */ =
    gtk_calendar_get_show_heading(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCalendar]]
    ).value.!=(0)
  end getShowHeading

  /** Returns whether @self is showing week numbers right now.
    *
    * This is the value of the [property@Gtk.Calendar:show-week-numbers]
    * property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShowWeekNumbers(): Boolean /* None */ =
    gtk_calendar_get_show_week_numbers(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCalendar]]
    ).value.!=(0)
  end getShowWeekNumbers

  /** Places a visual marker on a particular day of the current month.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def markDay(
      day: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_calendar_mark_day(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCalendar]],
      guint(day)
    )
  end markDay

  /** Switches to @date's year and month and select its day.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method select_day/<method parameters>/date]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))"
  )
  private def selectDay__ = ???

  /** Sets whether the calendar shows day names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowDayNames(
      value: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_calendar_set_show_day_names(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCalendar]],
      gboolean(gint((if value == true then 1 else 0)))
    )
  end setShowDayNames

  /** Sets whether the calendar should show a heading.
    *
    * The heading contains the current year and month as well as buttons for
    * changing both.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowHeading(
      value: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_calendar_set_show_heading(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCalendar]],
      gboolean(gint((if value == true then 1 else 0)))
    )
  end setShowHeading

  /** Sets whether week numbers are shown in the calendar.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowWeekNumbers(
      value: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_calendar_set_show_week_numbers(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCalendar]],
      gboolean(gint((if value == true then 1 else 0)))
    )
  end setShowWeekNumbers

  /** Removes the visual marker from a particular day.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unmarkDay(
      day: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_calendar_unmark_day(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCalendar]],
      guint(day)
    )
  end unmarkDay

  /** Emitted when the user selects a day.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onDaySelected(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkCalendar],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"day-selected"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onDaySelected

  /** Emitted when the user switched to the next month.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onNextMonth(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkCalendar],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"next-month"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onNextMonth

  /** Emitted when user switched to the next year.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onNextYear(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkCalendar],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"next-year"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onNextYear

  /** Emitted when the user switched to the previous month.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onPrevMonth(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkCalendar],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"prev-month"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onPrevMonth

  /** Emitted when user switched to the previous year.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onPrevYear(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkCalendar],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"prev-year"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onPrevYear
end Calendar

object Calendar:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkCalendar])(using Runtime) = summon[Runtime]
    .getOrCreate[Calendar](ptr.asInstanceOf[Ptr[Byte]], p => new Calendar(ptr))

  /** Creates a new calendar, with the current date being selected.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): Calendar =
    val raw: Ptr[Byte] = gtk_calendar_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[Calendar](raw, r => Calendar.applyUnsafe(r.asInstanceOf))
  end apply
end Calendar
