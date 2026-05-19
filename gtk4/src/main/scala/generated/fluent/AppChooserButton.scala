package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.Icon
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
  AppChooser,
  Buildable,
  ConstraintTarget,
  Widget
}
import sn.gnome.gtk4.internal.GtkAppChooserButton
import sn.gnome.runtime.*

/** The `GtkAppChooserButton` lets the user select an application.
  *
  * ![An example GtkAppChooserButton](appchooserbutton.png)
  *
  * Initially, a `GtkAppChooserButton` selects the first application in its
  * list, which will either be the most-recently used application or, if
  * [property@Gtk.AppChooserButton:show-default-item] is %TRUE, the default
  * application.
  *
  * The list of applications shown in a `GtkAppChooserButton` includes the
  * recommended applications for the given content type. When
  * [property@Gtk.AppChooserButton:show-default-item] is set, the default
  * application is also included. To let the user chooser other applications,
  * you can set the [property@Gtk.AppChooserButton:show-dialog-item] property,
  * which allows to open a full [class@Gtk.AppChooserDialog].
  *
  * It is possible to add custom items to the list, using
  * [method@Gtk.AppChooserButton.append_custom_item]. These items cause the
  * [signal@Gtk.AppChooserButton::custom-item-activated] signal to be emitted
  * when they are selected.
  *
  * To track changes in the selected application, use the
  * [signal@Gtk.AppChooserButton::changed] signal.
  *
  * ## CSS nodes
  *
  * `GtkAppChooserButton` has a single CSS node with the name
  * “appchooserbutton”.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AppChooserButton private[gnome] (raw: Ptr[GtkAppChooserButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      AppChooser,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Appends a custom item to the list of applications that is shown in the
    * popup.
    *
    * The item name must be unique per-widget. Clients can use the provided name
    * as a detail for the [signal@Gtk.AppChooserButton::custom-item-activated]
    * signal, to add a callback for the activation of a particular custom item
    * in the list.
    *
    * See also [method@Gtk.AppChooserButton.append_separator].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendCustomItem(
      name: String /* Some(CString) */,
      label: String /* Some(CString) */,
      icon: Icon /* Some(Ptr[_root_.sn.gnome.gio.internal.GIcon]) */
  )(using Runtime): Unit /* None */ =
    gtk_app_chooser_button_append_custom_item(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserButton]],
      summon[Runtime].inZone(toCString(name)),
      summon[Runtime].inZone(toCString(label)),
      icon.getUnsafeRawPointer().asInstanceOf
    )
  end appendCustomItem

  /** Appends a separator to the list of applications that is shown in the
    * popup.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendSeparator(): Unit /* None */ =
    gtk_app_chooser_button_append_separator(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserButton]]
    )
  end appendSeparator

  /** Returns the text to display at the top of the dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHeading(): String /* None */ =
    fromCString(
      gtk_app_chooser_button_get_heading(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserButton]]
      ).asInstanceOf
    )
  end getHeading

  /** Gets whether the dialog is modal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModal(): Boolean /* None */ =
    gtk_app_chooser_button_get_modal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserButton]]
    ).value.!=(0)
  end getModal

  /** Returns whether the dropdown menu should show the default application at
    * the top.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShowDefaultItem(): Boolean /* None */ =
    gtk_app_chooser_button_get_show_default_item(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserButton]]
    ).value.!=(0)
  end getShowDefaultItem

  /** Returns whether the dropdown menu shows an item for a
    * `GtkAppChooserDialog`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShowDialogItem(): Boolean /* None */ =
    gtk_app_chooser_button_get_show_dialog_item(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserButton]]
    ).value.!=(0)
  end getShowDialogItem

  /** Selects a custom item.
    *
    * See [method@Gtk.AppChooserButton.append_custom_item].
    *
    * Use [method@Gtk.AppChooser.refresh] to bring the selection to its initial
    * state.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setActiveCustomItem(
      name: String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_app_chooser_button_set_active_custom_item(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserButton]],
      summon[Runtime].inZone(toCString(name))
    )
  end setActiveCustomItem

  /** Sets the text to display at the top of the dialog.
    *
    * If the heading is not set, the dialog displays a default text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHeading(
      heading: String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_app_chooser_button_set_heading(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserButton]],
      summon[Runtime].inZone(toCString(heading))
    )
  end setHeading

  /** Sets whether the dialog should be modal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModal(
      modal: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_app_chooser_button_set_modal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserButton]],
      gboolean(gint((if modal == true then 1 else 0)))
    )
  end setModal

  /** Sets whether the dropdown menu of this button should show the default
    * application for the given content type at top.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowDefaultItem(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_app_chooser_button_set_show_default_item(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserButton]],
      gboolean(gint((if setting == true then 1 else 0)))
    )
  end setShowDefaultItem

  /** Sets whether the dropdown menu of this button should show an entry to
    * trigger a `GtkAppChooserDialog`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowDialogItem(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_app_chooser_button_set_show_dialog_item(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserButton]],
      gboolean(gint((if setting == true then 1 else 0)))
    )
  end setShowDialogItem

  /** Emitted to when the button is activated.
    *
    * The `::activate` signal on `GtkAppChooserButton` is an action signal and
    * emitting it causes the button to pop up its dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivate(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkAppChooserButton],
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

  /** Emitted when the active application changes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onChanged(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkAppChooserButton],
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
    val signal = c"changed"
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
  end onChanged

  /** Emitted when a custom item is activated.
    *
    * Use [method@Gtk.AppChooserButton.append_custom_item], to add custom items.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onCustomItemActivated(handler: ((itemName: String)) => Unit)(using
      Runtime
  ) =
    type SignalRegType = SignalRegistration[this.type, (itemName: String), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkAppChooserButton],
          itemName: CString /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((itemName = fromCString(itemName)))
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
    val signal = c"custom-item-activated"
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
  end onCustomItemActivated
end AppChooserButton

object AppChooserButton:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkAppChooserButton])(using Runtime) =
    summon[Runtime].getOrCreate[AppChooserButton](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new AppChooserButton(ptr)
    )

  /** Creates a new `GtkAppChooserButton` for applications that can handle
    * content of the given type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(content_type: String /* Some(CString) */ )(using
      Runtime
  ): AppChooserButton =
    val raw: Ptr[Byte] = gtk_app_chooser_button_new(
      summon[Runtime].inZone(toCString(content_type))
    ).asInstanceOf
    summon[Runtime].getOrCreate[AppChooserButton](
      raw,
      r => AppChooserButton.applyUnsafe(r.asInstanceOf)
    )
  end apply
end AppChooserButton
