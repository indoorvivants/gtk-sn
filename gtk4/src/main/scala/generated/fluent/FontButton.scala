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
  Buildable,
  ConstraintTarget,
  FontChooser,
  Widget
}
import sn.gnome.gtk4.internal.GtkFontButton
import sn.gnome.runtime.*

/** The `GtkFontButton` allows to open a font chooser dialog to change the font.
  *
  * ![An example GtkFontButton](font-button.png)
  *
  * It is suitable widget for selecting a font in a preference dialog.
  *
  * # CSS nodes
  *
  * ```
  * fontbutton
  * ╰── button.font
  *     ╰── [content]
  * ```
  *
  * `GtkFontButton` has a single CSS node with name fontbutton which contains a
  * button node with the .font style class.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FontButton(raw: Ptr[GtkFontButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      FontChooser:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets whether the dialog is modal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModal(): Boolean /* None */ = gtk_font_button_get_modal(
    this.raw.asInstanceOf[Ptr[GtkFontButton]]
  ).value.!=(0)

  /** Retrieves the title of the font chooser dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTitle()(using Zone): String /* None */ = fromCString(
    gtk_font_button_get_title(
      this.raw.asInstanceOf[Ptr[GtkFontButton]]
    ).asInstanceOf
  )

  /** Returns whether the selected font is used in the label.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUseFont(): Boolean /* None */ = gtk_font_button_get_use_font(
    this.raw.asInstanceOf[Ptr[GtkFontButton]]
  ).value.!=(0)

  /** Returns whether the selected size is used in the label.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUseSize(): Boolean /* None */ = gtk_font_button_get_use_size(
    this.raw.asInstanceOf[Ptr[GtkFontButton]]
  ).value.!=(0)

  /** Sets whether the dialog should be modal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModal(
      modal: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_font_button_set_modal(
    this.raw.asInstanceOf[Ptr[GtkFontButton]],
    gboolean(gint((if modal == true then 1 else 0)))
  )

  /** Sets the title for the font chooser dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTitle(
      title: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_font_button_set_title(
    this.raw.asInstanceOf[Ptr[GtkFontButton]],
    __sn_extract_string(title)
  )

  /** If @use_font is %TRUE, the font name will be written using the selected
    * font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUseFont(
      use_font: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_font_button_set_use_font(
    this.raw.asInstanceOf[Ptr[GtkFontButton]],
    gboolean(gint((if use_font == true then 1 else 0)))
  )

  /** If @use_size is %TRUE, the font name will be written using the selected
    * size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUseSize(
      use_size: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_font_button_set_use_size(
    this.raw.asInstanceOf[Ptr[GtkFontButton]],
    gboolean(gint((if use_size == true then 1 else 0)))
  )

  /** Emitted to when the font button is activated.
    *
    * The `::activate` signal on `GtkFontButton` is an action signal and
    * emitting it causes the button to present its dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivate(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkFontButton],
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

  /** Emitted when the user selects a font.
    *
    * When handling this signal, use [method@Gtk.FontChooser.get_font] to find
    * out which font was just selected.
    *
    * Note that this signal is only emitted when the user changes the font. If
    * you need to react to programmatic font changes as well, use the
    * notify::font signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onFontSet(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkFontButton],
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
    val signal = c"font-set"
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
  end onFontSet

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end FontButton

object FontButton:
  /** Creates a new font picker widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): FontButton =
    val raw: Ptr[Byte] = gtk_font_button_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[FontButton](raw, r => new FontButton(r.asInstanceOf))
  end apply

  /** Creates a new font picker widget showing the given font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withFont(fontname: String | CString /* Some(CString) */ )(using
      Zone
  )(using Runtime): FontButton =
    val raw: Ptr[Byte] = gtk_font_button_new_with_font(
      __sn_extract_string(fontname)
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[FontButton](raw, r => new FontButton(r.asInstanceOf))
  end withFont

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end FontButton
