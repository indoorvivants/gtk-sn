package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Actionable
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.CheckButton
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkCheckButton

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkCheckButton` places a label next to an indicator.
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
  */
class CheckButton(raw: Ptr[GtkCheckButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Actionable,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the check button is active.
    */
  def getActive(): Boolean /* None */ = gtk_check_button_get_active(
    this.raw.asInstanceOf[Ptr[GtkCheckButton]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child widget of @button or `NULL` if [property@CheckButton:label]
    * is set.
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_check_button_get_child(
      this.raw.asInstanceOf[Ptr[GtkCheckButton]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the check button is in an inconsistent state.
    */
  def getInconsistent(): Boolean /* None */ = gtk_check_button_get_inconsistent(
    this.raw.asInstanceOf[Ptr[GtkCheckButton]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the label of the check button or `NULL` if
    * [property@CheckButton:child] is set.
    */
  def getLabel()(using Zone): String /* None */ = fromCString(
    gtk_check_button_get_label(
      this.raw.asInstanceOf[Ptr[GtkCheckButton]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether underlines in the label indicate mnemonics.
    */
  def getUseUnderline(): Boolean /* None */ =
    gtk_check_button_get_use_underline(
      this.raw.asInstanceOf[Ptr[GtkCheckButton]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Changes the check buttons active state.
    */
  def setActive(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_check_button_set_active(
    this.raw.asInstanceOf[Ptr[GtkCheckButton]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the child widget of @button.
    *
    * Note that by using this API, you take full responsibility for setting up
    * the proper accessibility label and description information for @button.
    * Most likely, you'll either set the accessibility label or description for @button
    * explicitly, or you'll set a labelled-by or described-by relations from @child
    * to @button.
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_check_button_set_child(
    this.raw.asInstanceOf[Ptr[GtkCheckButton]],
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds @self to the group of @group.
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
    */
  def setGroup(
      group: Option[CheckButton /* Some(Ptr[GtkCheckButton]) */ ]
  ): Unit /* None */ = gtk_check_button_set_group(
    this.raw.asInstanceOf[Ptr[GtkCheckButton]],
    group
      .map[Ptr[GtkCheckButton]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkCheckButton]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `GtkCheckButton` to inconsistent state.
    *
    * You should turn off the inconsistent state again if the user checks the
    * check button. This has to be done manually.
    */
  def setInconsistent(
      inconsistent: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_check_button_set_inconsistent(
    this.raw.asInstanceOf[Ptr[GtkCheckButton]],
    gboolean(gint((if inconsistent == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the text of @self.
    *
    * If [property@Gtk.CheckButton:use-underline] is %TRUE, an underscore in @label
    * is interpreted as mnemonic indicator, see
    * [method@Gtk.CheckButton.set_use_underline] for details on this behavior.
    */
  def setLabel(
      label: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_check_button_set_label(
    this.raw.asInstanceOf[Ptr[GtkCheckButton]],
    label
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether underlines in the label indicate mnemonics.
    *
    * If @setting is %TRUE, an underscore character in @self's label indicates a
    * mnemonic accelerator key. This behavior is similar to
    * [property@Gtk.Label:use-underline].
    */
  def setUseUnderline(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_check_button_set_use_underline(
    this.raw.asInstanceOf[Ptr[GtkCheckButton]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkCheckButton`.
    */
  def apply(): CheckButton = new CheckButton(
    gtk_check_button_new().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkCheckButton` with the given text.
    */
  def withLabel(
      label: Option[String | CString /* Some(CString) */ ]
  )(using Zone): CheckButton = new CheckButton(
    gtk_check_button_new_with_label(
      label
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkCheckButton` with the given text and a mnemonic.
    */
  def withMnemonic(
      label: Option[String | CString /* Some(CString) */ ]
  )(using Zone): CheckButton = new CheckButton(
    gtk_check_button_new_with_mnemonic(
      label
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end CheckButton
