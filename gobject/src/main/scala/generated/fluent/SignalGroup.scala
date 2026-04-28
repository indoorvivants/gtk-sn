package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GCallback
import sn.gnome.gobject.internal.GClosure
import sn.gnome.gobject.internal.GClosureNotify
import sn.gnome.gobject.internal.GConnectFlags
import sn.gnome.gobject.internal.GSignalGroup
import sn.gnome.gobject.internal.GType

class SignalGroup(raw: Ptr[GSignalGroup]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def block(): Unit = g_signal_group_block(this.raw.asInstanceOf)

  def connect(
      detailed_signal: String | CString,
      c_handler: GCallback,
      data: Ptr[Byte]
  )(using Zone): Unit = g_signal_group_connect(
    this.raw.asInstanceOf,
    __sn_extract_string(detailed_signal).asInstanceOf[Ptr[gchar]],
    c_handler,
    gpointer(data)
  )

  def connectAfter(
      detailed_signal: String | CString,
      c_handler: GCallback,
      data: Ptr[Byte]
  )(using Zone): Unit = g_signal_group_connect_after(
    this.raw.asInstanceOf,
    __sn_extract_string(detailed_signal).asInstanceOf[Ptr[gchar]],
    c_handler,
    gpointer(data)
  )

  def connectClosure(
      detailed_signal: String | CString,
      closure: Ptr[GClosure],
      after: Boolean
  )(using Zone): Unit = g_signal_group_connect_closure(
    this.raw.asInstanceOf,
    __sn_extract_string(detailed_signal).asInstanceOf[Ptr[gchar]],
    closure,
    gboolean(gint((if after == true then 1 else 0)))
  )

  def connectData(
      detailed_signal: String | CString,
      c_handler: GCallback,
      data: Ptr[Byte],
      _notify: GClosureNotify,
      flags: GConnectFlags
  )(using Zone): Unit = g_signal_group_connect_data(
    this.raw.asInstanceOf,
    __sn_extract_string(detailed_signal).asInstanceOf[Ptr[gchar]],
    c_handler,
    gpointer(data),
    _notify,
    flags
  )

  def connectObject(
      detailed_signal: String | CString,
      c_handler: GCallback,
      `object`: Ptr[Byte],
      flags: GConnectFlags
  )(using Zone): Unit = g_signal_group_connect_object(
    this.raw.asInstanceOf,
    __sn_extract_string(detailed_signal).asInstanceOf[Ptr[gchar]],
    c_handler,
    gpointer(`object`),
    flags
  )

  def connectSwapped(
      detailed_signal: String | CString,
      c_handler: GCallback,
      data: Ptr[Byte]
  )(using Zone): Unit = g_signal_group_connect_swapped(
    this.raw.asInstanceOf,
    __sn_extract_string(detailed_signal).asInstanceOf[Ptr[gchar]],
    c_handler,
    gpointer(data)
  )

  def dupTarget(): Object = new Object(
    g_signal_group_dup_target(this.raw.asInstanceOf).asInstanceOf
  )

  def setTarget(target: Object): Unit = g_signal_group_set_target(
    this.raw.asInstanceOf,
    gpointer(target.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]])
  )

  def unblock(): Unit = g_signal_group_unblock(this.raw.asInstanceOf)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end SignalGroup

object SignalGroup:
  def apply(target_type: GType): SignalGroup = new SignalGroup(
    g_signal_group_new(target_type).asInstanceOf
  )
end SignalGroup
