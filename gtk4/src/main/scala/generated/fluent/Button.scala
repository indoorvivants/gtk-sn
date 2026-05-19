package sn.gnome.gtk4

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
import sn.gnome.gtk4.{
  Accessible,
  Actionable,
  Buildable,
  ConstraintTarget,
  Widget
}
import sn.gnome.gtk4.internal.GtkButton
import sn.gnome.runtime.*

/** The `GtkButton` widget is generally used to trigger a callback function that
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Button private[gnome] (raw: Ptr[GtkButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Actionable,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves whether the button can be smaller than the natural size of its
    * contents.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCanShrink(): Boolean /* None */ =
    gtk_button_get_can_shrink(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkButton]]
    ).value.!=(0)
  end getCanShrink

  /** Gets the child widget of @button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_button_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkButton]]
      ).asInstanceOf
    )
  end getChild

  /** Returns whether the button has a frame.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHasFrame(): Boolean /* None */ =
    gtk_button_get_has_frame(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkButton]]
    ).value.!=(0)
  end getHasFrame

  /** Returns the icon name of the button.
    *
    * If the icon name has not been set with [method@Gtk.Button.set_icon_name]
    * the return value will be %NULL. This will be the case if you create an
    * empty button with [ctor@Gtk.Button.new] to use as a container.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIconName(): String /* None */ =
    fromCString(
      gtk_button_get_icon_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkButton]]
      ).asInstanceOf
    )
  end getIconName

  /** Fetches the text from the label of the button.
    *
    * If the label text has not been set with [method@Gtk.Button.set_label] the
    * return value will be %NULL. This will be the case if you create an empty
    * button with [ctor@Gtk.Button.new] to use as a container.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLabel(): String /* None */ =
    fromCString(
      gtk_button_get_label(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkButton]]
      ).asInstanceOf
    )
  end getLabel

  /** gets whether underlines are interpreted as mnemonics.
    *
    * See [method@Gtk.Button.set_use_underline].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUseUnderline(): Boolean /* None */ =
    gtk_button_get_use_underline(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkButton]]
    ).value.!=(0)
  end getUseUnderline

  /** Sets whether the button size can be smaller than the natural size of its
    * contents.
    *
    * For text buttons, setting @can_shrink to true will ellipsize the label.
    *
    * For icons and custom children, this function has no effect.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCanShrink(
      can_shrink: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_button_set_can_shrink(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkButton]],
      gboolean(gint((if can_shrink == true then 1 else 0)))
    )
  end setCanShrink

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
  def setChild(child: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ])(
      using Runtime
  ): Unit /* None */ =
    gtk_button_set_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkButton]],
      child
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setChild

  /** Sets the style of the button.
    *
    * Buttons can have a flat appearance or have a frame drawn around them.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHasFrame(
      has_frame: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_button_set_has_frame(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkButton]],
      gboolean(gint((if has_frame == true then 1 else 0)))
    )
  end setHasFrame

  /** Adds a `GtkImage` with the given icon name as a child.
    *
    * If @button already contains a child widget, that child widget will be
    * removed and replaced with the image.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIconName(
      icon_name: String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_button_set_icon_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkButton]],
      summon[Runtime].inZone(toCString(icon_name))
    )
  end setIconName

  /** Sets the text of the label of the button to @label.
    *
    * This will also clear any previously set labels.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLabel(
      label: String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_button_set_label(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkButton]],
      summon[Runtime].inZone(toCString(label))
    )
  end setLabel

  /** Sets whether to use underlines as mnemonics.
    *
    * If true, an underline in the text of the button label indicates the next
    * character should be used for the mnemonic accelerator key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUseUnderline(
      use_underline: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_button_set_use_underline(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkButton]],
      gboolean(gint((if use_underline == true then 1 else 0)))
    )
  end setUseUnderline

  /** Emitted to animate press then release.
    *
    * This is an action signal. Applications should never connect to this
    * signal, but use the [signal@Gtk.Button::clicked] signal.
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
          self: Ptr[GtkButton],
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

  /** Emitted when the button has been activated (pressed and released).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onClicked(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkButton],
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
    val signal = c"clicked"
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
  end onClicked
end Button

object Button:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkButton])(using Runtime) = summon[Runtime]
    .getOrCreate[Button](ptr.asInstanceOf[Ptr[Byte]], p => new Button(ptr))

  /** Creates a new `GtkButton` widget.
    *
    * To add a child widget to the button, use [method@Gtk.Button.set_child].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): Button =
    val raw: Ptr[Byte] = gtk_button_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[Button](raw, r => Button.applyUnsafe(r.asInstanceOf))
  end apply

  /** Creates a new button containing an icon from the current icon theme.
    *
    * If the icon name isn’t known, a “broken image” icon will be displayed
    * instead. If the current icon theme is changed, the icon will be updated
    * appropriately.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromIconName(icon_name: String /* Some(CString) */ )(using
      Runtime
  ): Button =
    val raw: Ptr[Byte] = gtk_button_new_from_icon_name(
      summon[Runtime].inZone(toCString(icon_name))
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Button](raw, r => Button.applyUnsafe(r.asInstanceOf))
  end fromIconName

  /** Creates a `GtkButton` widget with a `GtkLabel` child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withLabel(label: String /* Some(CString) */ )(using Runtime): Button =
    val raw: Ptr[Byte] = gtk_button_new_with_label(
      summon[Runtime].inZone(toCString(label))
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Button](raw, r => Button.applyUnsafe(r.asInstanceOf))
  end withLabel

  /** Creates a new `GtkButton` containing a label.
    *
    * If characters in @label are preceded by an underscore, they are
    * underlined. If you need a literal underscore character in a label, use
    * “__” (two underscores). The first underlined character represents a
    * keyboard accelerator called a mnemonic. Pressing <kbd>Alt</kbd> and that
    * key activates the button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withMnemonic(label: String /* Some(CString) */ )(using Runtime): Button =
    val raw: Ptr[Byte] = gtk_button_new_with_mnemonic(
      summon[Runtime].inZone(toCString(label))
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Button](raw, r => Button.applyUnsafe(r.asInstanceOf))
  end withMnemonic
end Button
