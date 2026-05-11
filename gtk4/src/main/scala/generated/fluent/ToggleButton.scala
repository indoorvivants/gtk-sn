package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Actionable,
  Buildable,
  Button,
  ConstraintTarget,
  ToggleButton
}
import sn.gnome.gtk4.internal.GtkToggleButton
import sn.gnome.runtime.*

/** A `GtkToggleButton` is a button which remains “pressed-in” when clicked.
  *
  * Clicking again will cause the toggle button to return to its normal state.
  *
  * A toggle button is created by calling either [ctor@Gtk.ToggleButton.new] or
  * [ctor@Gtk.ToggleButton.new_with_label]. If using the former, it is advisable
  * to pack a widget, (such as a `GtkLabel` and/or a `GtkImage`), into the
  * toggle button’s container. (See [class@Gtk.Button] for more information).
  *
  * The state of a `GtkToggleButton` can be set specifically using
  * [method@Gtk.ToggleButton.set_active], and retrieved using
  * [method@Gtk.ToggleButton.get_active].
  *
  * To simply switch the state of a toggle button, use
  * [method@Gtk.ToggleButton.toggled].
  *
  * ## Grouping
  *
  * Toggle buttons can be grouped together, to form mutually exclusive groups -
  * only one of the buttons can be toggled at a time, and toggling another one
  * will switch the currently toggled one off.
  *
  * To add a `GtkToggleButton` to a group, use
  * [method@Gtk.ToggleButton.set_group].
  *
  * ## CSS nodes
  *
  * `GtkToggleButton` has a single CSS node with name button. To differentiate
  * it from a plain `GtkButton`, it gets the `.toggle` style class.
  *
  * ## Accessibility
  *
  * `GtkToggleButton` uses the %GTK_ACCESSIBLE_ROLE_TOGGLE_BUTTON role.
  *
  * ## Creating two `GtkToggleButton` widgets.
  *
  * ```c
  * static void
  * output_state (GtkToggleButton *source,
  *               gpointer         user_data)
  * {
  *   g_print ("Toggle button "%s" is active: %s",
  *            gtk_button_get_label (GTK_BUTTON (source)),
  *            gtk_toggle_button_get_active (source) ? "Yes" : "No");
  * }
  *
  * static void
  * make_toggles (void)
  * {
  *   GtkWidget *window, *toggle1, *toggle2;
  *   GtkWidget *box;
  *   const char *text;
  *
  *   window = gtk_window_new ();
  *   box = gtk_box_new (GTK_ORIENTATION_VERTICAL, 12);
  *
  *   text = "Hi, I’m toggle button one";
  *   toggle1 = gtk_toggle_button_new_with_label (text);
  *
  *   g_signal_connect (toggle1, "toggled",
  *                     G_CALLBACK (output_state),
  *                     NULL);
  *   gtk_box_append (GTK_BOX (box), toggle1);
  *
  *   text = "Hi, I’m toggle button two";
  *   toggle2 = gtk_toggle_button_new_with_label (text);
  *   g_signal_connect (toggle2, "toggled",
  *                     G_CALLBACK (output_state),
  *                     NULL);
  *   gtk_box_append (GTK_BOX (box), toggle2);
  *
  *   gtk_window_set_child (GTK_WINDOW (window), box);
  *   gtk_window_present (GTK_WINDOW (window));
  * }
  * ```
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ToggleButton private[gnome] (raw: Ptr[GtkToggleButton])
    extends Button(raw.asInstanceOf),
      Accessible,
      Actionable,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Queries a `GtkToggleButton` and returns its current state.
    *
    * Returns %TRUE if the toggle button is pressed in and %FALSE if it is
    * raised.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActive(): Boolean /* None */ =
    gtk_toggle_button_get_active(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkToggleButton]]
    ).value.!=(0)
  end getActive

  /** Sets the status of the toggle button.
    *
    * Set to %TRUE if you want the `GtkToggleButton` to be “pressed in”, and
    * %FALSE to raise it.
    *
    * If the status of the button changes, this action causes the
    * [signal@Gtk.ToggleButton::toggled] signal to be emitted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setActive(
      is_active: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_toggle_button_set_active(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkToggleButton]],
      gboolean(gint((if is_active == true then 1 else 0)))
    )
  end setActive

  /** Adds @self to the group of @group.
    *
    * In a group of multiple toggle buttons, only one button can be active at a
    * time.
    *
    * Setting up groups in a cycle leads to undefined behavior.
    *
    * Note that the same effect can be achieved via the [iface@Gtk.Actionable]
    * API, by using the same action with parameter type and state type 's' for
    * all buttons in the group, and giving each button its own target value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setGroup(
      group: Option[
        sn.gnome.gtk4.fluent.ToggleButton /* Some(Ptr[GtkToggleButton]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_toggle_button_set_group(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkToggleButton]],
      group
        .map[Ptr[GtkToggleButton]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkToggleButton]])
    )
  end setGroup

  /** Emits the ::toggled signal on the `GtkToggleButton`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toggled(): Unit /* None */ =
    gtk_toggle_button_toggled(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkToggleButton]]
    )
  end toggled

  /** Emitted whenever the `GtkToggleButton`'s state is changed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onToggled(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkToggleButton],
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
    val signal = c"toggled"
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
  end onToggled
end ToggleButton

object ToggleButton:
  def applyUnsafe(ptr: Ptr[GtkToggleButton])(using Runtime) =
    summon[Runtime].getOrCreate[ToggleButton](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ToggleButton(ptr)
    )

  /** Creates a new toggle button.
    *
    * A widget should be packed into the button, as in [ctor@Gtk.Button.new].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): ToggleButton =
    val raw: Ptr[Byte] = gtk_toggle_button_new().asInstanceOf
    summon[Runtime].getOrCreate[ToggleButton](
      raw,
      r => ToggleButton.applyUnsafe(r.asInstanceOf)
    )
  end apply

  /** Creates a new toggle button with a text label.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withLabel(
      label: String /* Some(CString) */
  )(using Zone, Runtime): ToggleButton =
    val raw: Ptr[Byte] = gtk_toggle_button_new_with_label(
      toCString(label)
    ).asInstanceOf
    summon[Runtime].getOrCreate[ToggleButton](
      raw,
      r => ToggleButton.applyUnsafe(r.asInstanceOf)
    )
  end withLabel

  /** Creates a new `GtkToggleButton` containing a label.
    *
    * The label will be created using [ctor@Gtk.Label.new_with_mnemonic], so
    * underscores in @label indicate the mnemonic for the button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withMnemonic(
      label: String /* Some(CString) */
  )(using Zone, Runtime): ToggleButton =
    val raw: Ptr[Byte] = gtk_toggle_button_new_with_mnemonic(
      toCString(label)
    ).asInstanceOf
    summon[Runtime].getOrCreate[ToggleButton](
      raw,
      r => ToggleButton.applyUnsafe(r.asInstanceOf)
    )
  end withMnemonic
end ToggleButton
