package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{ShortcutAction, ShortcutTrigger}
import sn.gnome.gtk4.internal.GtkShortcut

/** A `GtkShortcut` describes a keyboard shortcut.
  *
  * It contains a description of how to trigger the shortcut via a
  * [class@Gtk.ShortcutTrigger] and a way to activate the shortcut on a widget
  * via a [class@Gtk.ShortcutAction].
  *
  * The actual work is usually done via [class@Gtk.ShortcutController], which
  * decides if and when to activate a shortcut. Using that controller directly
  * however is rarely necessary as various higher level convenience APIs exist
  * on `GtkWidget`s that make it easier to use shortcuts in GTK.
  *
  * `GtkShortcut` does provide functionality to make it easy for users to work
  * with shortcuts, either by providing informational strings for display
  * purposes or by allowing shortcuts to be configured.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Shortcut private[gnome] (raw: Ptr[GtkShortcut])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the action that is activated by this shortcut.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAction()(using Runtime): sn.gnome.gtk4.ShortcutAction /* None */ =
    sn.gnome.gtk4.ShortcutAction.applyUnsafe(
      gtk_shortcut_get_action(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkShortcut]]
      ).asInstanceOf
    )
  end getAction

  /** Gets the arguments that are passed when activating the shortcut.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_arguments/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def getArguments__ = ???

  /** Gets the trigger used to trigger @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTrigger()(using Runtime): sn.gnome.gtk4.ShortcutTrigger /* None */ =
    sn.gnome.gtk4.ShortcutTrigger.applyUnsafe(
      gtk_shortcut_get_trigger(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkShortcut]]
      ).asInstanceOf
    )
  end getTrigger

  /** Sets the new action for @self to be @action.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAction(
      action: Option[
        sn.gnome.gtk4.ShortcutAction /* Some(Ptr[GtkShortcutAction]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_shortcut_set_action(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkShortcut]],
      action
        .map[Ptr[GtkShortcutAction]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkShortcutAction]])
    )
  end setAction

  /** Sets the arguments to pass when activating the shortcut.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_arguments/<method parameters>/args]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def setArguments__ = ???

  /** Sets the new trigger for @self to be @trigger.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTrigger(
      trigger: Option[
        sn.gnome.gtk4.ShortcutTrigger /* Some(Ptr[GtkShortcutTrigger]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_shortcut_set_trigger(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkShortcut]],
      trigger
        .map[Ptr[GtkShortcutTrigger]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkShortcutTrigger]])
    )
  end setTrigger

end Shortcut

object Shortcut:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkShortcut])(using Runtime) = summon[Runtime]
    .getOrCreate[Shortcut](ptr.asInstanceOf[Ptr[Byte]], p => new Shortcut(ptr))

  /** Creates a new `GtkShortcut` that is triggered by
    * @trigger
    *   and then activates @action.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      trigger: Option[
        sn.gnome.gtk4.ShortcutTrigger /* Some(Ptr[GtkShortcutTrigger]) */
      ],
      action: Option[
        sn.gnome.gtk4.ShortcutAction /* Some(Ptr[GtkShortcutAction]) */
      ]
  )(using Runtime): Shortcut =
    val raw: Ptr[Byte] = gtk_shortcut_new(
      trigger
        .map[Ptr[GtkShortcutTrigger]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkShortcutTrigger]]),
      action
        .map[Ptr[GtkShortcutAction]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkShortcutAction]])
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Shortcut](raw, r => Shortcut.applyUnsafe(r.asInstanceOf))
  end apply

  /** Creates a new `GtkShortcut` that is triggered by @trigger and then
    * activates
    * @action
    *   with arguments given by @format_string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  inline def withArguments(
      trigger: Option[
        sn.gnome.gtk4.ShortcutTrigger /* Some(Ptr[GtkShortcutTrigger]) */
      ],
      action: Option[
        sn.gnome.gtk4.ShortcutAction /* Some(Ptr[GtkShortcutAction]) */
      ],
      format_string: Option[String /* Some(CString) */ ],
      args: Any*
  )(using Zone, Runtime): Shortcut =
    val raw: Ptr[Byte] = gtk_shortcut_new_with_arguments(
      trigger
        .map[Ptr[GtkShortcutTrigger]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkShortcutTrigger]]),
      action
        .map[Ptr[GtkShortcutAction]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkShortcutAction]]),
      format_string
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString]),
      args*
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Shortcut](raw, r => Shortcut.applyUnsafe(r.asInstanceOf))
  end withArguments
end Shortcut
