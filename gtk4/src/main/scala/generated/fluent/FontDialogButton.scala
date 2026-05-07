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
  FontDialog,
  FontLevel,
  Widget
}
import sn.gnome.gtk4.internal.GtkFontDialogButton
import sn.gnome.runtime.*

/** The `GtkFontDialogButton` is wrapped around a [class@Gtk.FontDialog] and
  * allows to open a font chooser dialog to change the font.
  *
  * ![An example GtkFontDialogButton](font-button.png)
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
  * `GtkFontDialogButton` has a single CSS node with name fontbutton which
  * contains a button node with the .font style class.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FontDialogButton(raw: Ptr[GtkFontDialogButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the `GtkFontDialog` of @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDialog(): FontDialog /* None */ = new FontDialog(
    gtk_font_dialog_button_get_dialog(
      this.raw.asInstanceOf[Ptr[GtkFontDialogButton]]
    ).asInstanceOf
  )

  /** Returns the font of the button.
    *
    * This function is what should be used to obtain the font that was chosen by
    * the user. To get informed about changes, listen to "notify::font-desc".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_font_desc/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.FontDescription), @type -> DataRecord(PangoFontDescription*)))"
  )
  private def getFontDesc__ = ???

  /** Returns the font features of the button.
    *
    * This function is what should be used to obtain the font features that were
    * chosen by the user. To get informed about changes, listen to
    * "notify::font-features".
    *
    * Note that the button will only let users choose font features if
    * [property@Gtk.FontDialogButton:level] is set to `GTK_FONT_LEVEL_FEATURES`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFontFeatures()(using Zone): String /* None */ = fromCString(
    gtk_font_dialog_button_get_font_features(
      this.raw.asInstanceOf[Ptr[GtkFontDialogButton]]
    ).asInstanceOf
  )

  /** Returns the language that is used for font features.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_language/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.Language), @type -> DataRecord(PangoLanguage*)))"
  )
  private def getLanguage__ = ???

  /** Returns the level of detail at which this dialog lets the user select
    * fonts.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLevel(): FontLevel /* None */ = FontLevel.fromRaw(
    gtk_font_dialog_button_get_level(
      this.raw.asInstanceOf[Ptr[GtkFontDialogButton]]
    )
  )

  /** Returns whether the selected font is used in the label.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUseFont(): Boolean /* None */ = gtk_font_dialog_button_get_use_font(
    this.raw.asInstanceOf[Ptr[GtkFontDialogButton]]
  ).value.!=(0)

  /** Returns whether the selected font size is used in the label.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUseSize(): Boolean /* None */ = gtk_font_dialog_button_get_use_size(
    this.raw.asInstanceOf[Ptr[GtkFontDialogButton]]
  ).value.!=(0)

  /** Sets a `GtkFontDialog` object to use for creating the font chooser dialog
    * that is presented when the user clicks the button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDialog(
      dialog: FontDialog /* Some(Ptr[GtkFontDialog]) */
  ): Unit /* None */ = gtk_font_dialog_button_set_dialog(
    this.raw.asInstanceOf[Ptr[GtkFontDialogButton]],
    dialog.getUnsafeRawPointer().asInstanceOf
  )

  /** Sets the font of the button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_font_desc/<method parameters>/font_desc]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.FontDescription), @type -> DataRecord(const PangoFontDescription*)))"
  )
  private def setFontDesc__ = ???

  /** Sets the font features of the button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFontFeatures(
      font_features: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_font_dialog_button_set_font_features(
    this.raw.asInstanceOf[Ptr[GtkFontDialogButton]],
    font_features
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets the language to use for font features.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_language/<method parameters>/language]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.Language), @type -> DataRecord(PangoLanguage*)))"
  )
  private def setLanguage__ = ???

  /** Sets the level of detail at which this dialog lets the user select fonts.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLevel(level: FontLevel /* Some(GtkFontLevel) */ ): Unit /* None */ =
    gtk_font_dialog_button_set_level(
      this.raw.asInstanceOf[Ptr[GtkFontDialogButton]],
      level.raw
    )

  /** If @use_font is `TRUE`, the font name will be written using the selected
    * font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUseFont(
      use_font: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_font_dialog_button_set_use_font(
    this.raw.asInstanceOf[Ptr[GtkFontDialogButton]],
    gboolean(gint((if use_font == true then 1 else 0)))
  )

  /** If @use_size is `TRUE`, the font name will be written using the selected
    * font size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUseSize(
      use_size: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_font_dialog_button_set_use_size(
    this.raw.asInstanceOf[Ptr[GtkFontDialogButton]],
    gboolean(gint((if use_size == true then 1 else 0)))
  )

  /** Emitted when the font dialog button is activated.
    *
    * The `::activate` signal on `GtkFontDialogButton` is an action signal and
    * emitting it causes the button to pop up its dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivate(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkFontDialogButton],
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

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end FontDialogButton

object FontDialogButton:
  /** Creates a new `GtkFontDialogButton` with the given `GtkFontDialog`.
    *
    * You can pass `NULL` to this function and set a `GtkFontDialog` later. The
    * button will be insensitive until that happens.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      dialog: Option[FontDialog /* Some(Ptr[GtkFontDialog]) */ ]
  ): FontDialogButton = new FontDialogButton(
    gtk_font_dialog_button_new(
      dialog
        .map[Ptr[GtkFontDialog]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkFontDialog]])
    ).asInstanceOf
  )
end FontDialogButton
