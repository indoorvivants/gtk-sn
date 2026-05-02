package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Actionable
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkButton

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `GtkButton` widget is generally used to trigger a callback function that
  * is called when the button is pressed.
  *
  * ![An example GtkButton](button.png)
  *
  * The `GtkButton` widget can hold any valid child widget. That is, it can hold
  * almost any other standard `GtkWidget`. The most commonly used child is the
  * `GtkLabel`.
  *
  * # CSS nodes
  *
  * `GtkButton` has a single CSS node with name button. The node will get the
  * style classes .image-button or .text-button, if the content is just an image
  * or label, respectively. It may also receive the .flat style class. When
  * activating a button via the keyboard, the button will temporarily gain the
  * .keyboard-activating style class.
  *
  * Other style classes that are commonly used with `GtkButton` include
  * .suggested-action and .destructive-action. In special cases, buttons can be
  * made round by adding the .circular style class.
  *
  * Button-like widgets like [class@Gtk.ToggleButton], [class@Gtk.MenuButton],
  * [class@Gtk.VolumeButton], [class@Gtk.LockButton], [class@Gtk.ColorButton] or
  * [class@Gtk.FontButton] use style classes such as .toggle, .popup, .scale,
  * .lock, .color on the button node to differentiate themselves from a plain
  * `GtkButton`.
  *
  * # Accessibility
  *
  * `GtkButton` uses the %GTK_ACCESSIBLE_ROLE_BUTTON role.
  */
class Button(raw: Ptr[GtkButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Actionable,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves whether the button can be smaller than the natural size of its
    * contents.
    */
  def getCanShrink(): Boolean /* None */ =
    gtk_button_get_can_shrink(this.raw.asInstanceOf[Ptr[GtkButton]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child widget of @button.
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_button_get_child(this.raw.asInstanceOf[Ptr[GtkButton]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the button has a frame.
    */
  def getHasFrame(): Boolean /* None */ =
    gtk_button_get_has_frame(this.raw.asInstanceOf[Ptr[GtkButton]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the icon name of the button.
    *
    * If the icon name has not been set with [method@Gtk.Button.set_icon_name]
    * the return value will be %NULL. This will be the case if you create an
    * empty button with [ctor@Gtk.Button.new] to use as a container.
    */
  def getIconName()(using Zone): String /* None */ = fromCString(
    gtk_button_get_icon_name(this.raw.asInstanceOf[Ptr[GtkButton]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the text from the label of the button.
    *
    * If the label text has not been set with [method@Gtk.Button.set_label] the
    * return value will be %NULL. This will be the case if you create an empty
    * button with [ctor@Gtk.Button.new] to use as a container.
    */
  def getLabel()(using Zone): String /* None */ = fromCString(
    gtk_button_get_label(this.raw.asInstanceOf[Ptr[GtkButton]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * gets whether underlines are interpreted as mnemonics.
    *
    * See [method@Gtk.Button.set_use_underline].
    */
  def getUseUnderline(): Boolean /* None */ = gtk_button_get_use_underline(
    this.raw.asInstanceOf[Ptr[GtkButton]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the button size can be smaller than the natural size of its
    * contents.
    *
    * For text buttons, setting @can_shrink to true will ellipsize the label.
    *
    * For icons and custom children, this function has no effect.
    */
  def setCanShrink(
      can_shrink: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_button_set_can_shrink(
    this.raw.asInstanceOf[Ptr[GtkButton]],
    gboolean(gint((if can_shrink == true then 1 else 0)))
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
  ): Unit /* None */ = gtk_button_set_child(
    this.raw.asInstanceOf[Ptr[GtkButton]],
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the style of the button.
    *
    * Buttons can have a flat appearance or have a frame drawn around them.
    */
  def setHasFrame(
      has_frame: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_button_set_has_frame(
    this.raw.asInstanceOf[Ptr[GtkButton]],
    gboolean(gint((if has_frame == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a `GtkImage` with the given icon name as a child.
    *
    * If @button already contains a child widget, that child widget will be
    * removed and replaced with the image.
    */
  def setIconName(
      icon_name: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_button_set_icon_name(
    this.raw.asInstanceOf[Ptr[GtkButton]],
    __sn_extract_string(icon_name)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the text of the label of the button to @label.
    *
    * This will also clear any previously set labels.
    */
  def setLabel(
      label: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_button_set_label(
    this.raw.asInstanceOf[Ptr[GtkButton]],
    __sn_extract_string(label)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether to use underlines as mnemonics.
    *
    * If true, an underline in the text of the button label indicates the next
    * character should be used for the mnemonic accelerator key.
    */
  def setUseUnderline(
      use_underline: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_button_set_use_underline(
    this.raw.asInstanceOf[Ptr[GtkButton]],
    gboolean(gint((if use_underline == true then 1 else 0)))
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Button

object Button:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkButton` widget.
    *
    * To add a child widget to the button, use [method@Gtk.Button.set_child].
    */
  def apply(): Button = new Button(gtk_button_new().asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new button containing an icon from the current icon theme.
    *
    * If the icon name isn’t known, a “broken image” icon will be displayed
    * instead. If the current icon theme is changed, the icon will be updated
    * appropriately.
    */
  def fromIconName(
      icon_name: String | CString /* Some(CString) */
  )(using Zone): Button = new Button(
    gtk_button_new_from_icon_name(__sn_extract_string(icon_name)).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GtkButton` widget with a `GtkLabel` child.
    */
  def withLabel(
      label: String | CString /* Some(CString) */
  )(using Zone): Button = new Button(
    gtk_button_new_with_label(__sn_extract_string(label)).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkButton` containing a label.
    *
    * If characters in @label are preceded by an underscore, they are
    * underlined. If you need a literal underscore character in a label, use
    * “__” (two underscores). The first underlined character represents a
    * keyboard accelerator called a mnemonic. Pressing <kbd>Alt</kbd> and that
    * key activates the button.
    */
  def withMnemonic(
      label: String | CString /* Some(CString) */
  )(using Zone): Button = new Button(
    gtk_button_new_with_mnemonic(__sn_extract_string(label)).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Button
