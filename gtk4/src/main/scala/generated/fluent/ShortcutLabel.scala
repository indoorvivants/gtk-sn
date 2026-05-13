package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{Accessible, Buildable, ConstraintTarget, Widget}
import sn.gnome.gtk4.internal.GtkShortcutLabel

/** `GtkShortcutLabel` displays a single keyboard shortcut or gesture.
  *
  * The main use case for `GtkShortcutLabel` is inside a
  * [class@Gtk.ShortcutsWindow].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ShortcutLabel private[gnome] (raw: Ptr[GtkShortcutLabel])
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
  def getAccelerator()(using Zone): String /* None */ =
    fromCString(
      gtk_shortcut_label_get_accelerator(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkShortcutLabel]]
      ).asInstanceOf
    )
  end getAccelerator

  /** Retrieves the text that is displayed when no accelerator is set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDisabledText()(using Zone): String /* None */ =
    fromCString(
      gtk_shortcut_label_get_disabled_text(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkShortcutLabel]]
      ).asInstanceOf
    )
  end getDisabledText

  /** Sets the accelerator to be displayed by @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAccelerator(
      accelerator: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_shortcut_label_set_accelerator(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkShortcutLabel]],
      toCString(accelerator)
    )
  end setAccelerator

  /** Sets the text to be displayed by @self when no accelerator is set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDisabledText(
      disabled_text: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_shortcut_label_set_disabled_text(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkShortcutLabel]],
      toCString(disabled_text)
    )
  end setDisabledText

end ShortcutLabel

object ShortcutLabel:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkShortcutLabel])(using Runtime) =
    summon[Runtime].getOrCreate[ShortcutLabel](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ShortcutLabel(ptr)
    )

  /** Creates a new `GtkShortcutLabel` with @accelerator set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      accelerator: String /* Some(CString) */
  )(using Zone, Runtime): ShortcutLabel =
    val raw: Ptr[Byte] = gtk_shortcut_label_new(
      toCString(accelerator)
    ).asInstanceOf
    summon[Runtime].getOrCreate[ShortcutLabel](
      raw,
      r => ShortcutLabel.applyUnsafe(r.asInstanceOf)
    )
  end apply
end ShortcutLabel
