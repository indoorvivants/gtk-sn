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
  Buildable,
  ConstraintTarget,
  FontChooser,
  Widget
}
import sn.gnome.gtk4.internal.{GtkFontButton, GtkWidget}
import sn.gnome.pango.FontMap
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
class FontButton private[gnome] (raw: Ptr[GtkFontButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      FontChooser:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the font map of @widget.
    *
    * See [method@Gtk.Widget.set_font_map].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getFontMap()(using Runtime): sn.gnome.pango.FontMap /* None */ =
    sn.gnome.pango.FontMap.applyUnsafe(
      gtk_widget_get_font_map(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getFontMap

  /** Gets whether the dialog is modal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModal(): Boolean /* None */ =
    gtk_font_button_get_modal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontButton]]
    ).value.!=(0)
  end getModal

  /** Retrieves the title of the font chooser dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTitle(): scala.Predef.String /* None */ =
    fromCString(
      gtk_font_button_get_title(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontButton]]
      ).asInstanceOf
    )
  end getTitle

  /** Returns whether the selected font is used in the label.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUseFont(): Boolean /* None */ =
    gtk_font_button_get_use_font(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontButton]]
    ).value.!=(0)
  end getUseFont

  /** Returns whether the selected size is used in the label.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUseSize(): Boolean /* None */ =
    gtk_font_button_get_use_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontButton]]
    ).value.!=(0)
  end getUseSize

  /** Sets the font map to use for Pango rendering.
    *
    * The font map is the object that is used to look up fonts. Setting a custom
    * font map can be useful in special situations, e.g. when you need to add
    * application-specific fonts to the set of available fonts.
    *
    * When not set, the widget will inherit the font map from its parent.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def setFontMap(
      font_map: Option[
        sn.gnome.pango.FontMap /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_widget_set_font_map(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      font_map
        .map[Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]]
        )
    )
  end setFontMap

  /** Sets whether the dialog should be modal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModal(
      modal: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_font_button_set_modal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontButton]],
      gboolean(gint((if modal == true then 1 else 0)))
    )
  end setModal

  /** Sets the title for the font chooser dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTitle(
      title: scala.Predef.String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_font_button_set_title(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontButton]],
      summon[Runtime].inZone(toCString(title))
    )
  end setTitle

  /** If @use_font is %TRUE, the font name will be written using the selected
    * font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUseFont(
      use_font: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_font_button_set_use_font(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontButton]],
      gboolean(gint((if use_font == true then 1 else 0)))
    )
  end setUseFont

  /** If @use_size is %TRUE, the font name will be written using the selected
    * size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUseSize(
      use_size: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_font_button_set_use_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontButton]],
      gboolean(gint((if use_size == true then 1 else 0)))
    )
  end setUseSize

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
end FontButton

object FontButton:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkFontButton])(using Runtime) =
    summon[Runtime].getOrCreate[FontButton](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new FontButton(ptr)
    )

  /** Creates a new font picker widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): FontButton =
    val raw: Ptr[Byte] = gtk_font_button_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[FontButton](raw, r => FontButton.applyUnsafe(r.asInstanceOf))
  end apply

  /** Creates a new font picker widget showing the given font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withFont(fontname: scala.Predef.String /* Some(CString) */ )(using
      Runtime
  ): FontButton =
    val raw: Ptr[Byte] = gtk_font_button_new_with_font(
      summon[Runtime].inZone(toCString(fontname))
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[FontButton](raw, r => FontButton.applyUnsafe(r.asInstanceOf))
  end withFont
end FontButton
