package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

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
class AlternativeTrigger(raw: Ptr[GtkAlternativeTrigger])
    extends ShortcutTrigger(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the first of the two alternative triggers that may trigger @self.
    *
    * [method@Gtk.AlternativeTrigger.get_second] will return the other one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFirst(): ShortcutTrigger /* None */ = new ShortcutTrigger(
    gtk_alternative_trigger_get_first(
      this.raw.asInstanceOf[Ptr[GtkAlternativeTrigger]]
    ).asInstanceOf
  )

  /** Gets the second of the two alternative triggers that may trigger @self.
    *
    * [method@Gtk.AlternativeTrigger.get_first] will return the other one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSecond(): ShortcutTrigger /* None */ = new ShortcutTrigger(
    gtk_alternative_trigger_get_second(
      this.raw.asInstanceOf[Ptr[GtkAlternativeTrigger]]
    ).asInstanceOf
  )

end AlternativeTrigger

object AlternativeTrigger:
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
      first: ShortcutTrigger /* Some(Ptr[GtkShortcutTrigger]) */,
      second: ShortcutTrigger /* Some(Ptr[GtkShortcutTrigger]) */
  ): AlternativeTrigger = new AlternativeTrigger(
    gtk_alternative_trigger_new(
      first.getUnsafeRawPointer().asInstanceOf,
      second.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end AlternativeTrigger
