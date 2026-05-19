package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.Device
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{EventController, EventSequenceState, Gesture}
import sn.gnome.gtk4.internal.GtkGesture

/** `GtkGesture` is the base class for gesture recognition.
  *
  * Although `GtkGesture` is quite generalized to serve as a base for
  * multi-touch gestures, it is suitable to implement single-touch and
  * pointer-based gestures (using the special %NULL `GdkEventSequence` value for
  * these).
  *
  * The number of touches that a `GtkGesture` need to be recognized is
  * controlled by the [property@Gtk.Gesture:n-points] property, if a gesture is
  * keeping track of less or more than that number of sequences, it won't check
  * whether the gesture is recognized.
  *
  * As soon as the gesture has the expected number of touches, it will check
  * regularly if it is recognized, the criteria to consider a gesture as
  * "recognized" is left to `GtkGesture` subclasses.
  *
  * A recognized gesture will then emit the following signals:
  *
  *   - [signal@Gtk.Gesture::begin] when the gesture is recognized.
  *   - [signal@Gtk.Gesture::update], whenever an input event is processed.
  *   - [signal@Gtk.Gesture::end] when the gesture is no longer recognized.
  *
  * ## Event propagation
  *
  * In order to receive events, a gesture needs to set a propagation phase
  * through [method@Gtk.EventController.set_propagation_phase].
  *
  * In the capture phase, events are propagated from the toplevel down to the
  * target widget, and gestures that are attached to containers above the widget
  * get a chance to interact with the event before it reaches the target.
  *
  * In the bubble phase, events are propagated up from the target widget to the
  * toplevel, and gestures that are attached to containers above the widget get
  * a chance to interact with events that have not been handled yet.
  *
  * ## States of a sequence
  *
  * Whenever input interaction happens, a single event may trigger a cascade of
  * `GtkGesture`s, both across the parents of the widget receiving the event and
  * in parallel within an individual widget. It is a responsibility of the
  * widgets using those gestures to set the state of touch sequences accordingly
  * in order to enable cooperation of gestures around the `GdkEventSequence`s
  * triggering those.
  *
  * Within a widget, gestures can be grouped through [method@Gtk.Gesture.group].
  * Grouped gestures synchronize the state of sequences, so calling
  * [method@Gtk.Gesture.set_state] on one will effectively propagate the state
  * throughout the group.
  *
  * By default, all sequences start out in the %GTK_EVENT_SEQUENCE_NONE state,
  * sequences in this state trigger the gesture event handler, but event
  * propagation will continue unstopped by gestures.
  *
  * If a sequence enters into the %GTK_EVENT_SEQUENCE_DENIED state, the gesture
  * group will effectively ignore the sequence, letting events go unstopped
  * through the gesture, but the "slot" will still remain occupied while the
  * touch is active.
  *
  * If a sequence enters in the %GTK_EVENT_SEQUENCE_CLAIMED state, the gesture
  * group will grab all interaction on the sequence, by:
  *
  *   - Setting the same sequence to %GTK_EVENT_SEQUENCE_DENIED on every other
  *     gesture group within the widget, and every gesture on parent widgets in
  *     the propagation chain.
  *   - Emitting [signal@Gtk.Gesture::cancel] on every gesture in widgets
  *     underneath in the propagation chain.
  *   - Stopping event propagation after the gesture group handles the event.
  *
  * Note: if a sequence is set early to %GTK_EVENT_SEQUENCE_CLAIMED on
  * %GDK_TOUCH_BEGIN/%GDK_BUTTON_PRESS (so those events are captured before
  * reaching the event widget, this implies %GTK_PHASE_CAPTURE), one similar
  * event will be emulated if the sequence changes to
  * %GTK_EVENT_SEQUENCE_DENIED. This way event coherence is preserved before
  * event propagation is unstopped again.
  *
  * Sequence states can't be changed freely. See [method@Gtk.Gesture.set_state]
  * to know about the possible lifetimes of a `GdkEventSequence`.
  *
  * ## Touchpad gestures
  *
  * On the platforms that support it, `GtkGesture` will handle transparently
  * touchpad gesture events. The only precautions users of `GtkGesture` should
  * do to enable this support are:
  *
  *   - If the gesture has %GTK_PHASE_NONE, ensuring events of type
  *     %GDK_TOUCHPAD_SWIPE and %GDK_TOUCHPAD_PINCH are handled by the
  *     `GtkGesture`
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Gesture private[gnome] (raw: Ptr[GtkGesture])
    extends EventController(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** If there are touch sequences being currently handled by @gesture, returns
    * %TRUE and fills in @rect with the bounding box containing all active
    * touches.
    *
    * Otherwise, %FALSE will be returned.
    *
    * Note: This function will yield unexpected results on touchpad gestures.
    * Since there is no correlation between physical and pixel distances, these
    * will look as if constrained in an infinitely small area, @rect width and
    * height will thus be 0 regardless of the number of touchpoints.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_bounding_box]: Method get_bounding_box contains an OUT parameter, which is not supported yet"
  )
  private def getBoundingBox__ = ???

  /** If there are touch sequences being currently handled by @gesture, returns
    * %TRUE and fills in @x and @y with the center of the bounding box
    * containing all active touches.
    *
    * Otherwise, %FALSE will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_bounding_box_center]: Method get_bounding_box_center contains an OUT parameter, which is not supported yet"
  )
  private def getBoundingBoxCenter__ = ???

  /** Returns the logical `GdkDevice` that is currently operating on @gesture.
    *
    * This returns %NULL if the gesture is not being interacted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDevice()(using Runtime): sn.gnome.gdk4.Device /* None */ =
    sn.gnome.gdk4.Device.applyUnsafe(
      gtk_gesture_get_device(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGesture]]
      ).asInstanceOf
    )
  end getDevice

  /** Returns all gestures in the group of @gesture
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_group/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Gesture))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def getGroup__ = ???

  /** Returns the last event that was processed for @sequence.
    *
    * Note that the returned pointer is only valid as long as the
    * @sequence
    *   is still interpreted by the @gesture. If in doubt, you should make a
    *   copy of the event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_last_event/<method parameters>/sequence]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence), @type -> DataRecord(GdkEventSequence*)))"
  )
  private def getLastEvent__ = ???

  /** Returns the `GdkEventSequence` that was last updated on @gesture.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_last_updated_sequence/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence), @type -> DataRecord(GdkEventSequence*)))"
  )
  private def getLastUpdatedSequence__ = ???

  /** If @sequence is currently being interpreted by @gesture, returns %TRUE and
    * fills in @x and @y with the last coordinates stored for that event
    * sequence.
    *
    * The coordinates are always relative to the widget allocation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_point]: Method get_point contains an OUT parameter, which is not supported yet"
  )
  private def getPoint__ = ???

  /** Returns the @sequence state, as seen by @gesture.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_sequence_state/<method parameters>/sequence]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence), @type -> DataRecord(GdkEventSequence*)))"
  )
  private def getSequenceState__ = ???

  /** Returns the list of `GdkEventSequences` currently being interpreted by @gesture.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_sequences/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def getSequences__ = ???

  /** Adds @gesture to the same group than @group_gesture.
    *
    * Gestures are by default isolated in their own groups.
    *
    * Both gestures must have been added to the same widget before they can be
    * grouped.
    *
    * When gestures are grouped, the state of `GdkEventSequences` is kept in
    * sync for all of those, so calling [method@Gtk.Gesture.set_sequence_state],
    * on one will transfer the same value to the others.
    *
    * Groups also perform an "implicit grabbing" of sequences, if a
    * `GdkEventSequence` state is set to %GTK_EVENT_SEQUENCE_CLAIMED on one
    * group, every other gesture group attached to the same `GtkWidget` will
    * switch the state for that sequence to %GTK_EVENT_SEQUENCE_DENIED.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def group(
      gesture: sn.gnome.gtk4.Gesture /* Some(Ptr[GtkGesture]) */
  )(using Runtime): Unit /* None */ =
    gtk_gesture_group(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGesture]],
      gesture.getUnsafeRawPointer().asInstanceOf
    )
  end group

  /** Returns %TRUE if @gesture is currently handling events corresponding to @sequence.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method handles_sequence/<method parameters>/sequence]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence), @type -> DataRecord(GdkEventSequence*)))"
  )
  private def handlesSequence__ = ???

  /** Returns %TRUE if the gesture is currently active.
    *
    * A gesture is active while there are touch sequences interacting with it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isActive(): Boolean /* None */ =
    gtk_gesture_is_active(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGesture]]
    ).value.!=(0)
  end isActive

  /** Returns %TRUE if both gestures pertain to the same group.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isGroupedWith(
      other: sn.gnome.gtk4.Gesture /* Some(Ptr[GtkGesture]) */
  )(using Runtime): Boolean /* None */ =
    gtk_gesture_is_grouped_with(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGesture]],
      other.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end isGroupedWith

  /** Returns %TRUE if the gesture is currently recognized.
    *
    * A gesture is recognized if there are as many interacting touch sequences
    * as required by @gesture.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isRecognized(): Boolean /* None */ =
    gtk_gesture_is_recognized(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGesture]]
    ).value.!=(0)
  end isRecognized

  /** Sets the state of @sequence in @gesture.
    *
    * Sequences start in state %GTK_EVENT_SEQUENCE_NONE, and whenever they
    * change state, they can never go back to that state. Likewise, sequences in
    * state %GTK_EVENT_SEQUENCE_DENIED cannot turn back to a not denied state.
    * With these rules, the lifetime of an event sequence is constrained to the
    * next four:
    *
    * * None * None → Denied * None → Claimed * None → Claimed → Denied
    *
    * Note: Due to event handling ordering, it may be unsafe to set the state on
    * another gesture within a [signal@Gtk.Gesture::begin] signal handler, as
    * the callback might be executed before the other gesture knows about the
    * sequence. A safe way to perform this could be:
    *
    * ```c
    * static void
    * first_gesture_begin_cb (GtkGesture       *first_gesture,
    *                         GdkEventSequence *sequence,
    *                         gpointer          user_data)
    * {
    *   gtk_gesture_set_sequence_state (first_gesture, sequence, GTK_EVENT_SEQUENCE_CLAIMED);
    *   gtk_gesture_set_sequence_state (second_gesture, sequence, GTK_EVENT_SEQUENCE_DENIED);
    * }
    *
    * static void
    * second_gesture_begin_cb (GtkGesture       *second_gesture,
    *                          GdkEventSequence *sequence,
    *                          gpointer          user_data)
    * {
    *   if (gtk_gesture_get_sequence_state (first_gesture, sequence) == GTK_EVENT_SEQUENCE_CLAIMED)
    *     gtk_gesture_set_sequence_state (second_gesture, sequence, GTK_EVENT_SEQUENCE_DENIED);
    * }
    * ```
    *
    * If both gestures are in the same group, just set the state on the gesture
    * emitting the event, the sequence will be already be initialized to the
    * group's global state when the second gesture processes the event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_sequence_state/<method parameters>/sequence]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence), @type -> DataRecord(GdkEventSequence*)))"
  )
  private def setSequenceState__ = ???

  /** Sets the state of all sequences that @gesture is currently interacting
    * with.
    *
    * Sequences start in state %GTK_EVENT_SEQUENCE_NONE, and whenever they
    * change state, they can never go back to that state. Likewise, sequences in
    * state %GTK_EVENT_SEQUENCE_DENIED cannot turn back to a not denied state.
    * With these rules, the lifetime of an event sequence is constrained to the
    * next four:
    *
    * * None * None → Denied * None → Claimed * None → Claimed → Denied
    *
    * Note: Due to event handling ordering, it may be unsafe to set the state on
    * another gesture within a [signal@Gtk.Gesture::begin] signal handler, as
    * the callback might be executed before the other gesture knows about the
    * sequence. A safe way to perform this could be:
    *
    * ```c
    * static void
    * first_gesture_begin_cb (GtkGesture       *first_gesture,
    *                         GdkEventSequence *sequence,
    *                         gpointer          user_data)
    * {
    *   gtk_gesture_set_state (first_gesture, GTK_EVENT_SEQUENCE_CLAIMED);
    *   gtk_gesture_set_state (second_gesture, GTK_EVENT_SEQUENCE_DENIED);
    * }
    *
    * static void
    * second_gesture_begin_cb (GtkGesture       *second_gesture,
    *                          GdkEventSequence *sequence,
    *                          gpointer          user_data)
    * {
    *   if (gtk_gesture_get_sequence_state (first_gesture, sequence) == GTK_EVENT_SEQUENCE_CLAIMED)
    *     gtk_gesture_set_state (second_gesture, GTK_EVENT_SEQUENCE_DENIED);
    * }
    * ```
    *
    * If both gestures are in the same group, just set the state on the gesture
    * emitting the event, the sequence will be already be initialized to the
    * group's global state when the second gesture processes the event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setState(
      state: EventSequenceState /* Some(GtkEventSequenceState) */
  ): Boolean /* None */ =
    gtk_gesture_set_state(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGesture]],
      state.raw
    ).value.!=(0)
  end setState

  /** Separates @gesture into an isolated group.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ungroup(): Unit /* None */ =
    gtk_gesture_ungroup(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGesture]]
    )
  end ungroup

  /** Emitted when the gesture is recognized.
    *
    * This means the number of touch sequences matches
    * [property@Gtk.Gesture:n-points].
    *
    * Note: These conditions may also happen when an extra touch (eg. a third
    * touch on a 2-touches gesture) is lifted, in that situation @sequence won't
    * pertain to the current set of active touches, so don't rely on this being
    * true.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal begin]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence)))"
  )
  private def onBegin = ???

  /** Emitted whenever a sequence is cancelled.
    *
    * This usually happens on active touches when
    * [method@Gtk.EventController.reset] is called on @gesture (manually, due to
    * grabs...), or the individual @sequence was claimed by parent widgets'
    * controllers (see [method@Gtk.Gesture.set_sequence_state]).
    *
    * @gesture
    *   must forget everything about @sequence as in response to this signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal cancel]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence)))"
  )
  private def onCancel = ???

  /** Emitted when @gesture either stopped recognizing the event sequences as
    * something to be handled, or the number of touch sequences became higher or
    * lower than [property@Gtk.Gesture:n-points].
    *
    * Note: @sequence might not pertain to the group of sequences that were
    * previously triggering recognition on @gesture (ie. a just pressed touch
    * sequence that exceeds [property@Gtk.Gesture:n-points]). This situation may
    * be detected by checking through [method@Gtk.Gesture.handles_sequence].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal end]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence)))"
  )
  private def onEnd = ???

  /** Emitted whenever a sequence state changes.
    *
    * See [method@Gtk.Gesture.set_sequence_state] to know more about the
    * expectable sequence lifetimes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal sequence-state-changed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence)))"
  )
  private def onSequenceStateChanged = ???

  /** Emitted whenever an event is handled while the gesture is recognized.
    *
    * @sequence
    *   is guaranteed to pertain to the set of active touches.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal update]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence)))"
  )
  private def onUpdate = ???

end Gesture

object Gesture:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkGesture])(using Runtime) = summon[Runtime]
    .getOrCreate[Gesture](ptr.asInstanceOf[Ptr[Byte]], p => new Gesture(ptr))

end Gesture
