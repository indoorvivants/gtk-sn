package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gchar, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  GObject,
  GSignalGroup,
  GType,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** #GSignalGroup manages to simplify the process of connecting many signals to
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SignalGroup(raw: Ptr[GSignalGroup]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Blocks all signal handlers managed by @self so they will not be called
    * during any signal emissions. Must be unblocked exactly the same number of
    * times it has been blocked to become active again.
    *
    * This blocked state will be kept across changes of the target instance.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def block(): Unit /* None */ = g_signal_group_block(
    this.raw.asInstanceOf[Ptr[GSignalGroup]]
  )

  /** Connects @c_handler to the signal @detailed_signal on the target instance
    * of @self.
    *
    * You cannot connect a signal handler after #GSignalGroup:target has been
    * set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method connect/<method parameters>/c_handler]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))"
  )
  private def connect__ = ???

  /** Connects @c_handler to the signal @detailed_signal on the target instance
    * of @self.
    *
    * The @c_handler will be called after the default handler of the signal.
    *
    * You cannot connect a signal handler after #GSignalGroup:target has been
    * set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method connect_after/<method parameters>/c_handler]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))"
  )
  private def connectAfter__ = ???

  /** Connects @closure to the signal @detailed_signal on #GSignalGroup:target.
    *
    * You cannot connect a signal handler after #GSignalGroup:target has been
    * set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method connect_closure/<method parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def connectClosure__ = ???

  /** Connects @c_handler to the signal @detailed_signal on the target instance
    * of @self.
    *
    * You cannot connect a signal handler after #GSignalGroup:target has been
    * set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method connect_data/<method parameters>/c_handler]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))"
  )
  private def connectData__ = ???

  /** Connects @c_handler to the signal @detailed_signal on
    * #GSignalGroup:target.
    *
    * Ensures that the @object stays alive during the call to @c_handler by
    * temporarily adding a reference count. When the @object is destroyed the
    * signal handler will automatically be removed.
    *
    * You cannot connect a signal handler after #GSignalGroup:target has been
    * set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method connect_object/<method parameters>/c_handler]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))"
  )
  private def connectObject__ = ???

  /** Connects @c_handler to the signal @detailed_signal on the target instance
    * of @self.
    *
    * The instance on which the signal is emitted and @data will be swapped when
    * calling @c_handler.
    *
    * You cannot connect a signal handler after #GSignalGroup:target has been
    * set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method connect_swapped/<method parameters>/c_handler]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))"
  )
  private def connectSwapped__ = ???

  /** Gets the target instance used when connecting signals.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dupTarget(): Object /* None */ = new Object(
    g_signal_group_dup_target(
      this.raw.asInstanceOf[Ptr[GSignalGroup]]
    ).asInstanceOf
  )

  /** Sets the target instance used when connecting signals. Any signal that has
    * been registered with g_signal_group_connect_object() or similar functions
    * will be connected to this object.
    *
    * If the target instance was previously set, signals will be disconnected
    * from that object prior to connecting to @target.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTarget(
      target: Option[Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */ ]
  ): Unit /* None */ = g_signal_group_set_target(
    this.raw.asInstanceOf[Ptr[GSignalGroup]],
    target
      .map[_root_.sn.gnome.glib.internal.gpointer](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  /** Unblocks all signal handlers managed by @self so they will be called again
    * during any signal emissions unless it is blocked again. Must be unblocked
    * exactly the same number of times it has been blocked to become active
    * again.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unblock(): Unit /* None */ = g_signal_group_unblock(
    this.raw.asInstanceOf[Ptr[GSignalGroup]]
  )

  /** This signal is emitted when #GSignalGroup:target is set to a new value
    * other than %NULL. It is similar to #GObject::notify on `target` except it
    * will not emit when #GSignalGroup:target is %NULL and also allows for
    * receiving the #GObject without a data-race.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onBind(handler: ((instance: Object)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (instance: Object), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GSignalGroup],
          instance: Ptr[GObject] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (instance = sr.runtime.get[Object](instance.asInstanceOf[Ptr[Byte]]))
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"bind"
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
  end onBind

  /** This signal is emitted when the target instance of @self is set to a new
    * #GObject.
    *
    * This signal will only be emitted if the previous target of @self is
    * non-%NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onUnbind(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GSignalGroup],
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
    val signal = c"unbind"
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
  end onUnbind
end SignalGroup

object SignalGroup:
  /** Creates a new #GSignalGroup for target instances of @target_type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(target_type: GType /* Some(GType) */ )(using Runtime): SignalGroup =
    val raw: Ptr[Byte] = g_signal_group_new(target_type).asInstanceOf
    summon[Runtime]
      .getOrCreate[SignalGroup](raw, r => new SignalGroup(r.asInstanceOf))
  end apply
end SignalGroup
