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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GSignalGroup manages to simplify the process of connecting many signals to
  * a #GObject as a group. As such there is no API to disconnect a signal from
  * the group.
  *
  * In particular, this allows you to:
  *
  *   - Change the target instance, which automatically causes disconnection of
  *     the signals from the old instance and connecting to the new instance.
  *   - Block and unblock signals as a group
  *   - Ensuring that blocked state transfers across target instances.
  *
  * One place you might want to use such a structure is with #GtkTextView and
  * #GtkTextBuffer. Often times, you'll need to connect to many signals on
  * #GtkTextBuffer from a #GtkTextView subclass. This allows you to create a
  * signal group during instance construction, simply bind the
  * #GtkTextView:buffer property to #GSignalGroup:target and connect all the
  * signals you need. When the #GtkTextView:buffer property changes all of the
  * signals will be transitioned correctly.
  */
class SignalGroup(raw: Ptr[GSignalGroup]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Blocks all signal handlers managed by @self so they will not be called
    * during any signal emissions. Must be unblocked exactly the same number of
    * times it has been blocked to become active again.
    *
    * This blocked state will be kept across changes of the target instance.
    */
  def block(): Unit = g_signal_group_block(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Connects @c_handler to the signal @detailed_signal on the target instance
    * of @self.
    *
    * You cannot connect a signal handler after #GSignalGroup:target has been
    * set.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Connects @c_handler to the signal @detailed_signal on the target instance
    * of @self.
    *
    * The @c_handler will be called after the default handler of the signal.
    *
    * You cannot connect a signal handler after #GSignalGroup:target has been
    * set.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Connects @closure to the signal @detailed_signal on #GSignalGroup:target.
    *
    * You cannot connect a signal handler after #GSignalGroup:target has been
    * set.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Connects @c_handler to the signal @detailed_signal on the target instance
    * of @self.
    *
    * You cannot connect a signal handler after #GSignalGroup:target has been
    * set.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Connects @c_handler to the signal @detailed_signal on
    * #GSignalGroup:target.
    *
    * Ensures that the @object stays alive during the call to @c_handler by
    * temporarily adding a reference count. When the @object is destroyed the
    * signal handler will automatically be removed.
    *
    * You cannot connect a signal handler after #GSignalGroup:target has been
    * set.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Connects @c_handler to the signal @detailed_signal on the target instance
    * of @self.
    *
    * The instance on which the signal is emitted and @data will be swapped when
    * calling @c_handler.
    *
    * You cannot connect a signal handler after #GSignalGroup:target has been
    * set.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the target instance used when connecting signals.
    */
  def dupTarget(): Object = new Object(
    g_signal_group_dup_target(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the target instance used when connecting signals. Any signal that has
    * been registered with g_signal_group_connect_object() or similar functions
    * will be connected to this object.
    *
    * If the target instance was previously set, signals will be disconnected
    * from that object prior to connecting to @target.
    */
  def setTarget(target: Object): Unit = g_signal_group_set_target(
    this.raw.asInstanceOf,
    gpointer(target.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unblocks all signal handlers managed by @self so they will be called again
    * during any signal emissions unless it is blocked again. Must be unblocked
    * exactly the same number of times it has been blocked to become active
    * again.
    */
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GSignalGroup for target instances of @target_type.
    */
  def apply(target_type: GType): SignalGroup = new SignalGroup(
    g_signal_group_new(target_type).asInstanceOf
  )
end SignalGroup
