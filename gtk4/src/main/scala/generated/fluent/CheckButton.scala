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
  CheckButton,
  ConstraintTarget,
  Widget
}
import sn.gnome.gtk4.internal.GtkCheckButton
import sn.gnome.runtime.*

/** A `GtkCheckButton` places a label next to an indicator.
  *
  * ![Example GtkCheckButtons](check-button.png)
  *
  * A `GtkCheckButton` is created by calling either [ctor@Gtk.CheckButton.new]
  * or [ctor@Gtk.CheckButton.new_with_label].
  *
  * The state of a `GtkCheckButton` can be set specifically using
  * [method@Gtk.CheckButton.set_active], and retrieved using
  * [method@Gtk.CheckButton.get_active].
  *
  * # Inconsistent state
  *
  * In addition to "on" and "off", check buttons can be an "in between" state
  * that is neither on nor off. This can be used e.g. when the user has selected
  * a range of elements (such as some text or spreadsheet cells) that are
  * affected by a check button, and the current values in that range are
  * inconsistent.
  *
  * To set a `GtkCheckButton` to inconsistent state, use
  * [method@Gtk.CheckButton.set_inconsistent].
  *
  * # Grouping
  *
  * Check buttons can be grouped together, to form mutually exclusive groups -
  * only one of the buttons can be toggled at a time, and toggling another one
  * will switch the currently toggled one off.
  *
  * Grouped check buttons use a different indicator, and are commonly referred
  * to as *radio buttons*.
  *
  * ![Example GtkCheckButtons](radio-button.png)
  *
  * To add a `GtkCheckButton` to a group, use
  * [method@Gtk.CheckButton.set_group].
  *
  * When the code must keep track of the state of a group of radio buttons, it
  * is recommended to keep track of such state through a stateful `GAction` with
  * a target for each button. Using the `toggled` signals to keep track of the
  * group changes and state is discouraged.
  *
  * # CSS nodes
  *
  * ```
  * checkbutton[.text-button]
  * ├── check
  * ╰── [label]
  * ```
  *
  * A `GtkCheckButton` has a main node with name checkbutton. If the
  * [property@Gtk.CheckButton:label] or [property@Gtk.CheckButton:child]
  * properties are set, it contains a child widget. The indicator node is named
  * check when no group is set, and radio if the checkbutton is grouped together
  * with other checkbuttons.
  *
  * # Accessibility
  *
  * `GtkCheckButton` uses the %GTK_ACCESSIBLE_ROLE_CHECKBOX role.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CheckButton(raw: Ptr[GtkCheckButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Actionable,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns whether the check button is active.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActive(): Boolean /* None */ = gtk_check_button_get_active(
    this.raw.asInstanceOf[Ptr[GtkCheckButton]]
  ).value.!=(0)

  /** Gets the child widget of @button or `NULL` if [property@CheckButton:label]
    * is set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_check_button_get_child(
      this.raw.asInstanceOf[Ptr[GtkCheckButton]]
    ).asInstanceOf
  )

  /** Returns whether the check button is in an inconsistent state.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInconsistent(): Boolean /* None */ = gtk_check_button_get_inconsistent(
    this.raw.asInstanceOf[Ptr[GtkCheckButton]]
  ).value.!=(0)

  /** Returns the label of the check button or `NULL` if
    * [property@CheckButton:child] is set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLabel()(using Zone): String /* None */ = fromCString(
    gtk_check_button_get_label(
      this.raw.asInstanceOf[Ptr[GtkCheckButton]]
    ).asInstanceOf
  )

  /** Returns whether underlines in the label indicate mnemonics.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUseUnderline(): Boolean /* None */ =
    gtk_check_button_get_use_underline(
      this.raw.asInstanceOf[Ptr[GtkCheckButton]]
    ).value.!=(0)

  /** Changes the check buttons active state.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setActive(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_check_button_set_active(
    this.raw.asInstanceOf[Ptr[GtkCheckButton]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** Sets the child widget of @button.
    *
    * Note that by using this API, you take full responsibility for setting up
    * the proper accessibility label and description information for @button.
    * Most likely, you'll either set the accessibility label or description for @button
    * explicitly, or you'll set a labelled-by or described-by relations from @child
    * to @button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_check_button_set_child(
    this.raw.asInstanceOf[Ptr[GtkCheckButton]],
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** Adds @self to the group of @group.
    *
    * In a group of multiple check buttons, only one button can be active at a
    * time. The behavior of a checkbutton in a group is also commonly known as a
    * *radio button*.
    *
    * Setting the group of a check button also changes the css name of the
    * indicator widget's CSS node to 'radio'.
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
      group: Option[CheckButton /* Some(Ptr[GtkCheckButton]) */ ]
  ): Unit /* None */ = gtk_check_button_set_group(
    this.raw.asInstanceOf[Ptr[GtkCheckButton]],
    group
      .map[Ptr[GtkCheckButton]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkCheckButton]])
  )

  /** Sets the `GtkCheckButton` to inconsistent state.
    *
    * You should turn off the inconsistent state again if the user checks the
    * check button. This has to be done manually.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInconsistent(
      inconsistent: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_check_button_set_inconsistent(
    this.raw.asInstanceOf[Ptr[GtkCheckButton]],
    gboolean(gint((if inconsistent == true then 1 else 0)))
  )

  /** Sets the text of @self.
    *
    * If [property@Gtk.CheckButton:use-underline] is %TRUE, an underscore in @label
    * is interpreted as mnemonic indicator, see
    * [method@Gtk.CheckButton.set_use_underline] for details on this behavior.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLabel(
      label: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_check_button_set_label(
    this.raw.asInstanceOf[Ptr[GtkCheckButton]],
    label
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets whether underlines in the label indicate mnemonics.
    *
    * If @setting is %TRUE, an underscore character in @self's label indicates a
    * mnemonic accelerator key. This behavior is similar to
    * [property@Gtk.Label:use-underline].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUseUnderline(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_check_button_set_use_underline(
    this.raw.asInstanceOf[Ptr[GtkCheckButton]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** Emitted to when the check button is activated.
    *
    * The `::activate` signal on `GtkCheckButton` is an action signal and
    * emitting it causes the button to animate press then release.
    *
    * Applications should never connect to this signal, but use the
    * [signal@Gtk.CheckButton::toggled] signal.
    *
    * The default bindings for this signal are all forms of the <kbd>␣</kbd> and
    * <kbd>Enter</kbd> keys.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivate(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkCheckButton],
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
    val signal = c"activate"
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
  end onActivate

  /** Emitted when the buttons's [property@Gtk.CheckButton:active] property
    * changes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onToggled(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkCheckButton],
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

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end CheckButton

object CheckButton:
  /** Creates a new `GtkCheckButton`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): CheckButton =
    val raw: Ptr[Byte] = gtk_check_button_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[CheckButton](raw, r => new CheckButton(r.asInstanceOf))
  end apply

  /** Creates a new `GtkCheckButton` with the given text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withLabel(label: Option[String | CString /* Some(CString) */ ])(using
      Zone
  )(using Runtime): CheckButton =
    val raw: Ptr[Byte] = gtk_check_button_new_with_label(
      label
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[CheckButton](raw, r => new CheckButton(r.asInstanceOf))
  end withLabel

  /** Creates a new `GtkCheckButton` with the given text and a mnemonic.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withMnemonic(label: Option[String | CString /* Some(CString) */ ])(using
      Zone
  )(using Runtime): CheckButton =
    val raw: Ptr[Byte] = gtk_check_button_new_with_mnemonic(
      label
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[CheckButton](raw, r => new CheckButton(r.asInstanceOf))
  end withMnemonic

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end CheckButton
