package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.Device
import sn.gnome.gio.ActionGroup
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{EventController, PadActionType}
import sn.gnome.gtk4.internal.GtkPadController

/** `GtkPadController` is an event controller for the pads found in drawing
  * tablets.
  *
  * Pads are the collection of buttons and tactile sensors often found around
  * the stylus-sensitive area.
  *
  * These buttons and sensors have no implicit meaning, and by default they
  * perform no action. `GtkPadController` is provided to map those to
  * [iface@Gio.Action] objects, thus letting the application give them a more
  * semantic meaning.
  *
  * Buttons and sensors are not constrained to triggering a single action, some
  * %GDK_SOURCE_TABLET_PAD devices feature multiple "modes". All these input
  * elements have one current mode, which may determine the final action being
  * triggered.
  *
  * Pad devices often divide buttons and sensors into groups. All elements in a
  * group share the same current mode, but different groups may have different
  * modes. See [method@Gdk.DevicePad.get_n_groups] and
  * [method@Gdk.DevicePad.get_group_n_modes].
  *
  * Each of the actions that a given button/strip/ring performs for a given mode
  * is defined by a [struct@Gtk.PadActionEntry]. It contains an action name that
  * will be looked up in the given [iface@Gio.ActionGroup] and activated
  * whenever the specified input element and mode are triggered.
  *
  * A simple example of `GtkPadController` usage: Assigning button 1 in all
  * modes and pad devices to an "invert-selection" action:
  *
  * ```c
  * GtkPadActionEntry *pad_actions[] = {
  *   { GTK_PAD_ACTION_BUTTON, 1, -1, "Invert selection", "pad-actions.invert-selection" },
  *   …
  * };
  *
  * …
  * action_group = g_simple_action_group_new ();
  * action = g_simple_action_new ("pad-actions.invert-selection", NULL);
  * g_signal_connect (action, "activate", on_invert_selection_activated, NULL);
  * g_action_map_add_action (G_ACTION_MAP (action_group), action);
  * …
  * pad_controller = gtk_pad_controller_new (action_group, NULL);
  * ```
  *
  * The actions belonging to rings/strips will be activated with a parameter of
  * type %G_VARIANT_TYPE_DOUBLE bearing the value of the given axis, it is
  * required that those are made stateful and accepting this `GVariantType`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PadController private[gnome] (raw: Ptr[GtkPadController])
    extends EventController(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds an individual action to @controller.
    *
    * This action will only be activated if the given button/ring/strip number
    * in @index is interacted while the current mode is @mode. -1 may be used
    * for simple cases, so the action is triggered on all modes.
    *
    * The given @label should be considered user-visible, so
    * internationalization rules apply. Some windowing systems may be able to
    * use those for user feedback.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAction(
      `type`: PadActionType /* Some(GtkPadActionType) */,
      index: Int /* Some(CInt) */,
      mode: Int /* Some(CInt) */,
      label: String /* Some(CString) */,
      action_name: String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_pad_controller_set_action(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPadController]],
      `type`.raw,
      index,
      mode,
      summon[Runtime].inZone(toCString(label)),
      summon[Runtime].inZone(toCString(action_name))
    )
  end setAction

  /** A convenience function to add a group of action entries on
    * @controller.
    *
    * See [struct@Gtk.PadActionEntry] and [method@Gtk.PadController.set_action].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_action_entries/<method parameters>/entries]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(PadActionEntry), @type -> DataRecord(GtkPadActionEntry)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const GtkPadActionEntry*)))"
  )
  private def setActionEntries__ = ???

end PadController

object PadController:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkPadController])(using Runtime) =
    summon[Runtime].getOrCreate[PadController](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new PadController(ptr)
    )

  /** Creates a new `GtkPadController` that will associate events from @pad to
    * actions.
    *
    * A %NULL pad may be provided so the controller manages all pad devices
    * generically, it is discouraged to mix `GtkPadController` objects with
    * %NULL and non-%NULL @pad argument on the same toplevel window, as
    * execution order is not guaranteed.
    *
    * The `GtkPadController` is created with no mapped actions. In order to map
    * pad events to actions, use [method@Gtk.PadController.set_action_entries]
    * or [method@Gtk.PadController.set_action].
    *
    * Be aware that pad events will only be delivered to `GtkWindow`s, so adding
    * a pad controller to any other type of widget will not have an effect.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      group: ActionGroup /* Some(Ptr[_root_.sn.gnome.gio.internal.GActionGroup]) */,
      pad: Option[
        sn.gnome.gdk4.Device /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDevice]) */
      ]
  )(using Runtime): PadController =
    val raw: Ptr[Byte] = gtk_pad_controller_new(
      group.getUnsafeRawPointer().asInstanceOf,
      pad
        .map[Ptr[_root_.sn.gnome.gdk4.internal.GdkDevice]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gdk4.internal.GdkDevice]]
        )
    ).asInstanceOf
    summon[Runtime].getOrCreate[PadController](
      raw,
      r => PadController.applyUnsafe(r.asInstanceOf)
    )
  end apply
end PadController
