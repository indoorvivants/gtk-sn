package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.ShortcutTrigger
import sn.gnome.gtk4.internal.GtkAlternativeTrigger

/** A `GtkShortcutTrigger` that combines two triggers.
  *
  * The `GtkAlternativeTrigger` triggers when either of two trigger.
  *
  * This can be cascaded to combine more than two triggers.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AlternativeTrigger private[gnome] (raw: Ptr[GtkAlternativeTrigger])
    extends ShortcutTrigger(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the first of the two alternative triggers that may trigger @self.
    *
    * [method@Gtk.AlternativeTrigger.get_second] will return the other one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFirst()(using
      Runtime
  ): sn.gnome.gtk4.fluent.ShortcutTrigger /* None */ =
    sn.gnome.gtk4.fluent.ShortcutTrigger.applyUnsafe(
      gtk_alternative_trigger_get_first(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAlternativeTrigger]]
      ).asInstanceOf
    )
  end getFirst

  /** Gets the second of the two alternative triggers that may trigger @self.
    *
    * [method@Gtk.AlternativeTrigger.get_first] will return the other one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSecond()(using
      Runtime
  ): sn.gnome.gtk4.fluent.ShortcutTrigger /* None */ =
    sn.gnome.gtk4.fluent.ShortcutTrigger.applyUnsafe(
      gtk_alternative_trigger_get_second(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAlternativeTrigger]]
      ).asInstanceOf
    )
  end getSecond

end AlternativeTrigger

object AlternativeTrigger:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkAlternativeTrigger])(using Runtime) =
    summon[Runtime].getOrCreate[AlternativeTrigger](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new AlternativeTrigger(ptr)
    )

  /** Creates a `GtkShortcutTrigger` that will trigger whenever either of the
    * two given triggers gets triggered.
    *
    * Note that nesting is allowed, so if you want more than two alternative,
    * create a new alternative trigger for each option.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      first: sn.gnome.gtk4.fluent.ShortcutTrigger /* Some(Ptr[GtkShortcutTrigger]) */,
      second: sn.gnome.gtk4.fluent.ShortcutTrigger /* Some(Ptr[GtkShortcutTrigger]) */
  )(using Runtime): AlternativeTrigger =
    val raw: Ptr[Byte] = gtk_alternative_trigger_new(
      first.getUnsafeRawPointer().asInstanceOf,
      second.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime].getOrCreate[AlternativeTrigger](
      raw,
      r => AlternativeTrigger.applyUnsafe(r.asInstanceOf)
    )
  end apply
end AlternativeTrigger
