package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.{Accessible, Buildable, ConstraintTarget, Widget}
import sn.gnome.gtk4.internal.GtkShortcutLabel

/** `GtkShortcutLabel` displays a single keyboard shortcut or gesture.
  *
  * The main use case for `GtkShortcutLabel` is inside a
  * [class@Gtk.ShortcutsWindow].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ShortcutLabel(raw: Ptr[GtkShortcutLabel])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the current accelerator of @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAccelerator()(using Zone): String /* None */ = fromCString(
    gtk_shortcut_label_get_accelerator(
      this.raw.asInstanceOf[Ptr[GtkShortcutLabel]]
    ).asInstanceOf
  )

  /** Retrieves the text that is displayed when no accelerator is set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDisabledText()(using Zone): String /* None */ = fromCString(
    gtk_shortcut_label_get_disabled_text(
      this.raw.asInstanceOf[Ptr[GtkShortcutLabel]]
    ).asInstanceOf
  )

  /** Sets the accelerator to be displayed by @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAccelerator(
      accelerator: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_shortcut_label_set_accelerator(
    this.raw.asInstanceOf[Ptr[GtkShortcutLabel]],
    __sn_extract_string(accelerator)
  )

  /** Sets the text to be displayed by @self when no accelerator is set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDisabledText(
      disabled_text: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_shortcut_label_set_disabled_text(
    this.raw.asInstanceOf[Ptr[GtkShortcutLabel]],
    __sn_extract_string(disabled_text)
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ShortcutLabel

object ShortcutLabel:
  /** Creates a new `GtkShortcutLabel` with @accelerator set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      accelerator: String | CString /* Some(CString) */
  )(using Zone): ShortcutLabel = new ShortcutLabel(
    gtk_shortcut_label_new(__sn_extract_string(accelerator)).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ShortcutLabel
