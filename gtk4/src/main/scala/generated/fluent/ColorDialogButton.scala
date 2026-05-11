package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gchar, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ColorDialog,
  ConstraintTarget,
  Widget
}
import sn.gnome.gtk4.internal.GtkColorDialogButton
import sn.gnome.runtime.*

/** The `GtkColorDialogButton` is a wrapped around a [class@Gtk.ColorDialog] and
  * allows to open a color chooser dialog to change the color.
  *
  * ![An example GtkColorDialogButton](color-button.png)
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
  * `GtkColorDialogButton` has a single CSS node with name colorbutton which
  * contains a button node. To differentiate it from a plain `GtkButton`, it
  * gets the .color style class.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ColorDialogButton private[gnome] (raw: Ptr[GtkColorDialogButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the `GtkColorDialog` of @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDialog()(using Runtime): sn.gnome.gtk4.fluent.ColorDialog /* None */ =
    sn.gnome.gtk4.fluent.ColorDialog.applyUnsafe(
      gtk_color_dialog_button_get_dialog(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColorDialogButton]]
      ).asInstanceOf
    )
  end getDialog

  /** Returns the color of the button.
    *
    * This function is what should be used to obtain the color that was chosen
    * by the user. To get informed about changes, listen to "notify::color".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_rgba/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))"
  )
  private def getRgba__ = ???

  /** Sets a `GtkColorDialog` object to use for creating the color chooser
    * dialog that is presented when the user clicks the button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDialog(
      dialog: sn.gnome.gtk4.fluent.ColorDialog /* Some(Ptr[GtkColorDialog]) */
  )(using Runtime): Unit /* None */ =
    gtk_color_dialog_button_set_dialog(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColorDialogButton]],
      dialog.getUnsafeRawPointer().asInstanceOf
    )
  end setDialog

  /** Sets the color of the button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_rgba/<method parameters>/color]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))"
  )
  private def setRgba__ = ???

  /** Emitted when the color dialog button is activated.
    *
    * The `::activate` signal on `GtkColorDialogButton` is an action signal and
    * emitting it causes the button to pop up its dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivate(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkColorDialogButton],
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
end ColorDialogButton

object ColorDialogButton:
  def applyUnsafe(ptr: Ptr[GtkColorDialogButton])(using Runtime) =
    summon[Runtime].getOrCreate[ColorDialogButton](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ColorDialogButton(ptr)
    )

  /** Creates a new `GtkColorDialogButton` with the given `GtkColorDialog`.
    *
    * You can pass `NULL` to this function and set a `GtkColorDialog` later. The
    * button will be insensitive until that happens.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      dialog: Option[
        sn.gnome.gtk4.fluent.ColorDialog /* Some(Ptr[GtkColorDialog]) */
      ]
  )(using Runtime): ColorDialogButton =
    val raw: Ptr[Byte] = gtk_color_dialog_button_new(
      dialog
        .map[Ptr[GtkColorDialog]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkColorDialog]])
    ).asInstanceOf
    summon[Runtime].getOrCreate[ColorDialogButton](
      raw,
      r => ColorDialogButton.applyUnsafe(r.asInstanceOf)
    )
  end apply
end ColorDialogButton
