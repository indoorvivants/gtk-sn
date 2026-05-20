package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.RGBA
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
  Buildable,
  ColorChooser,
  ConstraintTarget,
  Widget
}
import sn.gnome.gtk4.internal.GtkColorButton
import sn.gnome.runtime.*

/** The `GtkColorButton` allows to open a color chooser dialog to change the
  * color.
  *
  * ![An example GtkColorButton](color-button.png)
  *
  * It is suitable widget for selecting a color in a preference dialog.
  *
  * # CSS nodes
  *
  * ```
  * colorbutton
  * ╰── button.color
  *     ╰── [content]
  * ```
  *
  * `GtkColorButton` has a single CSS node with name colorbutton which contains
  * a button node. To differentiate it from a plain `GtkButton`, it gets the
  * .color style class.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ColorButton private[gnome] (raw: Ptr[GtkColorButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ColorChooser,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets whether the dialog is modal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModal(): Boolean /* None */ =
    gtk_color_button_get_modal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColorButton]]
    ).value.!=(0)
  end getModal

  /** Gets the title of the color chooser dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTitle(): scala.Predef.String /* None */ =
    fromCString(
      gtk_color_button_get_title(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColorButton]]
      ).asInstanceOf
    )
  end getTitle

  /** Sets whether the dialog should be modal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModal(
      modal: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_color_button_set_modal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColorButton]],
      gboolean(gint((if modal == true then 1 else 0)))
    )
  end setModal

  /** Sets the title for the color chooser dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTitle(
      title: scala.Predef.String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_color_button_set_title(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColorButton]],
      summon[Runtime].inZone(toCString(title))
    )
  end setTitle

  /** Emitted to when the color button is activated.
    *
    * The `::activate` signal on `GtkMenuButton` is an action signal and
    * emitting it causes the button to pop up its dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivate(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkColorButton],
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

  /** Emitted when the user selects a color.
    *
    * When handling this signal, use [method@Gtk.ColorChooser.get_rgba] to find
    * out which color was just selected.
    *
    * Note that this signal is only emitted when the user changes the color. If
    * you need to react to programmatic color changes as well, use the
    * notify::rgba signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onColorSet(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkColorButton],
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
    val signal = c"color-set"
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
  end onColorSet
end ColorButton

object ColorButton:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkColorButton])(using Runtime) =
    summon[Runtime].getOrCreate[ColorButton](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ColorButton(ptr)
    )

  /** Creates a new color button.
    *
    * This returns a widget in the form of a small button containing a swatch
    * representing the current selected color. When the button is clicked, a
    * color chooser dialog will open, allowing the user to select a color. The
    * swatch will be updated to reflect the new color when the user finishes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): ColorButton =
    val raw: Ptr[Byte] = gtk_color_button_new().asInstanceOf
    summon[Runtime].getOrCreate[ColorButton](
      raw,
      r => ColorButton.applyUnsafe(r.asInstanceOf)
    )
  end apply

  /** Creates a new color button showing the given color.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withRgba(
      rgba: sn.gnome.gdk4.RGBA /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkRGBA]) */
  )(using Runtime): ColorButton =
    val raw: Ptr[Byte] = gtk_color_button_new_with_rgba(
      rgba.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime].getOrCreate[ColorButton](
      raw,
      r => ColorButton.applyUnsafe(r.asInstanceOf)
    )
  end withRgba
end ColorButton
