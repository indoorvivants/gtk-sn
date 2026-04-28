package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkShortcutLabel

class ShortcutLabel(raw: Ptr[GtkShortcutLabel])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAccelerator()(using Zone): String = fromCString(
    gtk_shortcut_label_get_accelerator(this.raw.asInstanceOf).asInstanceOf
  )

  def getDisabledText()(using Zone): String = fromCString(
    gtk_shortcut_label_get_disabled_text(this.raw.asInstanceOf).asInstanceOf
  )

  def setAccelerator(accelerator: String | CString)(using Zone): Unit =
    gtk_shortcut_label_set_accelerator(
      this.raw.asInstanceOf,
      __sn_extract_string(accelerator)
    )

  def setDisabledText(disabled_text: String | CString)(using Zone): Unit =
    gtk_shortcut_label_set_disabled_text(
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
  def apply(accelerator: String | CString)(using Zone): ShortcutLabel =
    new ShortcutLabel(
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
