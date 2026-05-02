package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkShortcutLabel

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkShortcutLabel` displays a single keyboard shortcut or gesture.
  *
  * The main use case for `GtkShortcutLabel` is inside a
  * [class@Gtk.ShortcutsWindow].
  */
class ShortcutLabel(raw: Ptr[GtkShortcutLabel])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the current accelerator of @self.
    */
  def getAccelerator()(using Zone): String /* None */ = fromCString(
    gtk_shortcut_label_get_accelerator(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the text that is displayed when no accelerator is set.
    */
  def getDisabledText()(using Zone): String /* None */ = fromCString(
    gtk_shortcut_label_get_disabled_text(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the accelerator to be displayed by @self.
    */
  def setAccelerator(
      accelerator: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_shortcut_label_set_accelerator(
    this.raw.asInstanceOf,
    __sn_extract_string(accelerator)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the text to be displayed by @self when no accelerator is set.
    */
  def setDisabledText(
      disabled_text: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_shortcut_label_set_disabled_text(
    this.raw.asInstanceOf,
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkShortcutLabel` with @accelerator set.
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
